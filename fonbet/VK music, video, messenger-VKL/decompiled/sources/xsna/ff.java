package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* loaded from: classes11.dex */
public abstract class ff<E> extends qd<E> implements List<E> {
    public static final a Companion = new a();
    private static final int maxArraySize = 2147483639;

    /* compiled from: AbstractList.kt */
    public static final class a {
        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder a = odj.a(i, i2, "startIndex: ", ", endIndex: ", ", size: ");
                a.append(i3);
                throw new IndexOutOfBoundsException(a.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(efz.a(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder a = odj.a(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
                a.append(i3);
                throw new IndexOutOfBoundsException(a.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(efz.a(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - ff.maxArraySize <= 0) {
                return i3;
            }
            if (i2 > ff.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return ff.maxArraySize;
        }
    }

    /* compiled from: AbstractList.kt */
    public class b implements Iterator<E>, gcy {
        public int b;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < ff.this.size();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.b = i + 1;
            return ff.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes8.dex */
    public class c extends ff<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            a aVar = ff.Companion;
            int size = ff.this.size();
            aVar.getClass();
            a.c(i, size);
            this.b = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.b - 1;
            this.b = i;
            return ff.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes8.dex */
    public static final class d<E> extends ff<E> implements RandomAccess {
        public final ff<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ff<? extends E> ffVar, int i, int i2) {
            this.b = ffVar;
            this.c = i;
            a aVar = ff.Companion;
            int size = ffVar.size();
            aVar.getClass();
            a.d(i, i2, size);
            this.d = i2 - i;
        }

        @Override // xsna.ff, java.util.List
        public final E get(int i) {
            ff.Companion.getClass();
            a.b(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // xsna.ff, xsna.qd
        public final int getSize() {
            return this.d;
        }

        @Override // xsna.ff, java.util.List
        public final List<E> subList(int i, int i2) {
            ff.Companion.getClass();
            a.d(i, i2, this.d);
            int i3 = this.c;
            return new d(this.b, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        Companion.getClass();
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!epx.f(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    @Override // xsna.qd
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Companion.getClass();
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            E next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (epx.f(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (epx.f(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
