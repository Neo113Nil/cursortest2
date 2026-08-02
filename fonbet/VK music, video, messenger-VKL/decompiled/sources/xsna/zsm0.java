package xsna;

/* compiled from: StyleConfig.kt */
/* loaded from: classes8.dex */
public final class zsm0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public zsm0(int i, int i2, int i3, int i4, int i5, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm0)) {
            return false;
        }
        zsm0 zsm0Var = (zsm0) obj;
        return this.a == zsm0Var.a && this.b == zsm0Var.b && this.c == zsm0Var.c && this.d == zsm0Var.d && this.e == zsm0Var.e && Float.compare(this.f, zsm0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder a = odj.a(this.a, this.b, "StyleConfig(backgroundColor=", ", recordProgressColor=", ", recordSecondaryProgressColor=");
        cgn.a(this.c, this.d, ", oneVideoLiveProgressColor=", ", oneVideoTimeShiftProgressColor=", a);
        a.append(this.e);
        a.append(", height=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
