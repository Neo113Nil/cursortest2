package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.xow;

/* compiled from: AbstractPersistentList.kt */
/* loaded from: classes8.dex */
public abstract class eg<E> extends ff<E> implements b0a0<E> {
    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.ff, xsna.qd, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // xsna.ff, java.util.List
    public final List subList(int i, int i2) {
        return new xow.a(this, i, i2);
    }
}
