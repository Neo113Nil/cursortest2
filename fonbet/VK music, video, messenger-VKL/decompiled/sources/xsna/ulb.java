package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes8.dex */
public final class ulb implements Iterator, gcy {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public ulb(char c, char c2, int i) {
        this.b = i;
        this.c = c2;
        boolean z = false;
        if (i <= 0 ? epx.g(c, c2) >= 0 : epx.g(c, c2) <= 0) {
            z = true;
        }
        this.d = z;
        this.e = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
