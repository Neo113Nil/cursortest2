package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public abstract class Bucket implements StateSyncDiff {

    @Json(name = "bucket_name")
    public String bucketName;

    @Json(name = "version")
    public long version;

    public abstract String a();

    public static class GetParams {

        @Json(name = "bucket_name")
        public String bucketName;

        @Json(name = "bucket_keys")
        public String[] keys;

        public GetParams(Bucket bucket, String str) {
            this.keys = new String[]{str};
            this.bucketName = bucket.a();
        }

        public GetParams(Bucket bucket) {
            this.keys = null;
            this.bucketName = bucket.a();
        }
    }
}
