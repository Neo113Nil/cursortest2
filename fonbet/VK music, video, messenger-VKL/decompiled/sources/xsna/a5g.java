package xsna;

import android.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Collections2.java */
/* loaded from: classes13.dex */
public class a5g<E> extends AbstractCollection<E> {
    public final Collection<E> b;
    public final jxc0<? super E> c;

    public a5g(Collection<E> collection, jxc0<? super E> jxc0Var) {
        this.b = collection;
        this.c = jxc0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        fxc0.p(this.c.apply(e));
        return this.b.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            fxc0.p(this.c.apply(it.next()));
        }
        return this.b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.b;
        boolean z = collection instanceof RandomAccess;
        jxc0<? super E> jxc0Var = this.c;
        if (!z || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            jxc0Var.getClass();
            while (it.hasNext()) {
                if (jxc0Var.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        jxc0Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            R r = (Object) list.get(i2);
            if (!jxc0Var.apply(r)) {
                if (i2 > i) {
                    try {
                        list.set(i, r);
                    } catch (IllegalArgumentException unused) {
                        sd9.s(list, jxc0Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        sd9.s(list, jxc0Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z;
        Collection<E> collection = this.b;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.c.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !sd9.e(this.b, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.b.iterator();
        it.getClass();
        jxc0<? super E> jxc0Var = this.c;
        jxc0Var.getClass();
        return new kwx(it, jxc0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.c.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.c.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.c.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        lwx.a(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        lwx.a(arrayList, it);
        return (T[]) arrayList.toArray(tArr);
    }
}
