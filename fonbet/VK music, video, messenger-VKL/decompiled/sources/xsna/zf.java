package xsna;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractMutableMap.kt */
/* loaded from: classes8.dex */
public abstract class zf<K, V> extends AbstractMap<K, V> implements Map<K, V>, kcy {
    public abstract Set<Map.Entry<K, V>> a();

    public abstract /* bridge */ Set<Object> b();

    public abstract /* bridge */ Collection<Object> c();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public abstract /* bridge */ int getSize();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) c();
    }
}
