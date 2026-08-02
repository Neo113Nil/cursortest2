package io.appmetrica.analytics.impl;

import xsna.vu5;

/* loaded from: classes8.dex */
public final class N9 {
    public final long a;

    public N9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N9) && this.a == ((N9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("ExternalAttributionConfig(collectingInterval="));
    }
}
