package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentOrderedMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class p0a0<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, gcy {
    public final s0a0<K, V> b;

    public p0a0(f0a0<K, V> f0a0Var) {
        this.b = new s0a0<>(f0a0Var.b, f0a0Var.d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        s0a0<K, V> s0a0Var = this.b;
        return new bl00(s0a0Var.b, s0a0Var.next().a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
