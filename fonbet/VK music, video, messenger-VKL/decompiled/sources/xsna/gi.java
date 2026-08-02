package xsna;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import xsna.npm0;

/* compiled from: AbstractWeakConcurrentMap.java */
/* loaded from: classes8.dex */
public abstract class gi<K, V, L> extends ReferenceQueue<K> implements Runnable, Iterable<Map.Entry<K, V>> {
    public final ConcurrentHashMap b;

    /* compiled from: AbstractWeakConcurrentMap.java */
    public class a implements Iterator<Map.Entry<K, V>> {
        public final Iterator<Map.Entry<c<K>, V>> b;
        public Map.Entry<c<K>, V> c;
        public K d;

        public a(gi giVar, Iterator it) {
            this.b = it;
            a();
        }

        public final void a() {
            K k;
            do {
                Iterator<Map.Entry<c<K>, V>> it = this.b;
                if (!it.hasNext()) {
                    this.c = null;
                    this.d = null;
                    return;
                } else {
                    Map.Entry<c<K>, V> next = it.next();
                    this.c = next;
                    k = next.getKey().get();
                    this.d = k;
                }
            } while (k == null);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            K k = this.d;
            if (k == null) {
                throw new NoSuchElementException();
            }
            try {
                return new b(k, this.c);
            } finally {
                a();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AbstractWeakConcurrentMap.java */
    public class b implements Map.Entry<K, V> {
        public final K b;
        public final Map.Entry<c<K>, V> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, Map.Entry entry) {
            this.b = obj;
            this.c = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c.getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            v.getClass();
            return this.c.setValue(v);
        }
    }

    /* compiled from: AbstractWeakConcurrentMap.java */
    public static final class c<K> extends WeakReference<K> {
        public final int a;

        public c(npm0.c cVar, ReferenceQueue referenceQueue) {
            super(cVar, referenceQueue);
            this.a = System.identityHashCode(cVar);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c ? ((c) obj).get() == get() : obj.equals(this);
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return String.valueOf(get());
        }
    }

    public gi(ConcurrentHashMap concurrentHashMap) {
        this.b = concurrentHashMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new a(this, this.b.entrySet().iterator());
    }

    public final String toString() {
        return this.b.toString();
    }
}
