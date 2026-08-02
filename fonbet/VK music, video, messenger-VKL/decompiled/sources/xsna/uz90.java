package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes11.dex */
public final class uz90<K, V> extends sh<K> implements jpw<K> {
    public final wy90<K, V> b;

    public uz90(wy90<K, V> wy90Var) {
        this.b = wy90Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<K> iterator() {
        gqp0<K, V> gqp0Var = this.b.b;
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new nqp0();
        }
        return new wz90(gqp0Var, jqp0VarArr);
    }
}
