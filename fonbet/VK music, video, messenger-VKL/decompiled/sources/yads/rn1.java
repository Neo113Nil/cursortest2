package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class rn1 {
    public final qn1 a;
    public final Object b;
    public final ot2[] c;
    public boolean d;
    public boolean e;
    public tn1 f;
    public boolean g;
    public final boolean[] h;
    public final ro[] i;
    public final w83 j;
    public final jo1 k;
    public rn1 l;
    public m83 m;
    public x83 n;
    public long o;

    public rn1(ro[] roVarArr, long j, w83 w83Var, ib0 ib0Var, jo1 jo1Var, tn1 tn1Var, x83 x83Var) {
        this.i = roVarArr;
        this.o = j;
        this.j = w83Var;
        this.k = jo1Var;
        zn1 zn1Var = tn1Var.a;
        this.b = zn1Var.a;
        this.f = tn1Var;
        this.m = m83.e;
        this.n = x83Var;
        this.c = new ot2[roVarArr.length];
        this.h = new boolean[roVarArr.length];
        this.a = a(zn1Var, jo1Var, ib0Var, tn1Var.b, tn1Var.d);
    }

    public final long a(x83 x83Var, long j, boolean z, boolean[] zArr) {
        x83 x83Var2;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= x83Var.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || (x83Var2 = this.n) == null || !mc3.a(x83Var.b[i2], x83Var2.b[i2]) || !mc3.a(x83Var.c[i2], x83Var2.c[i2])) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        ot2[] ot2VarArr = this.c;
        int i3 = 0;
        while (true) {
            ro[] roVarArr = this.i;
            if (i3 >= roVarArr.length) {
                break;
            }
            if (roVarArr[i3].b == -2) {
                ot2VarArr[i3] = null;
            }
            i3++;
        }
        a();
        this.n = x83Var;
        if (this.l == null) {
            int i4 = 0;
            while (true) {
                x83 x83Var3 = this.n;
                if (i4 >= x83Var3.a) {
                    break;
                }
                boolean a = x83Var3.a(i4);
                pp0 pp0Var = this.n.c[i4];
                if (a && pp0Var != null) {
                    pp0Var.a();
                }
                i4++;
            }
        }
        long a2 = this.a.a(x83Var.c, this.h, this.c, zArr, j);
        ot2[] ot2VarArr2 = this.c;
        int i5 = 0;
        while (true) {
            ro[] roVarArr2 = this.i;
            if (i5 >= roVarArr2.length) {
                break;
            }
            if (roVarArr2[i5].b == -2 && this.n.a(i5)) {
                ot2VarArr2[i5] = new xl0();
            }
            i5++;
        }
        this.e = false;
        while (true) {
            ot2[] ot2VarArr3 = this.c;
            if (i >= ot2VarArr3.length) {
                return a2;
            }
            if (ot2VarArr3[i] != null) {
                if (!x83Var.a(i)) {
                    throw new IllegalStateException();
                }
                if (this.i[i].b != -2) {
                    this.e = true;
                }
            } else if (x83Var.c[i] != null) {
                throw new IllegalStateException();
            }
            i++;
        }
    }

    public final void b() {
        a();
        jo1 jo1Var = this.k;
        qn1 qn1Var = this.a;
        try {
            if (!(qn1Var instanceof tv)) {
                ho1 ho1Var = (ho1) jo1Var.c.remove(qn1Var);
                ho1Var.getClass();
                ho1Var.a.a(qn1Var);
                ho1Var.c.remove(((tj1) qn1Var).b);
                if (!jo1Var.c.isEmpty()) {
                    Iterator it = jo1Var.i.iterator();
                    while (it.hasNext()) {
                        ho1 ho1Var2 = (ho1) it.next();
                        if (ho1Var2.c.isEmpty()) {
                            go1 go1Var = (go1) jo1Var.h.get(ho1Var2);
                            if (go1Var != null) {
                                go1Var.a.a(go1Var.b);
                            }
                            it.remove();
                        }
                    }
                }
                if (ho1Var.e && ho1Var.c.isEmpty()) {
                    go1 go1Var2 = (go1) jo1Var.h.remove(ho1Var);
                    go1Var2.getClass();
                    go1Var2.a.c(go1Var2.b);
                    go1Var2.a.a((do1) go1Var2.c);
                    go1Var2.a.a((qk0) go1Var2.c);
                    jo1Var.i.remove(ho1Var);
                    return;
                }
                return;
            }
            qn1 qn1Var2 = ((tv) qn1Var).b;
            ho1 ho1Var3 = (ho1) jo1Var.c.remove(qn1Var2);
            ho1Var3.getClass();
            ho1Var3.a.a(qn1Var2);
            ho1Var3.c.remove(((tj1) qn1Var2).b);
            if (!jo1Var.c.isEmpty()) {
                Iterator it2 = jo1Var.i.iterator();
                while (it2.hasNext()) {
                    ho1 ho1Var4 = (ho1) it2.next();
                    if (ho1Var4.c.isEmpty()) {
                        go1 go1Var3 = (go1) jo1Var.h.get(ho1Var4);
                        if (go1Var3 != null) {
                            go1Var3.a.a(go1Var3.b);
                        }
                        it2.remove();
                    }
                }
            }
            if (ho1Var3.e && ho1Var3.c.isEmpty()) {
                go1 go1Var4 = (go1) jo1Var.h.remove(ho1Var3);
                go1Var4.getClass();
                go1Var4.a.c(go1Var4.b);
                go1Var4.a.a((do1) go1Var4.c);
                go1Var4.a.a((qk0) go1Var4.c);
                jo1Var.i.remove(ho1Var3);
            }
        } catch (RuntimeException e) {
            ji1.b("MediaPeriodHolder", ji1.a("Period release failed.", e));
        }
    }

    public static qn1 a(zn1 zn1Var, jo1 jo1Var, ib0 ib0Var, long j, long j2) {
        jo1Var.getClass();
        Object c = e.c(zn1Var.a);
        zn1 a = zn1Var.a(e.b(zn1Var.a));
        ho1 ho1Var = (ho1) jo1Var.d.get(c);
        ho1Var.getClass();
        jo1Var.i.add(ho1Var);
        go1 go1Var = (go1) jo1Var.h.get(ho1Var);
        if (go1Var != null) {
            go1Var.a.b(go1Var.b);
        }
        ho1Var.c.add(a);
        wj1 wj1Var = ho1Var.a;
        wj1Var.getClass();
        tj1 tj1Var = new tj1(a, ib0Var, j);
        mo moVar = wj1Var.k;
        if (tj1Var.e == null) {
            tj1Var.e = moVar;
            if (wj1Var.r) {
                Object obj = a.a;
                if (wj1Var.o.e != null && obj.equals(uj1.f)) {
                    obj = wj1Var.o.e;
                }
                tj1Var.a(a.a(obj));
            } else {
                wj1Var.p = tj1Var;
                if (!wj1Var.q) {
                    wj1Var.q = true;
                    wj1Var.a((Object) null, moVar);
                }
            }
            jo1Var.c.put(tj1Var, ho1Var);
            Iterator it = jo1Var.i.iterator();
            while (it.hasNext()) {
                ho1 ho1Var2 = (ho1) it.next();
                if (ho1Var2.c.isEmpty()) {
                    go1 go1Var2 = (go1) jo1Var.h.get(ho1Var2);
                    if (go1Var2 != null) {
                        go1Var2.a.a(go1Var2.b);
                    }
                    it.remove();
                }
            }
            return j2 != C.TIME_UNSET ? new tv(tj1Var, true, 0L, j2) : tj1Var;
        }
        throw new IllegalStateException();
    }

    public final void a() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            x83 x83Var = this.n;
            if (i >= x83Var.a) {
                return;
            }
            boolean a = x83Var.a(i);
            pp0 pp0Var = this.n.c[i];
            if (a && pp0Var != null) {
                pp0Var.disable();
            }
            i++;
        }
    }
}
