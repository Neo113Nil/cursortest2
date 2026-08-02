package xsna;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes11.dex */
public abstract class lf<E extends Map.Entry<? extends K, ? extends V>, K, V> extends ag<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) != null) {
            Object key = entry.getKey();
            az90<K, V> az90Var = ((ez90) this).b;
            V v = az90Var.get(key);
            if (v != null) {
                return v.equals(entry.getValue());
            }
            if (entry.getValue() == null && az90Var.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return ((ez90) this).b.remove(entry.getKey(), entry.getValue());
    }
}
