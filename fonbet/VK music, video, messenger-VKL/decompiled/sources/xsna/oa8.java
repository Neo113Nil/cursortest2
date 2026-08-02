package xsna;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import xsna.fi20;
import xsna.l0;
import xsna.ri;
import xsna.rt50;
import xsna.sf30;

/* compiled from: BoxParser.java */
/* loaded from: classes12.dex */
public final class oa8 {
    public static final byte[] a;

    /* compiled from: BoxParser.java */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class b {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final xi90 f;
        public final xi90 g;
        public int h;
        public int i;

        public b(xi90 xi90Var, xi90 xi90Var2, boolean z) throws ParserException {
            this.g = xi90Var;
            this.f = xi90Var2;
            this.e = z;
            xi90Var2.P(12);
            this.a = xi90Var2.G();
            xi90Var.P(12);
            this.i = xi90Var.G();
            x19.w("first_chunk must be 1", xi90Var.p() == 1);
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            boolean z = this.e;
            xi90 xi90Var = this.f;
            this.d = z ? xi90Var.I() : xi90Var.E();
            if (this.b == this.h) {
                xi90 xi90Var2 = this.g;
                this.c = xi90Var2.G();
                xi90Var2.Q(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? xi90Var2.G() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class c {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public c(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class d {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }
    }

    /* compiled from: BoxParser.java */
    public interface e {
        int a();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* compiled from: BoxParser.java */
    public static final class f {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class g {
        public final lfp0[] a;

        @Nullable
        public androidx.media3.common.a b;
        public int c;
        public int d = 0;

        public g(int i) {
            this.a = new lfp0[i];
        }
    }

    /* compiled from: BoxParser.java */
    public static final class h implements e {
        public final int a;
        public final int b;
        public final xi90 c;

        public h(sf30.b bVar, androidx.media3.common.a aVar) {
            xi90 xi90Var = bVar.b;
            this.c = xi90Var;
            xi90Var.P(12);
            int G = xi90Var.G();
            if (MimeTypes.AUDIO_RAW.equals(aVar.n)) {
                int u = y2r0.u(aVar.H) * aVar.F;
                if (G % u != 0) {
                    ahn.F("Audio sample size mismatch. stsd sample size: " + u + ", stsz sample size: " + G);
                    G = u;
                }
            }
            this.a = G == 0 ? -1 : G;
            this.b = xi90Var.G();
        }

        @Override // xsna.oa8.e
        public final int a() {
            return this.a;
        }

        @Override // xsna.oa8.e
        public final int getSampleCount() {
            return this.b;
        }

        @Override // xsna.oa8.e
        public final int readNextSampleSize() {
            int i = this.a;
            return i == -1 ? this.c.G() : i;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class i implements e {
        public final xi90 a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public i(sf30.b bVar) {
            xi90 xi90Var = bVar.b;
            this.a = xi90Var;
            xi90Var.P(12);
            this.c = xi90Var.G() & 255;
            this.b = xi90Var.G();
        }

        @Override // xsna.oa8.e
        public final int a() {
            return -1;
        }

        @Override // xsna.oa8.e
        public final int getSampleCount() {
            return this.b;
        }

        @Override // xsna.oa8.e
        public final int readNextSampleSize() {
            xi90 xi90Var = this.a;
            int i = this.c;
            if (i == 8) {
                return xi90Var.C();
            }
            if (i == 16) {
                return xi90Var.J();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int C = xi90Var.C();
            this.e = C;
            return (C & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class j {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public j(int i, long j, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* compiled from: BoxParser.java */
    public static final class k {

        @Nullable
        public final d a;

        public k(d dVar) {
            this.a = dVar;
        }
    }

    static {
        String str = y2r0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(xi90 xi90Var) {
        int i2 = xi90Var.b;
        xi90Var.Q(4);
        if (xi90Var.p() != 1751411826) {
            i2 += 4;
        }
        xi90Var.P(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x058e, code lost:
    
        if (r12 == 2) goto L273;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0811 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0666  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(xi90 xi90Var, int i2, int i3, int i4, int i5, @Nullable String str, boolean z, @Nullable DrmInitData drmInitData, g gVar, int i6) throws ParserException {
        int i7;
        int i8;
        int J;
        int i9;
        int p;
        int i10;
        int i11;
        int i12;
        DrmInitData drmInitData2;
        String str2;
        int i13;
        String str3;
        int i14;
        int i15;
        int i16;
        String str4;
        List<byte[]> list;
        int i17;
        int i18;
        int i19;
        String str5;
        c cVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean f2;
        int g2;
        int g3;
        int i31;
        int i32;
        boolean z2;
        int i33;
        boolean f3;
        int i34;
        boolean z3;
        String str6;
        xi90 xi90Var2 = xi90Var;
        int i35 = i2;
        int i36 = i4;
        xi90Var2.P(i3 + 16);
        if (z) {
            i7 = xi90Var2.J();
            xi90Var2.Q(6);
        } else {
            xi90Var2.Q(8);
            i7 = 0;
        }
        if (i7 == 0 || i7 == 1) {
            i8 = 2;
            J = xi90Var2.J();
            xi90Var2.Q(6);
            int D = xi90Var2.D();
            i9 = 32;
            xi90Var2.P(xi90Var2.b - 4);
            p = xi90Var2.p();
            if (i7 == 1) {
                xi90Var2.Q(16);
            }
            i10 = D;
            i11 = -1;
        } else {
            if (i7 != 2) {
                return;
            }
            xi90Var2.Q(16);
            int round = (int) Math.round(Double.longBitsToDouble(xi90Var2.w()));
            int G = xi90Var2.G();
            xi90Var2.Q(4);
            i8 = 2;
            int G2 = xi90Var2.G();
            int G3 = xi90Var2.G();
            boolean z4 = (G3 & 1) != 0;
            boolean z5 = (G3 & 2) != 0;
            if (z4) {
                if (G2 == 32) {
                    i11 = 4;
                    xi90Var2.Q(8);
                    i10 = round;
                    J = G;
                    i9 = 32;
                    p = 0;
                }
                i11 = -1;
                xi90Var2.Q(8);
                i10 = round;
                J = G;
                i9 = 32;
                p = 0;
            } else {
                if (G2 == 8) {
                    i11 = 3;
                } else if (G2 == 16) {
                    i11 = z5 ? 268435456 : 2;
                } else if (G2 == 24) {
                    i11 = z5 ? 1342177280 : 21;
                } else {
                    if (G2 == 32) {
                        i11 = z5 ? 1610612736 : 22;
                    }
                    i11 = -1;
                }
                xi90Var2.Q(8);
                i10 = round;
                J = G;
                i9 = 32;
                p = 0;
            }
        }
        if (i35 == 1767992678) {
            J = -1;
            i10 = -1;
        } else {
            if (i35 != 1935764850) {
                i12 = i35 == 1935767394 ? 16000 : 8000;
            }
            i10 = i12;
            J = 1;
        }
        int i37 = xi90Var2.b;
        if (i35 == 1701733217) {
            Pair<Integer, lfp0> h2 = h(xi90Var2, i3, i36);
            if (h2 != null) {
                i35 = ((Integer) h2.first).intValue();
                drmInitData2 = drmInitData == null ? null : drmInitData.a(((lfp0) h2.second).b);
                gVar.a[i6] = (lfp0) h2.second;
            } else {
                drmInitData2 = drmInitData;
            }
            xi90Var2.P(i37);
        } else {
            drmInitData2 = drmInitData;
        }
        String str7 = "audio/mhm1";
        if (i35 == 1633889587) {
            i13 = i11;
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i35 == 1700998451) {
            i13 = i11;
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i35 == 1633889588) {
            i13 = i11;
            str2 = "audio/ac4";
        } else {
            if (i35 == 1685353315) {
                str2 = MimeTypes.AUDIO_DTS;
            } else if (i35 == 1685353320 || i35 == 1685353324) {
                str2 = MimeTypes.AUDIO_DTS_HD;
            } else if (i35 == 1685353317) {
                str2 = MimeTypes.AUDIO_DTS_EXPRESS;
            } else if (i35 == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (i35 == 1935764850) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            } else if (i35 == 1935767394) {
                str2 = MimeTypes.AUDIO_AMR_WB;
            } else {
                if (i35 != 1936684916) {
                    if (i35 == 1953984371) {
                        str2 = MimeTypes.AUDIO_RAW;
                        i13 = 268435456;
                    } else if (i35 == 1819304813) {
                        if (i11 != -1) {
                            i13 = i11;
                            str2 = MimeTypes.AUDIO_RAW;
                        }
                    } else if (i35 == 778924082 || i35 == 778924083) {
                        str2 = MimeTypes.AUDIO_MPEG;
                    } else if (i35 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i35 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i35 == 1634492771) {
                        str2 = MimeTypes.AUDIO_ALAC;
                    } else if (i35 == 1634492791) {
                        str2 = MimeTypes.AUDIO_ALAW;
                    } else if (i35 == 1970037111) {
                        str2 = MimeTypes.AUDIO_MLAW;
                    } else if (i35 == 1332770163) {
                        str2 = MimeTypes.AUDIO_OPUS;
                    } else if (i35 == 1716281667) {
                        str2 = MimeTypes.AUDIO_FLAC;
                    } else if (i35 == 1835823201) {
                        str2 = MimeTypes.AUDIO_TRUEHD;
                    } else if (i35 == 1767992678) {
                        str2 = "audio/iamf";
                    } else {
                        i13 = i11;
                        str2 = null;
                    }
                }
                i13 = i8;
                str2 = MimeTypes.AUDIO_RAW;
            }
            i13 = i11;
        }
        c cVar2 = null;
        String str8 = null;
        List<byte[]> list2 = null;
        a aVar = null;
        while (i37 - i3 < i36) {
            xi90Var2.P(i37);
            int p2 = xi90Var2.p();
            int i38 = i13;
            x19.w("childAtomSize must be positive", p2 > 0);
            int p3 = xi90Var2.p();
            String str9 = str8;
            if (p3 == 1835557187) {
                xi90Var2.P(i37 + 8);
                xi90Var2.Q(1);
                int C = xi90Var2.C();
                xi90Var2.Q(1);
                str8 = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(C)) : String.format("mha1.%02X", Integer.valueOf(C));
                int J2 = xi90Var2.J();
                byte[] bArr = new byte[J2];
                str3 = str2;
                xi90Var2.n(bArr, 0, J2);
                i19 = p2;
                i18 = i37;
                str4 = str7;
                list = list2 == null ? ImmutableList.p(bArr) : ImmutableList.q(bArr, list2.get(0));
                i13 = i38;
            } else {
                str3 = str2;
                if (p3 == 1835557200) {
                    xi90Var2.P(i37 + 8);
                    int C2 = xi90Var2.C();
                    if (C2 > 0) {
                        byte[] bArr2 = new byte[C2];
                        xi90Var2.n(bArr2, 0, C2);
                        list2 = list2 == null ? ImmutableList.p(bArr2) : ImmutableList.q(list2.get(0), bArr2);
                    }
                    i19 = p2;
                    i18 = i37;
                    str4 = str7;
                    list = list2;
                    i13 = i38;
                    str8 = str9;
                } else {
                    if (p3 == 1702061171) {
                        i14 = i37;
                        i15 = i35;
                        i16 = 1702061171;
                    } else if (z && p3 == 2002876005) {
                        i14 = i37;
                        i15 = i35;
                        i16 = 1702061171;
                    } else if (p3 == 1651798644) {
                        xi90Var2.P(i37 + 8);
                        xi90Var2.Q(4);
                        cVar = cVar2;
                        aVar = new a(xi90Var2.E(), xi90Var2.E());
                        i18 = i37;
                        str4 = str7;
                        list = list2;
                        i13 = i38;
                        str8 = str9;
                        i19 = p2;
                        str5 = str3;
                        i15 = i35;
                        int i39 = i18 + i19;
                        i8 = 2;
                        i9 = 32;
                        i36 = i4;
                        cVar2 = cVar;
                        i35 = i15;
                        str2 = str5;
                        str7 = str4;
                        list2 = list;
                        i37 = i39;
                        xi90Var2 = xi90Var;
                    } else {
                        int[] iArr = ni.d;
                        int[] iArr2 = ni.b;
                        if (p3 == 1684103987) {
                            xi90Var2.P(i37 + 8);
                            String num = Integer.toString(i5);
                            wi90 wi90Var = new wi90();
                            wi90Var.k(xi90Var2);
                            int i40 = iArr2[wi90Var.g(i8)];
                            wi90Var.o(8);
                            int i41 = iArr[wi90Var.g(3)];
                            if (wi90Var.g(1) != 0) {
                                i41++;
                            }
                            int i42 = ni.e[wi90Var.g(5)] * 1000;
                            wi90Var.c();
                            xi90Var2.P(wi90Var.d());
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.a = num;
                            c0043a.m = io20.q(MimeTypes.AUDIO_AC3);
                            c0043a.E = i41;
                            c0043a.F = i40;
                            c0043a.q = drmInitData2;
                            c0043a.d = str;
                            c0043a.h = i42;
                            c0043a.i = i42;
                            gVar.b = new androidx.media3.common.a(c0043a);
                            i20 = i37;
                            i21 = J;
                            str4 = str7;
                            list = list2;
                        } else if (p3 == 1684366131) {
                            xi90Var2.P(i37 + 8);
                            String num2 = Integer.toString(i5);
                            wi90 wi90Var2 = new wi90();
                            wi90Var2.k(xi90Var2);
                            int g4 = wi90Var2.g(13) * 1000;
                            str4 = str7;
                            wi90Var2.o(3);
                            int i43 = iArr2[wi90Var2.g(2)];
                            wi90Var2.o(10);
                            int i44 = iArr[wi90Var2.g(3)];
                            if (wi90Var2.g(1) != 0) {
                                i44++;
                            }
                            wi90Var2.o(3);
                            int g5 = wi90Var2.g(4);
                            wi90Var2.o(1);
                            int i45 = i44;
                            if (g5 > 0) {
                                wi90Var2.o(6);
                                i44 = wi90Var2.g(1) != 0 ? i45 + 2 : i45;
                                wi90Var2.o(1);
                            }
                            list = list2;
                            if (wi90Var2.b() > 7) {
                                wi90Var2.o(7);
                                if (wi90Var2.g(1) != 0) {
                                    str6 = MimeTypes.AUDIO_E_AC3_JOC;
                                    wi90Var2.c();
                                    xi90Var2.P(wi90Var2.d());
                                    a.C0043a c0043a2 = new a.C0043a();
                                    c0043a2.a = num2;
                                    c0043a2.m = io20.q(str6);
                                    c0043a2.E = i44;
                                    c0043a2.F = i43;
                                    c0043a2.q = drmInitData2;
                                    c0043a2.d = str;
                                    c0043a2.i = g4;
                                    gVar.b = new androidx.media3.common.a(c0043a2);
                                    i20 = i37;
                                    i21 = J;
                                }
                            }
                            str6 = MimeTypes.AUDIO_E_AC3;
                            wi90Var2.c();
                            xi90Var2.P(wi90Var2.d());
                            a.C0043a c0043a22 = new a.C0043a();
                            c0043a22.a = num2;
                            c0043a22.m = io20.q(str6);
                            c0043a22.E = i44;
                            c0043a22.F = i43;
                            c0043a22.q = drmInitData2;
                            c0043a22.d = str;
                            c0043a22.i = g4;
                            gVar.b = new androidx.media3.common.a(c0043a22);
                            i20 = i37;
                            i21 = J;
                        } else {
                            str4 = str7;
                            list = list2;
                            if (p3 == 1684103988) {
                                xi90Var2.P(i37 + 8);
                                String num3 = Integer.toString(i5);
                                wi90 wi90Var3 = new wi90();
                                wi90Var3.k(xi90Var2);
                                int b2 = wi90Var3.b();
                                int g6 = wi90Var3.g(3);
                                if (g6 > 1) {
                                    throw ParserException.c("Unsupported AC-4 DSI version: " + g6);
                                }
                                int g7 = wi90Var3.g(7);
                                int i46 = wi90Var3.f() ? 48000 : 44100;
                                wi90Var3.o(4);
                                int g8 = wi90Var3.g(9);
                                if (g7 > 1) {
                                    if (g6 == 0) {
                                        throw ParserException.c("Invalid AC-4 DSI version: " + g6);
                                    }
                                    if (wi90Var3.f()) {
                                        wi90Var3.o(16);
                                        if (wi90Var3.f()) {
                                            wi90Var3.o(128);
                                        }
                                    }
                                }
                                if (g6 == 1) {
                                    i23 = g7;
                                    if (wi90Var3.b() < 66) {
                                        throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    wi90Var3.o(66);
                                    wi90Var3.c();
                                } else {
                                    i23 = g7;
                                }
                                ri.a aVar2 = new ri.a();
                                aVar2.a = true;
                                aVar2.b = -1;
                                aVar2.c = -1;
                                aVar2.d = true;
                                i20 = i37;
                                aVar2.e = 2;
                                aVar2.f = 1;
                                aVar2.g = 0;
                                int i47 = 0;
                                while (i47 < g8) {
                                    if (g6 == 0) {
                                        i26 = i10;
                                        f2 = wi90Var3.f();
                                        g2 = wi90Var3.g(5);
                                        g3 = wi90Var3.g(5);
                                        i31 = 0;
                                        i32 = 0;
                                        z2 = false;
                                    } else {
                                        int i48 = g8;
                                        int g9 = wi90Var3.g(8);
                                        i26 = i10;
                                        int g10 = wi90Var3.g(8);
                                        if (g10 == 255) {
                                            g10 = wi90Var3.g(16) + g10;
                                        }
                                        if (g9 > 2) {
                                            wi90Var3.o(g10 * 8);
                                            i47++;
                                            g8 = i48;
                                            i10 = i26;
                                        } else {
                                            int b3 = (b2 - wi90Var3.b()) / 8;
                                            int i49 = g10;
                                            int g11 = wi90Var3.g(5);
                                            z2 = g11 == 31;
                                            g2 = g11;
                                            i32 = b3;
                                            i31 = i49;
                                            g3 = g9;
                                            f2 = false;
                                        }
                                    }
                                    aVar2.f = g3;
                                    i25 = J;
                                    if (f2 || z2 || g2 != 6) {
                                        i24 = i35;
                                        aVar2.g = wi90Var3.g(3);
                                        if (wi90Var3.f()) {
                                            wi90Var3.o(5);
                                        }
                                        wi90Var3.o(2);
                                        int i50 = 1;
                                        if (g6 == 1 && (g3 == 1 || g3 == 2)) {
                                            wi90Var3.o(2);
                                        }
                                        wi90Var3.o(5);
                                        wi90Var3.o(10);
                                        if (g6 == 1) {
                                            if (g3 > 0) {
                                                aVar2.a = wi90Var3.f();
                                            }
                                            if (aVar2.a) {
                                                if (g3 != 1) {
                                                    i34 = 2;
                                                }
                                                int g12 = wi90Var3.g(5);
                                                if (g12 >= 0 && g12 <= 15) {
                                                    aVar2.b = g12;
                                                }
                                                if (g12 < 11 || g12 > 14) {
                                                    i34 = 2;
                                                } else {
                                                    aVar2.d = wi90Var3.f();
                                                    i34 = 2;
                                                    aVar2.e = wi90Var3.g(2);
                                                }
                                                wi90Var3.o(24);
                                                i50 = 1;
                                            } else {
                                                i34 = 2;
                                            }
                                            if (g3 == i50 || g3 == i34) {
                                                if (wi90Var3.f() && wi90Var3.f()) {
                                                    wi90Var3.o(i34);
                                                }
                                                if (wi90Var3.f()) {
                                                    wi90Var3.n();
                                                    int i51 = 8;
                                                    int g13 = wi90Var3.g(8);
                                                    i33 = g3;
                                                    int i52 = 0;
                                                    while (i52 < g13) {
                                                        wi90Var3.o(i51);
                                                        i52++;
                                                        i51 = 8;
                                                    }
                                                    if (f2 && !z2) {
                                                        wi90Var3.n();
                                                        if (g2 == 0 || g2 == 1 || g2 == 2) {
                                                            if (i33 == 0) {
                                                                for (int i53 = 0; i53 < 2; i53++) {
                                                                    ri.c(wi90Var3, aVar2);
                                                                }
                                                            } else {
                                                                for (int i54 = 0; i54 < 2; i54++) {
                                                                    ri.d(wi90Var3, aVar2);
                                                                }
                                                            }
                                                        } else if (g2 == 3 || g2 == 4) {
                                                            if (i33 == 0) {
                                                                for (int i55 = 0; i55 < 3; i55++) {
                                                                    ri.c(wi90Var3, aVar2);
                                                                }
                                                            } else {
                                                                for (int i56 = 0; i56 < 3; i56++) {
                                                                    ri.d(wi90Var3, aVar2);
                                                                }
                                                            }
                                                        } else if (g2 != 5) {
                                                            int g14 = wi90Var3.g(7);
                                                            for (int i57 = 0; i57 < g14; i57++) {
                                                                wi90Var3.o(8);
                                                            }
                                                        } else if (i33 == 0) {
                                                            ri.c(wi90Var3, aVar2);
                                                        } else {
                                                            int g15 = wi90Var3.g(3);
                                                            for (int i58 = 0; i58 < g15 + 2; i58++) {
                                                                ri.d(wi90Var3, aVar2);
                                                            }
                                                        }
                                                    } else if (i33 != 0) {
                                                        ri.c(wi90Var3, aVar2);
                                                    } else {
                                                        ri.d(wi90Var3, aVar2);
                                                    }
                                                    wi90Var3.n();
                                                    f3 = wi90Var3.f();
                                                }
                                            }
                                        }
                                        i33 = g3;
                                        if (f2) {
                                        }
                                        if (i33 != 0) {
                                        }
                                        wi90Var3.n();
                                        f3 = wi90Var3.f();
                                    } else {
                                        i24 = i35;
                                        i33 = g3;
                                        f3 = true;
                                    }
                                    if (f3) {
                                        int g16 = wi90Var3.g(7);
                                        for (int i59 = 0; i59 < g16; i59++) {
                                            wi90Var3.o(15);
                                        }
                                    }
                                    if (i33 > 0) {
                                        if (wi90Var3.f()) {
                                            if (wi90Var3.b() < 66) {
                                                z3 = false;
                                            } else {
                                                wi90Var3.o(66);
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                throw ParserException.c("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (wi90Var3.f()) {
                                            wi90Var3.c();
                                            wi90Var3.p(wi90Var3.g(16));
                                            int g17 = wi90Var3.g(5);
                                            for (int i60 = 0; i60 < g17; i60++) {
                                                wi90Var3.o(3);
                                                wi90Var3.o(8);
                                            }
                                            i27 = 8;
                                            wi90Var3.c();
                                            if (g6 == 1) {
                                                int b4 = ((b2 - wi90Var3.b()) / i27) - i32;
                                                if (i31 < b4) {
                                                    throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                                }
                                                wi90Var3.p(i31 - b4);
                                            }
                                            if (aVar2.a && aVar2.b == -1) {
                                                throw ParserException.c("Can't determine channel mode of presentation " + i47);
                                            }
                                            if (aVar2.a) {
                                                int i61 = aVar2.b;
                                                boolean z6 = aVar2.d;
                                                int i62 = aVar2.e;
                                                switch (i61) {
                                                    case 0:
                                                        i29 = 11;
                                                        i30 = 1;
                                                        break;
                                                    case 1:
                                                        i29 = 11;
                                                        i30 = 2;
                                                        break;
                                                    case 2:
                                                        i29 = 11;
                                                        i30 = 3;
                                                        break;
                                                    case 3:
                                                        i29 = 11;
                                                        i30 = 5;
                                                        break;
                                                    case 4:
                                                        i29 = 11;
                                                        i30 = 6;
                                                        break;
                                                    case 5:
                                                    case 7:
                                                    case 9:
                                                        i29 = 11;
                                                        i30 = 7;
                                                        break;
                                                    case 6:
                                                    case 8:
                                                    case 10:
                                                        i30 = i27;
                                                        i29 = 11;
                                                        break;
                                                    case 11:
                                                        i29 = 11;
                                                        i30 = 11;
                                                        break;
                                                    case 12:
                                                        i30 = 12;
                                                        i29 = 11;
                                                        break;
                                                    case 13:
                                                        i29 = 11;
                                                        i30 = 13;
                                                        break;
                                                    case 14:
                                                        i29 = 11;
                                                        i30 = 14;
                                                        break;
                                                    case 15:
                                                        i29 = 11;
                                                        i30 = 24;
                                                        break;
                                                    default:
                                                        i29 = 11;
                                                        i30 = -1;
                                                        break;
                                                }
                                                if (i61 == i29 || i61 == 12 || i61 == 13 || i61 == 14) {
                                                    if (!z6) {
                                                        i30 -= 2;
                                                    }
                                                    if (i62 == 0) {
                                                        i30 -= 4;
                                                    } else if (i62 == 1) {
                                                        i30 -= 2;
                                                    }
                                                }
                                                i28 = i30;
                                            } else {
                                                int i63 = aVar2.c;
                                                if (i63 > 0) {
                                                    i28 = i63 + 1;
                                                    if (aVar2.g == 4 && i28 == 17) {
                                                        i28 = 21;
                                                    }
                                                } else {
                                                    int i64 = aVar2.g;
                                                    if (i64 != 0) {
                                                        if (i64 == 1) {
                                                            i28 = 6;
                                                        } else if (i64 == 2) {
                                                            i28 = i27;
                                                        } else if (i64 == 3) {
                                                            i28 = 10;
                                                        } else if (i64 != 4) {
                                                            ahn.F("AC-4 level " + aVar2.g + " has not been defined.");
                                                        } else {
                                                            i28 = 12;
                                                        }
                                                    }
                                                    i28 = 2;
                                                }
                                            }
                                            if (i28 <= 0) {
                                                throw ParserException.c("Cannot determine channel count of presentation.");
                                            }
                                            Object[] objArr = {Integer.valueOf(i23), Integer.valueOf(aVar2.f), Integer.valueOf(aVar2.g)};
                                            String str10 = y2r0.a;
                                            String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                            a.C0043a c0043a3 = new a.C0043a();
                                            c0043a3.a = num3;
                                            c0043a3.m = io20.q("audio/ac4");
                                            c0043a3.E = i28;
                                            c0043a3.F = i46;
                                            c0043a3.q = drmInitData2;
                                            c0043a3.d = str;
                                            c0043a3.j = format;
                                            gVar.b = new androidx.media3.common.a(c0043a3);
                                            i10 = i26;
                                            i21 = i25;
                                            i15 = i24;
                                        }
                                    }
                                    i27 = 8;
                                    wi90Var3.c();
                                    if (g6 == 1) {
                                    }
                                    if (aVar2.a) {
                                        throw ParserException.c("Can't determine channel mode of presentation " + i47);
                                    }
                                    if (aVar2.a) {
                                    }
                                    if (i28 <= 0) {
                                    }
                                }
                                i24 = i35;
                                i25 = J;
                                i26 = i10;
                                i27 = 8;
                                if (aVar2.a) {
                                }
                                if (i28 <= 0) {
                                }
                            } else {
                                int i65 = i35;
                                i20 = i37;
                                int i66 = J;
                                int i67 = i10;
                                if (p3 == 1684892784) {
                                    if (p <= 0) {
                                        throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + p);
                                    }
                                    cVar = cVar2;
                                    str5 = str3;
                                    i10 = p;
                                    i13 = i38;
                                    str8 = str9;
                                    i19 = p2;
                                    i18 = i20;
                                    i15 = i65;
                                    J = 2;
                                } else if (p3 == 1684305011 || p3 == 1969517683) {
                                    i15 = i65;
                                    a.C0043a c0043a4 = new a.C0043a();
                                    c0043a4.a = Integer.toString(i5);
                                    c0043a4.m = io20.q(str3);
                                    i21 = i66;
                                    c0043a4.E = i21;
                                    i10 = i67;
                                    c0043a4.F = i10;
                                    c0043a4.q = drmInitData2;
                                    c0043a4.d = str;
                                    gVar.b = new androidx.media3.common.a(c0043a4);
                                } else if (p3 == 1682927731) {
                                    int i68 = p2 - 8;
                                    byte[] bArr3 = a;
                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i68);
                                    xi90Var2.P(i20 + 8);
                                    xi90Var2.n(copyOf, bArr3.length, i68);
                                    cVar = cVar2;
                                    str5 = str3;
                                    list = hr80.o(copyOf);
                                    i13 = i38;
                                    str8 = str9;
                                    i19 = p2;
                                    i18 = i20;
                                    i10 = i67;
                                    J = i66;
                                    i15 = i65;
                                } else {
                                    if (p3 == 1684425825) {
                                        byte[] bArr4 = new byte[p2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        xi90Var2.P(i20 + 12);
                                        xi90Var2.n(bArr4, 4, p2 - 12);
                                        cVar = cVar2;
                                        str5 = str3;
                                        list = ImmutableList.p(bArr4);
                                        i13 = i38;
                                        str8 = str9;
                                    } else if (p3 == 1634492771) {
                                        int i69 = p2 - 12;
                                        byte[] bArr5 = new byte[i69];
                                        xi90Var2.P(i20 + 12);
                                        xi90Var2.n(bArr5, 0, i69);
                                        byte[] bArr6 = tzf.a;
                                        xi90 xi90Var3 = new xi90(bArr5);
                                        xi90Var3.P(5);
                                        int C3 = xi90Var3.C();
                                        xi90Var3.P(9);
                                        int C4 = xi90Var3.C();
                                        xi90Var3.P(20);
                                        int[] iArr3 = {xi90Var3.G(), C4, C3};
                                        int i70 = iArr3[0];
                                        int i71 = iArr3[1];
                                        int i72 = iArr3[2];
                                        String str11 = y2r0.a;
                                        str5 = str3;
                                        i13 = y2r0.F(i72, ByteOrder.LITTLE_ENDIAN);
                                        J = i71;
                                        list = ImmutableList.p(bArr5);
                                        str8 = str9;
                                        i19 = p2;
                                        i18 = i20;
                                        cVar = cVar2;
                                        i10 = i70;
                                        i15 = i65;
                                        int i392 = i18 + i19;
                                        i8 = 2;
                                        i9 = 32;
                                        i36 = i4;
                                        cVar2 = cVar;
                                        i35 = i15;
                                        str2 = str5;
                                        str7 = str4;
                                        list2 = list;
                                        i37 = i392;
                                        xi90Var2 = xi90Var;
                                    } else if (p3 == 1767990114) {
                                        xi90Var2.P(i20 + 9);
                                        int H = xi90Var2.H();
                                        byte[] bArr7 = new byte[H];
                                        xi90Var2.n(bArr7, 0, H);
                                        byte[] bArr8 = tzf.a;
                                        xi90 xi90Var4 = new xi90(bArr7);
                                        String str12 = null;
                                        String str13 = null;
                                        while (xi90Var4.a() > 0 && (str12 == null || str13 == null)) {
                                            int C5 = xi90Var4.C();
                                            int i73 = C5 >> 3;
                                            boolean z7 = (C5 & 2) != 0;
                                            boolean z8 = (C5 & 1) != 0;
                                            int H2 = xi90Var4.H();
                                            if (i73 > 4 && i73 < 24 && z7) {
                                                do {
                                                } while ((xi90Var4.C() & 128) != 0);
                                                for (i22 = 128; (xi90Var4.C() & i22) != 0; i22 = 128) {
                                                }
                                            }
                                            if (z8) {
                                                xi90Var4.Q(xi90Var4.H());
                                            }
                                            int i74 = xi90Var4.b + H2;
                                            if (i73 == 31) {
                                                xi90Var4.Q(4);
                                                Object[] objArr2 = {Integer.valueOf(xi90Var4.C()), Integer.valueOf(xi90Var4.C())};
                                                String str14 = y2r0.a;
                                                str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                            } else if (i73 == 0) {
                                                while ((xi90Var4.C() & 128) != 0) {
                                                }
                                                str13 = xi90Var4.A(4, StandardCharsets.UTF_8);
                                                if (str13.equals(AudioSampleEntry.TYPE3)) {
                                                    while ((xi90Var4.C() & 128) != 0) {
                                                    }
                                                    xi90Var4.Q(2);
                                                    wi90 wi90Var4 = new wi90();
                                                    wi90Var4.k(xi90Var4);
                                                    int g18 = wi90Var4.g(5);
                                                    if (g18 == 31) {
                                                        g18 = wi90Var4.g(6) + 32;
                                                    }
                                                    str13 = na8.a(g18, str13, ".40.");
                                                    xi90Var4.P(i74);
                                                } else {
                                                    xi90Var4.P(i74);
                                                }
                                            }
                                            xi90Var4.P(i74);
                                        }
                                        str8 = (str12 == null || str13 == null) ? null : pzl.b(str12, ".", str13);
                                        cVar = cVar2;
                                        str5 = str3;
                                        list = ImmutableList.p(bArr7);
                                        i13 = i38;
                                    } else if (p3 == 1885564227) {
                                        xi90Var2.P(i20 + 12);
                                        ByteOrder byteOrder = (xi90Var2.C() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int C6 = xi90Var2.C();
                                        i15 = i65;
                                        i13 = i15 == 1768973165 ? y2r0.F(C6, byteOrder) : (i15 == 1718641517 && C6 == i9 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i38;
                                        cVar = cVar2;
                                        if (i13 != -1) {
                                            str8 = str9;
                                            str5 = MimeTypes.AUDIO_RAW;
                                        } else {
                                            str5 = str3;
                                            str8 = str9;
                                        }
                                        i19 = p2;
                                        i18 = i20;
                                        i10 = i67;
                                        J = i66;
                                        int i3922 = i18 + i19;
                                        i8 = 2;
                                        i9 = 32;
                                        i36 = i4;
                                        cVar2 = cVar;
                                        i35 = i15;
                                        str2 = str5;
                                        str7 = str4;
                                        list2 = list;
                                        i37 = i3922;
                                        xi90Var2 = xi90Var;
                                    } else {
                                        i15 = i65;
                                        i10 = i67;
                                        i21 = i66;
                                    }
                                    i19 = p2;
                                    i18 = i20;
                                    i10 = i67;
                                    J = i66;
                                    i15 = i65;
                                    int i39222 = i18 + i19;
                                    i8 = 2;
                                    i9 = 32;
                                    i36 = i4;
                                    cVar2 = cVar;
                                    i35 = i15;
                                    str2 = str5;
                                    str7 = str4;
                                    list2 = list;
                                    i37 = i39222;
                                    xi90Var2 = xi90Var;
                                }
                                int i392222 = i18 + i19;
                                i8 = 2;
                                i9 = 32;
                                i36 = i4;
                                cVar2 = cVar;
                                i35 = i15;
                                str2 = str5;
                                str7 = str4;
                                list2 = list;
                                i37 = i392222;
                                xi90Var2 = xi90Var;
                            }
                            str5 = str3;
                            J = i21;
                            i13 = i38;
                            str8 = str9;
                            i19 = p2;
                            i18 = i20;
                            cVar = cVar2;
                            int i3922222 = i18 + i19;
                            i8 = 2;
                            i9 = 32;
                            i36 = i4;
                            cVar2 = cVar;
                            i35 = i15;
                            str2 = str5;
                            str7 = str4;
                            list2 = list;
                            i37 = i3922222;
                            xi90Var2 = xi90Var;
                        }
                        i15 = i35;
                        str5 = str3;
                        J = i21;
                        i13 = i38;
                        str8 = str9;
                        i19 = p2;
                        i18 = i20;
                        cVar = cVar2;
                        int i39222222 = i18 + i19;
                        i8 = 2;
                        i9 = 32;
                        i36 = i4;
                        cVar2 = cVar;
                        i35 = i15;
                        str2 = str5;
                        str7 = str4;
                        list2 = list;
                        i37 = i39222222;
                        xi90Var2 = xi90Var;
                    }
                    int i75 = p2;
                    int i76 = J;
                    str4 = str7;
                    list = list2;
                    if (p3 == i16) {
                        i19 = i75;
                        i17 = i14;
                        i18 = i17;
                    } else {
                        i17 = xi90Var2.b;
                        i18 = i14;
                        x19.w(null, i17 >= i18);
                        while (true) {
                            i19 = i75;
                            if (i17 - i18 < i19) {
                                xi90Var2.P(i17);
                                int p4 = xi90Var2.p();
                                x19.w("childAtomSize must be positive", p4 > 0);
                                if (xi90Var2.p() != 1702061171) {
                                    i17 += p4;
                                    i75 = i19;
                                }
                            } else {
                                i17 = -1;
                            }
                        }
                    }
                    if (i17 != -1) {
                        c c2 = c(i17, xi90Var2);
                        str5 = c2.a;
                        byte[] bArr9 = c2.b;
                        if (bArr9 == null) {
                            cVar2 = c2;
                        } else if (MimeTypes.AUDIO_VORBIS.equals(str5)) {
                            xi90 xi90Var5 = new xi90(bArr9);
                            xi90Var5.Q(1);
                            int i77 = 0;
                            while (xi90Var5.a() > 0 && xi90Var5.m() == 255) {
                                i77 += 255;
                                xi90Var5.Q(1);
                            }
                            int C7 = xi90Var5.C() + i77;
                            int i78 = 0;
                            while (true) {
                                if (xi90Var5.a() > 0) {
                                    cVar2 = c2;
                                    if (xi90Var5.m() == 255) {
                                        i78 += 255;
                                        xi90Var5.Q(1);
                                        c2 = cVar2;
                                    }
                                } else {
                                    cVar2 = c2;
                                }
                            }
                            int C8 = xi90Var5.C() + i78;
                            byte[] bArr10 = new byte[C7];
                            int i79 = xi90Var5.b;
                            System.arraycopy(bArr9, i79, bArr10, 0, C7);
                            int i80 = i79 + C7 + C8;
                            int length = bArr9.length - i80;
                            byte[] bArr11 = new byte[length];
                            System.arraycopy(bArr9, i80, bArr11, 0, length);
                            list = ImmutableList.q(bArr10, bArr11);
                        } else {
                            if ("audio/mp4a-latm".equals(str5)) {
                                l0.a b5 = l0.b(new wi90(bArr9, bArr9.length), false);
                                i10 = b5.a;
                                J = b5.b;
                                str8 = b5.c;
                            } else {
                                J = i76;
                                str8 = str9;
                            }
                            cVar = c2;
                            list = ImmutableList.p(bArr9);
                            i13 = i38;
                            int i392222222 = i18 + i19;
                            i8 = 2;
                            i9 = 32;
                            i36 = i4;
                            cVar2 = cVar;
                            i35 = i15;
                            str2 = str5;
                            str7 = str4;
                            list2 = list;
                            i37 = i392222222;
                            xi90Var2 = xi90Var;
                        }
                    } else {
                        str5 = str3;
                    }
                    J = i76;
                    str8 = str9;
                    cVar = cVar2;
                    i13 = i38;
                    int i3922222222 = i18 + i19;
                    i8 = 2;
                    i9 = 32;
                    i36 = i4;
                    cVar2 = cVar;
                    i35 = i15;
                    str2 = str5;
                    str7 = str4;
                    list2 = list;
                    i37 = i3922222222;
                    xi90Var2 = xi90Var;
                }
            }
            cVar = cVar2;
            str5 = str3;
            i15 = i35;
            int i39222222222 = i18 + i19;
            i8 = 2;
            i9 = 32;
            i36 = i4;
            cVar2 = cVar;
            i35 = i15;
            str2 = str5;
            str7 = str4;
            list2 = list;
            i37 = i39222222222;
            xi90Var2 = xi90Var;
        }
        String str15 = str2;
        int i81 = J;
        int i82 = i13;
        String str16 = str8;
        List<byte[]> list3 = list2;
        if (gVar.b != null || str15 == null) {
            return;
        }
        a.C0043a c0043a5 = new a.C0043a();
        c0043a5.a = Integer.toString(i5);
        c0043a5.m = io20.q(str15);
        c0043a5.j = str16;
        c0043a5.E = i81;
        c0043a5.F = i10;
        c0043a5.G = i82;
        c0043a5.p = list3;
        c0043a5.q = drmInitData2;
        c0043a5.d = str;
        if (cVar2 != null) {
            c cVar3 = cVar2;
            c0043a5.h = ipx.w(cVar3.c);
            c0043a5.i = ipx.w(cVar3.d);
        } else {
            a aVar3 = aVar;
            if (aVar3 != null) {
                c0043a5.h = ipx.w(aVar3.a);
                c0043a5.i = ipx.w(aVar3.b);
            }
        }
        gVar.b = new androidx.media3.common.a(c0043a5);
    }

    public static c c(int i2, xi90 xi90Var) {
        xi90Var.P(i2 + 12);
        xi90Var.Q(1);
        d(xi90Var);
        xi90Var.Q(2);
        int C = xi90Var.C();
        if ((C & 128) != 0) {
            xi90Var.Q(2);
        }
        if ((C & 64) != 0) {
            xi90Var.Q(xi90Var.C());
        }
        if ((C & 32) != 0) {
            xi90Var.Q(2);
        }
        xi90Var.Q(1);
        d(xi90Var);
        String f2 = io20.f(xi90Var.C());
        if (MimeTypes.AUDIO_MPEG.equals(f2) || MimeTypes.AUDIO_DTS.equals(f2) || MimeTypes.AUDIO_DTS_HD.equals(f2)) {
            return new c(f2, null, -1L, -1L);
        }
        xi90Var.Q(4);
        long E = xi90Var.E();
        long E2 = xi90Var.E();
        xi90Var.Q(1);
        int d2 = d(xi90Var);
        long j2 = E2;
        byte[] bArr = new byte[d2];
        xi90Var.n(bArr, 0, d2);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new c(f2, bArr, j2, E > 0 ? E : -1L);
    }

    public static int d(xi90 xi90Var) {
        int C = xi90Var.C();
        int i2 = C & 127;
        while ((C & 128) == 128) {
            C = xi90Var.C();
            i2 = (i2 << 7) | (C & 127);
        }
        return i2;
    }

    public static int e(int i2) {
        return (i2 >> 24) & 255;
    }

    @Nullable
    public static fi20 f(sf30.a aVar) {
        vo10 vo10Var;
        sf30.b c2 = aVar.c(1751411826);
        sf30.b c3 = aVar.c(1801812339);
        sf30.b c4 = aVar.c(1768715124);
        if (c2 != null && c3 != null && c4 != null) {
            xi90 xi90Var = c2.b;
            xi90Var.P(16);
            if (xi90Var.p() == 1835299937) {
                xi90 xi90Var2 = c3.b;
                xi90Var2.P(12);
                int p = xi90Var2.p();
                String[] strArr = new String[p];
                for (int i2 = 0; i2 < p; i2++) {
                    int p2 = xi90Var2.p();
                    xi90Var2.Q(4);
                    strArr[i2] = xi90Var2.A(p2 - 8, StandardCharsets.UTF_8);
                }
                xi90 xi90Var3 = c4.b;
                xi90Var3.P(8);
                ArrayList arrayList = new ArrayList();
                while (xi90Var3.a() > 8) {
                    int i3 = xi90Var3.b;
                    int p3 = xi90Var3.p();
                    int p4 = xi90Var3.p() - 1;
                    if (p4 < 0 || p4 >= p) {
                        sn.d(p4, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[p4];
                        int i4 = i3 + p3;
                        while (true) {
                            int i5 = xi90Var3.b;
                            if (i5 >= i4) {
                                vo10Var = null;
                                break;
                            }
                            int p5 = xi90Var3.p();
                            if (xi90Var3.p() == 1684108385) {
                                int p6 = xi90Var3.p();
                                int p7 = xi90Var3.p();
                                int i6 = p5 - 16;
                                byte[] bArr = new byte[i6];
                                xi90Var3.n(bArr, 0, i6);
                                vo10Var = new vo10(str, bArr, p7, p6);
                                break;
                            }
                            xi90Var3.P(i5 + p5);
                        }
                        if (vo10Var != null) {
                            arrayList.add(vo10Var);
                        }
                    }
                    xi90Var3.P(i3 + p3);
                }
                if (!arrayList.isEmpty()) {
                    return new fi20(arrayList);
                }
            }
        }
        return null;
    }

    public static yf30 g(xi90 xi90Var) {
        long w;
        long w2;
        xi90Var.P(8);
        if (e(xi90Var.p()) == 0) {
            w = xi90Var.E();
            w2 = xi90Var.E();
        } else {
            w = xi90Var.w();
            w2 = xi90Var.w();
        }
        return new yf30(w, w2, xi90Var.E());
    }

    @Nullable
    public static Pair<Integer, lfp0> h(xi90 xi90Var, int i2, int i3) throws ParserException {
        Integer num;
        lfp0 lfp0Var;
        Pair<Integer, lfp0> create;
        int i4;
        int i5;
        Integer num2;
        boolean z;
        int i6 = xi90Var.b;
        while (i6 - i2 < i3) {
            xi90Var.P(i6);
            int p = xi90Var.p();
            x19.w("childAtomSize must be positive", p > 0);
            if (xi90Var.p() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer num3 = null;
                String str = null;
                while (i7 - i6 < p) {
                    xi90Var.P(i7);
                    int p2 = xi90Var.p();
                    int p3 = xi90Var.p();
                    if (p3 == 1718775137) {
                        num3 = Integer.valueOf(xi90Var.p());
                    } else if (p3 == 1935894637) {
                        xi90Var.Q(4);
                        str = xi90Var.A(4, StandardCharsets.UTF_8);
                    } else if (p3 == 1935894633) {
                        i9 = i7;
                        i8 = p2;
                    }
                    i7 += p2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    x19.w("frma atom is mandatory", num3 != null);
                    x19.w("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            num = num3;
                            lfp0Var = null;
                            break;
                        }
                        xi90Var.P(i10);
                        int p4 = xi90Var.p();
                        if (xi90Var.p() == 1952804451) {
                            int e2 = e(xi90Var.p());
                            xi90Var.Q(1);
                            if (e2 == 0) {
                                xi90Var.Q(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int C = xi90Var.C();
                                i4 = C & 15;
                                i5 = (C & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (xi90Var.C() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int C2 = xi90Var.C();
                            byte[] bArr2 = new byte[16];
                            xi90Var.n(bArr2, 0, 16);
                            if (z && C2 == 0) {
                                int C3 = xi90Var.C();
                                byte[] bArr3 = new byte[C3];
                                xi90Var.n(bArr3, 0, C3);
                                bArr = bArr3;
                            }
                            num = num2;
                            lfp0Var = new lfp0(z, str, C2, bArr2, i5, i4, bArr);
                        } else {
                            i10 += p4;
                        }
                    }
                    x19.w("tenc atom is mandatory", lfp0Var != null);
                    String str2 = y2r0.a;
                    create = Pair.create(num, lfp0Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i6 += p;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0946  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g i(xi90 xi90Var, j jVar, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        int i2;
        int i3;
        DrmInitData drmInitData2;
        int i4;
        int i5;
        int i6;
        char c2;
        String str2;
        int i7;
        int i8;
        String str3;
        String str4;
        g gVar;
        int i9;
        rt50.k kVar;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        char c3;
        int i14;
        int i15;
        int g2;
        int i16;
        int i17;
        int i18;
        int i19;
        m6g m6gVar;
        int i20;
        int g3;
        m6g m6gVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        d dVar;
        DrmInitData drmInitData3;
        DrmInitData a2;
        int i26;
        int i27;
        String str5;
        com.google.common.collect.g gVar2;
        long j2;
        xi90 xi90Var2 = xi90Var;
        j jVar2 = jVar;
        String str6 = str;
        int i28 = jVar2.a;
        xi90Var2.P(12);
        int p = xi90Var2.p();
        g gVar3 = new g(p);
        int i29 = 0;
        while (i29 < p) {
            int i30 = xi90Var2.b;
            int p2 = xi90Var2.p();
            String str7 = "childAtomSize must be positive";
            x19.w("childAtomSize must be positive", p2 > 0);
            int p3 = xi90Var2.p();
            byte b2 = 3;
            int i31 = 8;
            if (p3 == 1635148593 || p3 == 1635148595 || p3 == 1701733238 || p3 == 1831958048 || p3 == 1836070006 || p3 == 1752589105 || p3 == 1751479857 || p3 == 1932670515 || p3 == 1211250227 || p3 == 1748121139 || p3 == 1987063864 || p3 == 1987063865 || p3 == 1635135537 || p3 == 1685479798 || p3 == 1685479729 || p3 == 1685481573 || p3 == 1685481521 || p3 == 1634760241) {
                int i32 = jVar2.c;
                xi90Var2.P(i30 + 16);
                xi90Var2.Q(16);
                int J = xi90Var2.J();
                int J2 = xi90Var2.J();
                xi90Var2.Q(50);
                int i33 = xi90Var2.b;
                i2 = i29;
                if (p3 == 1701733238) {
                    Pair<Integer, lfp0> h2 = h(xi90Var2, i30, p2);
                    if (h2 != null) {
                        p3 = ((Integer) h2.first).intValue();
                        if (drmInitData == null) {
                            i3 = i30;
                            a2 = null;
                        } else {
                            i3 = i30;
                            a2 = drmInitData.a(((lfp0) h2.second).b);
                        }
                        drmInitData3 = a2;
                        gVar3.a[i2] = (lfp0) h2.second;
                    } else {
                        i3 = i30;
                        drmInitData3 = drmInitData;
                    }
                    xi90Var2.P(i33);
                    drmInitData2 = drmInitData3;
                } else {
                    i3 = i30;
                    drmInitData2 = drmInitData;
                }
                DrmInitData drmInitData4 = drmInitData2;
                i4 = i28;
                i5 = p;
                int i34 = 8;
                int i35 = 8;
                String str8 = p3 == 1831958048 ? MimeTypes.VIDEO_MPEG : p3 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
                float f2 = 1.0f;
                int i36 = -1;
                int i37 = -1;
                int i38 = -1;
                List<byte[]> list = null;
                rt50.k kVar2 = null;
                ByteBuffer byteBuffer = null;
                String str9 = null;
                boolean z2 = false;
                int i39 = -1;
                int i40 = -1;
                byte[] bArr2 = null;
                int i41 = -1;
                int i42 = -1;
                pvn pvnVar = null;
                a aVar = null;
                c cVar = null;
                int i43 = i33;
                int i44 = -1;
                while (i43 - i3 < p2) {
                    xi90Var2.P(i43);
                    int i45 = xi90Var2.b;
                    int i46 = i43;
                    int p4 = xi90Var2.p();
                    if (p4 == 0 && xi90Var2.b - i3 == p2) {
                        break;
                    }
                    x19.w(str7, p4 > 0);
                    int p5 = xi90Var2.p();
                    int i47 = p2;
                    if (p5 == 1635148611) {
                        x19.w(null, str8 == null);
                        xi90Var2.P(i45 + 8);
                        bt5 a3 = bt5.a(xi90Var2);
                        list = a3.a;
                        gVar3.c = a3.b;
                        float f3 = !z2 ? a3.k : f2;
                        String str10 = a3.l;
                        int i48 = a3.j;
                        i38 = a3.g;
                        int i49 = a3.h;
                        i44 = a3.i;
                        int i50 = a3.e;
                        i34 = a3.f;
                        i40 = i48;
                        i7 = p3;
                        i11 = i36;
                        str3 = str7;
                        gVar = gVar3;
                        f2 = f3;
                        i8 = i50;
                        i10 = i31;
                        str4 = "video/avc";
                        str9 = str10;
                        i37 = i49;
                    } else {
                        i7 = p3;
                        if (p5 == 1752589123) {
                            x19.w(null, str8 == null);
                            xi90Var2.P(i45 + 8);
                            f2v a4 = f2v.a(xi90Var2, false, null);
                            list = a4.a;
                            gVar3.c = a4.b;
                            float f4 = !z2 ? a4.l : f2;
                            int i51 = a4.m;
                            int i52 = a4.c;
                            String str11 = a4.n;
                            int i53 = a4.k;
                            if (i53 != -1) {
                                i36 = i53;
                            }
                            int i54 = a4.d;
                            int i55 = a4.e;
                            i38 = a4.h;
                            int i56 = a4.i;
                            int i57 = a4.j;
                            int i58 = a4.f;
                            i34 = a4.g;
                            str4 = "video/hevc";
                            i11 = i36;
                            str3 = str7;
                            gVar = gVar3;
                            f2 = f4;
                            i42 = i54;
                            i41 = i55;
                            i37 = i56;
                            i10 = i31;
                            i44 = i57;
                            i8 = i58;
                            i40 = i51;
                            kVar2 = a4.o;
                            i39 = i52;
                            str9 = str11;
                        } else {
                            int i59 = i36;
                            if (p5 == 1818785347) {
                                x19.w("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                                x19.w("must have at least two layers", kVar2 != null && kVar2.a.size() >= 2);
                                xi90Var2.P(i45 + 8);
                                kVar2.getClass();
                                f2v a5 = f2v.a(xi90Var2, true, kVar2);
                                x19.w("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", gVar3.c == a5.b);
                                int i60 = a5.h;
                                if (i60 != -1) {
                                    x19.w("colorSpace must be the same for both views", i38 == i60);
                                }
                                int i61 = a5.i;
                                if (i61 != -1) {
                                    x19.w("colorRange must be the same for both views", i37 == i61);
                                }
                                int i62 = a5.j;
                                if (i62 != -1) {
                                    x19.w("colorTransfer must be the same for both views", i44 == i62);
                                }
                                x19.w("bitdepthLuma must be the same for both views", i35 == a5.f);
                                x19.w("bitdepthChroma must be the same for both views", i34 == a5.g);
                                if (list != null) {
                                    ImmutableList.b bVar = ImmutableList.c;
                                    ImmutableList.a aVar2 = new ImmutableList.a();
                                    aVar2.e(list);
                                    aVar2.e(a5.a);
                                    list = aVar2.g();
                                } else {
                                    x19.w("initializationData must be already set from hvcC atom", false);
                                }
                                i8 = i35;
                                str9 = a5.n;
                                str4 = "video/mv-hevc";
                                gVar = gVar3;
                                i10 = i31;
                                i11 = i59;
                                str3 = str7;
                            } else {
                                if (p5 == 1986361461) {
                                    xi90Var2.P(i45 + 8);
                                    int i63 = xi90Var2.b;
                                    d dVar2 = null;
                                    while (i63 - i45 < p4) {
                                        xi90Var2.P(i63);
                                        int p6 = xi90Var2.p();
                                        x19.w(str7, p6 > 0);
                                        int i64 = i34;
                                        if (xi90Var2.p() == 1702454643) {
                                            xi90Var2.P(i63 + 8);
                                            int i65 = xi90Var2.b;
                                            while (true) {
                                                if (i65 - i63 >= p6) {
                                                    i23 = i35;
                                                    i24 = i63;
                                                    i25 = p6;
                                                    dVar = null;
                                                    break;
                                                }
                                                xi90Var2.P(i65);
                                                int p7 = xi90Var2.p();
                                                x19.w(str7, p7 > 0);
                                                int i66 = i65;
                                                if (xi90Var2.p() == 1937011305) {
                                                    xi90Var2.Q(4);
                                                    int C = xi90Var2.C();
                                                    i23 = i35;
                                                    i24 = i63;
                                                    i25 = p6;
                                                    dVar = new d(new f((C & 1) == 1, (C & 2) == 2, (C & 8) == i31));
                                                } else {
                                                    i65 = i66 + p7;
                                                    i31 = 8;
                                                }
                                            }
                                            dVar2 = dVar;
                                        } else {
                                            i23 = i35;
                                            i24 = i63;
                                            i25 = p6;
                                        }
                                        i63 = i24 + i25;
                                        i34 = i64;
                                        i35 = i23;
                                        i31 = 8;
                                    }
                                    int i67 = i34;
                                    i8 = i35;
                                    k kVar3 = dVar2 == null ? null : new k(dVar2);
                                    if (kVar3 != null) {
                                        f fVar = kVar3.a.a;
                                        boolean z3 = fVar.c;
                                        if (kVar2 == null || kVar2.a.size() < 2) {
                                            i21 = i59;
                                            if (i21 == -1) {
                                                i22 = z3 ? 5 : 4;
                                                i11 = i22;
                                                str3 = str7;
                                                str4 = str8;
                                                gVar = gVar3;
                                                i34 = i67;
                                            }
                                            i22 = i21;
                                            i11 = i22;
                                            str3 = str7;
                                            str4 = str8;
                                            gVar = gVar3;
                                            i34 = i67;
                                        } else {
                                            x19.w("both eye views must be marked as available", fVar.a && fVar.b);
                                            x19.w("for MV-HEVC, eye_views_reversed must be set to false", !z3);
                                        }
                                    }
                                    i21 = i59;
                                    i22 = i21;
                                    i11 = i22;
                                    str3 = str7;
                                    str4 = str8;
                                    gVar = gVar3;
                                    i34 = i67;
                                } else {
                                    int i68 = i34;
                                    i8 = i35;
                                    int i69 = i59;
                                    if (p5 == 1685480259 || p5 == 1685485123 || p5 == 1685485379) {
                                        str3 = str7;
                                        str4 = str8;
                                        gVar = gVar3;
                                        i9 = i37;
                                        kVar = kVar2;
                                        i10 = 8;
                                        i11 = i69;
                                        pvnVar = pvn.e(xi90Var2);
                                    } else {
                                        if (p5 == 1987076931) {
                                            x19.w(null, str8 == null);
                                            String str12 = i7 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                            xi90Var2.P(i45 + 12);
                                            byte C2 = (byte) xi90Var2.C();
                                            byte C3 = (byte) xi90Var2.C();
                                            int C4 = xi90Var2.C();
                                            int i70 = C4 >> 4;
                                            byte b3 = (byte) ((C4 >> 1) & 7);
                                            if (str12.equals(MimeTypes.VIDEO_VP9)) {
                                                byte[] bArr3 = tzf.a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = C2;
                                                bArr4[b2] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = C3;
                                                bArr4[6] = b2;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i70;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b3;
                                                list = ImmutableList.p(bArr4);
                                            }
                                            boolean z4 = (C4 & 1) != 0;
                                            int C5 = xi90Var2.C();
                                            int C6 = xi90Var2.C();
                                            i38 = m6g.i(C5);
                                            int i71 = z4 ? 1 : 2;
                                            i44 = m6g.j(C6);
                                            i11 = i69;
                                            str3 = str7;
                                            i7 = i7;
                                            gVar = gVar3;
                                            i34 = i70;
                                            i8 = i34;
                                            str4 = str12;
                                            i37 = i71;
                                        } else {
                                            int i72 = 7;
                                            int i73 = 11;
                                            if (p5 == 1635135811) {
                                                int i74 = p4 - 8;
                                                byte[] bArr5 = new byte[i74];
                                                xi90Var2.n(bArr5, 0, i74);
                                                list = ImmutableList.p(bArr5);
                                                xi90Var2.P(i45 + 8);
                                                byte[] bArr6 = xi90Var2.a;
                                                wi90 wi90Var = new wi90(bArr6, bArr6.length);
                                                wi90Var.m(xi90Var2.b * 8);
                                                wi90Var.p(1);
                                                int g4 = wi90Var.g(b2);
                                                wi90Var.o(6);
                                                boolean f5 = wi90Var.f();
                                                boolean f6 = wi90Var.f();
                                                int i75 = -1;
                                                if (g4 == 2 && f5) {
                                                    i12 = f6 ? 12 : 10;
                                                    i13 = f6 ? 12 : 10;
                                                } else if (g4 <= 2) {
                                                    i12 = f5 ? 10 : 8;
                                                    i13 = f5 ? 10 : 8;
                                                } else {
                                                    i12 = -1;
                                                    i13 = -1;
                                                }
                                                wi90Var.o(13);
                                                wi90Var.n();
                                                int g5 = wi90Var.g(4);
                                                if (g5 != 1) {
                                                    ahn.u("Unsupported obu_type: " + g5);
                                                    m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                } else if (wi90Var.f()) {
                                                    ahn.u("Unsupported obu_extension_flag");
                                                    m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                } else {
                                                    boolean f7 = wi90Var.f();
                                                    wi90Var.n();
                                                    if (!f7 || wi90Var.g(8) <= 127) {
                                                        int g6 = wi90Var.g(3);
                                                        wi90Var.n();
                                                        if (wi90Var.f()) {
                                                            ahn.u("Unsupported reduced_still_picture_header");
                                                            m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                        } else if (wi90Var.f()) {
                                                            ahn.u("Unsupported timing_info_present_flag");
                                                            m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                        } else if (wi90Var.f()) {
                                                            ahn.u("Unsupported initial_display_delay_present_flag");
                                                            m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                        } else {
                                                            int i76 = 5;
                                                            int g7 = wi90Var.g(5);
                                                            int i77 = 0;
                                                            while (i77 <= g7) {
                                                                wi90Var.o(12);
                                                                if (wi90Var.g(i76) > i72) {
                                                                    wi90Var.n();
                                                                }
                                                                i77++;
                                                                i76 = 5;
                                                                i72 = 7;
                                                            }
                                                            c3 = '\f';
                                                            int g8 = wi90Var.g(4);
                                                            int g9 = wi90Var.g(4);
                                                            wi90Var.o(g8 + 1);
                                                            wi90Var.o(g9 + 1);
                                                            if (wi90Var.f()) {
                                                                i14 = 7;
                                                                wi90Var.o(7);
                                                            } else {
                                                                i14 = 7;
                                                            }
                                                            wi90Var.o(i14);
                                                            boolean f8 = wi90Var.f();
                                                            if (f8) {
                                                                wi90Var.o(2);
                                                            }
                                                            if (wi90Var.f()) {
                                                                i15 = 1;
                                                                g2 = 2;
                                                            } else {
                                                                i15 = 1;
                                                                g2 = wi90Var.g(1);
                                                            }
                                                            if (g2 > 0 && !wi90Var.f()) {
                                                                wi90Var.o(i15);
                                                            }
                                                            if (f8) {
                                                                i16 = 3;
                                                                wi90Var.o(3);
                                                            } else {
                                                                i16 = 3;
                                                            }
                                                            wi90Var.o(i16);
                                                            boolean f9 = wi90Var.f();
                                                            if (g6 == 2 && f9) {
                                                                wi90Var.n();
                                                            }
                                                            boolean z5 = g6 != 1 && wi90Var.f();
                                                            if (wi90Var.f()) {
                                                                int g10 = wi90Var.g(8);
                                                                int g11 = wi90Var.g(8);
                                                                int g12 = wi90Var.g(8);
                                                                if (z5) {
                                                                    i20 = 1;
                                                                } else {
                                                                    i20 = 1;
                                                                    if (g10 == 1 && g11 == 13 && g12 == 0) {
                                                                        g3 = 1;
                                                                        int i78 = m6g.i(g10);
                                                                        int i79 = g3 != i20 ? 1 : 2;
                                                                        i17 = i78;
                                                                        i18 = i13;
                                                                        i19 = m6g.j(g11);
                                                                        i75 = i79;
                                                                    }
                                                                }
                                                                g3 = wi90Var.g(i20);
                                                                int i782 = m6g.i(g10);
                                                                if (g3 != i20) {
                                                                }
                                                                i17 = i782;
                                                                i18 = i13;
                                                                i19 = m6g.j(g11);
                                                                i75 = i79;
                                                            } else {
                                                                i17 = -1;
                                                                i18 = i13;
                                                                i19 = -1;
                                                            }
                                                            m6gVar = new m6g(i17, i75, i19, i12, i18, null);
                                                            int i80 = m6gVar.e;
                                                            int i81 = m6gVar.f;
                                                            i38 = m6gVar.a;
                                                            i37 = m6gVar.b;
                                                            i44 = m6gVar.c;
                                                            str4 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                            i8 = i80;
                                                            str3 = str7;
                                                            gVar = gVar3;
                                                            i10 = 8;
                                                            i11 = i69;
                                                            i34 = i81;
                                                        }
                                                    } else {
                                                        ahn.u("Excessive obu_size");
                                                        m6gVar2 = new m6g(-1, -1, -1, i12, i13, null);
                                                    }
                                                }
                                                m6gVar = m6gVar2;
                                                c3 = '\f';
                                                int i802 = m6gVar.e;
                                                int i812 = m6gVar.f;
                                                i38 = m6gVar.a;
                                                i37 = m6gVar.b;
                                                i44 = m6gVar.c;
                                                str4 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                i8 = i802;
                                                str3 = str7;
                                                gVar = gVar3;
                                                i10 = 8;
                                                i11 = i69;
                                                i34 = i812;
                                            } else {
                                                if (p5 == 1668050025) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                    byteBuffer2.position(21);
                                                    byteBuffer2.putShort(xi90Var2.z());
                                                    byteBuffer2.putShort(xi90Var2.z());
                                                    i11 = i69;
                                                    byteBuffer = byteBuffer2;
                                                    str3 = str7;
                                                    str4 = str8;
                                                    gVar = gVar3;
                                                    i34 = i68;
                                                } else if (p5 == 1835295606) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                    short z6 = xi90Var2.z();
                                                    short z7 = xi90Var2.z();
                                                    short z8 = xi90Var2.z();
                                                    short z9 = xi90Var2.z();
                                                    str3 = str7;
                                                    short z10 = xi90Var2.z();
                                                    str4 = str8;
                                                    short z11 = xi90Var2.z();
                                                    int i82 = i37;
                                                    short z12 = xi90Var2.z();
                                                    rt50.k kVar4 = kVar2;
                                                    short z13 = xi90Var2.z();
                                                    long E = xi90Var2.E();
                                                    long E2 = xi90Var2.E();
                                                    gVar = gVar3;
                                                    byteBuffer3.position(1);
                                                    byteBuffer3.putShort(z10);
                                                    byteBuffer3.putShort(z11);
                                                    byteBuffer3.putShort(z6);
                                                    byteBuffer3.putShort(z7);
                                                    byteBuffer3.putShort(z8);
                                                    byteBuffer3.putShort(z9);
                                                    byteBuffer3.putShort(z12);
                                                    byteBuffer3.putShort(z13);
                                                    byteBuffer3.putShort((short) (E / 10000));
                                                    byteBuffer3.putShort((short) (E2 / 10000));
                                                    i11 = i69;
                                                    byteBuffer = byteBuffer3;
                                                    i34 = i68;
                                                    i37 = i82;
                                                    kVar2 = kVar4;
                                                } else {
                                                    str3 = str7;
                                                    str4 = str8;
                                                    gVar = gVar3;
                                                    i9 = i37;
                                                    kVar = kVar2;
                                                    if (p5 == 1681012275) {
                                                        x19.w(null, str4 == null);
                                                        i11 = i69;
                                                        str4 = MimeTypes.VIDEO_H263;
                                                        i34 = i68;
                                                        i37 = i9;
                                                        kVar2 = kVar;
                                                    } else {
                                                        if (p5 == 1702061171) {
                                                            x19.w(null, str4 == null);
                                                            c c4 = c(i45, xi90Var2);
                                                            String str13 = c4.a;
                                                            byte[] bArr7 = c4.b;
                                                            if (bArr7 != null) {
                                                                list = ImmutableList.p(bArr7);
                                                            }
                                                            i11 = i69;
                                                            cVar = c4;
                                                            str4 = str13;
                                                        } else if (p5 == 1651798644) {
                                                            xi90Var2.P(i45 + 8);
                                                            xi90Var2.Q(4);
                                                            i11 = i69;
                                                            aVar = new a(xi90Var2.E(), xi90Var2.E());
                                                        } else if (p5 == 1885434736) {
                                                            xi90Var2.P(i45 + 8);
                                                            i11 = i69;
                                                            f2 = xi90Var2.G() / xi90Var2.G();
                                                            i34 = i68;
                                                            i37 = i9;
                                                            kVar2 = kVar;
                                                            i10 = 8;
                                                            z2 = true;
                                                        } else if (p5 == 1937126244) {
                                                            int i83 = i45 + 8;
                                                            while (true) {
                                                                if (i83 - i45 >= p4) {
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                xi90Var2.P(i83);
                                                                int p8 = xi90Var2.p();
                                                                if (xi90Var2.p() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(xi90Var2.a, i83, p8 + i83);
                                                                    break;
                                                                }
                                                                i83 += p8;
                                                            }
                                                            i11 = i69;
                                                            bArr2 = bArr;
                                                        } else if (p5 == 1936995172) {
                                                            int C7 = xi90Var2.C();
                                                            xi90Var2.Q(3);
                                                            if (C7 == 0) {
                                                                int C8 = xi90Var2.C();
                                                                if (C8 == 0) {
                                                                    i69 = 0;
                                                                } else if (C8 == 1) {
                                                                    i69 = 1;
                                                                } else if (C8 == 2) {
                                                                    i69 = 2;
                                                                } else if (C8 == 3) {
                                                                    i69 = 3;
                                                                }
                                                            }
                                                            i11 = i69;
                                                        } else if (p5 == 1634760259) {
                                                            int i84 = p4 - 12;
                                                            byte[] bArr8 = new byte[i84];
                                                            xi90Var2.P(i45 + 12);
                                                            xi90Var2.n(bArr8, 0, i84);
                                                            byte[] bArr9 = tzf.a;
                                                            fxc0.l(i84, "Invalid APV CSD length: %s", i84 >= 17);
                                                            byte b4 = bArr8[0];
                                                            fxc0.l(b4, "Invalid APV CSD version: %s", b4 == 1);
                                                            byte b5 = bArr8[5];
                                                            byte b6 = bArr8[6];
                                                            byte b7 = bArr8[7];
                                                            String str14 = y2r0.a;
                                                            Locale locale = Locale.US;
                                                            StringBuilder a6 = odj.a(b5, b6, "apv1.apvf", ".apvl", ".apvb");
                                                            a6.append((int) b7);
                                                            str9 = a6.toString();
                                                            list = ImmutableList.p(bArr8);
                                                            xi90 xi90Var3 = new xi90(bArr8);
                                                            wi90 wi90Var2 = new wi90(bArr8, i84);
                                                            i10 = 8;
                                                            wi90Var2.m(xi90Var3.b * 8);
                                                            wi90Var2.p(1);
                                                            int g13 = wi90Var2.g(8);
                                                            int i85 = 0;
                                                            int i86 = -1;
                                                            int i87 = -1;
                                                            int i88 = -1;
                                                            int i89 = -1;
                                                            int i90 = -1;
                                                            while (i85 < g13) {
                                                                wi90Var2.p(1);
                                                                int g14 = wi90Var2.g(8);
                                                                int i91 = i90;
                                                                int i92 = i89;
                                                                int i93 = i88;
                                                                int i94 = i87;
                                                                int i95 = i86;
                                                                int i96 = 0;
                                                                while (i96 < g14) {
                                                                    wi90Var2.o(6);
                                                                    boolean f10 = wi90Var2.f();
                                                                    wi90Var2.n();
                                                                    wi90Var2.p(i73);
                                                                    wi90Var2.o(4);
                                                                    i94 = wi90Var2.g(4) + 8;
                                                                    wi90Var2.p(1);
                                                                    if (f10) {
                                                                        int g15 = wi90Var2.g(8);
                                                                        int g16 = wi90Var2.g(8);
                                                                        wi90Var2.p(1);
                                                                        boolean f11 = wi90Var2.f();
                                                                        int i97 = m6g.i(g15);
                                                                        int i98 = f11 ? 1 : 2;
                                                                        i91 = m6g.j(g16);
                                                                        i93 = i98;
                                                                        i92 = i97;
                                                                    }
                                                                    i96++;
                                                                    i95 = i94;
                                                                    i73 = 11;
                                                                }
                                                                i85++;
                                                                i86 = i95;
                                                                i87 = i94;
                                                                i88 = i93;
                                                                i89 = i92;
                                                                i90 = i91;
                                                                i73 = 11;
                                                            }
                                                            i11 = i69;
                                                            str4 = "video/apv";
                                                            i34 = i86;
                                                            i8 = i87;
                                                            i37 = i88;
                                                            i38 = i89;
                                                            i44 = i90;
                                                            kVar2 = kVar;
                                                        } else {
                                                            i10 = 8;
                                                            if (p5 == 1668246642 && i38 == -1 && i44 == -1) {
                                                                int p9 = xi90Var2.p();
                                                                if (p9 == 1852009592 || p9 == 1852009571) {
                                                                    int J3 = xi90Var2.J();
                                                                    int J4 = xi90Var2.J();
                                                                    xi90Var2.Q(2);
                                                                    boolean z14 = p4 == 19 && (xi90Var2.C() & 128) != 0;
                                                                    int i99 = m6g.i(J3);
                                                                    int i100 = z14 ? 1 : 2;
                                                                    i44 = m6g.j(J4);
                                                                    i38 = i99;
                                                                    i37 = i100;
                                                                    kVar2 = kVar;
                                                                    i11 = i69;
                                                                    i34 = i68;
                                                                } else {
                                                                    ahn.F("Unsupported color type: " + sf30.a(p9));
                                                                }
                                                            }
                                                            i11 = i69;
                                                        }
                                                        i34 = i68;
                                                        i37 = i9;
                                                        kVar2 = kVar;
                                                    }
                                                    i10 = 8;
                                                }
                                                i10 = 8;
                                            }
                                        }
                                    }
                                    i34 = i68;
                                    i37 = i9;
                                    kVar2 = kVar;
                                }
                                i10 = 8;
                            }
                            i43 = i46 + p4;
                            i36 = i11;
                            i31 = i10;
                            p2 = i47;
                            p3 = i7;
                            str7 = str3;
                            i35 = i8;
                            str8 = str4;
                            gVar3 = gVar;
                            b2 = 3;
                        }
                    }
                    i43 = i46 + p4;
                    i36 = i11;
                    i31 = i10;
                    p2 = i47;
                    p3 = i7;
                    str7 = str3;
                    i35 = i8;
                    str8 = str4;
                    gVar3 = gVar;
                    b2 = 3;
                }
                int i101 = i34;
                int i102 = i35;
                i6 = p2;
                int i103 = i36;
                String str15 = str8;
                g gVar4 = gVar3;
                int i104 = i37;
                c2 = '\f';
                if (pvnVar != null) {
                    str9 = (String) pvnVar.b;
                    str2 = "video/dolby-vision";
                } else {
                    str2 = str15;
                }
                String str16 = str9;
                if (str2 == null) {
                    str6 = str;
                    gVar3 = gVar4;
                } else {
                    a.C0043a c0043a = new a.C0043a();
                    c0043a.a = Integer.toString(i4);
                    c0043a.m = io20.q(str2);
                    c0043a.j = str16;
                    c0043a.t = J;
                    c0043a.u = J2;
                    c0043a.v = i42;
                    c0043a.w = i41;
                    c0043a.z = f2;
                    c0043a.y = i32;
                    c0043a.A = bArr2;
                    c0043a.B = i103;
                    c0043a.p = list;
                    c0043a.o = i40;
                    c0043a.D = i39;
                    c0043a.q = drmInitData4;
                    str6 = str;
                    c0043a.d = str6;
                    c0043a.C = new m6g(i38, i104, i44, i102, i101, byteBuffer != null ? byteBuffer.array() : null);
                    a aVar3 = aVar;
                    if (aVar3 != null) {
                        c0043a.h = ipx.w(aVar3.a);
                        c0043a.i = ipx.w(aVar3.b);
                    } else {
                        c cVar2 = cVar;
                        if (cVar2 != null) {
                            c0043a.h = ipx.w(cVar2.c);
                            c0043a.i = ipx.w(cVar2.d);
                        }
                    }
                    gVar3 = gVar4;
                    gVar3.b = new androidx.media3.common.a(c0043a);
                }
            } else {
                if (p3 == 1836069985 || p3 == 1701733217 || p3 == 1633889587 || p3 == 1700998451 || p3 == 1633889588 || p3 == 1835823201 || p3 == 1685353315 || p3 == 1685353317 || p3 == 1685353320 || p3 == 1685353324 || p3 == 1685353336 || p3 == 1935764850 || p3 == 1935767394 || p3 == 1819304813 || p3 == 1936684916 || p3 == 1953984371 || p3 == 778924082 || p3 == 778924083 || p3 == 1835557169 || p3 == 1835560241 || p3 == 1634492771 || p3 == 1634492791 || p3 == 1970037111 || p3 == 1332770163 || p3 == 1716281667 || p3 == 1767992678 || p3 == 1768973165 || p3 == 1718641517) {
                    xi90Var2 = xi90Var;
                    i30 = i30;
                    p2 = p2;
                    b(xi90Var2, p3, i30, p2, jVar2.a, str6, z, drmInitData, gVar3, i29);
                    str6 = str;
                } else if (p3 == 1414810956 || p3 == 1954034535 || p3 == 2004251764 || p3 == 1937010800 || p3 == 1664495672 || p3 == 1836070003) {
                    xi90Var2.P(i30 + 16);
                    String str17 = MimeTypes.APPLICATION_TTML;
                    long j3 = Long.MAX_VALUE;
                    if (p3 != 1414810956) {
                        if (p3 == 1954034535) {
                            int i105 = p2 - 16;
                            byte[] bArr10 = new byte[i105];
                            xi90Var2.n(bArr10, 0, i105);
                            gVar2 = ImmutableList.p(bArr10);
                            str17 = MimeTypes.APPLICATION_TX3G;
                            i26 = i30;
                            i27 = p2;
                        } else if (p3 == 2004251764) {
                            str17 = MimeTypes.APPLICATION_MP4VTT;
                        } else if (p3 == 1937010800) {
                            j3 = 0;
                        } else if (p3 == 1664495672) {
                            gVar3.d = 1;
                            str17 = MimeTypes.APPLICATION_MP4CEA608;
                        } else {
                            if (p3 != 1836070003) {
                                throw new IllegalStateException();
                            }
                            int i106 = xi90Var2.b;
                            xi90Var2.Q(4);
                            if (xi90Var2.p() == 1702061171) {
                                byte[] bArr11 = c(i106, xi90Var2).b;
                                if (bArr11 == null || bArr11.length != 64) {
                                    i26 = i30;
                                    i27 = p2;
                                    c2 = '\f';
                                    xi90Var2 = xi90Var;
                                    i4 = i28;
                                    i5 = p;
                                    i3 = i26;
                                    i6 = i27;
                                    i2 = i29;
                                } else {
                                    int i107 = jVar2.d;
                                    int i108 = jVar2.e;
                                    fxc0.z(bArr11.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i109 = 0;
                                    while (i109 < bArr11.length - 3) {
                                        byte[] bArr12 = bArr11;
                                        int u = ipx.u(bArr11[i109], bArr11[i109 + 1], bArr11[i109 + 2], bArr12[i109 + 3]);
                                        int i110 = (u >> 16) & 255;
                                        int i111 = ((u >> 8) & 255) - 128;
                                        int i112 = (u & 255) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(y2r0.j(dq.b(i112, 17790, 10000, i110), 0, 255) | (y2r0.j((i110 - ((i112 * 3455) / 10000)) - ((i111 * 7169) / 10000), 0, 255) << 8) | (y2r0.j(dq.b(i111, 14075, 10000, i110), 0, 255) << 16))));
                                        i109 += 4;
                                        bArr11 = bArr12;
                                        i30 = i30;
                                        p2 = p2;
                                    }
                                    i26 = i30;
                                    i27 = p2;
                                    StringBuilder a7 = odj.a(i107, i108, "size: ", "x", "\npalette: ");
                                    op5 op5Var = new op5(", ");
                                    Iterator it = arrayList.iterator();
                                    StringBuilder sb = new StringBuilder();
                                    op5Var.a(sb, it);
                                    a7.append(sb.toString());
                                    a7.append("\n");
                                    String sb2 = a7.toString();
                                    String str18 = y2r0.a;
                                    gVar2 = ImmutableList.p(sb2.getBytes(StandardCharsets.UTF_8));
                                    str5 = MimeTypes.APPLICATION_VOBSUB;
                                }
                            } else {
                                i26 = i30;
                                i27 = p2;
                                str5 = null;
                                gVar2 = null;
                            }
                            str17 = str5;
                        }
                        j2 = Long.MAX_VALUE;
                        if (str17 != null) {
                            a.C0043a c0043a2 = new a.C0043a();
                            c0043a2.a = Integer.toString(i28);
                            c0043a2.m = io20.q(str17);
                            c0043a2.d = str6;
                            c0043a2.r = j2;
                            c0043a2.p = gVar2;
                            gVar3.b = new androidx.media3.common.a(c0043a2);
                        }
                        c2 = '\f';
                        xi90Var2 = xi90Var;
                        i4 = i28;
                        i5 = p;
                        i3 = i26;
                        i6 = i27;
                        i2 = i29;
                    }
                    i26 = i30;
                    i27 = p2;
                    j2 = j3;
                    gVar2 = null;
                    if (str17 != null) {
                    }
                    c2 = '\f';
                    xi90Var2 = xi90Var;
                    i4 = i28;
                    i5 = p;
                    i3 = i26;
                    i6 = i27;
                    i2 = i29;
                } else if (p3 == 1835365492) {
                    xi90Var2.P(i30 + 16);
                    if (p3 == 1835365492) {
                        xi90Var2.x();
                        String x = xi90Var2.x();
                        if (x != null) {
                            a.C0043a c0043a3 = new a.C0043a();
                            c0043a3.a = Integer.toString(i28);
                            c0043a3.m = io20.q(x);
                            gVar3.b = new androidx.media3.common.a(c0043a3);
                        }
                    }
                } else if (p3 == 1667329389) {
                    a.C0043a c0043a4 = new a.C0043a();
                    c0043a4.a = Integer.toString(i28);
                    c0043a4.m = io20.q(MimeTypes.APPLICATION_CAMERA_MOTION);
                    gVar3.b = new androidx.media3.common.a(c0043a4);
                }
                i3 = i30;
                i6 = p2;
                i2 = i29;
                i4 = i28;
                i5 = p;
                c2 = '\f';
            }
            xi90Var2.P(i3 + i6);
            i29 = i2 + 1;
            jVar2 = jVar;
            i28 = i4;
            p = i5;
        }
        return gVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x00e1, code lost:
    
        if (r22 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(sf30.a aVar, aht ahtVar, long j2, @Nullable DrmInitData drmInitData, boolean z, boolean z2, szs szsVar, boolean z3) throws ParserException {
        long j3;
        long j4;
        long j5;
        int i2;
        int i3;
        long j6;
        long j7;
        long d0;
        int i4;
        int i5;
        int i6;
        String str;
        sf30.b c2;
        int i7;
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.a aVar2;
        androidx.media3.common.a aVar3;
        szs szsVar2;
        vep0 vep0Var;
        sf30.a b2;
        Pair create;
        int i8;
        long p;
        e iVar;
        boolean z4;
        ArrayList arrayList;
        int i9;
        xi90 xi90Var;
        int i10;
        int i11;
        int i12;
        boolean z5;
        ArrayList arrayList2;
        int[] iArr;
        int i13;
        int i14;
        long[] jArr3;
        int[] iArr2;
        int i15;
        boolean z6;
        int i16;
        long[] jArr4;
        int i17;
        int[] iArr3;
        int i18;
        int[] iArr4;
        long j8;
        long j9;
        int[] iArr5;
        long[] jArr5;
        int i19;
        long j10;
        long[] jArr6;
        long j11;
        vgp0 vgp0Var;
        ArrayList arrayList3;
        boolean z7;
        int[] iArr6;
        int i20;
        int i21;
        vgp0 vgp0Var2;
        long d02;
        sf30.a aVar4 = aVar;
        ArrayList arrayList4 = aVar4.d;
        ArrayList arrayList5 = new ArrayList();
        int i22 = 0;
        while (i22 < arrayList4.size()) {
            sf30.a aVar5 = (sf30.a) arrayList4.get(i22);
            if (aVar5.a != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i12 = i22;
            } else {
                sf30.b c3 = aVar4.c(1836476516);
                c3.getClass();
                sf30.a b3 = aVar5.b(1835297121);
                b3.getClass();
                sf30.b c4 = b3.c(1751411826);
                c4.getClass();
                xi90 xi90Var2 = c4.b;
                xi90Var2.P(16);
                int p2 = xi90Var2.p();
                int i23 = p2 == 1936684398 ? 1 : p2 == 1986618469 ? 2 : (p2 == 1952807028 || p2 == 1935832172 || p2 == 1937072756 || p2 == 1668047728 || p2 == 1937072752) ? 3 : p2 == 1835365473 ? 5 : -1;
                int i24 = 1;
                if (i23 == -1) {
                    szsVar2 = szsVar;
                    vep0Var = null;
                    j3 = 0;
                } else {
                    j3 = 0;
                    sf30.b c5 = aVar5.c(1953196132);
                    c5.getClass();
                    xi90 xi90Var3 = c5.b;
                    xi90Var3.P(8);
                    int e2 = e(xi90Var3.p());
                    xi90Var3.Q(e2 != 0 ? 16 : 8);
                    int p3 = xi90Var3.p();
                    xi90Var3.Q(4);
                    int i25 = xi90Var3.b;
                    int i26 = e2 == 0 ? 4 : 8;
                    int i27 = 0;
                    while (true) {
                        j4 = C.TIME_UNSET;
                        if (i27 >= i26) {
                            xi90Var3.Q(i26);
                            break;
                        }
                        if (xi90Var3.a[i25 + i27] != -1) {
                            j5 = e2 == 0 ? xi90Var3.E() : xi90Var3.I();
                        } else {
                            i27++;
                        }
                    }
                    j5 = -9223372036854775807L;
                    xi90Var3.Q(10);
                    int J = xi90Var3.J();
                    xi90Var3.Q(4);
                    int p4 = xi90Var3.p();
                    int p5 = xi90Var3.p();
                    xi90Var3.Q(4);
                    int p6 = xi90Var3.p();
                    int p7 = xi90Var3.p();
                    if (p4 == 0 && p5 == 65536 && ((p6 == -65536 || p6 == 65536) && p7 == 0)) {
                        i2 = 90;
                    } else if (p4 == 0 && p5 == -65536 && ((p6 == 65536 || p6 == -65536) && p7 == 0)) {
                        i2 = atv0.b;
                    } else if ((p4 == -65536 || p4 == 65536) && p5 == 0 && p6 == 0 && p7 == -65536) {
                        i2 = 180;
                    } else {
                        i3 = 0;
                        xi90Var3.Q(16);
                        short z8 = xi90Var3.z();
                        xi90Var3.Q(2);
                        j jVar = new j(p3, j5, J, i3, z8, xi90Var3.z());
                        j6 = j2 != C.TIME_UNSET ? j5 : j2;
                        long j12 = g(c3.b).c;
                        if (j6 != C.TIME_UNSET) {
                            j7 = j12;
                            d0 = -9223372036854775807L;
                        } else {
                            String str2 = y2r0.a;
                            j7 = j12;
                            d0 = y2r0.d0(j6, 1000000L, j7, RoundingMode.DOWN);
                        }
                        sf30.a b4 = b3.b(1835626086);
                        b4.getClass();
                        sf30.a b5 = b4.b(1937007212);
                        b5.getClass();
                        sf30.b c6 = b3.c(1835296868);
                        c6.getClass();
                        xi90 xi90Var4 = c6.b;
                        xi90Var4.P(8);
                        int e3 = e(xi90Var4.p());
                        xi90Var4.Q(e3 == 0 ? 8 : 16);
                        long E = xi90Var4.E();
                        int i28 = xi90Var4.b;
                        i4 = e3 != 0 ? 4 : 8;
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                xi90Var4.Q(i4);
                                break;
                            }
                            if (xi90Var4.a[i28 + i5] != -1) {
                                long E2 = e3 == 0 ? xi90Var4.E() : xi90Var4.I();
                                if (E2 != 0) {
                                    String str3 = y2r0.a;
                                    j4 = y2r0.d0(E2, 1000000L, E, RoundingMode.DOWN);
                                }
                            } else {
                                i5++;
                            }
                        }
                        long j13 = j4;
                        int J2 = xi90Var4.J();
                        char[] cArr = {(char) (((J2 >> 10) & 31) + 96), (char) (((J2 >> 5) & 31) + 96), (char) ((J2 & 31) + 96)};
                        for (i6 = 0; i6 < 3; i6++) {
                            char c7 = cArr[i6];
                            if (c7 < 'a' || c7 > 'z') {
                                str = null;
                                break;
                            }
                        }
                        str = new String(cArr);
                        c2 = b5.c(1937011556);
                        if (c2 != null) {
                            ahn.F("Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            g i29 = i(c2.b, jVar, str, drmInitData, z2);
                            if (z || (b2 = aVar5.b(1701082227)) == null) {
                                i7 = i23;
                            } else {
                                sf30.b c8 = b2.c(1701606260);
                                if (c8 == null) {
                                    i7 = i23;
                                    create = null;
                                } else {
                                    xi90 xi90Var5 = c8.b;
                                    xi90Var5.P(8);
                                    int e4 = e(xi90Var5.p());
                                    int G = xi90Var5.G();
                                    long[] jArr7 = new long[G];
                                    long[] jArr8 = new long[G];
                                    int i30 = 0;
                                    while (i30 < G) {
                                        int i31 = i30;
                                        int i32 = i24;
                                        jArr7[i31] = e4 == i32 ? xi90Var5.I() : xi90Var5.E();
                                        if (e4 == i32) {
                                            i8 = i23;
                                            p = xi90Var5.w();
                                        } else {
                                            i8 = i23;
                                            p = xi90Var5.p();
                                        }
                                        jArr8[i31] = p;
                                        if (xi90Var5.z() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        xi90Var5.Q(2);
                                        i30 = i31 + 1;
                                        i23 = i8;
                                        i24 = 1;
                                    }
                                    i7 = i23;
                                    create = Pair.create(jArr7, jArr8);
                                }
                                if (create != null) {
                                    long[] jArr9 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr9;
                                    aVar2 = i29.b;
                                    if (aVar2 != null) {
                                        int i33 = jVar.b;
                                        if (i33 != 0) {
                                            rf30 rf30Var = new rf30(i33);
                                            a.C0043a a2 = aVar2.a();
                                            fi20 fi20Var = i29.b.l;
                                            a2.k = fi20Var != null ? fi20Var.a(rf30Var) : new fi20(rf30Var);
                                            aVar3 = new androidx.media3.common.a(a2);
                                        } else {
                                            aVar3 = aVar2;
                                        }
                                        vep0 vep0Var2 = new vep0(jVar.a, i7, E, j7, d0, j13, aVar3, i29.d, i29.a, i29.c, jArr, jArr2);
                                        szsVar2 = szsVar;
                                        vep0Var = vep0Var2;
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            aVar2 = i29.b;
                            if (aVar2 != null) {
                            }
                        }
                        szsVar2 = szsVar;
                        vep0Var = null;
                    }
                    i3 = i2;
                    xi90Var3.Q(16);
                    short z82 = xi90Var3.z();
                    xi90Var3.Q(2);
                    j jVar2 = new j(p3, j5, J, i3, z82, xi90Var3.z());
                    if (j2 != C.TIME_UNSET) {
                    }
                    long j122 = g(c3.b).c;
                    if (j6 != C.TIME_UNSET) {
                    }
                    sf30.a b42 = b3.b(1835626086);
                    b42.getClass();
                    sf30.a b52 = b42.b(1937007212);
                    b52.getClass();
                    sf30.b c62 = b3.c(1835296868);
                    c62.getClass();
                    xi90 xi90Var42 = c62.b;
                    xi90Var42.P(8);
                    int e32 = e(xi90Var42.p());
                    xi90Var42.Q(e32 == 0 ? 8 : 16);
                    long E3 = xi90Var42.E();
                    int i282 = xi90Var42.b;
                    if (e32 != 0) {
                    }
                    i5 = 0;
                    while (true) {
                        if (i5 < i4) {
                        }
                        i5++;
                    }
                    long j132 = j4;
                    int J22 = xi90Var42.J();
                    char[] cArr2 = {(char) (((J22 >> 10) & 31) + 96), (char) (((J22 >> 5) & 31) + 96), (char) ((J22 & 31) + 96)};
                    while (i6 < 3) {
                    }
                    str = new String(cArr2);
                    c2 = b52.c(1937011556);
                    if (c2 != null) {
                    }
                    szsVar2 = szsVar;
                    vep0Var = null;
                }
                vep0 vep0Var3 = (vep0) szsVar2.apply(vep0Var);
                if (vep0Var3 == null) {
                    arrayList = arrayList4;
                    arrayList3 = arrayList5;
                    i12 = i22;
                } else {
                    androidx.media3.common.a aVar6 = vep0Var3.g;
                    sf30.a b6 = aVar5.b(1835297121);
                    b6.getClass();
                    sf30.a b7 = b6.b(1835626086);
                    b7.getClass();
                    sf30.a b8 = b7.b(1937007212);
                    b8.getClass();
                    sf30.b c9 = b8.c(1937011578);
                    if (c9 != null) {
                        iVar = new h(c9, aVar6);
                    } else {
                        sf30.b c10 = b8.c(1937013298);
                        if (c10 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        iVar = new i(c10);
                    }
                    int sampleCount = iVar.getSampleCount();
                    if (sampleCount == 0) {
                        arrayList3 = arrayList5;
                        i12 = i22;
                        vgp0Var = new vgp0(vep0Var3, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        arrayList = arrayList4;
                    } else {
                        if (vep0Var3.b == 2) {
                            long j14 = vep0Var3.f;
                            if (j14 > j3) {
                                a.C0043a a3 = aVar6.a();
                                a3.x = sampleCount / (j14 / 1000000.0f);
                                vep0Var3 = vep0Var3.a(new androidx.media3.common.a(a3));
                            }
                        }
                        androidx.media3.common.a aVar7 = vep0Var3.g;
                        sf30.b c11 = b8.c(1937007471);
                        if (c11 == null) {
                            c11 = b8.c(1668232756);
                            c11.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        xi90 xi90Var6 = c11.b;
                        sf30.b c12 = b8.c(1937011555);
                        c12.getClass();
                        xi90 xi90Var7 = c12.b;
                        sf30.b c13 = b8.c(1937011827);
                        c13.getClass();
                        xi90 xi90Var8 = c13.b;
                        sf30.b c14 = b8.c(1937011571);
                        xi90 xi90Var9 = c14 != null ? c14.b : null;
                        arrayList = arrayList4;
                        sf30.b c15 = b8.c(1668576371);
                        xi90 xi90Var10 = c15 != null ? c15.b : null;
                        b bVar = new b(xi90Var7, xi90Var6, z4);
                        xi90Var8.P(12);
                        int G2 = xi90Var8.G() - 1;
                        int G3 = xi90Var8.G();
                        int G4 = xi90Var8.G();
                        if (xi90Var10 != null) {
                            xi90Var10.P(12);
                            i9 = xi90Var10.G();
                        } else {
                            i9 = 0;
                        }
                        if (xi90Var9 != null) {
                            xi90Var9.P(12);
                            i10 = xi90Var9.G();
                            if (i10 > 0) {
                                i11 = xi90Var9.G() - 1;
                                xi90Var = xi90Var10;
                                int a4 = iVar.a();
                                i12 = i22;
                                String str4 = aVar7.n;
                                z5 = a4 == -1 && (MimeTypes.AUDIO_RAW.equals(str4) || MimeTypes.AUDIO_MLAW.equals(str4) || MimeTypes.AUDIO_ALAW.equals(str4)) && G2 == 0 && i9 == 0 && i10 == 0;
                                ArrayList arrayList6 = new ArrayList();
                                boolean z9 = xi90Var9 != null;
                                if (z5) {
                                    long[] jArr10 = z3 ? new long[0] : new long[sampleCount];
                                    int[] iArr7 = z3 ? new int[0] : new int[sampleCount];
                                    e eVar = iVar;
                                    long[] jArr11 = z3 ? new long[0] : new long[sampleCount];
                                    int i34 = i10;
                                    int[] iArr8 = z3 ? new int[0] : new int[sampleCount];
                                    arrayList2 = arrayList5;
                                    int i35 = G3;
                                    int i36 = i11;
                                    int i37 = G4;
                                    long j15 = j3;
                                    long j16 = j15;
                                    long j17 = j16;
                                    int i38 = 0;
                                    int i39 = 0;
                                    int i40 = 0;
                                    int i41 = G2;
                                    xi90 xi90Var11 = xi90Var9;
                                    int i42 = i34;
                                    int i43 = 0;
                                    int i44 = i9;
                                    int i45 = 0;
                                    while (true) {
                                        if (i45 >= sampleCount) {
                                            iArr = iArr7;
                                            int i46 = sampleCount;
                                            i13 = i35;
                                            i14 = i42;
                                            jArr3 = jArr10;
                                            iArr2 = iArr8;
                                            i15 = i39;
                                            i45 = i46;
                                            break;
                                        }
                                        boolean z10 = true;
                                        while (i39 == 0) {
                                            z10 = bVar.a();
                                            if (!z10) {
                                                break;
                                            }
                                            int i47 = i35;
                                            long j18 = bVar.d;
                                            i39 = bVar.c;
                                            j17 = j18;
                                            i42 = i42;
                                            i35 = i47;
                                            sampleCount = sampleCount;
                                        }
                                        int i48 = sampleCount;
                                        i13 = i35;
                                        i14 = i42;
                                        if (z10) {
                                            if (xi90Var != null) {
                                                while (i40 == 0 && i44 > 0) {
                                                    i40 = xi90Var.G();
                                                    i43 = xi90Var.p();
                                                    i44--;
                                                }
                                                i40--;
                                            }
                                            int readNextSampleSize = eVar.readNextSampleSize();
                                            long j19 = readNextSampleSize;
                                            j16 += j19;
                                            if (readNextSampleSize > i38) {
                                                i38 = readNextSampleSize;
                                            }
                                            if (z3) {
                                                iArr5 = iArr7;
                                                jArr5 = jArr10;
                                            } else {
                                                jArr10[i45] = j17;
                                                iArr7[i45] = readNextSampleSize;
                                                iArr5 = iArr7;
                                                jArr5 = jArr10;
                                                jArr11[i45] = j15 + i43;
                                                iArr8[i45] = xi90Var11 == null ? 1 : 0;
                                                if (i45 == i36) {
                                                    iArr8[i45] = 1;
                                                    arrayList6.add(Integer.valueOf(i45));
                                                }
                                            }
                                            if (xi90Var11 == null || i45 != i36) {
                                                i19 = i36;
                                            } else {
                                                int i49 = i14 - 1;
                                                if (i49 > 0) {
                                                    i36 = xi90Var11.G() - 1;
                                                }
                                                i19 = i36;
                                                i14 = i49;
                                            }
                                            j15 += i37;
                                            int i50 = i13 - 1;
                                            if (i50 == 0 && i41 > 0) {
                                                i41--;
                                                i50 = xi90Var8.G();
                                                i37 = xi90Var8.p();
                                            }
                                            j17 += j19;
                                            i39--;
                                            i45++;
                                            i35 = i50;
                                            i36 = i19;
                                            jArr10 = jArr5;
                                            iArr7 = iArr5;
                                            i42 = i14;
                                            sampleCount = i48;
                                        } else {
                                            ahn.F("Unexpected end of chunk data");
                                            if (z3) {
                                                iArr = iArr7;
                                                jArr3 = jArr10;
                                                iArr2 = iArr8;
                                            } else {
                                                jArr3 = Arrays.copyOf(jArr10, i45);
                                                iArr = Arrays.copyOf(iArr7, i45);
                                                jArr11 = Arrays.copyOf(jArr11, i45);
                                                iArr2 = Arrays.copyOf(iArr8, i45);
                                            }
                                            i15 = i39;
                                        }
                                    }
                                    long j20 = j15 + i43;
                                    if (xi90Var != null) {
                                        while (i44 > 0) {
                                            if (xi90Var.G() != 0) {
                                                z6 = false;
                                                break;
                                            }
                                            xi90Var.p();
                                            i44--;
                                        }
                                    }
                                    z6 = true;
                                    if (i14 == 0 && i13 == 0 && i15 == 0 && i41 == 0 && i40 == 0 && z6) {
                                        i16 = i38;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        i16 = i38;
                                        cgn.a(vep0Var3.a, i14, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                        cgn.a(i13, i15, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                        sb.append(i41);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i40);
                                        sb.append(!z6 ? ", ctts invalid" : "");
                                        ahn.F(sb.toString());
                                    }
                                    jArr4 = jArr11;
                                    i17 = i16;
                                    iArr3 = iArr;
                                    i18 = i45;
                                    long j21 = j16;
                                    iArr4 = iArr2;
                                    j8 = j20;
                                    j9 = j21;
                                } else {
                                    int i51 = bVar.a;
                                    long[] jArr12 = new long[i51];
                                    int[] iArr9 = new int[i51];
                                    while (bVar.a()) {
                                        int i52 = bVar.b;
                                        jArr12[i52] = bVar.d;
                                        iArr9[i52] = bVar.c;
                                    }
                                    long j22 = G4;
                                    int i53 = 8192 / a4;
                                    int i54 = 0;
                                    for (int i55 = 0; i55 < i51; i55++) {
                                        i54 += y2r0.g(iArr9[i55], i53);
                                    }
                                    long[] jArr13 = new long[i54];
                                    int[] iArr10 = new int[i54];
                                    jArr4 = new long[i54];
                                    int[] iArr11 = new int[i54];
                                    int i56 = 0;
                                    int i57 = 0;
                                    int i58 = 0;
                                    int i59 = 0;
                                    int i60 = 0;
                                    while (i56 < i51) {
                                        int i61 = iArr9[i56];
                                        long j23 = jArr12[i56];
                                        int i62 = i60;
                                        int i63 = i56;
                                        int i64 = i59;
                                        int i65 = i62;
                                        int i66 = i51;
                                        int i67 = i61;
                                        while (i67 > 0) {
                                            int min = Math.min(i53, i67);
                                            jArr13[i65] = j23;
                                            int i68 = i53;
                                            int i69 = a4 * min;
                                            iArr10[i65] = i69;
                                            i58 += i69;
                                            i64 = Math.max(i64, i69);
                                            jArr4[i65] = i57 * j22;
                                            iArr11[i65] = 1;
                                            j23 += iArr10[i65];
                                            i57 += min;
                                            i67 -= min;
                                            i65++;
                                            i53 = i68;
                                        }
                                        int i70 = i53;
                                        int i71 = i63 + 1;
                                        i60 = i65;
                                        i51 = i66;
                                        i59 = i64;
                                        i56 = i71;
                                        i53 = i70;
                                    }
                                    long j24 = j22 * i57;
                                    j9 = i58;
                                    jArr3 = z3 ? new long[0] : jArr13;
                                    if (z3) {
                                        iArr10 = new int[0];
                                    }
                                    if (z3) {
                                        jArr4 = new long[0];
                                    }
                                    arrayList2 = arrayList5;
                                    iArr4 = z3 ? new int[0] : iArr11;
                                    i18 = i54;
                                    j8 = j24;
                                    iArr3 = iArr10;
                                    i17 = i59;
                                }
                                long[] jArr14 = jArr3;
                                j10 = vep0Var3.f;
                                if (j10 > j3) {
                                    long d03 = y2r0.d0(j9 * 8, 1000000L, j10, RoundingMode.HALF_DOWN);
                                    if (d03 > j3 && d03 < 2147483647L) {
                                        a.C0043a a5 = aVar7.a();
                                        a5.h = (int) d03;
                                        vep0Var3 = vep0Var3.a(new androidx.media3.common.a(a5));
                                    }
                                }
                                int i72 = vep0Var3.b;
                                long j25 = vep0Var3.c;
                                androidx.media3.common.a aVar8 = vep0Var3.g;
                                long[] jArr15 = vep0Var3.j;
                                jArr6 = vep0Var3.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long d04 = y2r0.d0(j8, 1000000L, j25, roundingMode);
                                int[] x = ipx.x(arrayList6);
                                if (jArr6 != null) {
                                    if (!z3) {
                                        y2r0.c0(jArr4, j25);
                                    }
                                    vgp0Var2 = new vgp0(vep0Var3, jArr14, iArr3, i17, jArr4, iArr4, x, z9, d04, i18);
                                } else {
                                    long[] jArr16 = jArr4;
                                    if (z3) {
                                        jArr15.getClass();
                                        if (jArr6.length == 1 && jArr6[0] == j3) {
                                            d02 = y2r0.d0(j8 - jArr15[0], 1000000L, vep0Var3.c, roundingMode);
                                        } else {
                                            long j26 = j3;
                                            for (int i73 = 0; i73 < jArr6.length; i73++) {
                                                if (jArr15[i73] != -1) {
                                                    j26 += jArr6[i73];
                                                }
                                            }
                                            d02 = y2r0.d0(j26, 1000000L, vep0Var3.d, RoundingMode.DOWN);
                                        }
                                        vgp0Var2 = new vgp0(vep0Var3, jArr14, iArr3, i17, jArr16, iArr4, x, z9, d02, i18);
                                    } else {
                                        if (jArr6.length == 1 && i72 == 1 && jArr16.length >= 2) {
                                            jArr15.getClass();
                                            long j27 = jArr15[0];
                                            j11 = -1;
                                            long d05 = j27 + y2r0.d0(jArr6[0], vep0Var3.c, vep0Var3.d, roundingMode);
                                            int length = jArr16.length - 1;
                                            if (jArr16[0] <= j27 && j27 < jArr16[y2r0.j(4, 0, length)] && jArr16[y2r0.j(jArr16.length - 4, 0, length)] < d05 && d05 <= 2 + j8) {
                                                long max = Math.max(j3, j8 - d05);
                                                long d06 = y2r0.d0(j27 - jArr16[0], aVar8.G, vep0Var3.c, roundingMode);
                                                long d07 = y2r0.d0(max, aVar8.G, vep0Var3.c, roundingMode);
                                                if ((d06 != j3 || d07 != j3) && d06 <= 2147483647L && d07 <= 2147483647L) {
                                                    ahtVar.a = (int) d06;
                                                    ahtVar.b = (int) d07;
                                                    y2r0.c0(jArr16, j25);
                                                    vgp0Var2 = new vgp0(vep0Var3, jArr14, iArr3, i17, jArr16, iArr4, x, z9, y2r0.d0(jArr6[0], 1000000L, vep0Var3.d, roundingMode), i18);
                                                }
                                            }
                                        } else {
                                            j11 = -1;
                                        }
                                        int i74 = 1;
                                        if (jArr6.length == 1) {
                                            if (jArr6[0] == 0) {
                                                jArr15.getClass();
                                                long j28 = jArr15[0];
                                                for (int i75 = 0; i75 < jArr16.length; i75++) {
                                                    jArr16[i75] = y2r0.d0(jArr16[i75] - j28, 1000000L, vep0Var3.c, RoundingMode.DOWN);
                                                }
                                                vgp0Var2 = new vgp0(vep0Var3, jArr14, iArr3, i17, jArr16, iArr4, x, z9, y2r0.d0(j8 - j28, 1000000L, vep0Var3.c, RoundingMode.DOWN), i18);
                                            } else {
                                                i74 = 1;
                                            }
                                        }
                                        int[] iArr12 = iArr3;
                                        int[] iArr13 = iArr4;
                                        int i76 = i18;
                                        boolean z11 = i72 == i74;
                                        int[] iArr14 = new int[jArr6.length];
                                        int[] iArr15 = new int[jArr6.length];
                                        jArr15.getClass();
                                        int i77 = 0;
                                        int i78 = 0;
                                        int i79 = 0;
                                        boolean z12 = false;
                                        while (i79 < jArr6.length) {
                                            long j29 = jArr15[i79];
                                            if (j29 != j11) {
                                                iArr6 = iArr15;
                                                i20 = i79;
                                                long d08 = y2r0.d0(jArr6[i79], vep0Var3.c, vep0Var3.d, RoundingMode.DOWN) + j29;
                                                boolean z13 = z12;
                                                iArr14[i20] = y2r0.f(jArr16, j29, true);
                                                int b9 = y2r0.b(jArr16, d08, z11);
                                                z7 = z11;
                                                int i80 = b9 - 1;
                                                int i81 = 0;
                                                for (int i82 = b9; i82 < jArr16.length; i82++) {
                                                    if (jArr16[i82] >= d08) {
                                                        i81++;
                                                        if (i81 > aVar8.p) {
                                                            break;
                                                        }
                                                    } else {
                                                        i80 = i82;
                                                    }
                                                }
                                                iArr6[i20] = i80 + 1;
                                                int i83 = iArr14[i20];
                                                while (true) {
                                                    i21 = iArr14[i20];
                                                    if (i21 <= 0 || (iArr13[i21] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr14[i20] = i21 - 1;
                                                }
                                                if (i21 == 0 && (iArr13[0] & 1) == 0) {
                                                    iArr14[i20] = i83;
                                                    while (true) {
                                                        int i84 = iArr14[i20];
                                                        if (i84 >= iArr6[i20] || (iArr13[i84] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr14[i20] = i84 + 1;
                                                    }
                                                }
                                                int i85 = iArr6[i20];
                                                int i86 = iArr14[i20];
                                                int i87 = (i85 - i86) + i77;
                                                boolean z14 = i78 != i86;
                                                i78 = i85;
                                                z12 = z13 | z14;
                                                i77 = i87;
                                            } else {
                                                z7 = z11;
                                                iArr6 = iArr15;
                                                i20 = i79;
                                            }
                                            i79 = i20 + 1;
                                            iArr15 = iArr6;
                                            z11 = z7;
                                        }
                                        int[] iArr16 = iArr15;
                                        boolean z15 = z12 | (i77 != i76);
                                        long[] jArr17 = z15 ? new long[i77] : jArr14;
                                        int[] iArr17 = z15 ? new int[i77] : iArr12;
                                        if (z15) {
                                            i17 = 0;
                                        }
                                        int[] iArr18 = z15 ? new int[i77] : iArr13;
                                        ArrayList arrayList7 = z15 ? new ArrayList() : arrayList6;
                                        long[] jArr18 = new long[i77];
                                        int i88 = 0;
                                        boolean z16 = false;
                                        int i89 = 0;
                                        int i90 = i17;
                                        long j30 = 0;
                                        while (i88 < jArr6.length) {
                                            long j31 = jArr15[i88];
                                            int i91 = iArr14[i88];
                                            androidx.media3.common.a aVar9 = aVar8;
                                            int i92 = iArr16[i88];
                                            long[] jArr19 = jArr18;
                                            if (z15) {
                                                int i93 = i92 - i91;
                                                System.arraycopy(jArr14, i91, jArr17, i89, i93);
                                                System.arraycopy(iArr12, i91, iArr17, i89, i93);
                                                System.arraycopy(iArr13, i91, iArr18, i89, i93);
                                            }
                                            int i94 = i90;
                                            while (i91 < i92) {
                                                int i95 = i91;
                                                int i96 = i92;
                                                long j32 = vep0Var3.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long d09 = y2r0.d0(j30, 1000000L, j32, roundingMode2);
                                                long d010 = y2r0.d0(jArr16[i95] - j31, 1000000L, vep0Var3.c, roundingMode2);
                                                if (d010 < 0) {
                                                    z16 = true;
                                                }
                                                jArr19[i89] = d09 + d010;
                                                if (z15 && iArr17[i89] > i94) {
                                                    i94 = iArr12[i95];
                                                }
                                                if (z15 && !z9 && (iArr18[i89] & 1) != 0) {
                                                    arrayList7.add(Integer.valueOf(i89));
                                                }
                                                i89++;
                                                i91 = i95 + 1;
                                                i92 = i96;
                                            }
                                            j30 += jArr6[i88];
                                            i88++;
                                            i90 = i94;
                                            aVar8 = aVar9;
                                            jArr18 = jArr19;
                                        }
                                        androidx.media3.common.a aVar10 = aVar8;
                                        long[] jArr20 = jArr18;
                                        long d011 = y2r0.d0(j30, 1000000L, vep0Var3.d, RoundingMode.DOWN);
                                        if (z16) {
                                            a.C0043a a6 = aVar10.a();
                                            a6.s = true;
                                            vep0Var3 = vep0Var3.a(new androidx.media3.common.a(a6));
                                        }
                                        vgp0Var = new vgp0(vep0Var3, jArr17, iArr17, i90, jArr20, iArr18, ipx.x(arrayList7), z9, d011, jArr17.length);
                                        arrayList3 = arrayList2;
                                    }
                                }
                                vgp0Var = vgp0Var2;
                                arrayList3 = arrayList2;
                            } else {
                                xi90Var = xi90Var10;
                                xi90Var9 = null;
                            }
                        } else {
                            xi90Var = xi90Var10;
                            i10 = 0;
                        }
                        i11 = -1;
                        int a42 = iVar.a();
                        i12 = i22;
                        String str42 = aVar7.n;
                        if (a42 == -1) {
                        }
                        ArrayList arrayList62 = new ArrayList();
                        if (xi90Var9 != null) {
                        }
                        if (z5) {
                        }
                        long[] jArr142 = jArr3;
                        j10 = vep0Var3.f;
                        if (j10 > j3) {
                        }
                        int i722 = vep0Var3.b;
                        long j252 = vep0Var3.c;
                        androidx.media3.common.a aVar82 = vep0Var3.g;
                        long[] jArr152 = vep0Var3.j;
                        jArr6 = vep0Var3.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long d042 = y2r0.d0(j8, 1000000L, j252, roundingMode3);
                        int[] x2 = ipx.x(arrayList62);
                        if (jArr6 != null) {
                        }
                        vgp0Var = vgp0Var2;
                        arrayList3 = arrayList2;
                    }
                    arrayList3.add(vgp0Var);
                }
            }
            i22 = i12 + 1;
            aVar4 = aVar;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0199, code lost:
    
        r1.P(r10);
        r1.Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ac, code lost:
    
        r10 = new xsna.ugx(r0, r9, r1.y(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0283, code lost:
    
        xsna.ahn.m("Skipped unknown metadata entry: " + xsna.sf30.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0296, code lost:
    
        r1.P(r15);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0076, code lost:
    
        r0 = xsna.dsv.a(xsna.xi20.c(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x007f, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0081, code lost:
    
        r10 = new xsna.lio0("TCON", r12, com.google.common.collect.ImmutableList.p(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008b, code lost:
    
        xsna.ahn.F("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0090, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b6, code lost:
    
        r1.P(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b8, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01bf, code lost:
    
        if (r0 != 6516084) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c1, code lost:
    
        r0 = r1.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cc, code lost:
    
        if (r1.p() != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ce, code lost:
    
        r1.Q(8);
        r0 = r1.y(r0 - 16);
        r10 = new xsna.pbg(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e4, code lost:
    
        xsna.ahn.F("Failed to parse comment attribute: " + xsna.sf30.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01fd, code lost:
    
        if (r0 == 7233901) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0202, code lost:
    
        if (r0 != 7631467) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0209, code lost:
    
        if (r0 == 6516589) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x020e, code lost:
    
        if (r0 != 7828084) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0215, code lost:
    
        if (r0 != 6578553) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0217, code lost:
    
        r10 = xsna.xi20.e(r13, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0221, code lost:
    
        if (r0 != 4280916) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r1.P(r7);
        r7 = r7 + r13;
        r1.Q(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0223, code lost:
    
        r10 = xsna.xi20.e(r13, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022d, code lost:
    
        if (r0 != 7630703) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x022f, code lost:
    
        r10 = xsna.xi20.e(r13, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x023a, code lost:
    
        if (r0 != 6384738) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023c, code lost:
    
        r10 = xsna.xi20.e(r13, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0247, code lost:
    
        if (r0 != 7108978) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0249, code lost:
    
        r10 = xsna.xi20.e(r13, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0254, code lost:
    
        if (r0 != 6776174) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0256, code lost:
    
        r10 = xsna.xi20.e(r13, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x025f, code lost:
    
        if (r0 != 6779504) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0261, code lost:
    
        r10 = xsna.xi20.e(r13, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x026c, code lost:
    
        if (r0 != 7173742) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x026e, code lost:
    
        r10 = xsna.xi20.e(r13, "MVNM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r13 >= r7) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0279, code lost:
    
        if (r0 != 7173737) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x027b, code lost:
    
        r10 = xsna.xi20.d(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x029b, code lost:
    
        r10 = xsna.xi20.e(r13, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02a3, code lost:
    
        r10 = xsna.xi20.e(r13, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02be, code lost:
    
        if (r6.isEmpty() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r15 = r1.p() + r13;
        r13 = r1.p();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c2, code lost:
    
        r12 = new xsna.fi20(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r10 = xsna.xi20.b(r13, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r1.P(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02ab, code lost:
    
        if (r10 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02ad, code lost:
    
        r6.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02b0, code lost:
    
        r8 = 4;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r10 = xsna.xi20.b(r13, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        r10 = xsna.xi20.d(r13, "TBPM", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r10 = xsna.xi20.d(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        r10 = xsna.xi20.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10 = xsna.xi20.e(r13, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r10 = xsna.xi20.e(r13, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r10 = xsna.xi20.e(r13, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        r10 = xsna.xi20.e(r13, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        r10 = xsna.xi20.e(r13, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        r10 = xsna.xi20.e(r13, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
    
        r10 = xsna.xi20.d(r13, "ITUNESADVISORY", r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        r10 = xsna.xi20.d(r13, "ITUNESGAPLESS", r1, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        r10 = xsna.xi20.e(r13, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0149, code lost:
    
        r10 = xsna.xi20.e(r13, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        r0 = r12;
        r9 = r0;
        r10 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        r14 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        if (r14 >= r15) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015e, code lost:
    
        r17 = r1.p();
        r12 = r1.p();
        r1.Q(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016e, code lost:
    
        r0 = r1.y(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        r9 = r1.y(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0184, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0186, code lost:
    
        r10 = r14;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        r1.Q(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0191, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
    
        if (r10 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01af, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b0, code lost:
    
        r1.P(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fi20 k(sf30.b bVar) {
        int i2;
        fi20 fi20Var;
        fi20 b2;
        fi20 fi20Var2;
        int i3;
        xi90 xi90Var = bVar.b;
        int i4 = 8;
        xi90Var.P(8);
        fi20 fi20Var3 = new fi20(new fi20.a[0]);
        while (xi90Var.a() >= i4) {
            int i5 = xi90Var.b;
            int p = xi90Var.p();
            int p2 = xi90Var.p();
            int i6 = 4;
            String str = null;
            if (p2 == 1835365473) {
                xi90Var.P(i5);
                int i7 = i5 + p;
                xi90Var.Q(i4);
                a(xi90Var);
                while (true) {
                    int i8 = xi90Var.b;
                    if (i8 >= i7) {
                        break;
                    }
                    int p3 = xi90Var.p();
                    if (xi90Var.p() == 1768715124) {
                        break;
                    }
                    xi90Var.P(i8 + p3);
                    i4 = 8;
                    i6 = 4;
                    str = null;
                }
                fi20 fi20Var4 = null;
                fi20Var3 = fi20Var3.b(fi20Var4);
                i2 = 8;
            } else {
                if (p2 == 1936553057) {
                    xi90Var.P(i5);
                    int i9 = i5 + p;
                    xi90Var.Q(12);
                    while (true) {
                        int i10 = xi90Var.b;
                        if (i10 >= i9) {
                            i2 = 8;
                            break;
                        }
                        int p4 = xi90Var.p();
                        if (xi90Var.p() != 1935766900) {
                            xi90Var.P(i10 + p4);
                        } else if (p4 < 16) {
                            fi20Var2 = null;
                            i2 = 8;
                        } else {
                            xi90Var.Q(4);
                            int i11 = 0;
                            int i12 = -1;
                            for (int i13 = 0; i13 < 2; i13++) {
                                int C = xi90Var.C();
                                int C2 = xi90Var.C();
                                if (C == 0) {
                                    i12 = C2;
                                } else if (C == 1) {
                                    i11 = C2;
                                }
                            }
                            if (i12 == 12) {
                                i3 = PsExtractor.VIDEO_STREAM_MASK;
                            } else if (i12 == 13) {
                                i3 = 120;
                            } else if (i12 != 21) {
                                i3 = -2147483647;
                            } else {
                                i2 = 8;
                                if (xi90Var.a() >= 8 && xi90Var.b + 8 <= i9) {
                                    int p5 = xi90Var.p();
                                    int p6 = xi90Var.p();
                                    if (p5 >= 12 && p6 == 1936877170) {
                                        i3 = xi90Var.D();
                                        if (i3 != -2147483647) {
                                            fi20Var2 = new fi20(new y6k0(i3, i11));
                                        }
                                    }
                                }
                                i3 = -2147483647;
                                if (i3 != -2147483647) {
                                }
                            }
                            i2 = 8;
                            if (i3 != -2147483647) {
                            }
                        }
                    }
                    fi20Var2 = null;
                    b2 = fi20Var3.b(fi20Var2);
                } else {
                    i2 = 8;
                    if (p2 == -1451722374) {
                        short z = xi90Var.z();
                        xi90Var.Q(2);
                        String A = xi90Var.A(z, StandardCharsets.UTF_8);
                        int max = Math.max(A.lastIndexOf(43), A.lastIndexOf(45));
                        try {
                            fi20Var = new fi20(new vf30(Float.parseFloat(A.substring(0, max)), Float.parseFloat(A.substring(max, A.length() - 1))));
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            fi20Var = null;
                        }
                        b2 = fi20Var3.b(fi20Var);
                    }
                }
                fi20Var3 = b2;
            }
            xi90Var.P(i5 + p);
            i4 = i2;
        }
        return fi20Var3;
    }
}
