package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class TechChatInfoChangedMessage extends TechBaseMessage {

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    public String description;

    @Json(name = "name")
    public String name;

    public TechChatInfoChangedMessage() {
        this.type = 102;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.g(this);
    }
}
