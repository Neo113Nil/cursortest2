package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.p11;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class eq71 {
    public final ek71 a;
    public final vr b;
    public final cf71 c;
    public final z571 d;
    public final y671 e;
    public final jn71 f;
    public final cf71 g;
    public a4 h;
    public j581 i;
    public boolean j;
    public boolean k;

    public eq71(ek71 ek71Var, vr vrVar, cf71 cf71Var) {
        z571 z571Var = new z571();
        y671 y671Var = new y671();
        this.a = ek71Var;
        this.b = vrVar;
        this.c = cf71Var;
        this.d = z571Var;
        this.e = y671Var;
        jn71 jn71Var = new jn71(this);
        this.f = jn71Var;
        this.g = new cf71(jn71Var);
        xrr xrrVar = ek71Var.k;
        if (!xrrVar.b) {
            ((CopyOnWriteArraySet) xrrVar.y).add(new x181(jn71Var));
        }
        xrr xrrVar2 = ek71Var.k;
        if (!xrrVar2.b) {
            ((CopyOnWriteArraySet) xrrVar2.y).add(new x181(y671Var));
        }
        lr81.b = this;
        Iterator it = lr81.a.iterator();
        while (it.hasNext()) {
            ub81 ub81Var = (ub81) it.next();
            if (lr81.b != null) {
                eq71 eq71Var = lr81.b;
                if (eq71Var != null) {
                    ek71 ek71Var2 = eq71Var.a;
                    ek71Var2.getClass();
                    ub81Var.getClass();
                    xrr xrrVar3 = ek71Var2.k;
                    if (!xrrVar3.b) {
                        ((CopyOnWriteArraySet) xrrVar3.y).add(new x181(ub81Var));
                    }
                }
            } else {
                lr81.a.add(ub81Var);
            }
        }
    }

    public final void a(float f) {
        if (this.j) {
            return;
        }
        ek71 ek71Var = this.a;
        ek71Var.v();
        int i = rf71.a;
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (ek71Var.V != max) {
            ek71Var.V = max;
            ek71Var.d(1, 2, Float.valueOf(ek71Var.w.e * max));
            xrr xrrVar = ek71Var.k;
            xrrVar.b(22, new tno(max, 1));
            xrrVar.a();
        }
        j581 j581Var = this.i;
        a4 a4Var = this.h;
        if (j581Var == null || a4Var == null) {
            return;
        }
        j581Var.onVolumeChanged(f);
    }

    public final void b(a4 a4Var) {
        z171 z171Var;
        int a;
        long u;
        Pair a2;
        lu81 lu81Var;
        List list;
        hp71 b;
        ek71 ek71Var;
        m471 m471Var;
        if (this.j) {
            return;
        }
        this.h = a4Var;
        vr vrVar = this.b;
        vrVar.getClass();
        mk71 mk71Var = new mk71();
        Context context = vrVar.a;
        new ou71();
        hn71 hn71Var = new hn71(vrVar.a, new hn71(14, ou71.a(), mk71Var.a(context)));
        m471 m471Var2 = m471.d;
        if (m471Var2 == null) {
            synchronized (m471.c) {
                m471Var = m471.d;
                if (m471Var == null) {
                    m471Var = new m471();
                    m471.d = m471Var;
                }
            }
            m471Var2 = m471Var;
        }
        Context context2 = vrVar.a;
        synchronized (m471.c) {
            z171Var = m471Var2.b;
            if (z171Var == null) {
                m471Var2.a.getClass();
                z171Var = h171.a(context2);
                m471Var2.b = z171Var;
            }
        }
        ly61 ly61Var = new ly61();
        ly61Var.a = z171Var;
        ly61Var.b = hn71Var;
        k191 k191Var = new k191(ly61Var, new ej71());
        String str = a4Var.a;
        su71 su71Var = op81.z;
        wp71 wp71Var = new wp71();
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        List list2 = Collections.EMPTY_LIST;
        wk2 wk2Var2 = wk2.x;
        qf81 qf81Var = qf81.c;
        Uri parse = str == null ? null : Uri.parse(str);
        qv81 a3 = k191Var.a(new op81("", new dw71(wp71Var), parse != null ? new d981(parse, list2, null, wk2Var2) : null, new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L), oi61.b0, qf81Var));
        this.a.j(false);
        ek71 ek71Var2 = this.a;
        ek71Var2.v();
        List singletonList = Collections.singletonList(a3);
        ek71Var2.v();
        ek71Var2.v();
        ek71Var2.r();
        ek71Var2.v();
        ek71Var2.a(ek71Var2.b0);
        int i = rf71.a;
        ek71Var2.B++;
        ArrayList arrayList = ek71Var2.n;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                ek71Var2.n.remove(i2);
            }
            zj61 zj61Var = ek71Var2.G;
            int[] iArr = new int[zj61Var.b.length - size];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr2 = zj61Var.b;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= size) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= size;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            }
            ek71Var2.G = new zj61(iArr, new Random(zj61Var.a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < singletonList.size(); i7++) {
            vs81 vs81Var = new vs81((qv81) singletonList.get(i7), ek71Var2.o);
            arrayList2.add(vs81Var);
            arrayList.add(i7, new vg71(vs81Var.b, vs81Var.a.W));
        }
        ek71Var2.G = ek71Var2.G.a(arrayList2.size());
        ii81 ii81Var = new ii81(arrayList, ek71Var2.G);
        int i8 = ii81Var.x;
        if (!ii81Var.c() && -1 >= i8) {
            throw new p11();
        }
        int a4 = ii81Var.a(false);
        hp71 hp71Var = ek71Var2.b0;
        if (ii81Var.c()) {
            ek71Var2.c0 = a4;
            ek71Var2.d0 = 0L;
            a2 = null;
        } else {
            if (a4 == -1 || a4 >= ii81Var.x) {
                a = ii81Var.a(false);
                uk81 uk81Var = ek71Var2.a;
                ii81Var.a(a, uk81Var, 0L);
                u = rf71.u(uk81Var.E);
            } else {
                a = a4;
                u = -9223372036854775807L;
            }
            a2 = ii81Var.a(ek71Var2.a, ek71Var2.m, a, rf71.g(u));
        }
        if (!ii81Var.c() && a2 == null) {
            w511.q();
            return;
        }
        yn81 yn81Var = hp71Var.a;
        hp71 d = hp71Var.d(ii81Var);
        if (ii81Var.c()) {
            v281 v281Var = hp71.s;
            long g = rf71.g(ek71Var2.d0);
            hp71 b2 = d.c(v281Var, g, g, g, 0L, wx71.w, ek71Var2.b, wk2.x).b(v281Var);
            b2.p = b2.r;
            b = b2;
        } else {
            Object obj = d.b.a;
            int i9 = rf71.a;
            boolean equals = obj.equals(a2.first);
            v281 v281Var2 = !equals ? new v281(a2.first) : d.b;
            long longValue = ((Long) a2.second).longValue();
            long g2 = rf71.g(ek71Var2.n());
            if (!yn81Var.c()) {
                g2 -= yn81Var.a(obj, ek71Var2.m).x;
            }
            if (!equals || longValue < g2) {
                v281 v281Var3 = v281Var2;
                if (v281Var3.a()) {
                    ny61.k();
                    return;
                }
                wx71 wx71Var = !equals ? wx71.w : d.h;
                if (equals) {
                    ek71Var2 = ek71Var2;
                    lu81Var = d.i;
                } else {
                    ek71Var2 = ek71Var2;
                    lu81Var = ek71Var2.b;
                }
                lu81 lu81Var2 = lu81Var;
                if (equals) {
                    list = d.j;
                } else {
                    p481 p481Var2 = t31.b;
                    list = wk2.x;
                }
                b = d.c(v281Var3, longValue, longValue, longValue, 0L, wx71Var, lu81Var2, list).b(v281Var3);
                b.p = longValue;
            } else {
                if (longValue == g2) {
                    int a5 = ii81Var.a(d.k.a);
                    if (a5 != -1) {
                        ie81 ie81Var = ek71Var2.m;
                        ii81Var.a(a5, ie81Var, false);
                        int i10 = ie81Var.c;
                        Object obj2 = v281Var2.a;
                        ie81 ie81Var2 = ek71Var2.m;
                        ii81Var.a(obj2, ie81Var2);
                        if (i10 == ie81Var2.c) {
                            b = d;
                        }
                    }
                    ii81Var.a(v281Var2.a, ek71Var2.m);
                    boolean a6 = v281Var2.a();
                    ie81 ie81Var3 = ek71Var2.m;
                    long c = a6 ? ie81Var3.c(v281Var2.b, v281Var2.c) : ie81Var3.w;
                    ek71Var = ek71Var2;
                    b = d.c(v281Var2, d.r, d.r, d.d, c - d.r, d.h, d.i, d.j).b(v281Var2);
                    b.p = c;
                } else {
                    ek71Var = ek71Var2;
                    if (v281Var2.a()) {
                        ny61.k();
                        return;
                    }
                    long max = Math.max(0L, d.q - (longValue - g2));
                    long j = d.p;
                    if (d.k.equals(d.b)) {
                        j = longValue + max;
                    }
                    hp71 c2 = d.c(v281Var2, longValue, longValue, longValue, max, d.h, d.i, d.j);
                    c2.p = j;
                    b = c2;
                }
                ek71Var2 = ek71Var;
            }
        }
        int i11 = b.e;
        if (a4 != -1 && i11 != 1) {
            i11 = (ii81Var.c() || a4 >= i8) ? 4 : 2;
        }
        hp71 a7 = b.a(i11);
        ek71Var2.j.i.b(17, new gt71(arrayList2, ek71Var2.G, a4, rf71.g(-9223372036854775807L))).b();
        ek71Var2.h(a7, 0, 1, (ek71Var2.b0.b.a.equals(a7.b.a) || ek71Var2.b0.a.c()) ? false : true, 4, ek71Var2.a(a7));
        ek71 ek71Var3 = this.a;
        ek71Var3.v();
        ek71Var3.v();
        boolean z = ek71Var3.b0.l;
        ek71Var3.w.a();
        int i12 = z ? 1 : -1;
        ek71Var3.e(i12, (!z || i12 == 1) ? 1 : 2, z);
        hp71 hp71Var2 = ek71Var3.b0;
        if (hp71Var2.e == 1) {
            hp71 e = hp71Var2.e(null);
            hp71 a8 = e.a(e.a.c() ? 4 : 2);
            ek71Var3.B++;
            rl71 rl71Var = ek71Var3.j.i;
            rl71Var.getClass();
            fi71 a9 = rl71.a();
            a9.a = rl71Var.a.obtainMessage(0);
            a9.b();
            ek71Var3.h(a8, 1, 1, false, 5, -9223372036854775807L);
        }
        cf71 cf71Var = this.g;
        cf71Var.getClass();
        ((gm71) cf71Var.c).b(10000L, new lm71(10, cf71Var));
    }

    public final void c(TextureView textureView) {
        if (this.j) {
            return;
        }
        y671 y671Var = this.e;
        y671Var.w = textureView;
        y671Var.c();
        this.a.g(textureView);
    }

    public final void d() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = false;
        ((gm71) this.g.c).a();
        ek71 ek71Var = this.a;
        ek71Var.g(null);
        y671 y671Var = this.e;
        y671Var.w = null;
        y671Var.c();
        ek71Var.m(this.f);
        ek71Var.m(y671Var);
        ek71Var.s();
    }

    public final boolean e() {
        ek71 ek71Var = this.a;
        ek71Var.getClass();
        ek71Var.v();
        if (ek71Var.b0.e != 3) {
            return false;
        }
        ek71Var.v();
        if (!ek71Var.b0.l) {
            return false;
        }
        ek71Var.v();
        return ek71Var.b0.m == 0;
    }

    public final void f() {
        if (this.j) {
            return;
        }
        this.a.j(false);
    }

    public final void g() {
        if (this.j) {
            return;
        }
        j581 j581Var = this.i;
        a4 a4Var = this.h;
        if (j581Var != null && a4Var != null) {
            j581Var.e();
        }
        this.j = true;
        this.k = false;
        ((gm71) this.g.c).a();
        ek71 ek71Var = this.a;
        ek71Var.g(null);
        y671 y671Var = this.e;
        y671Var.w = null;
        y671Var.c();
        ek71Var.m(this.f);
        ek71Var.m(y671Var);
        ek71Var.s();
    }
}
