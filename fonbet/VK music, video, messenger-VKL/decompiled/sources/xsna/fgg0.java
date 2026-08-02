package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ReversedViews.kt */
/* loaded from: classes8.dex */
public final class fgg0<T> extends ff<T> {
    public final List<T> b;

    /* compiled from: ReversedViews.kt */
    public static final class a implements ListIterator<T>, gcy {
        public final ListIterator<T> b;
        public final /* synthetic */ fgg0<T> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(fgg0<? extends T> fgg0Var, int i) {
            this.c = fgg0Var;
            this.b = fgg0Var.b.listIterator(g5g.x(i, fgg0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.b.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return e43.h(this.c) - this.b.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.b.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return e43.h(this.c) - this.b.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fgg0(List<? extends T> list) {
        this.b = list;
    }

    @Override // xsna.ff, java.util.List
    public final T get(int i) {
        return this.b.get(g5g.w(i, this));
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.b.size();
    }

    @Override // xsna.ff, xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
