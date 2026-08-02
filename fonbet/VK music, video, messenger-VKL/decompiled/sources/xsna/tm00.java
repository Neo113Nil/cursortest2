package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MapWithDefault.kt */
/* loaded from: classes8.dex */
public final class tm00<K, V> implements sm00<K, V> {
    public final Map<K, V> b;
    public final izs<K, V> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tm00(Map<K, ? extends V> map, izs<? super K, ? extends V> izsVar) {
        this.b = map;
        this.c = izsVar;
    }

    @Override // xsna.sm00
    public final V R2(K k) {
        Map<K, V> map = this.b;
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.c.invoke(k);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.b.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // xsna.sm00
    public final Map<K, V> v9() {
        return this.b;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
