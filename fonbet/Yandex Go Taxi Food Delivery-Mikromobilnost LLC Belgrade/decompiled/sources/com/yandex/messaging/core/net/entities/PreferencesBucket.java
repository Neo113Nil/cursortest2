package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class PreferencesBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value preferences;

    public static class Value {

        @Json(name = "telemost_auto_status")
        public Boolean telemostAutoStatus;

        @Json(name = "telemost_auto_status_notifications")
        public Boolean telemostAutoStatusNotifications;
    }

    public PreferencesBucket() {
        this.bucketName = "preferences";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "preferences";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.l(this);
    }
}
