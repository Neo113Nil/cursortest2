package com.google.common.collect;

import defpackage.ny61;
import defpackage.o8;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public class l extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final l c;
    public final Collection w;
    public final /* synthetic */ AbstractMapBasedMultimap x;
    public final /* synthetic */ AbstractMapBasedMultimap y;

    public l(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, l lVar) {
        this.y = abstractMapBasedMultimap;
        this.x = abstractMapBasedMultimap;
        this.a = obj;
        this.b = list;
        this.c = lVar;
        this.w = lVar == null ? null : lVar.b;
    }

    public final void a() {
        l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        } else {
            this.x.w.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.x.x++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.y.x += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        l lVar = this.c;
        if (lVar != null) {
            lVar.b();
            if (lVar.b == this.w) {
                return;
            }
            ny61.y();
            return;
        }
        if (!this.b.isEmpty() || (collection = (Collection) this.x.w.get(this.a)) == null) {
            return;
        }
        this.b = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.x.x -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    public final void d() {
        l lVar = this.c;
        if (lVar != null) {
            lVar.d();
        } else if (this.b.isEmpty()) {
            this.x.w.remove(this.a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.x;
            abstractMapBasedMultimap.x--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.x.x += this.b.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.x.x += this.b.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = ((List) this.b).subList(i, i2);
        l lVar = this.c;
        if (lVar == null) {
            lVar = this;
        }
        boolean z = subList instanceof RandomAccess;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.y;
        Object obj = this.a;
        return z ? new o8(abstractMapBasedMultimap, obj, subList, lVar) : new l(abstractMapBasedMultimap, obj, subList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new k(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = ((List) this.b).remove(i);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.y;
        abstractMapBasedMultimap.x--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.y.x++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.x.x += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
