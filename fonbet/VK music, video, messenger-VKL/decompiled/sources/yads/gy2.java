package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class gy2 extends ly2 {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public gy2(qm2 qm2Var, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(qm2Var, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public abstract long a(long j);

    public final long a(long j, long j2) {
        if (a(j) == -1) {
            long j3 = this.g;
            if (j3 != C.TIME_UNSET) {
                return Math.max(this.d, c((j2 - this.h) - j3, j));
            }
        }
        return this.d;
    }

    public abstract qm2 a(long j, mp2 mp2Var);

    public final long b(long j, long j2) {
        List list = this.f;
        if (list != null) {
            return (((jy2) list.get((int) (j - this.d))).b * 1000000) / this.b;
        }
        long a = a(j2);
        return (a == -1 || j != (this.d + a) - 1) ? (this.e * 1000000) / this.b : j2 - b(j);
    }

    public final long c(long j, long j2) {
        long j3 = this.d;
        long a = a(j2);
        if (a != 0) {
            if (this.f != null) {
                long j4 = (a + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    long j6 = ((j4 - j5) / 2) + j5;
                    long b = b(j6);
                    if (b < j) {
                        j5 = j6 + 1;
                    } else {
                        if (b <= j) {
                            return j6;
                        }
                        j4 = j6 - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            long j7 = (j / ((this.e * 1000000) / this.b)) + this.d;
            if (j7 >= j3) {
                return a == -1 ? j7 : Math.min(j7, (j3 + a) - 1);
            }
        }
        return j3;
    }

    public final long b(long j) {
        long j2;
        List list = this.f;
        if (list != null) {
            j2 = ((jy2) list.get((int) (j - this.d))).a - this.c;
        } else {
            j2 = (j - this.d) * this.e;
        }
        return mc3.a(j2, 1000000L, this.b);
    }

    public boolean b() {
        return this.f != null;
    }
}
