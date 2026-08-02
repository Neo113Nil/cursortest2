package xsna;

import java.util.Set;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public abstract class tak0<K, V, E> implements Set<E>, pcy {
    public final hbk0<K, V> b;

    public tak0(hbk0<K, V> hbk0Var) {
        this.b = hbk0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }
}
