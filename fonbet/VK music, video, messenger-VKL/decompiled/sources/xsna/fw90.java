package xsna;

/* compiled from: PerformanceClassesThresholdsConfig.kt */
/* loaded from: classes11.dex */
public final class fw90 {
    public static final a g = new a();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: PerformanceClassesThresholdsConfig.kt */
    public static final class a {
    }

    public fw90(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw90)) {
            return false;
        }
        fw90 fw90Var = (fw90) obj;
        return this.a == fw90Var.a && this.b == fw90Var.b && this.c == fw90Var.c && this.d == fw90Var.d && this.e == fw90Var.e && this.f == fw90Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceClassesThresholdsConfig(cpuLow=");
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
