package xsna;

/* compiled from: Scroll.kt */
/* loaded from: classes11.dex */
public final class thh0 extends d730<wfh0> {
    public final jgh0 a;
    public final boolean b;

    public thh0(jgh0 jgh0Var, boolean z) {
        this.a = jgh0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof thh0)) {
            return false;
        }
        thh0 thh0Var = (thh0) obj;
        return epx.f(this.a, thh0Var.a) && this.b == thh0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + qoy.b(this.a.hashCode() * 31, 31, false);
    }

    @Override // xsna.d730
    public final wfh0 r() {
        wfh0 wfh0Var = new wfh0();
        wfh0Var.p = this.a;
        wfh0Var.q = this.b;
        return wfh0Var;
    }

    @Override // xsna.d730
    public final void s(wfh0 wfh0Var) {
        wfh0 wfh0Var2 = wfh0Var;
        wfh0Var2.p = this.a;
        wfh0Var2.q = this.b;
    }
}
