package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class PostMessageResponse {

    @Json(name = "Details")
    @xuf0(tag = 2)
    public String details;

    @Json(name = "MessageInfo")
    @xuf0(tag = 3)
    public ShortMessageInfo messageInfo;

    @Json(name = "RateLimit")
    @xuf0(tag = 5)
    public RateLimit rateLimit;

    @Json(name = "Status")
    @xuf0(tag = 1)
    public int status;
}
