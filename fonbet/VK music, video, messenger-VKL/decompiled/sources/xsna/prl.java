package xsna;

import java.util.WeakHashMap;

/* compiled from: DefaultWeakHashMap.kt */
/* loaded from: classes17.dex */
public final class prl<K, V> extends WeakHashMap<K, V> {
    public final Integer b = 0;

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) super.get(obj);
        return v == null ? (V) this.b : v;
    }
}
