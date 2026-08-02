package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public final class TimestampRange {

    @Json(name = "Max")
    @xuf0(tag = 2)
    public long max;

    @Json(name = "Min")
    @xuf0(tag = 1)
    public long min;

    static {
        new TimestampRange();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TimestampRange)) {
            return this == obj;
        }
        TimestampRange timestampRange = (TimestampRange) obj;
        return timestampRange.min == this.min && timestampRange.max == this.max;
    }

    public final int hashCode() {
        long j = this.min;
        long j2 = this.max;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((int) (j ^ (j >>> 32)));
    }
}
