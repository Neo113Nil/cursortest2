package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import com.ybsdk.widgets.common.MoneyInputEditView;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class e3n implements Comparable {
    public static final o430 b = new o430(23);
    public static final long c = kp50.m(4611686018427387903L);
    public static final long w = kp50.m(-4611686018427387903L);
    public static final long x = 9223372036854759646L;
    public final long a;

    public /* synthetic */ e3n(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long d = kp50.d(j, j3);
        if (-4611686018426L > d || d >= 4611686018427L) {
            return kp50.m(d);
        }
        return kp50.o((d * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String N = evu0.N(MoneyInputEditView.DEFAULT_VALUE, i3, String.valueOf(i2));
            int i4 = -1;
            int length = N.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (N.charAt(length) != '0') {
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
                sb.append((CharSequence) N, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) N, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return jl40.r(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || i(j)) ? o(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) (o(j, DurationUnit.MINUTES) % 60);
    }

    public static final int g(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % MathMethodsKt.NANOS_PER_SECOND);
    }

    public static final int h(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) (o(j, DurationUnit.SECONDS) % 60);
    }

    public static final boolean i(long j) {
        return j == c || j == w;
    }

    public static final boolean j(long j) {
        return j > 0;
    }

    public static final long k(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? kp50.m(j3 / 1000000) : kp50.o(j3);
        }
        long d = kp50.d(j >> 1, j2 >> 1);
        if (d != 9223372036854759646L) {
            return (d == 4611686018427387903L || d == -4611686018427387903L) ? kp50.m(d) : kp50.n(d);
        }
        ny61.g("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if ((java.lang.Integer.signum(r2) * java.lang.Long.signum(r7)) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        return defpackage.e3n.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        return defpackage.e3n.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        if ((java.lang.Integer.signum(r2) * java.lang.Long.signum(r7)) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long l(double d, long j) {
        int a = m810.a(d);
        if (a != d) {
            DurationUnit durationUnit = (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
            return kp50.T(m(j, durationUnit) * d, durationUnit);
        }
        if (i(j)) {
            if (a != 0) {
                return a > 0 ? j : q(j);
            }
            ny61.g("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (a == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = a;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return kp50.o(j4);
            }
            if (j4 / j3 == j2) {
                return (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) ? kp50.m(j4 / 1000000) : kp50.o(j4);
            }
            long j5 = j2 / 1000000;
            long j6 = j5 * j3;
            long j7 = (((j2 - (j5 * 1000000)) * j3) / 1000000) + j6;
            if (j6 / j3 == j5 && (j7 ^ j6) >= 0) {
                return kp50.m(y6i0.g(j7, new imz(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return kp50.m(y6i0.g(j4, new imz(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    public static final double m(long j, DurationUnit durationUnit) {
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == w) {
            return Double.NEGATIVE_INFINITY;
        }
        return y3n.a(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, durationUnit);
    }

    public static final int n(long j, DurationUnit durationUnit) {
        return (int) y6i0.f(o(j, durationUnit), -2147483648L, 2147483647L);
    }

    public static final long o(long j, DurationUnit durationUnit) {
        if (j == c) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        if (j == w) {
            return Long.MIN_VALUE;
        }
        return durationUnit.getTimeUnit().convert(j >> 1, ((((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS).getTimeUnit());
    }

    public static String p(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == w) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(LicenseUtility.SEPARATOR);
        }
        if (j < 0) {
            j = q(j);
        }
        long o = o(j, DurationUnit.DAYS);
        int o2 = i(j) ? 0 : (int) (o(j, DurationUnit.HOURS) % 24);
        int f = f(j);
        int h = h(j);
        int g = g(j);
        boolean z2 = o != 0;
        boolean z3 = o2 != 0;
        boolean z4 = f != 0;
        boolean z5 = (h == 0 && g == 0) ? false : true;
        if (z2) {
            sb.append(o);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(HexString.CHAR_SPACE);
            }
            sb.append(o2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(HexString.CHAR_SPACE);
            }
            sb.append(f);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(HexString.CHAR_SPACE);
            }
            if (h != 0 || z2 || z3 || z4) {
                b(sb, h, g, 9, "s", false);
            } else if (g >= 1000000) {
                b(sb, g / 1000000, g % 1000000, 6, "ms", false);
            } else if (g >= 1000) {
                b(sb, g / 1000, g % 1000, 3, "us", false);
            } else {
                sb.append(g);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long q(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = s3n.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((e3n) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e3n) {
            return this.a == ((e3n) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return p(this.a);
    }
}
