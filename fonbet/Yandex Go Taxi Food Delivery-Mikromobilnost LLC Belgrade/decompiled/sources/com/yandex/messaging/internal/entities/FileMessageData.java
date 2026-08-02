package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;

/* loaded from: classes15.dex */
public class FileMessageData extends MediaFileMessageData {

    @Json(name = "size")
    public Long size;

    public FileMessageData(String str, long j) {
        super(6, "");
        this.fileName = str;
        this.size = Long.valueOf(j);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.g(this);
    }

    public FileMessageData() {
    }
}
