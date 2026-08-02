package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public final class j0a0<K, V> extends ag<K> {
    public final g0a0<K, V> b;

    public j0a0(g0a0<K, V> g0a0Var) {
        this.b = g0a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.e.containsKey(obj);
    }

    @Override // xsna.ag
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new k0a0(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g0a0<K, V> g0a0Var = this.b;
        if (!g0a0Var.e.containsKey(obj)) {
            return false;
        }
        g0a0Var.remove(obj);
        return true;
    }
}
