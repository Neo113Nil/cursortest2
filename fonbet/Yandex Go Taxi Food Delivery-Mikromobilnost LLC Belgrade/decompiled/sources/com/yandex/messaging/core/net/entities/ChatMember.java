package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class ChatMember {

    @Json(name = "rights")
    public String[] rights;

    @Json(name = "role")
    public String role;

    @Json(name = "version")
    public long version;
}
