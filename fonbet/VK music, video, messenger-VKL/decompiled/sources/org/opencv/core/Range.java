package org.opencv.core;

import com.ironsource.X3;
import xsna.h5s;

/* loaded from: classes8.dex */
public final class Range {
    public final int a;
    public final int b;

    public Range(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new Range(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.a == range.a && this.b == range.b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.a);
        sb.append(", ");
        return h5s.c(this.b, ")", sb);
    }

    public Range() {
        this(0, 0);
    }
}
