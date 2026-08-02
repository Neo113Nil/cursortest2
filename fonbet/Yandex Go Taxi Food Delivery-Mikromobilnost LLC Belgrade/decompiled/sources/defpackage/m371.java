package defpackage;

import java.util.Arrays;
import java.util.Collections;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes7.dex */
public final class m371 implements gz71 {
    public static final byte[] v = {73, 68, Alerts.alert_decrypt_error};
    public final boolean a;
    public final uh81 b;
    public final dl81 c;
    public final String d;
    public String e;
    public fb81 f;
    public fb81 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public fb81 t;
    public long u;

    public m371(String str, boolean z) {
        uh81 uh81Var = new uh81();
        uh81Var.a = new byte[7];
        uh81Var.d = 7;
        this.b = uh81Var;
        this.c = new dl81(Arrays.copyOf(v, 10));
        this.h = 0;
        this.i = 0;
        this.j = 256;
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.e = xi11Var.e;
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 1);
        this.f = l;
        this.t = l;
        if (!this.a) {
            this.g = new np81();
            return;
        }
        xi11Var.a();
        xi11Var.b();
        fb81 l2 = yg71Var.l(xi11Var.d, 5);
        this.g = l2;
        da81 da81Var = new da81();
        xi11Var.b();
        da81Var.a = xi11Var.e;
        da81Var.k = "application/id3";
        l2.k(new qd81(da81Var));
    }

    @Override // defpackage.gz71
    public final void b() {
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // defpackage.gz71
    public final void f(dl81 dl81Var) {
        int i;
        byte b;
        int i2;
        int i3;
        char c;
        int i4;
        char c2;
        char c3;
        int i5;
        int i6;
        this.f.getClass();
        int i7 = rf71.a;
        while (true) {
            int i8 = dl81Var.c;
            int i9 = dl81Var.b;
            int i10 = i8 - i9;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.h;
            char c4 = 65535;
            dl81 dl81Var2 = this.c;
            int i12 = 3;
            int i13 = 1;
            uh81 uh81Var = this.b;
            int i14 = 7;
            int i15 = 0;
            if (i11 == 0) {
                byte[] bArr = dl81Var.a;
                while (true) {
                    if (i9 >= i8) {
                        dl81Var.m(i9);
                        break;
                    }
                    i = i9 + 1;
                    b = bArr[i9];
                    i2 = i12;
                    int i16 = b & 255;
                    if (this.j != 512 || (((((byte) i16) & 255) | 65280) & 65526) != 65520) {
                        i3 = i13;
                        c = c4;
                    } else {
                        if (this.l) {
                            break;
                        }
                        int i17 = i9 - 1;
                        dl81Var.m(i9);
                        byte[] bArr2 = uh81Var.a;
                        if (dl81Var.c - dl81Var.b >= i13) {
                            dl81Var.d(i15, i13, bArr2);
                            uh81Var.f(4);
                            int a = uh81Var.a(i13);
                            int i18 = this.m;
                            if (i18 == -1 || a == i18) {
                                if (this.n != -1) {
                                    byte[] bArr3 = uh81Var.a;
                                    if (dl81Var.c - dl81Var.b < i13) {
                                        break;
                                    }
                                    dl81Var.d(0, i13, bArr3);
                                    uh81Var.f(2);
                                    i6 = 4;
                                    if (uh81Var.a(4) == this.n) {
                                        dl81Var.m(i);
                                    }
                                } else {
                                    i6 = 4;
                                }
                                byte[] bArr4 = uh81Var.a;
                                if (dl81Var.c - dl81Var.b < i6) {
                                    break;
                                }
                                dl81Var.d(0, i6, bArr4);
                                uh81Var.f(14);
                                int a2 = uh81Var.a(13);
                                if (a2 < i14) {
                                    i3 = 1;
                                    c = 65535;
                                } else {
                                    byte[] bArr5 = dl81Var.a;
                                    int i19 = dl81Var.c;
                                    int i20 = i17 + a2;
                                    if (i20 >= i19) {
                                        break;
                                    }
                                    byte b2 = bArr5[i20];
                                    c = 65535;
                                    if (b2 == -1) {
                                        int i21 = i20 + 1;
                                        if (i21 == i19) {
                                            break;
                                        }
                                        byte b3 = bArr5[i21];
                                        if ((((b3 & 255) | 65280) & 65526) == 65520 && ((b3 & 8) >> 3) == a) {
                                            break;
                                        }
                                        i3 = 1;
                                    } else {
                                        if (b2 == 73) {
                                            int i22 = i20 + 1;
                                            if (i22 != i19) {
                                                if (bArr5[i22] == 68) {
                                                    int i23 = i20 + 2;
                                                    if (i23 != i19) {
                                                        if (bArr5[i23] == 51) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        i3 = 1;
                                    }
                                }
                            } else {
                                i3 = i13;
                                c = 65535;
                            }
                        }
                        i3 = i13;
                        c = 65535;
                    }
                    int i24 = this.j;
                    int i25 = i24 | i16;
                    if (i25 == 329) {
                        i4 = 3;
                        c2 = 256;
                        c3 = 2;
                        i5 = 0;
                        this.j = 768;
                    } else if (i25 == 511) {
                        i4 = 3;
                        c2 = 256;
                        c3 = 2;
                        i5 = 0;
                        this.j = 512;
                    } else if (i25 == 836) {
                        i4 = 3;
                        c2 = 256;
                        c3 = 2;
                        i5 = 0;
                        this.j = 1024;
                    } else {
                        if (i25 == 1075) {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            dl81Var2.m(0);
                            dl81Var.m(i);
                            break;
                        }
                        c2 = 256;
                        if (i24 != 256) {
                            this.j = 256;
                            c4 = c;
                            i15 = 0;
                            i12 = 3;
                            i14 = 7;
                            i13 = i3;
                        } else {
                            i4 = 3;
                            c3 = 2;
                            i5 = 0;
                        }
                    }
                    i15 = i5;
                    i9 = i;
                    i12 = i4;
                    c4 = c;
                    i14 = 7;
                    i13 = i3;
                }
                this.o = (b & 8) >> 3;
                this.k = (b & 1) == 0;
                if (this.l) {
                    this.h = i2;
                    this.i = 0;
                } else {
                    this.h = 1;
                    this.i = 0;
                }
                dl81Var.m(i);
            } else if (i11 != 1) {
                if (i11 == 2) {
                    byte[] bArr6 = dl81Var2.a;
                    int min = Math.min(i10, 10 - this.i);
                    dl81Var.d(this.i, min, bArr6);
                    int i26 = this.i + min;
                    this.i = i26;
                    if (i26 == 10) {
                        this.g.a(10, dl81Var2);
                        dl81Var2.m(6);
                        fb81 fb81Var = this.g;
                        int r = dl81Var2.r() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = fb81Var;
                        this.u = 0L;
                        this.r = r;
                    }
                } else if (i11 == 3) {
                    int i27 = this.k ? 7 : 5;
                    byte[] bArr7 = uh81Var.a;
                    int min2 = Math.min(i10, i27 - this.i);
                    dl81Var.d(this.i, min2, bArr7);
                    int i28 = this.i + min2;
                    this.i = i28;
                    if (i28 == i27) {
                        uh81Var.f(0);
                        if (this.p) {
                            uh81Var.h(10);
                        } else {
                            int a3 = uh81Var.a(2) + 1;
                            if (a3 != 2) {
                                nba1.e();
                                a3 = 2;
                            }
                            uh81Var.h(5);
                            int a4 = uh81Var.a(3);
                            int i29 = this.n;
                            byte[] bArr8 = {(byte) (((a3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((a4 << 3) & 120) | ((i29 << 7) & 128))};
                            uh81 uh81Var2 = new uh81();
                            uh81Var2.a = bArr8;
                            uh81Var2.d = 2;
                            a4 a5 = vaa1.a(uh81Var2, false);
                            da81 da81Var = new da81();
                            da81Var.a = this.e;
                            da81Var.k = "audio/mp4a-latm";
                            da81Var.h = a5.a;
                            da81Var.x = a5.c;
                            da81Var.y = a5.b;
                            da81Var.m = Collections.singletonList(bArr8);
                            da81Var.c = this.d;
                            qd81 qd81Var = new qd81(da81Var);
                            this.q = 1024000000 / qd81Var.S;
                            this.f.k(qd81Var);
                            this.p = true;
                        }
                        uh81Var.h(4);
                        int a6 = uh81Var.a(13);
                        int i30 = a6 - 7;
                        if (this.k) {
                            i30 = a6 - 9;
                        }
                        fb81 fb81Var2 = this.f;
                        long j = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = fb81Var2;
                        this.u = j;
                        this.r = i30;
                    }
                } else {
                    if (i11 != 4) {
                        ny61.k();
                        return;
                    }
                    int min3 = Math.min(i10, this.r - this.i);
                    this.t.a(min3, dl81Var);
                    int i31 = this.i + min3;
                    this.i = i31;
                    int i32 = this.r;
                    if (i31 == i32) {
                        long j2 = this.s;
                        if (j2 != -9223372036854775807L) {
                            this.t.b(j2, 1, i32, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (i10 != 0) {
                uh81Var.a[0] = dl81Var.a[i9];
                uh81Var.f(2);
                int a7 = uh81Var.a(4);
                int i33 = this.n;
                if (i33 == -1 || a7 == i33) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = a7;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }
}
