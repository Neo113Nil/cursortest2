package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: ScatterMap.kt */
/* loaded from: classes11.dex */
public final class um00<K, V> implements Map<K, V>, gcy {
    public final g5h0<K, V> b;
    public aqp<K, V> c;
    public yhy<K, V> d;
    public dkr0<K, V> e;

    public um00(g5h0<K, V> g5h0Var) {
        this.b = g5h0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        aqp<K, V> aqpVar = this.c;
        if (aqpVar != null) {
            return aqpVar;
        }
        aqp<K, V> aqpVar2 = new aqp<>(this.b);
        this.c = aqpVar2;
        return aqpVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || um00.class != obj.getClass()) {
            return false;
        }
        return epx.f(this.b, ((um00) obj).b);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.b.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        yhy<K, V> yhyVar = this.d;
        if (yhyVar != null) {
            return yhyVar;
        }
        yhy<K, V> yhyVar2 = new yhy<>(this.b);
        this.d = yhyVar2;
        return yhyVar2;
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.e;
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        dkr0<K, V> dkr0Var = this.e;
        if (dkr0Var != null) {
            return dkr0Var;
        }
        dkr0<K, V> dkr0Var2 = new dkr0<>(this.b);
        this.e = dkr0Var2;
        return dkr0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
