package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.jno;
import xsna.tsp0;

/* compiled from: DtsReader.java */
/* loaded from: classes12.dex */
public final class ino implements zap {
    public final xi90 a;

    @Nullable
    public final String c;
    public final int d;
    public String f;
    public rgp0 g;
    public int i;
    public int j;
    public long k;
    public androidx.media3.common.a l;
    public int m;
    public int n;
    public int h = 0;
    public long q = C.TIME_UNSET;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public ino(@Nullable String str, int i, int i2) {
        this.a = new xi90(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        this.g.getClass();
        while (xi90Var.a() > 0) {
            int i14 = this.h;
            xi90 xi90Var2 = this.a;
            switch (i14) {
                case 0:
                    while (true) {
                        if (xi90Var.a() > 0) {
                            int i15 = this.j << 8;
                            this.j = i15;
                            int C = i15 | xi90Var.C();
                            this.j = C;
                            int b3 = jno.b(C);
                            this.n = b3;
                            if (b3 != 0) {
                                byte[] bArr = xi90Var2.a;
                                int i16 = this.j;
                                bArr[0] = (byte) ((i16 >> 24) & 255);
                                bArr[1] = (byte) ((i16 >> 16) & 255);
                                bArr[2] = (byte) ((i16 >> 8) & 255);
                                bArr[3] = (byte) (i16 & 255);
                                this.i = 4;
                                this.j = 0;
                                if (b3 != 3 && b3 != 4) {
                                    if (b3 == 1) {
                                        this.h = 1;
                                        break;
                                    } else {
                                        this.h = 2;
                                        break;
                                    }
                                } else {
                                    this.h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!e(xi90Var, xi90Var2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xi90Var2.a;
                        if (this.l == null) {
                            String str = this.f;
                            wi90 c = jno.c(bArr2);
                            c.o(60);
                            int i17 = jno.a[c.g(6)];
                            int i18 = jno.b[c.g(4)];
                            int g = c.g(5);
                            int i19 = g >= 29 ? -1 : (jno.c[g] * 1000) / 2;
                            c.o(10);
                            int i20 = i17 + (c.g(2) > 0 ? 1 : 0);
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.a = str;
                            c0043a.l = io20.q(this.e);
                            c0043a.m = io20.q(MimeTypes.AUDIO_DTS);
                            c0043a.h = i19;
                            c0043a.E = i20;
                            c0043a.F = i18;
                            c0043a.q = null;
                            c0043a.d = this.c;
                            c0043a.f = this.d;
                            androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                            this.l = aVar;
                            this.g.c(aVar);
                        }
                        this.m = jno.a(bArr2);
                        byte b4 = bArr2[0];
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b4 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.k = ipx.s(y2r0.b0(this.l.G, (((i2 >> 2) | i) + 1) * 32));
                            xi90Var2.P(0);
                            this.g.d(18, xi90Var2);
                            this.h = 6;
                            break;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.k = ipx.s(y2r0.b0(this.l.G, (((i2 >> 2) | i) + 1) * 32));
                        xi90Var2.P(0);
                        this.g.d(18, xi90Var2);
                        this.h = 6;
                    }
                case 2:
                    if (e(xi90Var, xi90Var2.a, 7)) {
                        wi90 c2 = jno.c(xi90Var2.a);
                        c2.o(42);
                        this.o = c2.g(c2.f() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i21 = 8;
                    if (e(xi90Var, xi90Var2.a, this.o)) {
                        wi90 c3 = jno.c(xi90Var2.a);
                        c3.o(40);
                        int g2 = c3.g(2);
                        if (c3.f()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        c3.o(i4);
                        int g3 = c3.g(i3) + 1;
                        boolean f = c3.f();
                        if (f) {
                            i5 = c3.g(2);
                            i6 = (c3.g(3) + 1) * 512;
                            if (c3.f()) {
                                c3.o(36);
                            }
                            int g4 = c3.g(3) + 1;
                            int g5 = c3.g(3) + 1;
                            if (g4 != 1 || g5 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i22 = g2 + 1;
                            int g6 = c3.g(i22);
                            int i23 = 0;
                            while (i23 < i22) {
                                if (((g6 >> i23) & 1) == 1) {
                                    c3.o(i21);
                                }
                                i23++;
                                i21 = 8;
                            }
                            if (c3.f()) {
                                c3.o(2);
                                int g7 = (c3.g(2) + 1) << 2;
                                int g8 = c3.g(2) + 1;
                                for (int i24 = 0; i24 < g8; i24++) {
                                    c3.o(g7);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        c3.o(i3);
                        c3.o(12);
                        if (f) {
                            if (c3.f()) {
                                c3.o(4);
                            }
                            if (c3.f()) {
                                c3.o(24);
                            }
                            if (c3.f()) {
                                c3.p(c3.g(10) + 1);
                            }
                            c3.o(5);
                            i8 = jno.d[c3.g(4)];
                            i7 = c3.g(8) + 1;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (f) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            String str2 = y2r0.a;
                            j = y2r0.d0(i6, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        f(new jno.a(j, i7, i8, MimeTypes.AUDIO_DTS_EXPRESS, g3));
                        this.m = g3;
                        this.k = j == C.TIME_UNSET ? 0L : j;
                        xi90Var2.P(0);
                        this.g.d(this.o, xi90Var2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (e(xi90Var, xi90Var2.a, 6)) {
                        wi90 c4 = jno.c(xi90Var2.a);
                        c4.o(32);
                        int d = jno.d(c4, jno.i) + 1;
                        this.p = d;
                        int i25 = this.i;
                        if (i25 > d) {
                            int i26 = i25 - d;
                            this.i = i25 - i26;
                            xi90Var.P(xi90Var.b - i26);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (e(xi90Var, xi90Var2.a, this.p)) {
                        byte[] bArr3 = xi90Var2.a;
                        wi90 c5 = jno.c(bArr3);
                        int i27 = c5.g(32) == 1078008818 ? 1 : 0;
                        int d2 = jno.d(c5, jno.e);
                        int i28 = d2 + 1;
                        if (i27 == 0) {
                            j2 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!c5.f()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i29 = d2 - 1;
                            int i30 = ((bArr3[i29] << 8) & MinElf.PN_XNUM) | (bArr3[d2] & 255);
                            String str3 = y2r0.a;
                            int i31 = 65535;
                            for (int i32 = 0; i32 < i29; i32++) {
                                byte b5 = bArr3[i32];
                                int i33 = (((b5 & 255) >> 4) ^ ((i31 >> 12) & 255)) & 255;
                                int i34 = (i31 << 4) & MinElf.PN_XNUM;
                                int[] iArr = y2r0.l;
                                int i35 = (iArr[i33] ^ i34) & MinElf.PN_XNUM;
                                i31 = (iArr[((b5 & AmfConstants.TYPE_XML_DOCUMENT_MARKER) ^ ((i35 >> 12) & 255)) & 255] ^ ((i35 << 4) & MinElf.PN_XNUM)) & MinElf.PN_XNUM;
                            }
                            if (i30 != i31) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int g9 = c5.g(2);
                            if (g9 != 0) {
                                if (g9 == 1) {
                                    i12 = 480;
                                } else {
                                    if (g9 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + g9);
                                    }
                                    i12 = 384;
                                }
                                i11 = 3;
                            } else {
                                i11 = 3;
                                i12 = 512;
                            }
                            int g10 = (c5.g(i11) + 1) * i12;
                            int g11 = c5.g(2);
                            if (g11 == 0) {
                                i13 = 32000;
                            } else if (g11 == 1) {
                                i13 = 44100;
                            } else {
                                if (g11 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + g11);
                                }
                                i13 = 48000;
                            }
                            if (c5.f()) {
                                c5.o(36);
                            }
                            int g12 = i13 * (1 << c5.g(2));
                            j2 = y2r0.d0(g10, 1000000L, i13, RoundingMode.DOWN);
                            i10 = g12;
                        }
                        int i36 = 0;
                        for (int i37 = 0; i37 < i27; i37++) {
                            i36 += jno.d(c5, jno.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i27 != 0) {
                            atomicInteger.set(jno.d(c5, jno.g));
                        }
                        int d3 = i36 + (atomicInteger.get() != 0 ? jno.d(c5, jno.h) : 0) + i28;
                        jno.a aVar2 = new jno.a(j2, 2, i10, "audio/vnd.dts.uhd;profile=p2", d3);
                        if (this.n == 3) {
                            f(aVar2);
                        }
                        this.m = d3;
                        this.k = j2 == C.TIME_UNSET ? 0L : j2;
                        xi90Var2.P(0);
                        this.g.d(this.p, xi90Var2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xi90Var.a(), this.m - this.i);
                    this.g.d(min, xi90Var);
                    int i38 = this.i + min;
                    this.i = i38;
                    if (i38 != this.m) {
                        break;
                    } else {
                        fxc0.z(this.q != C.TIME_UNSET);
                        this.g.a(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
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
        this.q = j;
    }

    public final boolean e(xi90 xi90Var, byte[] bArr, int i) {
        int min = Math.min(xi90Var.a(), i - this.i);
        xi90Var.n(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    public final void f(jno.a aVar) {
        int i = aVar.b;
        String str = aVar.a;
        int i2 = aVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        androidx.media3.common.a aVar2 = this.l;
        if (aVar2 != null && i2 == aVar2.F && i == aVar2.G && str.equals(aVar2.n)) {
            return;
        }
        androidx.media3.common.a aVar3 = this.l;
        a.C0043a c0043a = aVar3 == null ? new a.C0043a() : aVar3.a();
        c0043a.a = this.f;
        c0043a.l = io20.q(this.e);
        c0043a.m = io20.q(str);
        c0043a.E = i2;
        c0043a.F = i;
        c0043a.d = this.c;
        c0043a.f = this.d;
        androidx.media3.common.a aVar4 = new androidx.media3.common.a(c0043a);
        this.l = aVar4;
        this.g.c(aVar4);
    }

    @Override // xsna.zap
    public final void seek() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = C.TIME_UNSET;
        this.b.set(0);
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}
