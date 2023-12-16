package com.javaapp.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConteoller {

    @RequestMapping("/myapp")
    public String hello() {
        return "HeloooWorld";
    }
    
}
