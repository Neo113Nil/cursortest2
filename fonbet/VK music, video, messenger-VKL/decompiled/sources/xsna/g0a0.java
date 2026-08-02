package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: PersistentOrderedMapBuilder.kt */
/* loaded from: classes8.dex */
public final class g0a0<K, V> extends zf<K, V> {
    public f0a0<K, V> b;
    public Object c;
    public Object d;
    public final zy90<K, odz<V>> e;

    /* compiled from: PersistentOrderedMapBuilder.kt */
    public static final class a extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentOrderedMapBuilder.kt */
    public static final class b extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, ((odz) obj2).a));
        }
    }

    /* compiled from: PersistentOrderedMapBuilder.kt */
    public static final class c extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, obj2));
        }
    }

    /* compiled from: PersistentOrderedMapBuilder.kt */
    public static final class d extends Lambda implements wzs<odz<V>, ?, Boolean> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(epx.f(((odz) obj).a, obj2));
        }
    }

    public g0a0(f0a0<K, V> f0a0Var) {
        this.b = f0a0Var;
        this.c = f0a0Var.b;
        this.d = f0a0Var.c;
        vy90<K, odz<V>> vy90Var = f0a0Var.d;
        vy90Var.getClass();
        this.e = new zy90<>(vy90Var);
    }

    @Override // xsna.zf
    public final Set<Map.Entry<K, V>> a() {
        return new h0a0(this);
    }

    @Override // xsna.zf
    public final Set<K> b() {
        return new j0a0(this);
    }

    @Override // xsna.zf
    public final Collection<V> c() {
        return new m0a0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e.clear();
        po40 po40Var = po40.e;
        this.c = po40Var;
        this.d = po40Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        zy90<K, odz<V>> zy90Var = this.e;
        Map map = (Map) obj;
        if (zy90Var.size() != map.size()) {
            return false;
        }
        if (map instanceof f0a0) {
            return zy90Var.d.g(((f0a0) obj).d.b, a.i);
        }
        if (map instanceof g0a0) {
            return zy90Var.d.g(((g0a0) obj).e.d, b.i);
        }
        if (map instanceof vy90) {
            return zy90Var.d.g(((vy90) obj).b, c.i);
        }
        if (map instanceof zy90) {
            return zy90Var.d.g(((zy90) obj).d, d.i);
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
        odz<V> odzVar = this.e.get(obj);
        if (odzVar == null) {
            return null;
        }
        return odzVar.a;
    }

    @Override // xsna.zf
    public final int getSize() {
        return this.e.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        po40 po40Var = po40.e;
        zy90<K, odz<V>> zy90Var = this.e;
        odz odzVar = (odz) zy90Var.get(k);
        if (odzVar != null) {
            V v2 = odzVar.a;
            if (v2 == v) {
                return v;
            }
            zy90Var.put(k, new odz(v, odzVar.b, odzVar.c));
            return v2;
        }
        if (isEmpty()) {
            this.c = k;
            this.d = k;
            zy90Var.put(k, new odz(v, po40Var, po40Var));
            return null;
        }
        Object obj = this.d;
        odz odzVar2 = (odz) zy90Var.get(obj);
        odzVar2.getClass();
        zy90Var.put(obj, new odz(odzVar2.a, odzVar2.b, k));
        zy90Var.put(k, new odz(v, obj, po40Var));
        this.d = k;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zy90<K, odz<V>> zy90Var = this.e;
        odz odzVar = (odz) zy90Var.remove(obj);
        if (odzVar == null) {
            return null;
        }
        Object obj2 = odzVar.c;
        Object obj3 = odzVar.b;
        Object obj4 = po40.e;
        if (obj3 != obj4) {
            odz odzVar2 = (odz) zy90Var.get(obj3);
            zy90Var.put(obj3, new odz(odzVar2.a, odzVar2.b, obj2));
        } else {
            this.c = obj2;
        }
        if (obj2 != obj4) {
            odz odzVar3 = (odz) zy90Var.get(obj2);
            zy90Var.put(obj2, new odz(odzVar3.a, obj3, odzVar3.c));
        } else {
            this.d = obj3;
        }
        return odzVar.a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        odz<V> odzVar = this.e.get(obj);
        if (odzVar == null || !epx.f(odzVar.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
