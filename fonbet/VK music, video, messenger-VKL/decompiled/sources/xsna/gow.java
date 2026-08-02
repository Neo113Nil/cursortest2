package xsna;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* loaded from: classes13.dex */
public final class gow<K, V> extends nf<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    public gow(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
