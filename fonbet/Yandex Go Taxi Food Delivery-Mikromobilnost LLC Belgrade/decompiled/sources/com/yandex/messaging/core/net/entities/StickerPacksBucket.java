package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class StickerPacksBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value value;

    public static class Value {

        @cex
        @Json(name = "sticker_packs")
        public String[] packIds;
    }

    public StickerPacksBucket() {
        this.bucketName = "sticker_packs";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "sticker_packs";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.d(this);
    }
}
