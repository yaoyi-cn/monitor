package cn.gtmap.realestate.monitor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor/test")
public class TestController {

    @GetMapping("/halo")
    public String getTestMsg(){
        return "Hello";
    }
}
