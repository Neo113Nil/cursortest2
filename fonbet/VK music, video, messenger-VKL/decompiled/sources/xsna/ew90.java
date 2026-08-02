package xsna;

/* compiled from: PerformanceClassesThresholds.kt */
/* loaded from: classes17.dex */
public final class ew90 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ew90(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew90)) {
            return false;
        }
        ew90 ew90Var = (ew90) obj;
        return this.a == ew90Var.a && this.b == ew90Var.b && this.c == ew90Var.c && this.d == ew90Var.d && this.e == ew90Var.e && this.f == ew90Var.f;
    }

    public final int f() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceClassesThresholds(cpuLow=");
        sb.append(this.a);
        sb.append(", cpuHigh=");
        sb.append(this.b);
        sb.append(", diskLow=");
        sb.append(this.c);
        sb.append(", diskHigh=");
        sb.append(this.d);
        sb.append(", ramLow=");
        sb.append(this.e);
        sb.append(", ramHigh=");
        return vu5.b(sb, this.f, ')');
    }
}
