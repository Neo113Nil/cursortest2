package xsna;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public final class nqp0<K, V> extends jqp0<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.d;
        this.d = i + 2;
        return (K) this.b[i];
    }
}
