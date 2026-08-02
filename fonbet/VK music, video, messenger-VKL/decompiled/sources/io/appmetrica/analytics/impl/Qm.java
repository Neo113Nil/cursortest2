package io.appmetrica.analytics.impl;

import xsna.vu5;

/* loaded from: classes8.dex */
public final class Qm {
    public final long a;

    public Qm(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Qm.class == obj.getClass() && this.a == ((Qm) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return vu5.a('}', this.a, new StringBuilder("StatSending{disabledReportingInterval="));
    }
}
