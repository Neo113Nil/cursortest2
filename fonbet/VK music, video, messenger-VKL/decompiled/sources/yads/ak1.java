package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import xsna.atv0;
import xsna.tgw;

/* loaded from: classes10.dex */
public final class ak1 implements nq0 {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0 = mc3.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID g0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map h0;
    public long A;
    public long B;
    public li1 C;
    public li1 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final ul0 a;
    public boolean a0;
    public final ad3 b;
    public qq0 b0;
    public final SparseArray c;
    public final boolean d;
    public final kc2 e;
    public final kc2 f;
    public final kc2 g;
    public final kc2 h;
    public final kc2 i;
    public final kc2 j;
    public final kc2 k;
    public final kc2 l;
    public final kc2 m;
    public final kc2 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public zj1 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        HashMap hashMap = new HashMap();
        xj1.a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        xj1.a(180, hashMap, "htc_video_rotA-180", atv0.b, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public ak1() {
        this(new jd0(), 0);
    }

    public final void a(int i) {
        if (this.u == null) {
            throw new pc2(tgw.b(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0814, code lost:
    
        if (r2.i() == r8.getLeastSignificantBits()) goto L489;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0870  */
    /* JADX WARN: Type inference failed for: r3v0, types: [yads.qq0] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        int i2;
        char c;
        int b;
        int i3;
        List list;
        Pair pair;
        List list2;
        String str;
        String str2;
        List list3;
        int i4;
        List list4;
        List list5;
        List list6;
        byte[] bArr;
        mx0 mx0Var;
        int i5;
        mx mxVar;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        String str3;
        ej0 a;
        boolean z;
        zx2 yx2Var;
        int i9;
        int i10;
        ?? r3 = this.b0;
        if (r3 == 0) {
            throw new IllegalStateException();
        }
        int i11 = 0;
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            zj1 zj1Var = (zj1) this.c.get(this.M);
            zj1Var.X.getClass();
            if (this.R > 0 && "A_OPUS".equals(zj1Var.b)) {
                this.n.a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            int i14 = 0;
            while (i14 < this.K) {
                long j = this.H + ((zj1Var.e * i14) / 1000);
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                int i17 = i12 - i16;
                a(zj1Var, j, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.G = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i18 = this.w;
                if (i18 != -1) {
                    long j2 = this.x;
                    if (j2 != -1) {
                        if (i18 == 475249515) {
                            this.z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new pc2("Mandatory element SeekID or SeekPosition not found", null, true, 1);
            }
            if (i == 25152) {
                a(i);
                zj1 zj1Var2 = this.u;
                if (zj1Var2.h) {
                    p83 p83Var = zj1Var2.j;
                    if (p83Var == null) {
                        throw new pc2("Encrypted Track found but ContentEncKeyID was not found", null, true, 1);
                    }
                    zj1Var2.l = new lk0(null, true, new kk0(jr.a, null, "video/webm", p83Var.b));
                    return;
                }
                return;
            }
            if (i == 28032) {
                a(i);
                zj1 zj1Var3 = this.u;
                if (zj1Var3.h && zj1Var3.i != null) {
                    throw new pc2("Combining encryption and compression is not supported", null, true, 1);
                }
                return;
            }
            if (i == 357149030) {
                if (this.r == C.TIME_UNSET) {
                    this.r = 1000000L;
                }
                long j3 = this.s;
                if (j3 != C.TIME_UNSET) {
                    this.t = a(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.c.size() == 0) {
                    throw new pc2("No valid tracks were found", null, true, 1);
                }
                this.b0.a();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.v) {
                li1 li1Var = this.C;
                li1 li1Var2 = this.D;
                if (this.q == -1 || this.t == C.TIME_UNSET || li1Var == null || (i9 = li1Var.a) == 0 || li1Var2 == null || li1Var2.a != i9) {
                    z = true;
                    yx2Var = new yx2(this.t, 0L);
                } else {
                    int[] iArr = new int[i9];
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    for (int i19 = 0; i19 < i9; i19++) {
                        jArr3[i19] = li1Var.a(i19);
                        jArr[i19] = li1Var2.a(i19) + this.q;
                    }
                    z = true;
                    while (true) {
                        i10 = i9 - 1;
                        if (i11 >= i10) {
                            break;
                        }
                        int i20 = i11 + 1;
                        iArr[i11] = (int) (jArr[i20] - jArr[i11]);
                        jArr2[i11] = jArr3[i20] - jArr3[i11];
                        i11 = i20;
                    }
                    iArr[i10] = (int) ((this.q + this.p) - jArr[i10]);
                    long j4 = this.t - jArr3[i10];
                    jArr2[i10] = j4;
                    if (j4 <= 0) {
                        ji1.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i10);
                        jArr = Arrays.copyOf(jArr, i10);
                        jArr2 = Arrays.copyOf(jArr2, i10);
                        jArr3 = Arrays.copyOf(jArr3, i10);
                    }
                    yx2Var = new hu(iArr, jArr, jArr2, jArr3);
                }
                r3.a(yx2Var);
                this.v = z;
            }
            this.C = null;
            this.D = null;
            return;
        }
        zj1 zj1Var4 = this.u;
        if (zj1Var4 == null) {
            throw new IllegalStateException();
        }
        String str4 = zj1Var4.b;
        if (str4 == null) {
            throw new pc2("CodecId is missing in TrackEntry element", null, true, 1);
        }
        i2 = 3;
        switch (str4) {
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
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                int i21 = zj1Var4.c;
                switch (str4.hashCode()) {
                    case -2095576542:
                        if (str4.equals("V_MPEG4/ISO/AP")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2095575984:
                        if (str4.equals("V_MPEG4/ISO/SP")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1985379776:
                        if (str4.equals("A_MS/ACM")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1784763192:
                        if (str4.equals("A_TRUEHD")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1730367663:
                        if (str4.equals("A_VORBIS")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641358:
                        if (str4.equals("A_MPEG/L2")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641357:
                        if (str4.equals("A_MPEG/L3")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1373388978:
                        if (str4.equals("V_MS/VFW/FOURCC")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -933872740:
                        if (str4.equals("S_DVBSUB")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363189:
                        if (str4.equals("V_MPEG4/ISO/ASP")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363109:
                        if (str4.equals("V_MPEG4/ISO/AVC")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -425012669:
                        if (str4.equals("S_VOBSUB")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -356037306:
                        if (str4.equals("A_DTS/LOSSLESS")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923557:
                        if (str4.equals("A_AAC")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923603:
                        if (str4.equals("A_AC3")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62927045:
                        if (str4.equals("A_DTS")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82318131:
                        if (str4.equals("V_AV1")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338133:
                        if (str4.equals("V_VP8")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338134:
                        if (str4.equals("V_VP9")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99146302:
                        if (str4.equals("S_HDMV/PGS")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 444813526:
                        if (str4.equals("V_THEORA")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 542569478:
                        if (str4.equals("A_DTS/EXPRESS")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 635596514:
                        if (str4.equals("A_PCM/FLOAT/IEEE")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725948237:
                        if (str4.equals("A_PCM/INT/BIG")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725957860:
                        if (str4.equals("A_PCM/INT/LIT")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 738597099:
                        if (str4.equals("S_TEXT/ASS")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 855502857:
                        if (str4.equals("V_MPEGH/ISO/HEVC")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1045209816:
                        if (str4.equals("S_TEXT/WEBVTT")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1422270023:
                        if (str4.equals("S_TEXT/UTF8")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1809237540:
                        if (str4.equals("V_MPEG2")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950749482:
                        if (str4.equals("A_EAC3")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950789798:
                        if (str4.equals("A_FLAC")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951062397:
                        if (str4.equals("A_OPUS")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str5 = MimeTypes.AUDIO_RAW;
                switch (c) {
                    case 0:
                    case 1:
                    case '\t':
                        byte[] bArr3 = zj1Var4.k;
                        str5 = MimeTypes.VIDEO_MP4V;
                        if (bArr3 != null) {
                            list5 = Collections.singletonList(bArr3);
                            i3 = -1;
                            list = list5;
                            i4 = -1;
                            list3 = list;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null && (a = ej0.a(new kc2(bArr))) != null) {
                                str2 = a.a;
                                str5 = "video/dolby-vision";
                            }
                            int i22 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                                mx0Var.x = zj1Var4.O;
                                mx0Var.y = zj1Var4.Q;
                                mx0Var.z = i4;
                                i2 = 1;
                            } else if ("video".equals(iu1.c(str5))) {
                                if (zj1Var4.q == 0) {
                                    int i23 = zj1Var4.o;
                                    i5 = -1;
                                    if (i23 == -1) {
                                        i23 = zj1Var4.m;
                                    }
                                    zj1Var4.o = i23;
                                    int i24 = zj1Var4.p;
                                    if (i24 == -1) {
                                        i24 = zj1Var4.n;
                                    }
                                    zj1Var4.p = i24;
                                } else {
                                    i5 = -1;
                                }
                                float f = (zj1Var4.o == i5 || (i8 = zj1Var4.p) == i5) ? -1.0f : (zj1Var4.n * r5) / (zj1Var4.m * i8);
                                if (zj1Var4.x) {
                                    if (zj1Var4.D == -1.0f || zj1Var4.E == -1.0f || zj1Var4.F == -1.0f || zj1Var4.G == -1.0f || zj1Var4.H == -1.0f || zj1Var4.I == -1.0f || zj1Var4.J == -1.0f || zj1Var4.K == -1.0f || zj1Var4.L == -1.0f || zj1Var4.M == -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = new byte[25];
                                        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        order.put((byte) 0);
                                        order.putShort((short) ((zj1Var4.D * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.E * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.F * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.G * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.H * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.I * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.J * 50000.0f) + 0.5f));
                                        order.putShort((short) ((zj1Var4.K * 50000.0f) + 0.5f));
                                        order.putShort((short) (zj1Var4.L + 0.5f));
                                        order.putShort((short) (zj1Var4.M + 0.5f));
                                        order.putShort((short) zj1Var4.B);
                                        order.putShort((short) zj1Var4.C);
                                    }
                                    mxVar = new mx(zj1Var4.y, zj1Var4.A, zj1Var4.z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                String str6 = zj1Var4.a;
                                if (str6 != null) {
                                    Map map = h0;
                                    if (map.containsKey(str6)) {
                                        i6 = ((Integer) map.get(zj1Var4.a)).intValue();
                                        if (zj1Var4.r == 0 && Float.compare(zj1Var4.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(zj1Var4.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                            if (Float.compare(zj1Var4.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                                                i7 = 0;
                                            } else if (Float.compare(zj1Var4.t, 90.0f) == 0) {
                                                i7 = 90;
                                            } else if (Float.compare(zj1Var4.t, -180.0f) == 0 || Float.compare(zj1Var4.t, 180.0f) == 0) {
                                                i7 = 180;
                                            } else if (Float.compare(zj1Var4.t, -90.0f) == 0) {
                                                i7 = atv0.b;
                                            }
                                            mx0Var.p = zj1Var4.m;
                                            mx0Var.q = zj1Var4.n;
                                            mx0Var.t = f;
                                            mx0Var.s = i7;
                                            mx0Var.u = zj1Var4.v;
                                            mx0Var.v = zj1Var4.w;
                                            mx0Var.w = mxVar;
                                            i2 = 2;
                                        }
                                        i7 = i6;
                                        mx0Var.p = zj1Var4.m;
                                        mx0Var.q = zj1Var4.n;
                                        mx0Var.t = f;
                                        mx0Var.s = i7;
                                        mx0Var.u = zj1Var4.v;
                                        mx0Var.v = zj1Var4.w;
                                        mx0Var.w = mxVar;
                                        i2 = 2;
                                    }
                                }
                                i6 = -1;
                                if (zj1Var4.r == 0) {
                                    if (Float.compare(zj1Var4.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                                    }
                                    mx0Var.p = zj1Var4.m;
                                    mx0Var.q = zj1Var4.n;
                                    mx0Var.t = f;
                                    mx0Var.s = i7;
                                    mx0Var.u = zj1Var4.v;
                                    mx0Var.v = zj1Var4.w;
                                    mx0Var.w = mxVar;
                                    i2 = 2;
                                }
                                i7 = i6;
                                mx0Var.p = zj1Var4.m;
                                mx0Var.q = zj1Var4.n;
                                mx0Var.t = f;
                                mx0Var.s = i7;
                                mx0Var.u = zj1Var4.v;
                                mx0Var.v = zj1Var4.w;
                                mx0Var.w = mxVar;
                                i2 = 2;
                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5) && !MimeTypes.TEXT_SSA.equals(str5) && !MimeTypes.TEXT_VTT.equals(str5) && !MimeTypes.APPLICATION_VOBSUB.equals(str5) && !MimeTypes.APPLICATION_PGS.equals(str5) && !MimeTypes.APPLICATION_DVBSUBS.equals(str5)) {
                                throw new pc2("Unexpected MIME type.", null, true, 1);
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null && !h0.containsKey(str3)) {
                                mx0Var.b = zj1Var4.a;
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i22;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var = new nx0(mx0Var);
                            q83 a2 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a2;
                            a2.a(nx0Var);
                            this.c.put(zj1Var4.c, zj1Var4);
                            break;
                        }
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                            str2 = a.a;
                            str5 = "video/dolby-vision";
                        }
                        int i222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                            mx0Var.b = zj1Var4.a;
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2 = new nx0(mx0Var);
                        q83 a22 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22;
                        a22.a(nx0Var2);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 2:
                        kc2 kc2Var = new kc2(zj1Var4.a(str4));
                        try {
                            int h = kc2Var.h();
                            if (h != 1) {
                                if (h == 65534) {
                                    kc2Var.e(24);
                                    long i25 = kc2Var.i();
                                    UUID uuid = g0;
                                    if (i25 == uuid.getMostSignificantBits()) {
                                        break;
                                    }
                                }
                                ji1.d("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                str5 = MimeTypes.AUDIO_UNKNOWN;
                                list5 = null;
                                i3 = -1;
                                list = list5;
                                i4 = -1;
                                list3 = list;
                                str2 = null;
                                list6 = list3;
                                bArr = zj1Var4.N;
                                if (bArr != null) {
                                }
                                int i2222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                                mx0Var = new mx0();
                                if ("audio".equals(iu1.c(str5))) {
                                }
                                str3 = zj1Var4.a;
                                if (str3 != null) {
                                }
                                mx0Var.a = Integer.toString(i21);
                                mx0Var.k = str5;
                                mx0Var.l = i3;
                                mx0Var.c = zj1Var4.W;
                                mx0Var.d = i2222;
                                mx0Var.m = list6;
                                mx0Var.h = str2;
                                mx0Var.n = zj1Var4.l;
                                nx0 nx0Var22 = new nx0(mx0Var);
                                q83 a222 = r3.a(zj1Var4.c, i2);
                                zj1Var4.X = a222;
                                a222.a(nx0Var22);
                                this.c.put(zj1Var4.c, zj1Var4);
                                break;
                            }
                            b = mc3.b(zj1Var4.P);
                            if (b == 0) {
                                ji1.d("MatroskaExtractor", "Unsupported PCM bit depth: " + zj1Var4.P + ". Setting mimeType to audio/x-unknown");
                                str5 = MimeTypes.AUDIO_UNKNOWN;
                                list5 = null;
                                i3 = -1;
                                list = list5;
                                i4 = -1;
                                list3 = list;
                                str2 = null;
                                list6 = list3;
                                bArr = zj1Var4.N;
                                if (bArr != null) {
                                }
                                int i22222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                                mx0Var = new mx0();
                                if ("audio".equals(iu1.c(str5))) {
                                }
                                str3 = zj1Var4.a;
                                if (str3 != null) {
                                }
                                mx0Var.a = Integer.toString(i21);
                                mx0Var.k = str5;
                                mx0Var.l = i3;
                                mx0Var.c = zj1Var4.W;
                                mx0Var.d = i22222;
                                mx0Var.m = list6;
                                mx0Var.h = str2;
                                mx0Var.n = zj1Var4.l;
                                nx0 nx0Var222 = new nx0(mx0Var);
                                q83 a2222 = r3.a(zj1Var4.c, i2);
                                zj1Var4.X = a2222;
                                a2222.a(nx0Var222);
                                this.c.put(zj1Var4.c, zj1Var4);
                            }
                            i4 = b;
                            list3 = null;
                            i3 = -1;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var2222 = new nx0(mx0Var);
                            q83 a22222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a22222;
                            a22222.a(nx0Var2222);
                            this.c.put(zj1Var4.c, zj1Var4);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new pc2("Error parsing MS/ACM codec private", null, true, 1);
                        }
                        break;
                    case 3:
                        zj1Var4.T = new da3();
                        str5 = MimeTypes.AUDIO_TRUEHD;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222 = new nx0(mx0Var);
                        q83 a222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222;
                        a222222.a(nx0Var22222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 4:
                        byte[] a3 = zj1Var4.a(str4);
                        try {
                            try {
                                if (a3[0] != 2) {
                                    throw new pc2("Error parsing vorbis codec private", null, true, 1);
                                }
                                int i26 = 0;
                                int i27 = 1;
                                while (true) {
                                    int i28 = a3[i27] & 255;
                                    if (i28 == 255) {
                                        i26 += 255;
                                        i27++;
                                    } else {
                                        int i29 = i27 + 1;
                                        int i30 = i26 + i28;
                                        int i31 = 0;
                                        while (true) {
                                            int i32 = a3[i29] & 255;
                                            if (i32 == 255) {
                                                i31 += 255;
                                                i29++;
                                            } else {
                                                int i33 = i29 + 1;
                                                int i34 = i31 + i32;
                                                try {
                                                    if (a3[i33] != 1) {
                                                        throw new pc2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    byte[] bArr4 = new byte[i30];
                                                    System.arraycopy(a3, i33, bArr4, 0, i30);
                                                    int i35 = i33 + i30;
                                                    if (a3[i35] != 3) {
                                                        throw new pc2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    int i36 = i35 + i34;
                                                    if (a3[i36] != 5) {
                                                        throw new pc2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    byte[] bArr5 = new byte[a3.length - i36];
                                                    System.arraycopy(a3, i36, bArr5, 0, a3.length - i36);
                                                    ArrayList arrayList = new ArrayList(2);
                                                    arrayList.add(bArr4);
                                                    arrayList.add(bArr5);
                                                    str5 = MimeTypes.AUDIO_VORBIS;
                                                    i3 = 8192;
                                                    list = arrayList;
                                                    i4 = -1;
                                                    list3 = list;
                                                    str2 = null;
                                                    list6 = list3;
                                                    bArr = zj1Var4.N;
                                                    if (bArr != null) {
                                                    }
                                                    int i22222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                                                    mx0Var = new mx0();
                                                    if ("audio".equals(iu1.c(str5))) {
                                                    }
                                                    str3 = zj1Var4.a;
                                                    if (str3 != null) {
                                                    }
                                                    mx0Var.a = Integer.toString(i21);
                                                    mx0Var.k = str5;
                                                    mx0Var.l = i3;
                                                    mx0Var.c = zj1Var4.W;
                                                    mx0Var.d = i22222222;
                                                    mx0Var.m = list6;
                                                    mx0Var.h = str2;
                                                    mx0Var.n = zj1Var4.l;
                                                    nx0 nx0Var222222 = new nx0(mx0Var);
                                                    q83 a2222222 = r3.a(zj1Var4.c, i2);
                                                    zj1Var4.X = a2222222;
                                                    a2222222.a(nx0Var222222);
                                                    this.c.put(zj1Var4.c, zj1Var4);
                                                    break;
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    a3 = 1;
                                                    r3 = 0;
                                                    throw new pc2("Error parsing vorbis codec private", r3, a3, a3);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused3) {
                            }
                        } catch (ArrayIndexOutOfBoundsException unused4) {
                            r3 = 0;
                            a3 = 1;
                        }
                        break;
                    case 5:
                        str5 = MimeTypes.AUDIO_MPEG_L2;
                        i3 = 4096;
                        list = null;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222 = new nx0(mx0Var);
                        q83 a22222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222;
                        a22222222.a(nx0Var2222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 6:
                        str5 = MimeTypes.AUDIO_MPEG;
                        i3 = 4096;
                        list = null;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222 = new nx0(mx0Var);
                        q83 a222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222;
                        a222222222.a(nx0Var22222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 7:
                        byte[] a4 = zj1Var4.a(str4);
                        try {
                            if (16 > a4.length) {
                                throw new IllegalArgumentException();
                            }
                            long j5 = (a4[16] & 255) | ((a4[17] & 255) << 8) | ((a4[18] & 255) << 16) | ((a4[19] & 255) << 24);
                            if (j5 == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (j5 == 859189832) {
                                pair = new Pair(MimeTypes.VIDEO_H263, null);
                            } else {
                                if (j5 == 826496599) {
                                    for (int i37 = 40; i37 < a4.length - 4; i37++) {
                                        if (a4[i37] == 0 && a4[i37 + 1] == 0 && a4[i37 + 2] == 1) {
                                            if (a4[i37 + 3] == 15) {
                                                pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(a4, i37, a4.length)));
                                            }
                                        }
                                    }
                                    throw new pc2("Failed to find FourCC VC1 initialization data", null, true, 1);
                                }
                                ji1.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                            }
                            str5 = (String) pair.first;
                            list5 = (List) pair.second;
                            i3 = -1;
                            list = list5;
                            i4 = -1;
                            list3 = list;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i22222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i22222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var222222222 = new nx0(mx0Var);
                            q83 a2222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a2222222222;
                            a2222222222.a(nx0Var222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                            break;
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                            throw new pc2("Error parsing FourCC private data", null, true, 1);
                        }
                        break;
                    case '\b':
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(zj1Var4.a(str4), 0, bArr6, 0, 4);
                        tn2 a5 = s51.a(bArr6);
                        str5 = MimeTypes.APPLICATION_DVBSUBS;
                        list5 = a5;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222 = new nx0(mx0Var);
                        q83 a22222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222;
                        a22222222222.a(nx0Var2222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case '\n':
                        ul a6 = ul.a(new kc2(zj1Var4.a(str4)));
                        list2 = a6.a;
                        zj1Var4.Y = a6.b;
                        str = a6.f;
                        str5 = "video/avc";
                        str2 = str;
                        list4 = list2;
                        i3 = -1;
                        i4 = -1;
                        list6 = list4;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222 = new nx0(mx0Var);
                        q83 a222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222;
                        a222222222222.a(nx0Var22222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 11:
                        tn2 a7 = s51.a(zj1Var4.a(str4));
                        str5 = MimeTypes.APPLICATION_VOBSUB;
                        list5 = a7;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222 = new nx0(mx0Var);
                        q83 a2222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222;
                        a2222222222222.a(nx0Var222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case '\f':
                        str5 = MimeTypes.AUDIO_DTS_HD;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222 = new nx0(mx0Var);
                        q83 a22222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222;
                        a22222222222222.a(nx0Var2222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case '\r':
                        List singletonList = Collections.singletonList(zj1Var4.a(str4));
                        byte[] bArr7 = zj1Var4.k;
                        a a8 = b.a(new jc2(bArr7.length, bArr7), false);
                        zj1Var4.Q = a8.a;
                        zj1Var4.O = a8.b;
                        str5 = "audio/mp4a-latm";
                        str2 = a8.c;
                        list4 = singletonList;
                        i3 = -1;
                        i4 = -1;
                        list6 = list4;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222 = new nx0(mx0Var);
                        q83 a222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222;
                        a222222222222222.a(nx0Var22222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 14:
                        str5 = MimeTypes.AUDIO_AC3;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222;
                        a2222222222222222.a(nx0Var222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 15:
                    case 21:
                        str5 = MimeTypes.AUDIO_DTS;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222222 = new nx0(mx0Var);
                        q83 a22222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222222;
                        a22222222222222222.a(nx0Var2222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 16:
                        str5 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222222 = new nx0(mx0Var);
                        q83 a222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222222;
                        a222222222222222222.a(nx0Var22222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 17:
                        str5 = MimeTypes.VIDEO_VP8;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222222;
                        a2222222222222222222.a(nx0Var222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 18:
                        str5 = MimeTypes.VIDEO_VP9;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222222222 = new nx0(mx0Var);
                        q83 a22222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222222222;
                        a22222222222222222222.a(nx0Var2222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 19:
                        str5 = MimeTypes.APPLICATION_PGS;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222222222 = new nx0(mx0Var);
                        q83 a222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222222222;
                        a222222222222222222222.a(nx0Var22222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 20:
                        str5 = MimeTypes.VIDEO_UNKNOWN;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222222222;
                        a2222222222222222222222.a(nx0Var222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 22:
                        if (zj1Var4.P == 32) {
                            list3 = null;
                            i3 = -1;
                            i4 = 4;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var2222222222222222222222 = new nx0(mx0Var);
                            q83 a22222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a22222222222222222222222;
                            a22222222222222222222222.a(nx0Var2222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                            break;
                        } else {
                            ji1.d("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + zj1Var4.P + ". Setting mimeType to audio/x-unknown");
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            list5 = null;
                            i3 = -1;
                            list = list5;
                            i4 = -1;
                            list3 = list;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i2222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i2222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var22222222222222222222222 = new nx0(mx0Var);
                            q83 a222222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a222222222222222222222222;
                            a222222222222222222222222.a(nx0Var22222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                        }
                        break;
                    case 23:
                        int i38 = zj1Var4.P;
                        if (i38 == 8) {
                            i4 = 3;
                            list3 = null;
                            i3 = -1;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i22222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i22222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var222222222222222222222222 = new nx0(mx0Var);
                            q83 a2222222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a2222222222222222222222222;
                            a2222222222222222222222222.a(nx0Var222222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                            break;
                        } else if (i38 == 16) {
                            b = 268435456;
                            i4 = b;
                            list3 = null;
                            i3 = -1;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i222222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var2222222222222222222222222 = new nx0(mx0Var);
                            q83 a22222222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a22222222222222222222222222;
                            a22222222222222222222222222.a(nx0Var2222222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                        } else {
                            ji1.d("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + zj1Var4.P + ". Setting mimeType to audio/x-unknown");
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            list5 = null;
                            i3 = -1;
                            list = list5;
                            i4 = -1;
                            list3 = list;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i2222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i2222222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var22222222222222222222222222 = new nx0(mx0Var);
                            q83 a222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a222222222222222222222222222;
                            a222222222222222222222222222.a(nx0Var22222222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                        }
                        break;
                    case 24:
                        b = mc3.b(zj1Var4.P);
                        if (b == 0) {
                            ji1.d("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + zj1Var4.P + ". Setting mimeType to audio/x-unknown");
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            list5 = null;
                            i3 = -1;
                            list = list5;
                            i4 = -1;
                            list3 = list;
                            str2 = null;
                            list6 = list3;
                            bArr = zj1Var4.N;
                            if (bArr != null) {
                            }
                            int i22222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                            mx0Var = new mx0();
                            if ("audio".equals(iu1.c(str5))) {
                            }
                            str3 = zj1Var4.a;
                            if (str3 != null) {
                            }
                            mx0Var.a = Integer.toString(i21);
                            mx0Var.k = str5;
                            mx0Var.l = i3;
                            mx0Var.c = zj1Var4.W;
                            mx0Var.d = i22222222222222222222222222222;
                            mx0Var.m = list6;
                            mx0Var.h = str2;
                            mx0Var.n = zj1Var4.l;
                            nx0 nx0Var222222222222222222222222222 = new nx0(mx0Var);
                            q83 a2222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                            zj1Var4.X = a2222222222222222222222222222;
                            a2222222222222222222222222222.a(nx0Var222222222222222222222222222);
                            this.c.put(zj1Var4.c, zj1Var4);
                            break;
                        }
                        i4 = b;
                        list3 = null;
                        i3 = -1;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222222222222222222 = new nx0(mx0Var);
                        q83 a22222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222222222222222222;
                        a22222222222222222222222222222.a(nx0Var2222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 25:
                        tn2 a9 = s51.a(d0, zj1Var4.a(str4));
                        str5 = MimeTypes.TEXT_SSA;
                        list5 = a9;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222222222222222222 = new nx0(mx0Var);
                        q83 a222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222222222222222222;
                        a222222222222222222222222222222.a(nx0Var22222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 26:
                        x01 a10 = x01.a(new kc2(zj1Var4.a(str4)));
                        list2 = a10.a;
                        zj1Var4.Y = a10.b;
                        str = a10.d;
                        str5 = "video/hevc";
                        str2 = str;
                        list4 = list2;
                        i3 = -1;
                        i4 = -1;
                        list6 = list4;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222222222222222222;
                        a2222222222222222222222222222222.a(nx0Var222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 27:
                        str5 = MimeTypes.TEXT_VTT;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a22222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222222222222222222222;
                        a22222222222222222222222222222222.a(nx0Var2222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 28:
                        str5 = MimeTypes.APPLICATION_SUBRIP;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a222222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222222222222222222222;
                        a222222222222222222222222222222222.a(nx0Var22222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 29:
                        str5 = MimeTypes.VIDEO_MPEG2;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222222222222222222222;
                        a2222222222222222222222222222222222.a(nx0Var222222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 30:
                        str5 = MimeTypes.AUDIO_E_AC3;
                        list5 = null;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i222222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i222222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var2222222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a22222222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a22222222222222222222222222222222222;
                        a22222222222222222222222222222222222.a(nx0Var2222222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case 31:
                        List singletonList2 = Collections.singletonList(zj1Var4.a(str4));
                        str5 = MimeTypes.AUDIO_FLAC;
                        list5 = singletonList2;
                        i3 = -1;
                        list = list5;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i2222222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i2222222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var22222222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a222222222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a222222222222222222222222222222222222;
                        a222222222222222222222222222222222222.a(nx0Var22222222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    case ' ':
                        ArrayList arrayList2 = new ArrayList(3);
                        arrayList2.add(zj1Var4.a(zj1Var4.b));
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList2.add(allocate.order(byteOrder).putLong(zj1Var4.R).array());
                        arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(zj1Var4.S).array());
                        str5 = MimeTypes.AUDIO_OPUS;
                        i3 = 5760;
                        list = arrayList2;
                        i4 = -1;
                        list3 = list;
                        str2 = null;
                        list6 = list3;
                        bArr = zj1Var4.N;
                        if (bArr != null) {
                        }
                        int i22222222222222222222222222222222222222 = (zj1Var4.V ? 1 : 0) | (zj1Var4.U ? 2 : 0);
                        mx0Var = new mx0();
                        if ("audio".equals(iu1.c(str5))) {
                        }
                        str3 = zj1Var4.a;
                        if (str3 != null) {
                        }
                        mx0Var.a = Integer.toString(i21);
                        mx0Var.k = str5;
                        mx0Var.l = i3;
                        mx0Var.c = zj1Var4.W;
                        mx0Var.d = i22222222222222222222222222222222222222;
                        mx0Var.m = list6;
                        mx0Var.h = str2;
                        mx0Var.n = zj1Var4.l;
                        nx0 nx0Var222222222222222222222222222222222222 = new nx0(mx0Var);
                        q83 a2222222222222222222222222222222222222 = r3.a(zj1Var4.c, i2);
                        zj1Var4.X = a2222222222222222222222222222222222222;
                        a2222222222222222222222222222222222222.a(nx0Var222222222222222222222222222222222222);
                        this.c.put(zj1Var4.c, zj1Var4);
                        break;
                    default:
                        throw new pc2("Unrecognized codec identifier.", null, true, 1);
                }
        }
        this.u = null;
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        ((jd0) this.a).a();
        ad3 ad3Var = this.b;
        ad3Var.b = 0;
        ad3Var.c = 0;
        b();
        for (int i = 0; i < this.c.size(); i++) {
            da3 da3Var = ((zj1) this.c.valueAt(i)).T;
            if (da3Var != null) {
                da3Var.b = false;
                da3Var.c = 0;
            }
        }
    }

    public ak1(jd0 jd0Var, int i) {
        this.q = -1L;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.t = C.TIME_UNSET;
        this.z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.a = jd0Var;
        jd0Var.a(new yj1(this));
        this.d = (i & 1) == 0;
        this.b = new ad3();
        this.c = new SparseArray();
        this.g = new kc2(4);
        this.h = new kc2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new kc2(4);
        this.e = new kc2(ez1.a);
        this.f = new kc2(4);
        this.j = new kc2();
        this.k = new kc2();
        this.l = new kc2(8);
        this.m = new kc2();
        this.n = new kc2();
        this.L = new int[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zj1 zj1Var, long j, int i, int i2, int i3) {
        byte[] a;
        int i4;
        int i5;
        da3 da3Var = zj1Var.T;
        if (da3Var != null) {
            da3Var.a(zj1Var.X, j, i, i2, i3, zj1Var.j);
        } else {
            if ("S_TEXT/UTF8".equals(zj1Var.b) || "S_TEXT/ASS".equals(zj1Var.b) || "S_TEXT/WEBVTT".equals(zj1Var.b)) {
                if (this.K > 1) {
                    ji1.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == C.TIME_UNSET) {
                        ji1.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zj1Var.b;
                        byte[] bArr = this.k.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                a = a("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                a = a("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                a = a("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(a, 0, bArr, i4, a.length);
                        int i6 = this.k.b;
                        while (true) {
                            kc2 kc2Var = this.k;
                            if (i6 < kc2Var.c) {
                                if (kc2Var.a[i6] == 0) {
                                    kc2Var.d(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        q83 q83Var = zj1Var.X;
                        kc2 kc2Var2 = this.k;
                        q83Var.a(kc2Var2.c, kc2Var2);
                        i5 = i2 + this.k.c;
                        if ((i & 268435456) != 0) {
                            if (this.K > 1) {
                                this.n.c(0);
                            } else {
                                kc2 kc2Var3 = this.n;
                                int i7 = kc2Var3.c;
                                zj1Var.X.a(i7, kc2Var3);
                                i5 += i7;
                            }
                        }
                        zj1Var.X.a(j, i, i5, i3, zj1Var.j);
                    }
                }
            }
            i5 = i2;
            if ((i & 268435456) != 0) {
            }
            zj1Var.X.a(j, i, i5, i3, zj1Var.j);
        }
        this.F = true;
    }

    public static byte[] a(String str, long j, long j2) {
        if (j != C.TIME_UNSET) {
            int i = (int) (j / 3600000000L);
            long j3 = j - (i * 3600000000L);
            int i2 = (int) (j3 / 60000000);
            long j4 = j3 - (i2 * 60000000);
            int i3 = (int) (j4 / 1000000);
            return mc3.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.b0 = qq0Var;
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        this.F = false;
        boolean z = true;
        while (z && !this.F) {
            ld0 ld0Var = (ld0) oq0Var;
            z = ((jd0) this.a).a(ld0Var);
            if (z) {
                long j = ld0Var.d;
                if (this.y) {
                    this.A = j;
                    hh2Var.a = this.z;
                    this.y = false;
                } else if (this.v) {
                    long j2 = this.A;
                    if (j2 != -1) {
                        hh2Var.a = j2;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            zj1 zj1Var = (zj1) this.c.valueAt(i);
            zj1Var.X.getClass();
            da3 da3Var = zj1Var.T;
            if (da3Var != null) {
                q83 q83Var = zj1Var.X;
                p83 p83Var = zj1Var.j;
                if (da3Var.c > 0) {
                    q83Var.a(da3Var.d, da3Var.e, da3Var.f, da3Var.g, p83Var);
                    da3Var.c = 0;
                }
            }
        }
        return -1;
    }

    public final void a(ld0 ld0Var, int i) {
        kc2 kc2Var = this.g;
        if (kc2Var.c >= i) {
            return;
        }
        byte[] bArr = kc2Var.a;
        if (bArr.length < i) {
            kc2Var.a(Math.max(bArr.length * 2, i));
        }
        kc2 kc2Var2 = this.g;
        byte[] bArr2 = kc2Var2.a;
        int i2 = kc2Var2.c;
        ld0Var.a(bArr2, i2, i - i2, false);
        this.g.d(i);
    }

    public final long a(long j) {
        long j2 = this.r;
        if (j2 != C.TIME_UNSET) {
            return mc3.a(j, j2, 1000L);
        }
        throw new pc2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
    
        return false;
     */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(oq0 oq0Var) {
        x23 x23Var = new x23();
        ld0 ld0Var = (ld0) oq0Var;
        long j = ld0Var.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        ld0Var.b(x23Var.a.a, 0, 4, false);
        long n = x23Var.a.n();
        x23Var.b = 4;
        while (true) {
            if (n != 440786851) {
                int i2 = x23Var.b + 1;
                x23Var.b = i2;
                if (i2 == i) {
                    break;
                }
                ld0Var.b(x23Var.a.a, 0, 1, false);
                n = ((n << 8) & (-256)) | (x23Var.a.a[0] & 255);
            } else {
                long a = x23Var.a(ld0Var);
                long j3 = x23Var.b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = x23Var.b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (x23Var.a(ld0Var) != Long.MIN_VALUE) {
                                long a2 = x23Var.a(ld0Var);
                                if (a2 < 0 || a2 > 2147483647L) {
                                    break;
                                }
                                if (a2 != 0) {
                                    int i3 = (int) a2;
                                    ld0Var.a(false, i3);
                                    x23Var.b += i3;
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
    }

    public final int a(ld0 ld0Var, zj1 zj1Var, int i, boolean z) {
        int a;
        int a2;
        int i2;
        if ("S_TEXT/UTF8".equals(zj1Var.b)) {
            a(ld0Var, c0, i);
            int i3 = this.T;
            b();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zj1Var.b)) {
            a(ld0Var, e0, i);
            int i4 = this.T;
            b();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zj1Var.b)) {
            a(ld0Var, f0, i);
            int i5 = this.T;
            b();
            return i5;
        }
        q83 q83Var = zj1Var.X;
        if (!this.V) {
            if (zj1Var.h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ld0Var.a(this.g.a, 0, 1, false);
                    this.S++;
                    byte b = this.g.a[0];
                    if ((b & 128) != 128) {
                        this.Z = b;
                        this.W = true;
                    } else {
                        throw new pc2("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        ld0Var.a(this.l.a, 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        kc2 kc2Var = this.g;
                        kc2Var.a[0] = (byte) ((z2 ? 128 : 0) | 8);
                        kc2Var.e(0);
                        q83Var.a(1, this.g);
                        this.T++;
                        this.l.e(0);
                        q83Var.a(8, this.l);
                        this.T += 8;
                    }
                    if (z2) {
                        if (!this.X) {
                            ld0Var.a(this.g.a, 0, 1, false);
                            this.S++;
                            this.g.e(0);
                            this.Y = this.g.m();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        this.g.c(i6);
                        ld0Var.a(this.g.a, 0, i6, false);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int p = this.g.p();
                            if (i8 % 2 == 0) {
                                this.o.putShort((short) (p - i9));
                            } else {
                                this.o.putInt(p - i9);
                            }
                            i8++;
                            i9 = p;
                        }
                        int i10 = (i - this.S) - i9;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i10);
                        } else {
                            this.o.putShort((short) i10);
                            this.o.putInt(0);
                        }
                        kc2 kc2Var2 = this.m;
                        kc2Var2.a = this.o.array();
                        kc2Var2.c = i7;
                        kc2Var2.b = 0;
                        q83Var.a(i7, this.m);
                        this.T += i7;
                    }
                }
            } else {
                byte[] bArr = zj1Var.i;
                if (bArr != null) {
                    kc2 kc2Var3 = this.j;
                    int length = bArr.length;
                    kc2Var3.a = bArr;
                    kc2Var3.c = length;
                    kc2Var3.b = 0;
                }
            }
            if (!"A_OPUS".equals(zj1Var.b) ? zj1Var.f > 0 : z) {
                this.O |= 268435456;
                this.n.c(0);
                int i11 = (this.j.c + i) - this.S;
                this.g.c(4);
                kc2 kc2Var4 = this.g;
                byte[] bArr2 = kc2Var4.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                q83Var.a(4, kc2Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i12 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(zj1Var.b) && !"V_MPEGH/ISO/HEVC".equals(zj1Var.b)) {
            da3 da3Var = zj1Var.T;
            if (da3Var != null) {
                if (this.j.c == 0) {
                    da3Var.a(ld0Var);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i13 = this.S;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                kc2 kc2Var5 = this.j;
                int i15 = kc2Var5.c - kc2Var5.b;
                if (i15 > 0) {
                    a2 = Math.min(i14, i15);
                    q83Var.a(a2, this.j);
                } else {
                    a2 = q83Var.a(ld0Var, i14, false);
                }
                this.S += a2;
                this.T += a2;
            }
        } else {
            byte[] bArr3 = this.f.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = zj1Var.Y;
            int i17 = 4 - i16;
            while (this.S < i12) {
                int i18 = this.U;
                if (i18 == 0) {
                    kc2 kc2Var6 = this.j;
                    int min = Math.min(i16, kc2Var6.c - kc2Var6.b);
                    ld0Var.a(bArr3, i17 + min, i16 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i17, min);
                    }
                    this.S += i16;
                    this.f.e(0);
                    this.U = this.f.p();
                    this.e.e(0);
                    q83Var.a(4, this.e);
                    this.T += 4;
                } else {
                    kc2 kc2Var7 = this.j;
                    int i19 = kc2Var7.c - kc2Var7.b;
                    if (i19 > 0) {
                        a = Math.min(i18, i19);
                        q83Var.a(a, this.j);
                    } else {
                        a = q83Var.a(ld0Var, i18, false);
                    }
                    this.S += a;
                    this.T += a;
                    this.U -= a;
                }
            }
        }
        if ("A_VORBIS".equals(zj1Var.b)) {
            this.h.e(0);
            q83Var.a(4, this.h);
            this.T += 4;
        }
        int i20 = this.T;
        b();
        return i20;
    }

    public final void a(ld0 ld0Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        kc2 kc2Var = this.k;
        byte[] bArr2 = kc2Var.a;
        if (bArr2.length < length) {
            kc2Var.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ld0Var.a(this.k.a, bArr.length, i, false);
        this.k.e(0);
        this.k.d(length);
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.c(0);
    }

    public static nq0[] a() {
        return new nq0[]{new ak1(new jd0(), 0)};
    }
}
