package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class BucketsData {

    @Json(name = "buckets")
    public Bucket[] buckets;

    public final Bucket a(Class cls) {
        Bucket[] bucketArr = this.buckets;
        if (bucketArr == null) {
            return null;
        }
        for (Bucket bucket : bucketArr) {
            if (cls.isInstance(bucket)) {
                return bucket;
            }
        }
        return null;
    }
}
