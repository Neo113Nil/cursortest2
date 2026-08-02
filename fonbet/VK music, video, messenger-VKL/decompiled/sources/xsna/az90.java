package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xsna.d0a0;

/* compiled from: PersistentHashMapBuilder.kt */
/* loaded from: classes11.dex */
public class az90<K, V> extends zf<K, V> implements d0a0.a<K, V> {
    public wy90<K, V> b;
    public d02 c = new d02();
    public gqp0<K, V> d;
    public V e;
    public int f;
    public int g;

    public az90(wy90<K, V> wy90Var) {
        this.b = wy90Var;
        this.d = wy90Var.b;
        this.g = wy90Var.c;
    }

    @Override // xsna.zf
    public final Set<Map.Entry<K, V>> a() {
        return new ez90(this);
    }

    @Override // xsna.zf
    public final Set<K> b() {
        return new iz90(this);
    }

    @Override // xsna.zf
    public final Collection<V> c() {
        return new mz90(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d = gqp0.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // xsna.d0a0.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public wy90<K, V> build() {
        gqp0<K, V> gqp0Var = this.d;
        wy90<K, V> wy90Var = this.b;
        if (gqp0Var != wy90Var.b) {
            this.c = new d02();
            wy90Var = new wy90<>(this.d, getSize());
        }
        this.b = wy90Var;
        return wy90Var;
    }

    public final void e(int i) {
        this.g = i;
        this.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // xsna.zf
    public final int getSize() {
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.e = null;
        this.d = this.d.l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        wy90<K, V> wy90Var = null;
        wy90<K, V> wy90Var2 = map instanceof wy90 ? (wy90) map : null;
        if (wy90Var2 == null) {
            az90 az90Var = map instanceof az90 ? (az90) map : null;
            if (az90Var != null) {
                wy90Var = az90Var.build();
            }
        } else {
            wy90Var = wy90Var2;
        }
        if (wy90Var == null) {
            super.putAll(map);
            return;
        }
        zyl zylVar = new zyl(0);
        int i = this.g;
        this.d = this.d.m(wy90Var.b, 0, zylVar, this);
        int i2 = (wy90Var.c + i) - zylVar.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = getSize();
        gqp0<K, V> o = this.d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = gqp0.e;
        }
        this.d = o;
        return size != getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.e = null;
        gqp0<K, V> n = this.d.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = gqp0.e;
        }
        this.d = n;
        return this.e;
    }
}
