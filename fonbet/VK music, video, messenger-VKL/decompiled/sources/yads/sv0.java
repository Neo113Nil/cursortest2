package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class sv0 implements sp {
    public final cw0 a;
    public final int b;
    public final vv0 c = new vv0();

    public sv0(int i, cw0 cw0Var) {
        this.a = cw0Var;
        this.b = i;
    }

    public final long a(ld0 ld0Var) {
        long j;
        while (true) {
            long j2 = ld0Var.d + ld0Var.f;
            long j3 = 6;
            if (j2 >= ld0Var.c - 6) {
                j = 6;
                break;
            }
            cw0 cw0Var = this.a;
            int i = this.b;
            vv0 vv0Var = this.c;
            byte[] bArr = new byte[2];
            ld0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                kc2 kc2Var = new kc2(16);
                System.arraycopy(bArr, 0, kc2Var.a, 0, 2);
                byte[] bArr2 = kc2Var.a;
                int i2 = 0;
                while (true) {
                    if (i2 >= 14) {
                        j = j3;
                        break;
                    }
                    j = j3;
                    int b = ld0Var.b(bArr2, 2 + i2, 14 - i2);
                    if (b == -1) {
                        break;
                    }
                    i2 += b;
                    j3 = j;
                }
                kc2Var.d(i2);
                ld0Var.f = 0;
                ld0Var.a(false, (int) (j2 - ld0Var.d));
                if (wv0.a(kc2Var, cw0Var, i, vv0Var)) {
                    break;
                }
            } else {
                ld0Var.f = 0;
                ld0Var.a(false, (int) (j2 - ld0Var.d));
            }
            ld0Var.a(false, 1);
        }
        long j4 = ld0Var.d + ld0Var.f;
        long j5 = ld0Var.c;
        if (j4 < j5 - j) {
            return this.c.a;
        }
        ld0Var.a(false, (int) (j5 - j4));
        return this.a.j;
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j) {
        long j2 = ld0Var.d;
        long a = a(ld0Var);
        long j3 = ld0Var.d + ld0Var.f;
        ld0Var.a(false, Math.max(6, this.a.c));
        long a2 = a(ld0Var);
        long j4 = ld0Var.d + ld0Var.f;
        if (a <= j && a2 > j) {
            return new rp(0, C.TIME_UNSET, j3);
        }
        if (a2 <= j) {
            return new rp(-2, a2, j4);
        }
        return new rp(-1, a, j2);
    }
}
