package com.yandex.messaging.core.net.entities.proto.calls;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class CallInfo {

    @cex
    @Json(name = "CallGuid")
    @xuf0(tag = 1)
    public String callGuid;

    @Json(name = "Status")
    @xuf0(tag = 2)
    public int callStatus;

    @Json(name = "Duration")
    @xuf0(tag = 3)
    public long duration;
}
