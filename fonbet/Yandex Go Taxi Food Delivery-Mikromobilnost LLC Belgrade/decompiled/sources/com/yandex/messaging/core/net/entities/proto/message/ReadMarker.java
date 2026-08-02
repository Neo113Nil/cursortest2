package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ReadMarker {

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "Timestamps")
    @xuf0(tag = 2)
    public long[] timestamps;
}
