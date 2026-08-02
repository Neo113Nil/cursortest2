package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.c691;
import defpackage.ny61;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public class f extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final f c;
    public final Collection w;
    public final /* synthetic */ zzap x;
    public final /* synthetic */ zzap y;

    public f(zzap zzapVar, Object obj, List list, f fVar) {
        this.y = zzapVar;
        this.x = zzapVar;
        this.a = obj;
        this.b = list;
        this.c = fVar;
        this.w = fVar == null ? null : fVar.b;
    }

    public final void a() {
        f fVar = this.c;
        if (fVar != null) {
            fVar.a();
            return;
        }
        Map map = this.x.c;
        ((zzbd) map).put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.x.w++;
            if (isEmpty) {
                a();
                return true;
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
            this.y.w += this.b.size() - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }

    public final void b() {
        f fVar = this.c;
        if (fVar != null) {
            fVar.b();
        } else if (this.b.isEmpty()) {
            ((zzbd) this.x.c).remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.x.w -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new b(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new e(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.b).remove(i);
        zzap zzapVar = this.y;
        zzapVar.w--;
        b();
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
            this.x.w += this.b.size() - size;
            b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.x.w += this.b.size() - size;
            b();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.b).subList(i, i2);
        f fVar = this.c;
        if (fVar == null) {
            fVar = this;
        }
        boolean z = subList instanceof RandomAccess;
        zzap zzapVar = this.y;
        Object obj = this.a;
        return z ? new c691(zzapVar, obj, subList, fVar) : new f(zzapVar, obj, subList, fVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.b.toString();
    }

    public final void zzb() {
        f fVar = this.c;
        if (fVar != null) {
            fVar.zzb();
            if (fVar.b == this.w) {
                return;
            }
            ny61.y();
            return;
        }
        if (this.b.isEmpty()) {
            Collection collection = (Collection) ((zzbd) this.x.c).get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new e(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.b.remove(obj);
        if (remove) {
            zzap zzapVar = this.x;
            zzapVar.w--;
            b();
        }
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.y.w++;
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
            this.x.w += this.b.size() - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }
}
