package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ChatCreatedInfo {

    @cex
    @Json(name = "InitialInfo")
    @xuf0(tag = 1)
    public ChatInfoFromTransport initialInfo;
}
