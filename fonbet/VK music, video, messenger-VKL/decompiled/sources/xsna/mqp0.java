package xsna;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class mqp0<K, V> extends iqp0<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.d;
        this.d = i + 2;
        return (K) this.b[i];
    }
}
