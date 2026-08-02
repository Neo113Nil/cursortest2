package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class UserStatusPresetBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value value;

    public static class Value {

        @cex
        @Json(name = "statuses")
        public UserStatusPresetData[] statuses;
    }

    public UserStatusPresetBucket() {
        this.bucketName = "custom_user_statuses";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "custom_user_statuses";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.j(this);
    }
}
