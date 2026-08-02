package xsna;

/* compiled from: Brush.kt */
/* loaded from: classes11.dex */
public final class rek0 extends yk8 {
    public final long b;

    public rek0(long j) {
        this.b = j;
    }

    @Override // xsna.yk8
    public final void a(float f, long j, fg90 fg90Var) {
        fg90Var.b(1.0f);
        long j2 = this.b;
        if (f != 1.0f) {
            j2 = l5g.c(14, j2, l5g.e(j2) * f);
        }
        fg90Var.d(j2);
        if (fg90Var.e() != null) {
            fg90Var.f(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rek0) {
            return l5g.d(this.b, ((rek0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return pm0.d(')', this.b, new StringBuilder("SolidColor(value="));
    }
}
