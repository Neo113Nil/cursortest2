package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.vow;

/* compiled from: AbstractPersistentList.kt */
/* loaded from: classes11.dex */
public abstract class fg<E> extends ff<E> implements c0a0<E> {
    @Override // java.util.Collection, java.util.List, xsna.c0a0
    public c0a0<E> addAll(Collection<? extends E> collection) {
        e1a0 builder = builder();
        builder.addAll(collection);
        return builder.d();
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    @Override // java.util.Collection, java.util.List, xsna.c0a0
    public final c0a0<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? g9(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, xsna.c0a0
    public final c0a0<E> removeAll(Collection<? extends E> collection) {
        return q2(new dg(collection, 0));
    }

    @Override // xsna.ff, java.util.List
    public final List subList(int i, int i2) {
        return new vow.a(this, i, i2);
    }
}
