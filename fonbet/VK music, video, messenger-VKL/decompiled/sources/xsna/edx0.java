package xsna;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.gdx0;

/* compiled from: WavExtractor.java */
/* loaded from: classes12.dex */
public final class edx0 implements pgq {
    public rgq a;
    public rgp0 b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* compiled from: WavExtractor.java */
    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, InterfaceC4413l1.a.b.h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND};
        public final rgq a;
        public final rgp0 b;
        public final fdx0 c;
        public final int d;
        public final byte[] e;
        public final xi90 f;
        public final int g;
        public final androidx.media3.common.a h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(rgq rgqVar, rgp0 rgp0Var, fdx0 fdx0Var) throws ParserException {
            this.a = rgqVar;
            this.b = rgp0Var;
            this.c = fdx0Var;
            int i = fdx0Var.b;
            int max = Math.max(1, i / 10);
            this.g = max;
            xi90 xi90Var = new xi90(fdx0Var.e);
            xi90Var.v();
            int v = xi90Var.v();
            this.d = v;
            int i2 = fdx0Var.a;
            int i3 = fdx0Var.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (fdx0Var.d * i2)) + 1;
            if (v != i4) {
                throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + v);
            }
            int g = y2r0.g(max, v);
            this.e = new byte[g * i3];
            this.f = new xi90(v * 2 * i2 * g);
            int i5 = ((i3 * i) * 8) / v;
            a.C0043a c0043a = new a.C0043a();
            c0043a.m = io20.q(MimeTypes.AUDIO_RAW);
            c0043a.h = i5;
            c0043a.i = i5;
            c0043a.n = max * 2 * i2;
            c0043a.E = i2;
            c0043a.F = i;
            c0043a.G = 2;
            this.h = new androidx.media3.common.a(c0043a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
        @Override // xsna.edx0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(xsna.qgq r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.edx0.a.a(xsna.qgq, long):boolean");
        }

        @Override // xsna.edx0.b
        public final void b(int i, long j) {
            hdx0 hdx0Var = new hdx0(this.c, this.d, i, j);
            this.a.f(hdx0Var);
            androidx.media3.common.a aVar = this.h;
            rgp0 rgp0Var = this.b;
            rgp0Var.c(aVar);
            rgp0Var.e(hdx0Var.e);
        }

        public final void c(int i) {
            long j = this.j;
            long j2 = this.l;
            fdx0 fdx0Var = this.c;
            long j3 = fdx0Var.b;
            String str = y2r0.a;
            long d0 = j + y2r0.d0(j2, 1000000L, j3, RoundingMode.DOWN);
            int i2 = i * 2 * fdx0Var.a;
            this.b.a(d0, 1, i2, this.k - i2, null);
            this.l += i;
            this.k -= i2;
        }

        @Override // xsna.edx0.b
        public final void reset(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }
    }

    /* compiled from: WavExtractor.java */
    public interface b {
        boolean a(qgq qgqVar, long j) throws IOException;

        void b(int i, long j) throws ParserException;

        void reset(long j);
    }

    /* compiled from: WavExtractor.java */
    public static final class c implements b {
        public final rgq a;
        public final rgp0 b;
        public final fdx0 c;
        public final androidx.media3.common.a d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(rgq rgqVar, rgp0 rgp0Var, fdx0 fdx0Var, String str, int i) throws ParserException {
            this.a = rgqVar;
            this.b = rgp0Var;
            this.c = fdx0Var;
            int i2 = fdx0Var.a;
            int i3 = fdx0Var.b;
            int i4 = (fdx0Var.d * i2) / 8;
            int i5 = fdx0Var.c;
            if (i5 != i4) {
                throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.e = max;
            a.C0043a c0043a = new a.C0043a();
            c0043a.l = io20.q("audio/wav");
            c0043a.m = io20.q(str);
            c0043a.h = i7;
            c0043a.i = i7;
            c0043a.n = max;
            c0043a.E = i2;
            c0043a.F = i3;
            c0043a.G = i;
            this.d = new androidx.media3.common.a(c0043a);
        }

        @Override // xsna.edx0.b
        public final boolean a(qgq qgqVar, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int g = this.b.g(qgqVar, (int) Math.min(i2 - i, j2), true);
                if (g == -1) {
                    j2 = 0;
                } else {
                    this.g += g;
                    j2 -= g;
                }
            }
            fdx0 fdx0Var = this.c;
            int i3 = fdx0Var.c;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long j3 = this.f;
                long j4 = this.h;
                long j5 = fdx0Var.b;
                String str = y2r0.a;
                long d0 = j3 + y2r0.d0(j4, 1000000L, j5, RoundingMode.DOWN);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(d0, 1, i5, i6, null);
                this.h += i4;
                this.g = i6;
            }
            return j2 <= 0;
        }

        @Override // xsna.edx0.b
        public final void b(int i, long j) {
            hdx0 hdx0Var = new hdx0(this.c, 1, i, j);
            this.a.f(hdx0Var);
            androidx.media3.common.a aVar = this.d;
            rgp0 rgp0Var = this.b;
            rgp0Var.c(aVar);
            rgp0Var.e(hdx0Var.e);
        }

        @Override // xsna.edx0.b
        public final void reset(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x021a, code lost:
    
        if (r13 != 65534) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0221, code lost:
    
        if (r2 == 32) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0245  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = y2r0.a;
        int i2 = this.c;
        int i3 = 4;
        if (i2 == 0) {
            fxc0.z(qgqVar.getPosition() == 0);
            int i4 = this.f;
            if (i4 != -1) {
                qgqVar.skipFully(i4);
                this.c = 4;
                return 0;
            }
            if (!gdx0.a(qgqVar)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            qgqVar.skipFully((int) (qgqVar.getPeekPosition() - qgqVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            xi90 xi90Var = new xi90(8);
            gdx0.a a2 = gdx0.a.a(qgqVar, xi90Var);
            if (a2.a != 1685272116) {
                qgqVar.resetPeekPosition();
            } else {
                qgqVar.advancePeekPosition(8);
                xi90Var.P(0);
                qgqVar.peekFully(xi90Var.a, 0, 8);
                j = xi90Var.s();
                qgqVar.skipFully(((int) a2.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                fxc0.z(this.g != -1);
                long position = this.g - qgqVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.a(qgqVar, position) ? -1 : 0;
            }
            qgqVar.resetPeekPosition();
            gdx0.a b2 = gdx0.b(1684108385, qgqVar, new xi90(8));
            qgqVar.skipFully(8);
            Pair create = Pair.create(Long.valueOf(qgqVar.getPosition()), Long.valueOf(b2.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            this.g = this.f + longValue;
            long length = qgqVar.getLength();
            if (length != -1 && this.g > length) {
                ahn.F("Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.b(this.f, this.g);
            this.c = 4;
            return 0;
        }
        xi90 xi90Var2 = new xi90(16);
        long j3 = gdx0.b(1718449184, qgqVar, xi90Var2).b;
        fxc0.z(j3 >= 16);
        qgqVar.peekFully(xi90Var2.a, 0, 16);
        xi90Var2.P(0);
        int v = xi90Var2.v();
        int v2 = xi90Var2.v();
        int u = xi90Var2.u();
        xi90Var2.u();
        int v3 = xi90Var2.v();
        int v4 = xi90Var2.v();
        int i5 = ((int) j3) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            qgqVar.peekFully(bArr, 0, i5);
            if (v == 65534 && i5 == 24) {
                xi90 xi90Var3 = new xi90(bArr);
                xi90Var3.v();
                int v5 = xi90Var3.v();
                if (v5 != 0 && v5 != v4) {
                    throw ParserException.c("validBits ( " + v5 + ")  != bitsPerSample( " + v4 + ") are not supported");
                }
                int u2 = xi90Var3.u();
                if ((u2 >> 18) != 0) {
                    throw ParserException.c("invalid channel mask " + u2);
                }
                if (u2 != 0 && Integer.bitCount(u2) != v2) {
                    throw ParserException.c("invalid number of channels (" + Integer.bitCount(u2) + ") in channel mask " + u2);
                }
                v = xi90Var3.v();
                byte[] bArr2 = new byte[14];
                xi90Var3.n(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, gdx0.a) && !Arrays.equals(bArr2, gdx0.b)) {
                    throw ParserException.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = y2r0.b;
        }
        byte[] bArr3 = bArr;
        int i6 = v;
        qgqVar.skipFully((int) (qgqVar.getPeekPosition() - qgqVar.getPosition()));
        fdx0 fdx0Var = new fdx0(i6, v2, u, v3, v4, bArr3);
        if (i6 == 17) {
            this.e = new a(this.a, this.b, fdx0Var);
        } else if (i6 == 6) {
            this.e = new c(this.a, this.b, fdx0Var, MimeTypes.AUDIO_ALAW, -1);
        } else if (i6 == 7) {
            this.e = new c(this.a, this.b, fdx0Var, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (i6 != 1) {
                if (i6 != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw ParserException.c("Unsupported WAV format type: " + i6);
                }
                this.e = new c(this.a, this.b, fdx0Var, MimeTypes.AUDIO_RAW, i);
            }
            i3 = y2r0.F(v4, ByteOrder.LITTLE_ENDIAN);
            i = i3;
            if (i != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return gdx0.a(qgqVar);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.a = rgqVar;
        this.b = rgqVar.track(0, 1);
        rgqVar.endTracks();
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.reset(j2);
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
