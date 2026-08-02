package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechUserJoinChatByLinkMessage extends TechBaseMessage {

    @Json(name = "guid")
    public String guid;

    public TechUserJoinChatByLinkMessage() {
        this.type = 108;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.l(this);
    }
}
