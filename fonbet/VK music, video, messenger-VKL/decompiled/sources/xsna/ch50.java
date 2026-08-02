package xsna;

import java.util.Map;
import xsna.kcy;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public final class ch50<K, V> extends bl00<K, V> implements kcy.a {
    public final Map<K, odz<V>> d;
    public odz<V> e;

    public ch50(Map<K, odz<V>> map, K k, odz<V> odzVar) {
        super(k, odzVar.a);
        this.d = map;
        this.e = odzVar;
    }

    @Override // xsna.bl00, java.util.Map.Entry
    public final V getValue() {
        return this.e.a;
    }

    @Override // xsna.bl00, java.util.Map.Entry
    public final V setValue(V v) {
        odz<V> odzVar = this.e;
        V v2 = odzVar.a;
        odz<V> odzVar2 = new odz<>(v, odzVar.b, odzVar.c);
        this.e = odzVar2;
        this.d.put(this.b, odzVar2);
        return v2;
    }
}
