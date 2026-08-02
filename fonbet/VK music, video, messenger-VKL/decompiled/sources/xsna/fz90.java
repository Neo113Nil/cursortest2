package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class fz90<K, V> implements Iterator<Map.Entry<K, V>>, gcy {
    public final bz90<K, V, Map.Entry<K, V>> b;

    public fz90(zy90<K, V> zy90Var) {
        iqp0[] iqp0VarArr = new iqp0[8];
        for (int i = 0; i < 8; i++) {
            iqp0VarArr[i] = new oqp0(this);
        }
        this.b = new bz90<>(zy90Var, iqp0VarArr);
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
