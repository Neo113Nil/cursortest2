package xsna;

import java.util.concurrent.ConcurrentMap;
import xsna.vl00;

/* compiled from: ForwardingConcurrentMap.java */
/* loaded from: classes13.dex */
public abstract class f9s<K, V> extends w9s<K, V> implements ConcurrentMap<K, V> {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        return (V) ((vl00.b) this).c.putIfAbsent(k, v);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return ((vl00.b) this).c.remove(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        return (V) ((vl00.b) this).c.replace(k, v);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        return ((vl00.b) this).c.replace(k, v, v2);
    }
}
