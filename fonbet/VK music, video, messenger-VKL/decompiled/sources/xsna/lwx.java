package xsna;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* loaded from: classes13.dex */
public final class lwx {

    /* compiled from: Iterators.java */
    public static final class a<T> extends se<T> {
        public static final a e = new a(new Object[0]);
        public final T[] d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object[] objArr) {
            super(objArr.length, 0);
            this.d = objArr;
        }

        @Override // xsna.se
        public final T a(int i) {
            return this.d[i];
        }
    }

    /* compiled from: Iterators.java */
    public static class b<T> implements Iterator<T> {
        public Iterator<? extends T> b;
        public Iterator<? extends T> c;
        public Iterator<? extends Iterator<? extends T>> d;
        public ArrayDeque e;

        public b() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (true) {
                Iterator<? extends T> it2 = this.c;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.d;
                    if (it3 != null && it3.hasNext()) {
                        it = this.d;
                        break;
                    }
                    ArrayDeque arrayDeque = this.e;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.d = (Iterator) this.e.removeFirst();
                }
                it = null;
                this.d = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.c = next;
                if (next instanceof b) {
                    b bVar = (b) next;
                    this.c = bVar.c;
                    if (this.e == null) {
                        this.e = new ArrayDeque();
                    }
                    this.e.addFirst(this.d);
                    if (bVar.e != null) {
                        while (!bVar.e.isEmpty()) {
                            this.e.addFirst((Iterator) bVar.e.removeLast());
                        }
                    }
                    this.d = bVar.d;
                }
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.c;
            this.b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator<? extends T> it = this.b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.b = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Iterators.java */
    public static final class c implements Iterator<Object> {
        private static final /* synthetic */ c[] $VALUES;
        public static final c INSTANCE;

        static {
            c cVar = new c("INSTANCE", 0);
            INSTANCE = cVar;
            $VALUES = new c[]{cVar};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            fxc0.A(false, "no calls to next() since the last call to remove()");
        }
    }

    /* compiled from: Iterators.java */
    public static final class d<T> extends s4q0<T> {
        public final T b;
        public boolean c;

        public d(T t) {
            this.b = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c) {
                throw new NoSuchElementException();
            }
            this.c = true;
            return this.b;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <T> T b(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }
}
