package com.yandex.messaging.core.net.entities.proto.calls;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class TransportMessage {

    @cex
    @Json(name = "Payload")
    @xuf0(tag = 1)
    public byte[] payload;
}
