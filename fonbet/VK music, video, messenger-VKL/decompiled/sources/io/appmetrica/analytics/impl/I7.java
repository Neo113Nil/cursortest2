package io.appmetrica.analytics.impl;

import xsna.vu5;

/* loaded from: classes8.dex */
public final class I7 {
    public final long a;
    public final int b;

    public I7(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I7)) {
            return false;
        }
        I7 i7 = (I7) obj;
        return this.a == i7.a && this.b == i7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.a);
        sb.append(", exponent=");
        return vu5.b(sb, this.b, ')');
    }
}
