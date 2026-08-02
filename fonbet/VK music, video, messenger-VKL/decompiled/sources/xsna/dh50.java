package xsna;

import java.util.Map;
import java.util.NoSuchElementException;
import xsna.kcy;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes11.dex */
public final class dh50<K, V> extends al00<K, V> implements kcy.a {
    public final gz90<K, V> d;
    public V e;

    public dh50(gz90<K, V> gz90Var, K k, V v) {
        super(k, v);
        this.d = gz90Var;
        this.e = v;
    }

    @Override // xsna.al00, java.util.Map.Entry
    public final V getValue() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.al00, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.e;
        this.e = v;
        cz90<K, V, Map.Entry<K, V>> cz90Var = this.d.b;
        az90<K, V> az90Var = cz90Var.e;
        K k = this.b;
        if (!az90Var.containsKey(k)) {
            return v2;
        }
        boolean z = cz90Var.d;
        if (!z) {
            az90Var.put(k, v);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            jqp0 jqp0Var = cz90Var.b[cz90Var.c];
            Object obj = jqp0Var.b[jqp0Var.d];
            az90Var.put(k, v);
            cz90Var.c(obj != null ? obj.hashCode() : 0, az90Var.d, obj, 0);
        }
        cz90Var.h = az90Var.f;
        return v2;
    }
}
