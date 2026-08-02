package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public class w implements Iterator {
    public final Iterator b;
    public final Collection c;
    public final /* synthetic */ x d;

    public w(x xVar) {
        this.d = xVar;
        Collection collection = xVar.c;
        this.c = collection;
        this.b = a0.a(collection);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.d.c();
        if (this.d.c == this.c) {
            return this.b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.d.c();
        if (this.d.c == this.c) {
            return this.b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
        x xVar = this.d;
        a0 a0Var = xVar.f;
        a0Var.g--;
        xVar.d();
    }

    public w(x xVar, ListIterator listIterator) {
        this.d = xVar;
        this.c = xVar.c;
        this.b = listIterator;
    }
}
