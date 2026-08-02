package xsna;

import androidx.annotation.RecentlyNullable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: EvictingQueue.kt */
/* loaded from: classes17.dex */
public class m1q<E> implements Queue<E> {
    public final int b;
    public final ArrayDeque c;

    public m1q() {
        this(0, 3);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(E e) {
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.size() == this.b) {
            remove();
        }
        return arrayDeque.add(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.c.containsAll(collection);
    }

    @Override // java.util.Queue
    public final E element() {
        return (E) this.c.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.c.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        return add(e);
    }

    @Override // java.util.Queue
    @RecentlyNullable
    public final E peek() {
        return (E) this.c.peek();
    }

    @Override // java.util.Queue
    @RecentlyNullable
    public final E poll() {
        return (E) this.c.poll();
    }

    @Override // java.util.Queue
    public final E remove() {
        return (E) this.c.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.c.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.c.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EvictingQueue (size: ");
        ArrayDeque arrayDeque = this.c;
        sb.append(arrayDeque.size());
        sb.append("): \n");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        Iterator<E> it = arrayDeque.iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String valueOf = String.valueOf(next);
            if (valueOf.length() > 500) {
                valueOf = valueOf.substring(0, 500);
            }
            jax0.a(i, ". ", valueOf, "\n", sb2);
            i = i2;
        }
        return sb2.toString();
    }

    public m1q(int i, int i2) {
        i = (i2 & 1) != 0 ? 8 : i;
        ArrayDeque arrayDeque = new ArrayDeque(i);
        this.b = i;
        this.c = arrayDeque;
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return this.c.remove(obj);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }
}
