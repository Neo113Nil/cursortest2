package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.tsp0;

/* compiled from: Ac3Reader.java */
/* loaded from: classes12.dex */
public final class mi implements zap {
    public final wi90 a;
    public final xi90 b;

    @Nullable
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public rgp0 g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public androidx.media3.common.a l;
    public int m;
    public long n;

    public mi(String str) {
        this(null, 0, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028d  */
    @Override // xsna.zap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xi90 xi90Var) {
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
        int i16;
        int i17;
        this.g.getClass();
        while (xi90Var.a() > 0) {
            int i18 = this.h;
            xi90 xi90Var2 = this.b;
            if (i18 == 0) {
                while (true) {
                    if (xi90Var.a() <= 0) {
                        break;
                    }
                    if (this.j) {
                        int C = xi90Var.C();
                        if (C == 119) {
                            this.j = false;
                            this.h = 1;
                            byte[] bArr = xi90Var2.a;
                            bArr[0] = AmfConstants.TYPE_DATE_MARKER;
                            bArr[1] = 119;
                            this.i = 2;
                            break;
                        }
                        this.j = C == 11;
                    } else {
                        this.j = xi90Var.C() == 11;
                    }
                }
            } else if (i18 == 1) {
                byte[] bArr2 = xi90Var2.a;
                int min = Math.min(xi90Var.a(), 128 - this.i);
                xi90Var.n(bArr2, this.i, min);
                int i19 = this.i + min;
                this.i = i19;
                if (i19 == 128) {
                    wi90 wi90Var = this.a;
                    wi90Var.m(0);
                    int e = wi90Var.e();
                    wi90Var.o(40);
                    Object[] objArr = wi90Var.g(5) > 10;
                    wi90Var.m(e);
                    int[] iArr = ni.d;
                    int[] iArr2 = ni.b;
                    if (objArr == true) {
                        wi90Var.o(16);
                        int g = wi90Var.g(2);
                        char c = g != 0 ? g != 1 ? g != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                        wi90Var.o(3);
                        i5 = (wi90Var.g(11) + 1) * 2;
                        int g2 = wi90Var.g(2);
                        if (g2 == 3) {
                            i6 = ni.c[wi90Var.g(2)];
                            i7 = 3;
                            i8 = 6;
                        } else {
                            int g3 = wi90Var.g(2);
                            int i20 = ni.a[g3];
                            i6 = iArr2[g2];
                            i7 = g3;
                            i8 = i20;
                        }
                        i3 = i8 * 256;
                        int i21 = (i5 * i6) / (i8 * 32);
                        int g4 = wi90Var.g(3);
                        boolean f = wi90Var.f();
                        i2 = iArr[g4] + (f ? 1 : 0);
                        wi90Var.o(10);
                        if (wi90Var.f()) {
                            wi90Var.o(8);
                        }
                        if (g4 == 0) {
                            wi90Var.o(5);
                            if (wi90Var.f()) {
                                wi90Var.o(8);
                            }
                        }
                        if (c == 1 && wi90Var.f()) {
                            wi90Var.o(16);
                        }
                        if (wi90Var.f()) {
                            if (g4 > 2) {
                                wi90Var.o(2);
                            }
                            if ((g4 & 1) == 0 || g4 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                wi90Var.o(6);
                            }
                            if ((g4 & 4) != 0) {
                                wi90Var.o(i13);
                            }
                            if (f && wi90Var.f()) {
                                wi90Var.o(5);
                            }
                            if (c == 0) {
                                if (wi90Var.f()) {
                                    i14 = 6;
                                    wi90Var.o(6);
                                } else {
                                    i14 = 6;
                                }
                                if (g4 == 0 && wi90Var.f()) {
                                    wi90Var.o(i14);
                                }
                                if (wi90Var.f()) {
                                    wi90Var.o(i14);
                                }
                                int g5 = wi90Var.g(2);
                                if (g5 == 1) {
                                    wi90Var.o(5);
                                    i16 = 2;
                                } else {
                                    if (g5 == 2) {
                                        wi90Var.o(12);
                                    } else if (g5 == 3) {
                                        int g6 = wi90Var.g(5);
                                        if (wi90Var.f()) {
                                            wi90Var.o(5);
                                            if (wi90Var.f()) {
                                                i17 = 4;
                                                wi90Var.o(4);
                                            } else {
                                                i17 = 4;
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                wi90Var.o(i17);
                                            }
                                            if (wi90Var.f()) {
                                                if (wi90Var.f()) {
                                                    wi90Var.o(i17);
                                                }
                                                if (wi90Var.f()) {
                                                    wi90Var.o(i17);
                                                }
                                            }
                                        }
                                        if (wi90Var.f()) {
                                            wi90Var.o(5);
                                            if (wi90Var.f()) {
                                                wi90Var.o(7);
                                                if (wi90Var.f()) {
                                                    i15 = 8;
                                                    wi90Var.o(8);
                                                    i16 = 2;
                                                    wi90Var.o((g6 + 2) * i15);
                                                    wi90Var.c();
                                                }
                                            }
                                        }
                                        i15 = 8;
                                        i16 = 2;
                                        wi90Var.o((g6 + 2) * i15);
                                        wi90Var.c();
                                    }
                                    i16 = 2;
                                }
                                if (g4 < i16) {
                                    if (wi90Var.f()) {
                                        wi90Var.o(14);
                                    }
                                    if (g4 == 0 && wi90Var.f()) {
                                        wi90Var.o(14);
                                    }
                                }
                                if (wi90Var.f()) {
                                    i9 = i7;
                                    if (i9 == 0) {
                                        wi90Var.o(5);
                                    } else {
                                        for (int i22 = 0; i22 < i8; i22++) {
                                            if (wi90Var.f()) {
                                                wi90Var.o(5);
                                            }
                                        }
                                    }
                                    if (wi90Var.f()) {
                                        i10 = 3;
                                    } else {
                                        wi90Var.o(5);
                                        if (g4 == 2) {
                                            wi90Var.o(4);
                                        }
                                        if (g4 >= 6) {
                                            wi90Var.o(2);
                                        }
                                        if (wi90Var.f()) {
                                            i12 = 8;
                                            wi90Var.o(8);
                                        } else {
                                            i12 = 8;
                                        }
                                        if (g4 == 0 && wi90Var.f()) {
                                            wi90Var.o(i12);
                                        }
                                        i10 = 3;
                                        if (g2 < 3) {
                                            wi90Var.n();
                                        }
                                    }
                                    if (c == 0 && i9 != i10) {
                                        wi90Var.n();
                                    }
                                    if (c == 2 || !(i9 == i10 || wi90Var.f())) {
                                        i11 = 6;
                                    } else {
                                        i11 = 6;
                                        wi90Var.o(6);
                                    }
                                    str = (!wi90Var.f() && wi90Var.g(i11) == 1 && wi90Var.g(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                                    i4 = i21;
                                }
                            }
                        }
                        i9 = i7;
                        if (wi90Var.f()) {
                        }
                        if (c == 0) {
                            wi90Var.n();
                        }
                        if (c == 2) {
                        }
                        i11 = 6;
                        if (!wi90Var.f()) {
                        }
                        i4 = i21;
                    } else {
                        wi90Var.o(32);
                        int g7 = wi90Var.g(2);
                        String str2 = g7 == 3 ? null : MimeTypes.AUDIO_AC3;
                        int g8 = wi90Var.g(6);
                        int i23 = ni.e[g8 / 2] * 1000;
                        int a = ni.a(g7, g8);
                        wi90Var.o(8);
                        int g9 = wi90Var.g(3);
                        if ((g9 & 1) == 0 || g9 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            wi90Var.o(2);
                        }
                        if ((g9 & 4) != 0) {
                            wi90Var.o(i);
                        }
                        if (g9 == i) {
                            wi90Var.o(i);
                        }
                        int i24 = g7 < 3 ? iArr2[g7] : -1;
                        i2 = iArr[g9] + (wi90Var.f() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        i4 = i23;
                        i5 = a;
                        i6 = i24;
                    }
                    androidx.media3.common.a aVar = this.l;
                    if (aVar == null || i2 != aVar.F || i6 != aVar.G || !Objects.equals(str, aVar.n)) {
                        a.C0043a c0043a = new a.C0043a();
                        c0043a.a = this.f;
                        c0043a.l = io20.q(this.e);
                        c0043a.m = io20.q(str);
                        c0043a.E = i2;
                        c0043a.F = i6;
                        c0043a.d = this.c;
                        c0043a.f = this.d;
                        c0043a.i = i4;
                        if (MimeTypes.AUDIO_AC3.equals(str)) {
                            c0043a.h = i4;
                        }
                        androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
                        this.l = aVar2;
                        this.g.c(aVar2);
                    }
                    this.m = i5;
                    this.k = (i3 * 1000000) / this.l.G;
                    xi90Var2.P(0);
                    this.g.d(128, xi90Var2);
                    this.h = 2;
                }
            } else if (i18 == 2) {
                int min2 = Math.min(xi90Var.a(), this.m - this.i);
                this.g.d(min2, xi90Var);
                int i25 = this.i + min2;
                this.i = i25;
                if (i25 == this.m) {
                    fxc0.z(this.n != C.TIME_UNSET);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = rgqVar.track(cVar.d, 1);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.n = j;
    }

    @Override // xsna.zap
    public final void seek() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
    }

    public mi(@Nullable String str, int i, String str2) {
        wi90 wi90Var = new wi90(new byte[128], 128);
        this.a = wi90Var;
        this.b = new xi90(wi90Var.b);
        this.h = 0;
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}
