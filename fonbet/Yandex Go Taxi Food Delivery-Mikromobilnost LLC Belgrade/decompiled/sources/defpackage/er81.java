package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import yads.y;

/* loaded from: classes7.dex */
public class er81 extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final er81 c;
    public final Collection w;
    public final /* synthetic */ y x;
    public final /* synthetic */ y y;

    public er81(y yVar, Object obj, List list, er81 er81Var) {
        this.y = yVar;
        this.x = yVar;
        this.a = obj;
        this.b = list;
        this.c = er81Var;
        this.w = er81Var == null ? null : er81Var.b;
    }

    public final void a() {
        er81 er81Var = this.c;
        if (er81Var != null) {
            er81Var.a();
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
        b();
        int size = this.b.size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            int size2 = this.b.size();
            y yVar = this.y;
            yVar.x = (size2 - size) + yVar.x;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        er81 er81Var = this.c;
        if (er81Var != null) {
            er81Var.b();
            if (er81Var.b == this.w) {
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
        b();
        int size = this.b.size();
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
        er81 er81Var = this.c;
        if (er81Var != null) {
            er81Var.d();
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
        return new po71(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new un81(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            y yVar = this.x;
            yVar.x--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        b();
        int size = this.b.size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            int size2 = this.b.size();
            y yVar = this.x;
            yVar.x = (size2 - size) + yVar.x;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        b();
        int size = this.b.size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            int size2 = this.b.size();
            y yVar = this.x;
            yVar.x = (size2 - size) + yVar.x;
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
        er81 er81Var = this.c;
        if (er81Var == null) {
            er81Var = this;
        }
        y yVar = this.y;
        yVar.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.a;
        return z ? new ab81(yVar, obj, subList, er81Var) : new er81(yVar, obj, subList, er81Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new un81(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = ((List) this.b).remove(i);
        y yVar = this.y;
        yVar.x--;
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
        b();
        int size = this.b.size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            int size2 = this.b.size();
            y yVar = this.x;
            yVar.x = (size2 - size) + yVar.x;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
