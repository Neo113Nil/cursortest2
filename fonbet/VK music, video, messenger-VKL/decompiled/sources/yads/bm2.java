package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class bm2 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final c83 a = new c83(0);
    public long f = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public final kc2 b = new kc2();

    public static long a(kc2 kc2Var) {
        int i = kc2Var.b;
        if (kc2Var.c - i < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        kc2Var.a(bArr, 0, 9);
        kc2Var.e(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return C.TIME_UNSET;
    }
}
