package yads;

/* loaded from: classes10.dex */
public final class yv0 implements qa2 {
    public final cw0 a;
    public final bw0 b;
    public long c = -1;
    public long d = -1;

    public yv0(cw0 cw0Var, bw0 bw0Var) {
        this.a = cw0Var;
        this.b = bw0Var;
    }

    @Override // yads.qa2
    public final zx2 a() {
        long j = this.c;
        if (j != -1) {
            return new aw0(this.a, j);
        }
        throw new IllegalStateException();
    }

    @Override // yads.qa2
    public final long a(ld0 ld0Var) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.d = -1L;
        return j2;
    }

    @Override // yads.qa2
    public final void a(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[mc3.b(jArr, j, true)];
    }
}
