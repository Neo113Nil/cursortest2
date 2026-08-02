package com.yandex.messaging.internal.entities;

import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechUnknownMessage extends TechBaseMessage {
    public TechUnknownMessage() {
        this.type = 1000;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.a();
    }
}
