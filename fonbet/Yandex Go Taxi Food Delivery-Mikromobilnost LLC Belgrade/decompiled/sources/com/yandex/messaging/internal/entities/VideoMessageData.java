package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;

/* loaded from: classes15.dex */
public class VideoMessageData extends MediaFileMessageData {

    @Json(name = "duration")
    public long durationMs;

    @Json(name = "height")
    public int height;

    @Json(name = "size")
    public Long size;

    @Json(name = "thumbHash")
    public byte[] thumbHash;

    @Json(name = "width")
    public int width;

    public VideoMessageData(long j, byte[] bArr, int i, long j2, String str, int i2) {
        super(1001, "");
        this.fileName = str;
        this.size = Long.valueOf(j);
        this.width = i;
        this.height = i2;
        this.durationMs = j2;
        this.thumbHash = bArr;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.f(this);
    }

    public VideoMessageData() {
    }
}
