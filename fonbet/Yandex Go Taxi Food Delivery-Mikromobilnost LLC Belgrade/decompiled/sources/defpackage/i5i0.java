package defpackage;

import io.appmetrica.analytics.RtmMessageConstraints;

/* loaded from: classes.dex */
public final class i5i0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public i5i0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5i0)) {
            return false;
        }
        i5i0 i5i0Var = (i5i0) obj;
        return this.a == i5i0Var.a && this.b == i5i0Var.b && this.c == i5i0Var.c && this.d == i5i0Var.d && this.e == i5i0Var.e && this.f == i5i0Var.f && this.g == i5i0Var.g && this.h == i5i0Var.h && this.i == i5i0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RTMMessageConstraints(maxVarsLength=");
        sb.append(this.a);
        sb.append(", maxVarsValueLength=");
        sb.append(this.b);
        sb.append(", maxAdditionalLength=");
        sb.append(this.c);
        sb.append(", maxStackLength=");
        sb.append(this.d);
        sb.append(", maxMessageLength=");
        sb.append(this.e);
        sb.append(", maxNameLength=");
        sb.append(this.f);
        sb.append(", stacktraceSingleCauseMaxDepth=");
        sb.append(this.g);
        sb.append(", stacktraceCausesMaxDepth=");
        sb.append(this.h);
        sb.append(", stacktraceLineMaxLength=");
        return oyr.s(sb, this.i, ')');
    }

    public /* synthetic */ i5i0(int i) {
        this(10000, 1000, 1000, RtmMessageConstraints.MAX_STACK_LENGTH_DEFAULT, 500, 500, 4, 1, 250);
    }

    public i5i0() {
        this(0);
    }
}
