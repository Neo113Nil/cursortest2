package xsna;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class qqp0<K, V> extends iqp0<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.d;
        this.d = i + 2;
        return (V) this.b[i + 1];
    }
}
