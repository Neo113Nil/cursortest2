package xsna;

import java.util.NoSuchElementException;

/* compiled from: BufferIterator.kt */
/* loaded from: classes8.dex */
public final class fm8<T> extends gf<T> {
    public final T[] d;

    public fm8(T[] tArr, int i, int i2) {
        super(i, i2);
        this.d = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.d[i];
    }
}
