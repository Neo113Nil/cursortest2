package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class d0 extends AbstractCollection {
    public final /* synthetic */ e0 b;

    public d0(ty1 ty1Var) {
        this.b = ty1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a0 a0Var = (a0) this.b;
        Iterator it = a0Var.f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f.clear();
        a0Var.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = ((rj1) this.b.a().values()).iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.b;
        a0Var.getClass();
        return new j(a0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((a0) this.b).g;
    }
}
