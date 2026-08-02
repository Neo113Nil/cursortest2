package xsna;

/* compiled from: ExternalProcessors.kt */
/* loaded from: classes3.dex */
public final class nfq {
    public final d80 a;
    public final pms0 b;

    public nfq(d80 d80Var, pms0 pms0Var) {
        this.a = d80Var;
        this.b = pms0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfq)) {
            return false;
        }
        nfq nfqVar = (nfq) obj;
        return epx.f(this.a, nfqVar.a) && epx.f(this.b, nfqVar.b);
    }

    public final int hashCode() {
        d80 d80Var = this.a;
        int hashCode = (d80Var == null ? 0 : d80Var.hashCode()) * 31;
        pms0 pms0Var = this.b;
        return hashCode + (pms0Var != null ? pms0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ExternalProcessors(audioProcessor=" + this.a + ", videoProcessor=" + this.b + ')';
    }
}
