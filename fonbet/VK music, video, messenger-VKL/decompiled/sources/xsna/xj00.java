package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MapCallbackWrapper.kt */
/* loaded from: classes2.dex */
public final class xj00<K, V> implements Map<K, V>, kcy {
    public final Map<K, V> b;

    public xj00(Map<K, V> map) {
        this.b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.b.clear();
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
    public final V get(Object obj) {
        return this.b.get(obj);
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
        return this.b.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        this.b.putAll(map);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return this.b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.b.values();
    }
}
