package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.twf;

/* compiled from: NonHierarchicalDistanceBasedAlgorithmBridge.kt */
/* loaded from: classes3.dex */
public final class a670<T extends twf> extends z570<jbr0<? extends T>> implements xs1<T> {
    public rhh0 f;

    @Override // xsna.z570, xsna.ys1
    public final void I() {
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        rhh0Var.b();
    }

    @Override // xsna.z570, xsna.ys1
    public final Set<kwf<jbr0<T>>> K(float f) {
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        Set<jwf<T>> v = ((xs1) rhh0Var.b).v(f);
        ArrayList arrayList = new ArrayList(c5g.u(v, 10));
        Iterator<T> it = v.iterator();
        while (it.hasNext()) {
            arrayList.add(new ywf((jwf) it.next()));
        }
        return j5g.S0(arrayList);
    }

    @Override // xsna.xs1
    public final Collection<T> L() {
        Collection items = super.getItems();
        ArrayList arrayList = new ArrayList(c5g.u(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((jbr0) it.next()).a);
        }
        return arrayList;
    }

    @Override // xsna.xs1
    public final boolean P(T t) {
        return super.R(new jbr0(t));
    }

    @Override // xsna.z570, xsna.ys1
    public final boolean R(uwf uwfVar) {
        jbr0 jbr0Var = (jbr0) uwfVar;
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        return rhh0Var.P(jbr0Var.a);
    }

    @Override // xsna.z570, xsna.ys1
    public final boolean a(Collection<jbr0<T>> collection) {
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        Collection<jbr0<T>> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((jbr0) it.next()).a);
        }
        return ((xs1) rhh0Var.b).x(arrayList);
    }

    @Override // xsna.xs1
    public final void b() {
        super.I();
    }

    @Override // xsna.z570, xsna.ys1
    public final int g() {
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        return ((xs1) rhh0Var.b).t();
    }

    @Override // xsna.z570, xsna.ys1
    public final Collection<jbr0<T>> getItems() {
        rhh0 rhh0Var = this.f;
        if (rhh0Var == null) {
            rhh0Var = null;
        }
        Collection<T> L = ((xs1) rhh0Var.b).L();
        ArrayList arrayList = new ArrayList(c5g.u(L, 10));
        Iterator<T> it = L.iterator();
        while (it.hasNext()) {
            arrayList.add(new jbr0((twf) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.nc, xsna.ys1
    public final void lock() {
        throw null;
    }

    @Override // xsna.xs1
    public final int t() {
        return this.c;
    }

    @Override // xsna.nc, xsna.ys1
    public final void unlock() {
        throw null;
    }

    @Override // xsna.xs1
    public final Set<jwf<T>> v(float f) {
        Set K = super.K(f);
        ArrayList arrayList = new ArrayList(c5g.u(K, 10));
        Iterator it = K.iterator();
        while (it.hasNext()) {
            arrayList.add(new xwf((kwf) it.next()));
        }
        return j5g.S0(arrayList);
    }

    @Override // xsna.xs1
    public final boolean x(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jbr0((twf) it.next()));
        }
        return super.a(arrayList2);
    }
}
