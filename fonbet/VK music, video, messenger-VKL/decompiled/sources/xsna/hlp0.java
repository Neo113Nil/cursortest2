package xsna;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
/* loaded from: classes13.dex */
public abstract class hlp0<F, T> implements Iterator<T> {
    public final Iterator<? extends F> b;

    public hlp0(Iterator<? extends F> it) {
        it.getClass();
        this.b = it;
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
