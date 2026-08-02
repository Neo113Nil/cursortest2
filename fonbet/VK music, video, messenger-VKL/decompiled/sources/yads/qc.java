package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import ru.ok.gl.tf.Tensorflow;

/* loaded from: classes10.dex */
public final class qc implements vl0 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final jc2 b;
    public final kc2 c;
    public final String d;
    public String e;
    public q83 f;
    public q83 g;
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
    public q83 t;
    public long u;

    public qc() {
        this(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f6 A[SYNTHETIC] */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        this.f.getClass();
        int i6 = mc3.a;
        while (true) {
            int i7 = kc2Var.c;
            int i8 = kc2Var.b;
            int i9 = i7 - i8;
            if (i9 <= 0) {
                return;
            }
            int i10 = this.h;
            int i11 = -1;
            int i12 = 4;
            int i13 = 3;
            if (i10 == 0) {
                byte[] bArr = kc2Var.a;
                while (true) {
                    if (i8 >= i7) {
                        kc2Var.e(i8);
                        break;
                    }
                    i = i8 + 1;
                    b = bArr[i8];
                    int i14 = b & 255;
                    i2 = i13;
                    if (this.j == 512 && (((((byte) i14) & 255) | 65280) & 65526) == 65520) {
                        if (this.l) {
                            break;
                        }
                        int i15 = i8 - 1;
                        kc2Var.e(i8);
                        byte[] bArr2 = this.b.a;
                        if (kc2Var.c - kc2Var.b >= 1) {
                            kc2Var.a(bArr2, 0, 1);
                            this.b.b(i12);
                            int a = this.b.a(1);
                            int i16 = this.m;
                            if (i16 == i11 || a == i16) {
                                if (this.n != i11) {
                                    byte[] bArr3 = this.b.a;
                                    if (kc2Var.c - kc2Var.b < 1) {
                                        break;
                                    }
                                    kc2Var.a(bArr3, 0, 1);
                                    this.b.b(2);
                                    if (this.b.a(i12) == this.n) {
                                        kc2Var.e(i);
                                    }
                                    i3 = -1;
                                    int i17 = this.j;
                                    i4 = i17 | i14;
                                    if (i4 == 329) {
                                        i5 = 3;
                                        c = 2;
                                        this.j = Tensorflow.FRAME_HEIGHT;
                                    } else if (i4 == 511) {
                                        i5 = 3;
                                        c = 2;
                                        this.j = 512;
                                    } else if (i4 == 836) {
                                        i5 = 3;
                                        c = 2;
                                        this.j = 1024;
                                    } else {
                                        if (i4 == 1075) {
                                            this.h = 2;
                                            this.i = 3;
                                            this.r = 0;
                                            this.c.e(0);
                                            kc2Var.e(i);
                                            break;
                                        }
                                        if (i17 != 256) {
                                            this.j = 256;
                                            i11 = i3;
                                            i12 = 4;
                                            i13 = 3;
                                        } else {
                                            i5 = 3;
                                            c = 2;
                                        }
                                    }
                                    i8 = i;
                                    i13 = i5;
                                    i11 = i3;
                                    i12 = 4;
                                }
                                byte[] bArr4 = this.b.a;
                                if (kc2Var.c - kc2Var.b < i12) {
                                    break;
                                }
                                kc2Var.a(bArr4, 0, i12);
                                this.b.b(14);
                                int a2 = this.b.a(13);
                                if (a2 >= 7) {
                                    byte[] bArr5 = kc2Var.a;
                                    int i18 = kc2Var.c;
                                    int i19 = i15 + a2;
                                    if (i19 >= i18) {
                                        break;
                                    }
                                    byte b2 = bArr5[i19];
                                    i3 = -1;
                                    if (b2 == -1) {
                                        int i20 = i19 + 1;
                                        if (i20 == i18) {
                                            break;
                                        }
                                        byte b3 = bArr5[i20];
                                        if ((((b3 & 255) | 65280) & 65526) == 65520 && ((b3 & 8) >> 3) == a) {
                                            break;
                                        }
                                        int i172 = this.j;
                                        i4 = i172 | i14;
                                        if (i4 == 329) {
                                        }
                                        i8 = i;
                                        i13 = i5;
                                        i11 = i3;
                                        i12 = 4;
                                    } else {
                                        if (b2 == 73) {
                                            int i21 = i19 + 1;
                                            if (i21 != i18) {
                                                if (bArr5[i21] == 68) {
                                                    int i22 = i19 + 2;
                                                    if (i22 != i18) {
                                                        if (bArr5[i22] == 51) {
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
                                        int i1722 = this.j;
                                        i4 = i1722 | i14;
                                        if (i4 == 329) {
                                        }
                                        i8 = i;
                                        i13 = i5;
                                        i11 = i3;
                                        i12 = 4;
                                    }
                                }
                                i3 = -1;
                                int i17222 = this.j;
                                i4 = i17222 | i14;
                                if (i4 == 329) {
                                }
                                i8 = i;
                                i13 = i5;
                                i11 = i3;
                                i12 = 4;
                            }
                        }
                    }
                    i3 = i11;
                    int i172222 = this.j;
                    i4 = i172222 | i14;
                    if (i4 == 329) {
                    }
                    i8 = i;
                    i13 = i5;
                    i11 = i3;
                    i12 = 4;
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
                kc2Var.e(i);
            } else if (i10 != 1) {
                if (i10 == 2) {
                    byte[] bArr6 = this.c.a;
                    int min = Math.min(i9, 10 - this.i);
                    kc2Var.a(bArr6, this.i, min);
                    int i23 = this.i + min;
                    this.i = i23;
                    if (i23 == 10) {
                        this.g.a(10, this.c);
                        this.c.e(6);
                        q83 q83Var = this.g;
                        int l = this.c.l() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = q83Var;
                        this.u = 0L;
                        this.r = l;
                    }
                } else if (i10 == 3) {
                    int i24 = this.k ? 7 : 5;
                    byte[] bArr7 = this.b.a;
                    int min2 = Math.min(i9, i24 - this.i);
                    kc2Var.a(bArr7, this.i, min2);
                    int i25 = this.i + min2;
                    this.i = i25;
                    if (i25 == i24) {
                        this.b.b(0);
                        if (this.p) {
                            this.b.c(10);
                        } else {
                            int a3 = this.b.a(2) + 1;
                            if (a3 != 2) {
                                ji1.d("AdtsReader", "Detected audio object type: " + a3 + ", but assuming AAC LC.");
                                a3 = 2;
                            }
                            this.b.c(5);
                            int a4 = this.b.a(3);
                            int i26 = this.n;
                            byte[] bArr8 = {(byte) (((a3 << 3) & 248) | ((i26 >> 1) & 7)), (byte) (((a4 << 3) & 120) | ((i26 << 7) & 128))};
                            a a5 = b.a(new jc2(2, bArr8), false);
                            mx0 mx0Var = new mx0();
                            mx0Var.a = this.e;
                            mx0Var.k = "audio/mp4a-latm";
                            mx0Var.h = a5.c;
                            mx0Var.x = a5.b;
                            mx0Var.y = a5.a;
                            mx0Var.m = Collections.singletonList(bArr8);
                            mx0Var.c = this.d;
                            nx0 nx0Var = new nx0(mx0Var);
                            this.q = 1024000000 / nx0Var.A;
                            this.f.a(nx0Var);
                            this.p = true;
                        }
                        this.b.c(4);
                        int a6 = this.b.a(13);
                        int i27 = a6 - 7;
                        if (this.k) {
                            i27 = a6 - 9;
                        }
                        q83 q83Var2 = this.f;
                        long j = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = q83Var2;
                        this.u = j;
                        this.r = i27;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(i9, this.r - this.i);
                    this.t.a(min3, kc2Var);
                    int i28 = this.i + min3;
                    this.i = i28;
                    int i29 = this.r;
                    if (i28 == i29) {
                        long j2 = this.s;
                        if (j2 != C.TIME_UNSET) {
                            this.t.a(j2, 1, i29, 0, null);
                            this.s += this.u;
                        }
                        c();
                    }
                }
            } else if (i9 != 0) {
                jc2 jc2Var = this.b;
                jc2Var.a[0] = kc2Var.a[i8];
                jc2Var.b(2);
                int a7 = this.b.a(4);
                int i30 = this.n;
                if (i30 == -1 || a7 == i30) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = a7;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    c();
                }
            }
        }
    }

    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public qc(String str, boolean z) {
        this.b = new jc2(new byte[7]);
        this.c = new kc2(Arrays.copyOf(v, 10));
        c();
        this.m = -1;
        this.n = -1;
        this.q = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.a = z;
        this.d = str;
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.e = pa3Var.e;
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 1);
        this.f = a;
        this.t = a;
        if (this.a) {
            pa3Var.a();
            pa3Var.b();
            q83 a2 = qq0Var.a(pa3Var.d, 5);
            this.g = a2;
            mx0 mx0Var = new mx0();
            pa3Var.b();
            mx0Var.a = pa3Var.e;
            mx0Var.k = MimeTypes.APPLICATION_ID3;
            a2.a(new nx0(mx0Var));
            return;
        }
        this.g = new bl0();
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.s = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.s = C.TIME_UNSET;
        this.l = false;
        c();
    }
}
