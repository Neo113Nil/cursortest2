package xsna;

import java.util.Iterator;

/* compiled from: Iterators.kt */
/* loaded from: classes8.dex */
public final class ztw<T> implements Iterator<xtw<? extends T>>, gcy {
    public final Iterator<T> b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    public ztw(Iterator<? extends T> it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 1;
        if (i >= 0) {
            return new xtw(i, this.b.next());
        }
        e43.t();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
