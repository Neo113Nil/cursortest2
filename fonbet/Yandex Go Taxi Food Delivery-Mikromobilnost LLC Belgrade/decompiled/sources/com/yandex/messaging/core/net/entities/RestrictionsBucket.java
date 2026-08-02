package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class RestrictionsBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value value;

    public static final class Value {

        @Json(name = "blacklist")
        public String[] blacklist;

        @Json(name = "whitelist")
        public String[] whitelist;
    }

    public RestrictionsBucket() {
        this.bucketName = "restrictions";
    }

    public static RestrictionsBucket b(long j, String... strArr) {
        Value value = new Value();
        value.blacklist = strArr;
        RestrictionsBucket restrictionsBucket = new RestrictionsBucket();
        restrictionsBucket.value = value;
        restrictionsBucket.version = j;
        restrictionsBucket.bucketName = "restrictions";
        return restrictionsBucket;
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "restrictions";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.e(this);
    }
}
