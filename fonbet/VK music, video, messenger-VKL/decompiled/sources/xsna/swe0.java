package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import xsna.q500;

/* compiled from: _Ranges.kt */
/* loaded from: classes11.dex */
public class swe0 extends a0a {
    public static <T extends Comparable<? super T>> T c(T t, T t2) {
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static float d(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static double e(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException(ojp0.a(lby.a("Cannot coerce value to an empty range: maximum ", d3, " is less than minimum "), d2, JwtParser.SEPARATOR_CHAR));
    }

    public static float f(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + JwtParser.SEPARATOR_CHAR);
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + JwtParser.SEPARATOR_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(int i, k9x k9xVar) {
        int i2 = k9xVar.c;
        int i3 = k9xVar.b;
        if (k9xVar instanceof bwf) {
            return ((Number) k(Integer.valueOf(i), (bwf) k9xVar)).intValue();
        }
        if (!k9xVar.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + k9xVar + JwtParser.SEPARATOR_CHAR);
    }

    public static long i(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(vu5.a(JwtParser.SEPARATOR_CHAR, j2, fp.b(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long j(long j, q500 q500Var) {
        if (q500Var instanceof bwf) {
            return ((Number) k(Long.valueOf(j), (bwf) q500Var)).longValue();
        }
        if (!q500Var.isEmpty()) {
            return j < ((Number) q500Var.getStart()).longValue() ? ((Number) q500Var.getStart()).longValue() : j > ((Number) q500Var.c()).longValue() ? ((Number) q500Var.c()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + q500Var + JwtParser.SEPARATOR_CHAR);
    }

    public static <T extends Comparable<? super T>> T k(T t, bwf<T> bwfVar) {
        if (!bwfVar.isEmpty()) {
            return (!bwfVar.a(t, bwfVar.getStart()) || bwfVar.a(bwfVar.getStart(), t)) ? (!bwfVar.a(bwfVar.c(), t) || bwfVar.a(t, bwfVar.c())) ? t : bwfVar.c() : bwfVar.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bwfVar + JwtParser.SEPARATOR_CHAR);
    }

    public static Comparable l(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + JwtParser.SEPARATOR_CHAR);
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    public static i9x m(int i, int i2) {
        return new i9x(i, i2, -1);
    }

    public static int n(k9x k9xVar, Random random) {
        try {
            int i = k9xVar.b;
            if (!k9xVar.isEmpty()) {
                int i2 = k9xVar.c;
                return i2 < Integer.MAX_VALUE ? random.l(i, i2 + 1) : i > Integer.MIN_VALUE ? random.l(i - 1, i2) + 1 : random.j();
            }
            throw new IllegalArgumentException("Cannot get random in empty range: " + k9xVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static i9x o(k9x k9xVar) {
        return new i9x(k9xVar.c, k9xVar.b, -k9xVar.d);
    }

    public static i9x p(int i, k9x k9xVar) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + JwtParser.SEPARATOR_CHAR);
        }
        int i2 = k9xVar.b;
        int i3 = k9xVar.c;
        if (k9xVar.d <= 0) {
            i = -i;
        }
        return new i9x(i2, i3, i);
    }

    public static k9x q(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new k9x(i, i2 - 1, 1);
        }
        k9x k9xVar = k9x.e;
        return k9x.e;
    }

    public static q500 r(long j, long j2) {
        if (j2 > Long.MIN_VALUE) {
            return new q500(j, j2 - 1);
        }
        q500 q500Var = q500.e;
        return q500.a.a();
    }
}
