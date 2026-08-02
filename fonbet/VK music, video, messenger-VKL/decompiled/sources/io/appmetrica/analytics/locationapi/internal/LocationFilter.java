package io.appmetrica.analytics.locationapi.internal;

import com.unity3d.services.UnityAdsConstants;
import xsna.xq;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class LocationFilter {
    private final long a;
    private final float b;

    public LocationFilter() {
        this(0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.a == locationFilter.a && this.b == locationFilter.b;
    }

    public final float getUpdateDistanceInterval() {
        return this.b;
    }

    public final long getUpdateTimeInterval() {
        return this.a;
    }

    public int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationFilter(updateTimeInterval=");
        sb.append(this.a);
        sb.append(", updateDistanceInterval=");
        return xq.c(')', this.b, sb);
    }

    public LocationFilter(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public /* synthetic */ LocationFilter(long j, float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 10.0f : f);
    }
}
