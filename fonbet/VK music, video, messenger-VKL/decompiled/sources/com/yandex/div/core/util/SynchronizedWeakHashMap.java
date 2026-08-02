package com.yandex.div.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.c5g;
import xsna.on00;
import xsna.s3q0;

/* compiled from: SynchronizedWeakHashMap.kt */
/* loaded from: classes7.dex */
public final class SynchronizedWeakHashMap<K, N> extends WeakHashMap<K, N> {
    private final Object lock = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.lock) {
            super.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, N> createMap() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, N>> entrySet = entrySet();
            int e = on00.e(c5g.u(entrySet, 10));
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Pair pair = new Pair(entry.getKey(), entry.getValue());
                linkedHashMap.put(pair.i(), pair.j());
            }
        }
        return linkedHashMap;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, N>> entrySet() {
        return getEntries();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public N get(Object obj) {
        N n;
        synchronized (this.lock) {
            n = (N) super.get(obj);
        }
        return n;
    }

    public Set<Map.Entry<K, N>> getEntries() {
        Set<Map.Entry<K, N>> entrySet;
        synchronized (this.lock) {
            entrySet = super.entrySet();
        }
        return entrySet;
    }

    public Set<K> getKeys() {
        Set<K> keySet;
        synchronized (this.lock) {
            keySet = super.keySet();
        }
        return keySet;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public Collection<N> getValues() {
        Collection<N> values;
        synchronized (this.lock) {
            values = super.values();
        }
        return values;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public N put(K k, N n) {
        N n2;
        synchronized (this.lock) {
            n2 = (N) super.put(k, n);
        }
        return n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends N> map) {
        synchronized (this.lock) {
            super.putAll(map);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public N remove(Object obj) {
        N n;
        synchronized (this.lock) {
            n = (N) super.remove(obj);
        }
        return n;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<N> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.lock) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }
}
