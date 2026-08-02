package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: CeaUtil.java */
/* loaded from: classes12.dex */
public final class yla {
    public static void a(long j, xi90 xi90Var, rgp0[] rgp0VarArr) {
        int i;
        while (true) {
            if (xi90Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (xi90Var.a() == 0) {
                    i = -1;
                    break;
                }
                int C = xi90Var.C();
                i2 += C;
                if (C != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (xi90Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int C2 = xi90Var.C();
                i3 += C2;
                if (C2 != 255) {
                    break;
                }
            }
            int i4 = xi90Var.b + i3;
            if (i3 == -1 || i3 > xi90Var.a()) {
                ahn.F("Skipping remainder of malformed SEI NAL unit.");
                i4 = xi90Var.c;
            } else if (i == 4 && i3 >= 8) {
                int C3 = xi90Var.C();
                int J = xi90Var.J();
                int p = J == 49 ? xi90Var.p() : 0;
                int C4 = xi90Var.C();
                if (J == 47) {
                    xi90Var.Q(1);
                }
                boolean z = C3 == 181 && (J == 49 || J == 47) && C4 == 3;
                if (J == 49) {
                    z &= p == 1195456820;
                }
                if (z) {
                    b(j, xi90Var, rgp0VarArr);
                }
            }
            xi90Var.P(i4);
        }
    }

    public static void b(long j, xi90 xi90Var, rgp0[] rgp0VarArr) {
        int C = xi90Var.C();
        if ((C & 64) != 0) {
            xi90Var.Q(1);
            int i = (C & 31) * 3;
            int i2 = xi90Var.b;
            for (rgp0 rgp0Var : rgp0VarArr) {
                xi90Var.P(i2);
                rgp0Var.d(i, xi90Var);
                fxc0.z(j != C.TIME_UNSET);
                rgp0Var.a(j, 1, i, 0, null);
            }
        }
    }
}
