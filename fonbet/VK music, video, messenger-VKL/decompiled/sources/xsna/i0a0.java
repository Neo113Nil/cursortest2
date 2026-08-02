package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class i0a0<K, V> implements Iterator<Map.Entry<K, V>>, gcy {
    public final l0a0<K, V> b;

    public i0a0(g0a0<K, V> g0a0Var) {
        this.b = new l0a0<>(g0a0Var.c, g0a0Var);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        l0a0<K, V> l0a0Var = this.b;
        return new ch50(l0a0Var.c.e, l0a0Var.d, l0a0Var.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
