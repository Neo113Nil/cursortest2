package yads;

import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public final class mo3 implements no3 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, InterfaceC4413l1.a.b.h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND};
    public final qq0 a;
    public final q83 b;
    public final qo3 c;
    public final int d;
    public final byte[] e;
    public final kc2 f;
    public final int g;
    public final nx0 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public mo3(qq0 qq0Var, q83 q83Var, qo3 qo3Var) {
        this.a = qq0Var;
        this.b = q83Var;
        this.c = qo3Var;
        int max = Math.max(1, qo3Var.b / 10);
        this.g = max;
        kc2 kc2Var = new kc2(qo3Var.e);
        kc2Var.h();
        int h = kc2Var.h();
        this.d = h;
        int i = qo3Var.a;
        int i2 = (((qo3Var.c - (i * 4)) * 8) / (qo3Var.d * i)) + 1;
        if (h != i2) {
            throw pc2.a("Expected frames per block: " + i2 + "; got: " + h);
        }
        int a = mc3.a(max, h);
        this.e = new byte[qo3Var.c * a];
        this.f = new kc2(a(h, i) * a);
        int i3 = ((qo3Var.b * qo3Var.c) * 8) / h;
        this.h = new mx0().d(MimeTypes.AUDIO_RAW).a(i3).e(i3).c(a(max, i)).b(qo3Var.a).g(qo3Var.b).d(2).a();
    }

    public static int a(int i, int i2) {
        return i * 2 * i2;
    }

    @Override // yads.no3
    public final void a(int i, long j) {
        this.a.a(new to3(this.c, this.d, i, j));
        this.b.a(this.h);
    }

    @Override // yads.no3
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003e -> B:4:0x0040). Please report as a decompilation issue!!! */
    @Override // yads.no3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ld0 ld0Var, long j) {
        ld0 ld0Var2;
        boolean z;
        int i;
        int i2 = this.g;
        int i3 = this.k;
        qo3 qo3Var = this.c;
        int i4 = i2 - (i3 / (qo3Var.a * 2));
        int i5 = this.d;
        int i6 = mc3.a;
        boolean z2 = true;
        int i7 = (((i4 + i5) - 1) / i5) * qo3Var.c;
        if (j == 0) {
            ld0Var2 = ld0Var;
            z = true;
            while (!z) {
                if (this.i >= i7) {
                    break;
                }
                int read = ld0Var2.read(this.e, this.i, (int) Math.min(i7 - r8, j));
                if (read == -1) {
                    z = true;
                    while (!z) {
                    }
                } else {
                    this.i += read;
                }
            }
            i = this.i / this.c.c;
            if (i > 0) {
                byte[] bArr = this.e;
                kc2 kc2Var = this.f;
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = 0;
                    while (true) {
                        qo3 qo3Var2 = this.c;
                        int i10 = qo3Var2.a;
                        if (i9 < i10) {
                            byte[] bArr2 = kc2Var.a;
                            int i11 = qo3Var2.c;
                            int i12 = (i9 * 4) + (i8 * i11);
                            int i13 = (i10 * 4) + i12;
                            int i14 = (i11 / i10) - 4;
                            int i15 = (short) (((bArr[i12 + 1] & 255) << 8) | (bArr[i12] & 255));
                            int min = Math.min(bArr[i12 + 2] & 255, 88);
                            int i16 = n[min];
                            boolean z3 = z2;
                            int i17 = ((this.d * i8 * i10) + i9) * 2;
                            bArr2[i17] = (byte) (i15 & 255);
                            bArr2[i17 + 1] = (byte) (i15 >> 8);
                            int i18 = 0;
                            while (i18 < i14 * 2) {
                                byte b = bArr[((i18 / 8) * i10 * 4) + i13 + ((i18 / 2) % 4)];
                                int i19 = i;
                                int i20 = i18 % 2 == 0 ? b & AmfConstants.TYPE_XML_DOCUMENT_MARKER : (b & 255) >> 4;
                                int i21 = ((((i20 & 7) * 2) + 1) * i16) >> 3;
                                if ((i20 & 8) != 0) {
                                    i21 = -i21;
                                }
                                int i22 = i15 + i21;
                                int i23 = mc3.a;
                                i15 = Math.max(-32768, Math.min(i22, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND));
                                i17 += i10 * 2;
                                bArr2[i17] = (byte) (i15 & 255);
                                bArr2[i17 + 1] = (byte) (i15 >> 8);
                                int i24 = min + m[i20];
                                int[] iArr = n;
                                min = Math.max(0, Math.min(i24, 88));
                                i16 = iArr[min];
                                i18++;
                                i = i19;
                            }
                            i9++;
                            z2 = z3;
                        }
                    }
                }
                int i25 = i;
                int i26 = this.d * i25 * 2 * this.c.a;
                kc2Var.e(0);
                kc2Var.d(i26);
                this.i -= this.c.c * i25;
                kc2 kc2Var2 = this.f;
                int i27 = kc2Var2.c;
                this.b.a(i27, kc2Var2);
                int i28 = this.k + i27;
                this.k = i28;
                int i29 = i28 / (this.c.a * 2);
                int i30 = this.g;
                if (i29 >= i30) {
                    long a = this.j + mc3.a(this.l, 1000000L, r2.b);
                    int i31 = i30 * 2 * this.c.a;
                    this.b.a(a, 1, i31, this.k - i31, null);
                    this.l += i30;
                    this.k -= i31;
                }
            }
            if (z) {
                int i32 = this.k / (this.c.a * 2);
                if (i32 > 0) {
                    long a2 = this.j + mc3.a(this.l, 1000000L, r2.b);
                    int i33 = i32 * 2 * this.c.a;
                    this.b.a(a2, 1, i33, this.k - i33, null);
                    this.l += i32;
                    this.k -= i33;
                }
            }
            return z;
        }
        ld0Var2 = ld0Var;
        z = false;
        while (!z) {
        }
        i = this.i / this.c.c;
        if (i > 0) {
        }
        if (z) {
        }
        return z;
    }
}
