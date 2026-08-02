package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class zl2 implements sp {
    public final c83 a;
    public final kc2 b = new kc2();

    public zl2(c83 c83Var) {
        this.a = c83Var;
    }

    @Override // yads.sp
    public final void a() {
        this.b.a(mc3.f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j) {
        int a;
        long j2 = ld0Var.d;
        int min = (int) Math.min(20000L, ld0Var.c - j2);
        this.b.c(min);
        ld0Var.b(this.b.a, 0, min, false);
        kc2 kc2Var = this.b;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (true) {
            int i3 = kc2Var.c;
            int i4 = kc2Var.b;
            if (i3 - i4 < 4) {
                return j3 != C.TIME_UNSET ? new rp(-2, j3, j2 + i) : rp.d;
            }
            if (am2.a(i4, kc2Var.a) != 442) {
                kc2Var.e(kc2Var.b + 1);
            } else {
                kc2Var.e(kc2Var.b + 4);
                long a2 = bm2.a(kc2Var);
                if (a2 != C.TIME_UNSET) {
                    long b = this.a.b(a2);
                    if (b > j) {
                        return j3 == C.TIME_UNSET ? new rp(-1, b, j2) : new rp(0, C.TIME_UNSET, j2 + i2);
                    }
                    if (b + 100000 > j) {
                        return new rp(0, C.TIME_UNSET, j2 + kc2Var.b);
                    }
                    j3 = b;
                    i2 = kc2Var.b;
                }
                int i5 = kc2Var.c;
                int i6 = kc2Var.b;
                if (i5 - i6 >= 10) {
                    kc2Var.e(i6 + 9);
                    int m = kc2Var.m() & 7;
                    int i7 = kc2Var.c;
                    int i8 = kc2Var.b;
                    if (i7 - i8 >= m) {
                        kc2Var.e(i8 + m);
                        int i9 = kc2Var.c;
                        int i10 = kc2Var.b;
                        if (i9 - i10 >= 4) {
                            if (am2.a(i10, kc2Var.a) == 443) {
                                kc2Var.e(kc2Var.b + 4);
                                int r = kc2Var.r();
                                int i11 = kc2Var.c;
                                int i12 = kc2Var.b;
                                if (i11 - i12 < r) {
                                    kc2Var.e(i5);
                                } else {
                                    kc2Var.e(i12 + r);
                                }
                            }
                            while (true) {
                                int i13 = kc2Var.c;
                                int i14 = kc2Var.b;
                                if (i13 - i14 < 4 || (a = am2.a(i14, kc2Var.a)) == 442 || a == 441 || (a >>> 8) != 1) {
                                    break;
                                }
                                kc2Var.e(kc2Var.b + 4);
                                if (kc2Var.c - kc2Var.b < 2) {
                                    kc2Var.e(i5);
                                    break;
                                }
                                kc2Var.e(Math.min(kc2Var.c, kc2Var.b + kc2Var.r()));
                            }
                        } else {
                            kc2Var.e(i5);
                        }
                    } else {
                        kc2Var.e(i5);
                    }
                } else {
                    kc2Var.e(i5);
                }
                i = kc2Var.b;
            }
        }
    }
}
