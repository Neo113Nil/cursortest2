package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class k0a0<K, V> implements Iterator<K>, gcy {
    public final l0a0<K, V> b;

    public k0a0(g0a0<K, V> g0a0Var) {
        this.b = new l0a0<>(g0a0Var.c, g0a0Var);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        l0a0<K, V> l0a0Var = this.b;
        l0a0Var.next();
        return (K) l0a0Var.d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
