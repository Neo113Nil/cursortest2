package defpackage;

/* loaded from: classes7.dex */
public final class b681 implements zk71 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public b681(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.zk71
    public final long a(long j) {
        long j2 = j - this.a;
        if (b() && j2 > this.b) {
            long[] jArr = this.f;
            if (jArr != null) {
                double d = (j2 * 256.0d) / this.d;
                int t = rf71.t(jArr, (long) d, true);
                long j3 = this.c;
                long j4 = (t * j3) / 100;
                long j5 = jArr[t];
                int i = t + 1;
                long j6 = (j3 * i) / 100;
                return Math.round((j5 == (t == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
            }
            ny61.k();
        }
        return 0L;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return this.f != null;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.c;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        boolean b = b();
        int i = this.b;
        long j2 = this.a;
        if (!b) {
            oe71 oe71Var = new oe71(0L, j2 + i);
            return new v171(oe71Var, oe71Var);
        }
        int i2 = rf71.a;
        long j3 = this.c;
        long max = Math.max(0L, Math.min(j, j3));
        double d = (max * 100.0d) / j3;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i3 = (int) d;
                long[] jArr = this.f;
                if (jArr == null) {
                    ny61.k();
                    return null;
                }
                double d3 = jArr[i3];
                d2 = x4e.a(i3 == 99 ? 256.0d : jArr[i3 + 1], d3, d - i3, d3);
            }
        }
        long j4 = this.d;
        oe71 oe71Var2 = new oe71(max, j2 + Math.max(i, Math.min(Math.round((d2 / 256.0d) * j4), j4 - 1)));
        return new v171(oe71Var2, oe71Var2);
    }

    @Override // defpackage.zk71
    public final long a() {
        return this.e;
    }
}
