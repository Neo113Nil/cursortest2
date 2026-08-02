package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public class TechUserJoinChatMessage extends TechBaseMessage {

    @Json(name = "guid")
    public String guid;

    public TechUserJoinChatMessage() {
        this.type = HProv.PP_SET_PIN;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.d(this);
    }
}
