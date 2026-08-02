package xsna;

/* compiled from: AboutAppState.kt */
/* loaded from: classes6.dex */
public final class o2 implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final y0 e;

    public o2() {
        this(0);
    }

    public static o2 a(o2 o2Var, boolean z, y0 y0Var) {
        boolean z2 = o2Var.d;
        o2Var.getClass();
        return new o2(false, z, z2, y0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.b == o2Var.b && this.c == o2Var.c && this.d == o2Var.d && epx.f(this.e, o2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "AboutAppState(isLoading=" + this.b + ", isError=" + this.c + ", isShowUnverified=" + this.d + ", content=" + this.e + ')';
    }

    public o2(boolean z, boolean z2, boolean z3, y0 y0Var) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = y0Var;
    }

    public /* synthetic */ o2(int i) {
        this(true, false, false, new y0(0));
    }
}
