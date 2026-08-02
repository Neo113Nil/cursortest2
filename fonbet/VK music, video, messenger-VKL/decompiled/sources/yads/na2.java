package yads;

/* loaded from: classes10.dex */
public final class na2 implements nq0 {
    public qq0 a;
    public d53 b;
    public boolean c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.a = qq0Var;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        d53 d53Var = this.b;
        if (d53Var != null) {
            oa2 oa2Var = d53Var.a;
            pa2 pa2Var = oa2Var.a;
            pa2Var.a = 0;
            pa2Var.b = 0L;
            pa2Var.c = 0;
            pa2Var.d = 0;
            pa2Var.e = 0;
            oa2Var.b.c(0);
            oa2Var.c = -1;
            oa2Var.e = false;
            if (j == 0) {
                d53Var.a(!d53Var.l);
                return;
            }
            if (d53Var.h != 0) {
                long j3 = (d53Var.i * j2) / 1000000;
                d53Var.e = j3;
                qa2 qa2Var = d53Var.d;
                int i = mc3.a;
                qa2Var.a(j3);
                d53Var.h = 2;
            }
        }
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        int i;
        if (this.a == null) {
            throw new IllegalStateException();
        }
        if (this.b == null) {
            ld0 ld0Var = (ld0) oq0Var;
            if (!a(ld0Var)) {
                throw new pc2("Failed to determine bitstream type", null, true, 1);
            }
            ld0Var.f = 0;
        }
        if (!this.c) {
            q83 a = this.a.a(0, 1);
            this.a.a();
            d53 d53Var = this.b;
            d53Var.c = this.a;
            d53Var.b = a;
            d53Var.a(true);
            this.c = true;
        }
        d53 d53Var2 = this.b;
        if (d53Var2.b == null) {
            throw new IllegalStateException();
        }
        int i2 = mc3.a;
        int i3 = d53Var2.h;
        if (i3 == 0) {
            while (true) {
                ld0 ld0Var2 = (ld0) oq0Var;
                if (!d53Var2.a.a(ld0Var2)) {
                    d53Var2.h = 3;
                    break;
                }
                long j = ld0Var2.d;
                long j2 = d53Var2.f;
                d53Var2.k = j - j2;
                if (!d53Var2.a(d53Var2.a.b, j2, d53Var2.j)) {
                    nx0 nx0Var = d53Var2.j.a;
                    d53Var2.i = nx0Var.A;
                    if (!d53Var2.m) {
                        d53Var2.b.a(nx0Var);
                        d53Var2.m = true;
                    }
                    yv0 yv0Var = d53Var2.j.b;
                    if (yv0Var != null) {
                        d53Var2.d = yv0Var;
                    } else {
                        long j3 = ld0Var2.c;
                        if (j3 != -1) {
                            pa2 pa2Var = d53Var2.a.a;
                            i = 2;
                            d53Var2.d = new me0(d53Var2, d53Var2.f, j3, pa2Var.d + pa2Var.e, pa2Var.b, (pa2Var.a & 4) != 0);
                            d53Var2.h = i;
                            d53Var2.a.a();
                            return 0;
                        }
                        d53Var2.d = new c53();
                    }
                    i = 2;
                    d53Var2.h = i;
                    d53Var2.a.a();
                    return 0;
                }
                d53Var2.f = ld0Var2.d;
            }
        } else {
            if (i3 == 1) {
                ((ld0) oq0Var).a((int) d53Var2.f);
                d53Var2.h = 2;
                return 0;
            }
            if (i3 == 2) {
                ld0 ld0Var3 = (ld0) oq0Var;
                long a2 = d53Var2.d.a(ld0Var3);
                if (a2 >= 0) {
                    hh2Var.a = a2;
                    return 1;
                }
                if (a2 < -1) {
                    d53Var2.a(-(a2 + 2));
                }
                if (!d53Var2.l) {
                    zx2 a3 = d53Var2.d.a();
                    if (a3 == null) {
                        throw new IllegalStateException();
                    }
                    d53Var2.c.a(a3);
                    d53Var2.l = true;
                }
                if (d53Var2.k <= 0 && !d53Var2.a.a(ld0Var3)) {
                    d53Var2.h = 3;
                    return -1;
                }
                d53Var2.k = 0L;
                kc2 kc2Var = d53Var2.a.b;
                long a4 = d53Var2.a(kc2Var);
                if (a4 >= 0) {
                    long j4 = d53Var2.g;
                    if (j4 + a4 >= d53Var2.e) {
                        d53Var2.b.a(kc2Var.c, kc2Var);
                        d53Var2.b.a((j4 * 1000000) / d53Var2.i, 1, kc2Var.c, 0, null);
                        d53Var2.e = -1L;
                    }
                }
                d53Var2.g += a4;
                return 0;
            }
            if (i3 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        try {
            return a((ld0) oq0Var);
        } catch (pc2 unused) {
            return false;
        }
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new na2()};
    }

    public final boolean a(ld0 ld0Var) {
        pa2 pa2Var = new pa2();
        if (pa2Var.a(ld0Var, true) && (pa2Var.a & 2) == 2) {
            int min = Math.min(pa2Var.e, 8);
            kc2 kc2Var = new kc2(min);
            ld0Var.b(kc2Var.a, 0, min, false);
            kc2Var.e(0);
            if (kc2Var.c - kc2Var.b >= 5 && kc2Var.m() == 127 && kc2Var.n() == 1179402563) {
                this.b = new zv0();
            } else {
                kc2Var.e(0);
                try {
                    if (ho3.a(1, kc2Var, true)) {
                        this.b = new do3();
                    }
                } catch (pc2 unused) {
                }
                kc2Var.e(0);
                if (rb2.a(kc2Var, rb2.o)) {
                    this.b = new rb2();
                }
            }
            return true;
        }
        return false;
    }
}
