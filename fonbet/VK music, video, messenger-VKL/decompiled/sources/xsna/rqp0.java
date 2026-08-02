package xsna;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public final class rqp0<K, V> extends jqp0<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.d;
        this.d = i + 2;
        return (V) this.b[i + 1];
    }
}
