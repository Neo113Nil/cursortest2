package xsna;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Lazy;

/* compiled from: LazyMapWrapper.kt */
/* loaded from: classes.dex */
public final class dwy<K, V> implements Map<K, V>, gcy {
    public final Map<K, Lazy<V>> b;
    public final bpn0 c = new bpn0(new dr4(this, 5));

    /* compiled from: LazyMapWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class a<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, gcy {
        public final Set<Map.Entry<K, Lazy<V>>> b;

        /* compiled from: LazyMapWrapper.kt */
        /* renamed from: xsna.dwy$a$a, reason: collision with other inner class name */
        public static final class C2766a extends we<Map.Entry<? extends K, ? extends V>> {
            public final Iterator<Map.Entry<K, Lazy<V>>> b;

            public C2766a(a<K, V> aVar) {
                this.b = aVar.b.iterator();
            }

            @Override // xsna.we
            public final void computeNext() {
                Iterator<Map.Entry<K, Lazy<V>>> it = this.b;
                if (it.hasNext()) {
                    setNext(a.a(it.next()));
                } else {
                    done();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<? extends Map.Entry<? extends K, ? extends Lazy<? extends V>>> set) {
            this.b = set;
        }

        public static AbstractMap.SimpleEntry a(Map.Entry entry) {
            return new AbstractMap.SimpleEntry(entry.getKey(), ((Lazy) entry.getValue()).getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Set<Map.Entry<K, Lazy<V>>> set = this.b;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (a((Map.Entry) it.next()).equals(entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Collection<?> collection2 = collection;
            if (collection2.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Set<Map.Entry<K, Lazy<V>>> set = this.b;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (a((Map.Entry) it2.next()).equals(entry)) {
                        break;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C2766a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return this.b.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dwy(Map<K, ? extends Lazy<? extends V>> map) {
        this.b = map;
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
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, Lazy<V>> map = this.b;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<K, Lazy<V>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (epx.f(it.next().getValue().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return (Set) this.c.getValue();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Lazy<V> lazy = this.b.get(obj);
        if (lazy != null) {
            return lazy.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.b.keySet();
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
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new fqy(this.b.values());
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
