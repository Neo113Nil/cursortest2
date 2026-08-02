package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xsna.gqp0;

/* compiled from: PersistentHashMap.kt */
/* loaded from: classes11.dex */
public class wy90<K, V> extends jf<K, V> implements d0a0<K, V> {
    public static final wy90 d = new wy90(gqp0.e, 0);
    public final gqp0<K, V> b;
    public final int c;

    public wy90(gqp0<K, V> gqp0Var, int i) {
        this.b = gqp0Var;
        this.c = i;
    }

    @Override // xsna.jf
    public final Set<Map.Entry<K, V>> b() {
        return new qz90(this);
    }

    @Override // xsna.jf
    public final Set c() {
        return new uz90(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // xsna.jf
    public final Collection d() {
        return new yz90(this);
    }

    @Override // xsna.d0a0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public az90<K, V> builder() {
        return new az90<>(this);
    }

    public final wy90 f(Object obj, pdz pdzVar) {
        gqp0.a u = this.b.u(obj, obj != null ? obj.hashCode() : 0, 0, pdzVar);
        return u == null ? this : new wy90(u.a, this.c + u.b);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.b.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // xsna.jf
    public final int getSize() {
        return this.c;
    }
}
