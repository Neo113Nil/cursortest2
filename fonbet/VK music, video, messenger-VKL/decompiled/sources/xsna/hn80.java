package xsna;

/* compiled from: OneVideoSeekBarViewState.kt */
/* loaded from: classes8.dex */
public final class hn80 implements x0u0 {
    public static final hn80 g = new hn80(false, false, null, 0, 0, 0);
    public final boolean a;
    public final boolean b;
    public final sox c;
    public final int d;
    public final int e;
    public final int f;

    public hn80(boolean z, boolean z2, sox soxVar, int i, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = soxVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn80)) {
            return false;
        }
        hn80 hn80Var = (hn80) obj;
        return this.a == hn80Var.a && this.b == hn80Var.b && epx.f(this.c, hn80Var.c) && this.d == hn80Var.d && this.e == hn80Var.e && this.f == hn80Var.f;
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        sox soxVar = this.c;
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, (b + (soxVar == null ? 0 : soxVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder c = gp.c("OneVideoSeekBarViewState(isLive=", ", isLiveEdge=", ", intervals=", this.a, this.b);
        c.append(this.c);
        c.append(", max=");
        c.append(this.d);
        c.append(", progress=");
        return rzl.a(this.e, this.f, ", secondaryProgress=", ")", c);
    }
}
