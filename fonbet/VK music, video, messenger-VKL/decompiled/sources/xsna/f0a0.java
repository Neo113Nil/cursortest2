package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: PersistentOrderedMap.kt */
/* loaded from: classes8.dex */
public final class f0a0<K, V> extends jf<K, V> implements e0a0<K, V> {
    public static final f0a0 e;
    public final Object b;
    public final Object c;
    public final vy90<K, odz<V>> d;

    /* compiled from: PersistentOrderedMap.kt */
    public static final class a extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentOrderedMap.kt */
    public static final class b extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentOrderedMap.kt */
    public static final class c extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, obj2));
        }
    }

    /* compiled from: PersistentOrderedMap.kt */
    public static final class d extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, obj2));
        }
    }

    static {
        po40 po40Var = po40.e;
        e = new f0a0(po40Var, po40Var, vy90.d);
    }

    public f0a0(Object obj, Object obj2, vy90<K, odz<V>> vy90Var) {
        this.b = obj;
        this.c = obj2;
        this.d = vy90Var;
    }

    @Override // xsna.jf
    public final Set<Map.Entry<K, V>> b() {
        return new o0a0(this);
    }

    @Override // xsna.jf
    public final Set c() {
        return new q0a0(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // xsna.jf
    public final Collection d() {
        return new t0a0(this);
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
        vy90<K, odz<V>> vy90Var = this.d;
        return z ? vy90Var.b.g(((f0a0) obj).d.b, a.i) : map instanceof g0a0 ? vy90Var.b.g(((g0a0) obj).e.d, b.i) : map instanceof vy90 ? vy90Var.b.g(((vy90) obj).b, c.i) : map instanceof zy90 ? vy90Var.b.g(((zy90) obj).d, d.i) : super.equals(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        odz<V> odzVar = this.d.get(obj);
        if (odzVar == null) {
            return null;
        }
        return odzVar.a;
    }

    @Override // xsna.jf
    public final int getSize() {
        return this.d.size();
    }
}
