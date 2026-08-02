package yads;

/* loaded from: classes10.dex */
public final class ny2 implements as {
    public final rj0 a;
    public final long b;
    public final int c;
    public long d;
    public int e;

    public ny2(rj0 rj0Var, long j, int i, long j2, int i2) {
        this.a = rj0Var;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = i2;
    }

    @Override // yads.as
    public final void a(long j, long j2, long j3) {
        float f;
        long j4 = this.d + j3;
        this.d = j4;
        rj0 rj0Var = this.a;
        long j5 = this.b;
        if (j5 == -1 || j5 == 0) {
            int i = this.c;
            f = i != 0 ? (this.e * 100.0f) / i : -1.0f;
        } else {
            f = (j4 * 100.0f) / j5;
        }
        ((mj0) rj0Var).a(j5, j4, f);
    }
}
