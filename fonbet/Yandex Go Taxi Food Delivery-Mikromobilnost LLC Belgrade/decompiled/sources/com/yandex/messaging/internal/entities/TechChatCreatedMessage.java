package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechChatCreatedMessage extends TechBaseMessage {

    @Json(name = "name")
    public String name;

    public TechChatCreatedMessage() {
        this.type = 101;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.j(this);
    }
}
