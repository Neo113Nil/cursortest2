package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;

/* loaded from: classes15.dex */
public class StickerMessageData extends MediaMessageData {

    @Json(name = "sticker_id")
    public String id;

    @Json(name = "sticker_set_id")
    public String setId;

    public StickerMessageData(String str, String str2) {
        this.type = 4;
        this.text = "";
        this.id = str;
        this.setId = str2;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.c(this);
    }

    public StickerMessageData() {
        this.text = "";
    }
}
