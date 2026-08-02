package xsna;

import com.ironsource.B5;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: ReadOnlyArrayMap.java */
/* loaded from: classes8.dex */
public final class g7f0<K, V> extends AbstractMap<K, V> {
    public final List<Object> b;
    public final int c;

    /* compiled from: ReadOnlyArrayMap.java */
    public final class a extends g7f0<K, V>.c<Map.Entry<K, V>> {
        public a() {
            super();
        }

        @Override // xsna.g7f0.c
        public final Object c(int i) {
            g7f0 g7f0Var = g7f0.this;
            return new AbstractMap.SimpleImmutableEntry(g7f0Var.b.get(i), g7f0Var.b.get(i + 1));
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    Object key = entry.getKey();
                    g7f0 g7f0Var = g7f0.this;
                    int a = g7f0Var.a(key);
                    if (a == -1) {
                        return false;
                    }
                    return g7f0Var.b.get(a + 1).equals(entry.getValue());
                }
            }
            return false;
        }
    }

    /* compiled from: ReadOnlyArrayMap.java */
    public final class b extends g7f0<K, V>.c<K> {
        public b() {
            super();
        }

        @Override // xsna.g7f0.c
        public final K c(int i) {
            return (K) g7f0.this.b.get(i);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g7f0.this.containsKey(obj);
        }
    }

    /* compiled from: ReadOnlyArrayMap.java */
    public final class d extends g7f0<K, V>.c<V> {
        public d() {
            super();
        }

        @Override // xsna.g7f0.c
        public final V c(int i) {
            return (V) g7f0.this.b.get(i + 1);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g7f0.this.containsValue(obj);
        }
    }

    public g7f0(List<Object> list) {
        this.b = list;
        this.c = list.size() / 2;
    }

    public static <K, V> Map<K, V> b(List<Object> list) {
        return list.isEmpty() ? Collections.EMPTY_MAP : new g7f0(list);
    }

    public final int a(Object obj) {
        int i = 0;
        while (true) {
            List<Object> list = this.b;
            if (i >= list.size()) {
                return -1;
            }
            if (obj.equals(list.get(i))) {
                return i;
            }
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj == null || a(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = 0;
        while (true) {
            List<Object> list = this.b;
            if (i >= list.size()) {
                return false;
            }
            if (list.get(i + 1).equals(obj)) {
                return true;
            }
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int a2;
        if (obj == null || (a2 = a(obj)) == -1) {
            return null;
        }
        return (V) this.b.get(a2 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder e = fw3.e("ReadOnlyArrayMap{");
        int i = 0;
        while (true) {
            List<Object> list = this.b;
            if (i >= list.size()) {
                e.setLength(e.length() - 1);
                e.append("}");
                return e.toString();
            }
            e.append(list.get(i));
            e.append(B5.U);
            e.append(list.get(i + 1));
            e.append(',');
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new d();
    }

    /* compiled from: ReadOnlyArrayMap.java */
    public abstract class c<E> implements Set<E> {

        /* compiled from: ReadOnlyArrayMap.java */
        public final class a implements Iterator<E> {
            public int b = 0;

            public a() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b < g7f0.this.b.size();
            }

            @Override // java.util.Iterator
            public final E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E e = (E) c.this.c(this.b);
                this.b += 2;
                return e;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public abstract E c(int i);

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            if (collection == null) {
                return false;
            }
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g7f0.this.c;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g7f0 g7f0Var = g7f0.this;
            Object[] objArr = new Object[g7f0Var.c];
            int i = 0;
            int i2 = 0;
            while (i < g7f0Var.b.size()) {
                objArr[i2] = c(i);
                i += 2;
                i2++;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int length = tArr.length;
            g7f0 g7f0Var = g7f0.this;
            int i = g7f0Var.c;
            if (length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < g7f0Var.b.size()) {
                tArr[i3] = c(i2);
                i2 += 2;
                i3++;
            }
            return tArr;
        }
    }
}
