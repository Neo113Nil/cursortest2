package xsna;

import java.util.Iterator;

/* compiled from: PeekingIterator.kt */
/* loaded from: classes17.dex */
public final class ws90<T> implements Iterator<T>, gcy {
    public static final Object d = new Object();
    public final Iterator<T> b;
    public Object c = d;

    /* JADX WARN: Multi-variable type inference failed */
    public ws90(Iterator<? extends T> it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.b.next();
        this.c = next;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
