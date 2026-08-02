package yads;

import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class ae1 extends nb3 {
    public boolean b;
    public final /* synthetic */ Object c;

    public ae1(Object obj) {
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.c;
    }
}
