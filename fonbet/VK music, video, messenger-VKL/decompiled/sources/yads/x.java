package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class x extends AbstractCollection {
    public final Object b;
    public Collection c;
    public final x d;
    public final Collection e;
    public final /* synthetic */ a0 f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f = a0Var;
        this.b = obj;
        this.c = collection;
        this.d = xVar;
        this.e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f.f.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.c.isEmpty();
        boolean add = this.c.add(obj);
        if (add) {
            this.f.g++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.c.size();
        boolean addAll = this.c.addAll(collection);
        if (addAll) {
            int size2 = this.c.size();
            a0 a0Var = this.f;
            a0Var.g = (size2 - size) + a0Var.g;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final Collection b() {
        return this.c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.d;
        if (xVar != null) {
            xVar.c();
            if (this.d.c != this.e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) this.f.f.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.c.size();
        if (size == 0) {
            return;
        }
        this.c.clear();
        this.f.g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.c.containsAll(collection);
    }

    public final void d() {
        x xVar = this.d;
        if (xVar != null) {
            xVar.d();
        } else if (this.c.isEmpty()) {
            this.f.f.remove(this.b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.c.remove(obj);
        if (remove) {
            a0 a0Var = this.f;
            a0Var.g--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.c.size();
        boolean removeAll = this.c.removeAll(collection);
        if (removeAll) {
            int size2 = this.c.size();
            a0 a0Var = this.f;
            a0Var.g = (size2 - size) + a0Var.g;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.c.size();
        boolean retainAll = this.c.retainAll(collection);
        if (retainAll) {
            int size2 = this.c.size();
            a0 a0Var = this.f;
            a0Var.g = (size2 - size) + a0Var.g;
            d();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.c.toString();
    }
}
