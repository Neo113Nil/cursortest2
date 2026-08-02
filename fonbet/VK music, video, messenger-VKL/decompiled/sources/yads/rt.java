package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public abstract class rt {
    public static void a(long j, kc2 kc2Var, q83[] q83VarArr) {
        int i;
        while (true) {
            if (kc2Var.c - kc2Var.b <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (kc2Var.c - kc2Var.b == 0) {
                    i = -1;
                    break;
                }
                int m = kc2Var.m();
                i2 += m;
                if (m != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (kc2Var.c - kc2Var.b == 0) {
                    i3 = -1;
                    break;
                }
                int m2 = kc2Var.m();
                i3 += m2;
                if (m2 != 255) {
                    break;
                }
            }
            int i4 = kc2Var.b;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > kc2Var.c - i4) {
                ji1.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = kc2Var.c;
            } else if (i == 4 && i3 >= 8) {
                int m3 = kc2Var.m();
                int r = kc2Var.r();
                int b = r == 49 ? kc2Var.b() : 0;
                int m4 = kc2Var.m();
                if (r == 47) {
                    kc2Var.e(kc2Var.b + 1);
                }
                boolean z = m3 == 181 && (r == 49 || r == 47) && m4 == 3;
                if (r == 49) {
                    z &= b == 1195456820;
                }
                if (z) {
                    b(j, kc2Var, q83VarArr);
                }
            }
            kc2Var.e(i5);
        }
    }

    public static void b(long j, kc2 kc2Var, q83[] q83VarArr) {
        long j2;
        int m = kc2Var.m();
        if ((m & 64) != 0) {
            kc2Var.e(kc2Var.b + 1);
            int i = (m & 31) * 3;
            int i2 = kc2Var.b;
            int length = q83VarArr.length;
            int i3 = 0;
            while (i3 < length) {
                q83 q83Var = q83VarArr[i3];
                kc2Var.e(i2);
                q83Var.a(i, kc2Var);
                if (j != C.TIME_UNSET) {
                    j2 = j;
                    q83Var.a(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i3++;
                j = j2;
            }
        }
    }
}
