package xsna;

/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes11.dex */
final class h160 extends d730<k160> {
    public final d160 a;
    public final e160 b;

    public h160(d160 d160Var, e160 e160Var) {
        this.a = d160Var;
        this.b = e160Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h160)) {
            return false;
        }
        h160 h160Var = (h160) obj;
        return epx.f(h160Var.a, this.a) && epx.f(h160Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e160 e160Var = this.b;
        return hashCode + (e160Var != null ? e160Var.hashCode() : 0);
    }

    @Override // xsna.d730
    public final k160 r() {
        return new k160(this.a, this.b);
    }

    @Override // xsna.d730
    public final void s(k160 k160Var) {
        k160 k160Var2 = k160Var;
        k160Var2.p = this.a;
        e160 e160Var = k160Var2.q;
        if (e160Var.a == k160Var2) {
            e160Var.a = null;
        }
        e160 e160Var2 = this.b;
        if (e160Var2 == null) {
            k160Var2.q = new e160();
        } else if (!e160Var2.equals(e160Var)) {
            k160Var2.q = e160Var2;
        }
        if (k160Var2.o) {
            e160 e160Var3 = k160Var2.q;
            e160Var3.a = k160Var2;
            e160Var3.b = null;
            k160Var2.r = null;
            e160Var3.c = new l160(k160Var2);
            k160Var2.q.d = k160Var2.W1();
        }
    }
}
