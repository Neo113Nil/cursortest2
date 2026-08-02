package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: PersistentHashMapBuilder.kt */
/* loaded from: classes8.dex */
public final class zy90<K, V> extends zf<K, V> {
    public vy90<K, V> b;
    public fto0 c = new fto0();
    public hqp0<K, V> d;
    public V e;
    public int f;
    public int g;

    /* compiled from: PersistentHashMapBuilder.kt */
    public static final class a extends Lambda implements wzs<V, ?, Boolean> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, obj2));
        }
    }

    /* compiled from: PersistentHashMapBuilder.kt */
    public static final class b extends Lambda implements wzs<V, ?, Boolean> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, obj2));
        }
    }

    /* compiled from: PersistentHashMapBuilder.kt */
    public static final class c extends Lambda implements wzs<V, ?, Boolean> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentHashMapBuilder.kt */
    public static final class d extends Lambda implements wzs<V, ?, Boolean> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, ((odz) obj2).a));
        }
    }

    public zy90(vy90<K, V> vy90Var) {
        this.b = vy90Var;
        this.d = vy90Var.b;
        this.g = vy90Var.getSize();
    }

    @Override // xsna.zf
    public final Set<Map.Entry<K, V>> a() {
        return new dz90(this);
    }

    @Override // xsna.zf
    public final Set<K> b() {
        return new hz90(this);
    }

    @Override // xsna.zf
    public final Collection<V> c() {
        return new lz90(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d = hqp0.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    public final vy90<K, V> d() {
        hqp0<K, V> hqp0Var = this.d;
        vy90<K, V> vy90Var = this.b;
        if (hqp0Var != vy90Var.b) {
            this.c = new fto0();
            vy90Var = new vy90<>(this.d, getSize());
        }
        this.b = vy90Var;
        return vy90Var;
    }

    public final void e(int i) {
        this.g = i;
        this.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.g != map.size()) {
            return false;
        }
        if (map instanceof vy90) {
            return this.d.g(((vy90) obj).b, a.i);
        }
        if (map instanceof zy90) {
            return this.d.g(((zy90) obj).d, b.i);
        }
        if (map instanceof f0a0) {
            return this.d.g(((f0a0) obj).d.b, c.i);
        }
        if (map instanceof g0a0) {
            return this.d.g(((g0a0) obj).e.d, d.i);
        }
        if (getSize() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!cdi.v(this, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) this.d.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // xsna.zf
    public final int getSize() {
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.e = null;
        this.d = this.d.m(k == null ? 0 : k.hashCode(), k, v, 0, this);
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        vy90<K, V> vy90Var = null;
        vy90<K, V> vy90Var2 = map instanceof vy90 ? (vy90) map : null;
        if (vy90Var2 == null) {
            zy90 zy90Var = map instanceof zy90 ? (zy90) map : null;
            if (zy90Var != null) {
                vy90Var = zy90Var.d();
            }
        } else {
            vy90Var = vy90Var2;
        }
        if (vy90Var == null) {
            super.putAll(map);
            return;
        }
        yyl yylVar = new yyl(0);
        int i = this.g;
        this.d = this.d.n(vy90Var.b, 0, yylVar, this);
        int i2 = (vy90Var.c + i) - yylVar.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = getSize();
        hqp0<K, V> p = this.d.p(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (p == null) {
            p = hqp0.e;
        }
        this.d = p;
        return size != getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        this.e = null;
        hqp0<K, V> o = this.d.o(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (o == null) {
            o = hqp0.e;
        }
        this.d = o;
        return this.e;
    }
}
