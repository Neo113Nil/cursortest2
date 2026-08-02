package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ReversedViews.kt */
/* loaded from: classes11.dex */
public final class egg0<T> extends yf<T> {
    public final List<T> b;

    /* compiled from: ReversedViews.kt */
    public static final class a implements ListIterator<T>, gcy {
        public final ListIterator<T> b;
        public final /* synthetic */ egg0<T> c;

        public a(egg0<T> egg0Var, int i) {
            this.c = egg0Var;
            this.b = egg0Var.b.listIterator(g5g.x(i, egg0Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            ListIterator<T> listIterator = this.b;
            listIterator.add(t);
            listIterator.previous();
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
            this.b.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.b.set(t);
        }
    }

    public egg0(List<T> list) {
        this.b = list;
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.b.add(g5g.x(i, this), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.get(g5g.w(i, this));
    }

    @Override // xsna.yf
    public final int getSize() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // xsna.yf
    public final T removeAt(int i) {
        return this.b.remove(g5g.w(i, this));
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.b.set(g5g.w(i, this), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
