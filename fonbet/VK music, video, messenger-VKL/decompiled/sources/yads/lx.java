package yads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public abstract class lx extends AbstractCollection {
    public final Collection b;
    public final ph2 c;

    public lx(Collection collection, ph2 ph2Var) {
        this.b = collection;
        this.c = ph2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        if (this.c.apply(obj)) {
            return this.b.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.b;
        ph2 ph2Var = this.c;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            ph2Var.getClass();
            while (it.hasNext()) {
                if (ph2Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        ph2Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ph2Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i2; size--) {
                            if (ph2Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i3 = i2 - 1; i3 >= i; i3--) {
                            list.remove(i3);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i2; size2--) {
                            if (ph2Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i4 = i2 - 1; i4 >= i; i4--) {
                            list.remove(i4);
                        }
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
        Collection collection = this.b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.b;
        ph2 ph2Var = this.c;
        Iterator it = collection.iterator();
        if (ph2Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!ph2Var.apply(it.next())) {
                i++;
            } else if (i != -1) {
                z = true;
            }
        }
        return !z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.b.iterator();
        ph2 ph2Var = this.c;
        it.getClass();
        ph2Var.getClass();
        return new zd1(it, ph2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.c.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.c.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.b.iterator();
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
        zd1 zd1Var = (zd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (zd1Var.hasNext()) {
            arrayList.add(zd1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        zd1 zd1Var = (zd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (zd1Var.hasNext()) {
            arrayList.add(zd1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
