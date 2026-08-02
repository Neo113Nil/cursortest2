package xsna;

import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import kotlin.time.DurationUnit;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: Duration.kt */
@vby
/* loaded from: classes11.dex */
public final class zno implements Comparable<zno> {
    public static final a c = new a();
    public static final long d = eoo.b(4611686018427387903L);
    public static final long e = eoo.b(-4611686018427387903L);
    public static final long f = 9223372036854759646L;
    public final long b;

    /* compiled from: Duration.kt */
    public static final class a {
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long a2 = eoo.a(j, j4);
        if (-4611686018426L > a2 || a2 >= 4611686018427L) {
            return eoo.b(a2);
        }
        return eoo.c((a2 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            String R = drm0.R(String.valueOf(i2), i3, ImageSizeKey.SIZE_KEY_UNDEFINED);
            int i4 = -1;
            int length = R.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (R.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) R, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) R, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return epx.h(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || g(j)) ? l(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (g(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean g(long j) {
        return j == d || j == e;
    }

    public static final long h(long j, long j2) {
        return i(j, n(j2));
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? eoo.b(j3 / 1000000) : eoo.c(j3);
        }
        long a2 = eoo.a(j >> 1, j2 >> 1);
        if (a2 != 9223372036854759646L) {
            return (a2 == 4611686018427387903L || a2 == -4611686018427387903L) ? eoo.b(a2) : (-4611686018426L > a2 || a2 >= 4611686018427L) ? eoo.b(swe0.i(a2, -4611686018427387903L, 4611686018427387903L)) : eoo.c(a2 * 1000000);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        return xsna.zno.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        return xsna.zno.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(int i, long j) {
        if (g(j)) {
            if (i != 0) {
                return i > 0 ? j : n(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return eoo.c(j4);
            }
            if (j4 / j3 == j2) {
                return (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) ? eoo.b(j4 / 1000000) : eoo.c(j4);
            }
            long j5 = 1000000;
            long j6 = j2 / j5;
            long j7 = j6 * j3;
            long j8 = (((j2 - (j6 * j5)) * j3) / j5) + j7;
            if (j7 / j3 == j6 && (j8 ^ j7) >= 0) {
                return eoo.b(swe0.j(j8, new q500(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return eoo.b(swe0.j(j4, new q500(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    public static final double k(long j, DurationUnit durationUnit) {
        if (j == d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == e) {
            return Double.NEGATIVE_INFINITY;
        }
        double d2 = j >> 1;
        long convert = durationUnit.h().convert(1L, ((((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS).h());
        return convert > 0 ? d2 * convert : d2 / r9.h().convert(1L, durationUnit.h());
    }

    public static final long l(long j, DurationUnit durationUnit) {
        if (j == d) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return durationUnit.h().convert(j >> 1, ((((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS).h());
    }

    public static String m(long j) {
        long j2;
        int l;
        if (j == 0) {
            return "0s";
        }
        if (j == d) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long n = j < 0 ? n(j) : j;
        long l2 = l(n, DurationUnit.DAYS);
        int l3 = g(n) ? 0 : (int) (l(n, DurationUnit.HOURS) % 24);
        if (g(n)) {
            j2 = 0;
            l = 0;
        } else {
            j2 = 0;
            l = (int) (l(n, DurationUnit.MINUTES) % 60);
        }
        int l4 = g(n) ? 0 : (int) (l(n, DurationUnit.SECONDS) % 60);
        int f2 = f(n);
        boolean z2 = l2 != j2;
        boolean z3 = l3 != 0;
        boolean z4 = l != 0;
        boolean z5 = (l4 == 0 && f2 == 0) ? false : true;
        if (z2) {
            sb.append(l2);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(l3);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(l);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (l4 != 0 || z2 || z3 || z4) {
                b(sb, l4, f2, 9, UcumUtils.UCUM_SECONDS, false);
            } else if (f2 >= 1000000) {
                b(sb, f2 / 1000000, f2 % 1000000, 6, UcumUtils.UCUM_MILLISECODS, false);
            } else if (f2 >= 1000) {
                b(sb, f2 / 1000, f2 % 1000, 3, UcumUtils.UCUM_MICROSECONDS, false);
            } else {
                sb.append(f2);
                sb.append(UcumUtils.UCUM_NANOSECONDS);
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long n(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = doo.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zno znoVar) {
        return c(this.b, znoVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zno) {
            return this.b == ((zno) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return m(this.b);
    }
}
