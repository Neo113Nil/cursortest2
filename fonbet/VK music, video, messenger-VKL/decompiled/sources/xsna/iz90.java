package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes11.dex */
public final class iz90<K, V> extends ag<K> {
    public final az90<K, V> b;

    public iz90(az90<K, V> az90Var) {
        this.b = az90Var;
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
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new nqp0();
        }
        return new kz90(this.b, jqp0VarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        az90<K, V> az90Var = this.b;
        if (!az90Var.containsKey(obj)) {
            return false;
        }
        az90Var.remove(obj);
        return true;
    }
}
