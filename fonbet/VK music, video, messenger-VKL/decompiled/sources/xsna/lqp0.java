package xsna;

import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public final class lqp0<K, V> extends jqp0<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new al00(objArr[i], objArr[i + 1]);
    }
}
