package defpackage;

/* loaded from: classes7.dex */
public final class d071 implements n771 {
    public final dl81 c;
    public final uh81 d;
    public yg71 e;
    public long f;
    public boolean h;
    public boolean i;
    public final m371 a = new m371(null, true);
    public final dl81 b = new dl81(2048);
    public long g = -1;

    public d071() {
        dl81 dl81Var = new dl81(10);
        this.c = dl81Var;
        this.d = new uh81(dl81Var.a);
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.e = yg71Var;
        this.a.a(yg71Var, new xi11(Integer.MIN_VALUE, 0, 1, 1));
        yg71Var.mo495a();
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        if (this.e == null) {
            ny61.k();
            return 0;
        }
        w971 w971Var = (w971) bb71Var;
        long j = w971Var.c;
        dl81 dl81Var = this.b;
        int v = w971Var.v(0, 2048, dl81Var.a);
        boolean z = v == -1;
        if (!this.i) {
            this.e.r(new w471(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        dl81Var.m(0);
        dl81Var.k(v);
        boolean z2 = this.h;
        m371 m371Var = this.a;
        if (!z2) {
            m371Var.c(4, this.f);
            this.h = true;
        }
        m371Var.f(dl81Var);
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        dl81 dl81Var;
        w971 w971Var = (w971) bb71Var;
        int i = 0;
        while (true) {
            dl81Var = this.c;
            w971Var.I(dl81Var.a, 0, 10, false);
            dl81Var.m(0);
            if (dl81Var.u() != 4801587) {
                break;
            }
            dl81Var.m(dl81Var.b + 3);
            int r = dl81Var.r();
            i += r + 10;
            w971Var.c(r, false);
        }
        w971Var.y = 0;
        w971Var.c(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            w971Var.I(dl81Var.a, 0, 2, false);
            dl81Var.m(0);
            if ((dl81Var.x() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                w971Var.I(dl81Var.a, 0, 4, false);
                uh81 uh81Var = this.d;
                uh81Var.f(14);
                int a = uh81Var.a(13);
                if (a <= 6) {
                    i4++;
                    w971Var.y = 0;
                    w971Var.c(i4, false);
                } else {
                    w971Var.c(a - 6, false);
                    i3 += a;
                }
            } else {
                i4++;
                w971Var.y = 0;
                w971Var.c(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
