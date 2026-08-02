package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechUserLeaveChatMessage extends TechBaseMessage {

    @Json(name = "guid")
    public String guid;

    public TechUserLeaveChatMessage() {
        this.type = 106;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.f(this);
    }
}
