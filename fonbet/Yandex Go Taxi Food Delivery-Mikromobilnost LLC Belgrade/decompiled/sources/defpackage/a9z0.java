package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public abstract class a9z0 {
    public static final x8z0 a = new x8z0();

    static {
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, y8z0 y8z0Var, z8z0 z8z0Var, int i2, boolean z) {
        int i3 = g(i, y8z0Var, false).c;
        if (n(i3, z8z0Var, 0L).n != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, z8z0Var, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        ny61.k();
        return 0;
    }

    public boolean equals(Object obj) {
        int c;
        if (this != obj) {
            if (obj instanceof a9z0) {
                a9z0 a9z0Var = (a9z0) obj;
                if (a9z0Var.p() == p() && a9z0Var.i() == i()) {
                    z8z0 z8z0Var = new z8z0();
                    y8z0 y8z0Var = new y8z0();
                    z8z0 z8z0Var2 = new z8z0();
                    y8z0 y8z0Var2 = new y8z0();
                    int i = 0;
                    while (true) {
                        if (i >= p()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= i()) {
                                    int a2 = a(true);
                                    if (a2 == a9z0Var.a(true) && (c = c(true)) == a9z0Var.c(true)) {
                                        while (a2 != c) {
                                            int e = e(a2, 0, true);
                                            if (e == a9z0Var.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!g(i2, y8z0Var, true).equals(a9z0Var.g(i2, y8z0Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!n(i, z8z0Var, 0L).equals(a9z0Var.n(i, z8z0Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final y8z0 f(int i, y8z0 y8z0Var) {
        return g(i, y8z0Var, false);
    }

    public abstract y8z0 g(int i, y8z0 y8z0Var, boolean z);

    public y8z0 h(Object obj, y8z0 y8z0Var) {
        return g(b(obj), y8z0Var, true);
    }

    public int hashCode() {
        z8z0 z8z0Var = new z8z0();
        y8z0 y8z0Var = new y8z0();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, z8z0Var, 0L).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, y8z0Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(z8z0 z8z0Var, y8z0 y8z0Var, int i, long j) {
        Pair k = k(z8z0Var, y8z0Var, i, j, 0L);
        k.getClass();
        return k;
    }

    public final Pair k(z8z0 z8z0Var, y8z0 y8z0Var, int i, long j, long j2) {
        d6z.s(i, p());
        n(i, z8z0Var, j2);
        if (j == -9223372036854775807L) {
            j = z8z0Var.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = z8z0Var.m;
        g(i2, y8z0Var, false);
        while (i2 < z8z0Var.n && y8z0Var.e != j) {
            int i3 = i2 + 1;
            if (g(i3, y8z0Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, y8z0Var, true);
        long j3 = j - y8z0Var.e;
        long j4 = y8z0Var.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = y8z0Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        ny61.k();
        return 0;
    }

    public abstract Object m(int i);

    public abstract z8z0 n(int i, z8z0 z8z0Var, long j);

    public final z8z0 o(z8z0 z8z0Var, int i) {
        return n(i, z8z0Var, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
