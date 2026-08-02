package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
/* loaded from: classes13.dex */
public abstract class w9s<K, V> extends x9s implements Map<K, V> {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // xsna.x9s
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public boolean standardContainsValue(Object obj) {
        nn00 nn00Var = new nn00(entrySet().iterator());
        if (obj == null) {
            while (nn00Var.hasNext()) {
                if (nn00Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (nn00Var.hasNext()) {
            if (obj.equals(nn00Var.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean standardEquals(Object obj) {
        return com.google.common.collect.e.b(obj, this);
    }

    public int standardHashCode() {
        return com.google.common.collect.l.c(entrySet());
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return delegate().values();
    }
}
