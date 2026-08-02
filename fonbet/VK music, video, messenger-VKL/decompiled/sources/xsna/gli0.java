package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class gli0 implements Iterator<Object>, gcy {
    public boolean b = true;
    public final /* synthetic */ Object c;

    public gli0(Object obj) {
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            throw new NoSuchElementException();
        }
        this.b = false;
        return this.c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
