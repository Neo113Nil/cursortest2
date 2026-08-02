package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public final class lz90<K, V> extends xf<V> {
    public final zy90<K, V> b;

    public lz90(zy90<K, V> zy90Var) {
        this.b = zy90Var;
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
        iqp0[] iqp0VarArr = new iqp0[8];
        for (int i = 0; i < 8; i++) {
            iqp0VarArr[i] = new qqp0();
        }
        return new nz90(this.b, iqp0VarArr);
    }
}
