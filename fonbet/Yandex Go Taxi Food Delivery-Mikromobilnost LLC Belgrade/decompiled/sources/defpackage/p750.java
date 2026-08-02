package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class p750 {
    public final r0 a = bvf0.c(q750.f);
    public final r0 b;
    public final gci0 c;
    public final x43 d;
    public final x43 e;
    public l750 f;
    public int g;
    public o750 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public p750() {
        r0 c = bvf0.c(new m750());
        this.b = c;
        this.c = e.d(c);
        this.d = new x43();
        this.e = new x43();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(j750 j750Var, o750 o750Var, int i) {
        if (o750Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(o750Var);
            o750Var.a = j750Var;
            o750Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(o750Var);
        j750 j750Var2 = o750Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(j750Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        m750 m750Var;
        x43 x43Var = this.d;
        if (x43Var == null || !x43Var.isEmpty()) {
            Iterator it = x43Var.iterator();
            while (it.hasNext()) {
                if (((l750) it.next()).a()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        x43 x43Var2 = this.e;
        if (x43Var2 == null || !x43Var2.isEmpty()) {
            Iterator it2 = x43Var2.iterator();
            while (it2.hasNext()) {
                if (((l750) it2.next()).a()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((o750) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((o750) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((o750) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        l750 l750Var = this.f;
        if (l750Var == null) {
            l750Var = c(0);
        }
        l750 l750Var2 = this.f;
        if (l750Var2 == null) {
            l750Var2 = c(0);
        }
        if (jl40.l(l750Var2, l750Var)) {
            if (l750Var2 == null) {
                m750Var = new m750();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = x43Var.iterator();
                while (it6.hasNext()) {
                    ((l750) it6.next()).a();
                }
                Iterator<E> it7 = x43Var2.iterator();
                while (it7.hasNext()) {
                    ((l750) it7.next()).a();
                }
                n750 n750Var = l750Var2.a;
                ListBuilder a = rcc.a();
                ycc.r(arrayList, a);
                a.add(n750Var);
                ycc.r(EmptyList.a, a);
                m750Var = new m750(a.j(), arrayList.size());
            }
            r0 r0Var = this.b;
            if (jl40.l((m750) r0Var.getValue(), m750Var)) {
                return;
            }
            r0Var.m(null, m750Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((o750) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((o750) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((o750) it10.next()).getClass();
            }
        }
    }

    public final l750 c(int i) {
        Object obj;
        Object obj2;
        x43 x43Var = this.e;
        x43 x43Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = x43Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((l750) obj).a()) {
                    break;
                }
            }
            l750 l750Var = (l750) obj;
            if (l750Var != null) {
                return l750Var;
            }
            Iterator it2 = x43Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((l750) next).a()) {
                    obj3 = next;
                    break;
                }
            }
            return (l750) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = x43Var2.iterator();
            while (it3.hasNext()) {
                ((l750) it3.next()).getClass();
            }
            Iterator it4 = x43Var.iterator();
            while (it4.hasNext()) {
                ((l750) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = x43Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((l750) obj2).a()) {
                break;
            }
        }
        l750 l750Var2 = (l750) obj2;
        if (l750Var2 != null) {
            return l750Var2;
        }
        Iterator it6 = x43Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((l750) next2).a()) {
                obj3 = next2;
                break;
            }
        }
        return (l750) obj3;
    }
}
