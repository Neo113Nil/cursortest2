package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes11.dex */
public final class gz90<K, V> implements Iterator<Map.Entry<K, V>>, gcy {
    public final cz90<K, V, Map.Entry<K, V>> b;

    public gz90(az90<K, V> az90Var) {
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new pqp0(this);
        }
        this.b = new cz90<>(az90Var, jqp0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
