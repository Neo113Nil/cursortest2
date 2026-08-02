package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class n0a0<K, V> implements Iterator<V>, gcy {
    public final l0a0<K, V> b;

    public n0a0(g0a0<K, V> g0a0Var) {
        this.b = new l0a0<>(g0a0Var.c, g0a0Var);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return this.b.next().a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
