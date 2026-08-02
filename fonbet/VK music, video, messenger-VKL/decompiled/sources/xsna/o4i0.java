package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import xsna.e7g0;

/* compiled from: SegmentBase.java */
/* loaded from: classes12.dex */
public abstract class o4i0 {

    @Nullable
    public final rwe0 a;
    public final long b;
    public final long c;

    /* compiled from: SegmentBase.java */
    public static abstract class a extends o4i0 {
        public final long d;
        public final long e;

        @Nullable
        public final List<d> f;
        public final long g;
        public final long h;
        public final long i;

        public a(@Nullable rwe0 rwe0Var, long j, long j2, long j3, long j4, @Nullable List<d> list, long j5, long j6, long j7) {
            super(rwe0Var, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
            this.i = j5;
            this.g = j6;
            this.h = j7;
        }

        public final long b(long j, long j2) {
            long d = d(j);
            return d != -1 ? d : (int) (f((j2 - this.h) + this.i, j) - c(j, j2));
        }

        public final long c(long j, long j2) {
            long d = d(j);
            long j3 = this.d;
            if (d == -1) {
                long j4 = this.g;
                if (j4 != C.TIME_UNSET) {
                    return Math.max(j3, f((j2 - this.h) - j4, j));
                }
            }
            return j3;
        }

        public abstract long d(long j);

        public final long e(long j, long j2) {
            long j3 = this.b;
            long j4 = this.d;
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - j4)).b * 1000000) / j3;
            }
            long d = d(j2);
            return (d == -1 || j != (j4 + d) - 1) ? (this.e * 1000000) / j3 : j2 - g(j);
        }

        public final long f(long j, long j2) {
            long d = d(j2);
            long j3 = this.d;
            if (d != 0) {
                if (this.f != null) {
                    long j4 = (d + j3) - 1;
                    long j5 = j3;
                    while (j5 <= j4) {
                        long j6 = ((j4 - j5) / 2) + j5;
                        long g = g(j6);
                        if (g < j) {
                            j5 = j6 + 1;
                        } else {
                            if (g <= j) {
                                return j6;
                            }
                            j4 = j6 - 1;
                        }
                    }
                    return j5 == j3 ? j5 : j4;
                }
                long j7 = (j / ((this.e * 1000000) / this.b)) + j3;
                if (j7 >= j3) {
                    return d == -1 ? j7 : Math.min(j7, (j3 + d) - 1);
                }
            }
            return j3;
        }

        public final long g(long j) {
            long j2 = this.d;
            List<d> list = this.f;
            long j3 = list != null ? list.get((int) (j - j2)).a - this.c : (j - j2) * this.e;
            String str = y2r0.a;
            return y2r0.d0(j3, 1000000L, this.b, RoundingMode.DOWN);
        }

        public abstract rwe0 h(e7g0.a aVar, long j);

        public boolean i() {
            return this.f != null;
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class b extends a {

        @Nullable
        public final List<rwe0> j;

        public b(rwe0 rwe0Var, long j, long j2, long j3, long j4, @Nullable List<d> list, long j5, @Nullable List<rwe0> list2, long j6, long j7) {
            super(rwe0Var, j, j2, j3, j4, list, j5, j6, j7);
            this.j = list2;
        }

        @Override // xsna.o4i0.a
        public final long d(long j) {
            return this.j.size();
        }

        @Override // xsna.o4i0.a
        public final rwe0 h(e7g0.a aVar, long j) {
            return this.j.get((int) (j - this.d));
        }

        @Override // xsna.o4i0.a
        public final boolean i() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class c extends a {

        @Nullable
        public final k05 j;

        @Nullable
        public final k05 k;
        public final long l;

        public c(rwe0 rwe0Var, long j, long j2, long j3, long j4, long j5, @Nullable List<d> list, long j6, @Nullable k05 k05Var, @Nullable k05 k05Var2, long j7, long j8) {
            super(rwe0Var, j, j2, j3, j5, list, j6, j7, j8);
            this.j = k05Var;
            this.k = k05Var2;
            this.l = j4;
        }

        @Override // xsna.o4i0
        @Nullable
        public final rwe0 a(e7g0 e7g0Var) {
            k05 k05Var = this.j;
            if (k05Var == null) {
                return this.a;
            }
            androidx.media3.common.a aVar = e7g0Var.b;
            return new rwe0(k05Var.c(0L, 0L, aVar.j, aVar.a), 0L, -1L);
        }

        @Override // xsna.o4i0.a
        public final long d(long j) {
            if (this.f != null) {
                return r0.size();
            }
            long j2 = this.l;
            if (j2 != -1) {
                return (j2 - this.d) + 1;
            }
            if (j == C.TIME_UNSET) {
                return -1L;
            }
            BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
            BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i = yy6.a;
            return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // xsna.o4i0.a
        public final rwe0 h(e7g0.a aVar, long j) {
            long j2 = this.d;
            List<d> list = this.f;
            long j3 = list != null ? list.get((int) (j - j2)).a : (j - j2) * this.e;
            androidx.media3.common.a aVar2 = aVar.b;
            return new rwe0(this.k.c(j, j3, aVar2.j, aVar2.a), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == dVar.a && this.b == dVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public o4i0(@Nullable rwe0 rwe0Var, long j, long j2) {
        this.a = rwe0Var;
        this.b = j;
        this.c = j2;
    }

    @Nullable
    public rwe0 a(e7g0 e7g0Var) {
        return this.a;
    }

    /* compiled from: SegmentBase.java */
    public static class e extends o4i0 {
        public final long d;
        public final long e;

        public e(@Nullable rwe0 rwe0Var, long j, long j2, long j3, long j4) {
            super(rwe0Var, j, j2);
            this.d = j3;
            this.e = j4;
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
