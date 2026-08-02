package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;

/* loaded from: classes15.dex */
public class ImageMessageData extends MediaFileMessageData {

    @Json(name = "animated")
    public boolean animated;

    @Json(name = "height")
    public Integer height;

    @Json(name = "size")
    public Long imageSize;

    @Json(name = "width")
    public Integer width;

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.a(this);
    }
}
