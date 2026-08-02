package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ForwardedMessageInfo {

    @cex
    @Json(name = "Payload")
    @xuf0(tag = 1)
    public PlainMessage plain;

    @cex
    @Json(name = "ServerMessageInfo")
    @xuf0(tag = 3)
    public ServerMessageInfo serverMessageInfo;
}
