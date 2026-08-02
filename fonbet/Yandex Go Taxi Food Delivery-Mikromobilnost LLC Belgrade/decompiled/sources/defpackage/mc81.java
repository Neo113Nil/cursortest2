package defpackage;

import java.util.Arrays;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes7.dex */
public final class mc81 implements gz71 {
    public final String b;
    public String c;
    public fb81 d;
    public int f;
    public int g;
    public long h;
    public qd81 i;
    public int j;
    public final dl81 a = new dl81(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public mc81(String str) {
        this.b = str;
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.c = xi11Var.e;
        xi11Var.b();
        this.d = yg71Var.l(xi11Var.d, 1);
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027d  */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dl81 dl81Var) {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        int i5;
        byte b2;
        int i6;
        byte b3;
        int i7;
        uh81 uh81Var;
        byte[] bArr;
        if (this.d == null) {
            ny61.k();
            return;
        }
        while (true) {
            int i8 = dl81Var.c - dl81Var.b;
            if (i8 <= 0) {
                return;
            }
            int i9 = this.e;
            int i10 = 8;
            dl81 dl81Var2 = this.a;
            int i11 = 2;
            if (i9 == 0) {
                while (dl81Var.c - dl81Var.b > 0) {
                    int i12 = this.g << 8;
                    this.g = i12;
                    int s = i12 | dl81Var.s();
                    this.g = s;
                    if (s == 2147385345 || s == -25230976 || s == 536864768 || s == -14745368) {
                        byte[] bArr2 = dl81Var2.a;
                        bArr2[0] = (byte) ((s >> 24) & 255);
                        bArr2[1] = (byte) ((s >> 16) & 255);
                        bArr2[2] = (byte) ((s >> 8) & 255);
                        bArr2[3] = (byte) (s & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i9 == 1) {
                byte[] bArr3 = dl81Var2.a;
                int min = Math.min(i8, 18 - this.f);
                dl81Var.d(this.f, min, bArr3);
                int i13 = this.f + min;
                this.f = i13;
                if (i13 == 18) {
                    byte[] bArr4 = dl81Var2.a;
                    if (this.i == null) {
                        String str = this.c;
                        if (bArr4[0] == Byte.MAX_VALUE) {
                            int length = bArr4.length;
                            uh81Var = new uh81();
                            uh81Var.a = bArr4;
                            uh81Var.d = length;
                            i = 8;
                            i7 = 2;
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length);
                            byte b4 = copyOf[0];
                            if (b4 == -2 || b4 == -1) {
                                for (int i14 = 0; i14 < copyOf.length - 1; i14 += 2) {
                                    byte b5 = copyOf[i14];
                                    int i15 = i14 + 1;
                                    copyOf[i14] = copyOf[i15];
                                    copyOf[i15] = b5;
                                }
                            }
                            int length2 = copyOf.length;
                            uh81 uh81Var2 = new uh81();
                            uh81Var2.a = copyOf;
                            uh81Var2.d = length2;
                            if (copyOf[0] == 31) {
                                int length3 = copyOf.length;
                                uh81 uh81Var3 = new uh81();
                                uh81Var3.a = copyOf;
                                uh81Var3.d = length3;
                                while (uh81Var3.e() >= 16) {
                                    uh81Var3.h(i11);
                                    int a = uh81Var3.a(14) & 16383;
                                    int min2 = Math.min(8 - uh81Var2.c, 14);
                                    int i16 = i11;
                                    int i17 = uh81Var2.c;
                                    int i18 = (8 - i17) - min2;
                                    byte[] bArr5 = uh81Var2.a;
                                    int i19 = uh81Var2.b;
                                    byte b6 = (byte) (bArr5[i19] & ((65280 >> i17) | ((1 << i18) - 1)));
                                    bArr5[i19] = b6;
                                    int i20 = 14 - min2;
                                    bArr5[i19] = (byte) (b6 | ((a >>> i20) << i18));
                                    int i21 = i19 + 1;
                                    while (true) {
                                        bArr = uh81Var2.a;
                                        if (i20 > i10) {
                                            bArr[i21] = (byte) (a >>> (i20 - 8));
                                            i20 -= 8;
                                            i21++;
                                            i10 = i10;
                                        }
                                    }
                                    int i22 = i10;
                                    byte b7 = (byte) (bArr[i21] & ((1 << r4) - 1));
                                    bArr[i21] = b7;
                                    bArr[i21] = (byte) (((a & ((1 << i20) - 1)) << (8 - i20)) | b7);
                                    uh81Var2.h(14);
                                    uh81Var2.c();
                                    i11 = i16;
                                    i10 = i22;
                                }
                            }
                            i = i10;
                            i7 = i11;
                            int length4 = copyOf.length;
                            uh81Var2.a = copyOf;
                            uh81Var2.b = 0;
                            uh81Var2.c = 0;
                            uh81Var2.d = length4;
                            uh81Var = uh81Var2;
                        }
                        uh81Var.h(60);
                        int i23 = cea1.a[uh81Var.a(6)];
                        int i24 = cea1.b[uh81Var.a(4)];
                        int a2 = uh81Var.a(5);
                        int i25 = a2 >= 29 ? -1 : (cea1.c[a2] * 1000) / 2;
                        uh81Var.h(10);
                        int i26 = i23 + (uh81Var.a(i7) > 0 ? 1 : 0);
                        da81 da81Var = new da81();
                        da81Var.a = str;
                        da81Var.k = "audio/vnd.dts";
                        da81Var.f = i25;
                        da81Var.x = i26;
                        da81Var.y = i24;
                        da81Var.n = null;
                        da81Var.c = this.b;
                        qd81 qd81Var = new qd81(da81Var);
                        this.i = qd81Var;
                        this.d.k(qd81Var);
                    } else {
                        i = 8;
                    }
                    byte b8 = bArr4[0];
                    if (b8 != -2) {
                        if (b8 == -1) {
                            i6 = ((bArr4[7] & 3) << 12) | ((bArr4[6] & 255) << 4);
                            b3 = bArr4[9];
                        } else if (b8 != 31) {
                            i2 = ((bArr4[5] & 3) << 12) | ((bArr4[6] & 255) << 4);
                            b = bArr4[7];
                        } else {
                            i6 = ((bArr4[6] & 3) << 12) | ((bArr4[7] & 255) << 4);
                            b3 = bArr4[i];
                        }
                        i3 = (i6 | ((b3 & Alerts.alert_export_restriction) >> 2)) + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.j = i3;
                        if (b8 == -2) {
                            if (b8 == -1) {
                                i4 = (bArr4[4] & 7) << 4;
                                b2 = bArr4[7];
                            } else if (b8 != 31) {
                                i4 = (bArr4[4] & 1) << 6;
                                i5 = bArr4[5] & 252;
                            } else {
                                i4 = (bArr4[5] & 7) << 4;
                                b2 = bArr4[6];
                            }
                            i5 = b2 & Alerts.alert_export_restriction;
                        } else {
                            i4 = (bArr4[5] & 1) << 6;
                            i5 = bArr4[4] & 252;
                        }
                        this.h = (int) ((((((i5 >> 2) | i4) + 1) * 32) * 1000000) / this.i.S);
                        dl81Var2.m(0);
                        this.d.a(18, dl81Var2);
                        this.e = 2;
                    } else {
                        i2 = ((bArr4[4] & 3) << 12) | ((bArr4[7] & 255) << 4);
                        b = bArr4[6];
                    }
                    i3 = (i2 | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.j = i3;
                    if (b8 == -2) {
                    }
                    this.h = (int) ((((((i5 >> 2) | i4) + 1) * 32) * 1000000) / this.i.S);
                    dl81Var2.m(0);
                    this.d.a(18, dl81Var2);
                    this.e = 2;
                }
            } else {
                if (i9 != 2) {
                    ny61.k();
                    return;
                }
                int min3 = Math.min(i8, this.j - this.f);
                this.d.a(min3, dl81Var);
                int i27 = this.f + min3;
                this.f = i27;
                int i28 = this.j;
                if (i27 == i28) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.d.b(j, 1, i28, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
}
