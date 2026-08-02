package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public abstract class xx implements Iterator {
    public int b;
    public int c;
    public int d = -1;
    public final /* synthetic */ cy e;

    public xx(cy cyVar) {
        this.e = cyVar;
        this.b = cyVar.f;
        this.c = cyVar.b();
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e.f != this.b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object a = a(i);
        cy cyVar = this.e;
        int i2 = this.c + 1;
        if (i2 >= cyVar.g) {
            i2 = -1;
        }
        this.c = i2;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        cy cyVar = this.e;
        int i = cyVar.f;
        int i2 = this.b;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.d;
        if (!(i3 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.b = i2 + 32;
        cyVar.remove(cyVar.b(i3));
        cy cyVar2 = this.e;
        int i4 = this.c;
        cyVar2.getClass();
        this.c = i4 - 1;
        this.d = -1;
    }
}
