package com.yandex.messaging.internal.net.socket;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class XivaInternalMessage {

    @Json(name = "operation")
    public String operation;

    @Json(name = "server-interval-sec")
    public long serverIntervalSec;

    @Json(name = "subscription-id")
    public String subscriptionId;
}
