package defpackage;

/* loaded from: classes10.dex */
public final class q0u0 implements jj2 {
    public final jj2 a;
    public final long b;

    public q0u0(qar qarVar, long j) {
        this.a = qarVar;
        this.b = j;
    }

    @Override // defpackage.jj2
    public final f531 a(gl11 gl11Var) {
        return new r0u0(this.a.a(gl11Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0u0)) {
            return false;
        }
        q0u0 q0u0Var = (q0u0) obj;
        return q0u0Var.b == this.b && jl40.l(q0u0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
