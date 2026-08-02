package xsna;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
final class q2d0 extends d730<t2d0> {
    public final wax a;
    public final float b = 0.95f;
    public final int c = 170;

    public q2d0(wax waxVar) {
        this.a = waxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2d0)) {
            return false;
        }
        q2d0 q2d0Var = (q2d0) obj;
        return epx.f(this.a, q2d0Var.a) && Float.compare(this.b, q2d0Var.b) == 0 && this.c == q2d0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // xsna.d730
    public final t2d0 r() {
        return new t2d0(this.a, this.b, this.c);
    }

    @Override // xsna.d730
    public final void s(t2d0 t2d0Var) {
        t2d0 t2d0Var2 = t2d0Var;
        t2d0Var2.q = this.b;
        t2d0Var2.r = this.c;
        wax waxVar = t2d0Var2.p;
        wax waxVar2 = this.a;
        if (waxVar != waxVar2) {
            t2d0Var2.p = waxVar2;
            yok0 yok0Var = t2d0Var2.t;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            t2d0Var2.t = myc0.h(t2d0Var2.W1(), null, null, new u2d0(t2d0Var2, null), 3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PressScaleElement(interactionSource=");
        sb.append(this.a);
        sb.append(", pressedScale=");
        sb.append(this.b);
        sb.append(", durationMs=");
        return vu5.b(sb, this.c, ')');
    }
}
