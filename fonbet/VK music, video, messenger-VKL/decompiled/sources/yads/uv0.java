package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class uv0 implements nq0 {
    public qq0 e;
    public q83 f;
    public ut1 h;
    public cw0 i;
    public int j;
    public int k;
    public tv0 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final kc2 b = new kc2(0, new byte[32768]);
    public final boolean c = false;
    public final vv0 d = new vv0();
    public int g = 0;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.e = qq0Var;
        this.f = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            tv0 tv0Var = this.l;
            if (tv0Var != null) {
                tv0Var.a(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.c(0);
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        int i;
        ut1 ut1Var;
        cw0 cw0Var;
        zx2 yx2Var;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        int i2 = this.g;
        ut1 ut1Var2 = null;
        if (i2 == 0) {
            boolean z4 = this.c;
            ld0 ld0Var = (ld0) oq0Var;
            ld0Var.f = 0;
            long j2 = ld0Var.d + 0;
            ut1 a = new y21().a(ld0Var, !z4 ? null : w21.b);
            if (a != null && a.b.length != 0) {
                ut1Var2 = a;
            }
            ld0Var.a((int) ((ld0Var.d + ld0Var.f) - j2));
            this.h = ut1Var2;
            this.g = 1;
            return 0;
        }
        if (i2 == 1) {
            byte[] bArr = this.a;
            ld0 ld0Var2 = (ld0) oq0Var;
            ld0Var2.b(bArr, 0, bArr.length, false);
            ld0Var2.f = 0;
            this.g = 2;
            return 0;
        }
        int i3 = 24;
        if (i2 == 2) {
            ((ld0) oq0Var).a(new byte[4], 0, 4, false);
            if ((((r1[2] & 255) << 8) | ((r1[0] & 255) << 24) | ((r1[1] & 255) << 16) | (r1[3] & 255)) == 1716281667) {
                this.g = 3;
                return 0;
            }
            throw new pc2("Failed to read FLAC stream marker.", null, true, 1);
        }
        if (i2 != 3) {
            long j3 = 0;
            if (i2 == 4) {
                ld0 ld0Var3 = (ld0) oq0Var;
                ld0Var3.f = 0;
                byte[] bArr2 = new byte[2];
                ld0Var3.b(bArr2, 0, 2, false);
                int i4 = ((bArr2[0] & 255) << 8) | (bArr2[1] & 255);
                if ((i4 >> 2) == 16382) {
                    ld0Var3.f = 0;
                    this.k = i4;
                    qq0 qq0Var = this.e;
                    int i5 = mc3.a;
                    long j4 = ld0Var3.d;
                    long j5 = ld0Var3.c;
                    this.i.getClass();
                    cw0 cw0Var2 = this.i;
                    if (cw0Var2.k != null) {
                        yx2Var = new aw0(cw0Var2, j4);
                    } else if (j5 != -1 && cw0Var2.j > 0) {
                        tv0 tv0Var = new tv0(cw0Var2, this.k, j4, j5);
                        this.l = tv0Var;
                        yx2Var = tv0Var.a;
                    } else {
                        yx2Var = new yx2(cw0Var2.b(), 0L);
                    }
                    qq0Var.a(yx2Var);
                    this.g = 5;
                    return 0;
                }
                ld0Var3.f = 0;
                throw new pc2("First frame does not start with sync code.", null, true, 1);
            }
            if (i2 == 5) {
                this.f.getClass();
                this.i.getClass();
                tv0 tv0Var2 = this.l;
                if (tv0Var2 != null && tv0Var2.c != null) {
                    return tv0Var2.a((ld0) oq0Var, hh2Var);
                }
                if (this.n == -1) {
                    cw0 cw0Var3 = this.i;
                    ld0 ld0Var4 = (ld0) oq0Var;
                    ld0Var4.f = 0;
                    ld0Var4.a(false, 1);
                    byte[] bArr3 = new byte[1];
                    ld0Var4.b(bArr3, 0, 1, false);
                    boolean z5 = (bArr3[0] & 1) == 1;
                    ld0Var4.a(false, 2);
                    r11 = z5 ? 7 : 6;
                    kc2 kc2Var = new kc2(r11);
                    byte[] bArr4 = kc2Var.a;
                    int i6 = 0;
                    while (i6 < r11) {
                        int b = ld0Var4.b(bArr4, i6, r11 - i6);
                        if (b == -1) {
                            break;
                        }
                        i6 += b;
                    }
                    kc2Var.d(i6);
                    ld0Var4.f = 0;
                    try {
                        long s = kc2Var.s();
                        if (!z5) {
                            s *= cw0Var3.b;
                        }
                        j3 = s;
                        z3 = true;
                    } catch (NumberFormatException unused) {
                        z3 = false;
                    }
                    if (z3) {
                        this.n = j3;
                    } else {
                        throw new pc2(null, null, true, 1);
                    }
                } else {
                    kc2 kc2Var2 = this.b;
                    int i7 = kc2Var2.c;
                    if (i7 < 32768) {
                        int read = ((ld0) oq0Var).read(kc2Var2.a, i7, 32768 - i7);
                        z = read == -1;
                        if (!z) {
                            this.b.d(i7 + read);
                        } else {
                            kc2 kc2Var3 = this.b;
                            if (kc2Var3.c - kc2Var3.b == 0) {
                                long j6 = this.n * 1000000;
                                cw0 cw0Var4 = this.i;
                                int i8 = mc3.a;
                                this.f.a(j6 / cw0Var4.e, 1, this.m, 0, null);
                                return -1;
                            }
                        }
                    } else {
                        z = false;
                    }
                    kc2 kc2Var4 = this.b;
                    int i9 = kc2Var4.b;
                    int i10 = this.m;
                    int i11 = this.j;
                    if (i10 < i11) {
                        kc2Var4.e(kc2Var4.b + Math.min(i11 - i10, kc2Var4.c - i9));
                    }
                    kc2 kc2Var5 = this.b;
                    this.i.getClass();
                    int i12 = kc2Var5.b;
                    while (true) {
                        if (i12 <= kc2Var5.c - 16) {
                            kc2Var5.e(i12);
                            if (wv0.a(kc2Var5, this.i, this.k, this.d)) {
                                kc2Var5.e(i12);
                                j = this.d.a;
                                break;
                            }
                            i12++;
                        } else {
                            if (z) {
                                while (true) {
                                    int i13 = kc2Var5.c;
                                    if (i12 <= i13 - this.j) {
                                        kc2Var5.e(i12);
                                        try {
                                            z2 = wv0.a(kc2Var5, this.i, this.k, this.d);
                                        } catch (IndexOutOfBoundsException unused2) {
                                            z2 = false;
                                        }
                                        if (kc2Var5.b <= kc2Var5.c && z2) {
                                            kc2Var5.e(i12);
                                            j = this.d.a;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        kc2Var5.e(i13);
                                        break;
                                    }
                                }
                            } else {
                                kc2Var5.e(i12);
                            }
                            j = -1;
                        }
                    }
                    kc2 kc2Var6 = this.b;
                    int i14 = kc2Var6.b - i9;
                    kc2Var6.e(i9);
                    this.f.a(i14, this.b);
                    int i15 = this.m + i14;
                    this.m = i15;
                    if (j != -1) {
                        long j7 = this.n * 1000000;
                        cw0 cw0Var5 = this.i;
                        int i16 = mc3.a;
                        this.f.a(j7 / cw0Var5.e, 1, i15, 0, null);
                        this.m = 0;
                        this.n = j;
                    }
                    kc2 kc2Var7 = this.b;
                    int i17 = kc2Var7.c;
                    int i18 = kc2Var7.b;
                    int i19 = i17 - i18;
                    if (i19 < 16) {
                        byte[] bArr5 = kc2Var7.a;
                        System.arraycopy(bArr5, i18, bArr5, 0, i19);
                        this.b.e(0);
                        this.b.d(i19);
                    }
                }
                return 0;
            }
            throw new IllegalStateException();
        }
        cw0 cw0Var6 = this.i;
        while (true) {
            ld0 ld0Var5 = (ld0) oq0Var;
            ld0Var5.f = 0;
            byte[] bArr6 = new byte[4];
            jc2 jc2Var = new jc2(4, bArr6);
            ld0Var5.b(bArr6, 0, 4, false);
            boolean e = jc2Var.e();
            int a2 = jc2Var.a(r11);
            int a3 = jc2Var.a(i3) + 4;
            if (a2 == 0) {
                byte[] bArr7 = new byte[38];
                ld0Var5.a(bArr7, 0, 38, false);
                cw0Var6 = new cw0(4, bArr7);
                i = i3;
            } else {
                if (cw0Var6 == null) {
                    throw new IllegalArgumentException();
                }
                if (a2 == 3) {
                    kc2 kc2Var8 = new kc2(a3);
                    ld0Var5.a(kc2Var8.a, 0, a3, false);
                    i = i3;
                    cw0Var = new cw0(cw0Var6.a, cw0Var6.b, cw0Var6.c, cw0Var6.d, cw0Var6.e, cw0Var6.g, cw0Var6.h, cw0Var6.j, xv0.a(kc2Var8), cw0Var6.l);
                } else {
                    i = i3;
                    if (a2 == 4) {
                        kc2 kc2Var9 = new kc2(a3);
                        ld0Var5.a(kc2Var9.a, 0, a3, false);
                        kc2Var9.e(kc2Var9.b + 4);
                        ut1 a4 = ho3.a(Arrays.asList(ho3.a(kc2Var9, false, false).a));
                        ut1 ut1Var3 = cw0Var6.l;
                        if (ut1Var3 != null) {
                            if (a4 != null) {
                                tt1[] tt1VarArr = a4.b;
                                if (tt1VarArr.length != 0) {
                                    a4 = new ut1((tt1[]) mc3.a((Object[]) ut1Var3.b, (Object[]) tt1VarArr));
                                }
                            }
                            a4 = ut1Var3;
                        }
                        cw0Var = new cw0(cw0Var6.a, cw0Var6.b, cw0Var6.c, cw0Var6.d, cw0Var6.e, cw0Var6.g, cw0Var6.h, cw0Var6.j, cw0Var6.k, a4);
                    } else if (a2 == 6) {
                        kc2 kc2Var10 = new kc2(a3);
                        ld0Var5.a(kc2Var10.a, 0, a3, false);
                        kc2Var10.e(kc2Var10.b + 4);
                        int b2 = kc2Var10.b();
                        String a5 = kc2Var10.a(kc2Var10.b(), bu.a);
                        String a6 = kc2Var10.a(kc2Var10.b(), bu.c);
                        int b3 = kc2Var10.b();
                        int b4 = kc2Var10.b();
                        int b5 = kc2Var10.b();
                        int b6 = kc2Var10.b();
                        int b7 = kc2Var10.b();
                        byte[] bArr8 = new byte[b7];
                        kc2Var10.a(bArr8, 0, b7);
                        ut1 ut1Var4 = new ut1(s51.a(new be2(b2, a5, a6, b3, b4, b5, b6, bArr8)));
                        ut1 ut1Var5 = cw0Var6.l;
                        if (ut1Var5 == null) {
                            ut1Var = ut1Var4;
                        } else {
                            tt1[] tt1VarArr2 = ut1Var4.b;
                            ut1Var = tt1VarArr2.length == 0 ? ut1Var5 : new ut1((tt1[]) mc3.a((Object[]) ut1Var5.b, (Object[]) tt1VarArr2));
                        }
                        cw0Var6 = new cw0(cw0Var6.a, cw0Var6.b, cw0Var6.c, cw0Var6.d, cw0Var6.e, cw0Var6.g, cw0Var6.h, cw0Var6.j, cw0Var6.k, ut1Var);
                    } else {
                        ld0Var5.a(a3);
                    }
                }
                cw0Var6 = cw0Var;
            }
            int i20 = mc3.a;
            this.i = cw0Var6;
            if (e) {
                this.j = Math.max(cw0Var6.c, 6);
                this.f.a(this.i.a(this.a, this.h));
                this.g = 4;
                return 0;
            }
            i3 = i;
            r11 = 7;
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        ut1 a = new y21().a(ld0Var, w21.b);
        if (a != null) {
            int length = a.b.length;
        }
        byte[] bArr = new byte[4];
        ld0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    public static nq0[] a() {
        return new nq0[]{new uv0()};
    }
}
