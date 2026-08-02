package yads;

/* loaded from: classes10.dex */
public final class aw0 implements zx2 {
    public final cw0 a;
    public final long b;

    public aw0(cw0 cw0Var, long j) {
        this.a = cw0Var;
        this.b = j;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.a.b();
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        cw0 cw0Var = this.a;
        bw0 bw0Var = cw0Var.k;
        if (bw0Var == null) {
            throw new IllegalStateException();
        }
        long[] jArr = bw0Var.a;
        long[] jArr2 = bw0Var.b;
        int b = mc3.b(jArr, cw0Var.a(j), false);
        long j2 = b == -1 ? 0L : jArr[b];
        long j3 = b != -1 ? jArr2[b] : 0L;
        long j4 = this.a.e;
        long j5 = (j2 * 1000000) / j4;
        long j6 = this.b;
        by2 by2Var = new by2(j5, j3 + j6);
        if (j5 == j || b == jArr.length - 1) {
            return new xx2(by2Var, by2Var);
        }
        int i = b + 1;
        return new xx2(by2Var, new by2((jArr[i] * 1000000) / j4, j6 + jArr2[i]));
    }
}
