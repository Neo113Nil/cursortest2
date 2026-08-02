package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class ga3 implements sp {
    public final c83 a;
    public final kc2 b = new kc2();
    public final int c;
    public final int d;

    public ga3(int i, c83 c83Var, int i2) {
        this.c = i;
        this.a = c83Var;
        this.d = i2;
    }

    @Override // yads.sp
    public final void a() {
        this.b.a(mc3.f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j) {
        long j2;
        long j3 = ld0Var.d;
        int min = (int) Math.min(this.d, ld0Var.c - j3);
        this.b.c(min);
        ld0Var.b(this.b.a, 0, min, false);
        kc2 kc2Var = this.b;
        int i = kc2Var.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = C.TIME_UNSET;
        while (true) {
            int i2 = kc2Var.c;
            int i3 = kc2Var.b;
            if (i2 - i3 < 188) {
                j2 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = kc2Var.a;
            while (true) {
                if (i3 >= i) {
                    j2 = C.TIME_UNSET;
                    break;
                }
                byte b = bArr[i3];
                j2 = C.TIME_UNSET;
                if (b == 71) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i) {
                break;
            }
            long a = ra3.a(i3, this.c, kc2Var);
            if (a != j2) {
                long b2 = this.a.b(a);
                if (b2 > j) {
                    return j6 == j2 ? new rp(-1, b2, j3) : new rp(0, C.TIME_UNSET, j3 + j5);
                }
                if (100000 + b2 > j) {
                    return new rp(0, C.TIME_UNSET, j3 + i3);
                }
                j6 = b2;
                j5 = i3;
            }
            kc2Var.e(i4);
            j4 = i4;
        }
        return j6 != j2 ? new rp(-2, j6, j3 + j4) : rp.d;
    }
}
