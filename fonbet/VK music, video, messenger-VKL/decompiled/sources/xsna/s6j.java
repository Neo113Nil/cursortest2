package xsna;

/* compiled from: Constraints.kt */
/* loaded from: classes11.dex */
public final class s6j {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            wzw.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int k = o6j.k(j);
        int i2 = o6j.i(j);
        if (i < k) {
            i = k;
        }
        if (i <= i2) {
            i2 = i;
        }
        int i3 = (int) (j2 & 4294967295L);
        int j3 = o6j.j(j);
        int h = o6j.h(j);
        if (i3 < j3) {
            i3 = j3;
        }
        if (i3 <= h) {
            h = i3;
        }
        return (i2 << 32) | (h & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int k = o6j.k(j);
        int i = o6j.i(j);
        int j3 = o6j.j(j);
        int h = o6j.h(j);
        int k2 = o6j.k(j2);
        if (k2 < k) {
            k2 = k;
        }
        if (k2 > i) {
            k2 = i;
        }
        int i2 = o6j.i(j2);
        if (i2 >= k) {
            k = i2;
        }
        if (k <= i) {
            i = k;
        }
        int j4 = o6j.j(j2);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j4 > h) {
            j4 = h;
        }
        int h2 = o6j.h(j2);
        if (h2 >= j3) {
            j3 = h2;
        }
        if (j3 <= h) {
            h = j3;
        }
        return a(k2, i, j4, h);
    }

    public static final int f(int i, long j) {
        int j2 = o6j.j(j);
        int h = o6j.h(j);
        if (i < j2) {
            i = j2;
        }
        return i > h ? h : i;
    }

    public static final int g(int i, long j) {
        int k = o6j.k(j);
        int i2 = o6j.i(j);
        if (i < k) {
            i = k;
        }
        return i > i2 ? i2 : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int c = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int c2 = c(i6);
        if (c + c2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final long i(int i, int i2, long j) {
        int k = o6j.k(j) + i;
        if (k < 0) {
            k = 0;
        }
        int i3 = o6j.i(j);
        if (i3 != Integer.MAX_VALUE && (i3 = i3 + i) < 0) {
            i3 = 0;
        }
        int j2 = o6j.j(j) + i2;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = o6j.h(j);
        return a(k, i3, j2, (h == Integer.MAX_VALUE || (h = h + i2) >= 0) ? h : 0);
    }

    public static /* synthetic */ long j(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(i, i2, j);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException(sl9.c(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(tgw.b(i, "Can't represent a size of ", " in Constraints"));
    }
}
