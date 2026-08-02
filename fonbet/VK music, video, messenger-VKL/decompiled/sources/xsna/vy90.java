package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: PersistentHashMap.kt */
/* loaded from: classes8.dex */
public final class vy90<K, V> extends jf<K, V> implements e0a0<K, V> {
    public static final vy90 d = new vy90(hqp0.e, 0);
    public final hqp0<K, V> b;
    public final int c;

    /* compiled from: PersistentHashMap.kt */
    public static final class a extends Lambda implements wzs<V, ?, Boolean> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentHashMap.kt */
    public static final class b extends Lambda implements wzs<V, ?, Boolean> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentHashMap.kt */
    public static final class c extends Lambda implements wzs<V, ?, Boolean> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, obj2));
        }
    }

    /* compiled from: PersistentHashMap.kt */
    public static final class d extends Lambda implements wzs<V, ?, Boolean> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(obj, obj2));
        }
    }

    public vy90(hqp0<K, V> hqp0Var, int i) {
        this.b = hqp0Var;
        this.c = i;
    }

    @Override // xsna.jf
    public final Set<Map.Entry<K, V>> b() {
        return new pz90(this);
    }

    @Override // xsna.jf
    public final Set c() {
        return new tz90(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // xsna.jf
    public final Collection d() {
        return new xz90(this);
    }

    @Override // xsna.jf, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getSize() != map.size()) {
            return false;
        }
        boolean z = map instanceof f0a0;
        hqp0<K, V> hqp0Var = this.b;
        return z ? hqp0Var.g(((f0a0) obj).d.b, a.i) : map instanceof g0a0 ? hqp0Var.g(((g0a0) obj).e.d, b.i) : map instanceof vy90 ? hqp0Var.g(((vy90) obj).b, c.i) : map instanceof zy90 ? hqp0Var.g(((zy90) obj).d, d.i) : super.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.b.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // xsna.jf
    public final int getSize() {
        return this.c;
    }
}
