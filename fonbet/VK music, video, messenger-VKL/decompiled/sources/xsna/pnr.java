package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: FlacFrameReader.java */
/* loaded from: classes12.dex */
public final class pnr {

    /* compiled from: FlacFrameReader.java */
    public static final class a {
        public long a;
    }

    public static boolean a(xi90 xi90Var, tnr tnrVar, int i, a aVar) {
        long E = xi90Var.E();
        long j = E >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((E >> 12) & 15);
        int i3 = (int) ((E >> 8) & 15);
        int i4 = (int) ((E >> 4) & 15);
        int i5 = (int) ((E >> 1) & 7);
        boolean z2 = (E & 1) == 1;
        if (i4 <= 7) {
            if (i4 != tnrVar.g - 1) {
                return false;
            }
        } else if (i4 > 10 || tnrVar.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == tnrVar.i) || z2) {
            return false;
        }
        try {
            long K = xi90Var.K();
            if (!z) {
                K *= tnrVar.b;
            }
            long j2 = tnrVar.j;
            if (j2 != 0 && K > j2) {
                return false;
            }
            aVar.a = K;
            int b = b(i2, xi90Var);
            long j3 = tnrVar.j;
            boolean z3 = j3 == 0 || K + ((long) b) >= j3;
            if (b == -1) {
                return false;
            }
            if ((!z3 && b < tnrVar.a) || b > tnrVar.b) {
                return false;
            }
            int i6 = tnrVar.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != tnrVar.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int J = xi90Var.J();
                    if (i3 == 14) {
                        J *= 10;
                    }
                    if (J != i6) {
                        return false;
                    }
                } else if (xi90Var.C() * 1000 != i6) {
                    return false;
                }
            }
            int C = xi90Var.C();
            int i7 = xi90Var.b;
            byte[] bArr = xi90Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = xi90Var.b; i10 < i8; i10++) {
                i9 = y2r0.m[i9 ^ (bArr[i10] & 255)];
            }
            String str = y2r0.a;
            if (C != i9) {
                return false;
            }
            if (xi90Var.a() != 0) {
                int m = xi90Var.m();
                if ((m & 128) != 0) {
                    return false;
                }
                int i11 = (m & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    ahn.u("Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, xi90 xi90Var) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return xi90Var.C() + 1;
            case 7:
                return xi90Var.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
