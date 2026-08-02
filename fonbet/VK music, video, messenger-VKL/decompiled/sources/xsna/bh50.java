package xsna;

import java.util.Map;
import java.util.NoSuchElementException;
import xsna.kcy;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class bh50<K, V> extends bl00<K, V> implements kcy.a {
    public final fz90<K, V> d;
    public V e;

    public bh50(fz90<K, V> fz90Var, K k, V v) {
        super(k, v);
        this.d = fz90Var;
        this.e = v;
    }

    @Override // xsna.bl00, java.util.Map.Entry
    public final V getValue() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bl00, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.e;
        this.e = v;
        bz90<K, V, Map.Entry<K, V>> bz90Var = this.d.b;
        zy90<K, V> zy90Var = bz90Var.e;
        K k = this.b;
        if (!zy90Var.containsKey(k)) {
            return v2;
        }
        boolean z = bz90Var.d;
        if (!z) {
            zy90Var.put(k, v);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            iqp0 iqp0Var = bz90Var.b[bz90Var.c];
            Object obj = iqp0Var.b[iqp0Var.d];
            zy90Var.put(k, v);
            bz90Var.c(obj == null ? 0 : obj.hashCode(), zy90Var.d, obj, 0);
        }
        bz90Var.h = zy90Var.f;
        return v2;
    }
}
