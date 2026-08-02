package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.c;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class af10 {
    public final b32 c;
    public final a3x0 d;
    public final c e;
    public long f;
    public int g;
    public boolean h;
    public ye10 i;
    public ye10 j;
    public ye10 k;
    public ye10 l;
    public ye10 m;
    public int n;
    public Object o;
    public long p;
    public final y8z0 a = new y8z0();
    public final z8z0 b = new z8z0();
    public ArrayList q = new ArrayList();

    public af10(b32 b32Var, a3x0 a3x0Var, c cVar, pno pnoVar) {
        this.c = b32Var;
        this.d = a3x0Var;
        this.e = cVar;
    }

    public static sf10 o(a9z0 a9z0Var, Object obj, long j, long j2, z8z0 z8z0Var, y8z0 y8z0Var) {
        a9z0Var.h(obj, y8z0Var);
        a9z0Var.o(z8z0Var, y8z0Var.c);
        a9z0Var.b(obj);
        int i = y8z0Var.g.a;
        if (i != 0) {
            if (i == 1) {
                y8z0Var.f(0);
            }
            y8z0Var.g.getClass();
            y8z0Var.g(0);
        }
        a9z0Var.h(obj, y8z0Var);
        int c = y8z0Var.c(j);
        return c == -1 ? new sf10(obj, j2, y8z0Var.b(j)) : new sf10(obj, c, y8z0Var.e(c), j2, -1);
    }

    public final ye10 a() {
        ye10 ye10Var = this.i;
        if (ye10Var == null) {
            return null;
        }
        if (ye10Var == this.j) {
            this.j = ye10Var.m;
        }
        if (ye10Var == this.k) {
            this.k = ye10Var.m;
        }
        ye10Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            ye10 ye10Var2 = this.i;
            this.o = ye10Var2.b;
            this.p = ye10Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        ye10 ye10Var = this.i;
        d6z.z(ye10Var);
        this.o = ye10Var.b;
        this.p = ye10Var.g.a.d;
        while (ye10Var != null) {
            ye10Var.i();
            ye10Var = ye10Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    public final ze10 c(a9z0 a9z0Var, ye10 ye10Var, long j) {
        a9z0 a9z0Var2;
        y8z0 y8z0Var;
        Object obj;
        long j2;
        long j3;
        long j4;
        ze10 ze10Var = ye10Var.g;
        long j5 = (ye10Var.p + ze10Var.e) - j;
        if (!ze10Var.h) {
            sf10 sf10Var = ze10Var.a;
            Object obj2 = sf10Var.a;
            int i = sf10Var.e;
            y8z0 y8z0Var2 = this.a;
            a9z0Var.h(obj2, y8z0Var2);
            boolean z = ze10Var.g;
            if (!sf10Var.b()) {
                if (i != -1) {
                    y8z0Var2.f(i);
                }
                int e = y8z0Var2.e(i);
                y8z0Var2.g(i);
                if (e != y8z0Var2.g.a(i).a) {
                    return e(a9z0Var, sf10Var.a, sf10Var.e, e, ze10Var.e, sf10Var.d, z);
                }
                a9z0Var.h(obj2, y8z0Var2);
                y8z0Var2.d(i);
                y8z0Var2.g.a(i).getClass();
                return f(a9z0Var, sf10Var.a, 0L, ze10Var.e, sf10Var.d, false);
            }
            int i2 = sf10Var.b;
            int i3 = y8z0Var2.g.a(i2).a;
            if (i3 != -1) {
                int a = y8z0Var2.g.a(i2).a(sf10Var.c);
                if (a < i3) {
                    return e(a9z0Var, sf10Var.a, i2, a, ze10Var.c, sf10Var.d, z);
                }
                long j6 = ze10Var.c;
                if (j6 == -9223372036854775807L) {
                    a9z0Var2 = a9z0Var;
                    Pair k = a9z0Var2.k(this.b, y8z0Var2, y8z0Var2.c, -9223372036854775807L, Math.max(0L, j5));
                    if (k != null) {
                        j6 = ((Long) k.second).longValue();
                    }
                } else {
                    a9z0Var2 = a9z0Var;
                }
                int i4 = sf10Var.b;
                a9z0Var2.h(obj2, y8z0Var2);
                y8z0Var2.d(i4);
                y8z0Var2.g.a(i4).getClass();
                return f(a9z0Var2, sf10Var.a, Math.max(0L, j6), ze10Var.c, sf10Var.d, z);
            }
            return null;
        }
        ze10 ze10Var2 = ye10Var.g;
        sf10 sf10Var2 = ze10Var2.a;
        long j7 = ze10Var2.c;
        long j8 = 0;
        int d = a9z0Var.d(a9z0Var.b(sf10Var2.a), this.a, this.b, this.g, this.h);
        if (d == -1) {
            return null;
        }
        y8z0 y8z0Var3 = this.a;
        int i5 = a9z0Var.g(d, y8z0Var3, true).c;
        Object obj3 = y8z0Var3.b;
        obj3.getClass();
        long j9 = sf10Var2.d;
        if (a9z0Var.n(i5, this.b, 0L).m == d) {
            long max = Math.max(0L, j5);
            y8z0Var = y8z0Var3;
            Pair k2 = a9z0Var.k(this.b, this.a, i5, -9223372036854775807L, max);
            if (k2 == null) {
                return null;
            }
            Object obj4 = k2.first;
            j3 = ((Long) k2.second).longValue();
            ye10 ye10Var2 = ye10Var.m;
            if (ye10Var2 == null || !ye10Var2.b.equals(obj4)) {
                long q = q(obj4);
                if (q == -1) {
                    q = this.f;
                    this.f = 1 + q;
                }
                j4 = q;
            } else {
                j4 = ye10Var2.g.a.d;
            }
            j8 = -9223372036854775807L;
            obj = obj4;
            j2 = j4;
        } else {
            y8z0Var = y8z0Var3;
            obj = obj3;
            j2 = j9;
            j3 = 0;
        }
        sf10 o = o(a9z0Var, obj, j3, j2, this.b, this.a);
        if (j8 != -9223372036854775807L && j7 != -9223372036854775807L) {
            int i6 = a9z0Var.h(sf10Var2.a, y8z0Var).g.a;
            y8z0Var.g.getClass();
            if (i6 > 0) {
                y8z0Var.g(0);
            }
        }
        return d(a9z0Var, o, j8, j3);
    }

    public final ze10 d(a9z0 a9z0Var, sf10 sf10Var, long j, long j2) {
        a9z0Var.h(sf10Var.a, this.a);
        boolean b = sf10Var.b();
        Object obj = sf10Var.a;
        return b ? e(a9z0Var, obj, sf10Var.b, sf10Var.c, j, sf10Var.d, false) : f(a9z0Var, obj, j2, j, sf10Var.d, false);
    }

    public final ze10 e(a9z0 a9z0Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        sf10 sf10Var = new sf10(obj, i, i2, j2, -1);
        y8z0 y8z0Var = this.a;
        long a = a9z0Var.h(obj, y8z0Var).a(i, i2);
        if (i2 == y8z0Var.e(i)) {
            y8z0Var.g.getClass();
        }
        y8z0Var.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new ze10(sf10Var, j3, j, -9223372036854775807L, a, z, false, false, false, false);
    }

    public final ze10 f(a9z0 a9z0Var, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        y8z0 y8z0Var = this.a;
        a9z0Var.h(obj, y8z0Var);
        int b = y8z0Var.b(j);
        if (b != -1) {
            y8z0Var.f(b);
        }
        boolean z2 = false;
        if (b != -1) {
            y8z0Var.g(b);
        } else if (y8z0Var.g.a > 0) {
            y8z0Var.g(0);
        }
        sf10 sf10Var = new sf10(obj, j3, b);
        if (!sf10Var.b() && b == -1) {
            z2 = true;
        }
        boolean j5 = j(a9z0Var, sf10Var);
        boolean i = i(a9z0Var, sf10Var, z2);
        if (b != -1) {
            y8z0Var.g(b);
        }
        if (b != -1) {
            y8z0Var.d(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? y8z0Var.d : j4;
        return new ze10(sf10Var, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - 1), j2, j4, j6, z, false, z2, j5, i);
    }

    public final ye10 g() {
        return this.k;
    }

    public final ze10 h(a9z0 a9z0Var, ze10 ze10Var) {
        long j;
        sf10 sf10Var = ze10Var.a;
        boolean b = sf10Var.b();
        int i = sf10Var.e;
        boolean z = !b && i == -1;
        int i2 = sf10Var.b;
        boolean j2 = j(a9z0Var, sf10Var);
        boolean i3 = i(a9z0Var, sf10Var, z);
        Object obj = ze10Var.a.a;
        y8z0 y8z0Var = this.a;
        a9z0Var.h(obj, y8z0Var);
        if (sf10Var.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            y8z0Var.d(i);
            j = 0;
        }
        long a = sf10Var.b() ? y8z0Var.a(i2, sf10Var.c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? y8z0Var.d : j;
        if (sf10Var.b()) {
            y8z0Var.g(i2);
        } else if (i != -1) {
            y8z0Var.g(i);
        }
        return new ze10(sf10Var, ze10Var.b, ze10Var.c, j, a, ze10Var.f, false, z, j2, i3);
    }

    public final boolean i(a9z0 a9z0Var, sf10 sf10Var, boolean z) {
        int b = a9z0Var.b(sf10Var.a);
        if (!a9z0Var.n(a9z0Var.g(b, this.a, false).c, this.b, 0L).h) {
            if (a9z0Var.d(b, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(a9z0 a9z0Var, sf10 sf10Var) {
        boolean z = !sf10Var.b() && sf10Var.e == -1;
        Object obj = sf10Var.a;
        if (z) {
            if (a9z0Var.n(a9z0Var.h(obj, this.a).c, this.b, 0L).n == a9z0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        ye10 ye10Var = this.m;
        if (ye10Var == null || ye10Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                ye10 ye10Var2 = (ye10) this.q.get(i);
                if (!ye10Var2.h()) {
                    this.m = ye10Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (ye10 ye10Var = this.i; ye10Var != null; ye10Var = ye10Var.m) {
            aVar.a(ye10Var.g.a);
        }
        ye10 ye10Var2 = this.j;
        this.d.e(new p7h(28, this, aVar, ye10Var2 == null ? null : ye10Var2.g.a));
    }

    public final void m(long j) {
        ye10 ye10Var = this.l;
        if (ye10Var != null) {
            d6z.x(ye10Var.m == null);
            if (ye10Var.e) {
                ye10Var.a.h(j - ye10Var.p);
            }
        }
    }

    public final int n(ye10 ye10Var) {
        d6z.z(ye10Var);
        int i = 0;
        if (ye10Var != this.l) {
            this.l = ye10Var;
            while (true) {
                ye10Var = ye10Var.m;
                if (ye10Var == null) {
                    break;
                }
                if (ye10Var == this.j) {
                    ye10 ye10Var2 = this.i;
                    this.j = ye10Var2;
                    this.k = ye10Var2;
                    i = 3;
                }
                if (ye10Var == this.k) {
                    this.k = this.j;
                    i |= 2;
                }
                ye10Var.i();
                this.n--;
            }
            ye10 ye10Var3 = this.l;
            ye10Var3.getClass();
            if (ye10Var3.m != null) {
                ye10Var3.b();
                ye10Var3.m = null;
                ye10Var3.c();
            }
            l();
        }
        return i;
    }

    public final sf10 p(a9z0 a9z0Var, Object obj, long j) {
        long q;
        int b;
        Object obj2 = obj;
        y8z0 y8z0Var = this.a;
        int i = a9z0Var.h(obj2, y8z0Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (b = a9z0Var.b(obj3)) == -1 || a9z0Var.g(b, y8z0Var, false).c != i) {
            ye10 ye10Var = this.i;
            while (true) {
                if (ye10Var == null) {
                    ye10 ye10Var2 = this.i;
                    while (true) {
                        if (ye10Var2 != null) {
                            int b2 = a9z0Var.b(ye10Var2.b);
                            if (b2 != -1 && a9z0Var.g(b2, y8z0Var, false).c == i) {
                                q = ye10Var2.g.a.d;
                                break;
                            }
                            ye10Var2 = ye10Var2.m;
                        } else {
                            q = q(obj2);
                            if (q == -1) {
                                q = this.f;
                                this.f = 1 + q;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = q;
                                }
                            }
                        }
                    }
                } else {
                    if (ye10Var.b.equals(obj2)) {
                        q = ye10Var.g.a.d;
                        break;
                    }
                    ye10Var = ye10Var.m;
                }
            }
        } else {
            q = this.p;
        }
        a9z0Var.h(obj2, y8z0Var);
        int i2 = y8z0Var.c;
        z8z0 z8z0Var = this.b;
        a9z0Var.o(z8z0Var, i2);
        boolean z = false;
        for (int b3 = a9z0Var.b(obj); b3 >= z8z0Var.m; b3--) {
            a9z0Var.g(b3, y8z0Var, true);
            boolean z2 = y8z0Var.g.a > 0;
            z |= z2;
            if (y8z0Var.c(y8z0Var.d) != -1) {
                obj2 = y8z0Var.b;
                obj2.getClass();
            }
            if (z && (!z2 || y8z0Var.d != 0)) {
                break;
            }
        }
        return o(a9z0Var, obj2, j, q, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            ye10 ye10Var = (ye10) this.q.get(i);
            if (ye10Var.b.equals(obj)) {
                return ye10Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(a9z0 a9z0Var) {
        a9z0 a9z0Var2;
        ye10 ye10Var;
        ye10 ye10Var2 = this.i;
        if (ye10Var2 == null) {
            return 0;
        }
        int b = a9z0Var.b(ye10Var2.b);
        while (true) {
            a9z0Var2 = a9z0Var;
            b = a9z0Var2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                ye10Var2.getClass();
                ye10Var = ye10Var2.m;
                if (ye10Var == null || ye10Var2.g.h) {
                    break;
                }
                ye10Var2 = ye10Var;
            }
            if (b == -1 || ye10Var == null || a9z0Var2.b(ye10Var.b) != b) {
                break;
            }
            ye10Var2 = ye10Var;
            a9z0Var = a9z0Var2;
        }
        int n = n(ye10Var2);
        ye10Var2.g = h(a9z0Var2, ye10Var2.g);
        return n;
    }

    public final int s(a9z0 a9z0Var, long j, long j2, long j3) {
        ze10 ze10Var;
        ye10 ye10Var = this.i;
        ye10 ye10Var2 = null;
        while (true) {
            boolean z = false;
            if (ye10Var == null) {
                return 0;
            }
            ze10 ze10Var2 = ye10Var.g;
            if (ye10Var2 == null) {
                ze10Var = h(a9z0Var, ze10Var2);
            } else {
                ze10 c = c(a9z0Var, ye10Var2, j);
                if (c == null || ze10Var2.b != c.b || !ze10Var2.a.equals(c.a)) {
                    break;
                }
                ze10Var = c;
            }
            long j4 = ze10Var.e;
            ye10Var.g = ze10Var.a(ze10Var2.c);
            long j5 = ze10Var2.e;
            if (j5 != -9223372036854775807L && j5 != j4) {
                ye10Var.k();
                long j6 = j4 == -9223372036854775807L ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : ye10Var.p + j4;
                int i = (ye10Var != this.j || ye10Var.g.g || (j2 != Long.MIN_VALUE && j2 < j6)) ? 0 : 1;
                if (ye10Var == this.k && (j3 == Long.MIN_VALUE || j3 >= j6)) {
                    z = true;
                }
                int n = n(ye10Var);
                return n != 0 ? n : z ? i | 2 : i;
            }
            ye10Var2 = ye10Var;
            ye10Var = ye10Var.m;
        }
        return n(ye10Var2);
    }
}
