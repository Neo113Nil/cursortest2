package defpackage;

import android.view.View;
import flex.engine.section.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class j89 {
    public final i89 a;
    public final n530 b;
    public final g0q0 c;
    public final seu d;
    public final a1q0 e;
    public final hzk f;
    public boolean k;
    public e89 l;
    public boolean m;
    public boolean n;
    public Integer o;
    public Integer p;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public List i = EmptyList.a;
    public boolean j = true;
    public WeakReference q = new WeakReference(null);

    public j89(i89 i89Var, txl txlVar, n530 n530Var, g0q0 g0q0Var, seu seuVar, yo40 yo40Var, hzk hzkVar) {
        this.a = i89Var;
        this.b = n530Var;
        this.c = g0q0Var;
        this.d = seuVar;
        this.e = yo40Var;
        this.f = hzkVar;
    }

    public final void a(g89 g89Var) {
        boolean z = g89Var.a.b instanceof a3y;
        f0q0 f0q0Var = g89Var.b;
        if (z || f0q0Var.b || f0q0Var.c) {
            return;
        }
        f0q0Var.b = true;
        f0q0Var.d.a = this.b;
        f0q0Var.b();
    }

    public final void b() {
        View view;
        Integer num = this.o;
        int intValue = num != null ? num.intValue() : -1;
        Integer num2 = this.p;
        Integer num3 = (Integer) a.c0(scc.g(Integer.valueOf(this.a.a), Integer.valueOf(intValue + 2), Integer.valueOf((num2 != null ? num2.intValue() : -1) + 2)));
        int intValue2 = num3 != null ? num3.intValue() : 0;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            g89 g89Var = (g89) arrayList.get(i2);
            if (!g89Var.b.b) {
                break;
            }
            i += g89Var.c.size();
        }
        if (i >= intValue2 || c(intValue2) || (view = (View) this.q.get()) == null) {
            return;
        }
        view.post(new b7(16, this));
    }

    public final boolean c(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            g89 g89Var = (g89) arrayList.get(i3);
            if (!g89Var.b.b) {
                try {
                    a(g89Var);
                } catch (Exception e) {
                    g89 g89Var2 = (g89) arrayList.get(i3);
                    pyp0 pyp0Var = g89Var2.a.b;
                    qwg e2 = this.d != null ? seu.e(pyp0Var, e) : null;
                    if (e2 != null) {
                        g89 a = g89.a(g89Var2, e2, null, 13);
                        arrayList.set(i3, a);
                        a.b.a.add(new h89(this, a));
                        a(a);
                    }
                    if (e.getMessage() == null) {
                        pyp0Var.getA();
                    }
                    a1q0 a1q0Var = this.e;
                    if (a1q0Var != null) {
                        a1q0Var.g(g89Var2.a.a, pyp0Var, e);
                    }
                }
            }
            g89 g89Var3 = (g89) arrayList.get(i3);
            if (g89Var3.d || (i2 = i2 + g89Var3.c.size()) >= i) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        boolean z;
        boolean z2 = true;
        this.n = true;
        if (this.m) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.g;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            g89 g89Var = (g89) it.next();
            if (!g89Var.b.b) {
                break;
            } else {
                arrayList.add(new b4q0(g89Var.a, g89Var.c));
            }
        }
        Iterator it2 = arrayList2.iterator();
        boolean z3 = false;
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            g89 g89Var2 = (g89) it2.next();
            if (!g89Var2.b.b) {
                z = true;
                break;
            }
            z3 = g89Var2.d;
        }
        if (!this.k && !z3 && !z) {
            z2 = false;
        }
        if (!jl40.l(this.i, arrayList) || this.j != z2) {
            this.i = arrayList;
            this.j = z2;
            Iterator it3 = this.h.iterator();
            while (it3.hasNext()) {
                ((c6q0) it3.next()).a(this.i, this.j);
            }
        }
        this.n = false;
    }

    public final void e() {
        e89 e89Var = this.l;
        if (e89Var != null) {
            c cVar = (c) e89Var.b;
            nie nieVar = (nie) e89Var.c;
            vke vkeVar = cVar.e0;
            boolean z = vkeVar instanceof uke;
            ske skeVar = ske.a;
            if (z) {
                cVar.e0 = skeVar;
                cVar.j(((uke) vkeVar).a);
            } else if (vkeVar instanceof tke) {
                cVar.e0 = skeVar;
                cVar.b.b(((tke) vkeVar).a, new pxl(nieVar.d), b.f());
            }
        }
    }
}
