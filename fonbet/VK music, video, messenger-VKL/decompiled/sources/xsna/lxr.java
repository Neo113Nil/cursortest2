package xsna;

/* compiled from: Focusable.kt */
/* loaded from: classes11.dex */
final class lxr extends d730<nxr> {
    public final sg50 a;

    public lxr(sg50 sg50Var) {
        this.a = sg50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lxr) {
            return epx.f(this.a, ((lxr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        sg50 sg50Var = this.a;
        if (sg50Var != null) {
            return sg50Var.hashCode();
        }
        return 0;
    }

    @Override // xsna.d730
    public final nxr r() {
        return new nxr(this.a, 1, null);
    }

    @Override // xsna.d730
    public final void s(nxr nxrVar) {
        nxrVar.n2(this.a);
    }
}
