package com.yandex.messaging.core.net.entities.proto.calls;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class MakeCall {

    @Json(name = "CallType")
    @xuf0(tag = 2)
    public int callType;

    @cex
    @Json(name = "DeviceInfo")
    @xuf0(tag = 1)
    public byte[] deviceInfo;
}
