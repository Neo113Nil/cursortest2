package xsna;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PersistentOrderedSetIterator.kt */
/* loaded from: classes11.dex */
public final class w0a0<E> implements Iterator<E>, gcy {
    public Object b;
    public final Map<E, pdz> c;
    public int d;

    public w0a0(Object obj, Map<E, pdz> map) {
        this.b = obj;
        this.c = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.b;
        this.d++;
        pdz pdzVar = this.c.get(e);
        if (pdzVar == null) {
            throw new ConcurrentModificationException(so.a(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.b = pdzVar.b;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
