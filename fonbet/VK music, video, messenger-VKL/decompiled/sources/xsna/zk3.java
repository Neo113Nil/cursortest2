package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class zk3<K, V> extends dpj0<K, V> implements Map<K, V> {

    @Nullable
    public zk3<K, V>.a e;

    @Nullable
    public zk3<K, V>.c f;

    @Nullable
    public zk3<K, V>.e g;

    /* compiled from: ArrayMap.java */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return zk3.this.d;
        }
    }

    /* compiled from: ArrayMap.java */
    public final class b extends ttw<K> {
        public b() {
            super(zk3.this.d);
        }

        @Override // xsna.ttw
        public final K a(int i) {
            return zk3.this.f(i);
        }

        @Override // xsna.ttw
        public final void b(int i) {
            zk3.this.h(i);
        }
    }

    /* compiled from: ArrayMap.java */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int b;
        public int c = -1;
        public boolean d;

        public d() {
            this.b = zk3.this.d - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.c;
            zk3 zk3Var = zk3.this;
            return epx.f(key, zk3Var.f(i)) && epx.f(entry.getValue(), zk3Var.j(this.c));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.d) {
                return zk3.this.f(this.c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.d) {
                return zk3.this.j(this.c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.c;
            zk3 zk3Var = zk3.this;
            K f = zk3Var.f(i);
            V j = zk3Var.j(this.c);
            return (f == null ? 0 : f.hashCode()) ^ (j != null ? j.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.c++;
            this.d = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.d) {
                throw new IllegalStateException();
            }
            zk3.this.h(this.c);
            this.c--;
            this.b--;
            this.d = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.d) {
                return zk3.this.i(this.c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    public final class f extends ttw<V> {
        public f() {
            super(zk3.this.d);
        }

        @Override // xsna.ttw
        public final V a(int i) {
            return zk3.this.j(i);
        }

        @Override // xsna.ttw
        public final void b(int i) {
            zk3.this.h(i);
        }
    }

    public zk3(@Nullable zk3 zk3Var) {
        super(0);
        if (zk3Var != null) {
            g(zk3Var);
        }
    }

    @Override // java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        zk3<K, V>.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        zk3<K, V>.a aVar2 = new a();
        this.e = aVar2;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<K> keySet() {
        zk3<K, V>.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        zk3<K, V>.c cVar2 = new c();
        this.f = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(@NonNull Collection<?> collection) {
        int i = this.d;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.d;
    }

    public final boolean m(@NonNull Collection<?> collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        b(map.size() + this.d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @NonNull
    public final Collection<V> values() {
        zk3<K, V>.e eVar = this.g;
        if (eVar != null) {
            return eVar;
        }
        zk3<K, V>.e eVar2 = new e();
        this.g = eVar2;
        return eVar2;
    }

    /* compiled from: ArrayMap.java */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            zk3.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return zk3.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(@NonNull Collection<?> collection) {
            return zk3.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            zk3 zk3Var = zk3.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (zk3Var.d == set.size()) {
                    return zk3Var.k(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            zk3 zk3Var = zk3.this;
            int i = 0;
            for (int i2 = zk3Var.d - 1; i2 >= 0; i2--) {
                K f = zk3Var.f(i2);
                i += f == null ? 0 : f.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return zk3.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            zk3 zk3Var = zk3.this;
            int d = zk3Var.d(obj);
            if (d < 0) {
                return false;
            }
            zk3Var.h(d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            return zk3.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            return zk3.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return zk3.this.d;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final Object[] toArray() {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = zk3Var.f(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = zk3Var.f(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    /* compiled from: ArrayMap.java */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            zk3.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return zk3.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return zk3.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            zk3 zk3Var = zk3.this;
            int a = zk3Var.a(obj);
            if (a < 0) {
                return false;
            }
            zk3Var.h(a);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(zk3Var.j(i2))) {
                    zk3Var.h(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(zk3Var.j(i2))) {
                    zk3Var.h(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return zk3.this.d;
        }

        @Override // java.util.Collection
        @NonNull
        public final Object[] toArray() {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = zk3Var.j(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            zk3 zk3Var = zk3.this;
            int i = zk3Var.d;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = zk3Var.j(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    public zk3() {
    }
}
