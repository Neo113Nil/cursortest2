package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes11.dex */
public final class ez90<K, V> extends lf<Map.Entry<K, V>, K, V> {
    public final az90<K, V> b;

    public ez90(az90<K, V> az90Var) {
        this.b = az90Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.ag
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new gz90(this.b);
    }
}
