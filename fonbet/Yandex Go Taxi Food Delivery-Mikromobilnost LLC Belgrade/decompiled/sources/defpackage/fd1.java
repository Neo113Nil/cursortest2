package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import java.util.Collections;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class fd1 implements tqn {
    public static final byte[] x = {73, 68, Alerts.alert_decrypt_error};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public g001 h;
    public g001 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public g001 v;
    public long w;
    public final df90 b = new df90(new byte[7], 7);
    public final ef90 c = new ef90(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public fd1(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // defpackage.tqn
    public final void b(ef90 ef90Var) {
        int i;
        int i2;
        byte b;
        char c;
        ?? r4;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        this.h.getClass();
        int i6 = tw21.a;
        while (ef90Var.a() > 0) {
            int i7 = this.j;
            char c4 = 65535;
            ef90 ef90Var2 = this.c;
            int i8 = 3;
            df90 df90Var = this.b;
            int i9 = 4;
            int i10 = 0;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = ef90Var.a;
                int i12 = ef90Var.b;
                int i13 = ef90Var.c;
                while (true) {
                    if (i12 >= i13) {
                        ef90Var.K(i12);
                        break;
                    }
                    i = i12 + 1;
                    i2 = i8;
                    b = bArr[i12];
                    int i14 = b & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i14) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i11;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i15 = i12 - 1;
                        ef90Var.K(i12);
                        byte[] bArr2 = df90Var.a;
                        if (ef90Var.a() >= i11) {
                            ef90Var.i(i10, i11, bArr2);
                            df90Var.m(i9);
                            int g = df90Var.g(i11);
                            int i16 = this.o;
                            if (i16 == -1 || g == i16) {
                                if (this.p != -1) {
                                    byte[] bArr3 = df90Var.a;
                                    if (ef90Var.a() < i11) {
                                        break;
                                    }
                                    ef90Var.i(i10, i11, bArr3);
                                    df90Var.m(2);
                                    i5 = 4;
                                    if (df90Var.g(4) == this.p) {
                                        ef90Var.K(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = df90Var.a;
                                if (ef90Var.a() >= i5) {
                                    ef90Var.i(i10, i5, bArr4);
                                    df90Var.m(14);
                                    int g2 = df90Var.g(13);
                                    if (g2 >= 7) {
                                        byte[] bArr5 = ef90Var.a;
                                        int i17 = ef90Var.c;
                                        int i18 = i15 + g2;
                                        if (i18 < i17) {
                                            byte b2 = bArr5[i18];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i19 = i18 + 1;
                                                    if (i19 != i17) {
                                                        if (bArr5[i19] == 68) {
                                                            int i20 = i18 + 2;
                                                            if (i20 != i17) {
                                                                if (bArr5[i20] == 51) {
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
                                            } else {
                                                int i21 = i18 + 1;
                                                if (i21 != i17) {
                                                    byte b3 = bArr5[i21];
                                                    if ((((65280 | ((b3 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == g) {
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
                                } else {
                                    break;
                                }
                            } else {
                                c = 65535;
                            }
                            r4 = true;
                        }
                        c = 65535;
                        r4 = true;
                    }
                    int i22 = this.l;
                    int i23 = i14 | i22;
                    if (i23 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 768;
                    } else if (i23 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 512;
                    } else if (i23 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 1024;
                    } else {
                        if (i23 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            ef90Var2.K(0);
                            ef90Var.K(i);
                            break;
                        }
                        c2 = 256;
                        if (i22 != 256) {
                            this.l = 256;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i11 = r4;
                            c4 = c;
                            i9 = 4;
                            i10 = i4;
                            i8 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i12 = i;
                    i11 = r4;
                    c4 = c;
                    i9 = 4;
                    i10 = i4;
                    i8 = i3;
                }
                this.q = (b & 8) >> 3;
                this.m = (b & 1) == 0;
                if (this.n) {
                    this.j = i2;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                ef90Var.K(i);
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = ef90Var2.a;
                    int min = Math.min(ef90Var.a(), 10 - this.k);
                    ef90Var.i(this.k, min, bArr6);
                    int i24 = this.k + min;
                    this.k = i24;
                    if (i24 == 10) {
                        this.i.a(ef90Var2, 10, 0);
                        ef90Var2.K(6);
                        g001 g001Var = this.i;
                        int x2 = ef90Var2.x() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = g001Var;
                        this.w = 0L;
                        this.t = x2;
                    }
                } else if (i7 == 3) {
                    int i25 = this.m ? 7 : 5;
                    byte[] bArr7 = df90Var.a;
                    int min2 = Math.min(ef90Var.a(), i25 - this.k);
                    ef90Var.i(this.k, min2, bArr7);
                    int i26 = this.k + min2;
                    this.k = i26;
                    if (i26 == i25) {
                        df90Var.m(0);
                        if (this.r) {
                            df90Var.o(10);
                        } else {
                            int g3 = df90Var.g(2) + 1;
                            if (g3 != 2) {
                                lk91.j("Detected audio object type: " + g3 + ", but assuming AAC LC.");
                                g3 = 2;
                            }
                            df90Var.o(5);
                            byte[] d = pw21.d(g3, this.p, df90Var.g(3));
                            a4 o = pw21.o(new df90(d, 2), false);
                            f7s f7sVar = new f7s();
                            f7sVar.a = this.g;
                            f7sVar.l = eh20.q(this.f);
                            f7sVar.m = eh20.q("audio/mp4a-latm");
                            f7sVar.j = o.a;
                            f7sVar.C = o.c;
                            f7sVar.D = o.b;
                            f7sVar.p = Collections.singletonList(d);
                            f7sVar.d = this.d;
                            f7sVar.f = this.e;
                            a aVar = new a(f7sVar);
                            this.s = 1024000000 / aVar.E;
                            this.h.d(aVar);
                            this.r = true;
                        }
                        df90Var.o(4);
                        int g4 = df90Var.g(13);
                        int i27 = g4 - 7;
                        if (this.m) {
                            i27 = g4 - 9;
                        }
                        g001 g001Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = g001Var2;
                        this.w = j;
                        this.t = i27;
                    }
                } else {
                    if (i7 != 4) {
                        ny61.k();
                        return;
                    }
                    int min3 = Math.min(ef90Var.a(), this.t - this.k);
                    this.v.a(ef90Var, min3, 0);
                    int i28 = this.k + min3;
                    this.k = i28;
                    if (i28 == this.t) {
                        d6z.x(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (ef90Var.a() != 0) {
                df90Var.a[0] = ef90Var.a[ef90Var.b];
                df90Var.m(2);
                int g5 = df90Var.g(4);
                int i29 = this.p;
                if (i29 == -1 || g5 == i29) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = g5;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.g = xi11Var.e;
        xi11Var.d();
        g001 B = d5pVar.B(xi11Var.d, 1);
        this.h = B;
        this.v = B;
        if (!this.a) {
            this.i = new coj();
            return;
        }
        xi11Var.c();
        xi11Var.d();
        g001 B2 = d5pVar.B(xi11Var.d, 5);
        this.i = B2;
        f7s f7sVar = new f7s();
        xi11Var.d();
        f7sVar.a = xi11Var.e;
        f7sVar.l = eh20.q(this.f);
        f7sVar.m = eh20.q("application/id3");
        smw0.u(f7sVar, B2);
    }
}
