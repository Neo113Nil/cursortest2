package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.aa91;
import defpackage.la91;
import defpackage.ny61;
import defpackage.po71;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public class e extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final e c;
    public final Collection w;
    public final /* synthetic */ zzbr x;
    public final /* synthetic */ zzbr y;

    public e(zzbr zzbrVar, Object obj, List list, e eVar) {
        this.y = zzbrVar;
        this.x = zzbrVar;
        this.a = obj;
        this.b = list;
        this.c = eVar;
        this.w = eVar == null ? null : eVar.b;
    }

    public final void a() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.a();
            return;
        }
        Map map = this.x.c;
        ((zzci) map).put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (!add || !isEmpty) {
            return add;
        }
        a();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.b.size();
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }

    public final void b() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.b();
        } else if (this.b.isEmpty()) {
            ((zzci) this.x.c).remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.b.clear();
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
        return new po71(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new la91(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.b).remove(i);
        b();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.b.size();
            b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.b.size();
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
        e eVar = this.c;
        if (eVar == null) {
            eVar = this;
        }
        boolean z = subList instanceof RandomAccess;
        Object obj = this.a;
        zzbr zzbrVar = this.y;
        return z ? new aa91(zzbrVar, obj, subList, eVar) : new e(zzbrVar, obj, subList, eVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.b.toString();
    }

    public final void zzb() {
        Collection collection;
        e eVar = this.c;
        if (eVar != null) {
            eVar.zzb();
            if (eVar.b == this.w) {
                return;
            }
            ny61.y();
            return;
        }
        if (!this.b.isEmpty() || (collection = (Collection) ((zzci) this.x.c).get(this.a)) == null) {
            return;
        }
        this.b = collection;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new la91(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.b.remove(obj);
        if (remove) {
            b();
        }
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
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
            this.b.size();
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }
}
