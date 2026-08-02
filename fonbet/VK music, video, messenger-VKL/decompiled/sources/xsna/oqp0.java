package xsna;

import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class oqp0<K, V> extends iqp0<K, V, Map.Entry<K, V>> {
    public final fz90<K, V> e;

    public oqp0(fz90<K, V> fz90Var) {
        this.e = fz90Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new bh50(this.e, objArr[i], objArr[i + 1]);
    }
}
