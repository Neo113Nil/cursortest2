package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class GetUserGapsParam {

    @Json(name = "guids")
    public String[] guids;

    @Json(name = "staff_method")
    public String staffMethod;
}
