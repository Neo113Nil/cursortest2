package yads;

/* loaded from: classes10.dex */
public final class oo3 implements no3 {
    public final qq0 a;
    public final q83 b;
    public final qo3 c;
    public final nx0 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public oo3(qq0 qq0Var, q83 q83Var, qo3 qo3Var, String str, int i) {
        this.a = qq0Var;
        this.b = q83Var;
        this.c = qo3Var;
        int i2 = (qo3Var.a * qo3Var.d) / 8;
        if (qo3Var.c != i2) {
            StringBuilder b = xsna.ji.b(i2, "Expected block size: ", "; got: ");
            b.append(qo3Var.c);
            throw pc2.a(b.toString());
        }
        int i3 = qo3Var.b * i2;
        int i4 = i3 * 8;
        int max = Math.max(i2, i3 / 10);
        this.e = max;
        this.d = new mx0().d(str).a(i4).e(i4).c(max).b(qo3Var.a).g(qo3Var.b).d(i).a();
    }

    @Override // yads.no3
    public final void a(int i, long j) {
        this.a.a(new to3(this.c, 1, i, j));
        this.b.a(this.d);
    }

    @Override // yads.no3
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // yads.no3
    public final boolean a(ld0 ld0Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int a = this.b.a(ld0Var, (int) Math.min(i2 - i, j2), true);
            if (a == -1) {
                j2 = 0;
            } else {
                this.g += a;
                j2 -= a;
            }
        }
        int i3 = this.c.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long a2 = this.f + mc3.a(this.h, 1000000L, r1.b);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(a2, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }
}
