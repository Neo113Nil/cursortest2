package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.cex;

/* loaded from: classes15.dex */
public class TechGenericMessage extends TechBaseMessage {

    @cex
    @Json(name = "generic_message_text")
    public String messageText;

    public TechGenericMessage() {
        this.type = 110;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.i(this);
    }
}
