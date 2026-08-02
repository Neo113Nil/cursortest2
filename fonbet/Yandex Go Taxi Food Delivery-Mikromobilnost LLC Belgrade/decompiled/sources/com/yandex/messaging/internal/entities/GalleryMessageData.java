package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.MediaMessageData;
import defpackage.cex;

/* loaded from: classes15.dex */
public class GalleryMessageData extends MediaMessageData {

    @cex
    @Json(name = "items")
    public PlainMessage.Item[] items;

    @Json(name = "gallery_preview_id")
    public String previewId;

    public GalleryMessageData() {
        super(10, "");
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.e(this);
    }

    public final Integer b() {
        PlainMessage.Item[] itemArr = this.items;
        if (itemArr.length > 0) {
            return itemArr[0].image.fileInfo.source;
        }
        return null;
    }
}
