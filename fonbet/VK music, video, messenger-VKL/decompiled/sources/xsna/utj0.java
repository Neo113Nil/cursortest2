package xsna;

import java.util.NoSuchElementException;

/* compiled from: AbstractListIterator.kt */
/* loaded from: classes11.dex */
public final class utj0<E> extends hf<E> {
    public final E d;

    public utj0(E e, int i) {
        super(i, 1);
        this.d = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        return this.d;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b--;
        return this.d;
    }
}
