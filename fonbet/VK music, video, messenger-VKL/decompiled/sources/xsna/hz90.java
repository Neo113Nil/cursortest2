package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public final class hz90<K, V> extends ag<K> {
    public final zy90<K, V> b;

    public hz90(zy90<K, V> zy90Var) {
        this.b = zy90Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // xsna.ag
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        iqp0[] iqp0VarArr = new iqp0[8];
        for (int i = 0; i < 8; i++) {
            iqp0VarArr[i] = new mqp0();
        }
        return new jz90(this.b, iqp0VarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zy90<K, V> zy90Var = this.b;
        if (!zy90Var.containsKey(obj)) {
            return false;
        }
        zy90Var.remove(obj);
        return true;
    }
}
