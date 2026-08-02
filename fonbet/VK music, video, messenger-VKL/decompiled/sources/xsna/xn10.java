package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a1n0;
import xsna.fi20;
import xsna.l0;
import xsna.n3i0;
import xsna.rgp0;
import xsna.wdl;

/* compiled from: MatroskaExtractor.java */
/* loaded from: classes12.dex */
public final class xn10 implements pgq {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map<String, Integer> p0;
    public int A;
    public long B;
    public final SparseArray<List<b.a>> C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final wdl a;
    public int a0;
    public final jkr0 b;
    public int b0;
    public final SparseArray<c> c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final a1n0.a f;
    public boolean f0;
    public final xi90 g;
    public int g0;
    public final xi90 h;
    public byte h0;
    public final xi90 i;
    public boolean i0;
    public final xi90 j;
    public rgq j0;
    public final xi90 k;
    public final xi90 l;
    public final xi90 m;
    public final xi90 n;
    public final xi90 o;
    public final xi90 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;

    @Nullable
    public c y;
    public boolean z;

    /* compiled from: MatroskaExtractor.java */
    public final class a {
        public a() {
        }

        public final void a(int i, int i2, qgq qgqVar) throws IOException {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            long j;
            int i8;
            int i9;
            int i10;
            int i11;
            xn10 xn10Var = xn10.this;
            jkr0 jkr0Var = xn10Var.b;
            SparseArray<c> sparseArray = xn10Var.c;
            xi90 xi90Var = xn10Var.k;
            xi90 xi90Var2 = xn10Var.i;
            int i12 = 2;
            int i13 = 0;
            int i14 = 1;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (xn10Var.O != 2) {
                        return;
                    }
                    c cVar = sparseArray.get(xn10Var.U);
                    int i15 = xn10Var.X;
                    xi90 xi90Var3 = xn10Var.p;
                    if (i15 != 4 || !"V_VP9".equals(cVar.c)) {
                        qgqVar.skipFully(i2);
                        return;
                    } else {
                        xi90Var3.M(i2);
                        qgqVar.readFully(xi90Var3.a, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    xn10Var.g(i);
                    c cVar2 = xn10Var.y;
                    int i16 = cVar2.h;
                    if (i16 != 1685485123 && i16 != 1685480259) {
                        qgqVar.skipFully(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    cVar2.P = bArr;
                    qgqVar.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    xn10Var.g(i);
                    c cVar3 = xn10Var.y;
                    byte[] bArr2 = new byte[i2];
                    cVar3.j = bArr2;
                    qgqVar.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    qgqVar.readFully(bArr3, 0, i2);
                    xn10Var.g(i);
                    xn10Var.y.k = new rgp0.a(1, bArr3, 0, 0);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(xi90Var.a, (byte) 0);
                    qgqVar.readFully(xi90Var.a, 4 - i2, i2);
                    xi90Var.P(0);
                    xn10Var.A = (int) xi90Var.E();
                    return;
                }
                if (i == 25506) {
                    xn10Var.g(i);
                    c cVar4 = xn10Var.y;
                    byte[] bArr4 = new byte[i2];
                    cVar4.l = bArr4;
                    qgqVar.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i);
                }
                xn10Var.g(i);
                c cVar5 = xn10Var.y;
                byte[] bArr5 = new byte[i2];
                cVar5.x = bArr5;
                qgqVar.readFully(bArr5, 0, i2);
                return;
            }
            if (xn10Var.O == 0) {
                xn10Var.U = (int) jkr0Var.b(qgqVar, false, true, 8);
                xn10Var.V = jkr0Var.c;
                xn10Var.Q = C.TIME_UNSET;
                xn10Var.O = 1;
                xi90Var2.M(0);
            }
            c cVar6 = sparseArray.get(xn10Var.U);
            if (cVar6 == null) {
                qgqVar.skipFully(i2 - xn10Var.V);
                xn10Var.O = 0;
                return;
            }
            cVar6.a0.getClass();
            if (xn10Var.O == 1) {
                xn10Var.l(qgqVar, 3);
                int i17 = (xi90Var2.a[2] & 6) >> 1;
                byte b = 255;
                if (i17 == 0) {
                    xn10Var.S = 1;
                    int[] iArr = xn10Var.T;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    xn10Var.T = iArr;
                    iArr[0] = (i2 - xn10Var.V) - 3;
                } else {
                    xn10Var.l(qgqVar, 4);
                    int i18 = (xi90Var2.a[3] & 255) + 1;
                    xn10Var.S = i18;
                    int[] iArr2 = xn10Var.T;
                    if (iArr2 == null) {
                        iArr2 = new int[i18];
                    } else if (iArr2.length < i18) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i18)];
                    }
                    xn10Var.T = iArr2;
                    if (i17 == 2) {
                        int i19 = (i2 - xn10Var.V) - 4;
                        int i20 = xn10Var.S;
                        Arrays.fill(iArr2, 0, i20, i19 / i20);
                    } else {
                        if (i17 != 1) {
                            if (i17 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i17);
                            }
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 4;
                            while (true) {
                                int i24 = xn10Var.S - i14;
                                if (i21 >= i24) {
                                    i3 = i12;
                                    i4 = i13;
                                    i5 = i14;
                                    xn10Var.T[i24] = ((i2 - xn10Var.V) - i23) - i22;
                                    break;
                                }
                                xn10Var.T[i21] = i13;
                                int i25 = i23 + 1;
                                xn10Var.l(qgqVar, i25);
                                if (xi90Var2.a[i23] == 0) {
                                    throw ParserException.a(null, "No valid varint length mask found");
                                }
                                int i26 = i13;
                                while (true) {
                                    if (i26 >= 8) {
                                        i6 = i12;
                                        i7 = i14;
                                        j = 0;
                                        i8 = i25;
                                        break;
                                    }
                                    int i27 = i14 << (7 - i26);
                                    i6 = i12;
                                    if ((xi90Var2.a[i23] & i27) != 0) {
                                        int i28 = i25 + i26;
                                        xn10Var.l(qgqVar, i28);
                                        i7 = i14;
                                        j = xi90Var2.a[i23] & b & (~i27);
                                        while (i25 < i28) {
                                            j = (j << 8) | (xi90Var2.a[i25] & b);
                                            i25++;
                                            i28 = i28;
                                            b = 255;
                                        }
                                        i8 = i28;
                                        if (i21 > 0) {
                                            j -= (1 << ((i26 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i26++;
                                        i12 = i6;
                                        b = 255;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i29 = (int) j;
                                int[] iArr3 = xn10Var.T;
                                if (i21 != 0) {
                                    i29 += iArr3[i21 - 1];
                                }
                                iArr3[i21] = i29;
                                i22 += i29;
                                i21++;
                                i13 = i26;
                                i12 = i6;
                                i14 = i7;
                                i23 = i8;
                                b = 255;
                            }
                            throw ParserException.a(null, "EBML lacing sample size out of range.");
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 4;
                        while (true) {
                            i9 = xn10Var.S - 1;
                            if (i30 >= i9) {
                                break;
                            }
                            xn10Var.T[i30] = 0;
                            while (true) {
                                i10 = i32 + 1;
                                xn10Var.l(qgqVar, i10);
                                int i33 = xi90Var2.a[i32] & 255;
                                int[] iArr4 = xn10Var.T;
                                i11 = iArr4[i30] + i33;
                                iArr4[i30] = i11;
                                if (i33 != 255) {
                                    break;
                                } else {
                                    i32 = i10;
                                }
                            }
                            i31 += i11;
                            i30++;
                            i32 = i10;
                        }
                        xn10Var.T[i9] = ((i2 - xn10Var.V) - i32) - i31;
                    }
                }
                i3 = 2;
                i4 = 0;
                i5 = 1;
                byte[] bArr6 = xi90Var2.a;
                xn10Var.P = xn10Var.n((bArr6[i5] & 255) | (bArr6[i4] << 8)) + xn10Var.M;
                xn10Var.W = (cVar6.e == i5 || (i == 163 && (xi90Var2.a[i3] & 128) == 128)) ? 1 : i4;
                xn10Var.O = i3;
                xn10Var.R = i4;
            }
            if (i == 163) {
                while (true) {
                    int i34 = xn10Var.R;
                    if (i34 >= xn10Var.S) {
                        xn10Var.O = 0;
                        return;
                    } else {
                        xn10Var.h(cVar6, ((xn10Var.R * cVar6.f) / 1000) + xn10Var.P, xn10Var.W, xn10Var.o(qgqVar, cVar6, xn10Var.T[i34], false), 0);
                        xn10Var.R++;
                    }
                }
            } else {
                while (true) {
                    int i35 = xn10Var.R;
                    if (i35 >= xn10Var.S) {
                        return;
                    }
                    int[] iArr5 = xn10Var.T;
                    iArr5[i35] = xn10Var.o(qgqVar, cVar6, iArr5[i35], true);
                    xn10Var.R++;
                }
            }
        }

        public final void b(int i, long j) throws ParserException {
            xn10 xn10Var = xn10.this;
            if (i == 240) {
                if (xn10Var.z) {
                    return;
                }
                xn10Var.f(i);
                if (xn10Var.H == -1) {
                    xn10Var.H = j;
                    return;
                }
                return;
            }
            if (i == 241) {
                if (xn10Var.z) {
                    return;
                }
                xn10Var.f(i);
                if (xn10Var.G == -1) {
                    xn10Var.G = j;
                    return;
                }
                return;
            }
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
            }
            switch (i) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                    int i2 = (int) j;
                    if (i2 == 1) {
                        xn10Var.g(i);
                        xn10Var.y.e = 2;
                        return;
                    }
                    if (i2 == 2) {
                        xn10Var.g(i);
                        xn10Var.y.e = 1;
                        return;
                    } else if (i2 == 17) {
                        xn10Var.g(i);
                        xn10Var.y.e = 3;
                        return;
                    } else if (i2 != 33) {
                        xn10Var.g(i);
                        xn10Var.y.e = -1;
                        return;
                    } else {
                        xn10Var.g(i);
                        xn10Var.y.e = 5;
                        return;
                    }
                case PRIVACY_URL_ERROR_VALUE:
                    xn10Var.g(i);
                    xn10Var.y.Y = j == 1;
                    return;
                case 155:
                    xn10Var.Q = xn10Var.n(j);
                    return;
                case 159:
                    xn10Var.g(i);
                    xn10Var.y.Q = (int) j;
                    return;
                case 176:
                    xn10Var.g(i);
                    xn10Var.y.n = (int) j;
                    return;
                case 179:
                    if (xn10Var.z) {
                        return;
                    }
                    xn10Var.f(i);
                    xn10Var.E = xn10Var.n(j);
                    return;
                case 186:
                    xn10Var.g(i);
                    xn10Var.y.o = (int) j;
                    return;
                case AD_RESPONSE_EMPTY_VALUE:
                    xn10Var.g(i);
                    xn10Var.y.d = (int) j;
                    return;
                case 231:
                    xn10Var.M = xn10Var.n(j);
                    return;
                case 238:
                    xn10Var.X = (int) j;
                    return;
                case 247:
                    if (xn10Var.z) {
                        return;
                    }
                    xn10Var.f(i);
                    xn10Var.F = (int) j;
                    return;
                case 251:
                    xn10Var.Y = true;
                    return;
                case 16871:
                    xn10Var.g(i);
                    xn10Var.y.h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    xn10Var.B = j + xn10Var.s;
                    return;
                case 21432:
                    int i3 = (int) j;
                    xn10Var.g(i);
                    if (i3 == 0) {
                        xn10Var.y.y = 0;
                        return;
                    }
                    if (i3 == 1) {
                        xn10Var.y.y = 2;
                        return;
                    } else if (i3 == 3) {
                        xn10Var.y.y = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        xn10Var.y.y = 3;
                        return;
                    }
                case 21680:
                    xn10Var.g(i);
                    xn10Var.y.q = (int) j;
                    return;
                case 21682:
                    xn10Var.g(i);
                    xn10Var.y.s = (int) j;
                    return;
                case 21690:
                    xn10Var.g(i);
                    xn10Var.y.r = (int) j;
                    return;
                case 21930:
                    xn10Var.g(i);
                    xn10Var.y.X = j == 1;
                    return;
                case 21938:
                    xn10Var.g(i);
                    c cVar = xn10Var.y;
                    cVar.z = true;
                    cVar.p = (int) j;
                    return;
                case 21998:
                    xn10Var.g(i);
                    xn10Var.y.g = (int) j;
                    return;
                case 22186:
                    xn10Var.g(i);
                    xn10Var.y.T = j;
                    return;
                case 22203:
                    xn10Var.g(i);
                    xn10Var.y.U = j;
                    return;
                case 25188:
                    xn10Var.g(i);
                    xn10Var.y.R = (int) j;
                    return;
                case 30114:
                    xn10Var.Z = j;
                    return;
                case 30321:
                    xn10Var.g(i);
                    int i4 = (int) j;
                    if (i4 == 0) {
                        xn10Var.y.t = 0;
                        return;
                    }
                    if (i4 == 1) {
                        xn10Var.y.t = 1;
                        return;
                    } else if (i4 == 2) {
                        xn10Var.y.t = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        xn10Var.y.t = 3;
                        return;
                    }
                case 2352003:
                    xn10Var.g(i);
                    xn10Var.y.f = (int) j;
                    return;
                case 2807729:
                    xn10Var.t = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            xn10Var.g(i);
                            int i5 = (int) j;
                            if (i5 == 1) {
                                xn10Var.y.C = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                xn10Var.y.C = 1;
                                return;
                            }
                        case 21946:
                            xn10Var.g(i);
                            int j2 = m6g.j((int) j);
                            if (j2 != -1) {
                                xn10Var.y.B = j2;
                                return;
                            }
                            return;
                        case 21947:
                            xn10Var.g(i);
                            xn10Var.y.z = true;
                            int i6 = m6g.i((int) j);
                            if (i6 != -1) {
                                xn10Var.y.A = i6;
                                return;
                            }
                            return;
                        case 21948:
                            xn10Var.g(i);
                            xn10Var.y.D = (int) j;
                            return;
                        case 21949:
                            xn10Var.g(i);
                            xn10Var.y.E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }

        public final void c(int i, long j, long j2) throws ParserException {
            xn10 xn10Var = xn10.this;
            xn10Var.j0.getClass();
            if (i == 160) {
                xn10Var.Y = false;
                xn10Var.Z = 0L;
                return;
            }
            if (i == 174) {
                c cVar = new c();
                xn10Var.y = cVar;
                cVar.a = xn10Var.w;
                return;
            }
            if (i == 183) {
                if (xn10Var.z) {
                    return;
                }
                xn10Var.f(i);
                xn10Var.F = -1;
                xn10Var.G = -1L;
                xn10Var.H = -1L;
                return;
            }
            if (i == 187) {
                if (xn10Var.z) {
                    return;
                }
                xn10Var.f(i);
                xn10Var.E = C.TIME_UNSET;
                return;
            }
            if (i == 19899) {
                xn10Var.A = -1;
                xn10Var.B = -1L;
                return;
            }
            if (i == 20533) {
                xn10Var.g(i);
                xn10Var.y.i = true;
                return;
            }
            if (i == 21968) {
                xn10Var.g(i);
                xn10Var.y.z = true;
                return;
            }
            if (i == 408125543) {
                long j3 = xn10Var.s;
                if (j3 != -1 && j3 != j) {
                    throw ParserException.a(null, "Multiple Segment elements not supported");
                }
                xn10Var.s = j;
                xn10Var.r = j2;
                return;
            }
            if (i == 475249515) {
                if (xn10Var.z) {
                    return;
                }
                xn10Var.D = true;
            } else if (i == 524531317 && !xn10Var.z) {
                if (xn10Var.d && xn10Var.K != -1) {
                    xn10Var.J = true;
                } else {
                    xn10Var.j0.f(new n3i0.b(xn10Var.v));
                    xn10Var.z = true;
                }
            }
        }

        public final void d(int i, String str) throws ParserException {
            xn10 xn10Var = xn10.this;
            if (i == 134) {
                xn10Var.g(i);
                xn10Var.y.c = str;
                return;
            }
            if (i == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    xn10Var.w = str.equals("webm");
                    return;
                }
                throw ParserException.a(null, "DocType " + str + " not supported");
            }
            if (i == 21358) {
                xn10Var.g(i);
                xn10Var.y.b = str;
            } else {
                if (i != 2274716) {
                    return;
                }
                xn10Var.g(i);
                xn10Var.y.Z = str;
            }
        }
    }

    /* compiled from: MatroskaExtractor.java */
    public static final class b implements n3i0, gcc {

        @Nullable
        public final fcc a;
        public final SparseArray<List<a>> b;
        public final long c;
        public final int d;

        /* compiled from: MatroskaExtractor.java */
        public static final class a implements Comparable<a> {
            public final long b;
            public final long c;
            public final long d;

            public a(long j, long j2, long j3) {
                this.b = j;
                this.c = j2;
                this.d = j3;
            }

            @Override // java.lang.Comparable
            public final int compareTo(a aVar) {
                return Long.compare(this.b, aVar.b);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                return Objects.hash(Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
            }
        }

        public b(SparseArray<List<a>> sparseArray, long j, int i, long j2, long j3) {
            fcc fccVar;
            int i2;
            this.b = sparseArray;
            this.c = j;
            this.d = i;
            List<a> list = sparseArray.get(i);
            if (list == null || list.isEmpty()) {
                fccVar = null;
            } else {
                int size = list.size();
                int[] iArr = new int[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[size];
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    a aVar = list.get(i4);
                    jArr3[i4] = aVar.b;
                    jArr[i4] = aVar.c;
                }
                while (true) {
                    i2 = size - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i5 = i3 + 1;
                    iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                    jArr2[i3] = jArr3[i5] - jArr3[i3];
                    i3 = i5;
                }
                int i6 = i2;
                while (i6 > 0 && jArr3[i6] >= j) {
                    i6--;
                }
                iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
                jArr2[i6] = j - jArr3[i6];
                if (i6 < i2) {
                    ahn.F("Discarding trailing cue points with timestamps greater than total duration.");
                    int i7 = i6 + 1;
                    iArr = Arrays.copyOf(iArr, i7);
                    jArr = Arrays.copyOf(jArr, i7);
                    jArr2 = Arrays.copyOf(jArr2, i7);
                    jArr3 = Arrays.copyOf(jArr3, i7);
                }
                fccVar = new fcc(iArr, jArr, jArr2, jArr3);
            }
            this.a = fccVar;
        }

        @Override // xsna.gcc
        @Nullable
        public final fcc a() {
            return this.a;
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return this.c;
        }

        @Override // xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            fcc fccVar = this.a;
            if (fccVar != null) {
                return fccVar.getSeekPoints(j);
            }
            p3i0 p3i0Var = p3i0.c;
            return new n3i0.a(p3i0Var, p3i0Var);
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            List<a> list = this.b.get(this.d);
            return (list == null || list.isEmpty()) ? false : true;
        }
    }

    /* compiled from: MatroskaExtractor.java */
    public static final class c {
        public byte[] P;
        public asp0 V;
        public boolean X;
        public boolean a;
        public rgp0 a0;
        public String b;
        public androidx.media3.common.a b0;
        public String c;
        public int c0;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public byte[] j;
        public rgp0.a k;
        public byte[] l;
        public DrmInitData m;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = 0;
        public int t = -1;
        public float u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public byte[] x = null;
        public int y = -1;
        public boolean z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean W = false;
        public boolean Y = true;
        public String Z = "eng";

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        String str = y2r0.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        a7g.a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a7g.a(180, hashMap, "htc_video_rotA-180", atv0.b, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(hashMap);
    }

    public xn10(a1n0.a aVar, int i) {
        wdl wdlVar = new wdl();
        this.s = -1L;
        this.t = C.TIME_UNSET;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = C.TIME_UNSET;
        this.a = wdlVar;
        wdlVar.d = new a();
        this.f = aVar;
        this.C = new SparseArray<>();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new jkr0();
        this.c = new SparseArray<>();
        this.i = new xi90(4);
        this.j = new xi90(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new xi90(4);
        this.g = new xi90(rt50.a);
        this.h = new xi90(4);
        this.l = new xi90();
        this.m = new xi90();
        this.n = new xi90(8);
        this.o = new xi90();
        this.p = new xi90();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] i(long j, long j2, String str) {
        fxc0.p(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = y2r0.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f8c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0f93, code lost:
    
        r3 = r34;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f8d, code lost:
    
        r0 = r42;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a2f, code lost:
    
        if (r0.w() == r1.getLeastSignificantBits()) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d58, code lost:
    
        r4 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f7a, code lost:
    
        if (r4 == false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f7c, code lost:
    
        r0 = r42;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f8a, code lost:
    
        if (r0.k(r44, r1.getPosition()) == false) goto L926;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, xsna.xn10$c] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v152 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v129 */
    /* JADX WARN: Type inference failed for: r6v130, types: [int] */
    /* JADX WARN: Type inference failed for: r6v132 */
    /* JADX WARN: Type inference failed for: r6v133, types: [int] */
    /* JADX WARN: Type inference failed for: r6v136 */
    /* JADX WARN: Type inference failed for: r6v137, types: [int] */
    /* JADX WARN: Type inference failed for: r6v143 */
    /* JADX WARN: Type inference failed for: r6v144 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.jkr0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.SparseArray, android.util.SparseArray<xsna.xn10$c>] */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        int a2;
        qgq qgqVar2;
        char c2;
        String str2;
        List<byte[]> list;
        int F;
        int i4;
        String str3;
        RuntimeException runtimeException;
        Pair pair;
        String str4;
        List<byte[]> list2;
        List<byte[]> p;
        a.C0043a c0043a;
        boolean l;
        int i5;
        m6g m6gVar;
        byte[] bArr;
        int i6;
        String str5;
        pvn e;
        int i7;
        List<b.a> list3;
        int i8;
        long j;
        int i9;
        long j2;
        long j3;
        fi20 a3;
        xn10 xn10Var = this;
        boolean z2 = false;
        xn10Var.N = false;
        boolean z3 = true;
        boolean z4 = true;
        while (z4 && !xn10Var.N) {
            wdl wdlVar = xn10Var.a;
            ?? r7 = wdlVar.c;
            ArrayDeque<wdl.a> arrayDeque = wdlVar.b;
            wdlVar.d.getClass();
            ?? r3 = z3;
            while (true) {
                wdl.a peek = arrayDeque.peek();
                if (peek == null || qgqVar.getPosition() < peek.b) {
                    ?? r32 = z2;
                    qgq qgqVar3 = qgqVar;
                    if (wdlVar.e == 0) {
                        int i10 = 4;
                        long b2 = r7.b(qgqVar3, true, r32, 4);
                        if (b2 == -2) {
                            byte[] bArr2 = wdlVar.a;
                            qgqVar3.resetPeekPosition();
                            int i11 = r32;
                            while (true) {
                                qgqVar3.peekFully(bArr2, i11, i10);
                                byte b3 = bArr2[i11];
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= 8) {
                                        i3 = -1;
                                    } else if ((jkr0.d[i12] & b3) != 0) {
                                        i3 = i12 + 1;
                                    } else {
                                        i12++;
                                    }
                                }
                                if (i3 != -1 && i3 <= 4) {
                                    a2 = (int) jkr0.a(bArr2, i3, false);
                                    xn10 xn10Var2 = xn10.this;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                qgqVar3.skipFully(1);
                                i10 = 4;
                                i11 = 0;
                            }
                            qgqVar3.skipFully(i3);
                            b2 = a2;
                        }
                        z = true;
                        if (b2 == -1) {
                            z4 = false;
                            qgq qgqVar4 = qgqVar3;
                        } else {
                            wdlVar.f = (int) b2;
                            wdlVar.e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (wdlVar.e == z) {
                        wdlVar.g = r7.b(qgqVar3, false, z, 8);
                        wdlVar.e = 2;
                    }
                    a aVar = wdlVar.d;
                    int i13 = wdlVar.f;
                    xn10 xn10Var3 = xn10.this;
                    switch (i13) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case PRIVACY_URL_ERROR_VALUE:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 238:
                        case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        qgqVar3.skipFully((int) wdlVar.g);
                        wdlVar.e = 0;
                        z2 = false;
                        r3 = 1;
                    } else if (i == 1) {
                        long position = qgqVar3.getPosition();
                        arrayDeque.push(new wdl.a(wdlVar.f, wdlVar.g + position));
                        wdlVar.d.c(wdlVar.f, position, wdlVar.g);
                        wdlVar.e = 0;
                        qgqVar2 = qgqVar3;
                    } else if (i == 2) {
                        long j4 = wdlVar.g;
                        if (j4 > 8) {
                            throw ParserException.a(null, "Invalid integer size: " + wdlVar.g);
                        }
                        aVar.b(i13, wdlVar.a(qgqVar3, (int) j4));
                        wdlVar.e = 0;
                        qgqVar2 = qgqVar3;
                    } else if (i == 3) {
                        long j5 = wdlVar.g;
                        if (j5 > 2147483647L) {
                            throw ParserException.a(null, "String element size: " + wdlVar.g);
                        }
                        int i14 = (int) j5;
                        if (i14 == 0) {
                            str = "";
                            i2 = 0;
                        } else {
                            byte[] bArr3 = new byte[i14];
                            qgqVar3.readFully(bArr3, 0, i14);
                            while (i14 > 0 && bArr3[i14 - 1] == 0) {
                                i14--;
                            }
                            i2 = 0;
                            str = new String(bArr3, 0, i14);
                        }
                        aVar.d(i13, str);
                        wdlVar.e = i2;
                        qgqVar2 = qgqVar3;
                    } else if (i == 4) {
                        aVar.a(i13, (int) wdlVar.g, qgqVar3);
                        wdlVar.e = 0;
                        qgqVar2 = qgqVar3;
                    } else {
                        if (i != 5) {
                            throw ParserException.a(null, "Invalid element type " + i);
                        }
                        long j6 = wdlVar.g;
                        if (j6 != 4 && j6 != 8) {
                            throw ParserException.a(null, "Invalid float size: " + wdlVar.g);
                        }
                        int i15 = (int) j6;
                        double intBitsToFloat = i15 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(wdlVar.a(qgqVar3, i15));
                        xn10 xn10Var4 = xn10.this;
                        if (i13 == 181) {
                            xn10Var4.g(i13);
                            xn10Var4.y.S = (int) intBitsToFloat;
                        } else if (i13 != 17545) {
                            switch (i13) {
                                case 21969:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.F = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.G = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.H = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.I = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.J = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.K = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.L = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.M = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.N = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    xn10Var4.g(i13);
                                    xn10Var4.y.O = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i13) {
                                        case 30323:
                                            xn10Var4.g(i13);
                                            xn10Var4.y.u = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            xn10Var4.g(i13);
                                            xn10Var4.y.v = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            xn10Var4.g(i13);
                                            xn10Var4.y.w = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            xn10Var4.u = (long) intBitsToFloat;
                        }
                        wdlVar.e = 0;
                        qgqVar2 = qgqVar3;
                    }
                } else {
                    a aVar2 = wdlVar.d;
                    int i16 = arrayDeque.pop().a;
                    xn10 xn10Var5 = xn10.this;
                    SparseArray<List<b.a>> sparseArray = xn10Var5.C;
                    ?? r8 = xn10Var5.c;
                    xn10Var5.j0.getClass();
                    if (i16 != 160) {
                        int i17 = 20;
                        if (i16 == 174) {
                            ?? r2 = xn10Var5.y;
                            r2.getClass();
                            String str6 = r2.c;
                            if (str6 == null) {
                                throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str6) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i18 = r2.d;
                                    switch (str6.hashCode()) {
                                        case -2095576542:
                                            if (str6.equals("V_MPEG4/ISO/AP")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str6.equals("V_MPEG4/ISO/SP")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str6.equals("A_MS/ACM")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str6.equals("A_TRUEHD")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str6.equals("A_VORBIS")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str6.equals("A_MPEG/L2")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str6.equals("A_MPEG/L3")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str6.equals("V_MS/VFW/FOURCC")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -933872740:
                                            if (str6.equals("S_DVBSUB")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -538363189:
                                            if (str6.equals("V_MPEG4/ISO/ASP")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -538363109:
                                            if (str6.equals("V_MPEG4/ISO/AVC")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -425012669:
                                            if (str6.equals("S_VOBSUB")) {
                                                c2 = 11;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -356037306:
                                            if (str6.equals("A_DTS/LOSSLESS")) {
                                                c2 = '\f';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62923557:
                                            if (str6.equals("A_AAC")) {
                                                c2 = '\r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62923603:
                                            if (str6.equals("A_AC3")) {
                                                c2 = 14;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 62927045:
                                            if (str6.equals("A_DTS")) {
                                                c2 = 15;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82318131:
                                            if (str6.equals("V_AV1")) {
                                                c2 = 16;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82338133:
                                            if (str6.equals("V_VP8")) {
                                                c2 = 17;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 82338134:
                                            if (str6.equals("V_VP9")) {
                                                c2 = 18;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 99146302:
                                            if (str6.equals("S_HDMV/PGS")) {
                                                c2 = 19;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 444813526:
                                            if (str6.equals("V_THEORA")) {
                                                c2 = 20;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 542569478:
                                            if (str6.equals("A_DTS/EXPRESS")) {
                                                c2 = 21;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 635596514:
                                            if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                                c2 = 22;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 725948237:
                                            if (str6.equals("A_PCM/INT/BIG")) {
                                                c2 = 23;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 725957860:
                                            if (str6.equals("A_PCM/INT/LIT")) {
                                                c2 = 24;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 738597099:
                                            if (str6.equals("S_TEXT/ASS")) {
                                                c2 = 25;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 738614379:
                                            if (str6.equals("S_TEXT/SSA")) {
                                                c2 = 26;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 855502857:
                                            if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                c2 = 27;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str6.equals("S_TEXT/WEBVTT")) {
                                                c2 = 28;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str6.equals("S_TEXT/UTF8")) {
                                                c2 = 29;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str6.equals("V_MPEG2")) {
                                                c2 = 30;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str6.equals("A_EAC3")) {
                                                c2 = 31;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str6.equals("A_FLAC")) {
                                                c2 = ' ';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str6.equals("A_OPUS")) {
                                                c2 = '!';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    String str7 = MimeTypes.VIDEO_UNKNOWN;
                                    switch (c2) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            str2 = "video/webm";
                                            byte[] bArr4 = r2.l;
                                            List<byte[]> singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str7 = MimeTypes.VIDEO_MP4V;
                                            list = singletonList;
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null && (e = pvn.e(new xi90(r2.P))) != null) {
                                                str3 = (String) e.b;
                                                str7 = "video/dolby-vision";
                                            }
                                            int i19 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map = p0;
                                            if (l) {
                                                c0043a.E = r2.Q;
                                                c0043a.F = r2.S;
                                                c0043a.G = F;
                                            } else if (io20.p(str7)) {
                                                if (r2.s == 0) {
                                                    int i20 = r2.q;
                                                    i5 = -1;
                                                    if (i20 == -1) {
                                                        i20 = r2.n;
                                                    }
                                                    r2.q = i20;
                                                    int i21 = r2.r;
                                                    if (i21 == -1) {
                                                        i21 = r2.o;
                                                    }
                                                    r2.r = i21;
                                                } else {
                                                    i5 = -1;
                                                }
                                                float f = (r2.q == i5 || (i6 = r2.r) == i5) ? -1.0f : (r2.o * r0) / (r2.n * i6);
                                                if (r2.z) {
                                                    if (r2.F == -1.0f || r2.G == -1.0f || r2.H == -1.0f || r2.I == -1.0f || r2.J == -1.0f || r2.K == -1.0f || r2.L == -1.0f || r2.M == -1.0f || r2.N == -1.0f || r2.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((r2.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.L * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r2.M * 50000.0f) + 0.5f));
                                                        order.putShort((short) (r2.N + 0.5f));
                                                        order.putShort((short) (r2.O + 0.5f));
                                                        order.putShort((short) r2.D);
                                                        order.putShort((short) r2.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i22 = r2.A;
                                                    int i23 = r2.C;
                                                    int i24 = r2.B;
                                                    int i25 = r2.p;
                                                    m6gVar = new m6g(i22, i23, i24, i25, i25, bArr);
                                                } else {
                                                    m6gVar = null;
                                                }
                                                String str8 = r2.b;
                                                int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : map.get(r2.b).intValue();
                                                if (r2.t == 0 && Float.compare(r2.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(r2.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                    if (Float.compare(r2.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(r2.w, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(r2.w, -180.0f) == 0 || Float.compare(r2.w, 180.0f) == 0) {
                                                        intValue = 180;
                                                    } else if (Float.compare(r2.w, -90.0f) == 0) {
                                                        intValue = atv0.b;
                                                    }
                                                }
                                                c0043a.t = r2.n;
                                                c0043a.u = r2.o;
                                                c0043a.z = f;
                                                c0043a.y = intValue;
                                                c0043a.A = r2.x;
                                                c0043a.B = r2.y;
                                                c0043a.C = m6gVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str7) && !MimeTypes.TEXT_SSA.equals(str7) && !MimeTypes.TEXT_VTT.equals(str7) && !MimeTypes.APPLICATION_VOBSUB.equals(str7) && !MimeTypes.APPLICATION_PGS.equals(str7) && !MimeTypes.APPLICATION_DVBSUBS.equals(str7)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str5 = r2.b;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                c0043a.b = r2.b;
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 2:
                                            str2 = "video/webm";
                                            xi90 xi90Var = new xi90(r2.a(r2.c));
                                            try {
                                                int v = xi90Var.v();
                                                if (v != 1) {
                                                    if (v == 65534) {
                                                        xi90Var.P(24);
                                                        long w = xi90Var.w();
                                                        UUID uuid = o0;
                                                        if (w == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    ahn.F("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    F = -1;
                                                    list = null;
                                                    str3 = null;
                                                    i4 = -1;
                                                    if (r2.P != null) {
                                                        str3 = (String) e.b;
                                                        str7 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i192 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                    c0043a = new a.C0043a();
                                                    l = io20.l(str7);
                                                    Map<String, Integer> map2 = p0;
                                                    if (l) {
                                                    }
                                                    str5 = r2.b;
                                                    if (str5 != null) {
                                                        c0043a.b = r2.b;
                                                        break;
                                                    }
                                                    c0043a.a = Integer.toString(i18);
                                                    c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                    c0043a.m = io20.q(str7);
                                                    c0043a.n = i4;
                                                    c0043a.d = r2.Z;
                                                    c0043a.e = i192;
                                                    c0043a.p = list;
                                                    c0043a.j = str3;
                                                    c0043a.q = r2.m;
                                                    r2.b0 = new androidx.media3.common.a(c0043a);
                                                    r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                    r8.put(r2.d, r2);
                                                }
                                                int i26 = r2.R;
                                                String str9 = y2r0.a;
                                                F = y2r0.F(i26, ByteOrder.LITTLE_ENDIAN);
                                                if (F == 0) {
                                                    ahn.F("Unsupported PCM bit depth: " + r2.R + ". Setting mimeType to audio/x-unknown");
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    F = -1;
                                                    list = null;
                                                    str3 = null;
                                                    i4 = -1;
                                                    if (r2.P != null) {
                                                    }
                                                    int i1922 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                    c0043a = new a.C0043a();
                                                    l = io20.l(str7);
                                                    Map<String, Integer> map22 = p0;
                                                    if (l) {
                                                    }
                                                    str5 = r2.b;
                                                    if (str5 != null) {
                                                    }
                                                    c0043a.a = Integer.toString(i18);
                                                    c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                    c0043a.m = io20.q(str7);
                                                    c0043a.n = i4;
                                                    c0043a.d = r2.Z;
                                                    c0043a.e = i1922;
                                                    c0043a.p = list;
                                                    c0043a.j = str3;
                                                    c0043a.q = r2.m;
                                                    r2.b0 = new androidx.media3.common.a(c0043a);
                                                    r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                    r8.put(r2.d, r2);
                                                }
                                                str7 = MimeTypes.AUDIO_RAW;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i19222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i19222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            str2 = "video/webm";
                                            r2.V = new asp0();
                                            str7 = MimeTypes.AUDIO_TRUEHD;
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 4:
                                            byte[] a4 = r2.a(str6);
                                            try {
                                                try {
                                                    if (a4[0] != 2) {
                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i27 = 0;
                                                    int i28 = 1;
                                                    while (true) {
                                                        int i29 = a4[i28] & 255;
                                                        if (i29 == 255) {
                                                            i27 += 255;
                                                            i28++;
                                                        } else {
                                                            int i30 = i27 + i29;
                                                            int i31 = i28 + 1;
                                                            int i32 = 0;
                                                            while (true) {
                                                                int i33 = a4[i31] & 255;
                                                                if (i33 == 255) {
                                                                    i32 += 255;
                                                                    i31++;
                                                                } else {
                                                                    int i34 = i31 + 1;
                                                                    int i35 = i32 + i33;
                                                                    if (a4[i34] != 1) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i30];
                                                                    System.arraycopy(a4, i34, bArr6, 0, i30);
                                                                    int i36 = i34 + i30;
                                                                    if (a4[i36] != 3) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i37 = i36 + i35;
                                                                    if (a4[i37] != 5) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a4.length - i37];
                                                                    str2 = "video/webm";
                                                                    System.arraycopy(a4, i37, bArr7, 0, a4.length - i37);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str7 = MimeTypes.AUDIO_VORBIS;
                                                                    i4 = 8192;
                                                                    str3 = null;
                                                                    list2 = arrayList;
                                                                    list = list2;
                                                                    F = -1;
                                                                    if (r2.P != null) {
                                                                    }
                                                                    int i1922222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                                    c0043a = new a.C0043a();
                                                                    l = io20.l(str7);
                                                                    Map<String, Integer> map22222 = p0;
                                                                    if (l) {
                                                                    }
                                                                    str5 = r2.b;
                                                                    if (str5 != null) {
                                                                    }
                                                                    c0043a.a = Integer.toString(i18);
                                                                    c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                                    c0043a.m = io20.q(str7);
                                                                    c0043a.n = i4;
                                                                    c0043a.d = r2.Z;
                                                                    c0043a.e = i1922222;
                                                                    c0043a.p = list;
                                                                    c0043a.j = str3;
                                                                    c0043a.q = r2.m;
                                                                    r2.b0 = new androidx.media3.common.a(c0043a);
                                                                    r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                                    r8.put(r2.d, r2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.a(r2, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r2 = 0;
                                            }
                                            break;
                                        case 5:
                                            str7 = MimeTypes.AUDIO_MPEG_L2;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = 4096;
                                            if (r2.P != null) {
                                            }
                                            int i19222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 6:
                                            str7 = MimeTypes.AUDIO_MPEG;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = 4096;
                                            if (r2.P != null) {
                                            }
                                            int i192222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 7:
                                            xi90 xi90Var2 = new xi90(r2.a(r2.c));
                                            try {
                                                xi90Var2.Q(16);
                                                long t = xi90Var2.t();
                                                if (t == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else if (t == 859189832) {
                                                    pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                } else {
                                                    if (t == 826496599) {
                                                        byte[] bArr8 = xi90Var2.a;
                                                        for (int i38 = xi90Var2.b + 20; i38 < bArr8.length - 4; i38++) {
                                                            if (bArr8[i38] == 0 && bArr8[i38 + 1] == 0 && bArr8[i38 + 2] == 1) {
                                                                if (bArr8[i38 + 3] == 15) {
                                                                    pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr8, i38, bArr8.length)));
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                            runtimeException = null;
                                                            throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    }
                                                    ahn.F("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str3 = null;
                                                    pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    str7 = (String) pair.first;
                                                    str2 = "video/webm";
                                                    list = (List) pair.second;
                                                    F = -1;
                                                    i4 = -1;
                                                    if (r2.P != null) {
                                                    }
                                                    int i1922222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                    c0043a = new a.C0043a();
                                                    l = io20.l(str7);
                                                    Map<String, Integer> map22222222 = p0;
                                                    if (l) {
                                                    }
                                                    str5 = r2.b;
                                                    if (str5 != null) {
                                                    }
                                                    c0043a.a = Integer.toString(i18);
                                                    c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                    c0043a.m = io20.q(str7);
                                                    c0043a.n = i4;
                                                    c0043a.d = r2.Z;
                                                    c0043a.e = i1922222222;
                                                    c0043a.p = list;
                                                    c0043a.j = str3;
                                                    c0043a.q = r2.m;
                                                    r2.b0 = new androidx.media3.common.a(c0043a);
                                                    r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                    r8.put(r2.d, r2);
                                                }
                                                str3 = null;
                                                str7 = (String) pair.first;
                                                str2 = "video/webm";
                                                list = (List) pair.second;
                                                F = -1;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i19222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i19222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(r2.a(str6), 0, bArr9, 0, 4);
                                            list = ImmutableList.p(bArr9);
                                            str7 = MimeTypes.APPLICATION_DVBSUBS;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case '\n':
                                            bt5 a5 = bt5.a(new xi90(r2.a(r2.c)));
                                            list = a5.a;
                                            r2.c0 = a5.b;
                                            str4 = a5.l;
                                            str7 = "video/avc";
                                            str3 = str4;
                                            str2 = "video/webm";
                                            F = -1;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 11:
                                            list = ImmutableList.p(r2.a(str6));
                                            str7 = MimeTypes.APPLICATION_VOBSUB;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case '\f':
                                            str7 = MimeTypes.AUDIO_DTS_HD;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case '\r':
                                            List<byte[]> singletonList2 = Collections.singletonList(r2.a(str6));
                                            byte[] bArr10 = r2.l;
                                            l0.a b4 = l0.b(new wi90(bArr10, bArr10.length), false);
                                            r2.S = b4.a;
                                            r2.Q = b4.b;
                                            str7 = "audio/mp4a-latm";
                                            str3 = b4.c;
                                            str2 = "video/webm";
                                            i4 = -1;
                                            list2 = singletonList2;
                                            list = list2;
                                            F = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 14:
                                            str7 = MimeTypes.AUDIO_AC3;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 15:
                                        case 21:
                                            r2.W = true;
                                            str7 = MimeTypes.AUDIO_DTS;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 16:
                                            byte[] bArr11 = r2.l;
                                            p = bArr11 == null ? null : ImmutableList.p(bArr11);
                                            str7 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            list = p;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 17:
                                            str7 = MimeTypes.VIDEO_VP8;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 18:
                                            byte[] bArr12 = r2.l;
                                            p = bArr12 == null ? null : ImmutableList.p(bArr12);
                                            str7 = MimeTypes.VIDEO_VP9;
                                            list = p;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 19:
                                            str2 = "video/webm";
                                            str7 = MimeTypes.APPLICATION_PGS;
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 20:
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 22:
                                            if (r2.R == 32) {
                                                str2 = "video/webm";
                                                str7 = MimeTypes.AUDIO_RAW;
                                                F = 4;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i192222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map2222222222222222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i192222222222222222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            } else {
                                                ahn.F("Unsupported floating point PCM bit depth: " + r2.R + ". Setting mimeType to audio/x-unknown");
                                                str2 = "video/webm";
                                                str7 = MimeTypes.AUDIO_UNKNOWN;
                                                F = -1;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i1922222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map22222222222222222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i1922222222222222222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            }
                                            break;
                                        case 23:
                                            int i39 = r2.R;
                                            if (i39 == 8) {
                                                str2 = "video/webm";
                                                str7 = MimeTypes.AUDIO_RAW;
                                                F = 3;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i19222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map222222222222222222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i19222222222222222222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            } else {
                                                if (i39 == 16) {
                                                    F = 268435456;
                                                } else if (i39 == 24) {
                                                    F = 1342177280;
                                                } else if (i39 == 32) {
                                                    F = 1610612736;
                                                } else {
                                                    ahn.F("Unsupported big endian PCM bit depth: " + r2.R + ". Setting mimeType to audio/x-unknown");
                                                    str2 = "video/webm";
                                                    str7 = MimeTypes.AUDIO_UNKNOWN;
                                                    F = -1;
                                                    list = null;
                                                    str3 = null;
                                                    i4 = -1;
                                                    if (r2.P != null) {
                                                    }
                                                    int i192222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                    c0043a = new a.C0043a();
                                                    l = io20.l(str7);
                                                    Map<String, Integer> map2222222222222222222222222 = p0;
                                                    if (l) {
                                                    }
                                                    str5 = r2.b;
                                                    if (str5 != null) {
                                                    }
                                                    c0043a.a = Integer.toString(i18);
                                                    c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                    c0043a.m = io20.q(str7);
                                                    c0043a.n = i4;
                                                    c0043a.d = r2.Z;
                                                    c0043a.e = i192222222222222222222222222;
                                                    c0043a.p = list;
                                                    c0043a.j = str3;
                                                    c0043a.q = r2.m;
                                                    r2.b0 = new androidx.media3.common.a(c0043a);
                                                    r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                    r8.put(r2.d, r2);
                                                }
                                                str2 = "video/webm";
                                                str7 = MimeTypes.AUDIO_RAW;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i1922222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map22222222222222222222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i1922222222222222222222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            }
                                            break;
                                        case 24:
                                            int i40 = r2.R;
                                            String str10 = y2r0.a;
                                            F = y2r0.F(i40, ByteOrder.LITTLE_ENDIAN);
                                            if (F == 0) {
                                                ahn.F("Unsupported little endian PCM bit depth: " + r2.R + ". Setting mimeType to audio/x-unknown");
                                                str2 = "video/webm";
                                                str7 = MimeTypes.AUDIO_UNKNOWN;
                                                F = -1;
                                                list = null;
                                                str3 = null;
                                                i4 = -1;
                                                if (r2.P != null) {
                                                }
                                                int i19222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                                c0043a = new a.C0043a();
                                                l = io20.l(str7);
                                                Map<String, Integer> map222222222222222222222222222 = p0;
                                                if (l) {
                                                }
                                                str5 = r2.b;
                                                if (str5 != null) {
                                                }
                                                c0043a.a = Integer.toString(i18);
                                                c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                                c0043a.m = io20.q(str7);
                                                c0043a.n = i4;
                                                c0043a.d = r2.Z;
                                                c0043a.e = i19222222222222222222222222222;
                                                c0043a.p = list;
                                                c0043a.j = str3;
                                                c0043a.q = r2.m;
                                                r2.b0 = new androidx.media3.common.a(c0043a);
                                                r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                                r8.put(r2.d, r2);
                                            }
                                            str2 = "video/webm";
                                            str7 = MimeTypes.AUDIO_RAW;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 25:
                                        case 26:
                                            list = ImmutableList.q(l0, r2.a(str6));
                                            str2 = "video/webm";
                                            str7 = MimeTypes.TEXT_SSA;
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 27:
                                            f2v a6 = f2v.a(new xi90(r2.a(r2.c)), false, null);
                                            list = a6.a;
                                            r2.c0 = a6.b;
                                            str4 = a6.n;
                                            str7 = "video/hevc";
                                            str3 = str4;
                                            str2 = "video/webm";
                                            F = -1;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 28:
                                            str2 = "video/webm";
                                            str7 = MimeTypes.TEXT_VTT;
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 29:
                                            str7 = MimeTypes.APPLICATION_SUBRIP;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 30:
                                            str7 = MimeTypes.VIDEO_MPEG2;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case 31:
                                            str7 = MimeTypes.AUDIO_E_AC3;
                                            str2 = "video/webm";
                                            F = -1;
                                            list = null;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i192222222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map2222222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i192222222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case ' ':
                                            p = Collections.singletonList(r2.a(str6));
                                            str7 = MimeTypes.AUDIO_FLAC;
                                            list = p;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            i4 = -1;
                                            if (r2.P != null) {
                                            }
                                            int i1922222222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map22222222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i1922222222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        case '!':
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r2.a(r2.c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList2.add(allocate.order(byteOrder).putLong(r2.T).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r2.U).array());
                                            str7 = MimeTypes.AUDIO_OPUS;
                                            i4 = 5760;
                                            list = arrayList2;
                                            str2 = "video/webm";
                                            F = -1;
                                            str3 = null;
                                            if (r2.P != null) {
                                            }
                                            int i19222222222222222222222222222222222222 = (r2.Y ? 1 : 0) | (r2.X ? 2 : 0);
                                            c0043a = new a.C0043a();
                                            l = io20.l(str7);
                                            Map<String, Integer> map222222222222222222222222222222222222 = p0;
                                            if (l) {
                                            }
                                            str5 = r2.b;
                                            if (str5 != null) {
                                            }
                                            c0043a.a = Integer.toString(i18);
                                            c0043a.l = io20.q(r2.a ? str2 : "video/x-matroska");
                                            c0043a.m = io20.q(str7);
                                            c0043a.n = i4;
                                            c0043a.d = r2.Z;
                                            c0043a.e = i19222222222222222222222222222222222222;
                                            c0043a.p = list;
                                            c0043a.j = str3;
                                            c0043a.q = r2.m;
                                            r2.b0 = new androidx.media3.common.a(c0043a);
                                            r2.a0 = xn10Var5.j0.track(r2.d, r2.e);
                                            r8.put(r2.d, r2);
                                            break;
                                        default:
                                            throw ParserException.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    xn10Var5.y = null;
                                    break;
                            }
                        } else if (i16 != 183) {
                            if (i16 == 19899) {
                                int i41 = xn10Var5.A;
                                if (i41 != -1) {
                                    long j7 = xn10Var5.B;
                                    if (j7 != -1) {
                                        if (i41 == 475249515) {
                                            xn10Var5.K = j7;
                                        }
                                    }
                                }
                                throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i16 == 25152) {
                                xn10Var5.g(i16);
                                c cVar = xn10Var5.y;
                                if (cVar.i) {
                                    rgp0.a aVar3 = cVar.k;
                                    if (aVar3 == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    cVar.m = new DrmInitData(new DrmInitData.SchemeData(tu8.a, "video/webm", aVar3.b));
                                }
                            } else if (i16 == 28032) {
                                xn10Var5.g(i16);
                                c cVar2 = xn10Var5.y;
                                if (cVar2.i && cVar2.j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i16 == 357149030) {
                                if (xn10Var5.t == C.TIME_UNSET) {
                                    xn10Var5.t = 1000000L;
                                }
                                long j8 = xn10Var5.u;
                                if (j8 != C.TIME_UNSET) {
                                    xn10Var5.v = xn10Var5.n(j8);
                                }
                            } else if (i16 == 374648427) {
                                boolean z5 = z2;
                                if (r8.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                boolean z6 = (!xn10Var5.d || xn10Var5.K == -1) ? true : z5 ? 1 : 0;
                                int i42 = -1;
                                int i43 = -1;
                                int i44 = -1;
                                int i45 = -1;
                                for (int i46 = z5 ? 1 : 0; i46 < r8.size(); i46++) {
                                    c cVar3 = (c) r8.valueAt(i46);
                                    int i47 = cVar3.e;
                                    if (i47 == 2) {
                                        if (cVar3.Y) {
                                            i42 = cVar3.d;
                                        }
                                        if (i43 == -1) {
                                            i43 = cVar3.d;
                                        }
                                    } else if (i47 == 1) {
                                        if (cVar3.Y) {
                                            i44 = cVar3.d;
                                        }
                                        if (i45 == -1) {
                                            i45 = cVar3.d;
                                        }
                                    }
                                    if (z6) {
                                        cVar3.a0.getClass();
                                        if (!cVar3.W) {
                                            rgp0 rgp0Var = cVar3.a0;
                                            androidx.media3.common.a aVar4 = cVar3.b0;
                                            aVar4.getClass();
                                            rgp0Var.c(aVar4);
                                        }
                                    }
                                }
                                if (i42 != -1) {
                                    xn10Var5.I = i42;
                                } else if (i43 != -1) {
                                    xn10Var5.I = i43;
                                } else if (i44 != -1) {
                                    xn10Var5.I = i44;
                                } else if (i45 != -1) {
                                    xn10Var5.I = i45;
                                } else {
                                    xn10Var5.I = r8.size() > 0 ? ((c) r8.valueAt(z5 ? 1 : 0)).d : -1;
                                }
                                if (z6) {
                                    xn10Var5.j();
                                }
                            } else if (i16 == 475249515 && !xn10Var5.z) {
                                ?? r6 = z2;
                                while (true) {
                                    if (r6 < sparseArray.size()) {
                                        if (sparseArray.valueAt(r6).isEmpty()) {
                                            r6++;
                                        } else if (xn10Var5.v != C.TIME_UNSET) {
                                            for (?? r62 = z2; r62 < sparseArray.size(); r62++) {
                                                Collections.sort(sparseArray.valueAt(r62));
                                            }
                                            xn10Var5.j0.f(new b(sparseArray, xn10Var5.v, xn10Var5.I, xn10Var5.s, xn10Var5.r));
                                        }
                                    }
                                }
                                xn10Var5.j0.f(new n3i0.b(xn10Var5.v));
                                xn10Var5.z = r3;
                                xn10Var5.D = z2;
                                int i48 = r3;
                                for (?? r63 = z2; r63 < r8.size(); r63++) {
                                    c cVar4 = (c) r8.valueAt(r63);
                                    long j9 = xn10Var5.v;
                                    long j10 = xn10Var5.s;
                                    boolean z7 = z2;
                                    int i49 = i48;
                                    long j11 = xn10Var5.r;
                                    if (cVar4.e != 2 || (list3 = sparseArray.get(cVar4.d)) == null || list3.isEmpty()) {
                                        i8 = i17;
                                    } else {
                                        if (list3.isEmpty()) {
                                            i8 = i17;
                                        } else {
                                            int min = Math.min(list3.size(), i17);
                                            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                                            i8 = i17;
                                            int i50 = z7 ? 1 : 0;
                                            int i51 = -1;
                                            while (i50 < min) {
                                                b.a aVar5 = list3.get(i50);
                                                long j12 = j9;
                                                long j13 = aVar5.b;
                                                long j14 = aVar5.d;
                                                long j15 = aVar5.c;
                                                if (j13 <= 10000000) {
                                                    if (i50 < list3.size() - 1) {
                                                        b.a aVar6 = list3.get(i50 + 1);
                                                        j2 = (aVar6.c + aVar6.d) - (j15 + j14);
                                                        i9 = i50;
                                                        j3 = aVar6.b - j13;
                                                    } else {
                                                        i9 = i50;
                                                        j2 = (j10 + j11) - (j15 + j14);
                                                        j3 = j12 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i51 = i9;
                                                        }
                                                    }
                                                    i50 = i9 + 1;
                                                    j9 = j12;
                                                } else if (i51 != -1) {
                                                    j = list3.get(i51).b;
                                                    if (j != C.TIME_UNSET) {
                                                        androidx.media3.common.a aVar7 = cVar4.b0;
                                                        aVar7.getClass();
                                                        fi20 fi20Var = aVar7.l;
                                                        tso0 tso0Var = new tso0(j);
                                                        if (fi20Var == null) {
                                                            fi20.a[] aVarArr = new fi20.a[i49];
                                                            aVarArr[z7 ? 1 : 0] = tso0Var;
                                                            a3 = new fi20(aVarArr);
                                                        } else {
                                                            fi20.a[] aVarArr2 = new fi20.a[i49];
                                                            aVarArr2[z7 ? 1 : 0] = tso0Var;
                                                            a3 = fi20Var.a(aVarArr2);
                                                        }
                                                        a.C0043a a7 = cVar4.b0.a();
                                                        a7.k = a3;
                                                        cVar4.b0 = new androidx.media3.common.a(a7);
                                                    }
                                                }
                                            }
                                            if (i51 != -1) {
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != C.TIME_UNSET) {
                                        }
                                    }
                                    if (!cVar4.W) {
                                        cVar4.a0.getClass();
                                        rgp0 rgp0Var2 = cVar4.a0;
                                        androidx.media3.common.a aVar8 = cVar4.b0;
                                        aVar8.getClass();
                                        rgp0Var2.c(aVar8);
                                    }
                                    i17 = i8;
                                    z2 = z7 ? 1 : 0;
                                    i48 = 1;
                                }
                                xn10Var5.j();
                                qgqVar2 = qgqVar;
                            }
                        } else if (!xn10Var5.z) {
                            xn10Var5.f(i16);
                            if (xn10Var5.E != C.TIME_UNSET && (i7 = xn10Var5.F) != -1 && xn10Var5.G != -1) {
                                List<b.a> list4 = sparseArray.get(i7);
                                if (list4 == null) {
                                    list4 = new ArrayList<>();
                                    sparseArray.put(xn10Var5.F, list4);
                                }
                                list4.add(new b.a(xn10Var5.E, xn10Var5.s + xn10Var5.G, xn10Var5.H));
                            }
                        }
                        qgqVar2 = qgqVar;
                    } else {
                        if (xn10Var5.O == 2) {
                            c cVar5 = (c) r8.get(xn10Var5.U);
                            cVar5.a0.getClass();
                            if (xn10Var5.Z > 0 && "A_OPUS".equals(cVar5.c)) {
                                xi90 xi90Var3 = xn10Var5.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(xn10Var5.Z).array();
                                xi90Var3.getClass();
                                xi90Var3.N(array, array.length);
                            }
                            int i52 = 0;
                            for (int i53 = 0; i53 < xn10Var5.S; i53++) {
                                i52 += xn10Var5.T[i53];
                            }
                            int i54 = 0;
                            while (i54 < xn10Var5.S) {
                                long j16 = xn10Var5.P + ((cVar5.f * i54) / 1000);
                                int i55 = xn10Var5.W;
                                if (i54 == 0 && !xn10Var5.Y) {
                                    i55 |= 1;
                                }
                                int i56 = xn10Var5.T[i54];
                                int i57 = i52 - i56;
                                c cVar6 = cVar5;
                                xn10 xn10Var6 = xn10Var5;
                                xn10Var6.h(cVar6, j16, i55, i56, i57);
                                i54++;
                                xn10Var5 = xn10Var6;
                                cVar5 = cVar6;
                                i52 = i57;
                            }
                            xn10Var5.O = 0;
                            qgqVar2 = qgqVar;
                        }
                        qgqVar2 = qgqVar;
                    }
                }
            }
        }
        if (z4) {
            return 0;
        }
        int i58 = 0;
        while (true) {
            SparseArray<c> sparseArray2 = xn10Var.c;
            if (i58 >= sparseArray2.size()) {
                return -1;
            }
            c valueAt = sparseArray2.valueAt(i58);
            valueAt.a0.getClass();
            asp0 asp0Var = valueAt.V;
            if (asp0Var != null) {
                asp0Var.a(valueAt.a0, valueAt.k);
            }
            i58++;
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        mbk0 mbk0Var = new mbk0();
        xi90 xi90Var = (xi90) mbk0Var.b;
        tel telVar = (tel) qgqVar;
        long j = telVar.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        telVar.peekFully(xi90Var.a, 0, 4, false);
        long E = xi90Var.E();
        mbk0Var.a = 4;
        while (true) {
            if (E != 440786851) {
                int i2 = mbk0Var.a + 1;
                mbk0Var.a = i2;
                if (i2 == i) {
                    break;
                }
                telVar.peekFully(xi90Var.a, 0, 1, false);
                E = ((E << 8) & (-256)) | (xi90Var.a[0] & 255);
            } else {
                long b2 = mbk0Var.b(telVar);
                long j3 = mbk0Var.a;
                if (b2 != Long.MIN_VALUE && (j == -1 || j3 + b2 < j)) {
                    while (true) {
                        long j4 = mbk0Var.a;
                        long j5 = j3 + b2;
                        if (j4 < j5) {
                            if (mbk0Var.b(telVar) != Long.MIN_VALUE) {
                                long b3 = mbk0Var.b(telVar);
                                if (b3 < 0 || b3 > 2147483647L) {
                                    break;
                                }
                                if (b3 != 0) {
                                    int i3 = (int) b3;
                                    telVar.b(i3, false);
                                    mbk0Var.a += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        if (this.e) {
            rgqVar = new e1n0(rgqVar, this.f);
        }
        this.j0 = rgqVar;
    }

    public final void f(int i) throws ParserException {
        if (this.D) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a Cues");
    }

    public final void g(int i) throws ParserException {
        if (this.y != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(c cVar, long j, int i, int i2, int i3) {
        byte[] i4;
        int i5;
        int i6;
        asp0 asp0Var = cVar.V;
        if (asp0Var != null) {
            asp0Var.b(cVar.a0, j, i, i2, i3, cVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.c) || "S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c) || "S_TEXT/WEBVTT".equals(cVar.c)) {
                if (this.S > 1) {
                    ahn.F("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.Q;
                    if (j2 == C.TIME_UNSET) {
                        ahn.F("Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.c;
                        xi90 xi90Var = this.m;
                        byte[] bArr = xi90Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                i4 = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i5 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i5 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i5 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(i4, 0, bArr, i5, i4.length);
                        int i7 = xi90Var.b;
                        while (true) {
                            if (i7 < xi90Var.c) {
                                if (xi90Var.a[i7] == 0) {
                                    xi90Var.O(i7);
                                } else {
                                    i7++;
                                }
                            }
                        }
                        cVar.a0.d(xi90Var.c, xi90Var);
                        i6 = i2 + xi90Var.c;
                        if ((i & 268435456) != 0) {
                            int i8 = this.S;
                            xi90 xi90Var2 = this.p;
                            if (i8 > 1) {
                                xi90Var2.M(0);
                            } else {
                                int i9 = xi90Var2.c;
                                cVar.a0.b(xi90Var2, i9, 2);
                                i6 += i9;
                            }
                        }
                        cVar.a0.a(j, i, i6, i3, cVar.k);
                    }
                }
            }
            i6 = i2;
            if ((i & 268435456) != 0) {
            }
            cVar.a0.a(j, i, i6, i3, cVar.k);
        }
        this.N = true;
    }

    public final void j() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<c> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                rgq rgqVar = this.j0;
                rgqVar.getClass();
                rgqVar.endTracks();
                this.x = false;
                return;
            }
            if (sparseArray.valueAt(i).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean k(pzb0 pzb0Var, long j) {
        if (this.J) {
            this.L = j;
            pzb0Var.a = this.K;
            this.J = false;
            return true;
        }
        if (this.z) {
            long j2 = this.L;
            if (j2 != -1) {
                pzb0Var.a = j2;
                this.L = -1L;
                return true;
            }
        }
        return false;
    }

    public final void l(qgq qgqVar, int i) throws IOException {
        xi90 xi90Var = this.i;
        if (xi90Var.c >= i) {
            return;
        }
        byte[] bArr = xi90Var.a;
        if (bArr.length < i) {
            xi90Var.d(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = xi90Var.a;
        int i2 = xi90Var.c;
        qgqVar.readFully(bArr2, i2, i - i2);
        xi90Var.O(i);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.M(0);
    }

    public final long n(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == C.TIME_UNSET) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = y2r0.a;
        return y2r0.d0(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int o(qgq qgqVar, c cVar, int i, boolean z) throws IOException {
        int g;
        int g2;
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.c)) {
            p(qgqVar, k0, i);
            int i3 = this.b0;
            m();
            return i3;
        }
        if ("S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c)) {
            p(qgqVar, m0, i);
            int i4 = this.b0;
            m();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.c)) {
            p(qgqVar, n0, i);
            int i5 = this.b0;
            m();
            return i5;
        }
        if (cVar.W) {
            cVar.b0.getClass();
            xi90 xi90Var = new xi90(i);
            if (qgqVar.peekFully(xi90Var.a, 0, i, true)) {
                qgqVar.resetPeekPosition();
                if (jno.b(xi90Var.l()) == 1 && xi90Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    xi90Var.n(bArr, 0, 10);
                    xi90Var.P(0);
                    int a2 = jno.a(bArr);
                    if (a2 > 0 && xi90Var.a() >= a2 + 4) {
                        xi90Var.Q(a2);
                        if (jno.b(xi90Var.p()) == 2) {
                            a.C0043a a3 = cVar.b0.a();
                            a3.m = io20.q(MimeTypes.AUDIO_DTS_HD);
                            cVar.b0 = new androidx.media3.common.a(a3);
                        }
                    }
                }
            }
            cVar.a0.c(cVar.b0);
            cVar.W = false;
            j();
        }
        rgp0 rgp0Var = cVar.a0;
        boolean z2 = this.d0;
        xi90 xi90Var2 = this.l;
        if (!z2) {
            boolean z3 = cVar.i;
            xi90 xi90Var3 = this.i;
            if (z3) {
                this.W &= -1073741825;
                if (!this.e0) {
                    qgqVar.readFully(xi90Var3.a, 0, 1);
                    this.a0++;
                    byte b2 = xi90Var3.a[0];
                    if ((b2 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b2;
                    this.e0 = true;
                }
                byte b3 = this.h0;
                if ((b3 & 1) == 1) {
                    boolean z4 = (b3 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.i0) {
                        xi90 xi90Var4 = this.n;
                        qgqVar.readFully(xi90Var4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        xi90Var3.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        xi90Var3.P(0);
                        rgp0Var.b(xi90Var3, 1, 1);
                        this.b0++;
                        xi90Var4.P(0);
                        rgp0Var.b(xi90Var4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z4) {
                        if (!this.f0) {
                            qgqVar.readFully(xi90Var3.a, 0, 1);
                            this.a0++;
                            xi90Var3.P(0);
                            this.g0 = xi90Var3.C();
                            this.f0 = true;
                        }
                        int i6 = this.g0 * 4;
                        xi90Var3.M(i6);
                        qgqVar.readFully(xi90Var3.a, 0, i6);
                        this.a0 += i6;
                        short s = (short) ((this.g0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.q = ByteBuffer.allocate(i7);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.g0;
                            if (i8 >= i2) {
                                break;
                            }
                            int G = xi90Var3.G();
                            if (i8 % 2 == 0) {
                                this.q.putShort((short) (G - i9));
                            } else {
                                this.q.putInt(G - i9);
                            }
                            i8++;
                            i9 = G;
                        }
                        int i10 = (i - this.a0) - i9;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i10);
                        } else {
                            this.q.putShort((short) i10);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        xi90 xi90Var5 = this.o;
                        xi90Var5.N(array, i7);
                        rgp0Var.b(xi90Var5, i7, 1);
                        this.b0 += i7;
                    }
                }
            } else {
                byte[] bArr2 = cVar.j;
                if (bArr2 != null) {
                    xi90Var2.N(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(cVar.c) ? z : cVar.g > 0) {
                this.W |= 268435456;
                this.p.M(0);
                int i11 = (xi90Var2.c + i) - this.a0;
                xi90Var3.M(4);
                byte[] bArr3 = xi90Var3.a;
                bArr3[0] = (byte) ((i11 >> 24) & 255);
                bArr3[1] = (byte) ((i11 >> 16) & 255);
                bArr3[2] = (byte) ((i11 >> 8) & 255);
                bArr3[3] = (byte) (i11 & 255);
                rgp0Var.b(xi90Var3, 4, 2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i12 = i + xi90Var2.c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.c) && !"V_MPEGH/ISO/HEVC".equals(cVar.c)) {
            if (cVar.V != null) {
                fxc0.z(xi90Var2.c == 0);
                cVar.V.c(qgqVar);
            }
            while (true) {
                int i13 = this.a0;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int a4 = xi90Var2.a();
                if (a4 > 0) {
                    g2 = Math.min(i14, a4);
                    rgp0Var.d(g2, xi90Var2);
                } else {
                    g2 = rgp0Var.g(qgqVar, i14, false);
                }
                this.a0 += g2;
                this.b0 += g2;
            }
        } else {
            xi90 xi90Var6 = this.h;
            byte[] bArr4 = xi90Var6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i15 = cVar.c0;
            int i16 = 4 - i15;
            while (this.a0 < i12) {
                int i17 = this.c0;
                if (i17 == 0) {
                    int min = Math.min(i15, xi90Var2.a());
                    qgqVar.readFully(bArr4, i16 + min, i15 - min);
                    if (min > 0) {
                        xi90Var2.n(bArr4, i16, min);
                    }
                    this.a0 += i15;
                    xi90Var6.P(0);
                    this.c0 = xi90Var6.G();
                    xi90 xi90Var7 = this.g;
                    xi90Var7.P(0);
                    rgp0Var.d(4, xi90Var7);
                    this.b0 += 4;
                } else {
                    int a5 = xi90Var2.a();
                    if (a5 > 0) {
                        g = Math.min(i17, a5);
                        rgp0Var.d(g, xi90Var2);
                    } else {
                        g = rgp0Var.g(qgqVar, i17, false);
                    }
                    this.a0 += g;
                    this.b0 += g;
                    this.c0 -= g;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.c)) {
            xi90 xi90Var8 = this.j;
            xi90Var8.P(0);
            rgp0Var.d(4, xi90Var8);
            this.b0 += 4;
        }
        int i18 = this.b0;
        m();
        return i18;
    }

    public final void p(qgq qgqVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        xi90 xi90Var = this.m;
        byte[] bArr2 = xi90Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            xi90Var.getClass();
            xi90Var.N(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        qgqVar.readFully(xi90Var.a, bArr.length, i);
        xi90Var.P(0);
        xi90Var.O(length);
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.M = C.TIME_UNSET;
        this.O = 0;
        wdl wdlVar = this.a;
        wdlVar.e = 0;
        wdlVar.b.clear();
        jkr0 jkr0Var = wdlVar.c;
        jkr0Var.b = 0;
        jkr0Var.c = 0;
        jkr0 jkr0Var2 = this.b;
        jkr0Var2.b = 0;
        jkr0Var2.c = 0;
        m();
        this.D = false;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray<c> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            asp0 asp0Var = sparseArray.valueAt(i).V;
            if (asp0Var != null) {
                asp0Var.b = false;
                asp0Var.c = 0;
            }
            i++;
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
