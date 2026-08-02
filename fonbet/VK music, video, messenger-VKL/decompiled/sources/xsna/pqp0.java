package xsna;

import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes11.dex */
public final class pqp0<K, V> extends jqp0<K, V, Map.Entry<K, V>> {
    public final gz90<K, V> e;

    public pqp0(gz90<K, V> gz90Var) {
        this.e = gz90Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new dh50(this.e, objArr[i], objArr[i + 1]);
    }
}
