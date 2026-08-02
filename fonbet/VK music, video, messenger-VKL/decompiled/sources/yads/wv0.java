package yads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes10.dex */
public abstract class wv0 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r8 == r20.f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if ((r19.m() * 1000) == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r4 == r3) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(kc2 kc2Var, cw0 cw0Var, int i, vv0 vv0Var) {
        int i2;
        int i3;
        int i4;
        int m;
        long n = kc2Var.n();
        long j = n >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i5 = (int) ((n >> 12) & 15);
        int i6 = (int) ((n >> 8) & 15);
        int i7 = (int) ((n >> 4) & 15);
        int i8 = (int) ((n >> 1) & 7);
        boolean z2 = (n & 1) == 1;
        if (i7 > 7 ? !(i7 > 10 || cw0Var.g != 2) : i7 == cw0Var.g - 1) {
            if ((i8 == 0 || i8 == cw0Var.i) && !z2) {
                try {
                    long s = kc2Var.s();
                    if (!z) {
                        s *= cw0Var.b;
                    }
                    vv0Var.a = s;
                    switch (i5) {
                        case 1:
                            i2 = PsExtractor.AUDIO_STREAM;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i3 = i5 - 2;
                            i4 = 576;
                            i2 = i4 << i3;
                            break;
                        case 6:
                            m = kc2Var.m();
                            i2 = m + 1;
                            break;
                        case 7:
                            m = kc2Var.r();
                            i2 = m + 1;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i3 = i5 - 8;
                            i4 = 256;
                            i2 = i4 << i3;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    if (i2 != -1 && i2 <= cw0Var.b) {
                        int i9 = cw0Var.e;
                        if (i6 != 0) {
                            if (i6 > 11) {
                                if (i6 != 12) {
                                    if (i6 <= 14) {
                                        int r = kc2Var.r();
                                        if (i6 == 14) {
                                            r *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        int m2 = kc2Var.m();
                        int i10 = kc2Var.b;
                        byte[] bArr = kc2Var.a;
                        int i11 = i10 - 1;
                        int i12 = 0;
                        for (int i13 = kc2Var.b; i13 < i11; i13++) {
                            i12 = mc3.o[i12 ^ (bArr[i13] & 255)];
                        }
                        int i14 = mc3.a;
                        if (m2 == i12) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }
}
