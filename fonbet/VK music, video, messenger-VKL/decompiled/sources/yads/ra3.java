package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public abstract class ra3 {
    public static long a(int i, int i2, kc2 kc2Var) {
        kc2Var.e(i);
        if (kc2Var.c - kc2Var.b < 5) {
            return C.TIME_UNSET;
        }
        int b = kc2Var.b();
        if ((8388608 & b) != 0 || ((2096896 & b) >> 8) != i2 || (b & 32) == 0 || kc2Var.m() < 7 || kc2Var.c - kc2Var.b < 7 || (kc2Var.m() & 16) != 16) {
            return C.TIME_UNSET;
        }
        kc2Var.a(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }
}
