package xsna;

import kotlin.KotlinNothingValueException;

/* compiled from: Constraints.kt */
@vby
/* loaded from: classes11.dex */
public final class o6j {
    public final long a;

    /* compiled from: Constraints.kt */
    public static final class a {
        public static long a(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i3, 262142);
            int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        s6j.l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return s6j.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
        }

        public static long b(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i, 262142);
            int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        s6j.l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return s6j.a(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }
    }

    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            wzw.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return s6j.h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, long j, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = h(j);
        }
        return a(i, i2, i3, i4);
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final boolean d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << rqi.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean f(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int a2 = (1 << rqi.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & a2;
        int i3 = ((int) (j >> 33)) & a2;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    public static final int h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int a2 = i2 & ((1 << rqi.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (a2 == 0) {
            return Integer.MAX_VALUE;
        }
        return a2 - 1;
    }

    public static final int j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << rqi.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public static String l(long j) {
        int i = i(j);
        String valueOf = i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i);
        int h = h(j);
        String valueOf2 = h != Integer.MAX_VALUE ? String.valueOf(h) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(k(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(j(j));
        sb.append(", maxHeight = ");
        return ho8.a(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o6j) {
            return this.a == ((o6j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return l(this.a);
    }
}
