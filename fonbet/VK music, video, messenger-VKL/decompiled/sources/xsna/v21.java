package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import ru.ok.gl.tf.Tensorflow;
import xsna.l0;
import xsna.tsp0;

/* compiled from: AdtsReader.java */
/* loaded from: classes12.dex */
public final class v21 implements zap {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;

    @Nullable
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public rgp0 h;
    public rgp0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public rgp0 v;
    public long w;
    public final wi90 b = new wi90(new byte[7], 7);
    public final xi90 c = new xi90(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = C.TIME_UNSET;
    public long u = C.TIME_UNSET;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public v21(int i, @Nullable String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // xsna.zap
    public final void a(xi90 xi90Var) throws ParserException {
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
        String str = y2r0.a;
        while (xi90Var.a() > 0) {
            int i6 = this.j;
            char c4 = 65535;
            xi90 xi90Var2 = this.c;
            int i7 = 3;
            wi90 wi90Var = this.b;
            int i8 = 0;
            int i9 = 4;
            int i10 = 1;
            if (i6 == 0) {
                byte[] bArr = xi90Var.a;
                int i11 = xi90Var.b;
                int i12 = xi90Var.c;
                while (true) {
                    if (i11 >= i12) {
                        xi90Var.P(i11);
                        break;
                    }
                    i = i11 + 1;
                    i2 = i7;
                    b = bArr[i11];
                    int i13 = b & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i13) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i10;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i14 = i11 - 1;
                        xi90Var.P(i11);
                        byte[] bArr2 = wi90Var.b;
                        if (xi90Var.a() >= i10) {
                            xi90Var.n(bArr2, i8, i10);
                            wi90Var.m(i9);
                            int g = wi90Var.g(i10);
                            int i15 = this.o;
                            if (i15 == -1 || g == i15) {
                                if (this.p != -1) {
                                    byte[] bArr3 = wi90Var.b;
                                    if (xi90Var.a() < i10) {
                                        break;
                                    }
                                    xi90Var.n(bArr3, i8, i10);
                                    wi90Var.m(2);
                                    i5 = 4;
                                    if (wi90Var.g(4) == this.p) {
                                        xi90Var.P(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = wi90Var.b;
                                if (xi90Var.a() >= i5) {
                                    xi90Var.n(bArr4, i8, i5);
                                    wi90Var.m(14);
                                    int g2 = wi90Var.g(13);
                                    if (g2 >= 7) {
                                        byte[] bArr5 = xi90Var.a;
                                        int i16 = xi90Var.c;
                                        int i17 = i14 + g2;
                                        if (i17 < i16) {
                                            byte b2 = bArr5[i17];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i18 = i17 + 1;
                                                    if (i18 != i16) {
                                                        if (bArr5[i18] == 68) {
                                                            int i19 = i17 + 2;
                                                            if (i19 != i16) {
                                                                if (bArr5[i19] == 51) {
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
                                                int i20 = i17 + 1;
                                                if (i20 != i16) {
                                                    byte b3 = bArr5[i20];
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
                    int i21 = this.l;
                    int i22 = i13 | i21;
                    if (i22 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = Tensorflow.FRAME_HEIGHT;
                    } else if (i22 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 512;
                    } else if (i22 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 1024;
                    } else {
                        if (i22 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            xi90Var2.P(0);
                            xi90Var.P(i);
                            break;
                        }
                        c2 = 256;
                        if (i21 != 256) {
                            this.l = 256;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i10 = r4;
                            c4 = c;
                            i9 = 4;
                            i8 = i4;
                            i7 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i11 = i;
                    i10 = r4;
                    c4 = c;
                    i9 = 4;
                    i8 = i4;
                    i7 = i3;
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
                xi90Var.P(i);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    byte[] bArr6 = xi90Var2.a;
                    int min = Math.min(xi90Var.a(), 10 - this.k);
                    xi90Var.n(bArr6, this.k, min);
                    int i23 = this.k + min;
                    this.k = i23;
                    if (i23 == 10) {
                        this.i.d(10, xi90Var2);
                        xi90Var2.P(6);
                        rgp0 rgp0Var = this.i;
                        int B = xi90Var2.B() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = rgp0Var;
                        this.w = 0L;
                        this.t = B;
                    }
                } else if (i6 == 3) {
                    int i24 = this.m ? 7 : 5;
                    byte[] bArr7 = wi90Var.b;
                    int min2 = Math.min(xi90Var.a(), i24 - this.k);
                    xi90Var.n(bArr7, this.k, min2);
                    int i25 = this.k + min2;
                    this.k = i25;
                    if (i25 == i24) {
                        wi90Var.m(0);
                        if (this.r) {
                            wi90Var.o(10);
                        } else {
                            int g3 = wi90Var.g(2) + 1;
                            if (g3 != 2) {
                                ahn.F("Detected audio object type: " + g3 + ", but assuming AAC LC.");
                                g3 = 2;
                            }
                            wi90Var.o(5);
                            int g4 = wi90Var.g(3);
                            int i26 = this.p;
                            byte[] bArr8 = {(byte) (((g3 << 3) & 248) | ((i26 >> 1) & 7)), (byte) (((g4 << 3) & 120) | ((i26 << 7) & 128))};
                            l0.a b4 = l0.b(new wi90(bArr8, 2), false);
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.a = this.g;
                            c0043a.l = io20.q(this.f);
                            c0043a.m = io20.q("audio/mp4a-latm");
                            c0043a.j = b4.c;
                            c0043a.E = b4.b;
                            c0043a.F = b4.a;
                            c0043a.p = Collections.singletonList(bArr8);
                            c0043a.d = this.d;
                            c0043a.f = this.e;
                            androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                            this.s = 1024000000 / aVar.G;
                            this.h.c(aVar);
                            this.r = true;
                        }
                        wi90Var.o(4);
                        int g5 = wi90Var.g(13);
                        int i27 = g5 - 7;
                        if (this.m) {
                            i27 = g5 - 9;
                        }
                        rgp0 rgp0Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = rgp0Var2;
                        this.w = j;
                        this.t = i27;
                    }
                } else {
                    if (i6 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(xi90Var.a(), this.t - this.k);
                    this.v.d(min3, xi90Var);
                    int i28 = this.k + min3;
                    this.k = i28;
                    if (i28 == this.t) {
                        fxc0.z(this.u != C.TIME_UNSET);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (xi90Var.a() != 0) {
                wi90Var.b[0] = xi90Var.a[xi90Var.b];
                wi90Var.m(2);
                int g6 = wi90Var.g(4);
                int i29 = this.p;
                if (i29 == -1 || g6 == i29) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = g6;
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

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 1);
        this.h = track;
        this.v = track;
        if (!this.a) {
            this.i = new k0n();
            return;
        }
        cVar.a();
        cVar.b();
        rgp0 track2 = rgqVar.track(cVar.d, 5);
        this.i = track2;
        a.C0043a c0043a = new a.C0043a();
        cVar.b();
        c0043a.a = cVar.e;
        c0043a.l = io20.q(this.f);
        c0043a.m = io20.q(MimeTypes.APPLICATION_ID3);
        zjh0.d(c0043a, track2);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.u = j;
    }

    @Override // xsna.zap
    public final void seek() {
        this.u = C.TIME_UNSET;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}
