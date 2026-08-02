package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes8.dex */
public final class pz90<K, V> extends sh<Map.Entry<? extends K, ? extends V>> {
    public final vy90<K, V> b;

    public pz90(vy90<K, V> vy90Var) {
        this.b = vy90Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        vy90<K, V> vy90Var = this.b;
        V v = vy90Var.get(key);
        Boolean valueOf = v == null ? null : Boolean.valueOf(v.equals(entry.getValue()));
        return valueOf == null ? entry.getValue() == null && vy90Var.containsKey(entry.getKey()) : valueOf.booleanValue();
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<Map.Entry<K, V>> iterator() {
        hqp0<K, V> hqp0Var = this.b.b;
        iqp0[] iqp0VarArr = new iqp0[8];
        for (int i = 0; i < 8; i++) {
            iqp0VarArr[i] = new kqp0();
        }
        return new rz90(hqp0Var, iqp0VarArr);
    }
}
