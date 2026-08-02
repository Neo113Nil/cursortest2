package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class gw0 implements nq0 {
    public qq0 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public kl o;
    public yk3 p;
    public final kc2 a = new kc2(4);
    public final kc2 b = new kc2(9);
    public final kc2 c = new kc2(11);
    public final kc2 d = new kc2();
    public final xt2 e = new xt2();
    public int g = 1;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f = qq0Var;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final kc2 a(ld0 ld0Var) {
        int i = this.l;
        kc2 kc2Var = this.d;
        byte[] bArr = kc2Var.a;
        if (i > bArr.length) {
            kc2Var.a = new byte[Math.max(bArr.length * 2, i)];
            kc2Var.c = 0;
            kc2Var.b = 0;
        } else {
            kc2Var.e(0);
        }
        this.d.d(this.l);
        ld0Var.a(this.d.a, 0, this.l, false);
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0006 A[SYNTHETIC] */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        long j;
        boolean z;
        boolean z2;
        if (this.f == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = this.g;
            if (i == 1) {
                if (!((ld0) oq0Var).a(this.b.a, 0, 9, true)) {
                    return -1;
                }
                this.b.e(0);
                kc2 kc2Var = this.b;
                kc2Var.e(kc2Var.b + 4);
                int m = this.b.m();
                boolean z3 = (m & 4) != 0;
                boolean z4 = (m & 1) != 0;
                if (z3 && this.o == null) {
                    this.o = new kl(this.f.a(8, 1));
                }
                if (z4 && this.p == null) {
                    this.p = new yk3(this.f.a(9, 2));
                }
                this.f.a();
                this.j = this.b.b() - 5;
                this.g = 2;
            } else if (i == 2) {
                ((ld0) oq0Var).a(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                if (!((ld0) oq0Var).a(this.c.a, 0, 11, true)) {
                    return -1;
                }
                this.c.e(0);
                this.k = this.c.m();
                this.l = this.c.o();
                this.m = this.c.o();
                this.m = ((this.c.m() << 24) | this.m) * 1000;
                kc2 kc2Var2 = this.c;
                kc2Var2.e(kc2Var2.b + 3);
                this.g = 4;
            } else if (i == 4) {
                if (this.h) {
                    j = this.i + this.m;
                } else {
                    j = this.e.b == C.TIME_UNSET ? 0L : this.m;
                }
                int i2 = this.k;
                if (i2 == 8 && this.o != null) {
                    if (!this.n) {
                        this.f.a(new yx2(C.TIME_UNSET, 0L));
                        this.n = true;
                    }
                    kl klVar = this.o;
                    kc2 a = a((ld0) oq0Var);
                    klVar.a(a);
                    z = klVar.a(j, a);
                } else {
                    if (i2 == 9 && this.p != null) {
                        if (!this.n) {
                            this.f.a(new yx2(C.TIME_UNSET, 0L));
                            this.n = true;
                        }
                        yk3 yk3Var = this.p;
                        kc2 a2 = a((ld0) oq0Var);
                        if (yk3Var.a(a2) && yk3Var.a(j, a2)) {
                            z = true;
                            z2 = z;
                        } else {
                            z = false;
                        }
                    } else if (i2 == 18 && !this.n) {
                        xt2 xt2Var = this.e;
                        kc2 a3 = a((ld0) oq0Var);
                        xt2Var.getClass();
                        z = xt2Var.a(j, a3);
                        xt2 xt2Var2 = this.e;
                        long j2 = xt2Var2.b;
                        if (j2 != C.TIME_UNSET) {
                            this.f.a(new l61(j2, xt2Var2.d, xt2Var2.c));
                            this.n = true;
                        }
                    } else {
                        ((ld0) oq0Var).a(this.l);
                        z = false;
                        z2 = z;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = this.e.b == C.TIME_UNSET ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z2) {
                        return 0;
                    }
                }
                z2 = true;
                if (!this.h) {
                    this.h = true;
                    this.i = this.e.b == C.TIME_UNSET ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        ld0Var.b(this.a.a, 0, 3, false);
        this.a.e(0);
        if (this.a.o() != 4607062) {
            return false;
        }
        ld0Var.b(this.a.a, 0, 2, false);
        this.a.e(0);
        if ((this.a.r() & 250) != 0) {
            return false;
        }
        ld0Var.b(this.a.a, 0, 4, false);
        this.a.e(0);
        int b = this.a.b();
        ld0Var.f = 0;
        ld0Var.a(false, b);
        ld0Var.b(this.a.a, 0, 4, false);
        this.a.e(0);
        return this.a.b() == 0;
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new gw0()};
    }
}
