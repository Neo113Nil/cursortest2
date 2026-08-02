package yads;

import android.os.Handler;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import xsna.v8e;

/* loaded from: classes10.dex */
public final class un1 {
    public final t73 a = new t73();
    public final v73 b = new v73();
    public final se c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public rn1 h;
    public rn1 i;
    public rn1 j;
    public int k;
    public Object l;
    public long m;

    public un1(se seVar, Handler handler) {
        this.c = seVar;
        this.d = handler;
    }

    public final rn1 a() {
        rn1 rn1Var = this.h;
        if (rn1Var == null) {
            return null;
        }
        if (rn1Var == this.i) {
            this.i = rn1Var.l;
        }
        rn1Var.b();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            rn1 rn1Var2 = this.h;
            this.l = rn1Var2.b;
            this.m = rn1Var2.f.a.d;
        }
        this.h = this.h.l;
        c();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        rn1 rn1Var = this.h;
        if (rn1Var == null) {
            throw new IllegalStateException();
        }
        this.l = rn1Var.b;
        this.m = rn1Var.f.a.d;
        while (rn1Var != null) {
            rn1Var.b();
            rn1Var = rn1Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        c();
    }

    public final void c() {
        o51 f = s51.f();
        for (rn1 rn1Var = this.h; rn1Var != null; rn1Var = rn1Var.l) {
            f.a(rn1Var.f.a);
        }
        rn1 rn1Var2 = this.i;
        this.d.post(new v8e(this, f, rn1Var2 == null ? null : rn1Var2.f.a, 4));
    }

    public final tn1 a(w73 w73Var, rn1 rn1Var, long j) {
        long j2;
        w73 w73Var2;
        long j3;
        Object obj;
        long j4;
        tn1 tn1Var = rn1Var.f;
        long j5 = (rn1Var.o + tn1Var.e) - j;
        boolean z = false;
        if (tn1Var.g) {
            long j6 = 0;
            int a = w73Var.a(w73Var.a(tn1Var.a.a), this.a, this.b, this.f, this.g);
            if (a == -1) {
                return null;
            }
            int i = w73Var.a(a, this.a, true).d;
            Object obj2 = this.a.c;
            obj2.getClass();
            long j7 = tn1Var.a.d;
            if (w73Var.a(i, this.b, 0L).p == a) {
                Pair a2 = w73Var.a(this.b, this.a, i, C.TIME_UNSET, Math.max(0L, j5));
                if (a2 == null) {
                    return null;
                }
                Object obj3 = a2.first;
                long longValue = ((Long) a2.second).longValue();
                rn1 rn1Var2 = rn1Var.l;
                if (rn1Var2 != null && rn1Var2.b.equals(obj3)) {
                    j7 = rn1Var2.f.a.d;
                } else {
                    j7 = this.e;
                    this.e = 1 + j7;
                }
                obj = obj3;
                j4 = longValue;
                j6 = -9223372036854775807L;
            } else {
                obj = obj2;
                j4 = 0;
            }
            zn1 a3 = a(w73Var, obj, j4, j7, this.b, this.a);
            if (j6 != C.TIME_UNSET && tn1Var.c != C.TIME_UNSET) {
                if (w73Var.a(tn1Var.a.a, this.a).h.c > 0) {
                    e6 e6Var = this.a.h;
                    if (e6Var.a(e6Var.f).h) {
                        z = true;
                    }
                }
                if (a3.a() && z) {
                    j6 = tn1Var.c;
                } else if (z) {
                    j4 = tn1Var.c;
                }
            }
            long j8 = j6;
            w73Var.a(a3.a, this.a);
            if (a3.a()) {
                return a(w73Var, a3.a, a3.b, a3.c, j8, a3.d);
            }
            return a(w73Var, a3.a, j4, j8, a3.d);
        }
        zn1 zn1Var = tn1Var.a;
        w73Var.a(zn1Var.a, this.a);
        if (zn1Var.a()) {
            int i2 = zn1Var.b;
            int i3 = this.a.h.a(i2).c;
            if (i3 == -1) {
                return null;
            }
            int a4 = this.a.h.a(i2).a(zn1Var.c);
            if (a4 < i3) {
                return a(w73Var, zn1Var.a, i2, a4, tn1Var.c, zn1Var.d);
            }
            long j9 = tn1Var.c;
            if (j9 == C.TIME_UNSET) {
                v73 v73Var = this.b;
                t73 t73Var = this.a;
                Pair a5 = w73Var.a(v73Var, t73Var, t73Var.d, C.TIME_UNSET, Math.max(0L, j5));
                w73Var2 = w73Var;
                if (a5 == null) {
                    return null;
                }
                j9 = ((Long) a5.second).longValue();
            } else {
                w73Var2 = w73Var;
            }
            Object obj4 = zn1Var.a;
            int i4 = zn1Var.b;
            w73Var2.a(obj4, this.a);
            long j10 = this.a.h.a(i4).b;
            if (j10 == Long.MIN_VALUE) {
                j3 = this.a.e;
            } else {
                j3 = this.a.h.a(i4).g + j10;
            }
            return a(w73Var, zn1Var.a, Math.max(j3, j9), tn1Var.c, zn1Var.d);
        }
        int a6 = this.a.a(zn1Var.e);
        if (this.a.h.a(zn1Var.e).h) {
            d6 a7 = this.a.h.a(zn1Var.e);
            if (a7.c != -1 && a7.e[a6] == 3) {
                z = true;
            }
        }
        if (a6 != this.a.h.a(zn1Var.e).c && !z) {
            return a(w73Var, zn1Var.a, zn1Var.e, a6, tn1Var.e, zn1Var.d);
        }
        Object obj5 = zn1Var.a;
        int i5 = zn1Var.e;
        w73Var.a(obj5, this.a);
        long j11 = this.a.h.a(i5).b;
        if (j11 == Long.MIN_VALUE) {
            j2 = this.a.e;
        } else {
            j2 = this.a.h.a(i5).g + j11;
        }
        return a(w73Var, zn1Var.a, j2, tn1Var.e, zn1Var.d);
    }

    public final tn1 a(w73 w73Var, Object obj, int i, int i2, long j, long j2) {
        zn1 zn1Var = new zn1(obj, i, i2, j2);
        long a = w73Var.a(obj, this.a).a(i, i2);
        long j3 = i2 == this.a.a(i) ? this.a.h.d : 0L;
        boolean z = this.a.h.a(i).h;
        if (a != C.TIME_UNSET && j3 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new tn1(zn1Var, j3, j, C.TIME_UNSET, a, z, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tn1 a(w73 w73Var, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        boolean z3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        w73Var.a(obj, this.a);
        int a = this.a.a(j);
        int i = 1;
        if (a == -1) {
            e6 e6Var = this.a.h;
            if (e6Var.c > 0 && e6Var.a(e6Var.f).h) {
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.a.h.a(a).h) {
                long j9 = this.a.h.a(a).b;
                t73 t73Var = this.a;
                if (j9 == t73Var.e) {
                    d6 a2 = t73Var.h.a(a);
                    if (a2.c != -1) {
                        for (int i2 = 0; i2 < a2.c; i2++) {
                            int i3 = a2.e[i2];
                            if (i3 != 0 && i3 != 1) {
                            }
                        }
                        z = false;
                        if (!z) {
                            z2 = true;
                            a = -1;
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            z2 = false;
        }
        zn1 zn1Var = new zn1(a, j3, obj);
        boolean z4 = !zn1Var.a() && a == -1;
        if (!zn1Var.a() && a == -1) {
            if (w73Var.a(w73Var.a(obj, this.a).d, this.b, 0L).q == w73Var.a(obj)) {
                z3 = true;
                boolean a3 = a(w73Var, zn1Var, z4);
                boolean z5 = a == -1 && this.a.h.a(a).h;
                if (a == -1) {
                    d6 a4 = this.a.h.a(a);
                    j4 = C.TIME_UNSET;
                    j6 = a4.b;
                } else {
                    j4 = C.TIME_UNSET;
                    if (z2) {
                        j6 = this.a.e;
                    } else {
                        j5 = -9223372036854775807L;
                        j7 = (j5 != j4 || j5 == Long.MIN_VALUE) ? this.a.e : j5;
                        if (j7 != j4 || j < j7) {
                            j8 = j;
                        } else {
                            if (!a3 && z2) {
                                i = 0;
                            }
                            j8 = Math.max(0L, j7 - i);
                        }
                        return new tn1(zn1Var, j8, j2, j5, j7, z5, z4, z3, a3);
                    }
                }
                j5 = j6;
                if (j5 != j4) {
                }
                if (j7 != j4) {
                }
                j8 = j;
                return new tn1(zn1Var, j8, j2, j5, j7, z5, z4, z3, a3);
            }
        }
        z3 = false;
        boolean a32 = a(w73Var, zn1Var, z4);
        if (a == -1) {
        }
        if (a == -1) {
        }
        j5 = j6;
        if (j5 != j4) {
        }
        if (j7 != j4) {
        }
        j8 = j;
        return new tn1(zn1Var, j8, j2, j5, j7, z5, z4, z3, a32);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tn1 a(w73 w73Var, tn1 tn1Var) {
        boolean z;
        long j;
        int i;
        zn1 zn1Var = tn1Var.a;
        boolean z2 = false;
        boolean z3 = !zn1Var.a() && zn1Var.e == -1;
        if (!zn1Var.a() && zn1Var.e == -1) {
            if (w73Var.a(w73Var.a(zn1Var.a, this.a).d, this.b, 0L).q == w73Var.a(zn1Var.a)) {
                z = true;
                boolean a = a(w73Var, zn1Var, z3);
                w73Var.a(tn1Var.a.a, this.a);
                long j2 = (!zn1Var.a() || (i = zn1Var.e) == -1) ? -9223372036854775807L : this.a.h.a(i).b;
                if (!zn1Var.a()) {
                    j = this.a.a(zn1Var.b, zn1Var.c);
                } else {
                    j = (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? this.a.e : j2;
                }
                if (!zn1Var.a()) {
                    z2 = this.a.h.a(zn1Var.b).h;
                } else {
                    int i2 = zn1Var.e;
                    if (i2 != -1 && this.a.h.a(i2).h) {
                        z2 = true;
                    }
                }
                return new tn1(zn1Var, tn1Var.b, tn1Var.c, j2, j, z2, z3, z, a);
            }
        }
        z = false;
        boolean a2 = a(w73Var, zn1Var, z3);
        w73Var.a(tn1Var.a.a, this.a);
        if (zn1Var.a()) {
        }
        if (!zn1Var.a()) {
        }
        if (!zn1Var.a()) {
        }
        return new tn1(zn1Var, tn1Var.b, tn1Var.c, j2, j, z2, z3, z, a2);
    }

    public final boolean a(w73 w73Var, zn1 zn1Var, boolean z) {
        int a = w73Var.a(zn1Var.a);
        return !w73Var.a(w73Var.a(a, this.a, false).d, this.b, 0L).j && w73Var.a(a, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final void a(o51 o51Var, zn1 zn1Var) {
        se seVar = this.c;
        tn2 a = o51Var.a();
        kb0 kb0Var = (kb0) seVar;
        jb0 jb0Var = kb0Var.d;
        pf2 pf2Var = kb0Var.g;
        pf2Var.getClass();
        jb0Var.getClass();
        jb0Var.b = s51.a((Collection) a);
        if (!a.isEmpty()) {
            jb0Var.e = (zn1) a.get(0);
            zn1Var.getClass();
            jb0Var.f = zn1Var;
        }
        if (jb0Var.d == null) {
            jb0Var.d = jb0.a(pf2Var, jb0Var.b, jb0Var.e, jb0Var.a);
        }
        ao0 ao0Var = (ao0) pf2Var;
        ao0Var.r();
        jb0Var.a(ao0Var.Z.a);
    }

    public final boolean a(rn1 rn1Var) {
        if (rn1Var != null) {
            int i = 0;
            if (rn1Var.equals(this.j)) {
                return false;
            }
            this.j = rn1Var;
            boolean z = false;
            while (true) {
                rn1Var = rn1Var.l;
                if (rn1Var == null) {
                    break;
                }
                if (rn1Var == this.i) {
                    this.i = this.h;
                    z = true;
                }
                rn1Var.b();
                this.k--;
            }
            rn1 rn1Var2 = this.j;
            if (rn1Var2.l != null) {
                rn1Var2.a();
                rn1Var2.l = null;
                while (true) {
                    x83 x83Var = rn1Var2.n;
                    if (i >= x83Var.a) {
                        break;
                    }
                    boolean a = x83Var.a(i);
                    pp0 pp0Var = rn1Var2.n.c[i];
                    if (a && pp0Var != null) {
                        pp0Var.a();
                    }
                    i++;
                }
            }
            c();
            return z;
        }
        throw new IllegalStateException();
    }

    public static zn1 a(w73 w73Var, Object obj, long j, long j2, v73 v73Var, t73 t73Var) {
        w73Var.a(obj, t73Var);
        w73Var.a(t73Var.d, v73Var, 0L);
        int a = w73Var.a(obj);
        while (t73Var.e == 0) {
            e6 e6Var = t73Var.h;
            if (e6Var.c <= 0 || !e6Var.a(e6Var.f).h || t73Var.b(0L) != -1) {
                break;
            }
            int i = a + 1;
            if (a >= v73Var.q) {
                break;
            }
            w73Var.a(i, t73Var, true);
            obj = t73Var.c;
            obj.getClass();
            a = i;
        }
        w73Var.a(obj, t73Var);
        int b = t73Var.b(j);
        if (b == -1) {
            return new zn1(t73Var.a(j), j2, obj);
        }
        return new zn1(obj, b, t73Var.a(b), j2);
    }

    public final zn1 a(w73 w73Var, Object obj, long j) {
        long j2;
        int a;
        Object obj2 = obj;
        int i = w73Var.a(obj2, this.a).d;
        Object obj3 = this.l;
        if (obj3 != null && (a = w73Var.a(obj3)) != -1 && w73Var.a(a, this.a, false).d == i) {
            j2 = this.m;
        } else {
            rn1 rn1Var = this.h;
            while (true) {
                if (rn1Var != null) {
                    if (rn1Var.b.equals(obj2)) {
                        j2 = rn1Var.f.a.d;
                        break;
                    }
                    rn1Var = rn1Var.l;
                } else {
                    rn1 rn1Var2 = this.h;
                    while (true) {
                        if (rn1Var2 != null) {
                            int a2 = w73Var.a(rn1Var2.b);
                            if (a2 != -1 && w73Var.a(a2, this.a, false).d == i) {
                                j2 = rn1Var2.f.a.d;
                                break;
                            }
                            rn1Var2 = rn1Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                }
            }
        }
        long j3 = j2;
        w73Var.a(obj2, this.a);
        w73Var.a(this.a.d, this.b, 0L);
        boolean z = false;
        for (int a3 = w73Var.a(obj); a3 >= this.b.p; a3--) {
            w73Var.a(a3, this.a, true);
            t73 t73Var = this.a;
            boolean z2 = t73Var.h.c > 0;
            z |= z2;
            if (t73Var.b(t73Var.e) != -1) {
                obj2 = this.a.c;
                obj2.getClass();
            }
            if (z && (!z2 || this.a.e != 0)) {
                break;
            }
        }
        return a(w73Var, obj2, j, j3, this.b, this.a);
    }

    public final boolean a(w73 w73Var) {
        w73 w73Var2;
        rn1 rn1Var;
        rn1 rn1Var2 = this.h;
        if (rn1Var2 == null) {
            return true;
        }
        int a = w73Var.a(rn1Var2.b);
        while (true) {
            w73Var2 = w73Var;
            a = w73Var2.a(a, this.a, this.b, this.f, this.g);
            while (true) {
                rn1Var = rn1Var2.l;
                if (rn1Var == null || rn1Var2.f.g) {
                    break;
                }
                rn1Var2 = rn1Var;
            }
            if (a == -1 || rn1Var == null || w73Var2.a(rn1Var.b) != a) {
                break;
            }
            rn1Var2 = rn1Var;
            w73Var = w73Var2;
        }
        boolean a2 = a(rn1Var2);
        rn1Var2.f = a(w73Var2, rn1Var2.f);
        return !a2;
    }

    public final boolean a(w73 w73Var, long j, long j2) {
        tn1 tn1Var;
        tn1 tn1Var2;
        boolean z;
        tn1 tn1Var3;
        w73 w73Var2 = w73Var;
        rn1 rn1Var = this.h;
        rn1 rn1Var2 = null;
        while (rn1Var != null) {
            tn1 tn1Var4 = rn1Var.f;
            if (rn1Var2 == null) {
                tn1Var = a(w73Var2, tn1Var4);
            } else {
                tn1 a = a(w73Var2, rn1Var2, j);
                if (a == null) {
                    return !a(rn1Var2);
                }
                if (tn1Var4.b != a.b || !tn1Var4.a.equals(a.a)) {
                    return !a(rn1Var2);
                }
                tn1Var = a;
            }
            long j3 = tn1Var4.c;
            if (j3 == tn1Var.c) {
                tn1Var2 = tn1Var;
                z = true;
                tn1Var3 = tn1Var4;
            } else {
                z = true;
                tn1Var3 = tn1Var4;
                tn1Var2 = new tn1(tn1Var.a, tn1Var.b, j3, tn1Var.d, tn1Var.e, tn1Var.f, tn1Var.g, tn1Var.h, tn1Var.i);
            }
            rn1Var.f = tn1Var2;
            long j4 = tn1Var3.e;
            long j5 = tn1Var.e;
            if (j4 != C.TIME_UNSET && j4 != j5) {
                qn1 qn1Var = rn1Var.a;
                if (qn1Var instanceof tv) {
                    long j6 = tn1Var2.d;
                    if (j6 == C.TIME_UNSET) {
                        j6 = Long.MIN_VALUE;
                    }
                    tv tvVar = (tv) qn1Var;
                    tvVar.f = 0L;
                    tvVar.g = j6;
                }
                boolean z2 = (rn1Var != this.i || tn1Var2.f || (j2 != Long.MIN_VALUE && j2 < ((j5 > C.TIME_UNSET ? 1 : (j5 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : rn1Var.o + j5))) ? false : z;
                if (a(rn1Var) || z2) {
                    return false;
                }
                return z;
            }
            rn1Var2 = rn1Var;
            rn1Var = rn1Var.l;
            w73Var2 = w73Var;
        }
        return true;
    }
}
