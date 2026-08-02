package xsna;

/* compiled from: WindowInsetsPadding.kt */
/* loaded from: classes11.dex */
final class p3q0 extends d730<q3q0> {
    public final anr a;
    public final izs<z5x, s3q0> b;

    public p3q0(anr anrVar, izs izsVar) {
        this.a = anrVar;
        this.b = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p3q0) {
            return epx.f(((p3q0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final q3q0 r() {
        q3q0 q3q0Var = new q3q0();
        q3q0Var.r = this.a;
        return q3q0Var;
    }

    @Override // xsna.d730
    public final void s(q3q0 q3q0Var) {
        q3q0 q3q0Var2 = q3q0Var;
        anr anrVar = q3q0Var2.r;
        anr anrVar2 = this.a;
        if (epx.f(anrVar2, anrVar)) {
            return;
        }
        q3q0Var2.r = anrVar2;
        q3q0Var2.j2();
    }
}
