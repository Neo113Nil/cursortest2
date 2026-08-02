package com.yandex.messaging.core.net;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class ApiRequest {

    @Json(name = "method")
    public final String method;

    @Json(name = "params")
    public final Object params;

    public ApiRequest(String str, Object obj) {
        this.method = str;
        this.params = obj;
    }
}
