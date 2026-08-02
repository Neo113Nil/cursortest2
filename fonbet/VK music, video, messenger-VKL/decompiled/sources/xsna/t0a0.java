package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapContentViews.kt */
/* loaded from: classes8.dex */
public final class t0a0<K, V> extends qd<V> {
    public final f0a0<K, V> b;

    public t0a0(f0a0<K, V> f0a0Var) {
        this.b = f0a0Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<V> iterator() {
        return new u0a0(this.b);
    }
}
