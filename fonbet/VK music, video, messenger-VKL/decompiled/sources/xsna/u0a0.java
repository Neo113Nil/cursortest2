package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class u0a0<K, V> implements Iterator<V>, gcy {
    public final s0a0<K, V> b;

    public u0a0(f0a0<K, V> f0a0Var) {
        this.b = new s0a0<>(f0a0Var.b, f0a0Var.d);
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
