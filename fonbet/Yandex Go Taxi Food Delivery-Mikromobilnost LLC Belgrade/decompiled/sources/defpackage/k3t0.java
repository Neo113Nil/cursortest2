package defpackage;

/* loaded from: classes10.dex */
public final class k3t0 extends j5u0 {
    public b2b0 c;
    public int d;

    public k3t0(long j, b2b0 b2b0Var) {
        super(j);
        this.c = b2b0Var;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        k3t0 k3t0Var = (k3t0) j5u0Var;
        synchronized (yz91.a) {
            this.c = k3t0Var.c;
            this.d = k3t0Var.d;
        }
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return new k3t0(q2t0.j().g(), this.c);
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new k3t0(j, this.c);
    }
}
