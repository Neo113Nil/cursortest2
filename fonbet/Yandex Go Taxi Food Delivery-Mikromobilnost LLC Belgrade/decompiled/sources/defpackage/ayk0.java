package defpackage;

/* loaded from: classes10.dex */
public final class ayk0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public ayk0(long j, long j2, long j3, wre wreVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long i = pw91.i(pw91.m(j, j2));
        this.d = i;
        long i2 = pw91.i(pw91.m(j3, j2));
        this.e = i2;
        float f = wreVar.a;
        this.f = f;
        this.g = wreVar.b;
        float h = pw91.h(i, i2);
        float f2 = ex21.b;
        float sqrt = (float) Math.sqrt(1.0f - (h * h));
        this.h = ((double) sqrt) > 0.001d ? ((h + 1.0f) * f) / sqrt : 0.0f;
        this.i = ior.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jdf b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        ior iorVar;
        long i = pw91.i(pw91.m(j2, j));
        long n = pw91.n(j, pw91.r(1.0f + f2, pw91.r(f, i)));
        long g = pw91.g(2.0f, pw91.n(j3, j4));
        long a = ior.a(ex21.c(pw91.j(j3), pw91.j(g), f2), ex21.c(pw91.k(j3), pw91.k(g), f2));
        long n2 = pw91.n(j5, pw91.r(f3, ex21.b(pw91.j(a) - pw91.j(j5), pw91.k(a) - pw91.k(j5))));
        long m = pw91.m(n2, j5);
        long a2 = ior.a(-pw91.k(m), pw91.j(m));
        long a3 = ior.a(-pw91.k(a2), pw91.j(a2));
        float h = pw91.h(i, a3);
        if (Math.abs(h) >= 1.0E-4f) {
            float h2 = pw91.h(pw91.m(n2, j2), a3);
            if (Math.abs(h) >= Math.abs(h2) * 1.0E-4f) {
                iorVar = new ior(pw91.n(j2, pw91.r(h2 / h, i)));
                long j6 = iorVar == null ? iorVar.a : j3;
                long g2 = pw91.g(3.0f, pw91.n(n, pw91.r(2.0f, j6)));
                return new jdf(new float[]{pw91.j(n), pw91.k(n), pw91.j(g2), pw91.k(g2), pw91.j(j6), pw91.k(j6), pw91.j(n2), pw91.k(n2)});
            }
        }
        iorVar = null;
        if (iorVar == null) {
        }
        long g22 = pw91.g(3.0f, pw91.n(n, pw91.r(2.0f, j6)));
        return new jdf(new float[]{pw91.j(n), pw91.k(n), pw91.j(g22), pw91.k(g22), pw91.j(j6), pw91.k(j6), pw91.j(n2), pw91.k(n2)});
    }

    public final float a(float f) {
        float c = c();
        float f2 = this.g;
        if (f > c) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
