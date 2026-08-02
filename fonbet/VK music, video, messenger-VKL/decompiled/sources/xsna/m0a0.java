package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public final class m0a0<K, V> extends xf<V> {
    public final g0a0<K, V> b;

    public m0a0(g0a0<K, V> g0a0Var) {
        this.b = g0a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // xsna.xf
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new n0a0(this.b);
    }
}
