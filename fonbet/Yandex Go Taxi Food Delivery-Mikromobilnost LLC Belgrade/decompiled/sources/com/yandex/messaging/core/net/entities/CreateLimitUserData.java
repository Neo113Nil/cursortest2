package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class CreateLimitUserData {

    @cex
    @Json(name = "user")
    public User user;

    @cex
    @Json(name = "yambtoken")
    public String yambToken;

    public static class User {

        @cex
        @Json(name = "guid")
        public String guid;
    }
}
