package xsna;

import java.util.Map;

/* compiled from: ScatterMap.kt */
/* loaded from: classes11.dex */
public final class cl00<K, V> implements Map.Entry<K, V>, gcy {
    public final K b;
    public final V c;

    public cl00(K k, V v) {
        this.b = k;
        this.c = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
