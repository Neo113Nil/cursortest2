package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import xsna.vu5;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class CacheArguments {
    private final long a;
    private final long b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.a == cacheArguments.a && this.b == cacheArguments.b;
    }

    public final long getOutdatedTimeInterval() {
        return this.b;
    }

    public final long getRefreshPeriod() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheArguments(refreshPeriod=");
        sb.append(this.a);
        sb.append(", outdatedTimeInterval=");
        return vu5.a(')', this.b, sb);
    }

    public CacheArguments(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ CacheArguments(long j, long j2, int i, zcl zclVar) {
        this((i & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j2);
    }
}
