package xsna;

import java.util.Iterator;

/* compiled from: PersistentOrderedMapContentViews.kt */
/* loaded from: classes8.dex */
public final class q0a0<K, V> extends sh<K> {
    public final f0a0<K, V> b;

    public q0a0(f0a0<K, V> f0a0Var) {
        this.b = f0a0Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.d.containsKey(obj);
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<K> iterator() {
        return new r0a0(this.b);
    }
}
