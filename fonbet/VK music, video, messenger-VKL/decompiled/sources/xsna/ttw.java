package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: IndexBasedArrayIterator.kt */
/* loaded from: classes.dex */
public abstract class ttw<T> implements Iterator<T>, gcy {
    public int b;
    public int c;
    public boolean d;

    public ttw(int i) {
        this.b = i;
    }

    public abstract T a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T a = a(this.c);
        this.c++;
        this.d = true;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            alk.C("Call next() before removing an element.");
            throw null;
        }
        int i = this.c - 1;
        this.c = i;
        b(i);
        this.b--;
        this.d = false;
    }
}
