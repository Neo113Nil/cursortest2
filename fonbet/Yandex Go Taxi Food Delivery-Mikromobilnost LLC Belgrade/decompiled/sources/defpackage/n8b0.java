package defpackage;

/* loaded from: classes10.dex */
public final class n8b0 implements yi11 {
    public final tqn a;
    public final df90 b = new df90(new byte[10], 10);
    public int c = 0;
    public int d;
    public sez0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public n8b0(tqn tqnVar) {
        this.a = tqnVar;
    }

    @Override // defpackage.yi11
    public final void a(int i, ef90 ef90Var) {
        d6z.z(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        tqn tqnVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    lk91.j("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        ny61.k();
                        return;
                    }
                    if (this.j != -1) {
                        lk91.j("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    tqnVar.g(ef90Var.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (ef90Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                df90 df90Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (b(ef90Var, df90Var.a, Math.min(10, this.i)) && b(ef90Var, null, this.i)) {
                            df90Var.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                df90Var.o(4);
                                df90Var.o(1);
                                df90Var.o(1);
                                long g = (df90Var.g(15) << 15) | (df90Var.g(3) << 30) | df90Var.g(15);
                                df90Var.o(1);
                                if (!this.h && this.g) {
                                    df90Var.o(4);
                                    df90Var.o(1);
                                    df90Var.o(1);
                                    df90Var.o(1);
                                    this.e.b((df90Var.g(3) << 30) | (df90Var.g(15) << 15) | df90Var.g(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(g);
                            }
                            i6 |= this.k ? 4 : 0;
                            tqnVar.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            ny61.k();
                            return;
                        }
                        int a = ef90Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : a - i8;
                        if (i9 > 0) {
                            a -= i9;
                            ef90Var.J(ef90Var.b + a);
                        }
                        tqnVar.b(ef90Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - a;
                            this.j = i11;
                            if (i11 == 0) {
                                tqnVar.g(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(ef90Var, df90Var.a, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                ef90Var.L(ef90Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean b(ef90 ef90Var, byte[] bArr, int i) {
        int min = Math.min(ef90Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ef90Var.L(min);
        } else {
            ef90Var.i(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.yi11
    public final void c(sez0 sez0Var, d5p d5pVar, xi11 xi11Var) {
        this.e = sez0Var;
        this.a.h(d5pVar, xi11Var);
    }

    @Override // defpackage.yi11
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        df90 df90Var = this.b;
        df90Var.m(0);
        int g = df90Var.g(24);
        if (g != 1) {
            xvz.v(g, "Unexpected start code prefix: ");
            this.j = -1;
            return false;
        }
        df90Var.o(8);
        int g2 = df90Var.g(16);
        df90Var.o(5);
        this.k = df90Var.f();
        df90Var.o(2);
        this.f = df90Var.f();
        this.g = df90Var.f();
        df90Var.o(6);
        int g3 = df90Var.g(8);
        this.i = g3;
        if (g2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (g2 - 3) - g3;
        this.j = i;
        if (i < 0) {
            lk91.j("Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
