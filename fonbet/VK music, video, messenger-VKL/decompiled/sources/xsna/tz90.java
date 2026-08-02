package xsna;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes8.dex */
public final class tz90<K, V> extends sh<K> {
    public final vy90<K, V> b;

    public tz90(vy90<K, V> vy90Var) {
        this.b = vy90Var;
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
        hqp0<K, V> hqp0Var = this.b.b;
        iqp0[] iqp0VarArr = new iqp0[8];
        for (int i = 0; i < 8; i++) {
            iqp0VarArr[i] = new mqp0();
        }
        return new vz90(hqp0Var, iqp0VarArr);
    }
}
