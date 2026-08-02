package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.cex;

/* loaded from: classes15.dex */
public class TechCallInfoMessage extends TechBaseMessage {

    @cex
    @Json(name = "call_info")
    public CallInfo callInfo;

    public TechCallInfoMessage() {
        this.type = 109;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.n(this);
    }
}
