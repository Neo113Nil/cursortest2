package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes11.dex */
public final class yz90<K, V> extends qd<V> {
    public final wy90<K, V> b;

    public yz90(wy90<K, V> wy90Var) {
        this.b = wy90Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<V> iterator() {
        gqp0<K, V> gqp0Var = this.b.b;
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new rqp0();
        }
        return new a0a0(gqp0Var, jqp0VarArr);
    }
}
