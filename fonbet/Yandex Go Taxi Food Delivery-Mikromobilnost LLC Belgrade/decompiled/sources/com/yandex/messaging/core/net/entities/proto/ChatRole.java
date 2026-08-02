package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ChatRole {

    @Json(name = "IsTransient")
    @xuf0(tag = 5)
    public boolean isTransient;

    @Json(name = "ProfileId")
    @xuf0(tag = 4)
    public String profileId;

    @Json(name = "Rights")
    @xuf0(tag = 3)
    public int rights;

    @Json(name = "Role")
    @xuf0(tag = 1)
    public int role;

    @Json(name = "Version")
    @xuf0(tag = 2)
    public long version;

    public @interface ChatRoleType {
    }

    public static int a(String str) {
        if ("admin".equals(str)) {
            return 2;
        }
        if ("subscriber".equals(str)) {
            return 0;
        }
        return "member".equals(str) ? 1 : 3;
    }
}
