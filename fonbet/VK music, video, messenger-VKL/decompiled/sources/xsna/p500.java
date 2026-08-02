package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes8.dex */
public final class p500 implements Iterator, gcy {
    public final long b;
    public final long c;
    public boolean d;
    public long e;

    public p500(long j, long j2, long j3) {
        this.b = j3;
        this.c = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.d = z;
        this.e = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.e;
        if (j != this.c) {
            this.e = this.b + j;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
