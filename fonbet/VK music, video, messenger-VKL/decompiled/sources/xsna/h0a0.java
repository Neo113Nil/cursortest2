package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* loaded from: classes8.dex */
public final class h0a0<K, V> extends kf<Map.Entry<K, V>, K, V> {
    public final g0a0<K, V> b;

    public h0a0(g0a0<K, V> g0a0Var) {
        this.b = g0a0Var;
    }

    @Override // xsna.kf
    public final boolean a(Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        g0a0<K, V> g0a0Var = this.b;
        V v = g0a0Var.get(key);
        Boolean valueOf = v == null ? null : Boolean.valueOf(v.equals(entry.getValue()));
        return valueOf == null ? entry.getValue() == null && g0a0Var.containsKey(entry.getKey()) : valueOf.booleanValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.kf
    public final boolean b(Map.Entry<? extends K, ? extends V> entry) {
        return this.b.remove(entry.getKey(), entry.getValue());
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
        return new i0a0(this.b);
    }
}
