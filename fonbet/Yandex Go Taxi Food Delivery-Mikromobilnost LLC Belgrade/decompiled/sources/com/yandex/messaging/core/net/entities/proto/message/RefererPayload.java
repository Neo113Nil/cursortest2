package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;

/* loaded from: classes11.dex */
public class RefererPayload {

    @Json(name = "retry_id")
    public String id;

    @Json(name = "abro_referer")
    public String referer;
}
