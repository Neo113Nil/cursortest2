package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechChatAvatarChangedMessage extends TechBaseMessage {

    @Json(name = "avatar_id")
    public String avatarId;

    public TechChatAvatarChangedMessage() {
        this.type = 103;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.e();
    }
}
