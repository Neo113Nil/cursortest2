package defpackage;

import android.os.Handler;
import android.util.Pair;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.t31;

/* loaded from: classes7.dex */
public final class en71 {
    public final ie81 a = new ie81();
    public final uk81 b = new uk81();
    public final xl61 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public td71 h;
    public td71 i;
    public td71 j;
    public int k;
    public Object l;
    public long m;

    public en71(xl61 xl61Var, Handler handler) {
        this.c = xl61Var;
        this.d = handler;
    }

    public static v281 g(yn81 yn81Var, Object obj, long j, long j2, uk81 uk81Var, ie81 ie81Var) {
        yn81Var.a(obj, ie81Var);
        yn81Var.a(ie81Var.c, uk81Var, 0L);
        int a = yn81Var.a(obj);
        while (ie81Var.w == 0) {
            uu71 uu71Var = ie81Var.z;
            if (uu71Var.a <= 0 || !uu71Var.a(uu71Var.w).z || ie81Var.e(0L) != -1) {
                break;
            }
            int i = a + 1;
            if (a >= uk81Var.H) {
                break;
            }
            yn81Var.a(i, ie81Var, true);
            obj = ie81Var.b;
            obj.getClass();
            a = i;
        }
        yn81Var.a(obj, ie81Var);
        int e = ie81Var.e(j);
        return e == -1 ? new v281(obj, j2, ie81Var.b(j)) : new v281(obj, e, ie81Var.a(e), j2, -1);
    }

    public final td71 a() {
        td71 td71Var = this.h;
        if (td71Var == null) {
            return null;
        }
        if (td71Var == this.i) {
            this.i = td71Var.l;
        }
        td71Var.c();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            td71 td71Var2 = this.h;
            this.l = td71Var2.b;
            this.m = td71Var2.f.a.d;
        }
        this.h = this.h.l;
        m();
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xj71 b(yn81 yn81Var, td71 td71Var, long j) {
        yn81 yn81Var2;
        ie81 ie81Var;
        long j2;
        boolean z;
        Object obj;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        xj71 xj71Var = td71Var.f;
        long j8 = td71Var.o;
        long j9 = xj71Var.e;
        long j10 = xj71Var.c;
        long j11 = (j8 + j9) - j;
        boolean z2 = xj71Var.g;
        v281 v281Var = xj71Var.a;
        Object obj2 = v281Var.a;
        boolean z3 = false;
        ie81 ie81Var2 = this.a;
        if (!z2) {
            int i = v281Var.e;
            yn81Var.a(obj2, ie81Var2);
            if (!v281Var.a()) {
                int a = ie81Var2.a(i);
                if (ie81Var2.z.a(i).z) {
                    pr71 a2 = ie81Var2.z.a(i);
                    if ((a2.b != -1 ? a2.w[a] : 0) == 3) {
                        z3 = true;
                    }
                }
                if (a != ie81Var2.z.a(i).b && !z3) {
                    return c(yn81Var, v281Var.a, v281Var.e, a, xj71Var.e, v281Var.d);
                }
                yn81Var.a(obj2, ie81Var2);
                long j12 = ie81Var2.z.a(i).a;
                return d(yn81Var, v281Var.a, j12 == Long.MIN_VALUE ? ie81Var2.w : ie81Var2.z.a(i).y + j12, xj71Var.e, v281Var.d);
            }
            int i2 = v281Var.b;
            int i3 = ie81Var2.z.a(i2).b;
            if (i3 == -1) {
                return null;
            }
            int a3 = ie81Var2.z.a(i2).a(v281Var.c);
            if (a3 < i3) {
                return c(yn81Var, v281Var.a, i2, a3, xj71Var.c, v281Var.d);
            }
            if (j10 == -9223372036854775807L) {
                yn81Var2 = yn81Var;
                Pair a4 = yn81Var2.a(this.b, ie81Var2, ie81Var2.c, -9223372036854775807L, Math.max(0L, j11));
                ie81Var = ie81Var2;
                if (a4 == null) {
                    return null;
                }
                j2 = ((Long) a4.second).longValue();
            } else {
                yn81Var2 = yn81Var;
                ie81Var = ie81Var2;
                j2 = j10;
            }
            int i4 = v281Var.b;
            yn81Var2.a(obj2, ie81Var);
            long j13 = ie81Var.z.a(i4).a;
            return d(yn81Var2, v281Var.a, Math.max(j13 == Long.MIN_VALUE ? ie81Var.w : j13 + ie81Var.z.a(i4).y, j2), xj71Var.c, v281Var.d);
        }
        int a5 = yn81Var.a(yn81Var.a(obj2), this.a, this.b, this.f, this.g);
        if (a5 == -1) {
            return null;
        }
        int i5 = yn81Var.a(a5, ie81Var2, true).c;
        Object obj3 = ie81Var2.b;
        obj3.getClass();
        long j14 = v281Var.d;
        if (yn81Var.a(i5, this.b, 0L).G == a5) {
            z = true;
            Pair a6 = yn81Var.a(this.b, this.a, i5, -9223372036854775807L, Math.max(0L, j11));
            if (a6 == null) {
                return null;
            }
            Object obj4 = a6.first;
            long longValue = ((Long) a6.second).longValue();
            td71 td71Var2 = td71Var.l;
            if (td71Var2 == null || !td71Var2.b.equals(obj4)) {
                j7 = this.e;
                this.e = 1 + j7;
            } else {
                j7 = td71Var2.f.a.d;
            }
            obj = obj4;
            j3 = longValue;
            j5 = j7;
            j4 = -9223372036854775807L;
        } else {
            z = true;
            obj = obj3;
            j3 = 0;
            j4 = 0;
            j5 = j14;
        }
        v281 g = g(yn81Var, obj, j3, j5, this.b, this.a);
        if (j4 != -9223372036854775807L && j10 != -9223372036854775807L) {
            if (yn81Var.a(obj2, ie81Var2).z.a > 0) {
                uu71 uu71Var = ie81Var2.z;
                if (uu71Var.a(uu71Var.w).z) {
                    z3 = z;
                }
            }
            if (g.a() && z3) {
                j6 = j10;
            } else if (z3) {
                j6 = j4;
                j3 = j10;
            }
            yn81Var.a(g.a, ie81Var2);
            boolean a7 = g.a();
            Object obj5 = g.a;
            return !a7 ? c(yn81Var, obj5, g.b, g.c, j6, g.d) : d(yn81Var, obj5, j3, j6, g.d);
        }
        j6 = j4;
        yn81Var.a(g.a, ie81Var2);
        boolean a72 = g.a();
        Object obj52 = g.a;
        if (!a72) {
        }
    }

    public final xj71 c(yn81 yn81Var, Object obj, int i, int i2, long j, long j2) {
        v281 v281Var = new v281(obj, i, i2, j2, -1);
        ie81 ie81Var = this.a;
        long c = yn81Var.a(obj, ie81Var).c(i, i2);
        long j3 = i2 == ie81Var.a(i) ? ie81Var.z.b : 0L;
        boolean z = ie81Var.z.a(i).z;
        if (c != -9223372036854775807L && j3 >= c) {
            j3 = Math.max(0L, c - 1);
        }
        return new xj71(v281Var, j3, j, -9223372036854775807L, c, z, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xj71 d(yn81 yn81Var, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long j5;
        long j6;
        ie81 ie81Var = this.a;
        yn81Var.a(obj, ie81Var);
        int b = ie81Var.b(j);
        uu71 uu71Var = ie81Var.z;
        if (b != -1) {
            if (uu71Var.a(b).z && ie81Var.z.a(b).a == ie81Var.w) {
                pr71 a = ie81Var.z.a(b);
                if (a.b != -1) {
                    for (int i = 0; i < a.b; i++) {
                        int i2 = a.w[i];
                        if (i2 != 0 && i2 != 1) {
                        }
                    }
                    z = true;
                    b = -1;
                }
            }
            z = false;
            break;
        }
        if (uu71Var.a > 0 && uu71Var.a(uu71Var.w).z) {
            z = true;
        }
        z = false;
        break;
        v281 v281Var = new v281(obj, j3, b);
        boolean z3 = !v281Var.a() && b == -1;
        if (!v281Var.a() && b == -1) {
            if (yn81Var.a(yn81Var.a(obj, ie81Var).c, this.b, 0L).H == yn81Var.a(obj)) {
                z2 = true;
                boolean k = k(yn81Var, v281Var, z3);
                boolean z4 = b == -1 && ie81Var.z.a(b).z;
                if (b == -1) {
                    j4 = -9223372036854775807L;
                    j6 = ie81Var.z.a(b).a;
                } else {
                    j4 = -9223372036854775807L;
                    if (!z) {
                        j5 = -9223372036854775807L;
                        long j7 = (j5 != j4 || j5 == Long.MIN_VALUE) ? ie81Var.w : j5;
                        return new xj71(v281Var, (j7 != j4 || j < j7) ? j : Math.max(0L, j7 - ((k || !z) ? 1 : 0)), j2, j5, j7, z4, z3, z2, k);
                    }
                    j6 = ie81Var.w;
                }
                j5 = j6;
                if (j5 != j4) {
                }
                if (j7 != j4) {
                }
                return new xj71(v281Var, (j7 != j4 || j < j7) ? j : Math.max(0L, j7 - ((k || !z) ? 1 : 0)), j2, j5, j7, z4, z3, z2, k);
            }
        }
        z2 = false;
        boolean k2 = k(yn81Var, v281Var, z3);
        if (b == -1) {
        }
        if (b == -1) {
        }
        j5 = j6;
        if (j5 != j4) {
        }
        if (j7 != j4) {
        }
        return new xj71(v281Var, (j7 != j4 || j < j7) ? j : Math.max(0L, j7 - ((k2 || !z) ? 1 : 0)), j2, j5, j7, z4, z3, z2, k2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xj71 e(yn81 yn81Var, xj71 xj71Var) {
        boolean z;
        long j;
        boolean z2;
        v281 v281Var = xj71Var.a;
        boolean a = v281Var.a();
        int i = v281Var.b;
        Object obj = v281Var.a;
        int i2 = v281Var.e;
        boolean z3 = false;
        boolean z4 = !a && i2 == -1;
        boolean a2 = v281Var.a();
        ie81 ie81Var = this.a;
        if (!a2 && i2 == -1) {
            if (yn81Var.a(yn81Var.a(obj, ie81Var).c, this.b, 0L).H == yn81Var.a(obj)) {
                z = true;
                boolean k = k(yn81Var, v281Var, z4);
                yn81Var.a(v281Var.a, ie81Var);
                long j2 = (!v281Var.a() || i2 == -1) ? -9223372036854775807L : ie81Var.z.a(i2).a;
                long c = !v281Var.a() ? ie81Var.c(i, v281Var.c) : (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? ie81Var.w : j2;
                if (!v281Var.a()) {
                    z3 = ie81Var.z.a(i).z;
                } else if (i2 != -1 && ie81Var.z.a(i2).z) {
                    j = j2;
                    z2 = true;
                    return new xj71(v281Var, xj71Var.b, xj71Var.c, j, c, z2, z4, z, k);
                }
                j = j2;
                z2 = z3;
                return new xj71(v281Var, xj71Var.b, xj71Var.c, j, c, z2, z4, z, k);
            }
        }
        z = false;
        boolean k2 = k(yn81Var, v281Var, z4);
        yn81Var.a(v281Var.a, ie81Var);
        if (v281Var.a()) {
        }
        if (!v281Var.a()) {
        }
        if (!v281Var.a()) {
        }
        j = j2;
        z2 = z3;
        return new xj71(v281Var, xj71Var.b, xj71Var.c, j, c, z2, z4, z, k2);
    }

    public final v281 f(yn81 yn81Var, Object obj, long j) {
        long j2;
        int a;
        Object obj2 = obj;
        ie81 ie81Var = this.a;
        int i = yn81Var.a(obj2, ie81Var).c;
        Object obj3 = this.l;
        if (obj3 == null || (a = yn81Var.a(obj3)) == -1 || yn81Var.a(a, ie81Var, false).c != i) {
            td71 td71Var = this.h;
            while (true) {
                if (td71Var == null) {
                    td71 td71Var2 = this.h;
                    while (true) {
                        if (td71Var2 != null) {
                            int a2 = yn81Var.a(td71Var2.b);
                            if (a2 != -1 && yn81Var.a(a2, ie81Var, false).c == i) {
                                j2 = td71Var2.f.a.d;
                                break;
                            }
                            td71Var2 = td71Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (td71Var.b.equals(obj2)) {
                        j2 = td71Var.f.a.d;
                        break;
                    }
                    td71Var = td71Var.l;
                }
            }
        } else {
            j2 = this.m;
        }
        yn81Var.a(obj2, ie81Var);
        int i2 = ie81Var.c;
        uk81 uk81Var = this.b;
        yn81Var.a(i2, uk81Var, 0L);
        boolean z = false;
        for (int a3 = yn81Var.a(obj); a3 >= uk81Var.G; a3--) {
            yn81Var.a(a3, ie81Var, true);
            boolean z2 = ie81Var.z.a > 0;
            z |= z2;
            if (ie81Var.e(ie81Var.w) != -1) {
                obj2 = ie81Var.b;
                obj2.getClass();
            }
            if (z && (!z2 || ie81Var.w != 0)) {
                break;
            }
        }
        return g(yn81Var, obj2, j, j2, this.b, this.a);
    }

    public final boolean h(td71 td71Var) {
        int i = 0;
        if (td71Var == null) {
            ny61.k();
            return false;
        }
        if (td71Var == this.j) {
            return false;
        }
        this.j = td71Var;
        boolean z = false;
        while (true) {
            td71Var = td71Var.l;
            if (td71Var == null) {
                break;
            }
            if (td71Var == this.i) {
                this.i = this.h;
                z = true;
            }
            td71Var.c();
            this.k--;
        }
        td71 td71Var2 = this.j;
        if (td71Var2.l != null) {
            td71Var2.b();
            td71Var2.l = null;
            while (true) {
                lu81 lu81Var = td71Var2.n;
                if (i >= lu81Var.a) {
                    break;
                }
                boolean a = lu81Var.a(i);
                gk71 gk71Var = td71Var2.n.c[i];
                if (a && gk71Var != null) {
                    gk71Var.a();
                }
                i++;
            }
        }
        m();
        return z;
    }

    public final boolean i(yn81 yn81Var) {
        yn81 yn81Var2;
        td71 td71Var;
        td71 td71Var2 = this.h;
        if (td71Var2 == null) {
            return true;
        }
        int a = yn81Var.a(td71Var2.b);
        while (true) {
            yn81Var2 = yn81Var;
            a = yn81Var2.a(a, this.a, this.b, this.f, this.g);
            while (true) {
                td71Var = td71Var2.l;
                if (td71Var == null || td71Var2.f.g) {
                    break;
                }
                td71Var2 = td71Var;
            }
            if (a == -1 || td71Var == null || yn81Var2.a(td71Var.b) != a) {
                break;
            }
            td71Var2 = td71Var;
            yn81Var = yn81Var2;
        }
        boolean h = h(td71Var2);
        td71Var2.f = e(yn81Var2, td71Var2.f);
        return !h;
    }

    public final boolean j(yn81 yn81Var, long j, long j2) {
        xj71 xj71Var;
        xj71 xj71Var2;
        boolean z;
        xj71 xj71Var3;
        yn81 yn81Var2 = yn81Var;
        td71 td71Var = this.h;
        td71 td71Var2 = null;
        while (td71Var != null) {
            xj71 xj71Var4 = td71Var.f;
            if (td71Var2 == null) {
                xj71Var = e(yn81Var2, xj71Var4);
            } else {
                xj71 b = b(yn81Var2, td71Var2, j);
                if (b == null) {
                    return !h(td71Var2);
                }
                if (xj71Var4.b != b.b || !xj71Var4.a.equals(b.a)) {
                    return !h(td71Var2);
                }
                xj71Var = b;
            }
            long j3 = xj71Var4.c;
            if (j3 == xj71Var.c) {
                xj71Var2 = xj71Var;
                z = true;
                xj71Var3 = xj71Var4;
            } else {
                z = true;
                xj71Var3 = xj71Var4;
                xj71Var2 = new xj71(xj71Var.a, xj71Var.b, j3, xj71Var.d, xj71Var.e, xj71Var.f, xj71Var.g, xj71Var.h, xj71Var.i);
            }
            td71Var.f = xj71Var2;
            long j4 = xj71Var3.e;
            long j5 = xj71Var.e;
            if (j4 != -9223372036854775807L && j4 != j5) {
                Object obj = td71Var.a;
                if (obj instanceof oh71) {
                    long j6 = xj71Var2.d;
                    if (j6 == -9223372036854775807L) {
                        j6 = Long.MIN_VALUE;
                    }
                    oh71 oh71Var = (oh71) obj;
                    oh71Var.x = 0L;
                    oh71Var.y = j6;
                }
                boolean z2 = (td71Var != this.i || xj71Var2.f || (j2 != Long.MIN_VALUE && j2 < ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : td71Var.o + j5))) ? false : z;
                if (h(td71Var) || z2) {
                    return false;
                }
                return z;
            }
            td71Var2 = td71Var;
            td71Var = td71Var.l;
            yn81Var2 = yn81Var;
        }
        return true;
    }

    public final boolean k(yn81 yn81Var, v281 v281Var, boolean z) {
        int a = yn81Var.a(v281Var.a);
        if (!yn81Var.a(yn81Var.a(a, this.a, false).c, this.b, 0L).A) {
            if (yn81Var.a(a, this.a, this.b, this.f, this.g) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        if (this.k == 0) {
            return;
        }
        td71 td71Var = this.h;
        if (td71Var == null) {
            ny61.k();
            return;
        }
        this.l = td71Var.b;
        this.m = td71Var.f.a.d;
        while (td71Var != null) {
            td71Var.c();
            td71Var = td71Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        m();
    }

    public final void m() {
        p481 p481Var = t31.b;
        a181 a181Var = new a181();
        for (td71 td71Var = this.h; td71Var != null; td71Var = td71Var.l) {
            a181Var.d(td71Var.f.a);
        }
        td71 td71Var2 = this.i;
        this.d.post(new nk61(5, this, a181Var, td71Var2 == null ? null : td71Var2.f.a));
    }
}
