package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class r0a0<K, V> implements Iterator<K>, gcy {
    public final s0a0<K, V> b;

    public r0a0(f0a0<K, V> f0a0Var) {
        this.b = new s0a0<>(f0a0Var.b, f0a0Var.d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        s0a0<K, V> s0a0Var = this.b;
        K k = (K) s0a0Var.b;
        s0a0Var.next();
        return k;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
