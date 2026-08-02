package io.appmetrica.analytics.impl;

import xsna.vu5;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5081p3 {
    public final long a;

    public C5081p3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5081p3.class == obj.getClass() && this.a == ((C5081p3) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return vu5.a('}', this.a, new StringBuilder("CacheControl{lastKnownLocationTtl="));
    }
}
