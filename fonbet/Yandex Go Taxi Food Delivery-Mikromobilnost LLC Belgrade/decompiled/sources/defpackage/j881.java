package defpackage;

/* loaded from: classes7.dex */
public final class j881 implements w481 {
    public final gz71 a;
    public final uh81 b;
    public int c;
    public int d;
    public lo61 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public j881(gz71 gz71Var) {
        this.a = gz71Var;
        uh81 uh81Var = new uh81();
        uh81Var.a = new byte[10];
        uh81Var.d = 10;
        this.b = uh81Var;
        this.c = 0;
    }

    @Override // defpackage.w481
    public final void a(int i, dl81 dl81Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.e == null) {
            ny61.k();
            return;
        }
        int i7 = i & 1;
        gz71 gz71Var = this.a;
        int i8 = 2;
        int i9 = 3;
        int i10 = -1;
        int i11 = 0;
        if (i7 != 0) {
            int i12 = this.c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    nba1.e();
                } else if (i12 != 3) {
                    ny61.k();
                    return;
                } else {
                    if (this.j != -1) {
                        nba1.e();
                    }
                    gz71Var.b();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i13 = i;
        while (true) {
            int i14 = dl81Var.c;
            int i15 = dl81Var.b;
            int i16 = i14 - i15;
            if (i16 <= 0) {
                return;
            }
            int i17 = this.c;
            if (i17 != 0) {
                uh81 uh81Var = this.b;
                if (i17 != 1) {
                    if (i17 == i8) {
                        if (b(dl81Var, uh81Var.a, Math.min(10, this.i)) && b(dl81Var, null, this.i)) {
                            uh81Var.f(i11);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                uh81Var.h(4);
                                uh81Var.h(1);
                                uh81Var.h(1);
                                long a = (uh81Var.a(15) << 15) | (uh81Var.a(i9) << 30) | uh81Var.a(15);
                                uh81Var.h(1);
                                if (!this.h && this.g) {
                                    uh81Var.h(4);
                                    uh81Var.h(1);
                                    uh81Var.h(1);
                                    uh81Var.h(1);
                                    this.e.c((uh81Var.a(15) << 15) | (uh81Var.a(i9) << 30) | uh81Var.a(15));
                                    this.h = true;
                                }
                                this.l = this.e.c(a);
                            }
                            i13 |= this.k ? 4 : 0;
                            gz71Var.c(i13, this.l);
                            this.c = 3;
                            this.d = 0;
                            i11 = 0;
                            i10 = -1;
                            i9 = 3;
                            i8 = 2;
                        } else {
                            i3 = i9;
                            i4 = i11;
                            i2 = 2;
                        }
                    } else {
                        if (i17 != i9) {
                            ny61.k();
                            return;
                        }
                        int i18 = this.j;
                        int i19 = i18 == i10 ? i11 : i16 - i18;
                        if (i19 > 0) {
                            i16 -= i19;
                            dl81Var.k(i15 + i16);
                        }
                        gz71Var.f(dl81Var);
                        int i20 = this.j;
                        if (i20 != i10) {
                            int i21 = i20 - i16;
                            this.j = i21;
                            if (i21 == 0) {
                                gz71Var.b();
                                this.c = 1;
                                this.d = i11;
                            }
                        }
                        i2 = i8;
                        i3 = i9;
                        i4 = i11;
                    }
                    i5 = i10;
                } else {
                    i3 = i9;
                    i4 = i11;
                    if (b(dl81Var, uh81Var.a, 9)) {
                        uh81Var.f(i4);
                        if (uh81Var.a(24) != 1) {
                            nba1.e();
                            this.j = -1;
                            i5 = -1;
                            i6 = 0;
                            i2 = 2;
                        } else {
                            uh81Var.h(8);
                            int a2 = uh81Var.a(16);
                            uh81Var.h(5);
                            this.k = uh81Var.k();
                            i2 = 2;
                            uh81Var.h(2);
                            this.f = uh81Var.k();
                            this.g = uh81Var.k();
                            uh81Var.h(6);
                            int a3 = uh81Var.a(8);
                            this.i = a3;
                            if (a2 == 0) {
                                i5 = -1;
                                this.j = -1;
                            } else {
                                i5 = -1;
                                int i22 = (a2 - 3) - a3;
                                this.j = i22;
                                if (i22 < 0) {
                                    nba1.e();
                                    this.j = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        i4 = 0;
                        this.d = 0;
                    } else {
                        i5 = -1;
                        i2 = 2;
                    }
                }
            } else {
                i2 = i8;
                i3 = i9;
                i4 = i11;
                i5 = i10;
                dl81Var.m(i16 + i15);
            }
            i10 = i5;
            i11 = i4;
            i9 = i3;
            i8 = i2;
        }
    }

    public final boolean b(dl81 dl81Var, byte[] bArr, int i) {
        int min = Math.min(dl81Var.c - dl81Var.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            dl81Var.m(dl81Var.b + min);
        } else {
            dl81Var.d(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.w481
    public final void g(lo61 lo61Var, yg71 yg71Var, xi11 xi11Var) {
        this.e = lo61Var;
        this.a.a(yg71Var, xi11Var);
    }

    @Override // defpackage.w481
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }
}
