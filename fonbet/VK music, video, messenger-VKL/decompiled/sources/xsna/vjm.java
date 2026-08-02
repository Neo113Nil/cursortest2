package xsna;

import kotlin.Pair;

/* compiled from: DialogSortId.kt */
/* loaded from: classes2.dex */
public final class vjm implements Comparable<vjm> {
    public static final Pair<Integer, Integer> d;
    public static final int e;
    public static final Pair<Integer, Integer> f;
    public static final Pair<Integer, Integer> g;
    public static final Pair<Integer, Integer> h;
    public static final int i;
    public static final Pair<Integer, Integer> j;
    public static final long k;
    public static final vjm l;
    public static final vjm m;
    public final int b;
    public final int c;

    static {
        Pair<Integer, Integer> pair = new Pair<>(32, 41);
        d = pair;
        int intValue = (1 << ((pair.j().intValue() - pair.i().intValue()) + 1)) - 1;
        e = intValue;
        f = new Pair<>(34, 34);
        g = new Pair<>(32, 32);
        h = new Pair<>(0, 30);
        i = Integer.MAX_VALUE;
        Pair<Integer, Integer> pair2 = new Pair<>(36, 38);
        j = pair2;
        pair2.j().intValue();
        pair2.i().intValue();
        k = m4s.q(pair2.i().intValue(), pair2.j().intValue());
        l = new vjm(0, 0);
        m = new vjm(intValue, Integer.MAX_VALUE);
    }

    public vjm(int i2, int i3) {
        this.b = i2;
        this.c = i3;
        int i4 = e;
        if (i2 < 0 || i2 > i4) {
            throw new IllegalArgumentException("Illegal major id value: " + i2 + ". Available range: [0," + i4 + ']');
        }
        int i5 = i;
        if (i3 < 0 || i3 > i5) {
            throw new IllegalArgumentException("Illegal minor id value: " + i3 + ". Available range: [0," + i5 + ']');
        }
    }

    public static vjm e(vjm vjmVar, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = vjmVar.b;
        }
        if ((i4 & 2) != 0) {
            i3 = vjmVar.c;
        }
        vjmVar.getClass();
        return new vjm(i2, i3);
    }

    public final long a() {
        return xo9.x(xo9.x(0L, d, this.b), h, this.c);
    }

    public final vjm b(boolean z) {
        return new vjm(xo9.x(a(), g, z ? 1L : 0L));
    }

    public final vjm c(boolean z) {
        return new vjm(xo9.x(a(), f, z ? 1L : 0L));
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vjm vjmVar) {
        return epx.h(a(), vjmVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjm)) {
            return false;
        }
        vjm vjmVar = (vjm) obj;
        return this.b == vjmVar.b && this.c == vjmVar.c;
    }

    public final int h() {
        return (int) xo9.j(a(), j);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final boolean i() {
        return xo9.j(a(), j) > 0;
    }

    public final vjm j(int i2) {
        return new vjm(xo9.x(a(), j, i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogSortId(majorId=");
        sb.append(this.b);
        sb.append(", minorId=");
        return vu5.b(sb, this.c, ')');
    }

    public vjm(long j2) {
        this((int) xo9.j(j2, d), (int) xo9.j(j2, h));
    }
}
