package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes11.dex */
public final class mz90<K, V> extends xf<V> {
    public final az90<K, V> b;

    public mz90(az90<K, V> az90Var) {
        this.b = az90Var;
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
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new rqp0();
        }
        return new oz90(this.b, jqp0VarArr);
    }
}
