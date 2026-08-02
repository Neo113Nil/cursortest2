package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterators.kt */
/* loaded from: classes8.dex */
public final class qk3 implements Iterator, gcy {
    public final boolean[] b;
    public int c;

    public qk3(boolean[] zArr) {
        this.b = zArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            boolean[] zArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return Boolean.valueOf(zArr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            this.c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
