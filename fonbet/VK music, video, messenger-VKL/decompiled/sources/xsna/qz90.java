package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes11.dex */
public final class qz90<K, V> extends sh<Map.Entry<? extends K, ? extends V>> implements jpw<Map.Entry<? extends K, ? extends V>> {
    public final wy90<K, V> b;

    public qz90(wy90<K, V> wy90Var) {
        this.b = wy90Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if ((obj instanceof Map.Entry) && (entry = (Map.Entry) obj) != null) {
            Object key = entry.getKey();
            wy90<K, V> wy90Var = this.b;
            V v = wy90Var.get(key);
            if (v != null) {
                return v.equals(entry.getValue());
            }
            if (entry.getValue() == null && wy90Var.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<Map.Entry<K, V>> iterator() {
        gqp0<K, V> gqp0Var = this.b.b;
        jqp0[] jqp0VarArr = new jqp0[8];
        for (int i = 0; i < 8; i++) {
            jqp0VarArr[i] = new lqp0();
        }
        return new sz90(gqp0Var, jqp0VarArr);
    }
}
