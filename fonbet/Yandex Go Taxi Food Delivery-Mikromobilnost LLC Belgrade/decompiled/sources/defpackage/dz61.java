package defpackage;

import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes7.dex */
public final class dz61 implements gz71 {
    public final /* synthetic */ int a;
    public final uh81 b;
    public final dl81 c;
    public final String d;
    public String e;
    public fb81 f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public qd81 k;
    public int l;
    public long m;

    public dz61(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                byte[] bArr = new byte[16];
                uh81 uh81Var = new uh81();
                uh81Var.a = bArr;
                uh81Var.d = 16;
                this.b = uh81Var;
                this.c = new dl81(bArr);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                uh81 uh81Var2 = new uh81();
                uh81Var2.a = bArr2;
                uh81Var2.d = 128;
                this.b = uh81Var2;
                this.c = new dl81(bArr2);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        switch (this.a) {
            case 0:
                xi11Var.a();
                xi11Var.b();
                this.e = xi11Var.e;
                xi11Var.b();
                this.f = yg71Var.l(xi11Var.d, 1);
                break;
            default:
                xi11Var.a();
                xi11Var.b();
                this.e = xi11Var.e;
                xi11Var.b();
                this.f = yg71Var.l(xi11Var.d, 1);
                break;
        }
    }

    @Override // defpackage.gz71
    public final void b() {
        int i = this.a;
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x032e  */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dl81 dl81Var) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.a;
        String str2 = this.d;
        long j = -9223372036854775807L;
        int i17 = 0;
        int i18 = 1;
        int i19 = 2;
        dl81 dl81Var2 = this.c;
        int i20 = 16;
        uh81 uh81Var = this.b;
        switch (i16) {
            case 0:
                if (this.f == null) {
                    ny61.k();
                    break;
                } else {
                    while (true) {
                        int i21 = dl81Var.c - dl81Var.b;
                        if (i21 <= 0) {
                            break;
                        } else {
                            int i22 = this.g;
                            if (i22 == 0) {
                                while (dl81Var.c - dl81Var.b > 0) {
                                    if (this.i) {
                                        int s = dl81Var.s();
                                        if (s == 119) {
                                            this.i = false;
                                            this.g = 1;
                                            byte[] bArr = dl81Var2.a;
                                            bArr[0] = PKIBody._KRP;
                                            bArr[1] = 119;
                                            this.h = 2;
                                            i18 = 1;
                                            i19 = 2;
                                            i20 = 16;
                                            i17 = 0;
                                            j = -9223372036854775807L;
                                        } else {
                                            this.i = s == 11;
                                        }
                                    } else {
                                        this.i = dl81Var.s() == 11;
                                    }
                                }
                                j = -9223372036854775807L;
                                i17 = 0;
                                i18 = 1;
                                i19 = 2;
                                i20 = 16;
                            } else if (i22 == i18) {
                                byte[] bArr2 = dl81Var2.a;
                                int min = Math.min(i21, 128 - this.h);
                                dl81Var.d(this.h, min, bArr2);
                                int i23 = this.h + min;
                                this.h = i23;
                                if (i23 == 128) {
                                    uh81Var.f(i17);
                                    int i24 = uh81Var.i();
                                    uh81Var.h(40);
                                    int i25 = uh81Var.a(5) > 10 ? i18 : i17;
                                    uh81Var.f(i24);
                                    int[] iArr = aba1.d;
                                    int[] iArr2 = aba1.b;
                                    if (i25 != 0) {
                                        uh81Var.h(i20);
                                        int a = uh81Var.a(i19);
                                        int i26 = a != 0 ? a != i18 ? a != i19 ? -1 : i19 : i18 : 0;
                                        uh81Var.h(3);
                                        i4 = (uh81Var.a(11) + i18) * i19;
                                        int a2 = uh81Var.a(i19);
                                        if (a2 == 3) {
                                            i5 = aba1.c[uh81Var.a(i19)];
                                            i6 = 3;
                                            i7 = 6;
                                        } else {
                                            int a3 = uh81Var.a(i19);
                                            int i27 = aba1.a[a3];
                                            i5 = iArr2[a2];
                                            i6 = a3;
                                            i7 = i27;
                                        }
                                        i3 = i7 * 256;
                                        int a4 = uh81Var.a(3);
                                        boolean k = uh81Var.k();
                                        i2 = iArr[a4] + (k ? 1 : 0);
                                        uh81Var.h(10);
                                        if (uh81Var.k()) {
                                            uh81Var.h(8);
                                        }
                                        if (a4 == 0) {
                                            uh81Var.h(5);
                                            if (uh81Var.k()) {
                                                uh81Var.h(8);
                                            }
                                        }
                                        if (i26 == 1 && uh81Var.k()) {
                                            uh81Var.h(16);
                                        }
                                        if (uh81Var.k()) {
                                            if (a4 > 2) {
                                                uh81Var.h(2);
                                            }
                                            if ((a4 & 1) == 0 || a4 <= 2) {
                                                i12 = 6;
                                            } else {
                                                i12 = 6;
                                                uh81Var.h(6);
                                            }
                                            if ((a4 & 4) != 0) {
                                                uh81Var.h(i12);
                                            }
                                            if (k && uh81Var.k()) {
                                                uh81Var.h(5);
                                            }
                                            if (i26 == 0) {
                                                if (uh81Var.k()) {
                                                    i13 = 6;
                                                    uh81Var.h(6);
                                                } else {
                                                    i13 = 6;
                                                }
                                                if (a4 == 0 && uh81Var.k()) {
                                                    uh81Var.h(i13);
                                                }
                                                if (uh81Var.k()) {
                                                    uh81Var.h(i13);
                                                }
                                                int i28 = 2;
                                                int a5 = uh81Var.a(2);
                                                if (a5 == 1) {
                                                    uh81Var.h(5);
                                                } else {
                                                    if (a5 == 2) {
                                                        uh81Var.h(12);
                                                    } else if (a5 == 3) {
                                                        int a6 = uh81Var.a(5);
                                                        if (uh81Var.k()) {
                                                            uh81Var.h(5);
                                                            if (uh81Var.k()) {
                                                                i15 = 4;
                                                                uh81Var.h(4);
                                                            } else {
                                                                i15 = 4;
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(i15);
                                                            }
                                                            if (uh81Var.k()) {
                                                                if (uh81Var.k()) {
                                                                    uh81Var.h(i15);
                                                                }
                                                                if (uh81Var.k()) {
                                                                    uh81Var.h(i15);
                                                                }
                                                            }
                                                        }
                                                        if (uh81Var.k()) {
                                                            uh81Var.h(5);
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(7);
                                                                if (uh81Var.k()) {
                                                                    i14 = 8;
                                                                    uh81Var.h(8);
                                                                    uh81Var.h((a6 + 2) * i14);
                                                                    if (uh81Var.c != 0) {
                                                                        uh81Var.c = 0;
                                                                        uh81Var.b++;
                                                                        uh81Var.c();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i14 = 8;
                                                        uh81Var.h((a6 + 2) * i14);
                                                        if (uh81Var.c != 0) {
                                                        }
                                                    }
                                                    i28 = 2;
                                                }
                                                if (a4 < i28) {
                                                    if (uh81Var.k()) {
                                                        uh81Var.h(14);
                                                    }
                                                    if (a4 == 0 && uh81Var.k()) {
                                                        uh81Var.h(14);
                                                    }
                                                }
                                                if (uh81Var.k()) {
                                                    i8 = i6;
                                                    if (i8 == 0) {
                                                        uh81Var.h(5);
                                                    } else {
                                                        for (int i29 = 0; i29 < i7; i29++) {
                                                            if (uh81Var.k()) {
                                                                uh81Var.h(5);
                                                            }
                                                        }
                                                    }
                                                    if (uh81Var.k()) {
                                                        i9 = 3;
                                                    } else {
                                                        uh81Var.h(5);
                                                        if (a4 == 2) {
                                                            uh81Var.h(4);
                                                        }
                                                        if (a4 >= 6) {
                                                            uh81Var.h(2);
                                                        }
                                                        if (uh81Var.k()) {
                                                            i11 = 8;
                                                            uh81Var.h(8);
                                                        } else {
                                                            i11 = 8;
                                                        }
                                                        if (a4 == 0 && uh81Var.k()) {
                                                            uh81Var.h(i11);
                                                        }
                                                        i9 = 3;
                                                        if (a2 < 3) {
                                                            uh81Var.l();
                                                        }
                                                    }
                                                    if (i26 == 0 && i8 != i9) {
                                                        uh81Var.l();
                                                    }
                                                    if (i26 == 2 || !(i8 == i9 || uh81Var.k())) {
                                                        i10 = 6;
                                                    } else {
                                                        i10 = 6;
                                                        uh81Var.h(6);
                                                    }
                                                    str = (!uh81Var.k() && uh81Var.a(i10) == 1 && uh81Var.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                }
                                            }
                                        }
                                        i8 = i6;
                                        if (uh81Var.k()) {
                                        }
                                        if (i26 == 0) {
                                            uh81Var.l();
                                        }
                                        if (i26 == 2) {
                                        }
                                        i10 = 6;
                                        if (!uh81Var.k()) {
                                        }
                                    } else {
                                        uh81Var.h(32);
                                        int a7 = uh81Var.a(2);
                                        String str3 = a7 == 3 ? null : "audio/ac3";
                                        int a8 = aba1.a(a7, uh81Var.a(6));
                                        uh81Var.h(8);
                                        int a9 = uh81Var.a(3);
                                        if ((a9 & 1) == 0 || a9 == 1) {
                                            i = 2;
                                        } else {
                                            i = 2;
                                            uh81Var.h(2);
                                        }
                                        if ((a9 & 4) != 0) {
                                            uh81Var.h(i);
                                        }
                                        if (a9 == i) {
                                            uh81Var.h(i);
                                        }
                                        int i30 = a7 < 3 ? iArr2[a7] : -1;
                                        i2 = iArr[a9] + (uh81Var.k() ? 1 : 0);
                                        i3 = HProv.ALG_TYPE_BLOCK;
                                        str = str3;
                                        i4 = a8;
                                        i5 = i30;
                                    }
                                    qd81 qd81Var = this.k;
                                    if (qd81Var == null || i2 != qd81Var.R || i5 != qd81Var.S || !rf71.o(str, qd81Var.E)) {
                                        da81 da81Var = new da81();
                                        da81Var.a = this.e;
                                        da81Var.k = str;
                                        da81Var.x = i2;
                                        da81Var.y = i5;
                                        da81Var.c = str2;
                                        qd81 qd81Var2 = new qd81(da81Var);
                                        this.k = qd81Var2;
                                        this.f.k(qd81Var2);
                                    }
                                    this.l = i4;
                                    this.j = (i3 * 1000000) / this.k.S;
                                    dl81Var2.m(0);
                                    this.f.a(128, dl81Var2);
                                    this.g = 2;
                                    i19 = 2;
                                    j = -9223372036854775807L;
                                    i17 = 0;
                                    i18 = 1;
                                    i20 = 16;
                                }
                            } else if (i22 == i19) {
                                int min2 = Math.min(i21, this.l - this.h);
                                this.f.a(min2, dl81Var);
                                int i31 = this.h + min2;
                                this.h = i31;
                                int i32 = this.l;
                                if (i31 == i32) {
                                    long j2 = this.m;
                                    if (j2 != j) {
                                        this.f.b(j2, 1, i32, 0, null);
                                        this.m += this.j;
                                    }
                                    this.g = i17;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (this.f == null) {
                    ny61.k();
                    break;
                } else {
                    while (true) {
                        int i33 = dl81Var.c - dl81Var.b;
                        if (i33 <= 0) {
                            break;
                        } else {
                            int i34 = this.g;
                            if (i34 == 0) {
                                while (dl81Var.c - dl81Var.b > 0) {
                                    if (this.i) {
                                        int s2 = dl81Var.s();
                                        this.i = s2 == 172;
                                        if (s2 == 64 || s2 == 65) {
                                            Object[] objArr = s2 == 65;
                                            this.g = 1;
                                            byte[] bArr3 = dl81Var2.a;
                                            bArr3[0] = -84;
                                            bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                            this.h = 2;
                                        }
                                    } else {
                                        this.i = dl81Var.s() == 172;
                                    }
                                }
                            } else if (i34 == 1) {
                                byte[] bArr4 = dl81Var2.a;
                                int min3 = Math.min(i33, 16 - this.h);
                                dl81Var.d(this.h, min3, bArr4);
                                int i35 = this.h + min3;
                                this.h = i35;
                                if (i35 == 16) {
                                    uh81Var.f(0);
                                    kb a10 = xca1.a(uh81Var);
                                    int i36 = a10.a;
                                    qd81 qd81Var3 = this.k;
                                    if (qd81Var3 == null || 2 != qd81Var3.R || i36 != qd81Var3.S || !"audio/ac4".equals(qd81Var3.E)) {
                                        da81 da81Var2 = new da81();
                                        da81Var2.a = this.e;
                                        da81Var2.k = "audio/ac4";
                                        da81Var2.x = 2;
                                        da81Var2.y = i36;
                                        da81Var2.c = str2;
                                        qd81 qd81Var4 = new qd81(da81Var2);
                                        this.k = qd81Var4;
                                        this.f.k(qd81Var4);
                                    }
                                    this.l = a10.b;
                                    this.j = (a10.c * 1000000) / this.k.S;
                                    dl81Var2.m(0);
                                    this.f.a(16, dl81Var2);
                                    this.g = 2;
                                }
                            } else if (i34 == 2) {
                                int min4 = Math.min(i33, this.l - this.h);
                                this.f.a(min4, dl81Var);
                                int i37 = this.h + min4;
                                this.h = i37;
                                int i38 = this.l;
                                if (i37 == i38) {
                                    long j3 = this.m;
                                    if (j3 != -9223372036854775807L) {
                                        this.f.b(j3, 1, i38, 0, null);
                                        this.m += this.j;
                                    }
                                    this.g = 0;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }
}
