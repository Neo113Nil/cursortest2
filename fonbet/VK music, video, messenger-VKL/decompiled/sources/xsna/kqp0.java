package xsna;

import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes8.dex */
public final class kqp0<K, V> extends iqp0<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new bl00(objArr[i], objArr[i + 1]);
    }
}
