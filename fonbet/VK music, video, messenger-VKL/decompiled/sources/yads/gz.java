package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public class gz implements zx2 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public gz(int i, int i2, long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = C.TIME_UNSET;
        } else {
            this.d = j - j2;
            this.f = a(i, j, j2);
        }
    }

    public static long a(int i, long j, long j2) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        long j2 = this.d;
        if (j2 == -1 && !this.g) {
            by2 by2Var = new by2(0L, this.b);
            return new xx2(by2Var, by2Var);
        }
        long j3 = this.c;
        long j4 = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = Math.max(j4, 0L);
        long j5 = this.b;
        long j6 = max + j5;
        long a = a(this.e, j6, j5);
        by2 by2Var2 = new by2(a, j6);
        if (this.d != -1 && a < j) {
            long j7 = j6 + this.c;
            if (j7 < this.a) {
                return new xx2(by2Var2, new by2(a(this.e, j7, this.b), j7));
            }
        }
        return new xx2(by2Var2, by2Var2);
    }

    @Override // yads.zx2
    public final long c() {
        return this.f;
    }

    @Override // yads.zx2
    public final boolean b() {
        return this.d != -1 || this.g;
    }
}
