package xsna;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.qy50;

/* compiled from: NavigationEventProcessor.kt */
/* loaded from: classes.dex */
public final class py50 {
    public final utk0 a = vtk0.a(qy50.a.a);
    public final utk0 b;
    public final b8f0 c;
    public final sk3<ly50<?>> d;
    public final sk3<ly50<?>> e;
    public ly50<?> f;
    public int g;
    public oy50 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public py50() {
        utk0 a = vtk0.a(new my50());
        this.b = a;
        this.c = rsr.f(a);
        this.d = new sk3<>();
        this.e = new sk3<>();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(jy50 jy50Var, oy50 oy50Var, int i) {
        if (oy50Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(oy50Var);
            oy50Var.a = jy50Var;
            oy50Var.c(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + oy50Var + "' is already added to dispatcher " + oy50Var.a + JwtParser.SEPARATOR_CHAR).toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        my50 my50Var;
        sk3<ly50<?>> sk3Var = this.d;
        if (sk3Var == null || !sk3Var.isEmpty()) {
            Iterator<ly50<?>> it = sk3Var.iterator();
            while (it.hasNext()) {
                if (it.next().d) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        sk3<ly50<?>> sk3Var2 = this.e;
        if (sk3Var2 == null || !sk3Var2.isEmpty()) {
            Iterator<ly50<?>> it2 = sk3Var2.iterator();
            while (it2.hasNext()) {
                if (it2.next().d) {
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
                ((oy50) it3.next()).c(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((oy50) it4.next()).c(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((oy50) it5.next()).c(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        ly50<?> ly50Var = this.f;
        if (ly50Var == null) {
            ly50Var = c(0);
        }
        ly50<?> ly50Var2 = this.f;
        if (ly50Var2 == null) {
            ly50Var2 = c(0);
        }
        if (epx.f(ly50Var2, ly50Var)) {
            if (ly50Var2 == null) {
                my50Var = new my50();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<ly50<?>> it6 = sk3Var.iterator();
                while (it6.hasNext()) {
                    ly50<?> next = it6.next();
                    if (next.d) {
                        next.b.getClass();
                    }
                }
                Iterator<ly50<?>> it7 = sk3Var2.iterator();
                while (it7.hasNext()) {
                    ly50<?> next2 = it7.next();
                    if (next2.d) {
                        next2.b.getClass();
                    }
                }
                T t = ly50Var2.a;
                EmptyList emptyList = ly50Var2.c;
                ListBuilder e = e43.e();
                g5g.y(arrayList, e);
                e.add(t);
                g5g.y(emptyList, e);
                my50Var = new my50(e.g(), arrayList.size());
            }
            utk0 utk0Var = this.b;
            if (epx.f((my50) utk0Var.getValue(), my50Var)) {
                return;
            }
            utk0Var.i(null, my50Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((oy50) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((oy50) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((oy50) it10.next()).getClass();
            }
        }
    }

    public final ly50<?> c(int i) {
        ly50<?> ly50Var;
        ly50<?> ly50Var2;
        sk3<ly50<?>> sk3Var = this.e;
        sk3<ly50<?>> sk3Var2 = this.d;
        ly50<?> ly50Var3 = null;
        if (i == -1) {
            Iterator<ly50<?>> it = sk3Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ly50Var = null;
                    break;
                }
                ly50Var = it.next();
                if (ly50Var.d) {
                    break;
                }
            }
            ly50<?> ly50Var4 = ly50Var;
            if (ly50Var4 != null) {
                return ly50Var4;
            }
            Iterator<ly50<?>> it2 = sk3Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ly50<?> next = it2.next();
                if (next.d) {
                    ly50Var3 = next;
                    break;
                }
            }
            return ly50Var3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator<ly50<?>> it3 = sk3Var2.iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
            }
            Iterator<ly50<?>> it4 = sk3Var.iterator();
            while (it4.hasNext()) {
                it4.next().getClass();
            }
            return null;
        }
        Iterator<ly50<?>> it5 = sk3Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                ly50Var2 = null;
                break;
            }
            ly50Var2 = it5.next();
            if (ly50Var2.d) {
                break;
            }
        }
        ly50<?> ly50Var5 = ly50Var2;
        if (ly50Var5 != null) {
            return ly50Var5;
        }
        Iterator<ly50<?>> it6 = sk3Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            ly50<?> next2 = it6.next();
            if (next2.d) {
                ly50Var3 = next2;
                break;
            }
        }
        return ly50Var3;
    }
}
