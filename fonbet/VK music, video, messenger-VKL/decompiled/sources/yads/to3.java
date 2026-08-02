package yads;

/* loaded from: classes10.dex */
public final class to3 implements zx2 {
    public final qo3 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public to3(qo3 qo3Var, int i, long j, long j2) {
        this.a = qo3Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / qo3Var.c;
        this.d = j3;
        this.e = c(j3);
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    public final long c(long j) {
        return mc3.a(j * this.b, 1000000L, this.a.b);
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        long j2 = this.d - 1;
        int i = mc3.a;
        long max = Math.max(0L, Math.min((this.a.b * j) / (this.b * 1000000), j2));
        long j3 = (this.a.c * max) + this.c;
        long c = c(max);
        by2 by2Var = new by2(c, j3);
        if (c >= j || max == this.d - 1) {
            return new xx2(by2Var, by2Var);
        }
        long j4 = max + 1;
        return new xx2(by2Var, new by2(c(j4), (this.a.c * j4) + this.c));
    }

    @Override // yads.zx2
    public final long c() {
        return this.e;
    }
}
