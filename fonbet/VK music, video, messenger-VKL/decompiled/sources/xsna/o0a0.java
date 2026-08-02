package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentOrderedMapContentViews.kt */
/* loaded from: classes8.dex */
public final class o0a0<K, V> extends sh<Map.Entry<? extends K, ? extends V>> {
    public final f0a0<K, V> b;

    public o0a0(f0a0<K, V> f0a0Var) {
        this.b = f0a0Var;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        f0a0<K, V> f0a0Var = this.b;
        V v = f0a0Var.get(key);
        Boolean valueOf = v == null ? null : Boolean.valueOf(v.equals(entry.getValue()));
        return valueOf == null ? entry.getValue() == null && f0a0Var.containsKey(entry.getKey()) : valueOf.booleanValue();
    }

    @Override // xsna.qd
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new p0a0(this.b);
    }
}
