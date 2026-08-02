package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import xsna.iun0;

/* loaded from: classes10.dex */
public final class jw1 implements nq0 {
    public static final u21 t = new iun0(11);
    public final bl0 f;
    public qq0 g;
    public q83 h;
    public q83 i;
    public int j;
    public ut1 k;
    public long m;
    public long n;
    public int o;
    public dy2 p;
    public boolean q;
    public boolean r;
    public long s;
    public final int a = 0;
    public final kc2 b = new kc2(10);
    public final pw1 c = new pw1();
    public final az0 d = new az0();
    public long l = C.TIME_UNSET;
    public final y21 e = new y21();

    public jw1(int i) {
        bl0 bl0Var = new bl0();
        this.f = bl0Var;
        this.i = bl0Var;
    }

    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.j = 0;
        this.l = C.TIME_UNSET;
        this.m = 0L;
        this.o = 0;
        this.s = j2;
        dy2 dy2Var = this.p;
        if (!(dy2Var instanceof m61) || ((m61) dy2Var).c(j2)) {
            return;
        }
        this.r = true;
        this.i = this.f;
    }

    public static long a(ut1 ut1Var) {
        if (ut1Var == null) {
            return C.TIME_UNSET;
        }
        int length = ut1Var.b.length;
        for (int i = 0; i < length; i++) {
            tt1 tt1Var = ut1Var.b[i];
            if (tt1Var instanceof c73) {
                c73 c73Var = (c73) tt1Var;
                if (c73Var.b.equals("TLEN")) {
                    return mc3.a(Long.parseLong(c73Var.d));
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.g = qq0Var;
        q83 a = qq0Var.a(0, 1);
        this.h = a;
        this.i = a;
        this.g.a();
    }

    public final boolean a(ld0 ld0Var) {
        dy2 dy2Var = this.p;
        if (dy2Var != null) {
            long a = dy2Var.a();
            if (a != -1 && ld0Var.d + ld0Var.f > a - 4) {
                return true;
            }
        }
        try {
            return !ld0Var.b(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r11 != 1231971951) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0367  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int b;
        sq3 sq3Var;
        dy2 dy2Var;
        int p;
        ut1 ut1Var;
        mu1 mu1Var;
        dy2 hzVar;
        long a;
        int m;
        if (this.h != null) {
            int i5 = mc3.a;
            if (this.j == 0) {
                try {
                    a((ld0) oq0Var, false);
                } catch (EOFException unused) {
                    j = 1000000;
                }
            }
            if (this.p == null) {
                kc2 kc2Var = new kc2(this.c.c);
                ld0 ld0Var = (ld0) oq0Var;
                ld0Var.b(kc2Var.a, 0, this.c.c, false);
                pw1 pw1Var = this.c;
                if ((pw1Var.a & 1) != 0) {
                    if (pw1Var.e != 1) {
                        i3 = 36;
                        j = 1000000;
                        if (kc2Var.c >= i3 + 4) {
                            kc2Var.e(i3);
                            i4 = kc2Var.b();
                            if (i4 != 1483304551) {
                            }
                            long j2 = 0;
                            long j3 = -1;
                            if (i4 != 1483304551 || i4 == 1231971951) {
                                long j4 = ld0Var.c;
                                long j5 = ld0Var.d;
                                pw1 pw1Var2 = this.c;
                                int i6 = pw1Var2.g;
                                int i7 = pw1Var2.d;
                                b = kc2Var.b();
                                if ((b & 1) == 1 || (p = kc2Var.p()) == 0) {
                                    sq3Var = null;
                                } else {
                                    long a2 = mc3.a(p, i6 * 1000000, i7);
                                    if ((b & 6) != 6) {
                                        sq3Var = new sq3(j5, pw1Var2.c, a2, -1L, null);
                                    } else {
                                        long n = kc2Var.n();
                                        long[] jArr = new long[100];
                                        for (int i8 = 0; i8 < 100; i8++) {
                                            jArr[i8] = kc2Var.m();
                                        }
                                        if (j4 != -1) {
                                            long j6 = j5 + n;
                                            if (j4 != j6) {
                                                StringBuilder b2 = xsna.fp.b(j4, "XING data size mismatch: ", ", ");
                                                b2.append(j6);
                                                ji1.d("XingSeeker", b2.toString());
                                            }
                                        }
                                        sq3Var = new sq3(j5, pw1Var2.c, a2, n, jArr);
                                    }
                                }
                                if (sq3Var != null) {
                                    az0 az0Var = this.d;
                                    if (az0Var.a == -1 || az0Var.b == -1) {
                                        ld0Var.f = 0;
                                        ld0Var.a(false, i3 + 141);
                                        ld0Var.b(this.b.a, 0, 3, false);
                                        this.b.e(0);
                                        az0 az0Var2 = this.d;
                                        int o = this.b.o();
                                        az0Var2.getClass();
                                        int i9 = o >> 12;
                                        int i10 = o & 4095;
                                        if (i9 > 0 || i10 > 0) {
                                            az0Var2.a = i9;
                                            az0Var2.b = i10;
                                        }
                                    }
                                }
                                ld0Var.a(this.c.c);
                                if (sq3Var == null && !sq3Var.b() && i4 == 1231971951) {
                                    ld0Var.b(this.b.a, 0, 4, false);
                                    this.b.e(0);
                                    this.c.a(this.b.b());
                                    dy2Var = new hz(ld0Var.c, ld0Var.d, this.c, false);
                                } else {
                                    dy2Var = sq3Var;
                                }
                            } else if (i4 == 1447187017) {
                                long j7 = ld0Var.c;
                                long j8 = ld0Var.d;
                                pw1 pw1Var3 = this.c;
                                kc2Var.e(kc2Var.b + 10);
                                int b3 = kc2Var.b();
                                if (b3 > 0) {
                                    int i11 = pw1Var3.d;
                                    int i12 = 2;
                                    long a3 = mc3.a(b3, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
                                    int r = kc2Var.r();
                                    int r2 = kc2Var.r();
                                    int r3 = kc2Var.r();
                                    kc2Var.e(kc2Var.b + 2);
                                    long j9 = j8 + pw1Var3.c;
                                    long[] jArr2 = new long[r];
                                    long[] jArr3 = new long[r];
                                    long j10 = j8;
                                    int i13 = 0;
                                    while (i13 < r) {
                                        long[] jArr4 = jArr2;
                                        long[] jArr5 = jArr3;
                                        jArr4[i13] = (i13 * a3) / r;
                                        jArr5[i13] = Math.max(j10, j9);
                                        if (r3 == 1) {
                                            m = kc2Var.m();
                                        } else if (r3 == i12) {
                                            m = kc2Var.r();
                                        } else if (r3 == 3) {
                                            m = kc2Var.o();
                                        } else if (r3 == 4) {
                                            m = kc2Var.p();
                                        }
                                        j10 += m * r2;
                                        i13++;
                                        r3 = r3;
                                        jArr2 = jArr4;
                                        jArr3 = jArr5;
                                        i12 = 2;
                                    }
                                    long[] jArr6 = jArr2;
                                    long[] jArr7 = jArr3;
                                    if (j7 != -1 && j7 != j10) {
                                        StringBuilder b4 = xsna.fp.b(j7, "VBRI data size mismatch: ", ", ");
                                        b4.append(j10);
                                        ji1.d("VbriSeeker", b4.toString());
                                    }
                                    dy2Var = new je3(jArr6, jArr7, a3, j10);
                                    ld0Var.a(this.c.c);
                                }
                                dy2Var = null;
                                ld0Var.a(this.c.c);
                            } else {
                                ld0Var.f = 0;
                                dy2Var = null;
                            }
                            ut1Var = this.k;
                            long j11 = ld0Var.d;
                            if (ut1Var != null) {
                                int length = ut1Var.b.length;
                                for (int i14 = 0; i14 < length; i14++) {
                                    tt1 tt1Var = ut1Var.b[i14];
                                    if (tt1Var instanceof lu1) {
                                        long a4 = a(ut1Var);
                                        int length2 = ((lu1) tt1Var).f.length;
                                        int i15 = length2 + 1;
                                        long[] jArr8 = new long[i15];
                                        long[] jArr9 = new long[i15];
                                        jArr8[0] = j11;
                                        jArr9[0] = 0;
                                        int i16 = 1;
                                        while (i16 <= length2) {
                                            int i17 = i16 - 1;
                                            j11 += r7.d + r7.f[i17];
                                            j2 += r7.e + r7.g[i17];
                                            jArr8[i16] = j11;
                                            jArr9[i16] = j2;
                                            i16++;
                                            length2 = length2;
                                        }
                                        mu1Var = new mu1(a4, jArr8, jArr9);
                                        if (this.q) {
                                            hzVar = new cy2();
                                        } else {
                                            if ((this.a & 4) != 0) {
                                                if (mu1Var != null) {
                                                    a = mu1Var.c;
                                                } else if (dy2Var != null) {
                                                    a = dy2Var.c();
                                                    j3 = dy2Var.a();
                                                } else {
                                                    a = a(this.k);
                                                }
                                                dy2Var = new m61(a, ld0Var.d, j3);
                                            } else if (mu1Var != null) {
                                                dy2Var = mu1Var;
                                            } else if (dy2Var == null) {
                                                dy2Var = null;
                                            }
                                            if (dy2Var == null || !(dy2Var.b() || (this.a & 1) == 0)) {
                                                boolean z = (this.a & 2) != 0;
                                                ld0Var.b(this.b.a, 0, 4, false);
                                                this.b.e(0);
                                                this.c.a(this.b.b());
                                                hzVar = new hz(ld0Var.c, ld0Var.d, this.c, z);
                                            } else {
                                                hzVar = dy2Var;
                                            }
                                        }
                                        this.p = hzVar;
                                        this.g.a(hzVar);
                                        q83 q83Var = this.i;
                                        mx0 mx0Var = new mx0();
                                        pw1 pw1Var4 = this.c;
                                        mx0Var.k = pw1Var4.b;
                                        mx0Var.l = 4096;
                                        mx0Var.x = pw1Var4.e;
                                        mx0Var.y = pw1Var4.d;
                                        az0 az0Var3 = this.d;
                                        mx0Var.A = az0Var3.a;
                                        mx0Var.B = az0Var3.b;
                                        mx0Var.i = (this.a & 8) != 0 ? null : this.k;
                                        q83Var.a(new nx0(mx0Var));
                                        this.n = ld0Var.d;
                                    }
                                }
                            }
                            mu1Var = null;
                            if (this.q) {
                            }
                            this.p = hzVar;
                            this.g.a(hzVar);
                            q83 q83Var2 = this.i;
                            mx0 mx0Var2 = new mx0();
                            pw1 pw1Var42 = this.c;
                            mx0Var2.k = pw1Var42.b;
                            mx0Var2.l = 4096;
                            mx0Var2.x = pw1Var42.e;
                            mx0Var2.y = pw1Var42.d;
                            az0 az0Var32 = this.d;
                            mx0Var2.A = az0Var32.a;
                            mx0Var2.B = az0Var32.b;
                            mx0Var2.i = (this.a & 8) != 0 ? null : this.k;
                            q83Var2.a(new nx0(mx0Var2));
                            this.n = ld0Var.d;
                        }
                        if (kc2Var.c >= 40) {
                            kc2Var.e(36);
                            if (kc2Var.b() == 1447187017) {
                                i4 = 1447187017;
                                long j22 = 0;
                                long j32 = -1;
                                if (i4 != 1483304551) {
                                }
                                long j42 = ld0Var.c;
                                long j52 = ld0Var.d;
                                pw1 pw1Var22 = this.c;
                                int i62 = pw1Var22.g;
                                int i72 = pw1Var22.d;
                                b = kc2Var.b();
                                if ((b & 1) == 1) {
                                }
                                sq3Var = null;
                                if (sq3Var != null) {
                                }
                                ld0Var.a(this.c.c);
                                if (sq3Var == null) {
                                }
                                dy2Var = sq3Var;
                                ut1Var = this.k;
                                long j112 = ld0Var.d;
                                if (ut1Var != null) {
                                }
                                mu1Var = null;
                                if (this.q) {
                                }
                                this.p = hzVar;
                                this.g.a(hzVar);
                                q83 q83Var22 = this.i;
                                mx0 mx0Var22 = new mx0();
                                pw1 pw1Var422 = this.c;
                                mx0Var22.k = pw1Var422.b;
                                mx0Var22.l = 4096;
                                mx0Var22.x = pw1Var422.e;
                                mx0Var22.y = pw1Var422.d;
                                az0 az0Var322 = this.d;
                                mx0Var22.A = az0Var322.a;
                                mx0Var22.B = az0Var322.b;
                                mx0Var22.i = (this.a & 8) != 0 ? null : this.k;
                                q83Var22.a(new nx0(mx0Var22));
                                this.n = ld0Var.d;
                            }
                        }
                        i4 = 0;
                        long j222 = 0;
                        long j322 = -1;
                        if (i4 != 1483304551) {
                        }
                        long j422 = ld0Var.c;
                        long j522 = ld0Var.d;
                        pw1 pw1Var222 = this.c;
                        int i622 = pw1Var222.g;
                        int i722 = pw1Var222.d;
                        b = kc2Var.b();
                        if ((b & 1) == 1) {
                        }
                        sq3Var = null;
                        if (sq3Var != null) {
                        }
                        ld0Var.a(this.c.c);
                        if (sq3Var == null) {
                        }
                        dy2Var = sq3Var;
                        ut1Var = this.k;
                        long j1122 = ld0Var.d;
                        if (ut1Var != null) {
                        }
                        mu1Var = null;
                        if (this.q) {
                        }
                        this.p = hzVar;
                        this.g.a(hzVar);
                        q83 q83Var222 = this.i;
                        mx0 mx0Var222 = new mx0();
                        pw1 pw1Var4222 = this.c;
                        mx0Var222.k = pw1Var4222.b;
                        mx0Var222.l = 4096;
                        mx0Var222.x = pw1Var4222.e;
                        mx0Var222.y = pw1Var4222.d;
                        az0 az0Var3222 = this.d;
                        mx0Var222.A = az0Var3222.a;
                        mx0Var222.B = az0Var3222.b;
                        mx0Var222.i = (this.a & 8) != 0 ? null : this.k;
                        q83Var222.a(new nx0(mx0Var222));
                        this.n = ld0Var.d;
                    }
                    i3 = 21;
                    j = 1000000;
                    if (kc2Var.c >= i3 + 4) {
                    }
                    if (kc2Var.c >= 40) {
                    }
                    i4 = 0;
                    long j2222 = 0;
                    long j3222 = -1;
                    if (i4 != 1483304551) {
                    }
                    long j4222 = ld0Var.c;
                    long j5222 = ld0Var.d;
                    pw1 pw1Var2222 = this.c;
                    int i6222 = pw1Var2222.g;
                    int i7222 = pw1Var2222.d;
                    b = kc2Var.b();
                    if ((b & 1) == 1) {
                    }
                    sq3Var = null;
                    if (sq3Var != null) {
                    }
                    ld0Var.a(this.c.c);
                    if (sq3Var == null) {
                    }
                    dy2Var = sq3Var;
                    ut1Var = this.k;
                    long j11222 = ld0Var.d;
                    if (ut1Var != null) {
                    }
                    mu1Var = null;
                    if (this.q) {
                    }
                    this.p = hzVar;
                    this.g.a(hzVar);
                    q83 q83Var2222 = this.i;
                    mx0 mx0Var2222 = new mx0();
                    pw1 pw1Var42222 = this.c;
                    mx0Var2222.k = pw1Var42222.b;
                    mx0Var2222.l = 4096;
                    mx0Var2222.x = pw1Var42222.e;
                    mx0Var2222.y = pw1Var42222.d;
                    az0 az0Var32222 = this.d;
                    mx0Var2222.A = az0Var32222.a;
                    mx0Var2222.B = az0Var32222.b;
                    mx0Var2222.i = (this.a & 8) != 0 ? null : this.k;
                    q83Var2222.a(new nx0(mx0Var2222));
                    this.n = ld0Var.d;
                } else {
                    if (pw1Var.e == 1) {
                        i3 = 13;
                        j = 1000000;
                        if (kc2Var.c >= i3 + 4) {
                        }
                        if (kc2Var.c >= 40) {
                        }
                        i4 = 0;
                        long j22222 = 0;
                        long j32222 = -1;
                        if (i4 != 1483304551) {
                        }
                        long j42222 = ld0Var.c;
                        long j52222 = ld0Var.d;
                        pw1 pw1Var22222 = this.c;
                        int i62222 = pw1Var22222.g;
                        int i72222 = pw1Var22222.d;
                        b = kc2Var.b();
                        if ((b & 1) == 1) {
                        }
                        sq3Var = null;
                        if (sq3Var != null) {
                        }
                        ld0Var.a(this.c.c);
                        if (sq3Var == null) {
                        }
                        dy2Var = sq3Var;
                        ut1Var = this.k;
                        long j112222 = ld0Var.d;
                        if (ut1Var != null) {
                        }
                        mu1Var = null;
                        if (this.q) {
                        }
                        this.p = hzVar;
                        this.g.a(hzVar);
                        q83 q83Var22222 = this.i;
                        mx0 mx0Var22222 = new mx0();
                        pw1 pw1Var422222 = this.c;
                        mx0Var22222.k = pw1Var422222.b;
                        mx0Var22222.l = 4096;
                        mx0Var22222.x = pw1Var422222.e;
                        mx0Var22222.y = pw1Var422222.d;
                        az0 az0Var322222 = this.d;
                        mx0Var22222.A = az0Var322222.a;
                        mx0Var22222.B = az0Var322222.b;
                        mx0Var22222.i = (this.a & 8) != 0 ? null : this.k;
                        q83Var22222.a(new nx0(mx0Var22222));
                        this.n = ld0Var.d;
                    }
                    i3 = 21;
                    j = 1000000;
                    if (kc2Var.c >= i3 + 4) {
                    }
                    if (kc2Var.c >= 40) {
                    }
                    i4 = 0;
                    long j222222 = 0;
                    long j322222 = -1;
                    if (i4 != 1483304551) {
                    }
                    long j422222 = ld0Var.c;
                    long j522222 = ld0Var.d;
                    pw1 pw1Var222222 = this.c;
                    int i622222 = pw1Var222222.g;
                    int i722222 = pw1Var222222.d;
                    b = kc2Var.b();
                    if ((b & 1) == 1) {
                    }
                    sq3Var = null;
                    if (sq3Var != null) {
                    }
                    ld0Var.a(this.c.c);
                    if (sq3Var == null) {
                    }
                    dy2Var = sq3Var;
                    ut1Var = this.k;
                    long j1122222 = ld0Var.d;
                    if (ut1Var != null) {
                    }
                    mu1Var = null;
                    if (this.q) {
                    }
                    this.p = hzVar;
                    this.g.a(hzVar);
                    q83 q83Var222222 = this.i;
                    mx0 mx0Var222222 = new mx0();
                    pw1 pw1Var4222222 = this.c;
                    mx0Var222222.k = pw1Var4222222.b;
                    mx0Var222222.l = 4096;
                    mx0Var222222.x = pw1Var4222222.e;
                    mx0Var222222.y = pw1Var4222222.d;
                    az0 az0Var3222222 = this.d;
                    mx0Var222222.A = az0Var3222222.a;
                    mx0Var222222.B = az0Var3222222.b;
                    mx0Var222222.i = (this.a & 8) != 0 ? null : this.k;
                    q83Var222222.a(new nx0(mx0Var222222));
                    this.n = ld0Var.d;
                }
                if (i2 == i) {
                    dy2 dy2Var2 = this.p;
                    if (dy2Var2 instanceof m61) {
                        long j12 = ((this.m * j) / this.c.d) + this.l;
                        if (dy2Var2.c() != j12) {
                            dy2 dy2Var3 = this.p;
                            ((m61) dy2Var3).d = j12;
                            this.g.a(dy2Var3);
                        }
                    }
                }
                return i2;
            }
            j = 1000000;
            long j13 = this.n;
            if (j13 != 0) {
                ld0 ld0Var2 = (ld0) oq0Var;
                long j14 = ld0Var2.d;
                if (j14 < j13) {
                    ld0Var2.a((int) (j13 - j14));
                }
            }
            if (this.o == 0) {
                ld0 ld0Var3 = (ld0) oq0Var;
                ld0Var3.f = 0;
                if (!a(ld0Var3)) {
                    this.b.e(0);
                    int b5 = this.b.b();
                    if (((-128000) & b5) == (this.j & (-128000)) && qw1.a(b5) != -1) {
                        this.c.a(b5);
                        if (this.l == C.TIME_UNSET) {
                            this.l = this.p.a(ld0Var3.d);
                        }
                        int i18 = this.c.c;
                        this.o = i18;
                        dy2 dy2Var4 = this.p;
                        if (dy2Var4 instanceof m61) {
                            m61 m61Var = (m61) dy2Var4;
                            long j15 = (((this.m + r3.g) * j) / r3.d) + this.l;
                            long j16 = ld0Var3.d + i18;
                            if (!m61Var.c(j15)) {
                                m61Var.b.a(j15);
                                m61Var.c.a(j16);
                            }
                            if (this.r && m61Var.c(this.s)) {
                                this.r = false;
                                this.i = this.h;
                            }
                        }
                    } else {
                        ld0Var3.a(1);
                        this.j = 0;
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                }
                i = -1;
                i2 = -1;
                if (i2 == i) {
                }
                return i2;
            }
            int a5 = this.i.a(oq0Var, this.o, true);
            if (a5 != -1) {
                int i19 = this.o - a5;
                this.o = i19;
                if (i19 <= 0) {
                    q83 q83Var3 = this.i;
                    long j17 = this.m;
                    q83Var3.a(this.l + ((j17 * j) / r6.d), 1, this.c.c, 0, null);
                    this.m += this.c.g;
                    this.o = 0;
                    i2 = 0;
                    i = -1;
                    if (i2 == i) {
                    }
                    return i2;
                }
                i = -1;
                i2 = 0;
                if (i2 == i) {
                }
                return i2;
            }
            i = -1;
            i2 = -1;
            if (i2 == i) {
            }
            return i2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return a((ld0) oq0Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        r18.a(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r17.j = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        r18.f = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ld0 ld0Var, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = z ? 32768 : 131072;
        ld0Var.f = 0;
        if (ld0Var.d == 0) {
            ut1 a2 = this.e.a(ld0Var, (this.a & 8) == 0 ? null : t);
            this.k = a2;
            if (a2 != null) {
                this.d.a(a2);
            }
            i = (int) (ld0Var.d + ld0Var.f);
            if (!z) {
                ld0Var.a(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!a(ld0Var)) {
                this.b.e(0);
                int b = this.b.b();
                if ((i2 == 0 || ((-128000) & b) == (i2 & (-128000))) && (a = qw1.a(b)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(b);
                        i2 = b;
                    }
                    ld0Var.a(false, a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw new pc2("Searched too many bytes.", null, true, 1);
                    }
                    if (z) {
                        ld0Var.f = 0;
                        ld0Var.a(false, i + i6);
                    } else {
                        ld0Var.a(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
    }

    public static nq0[] a() {
        return new nq0[]{new jw1(0)};
    }
}
