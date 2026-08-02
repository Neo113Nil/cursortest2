package yads;

/* loaded from: classes10.dex */
public final class np implements zx2 {
    public final qp a;
    public final long b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public np(qp qpVar, long j, long j2, long j3, long j4, long j5) {
        this.a = qpVar;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.b;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        by2 by2Var = new by2(j, pp.a(this.a.a(j), this.c, this.d, this.e, this.f, this.g));
        return new xx2(by2Var, by2Var);
    }
}
