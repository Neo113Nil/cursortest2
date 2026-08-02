package com.google.android.gms.internal.play_billing;

import defpackage.le91;
import defpackage.mh91;
import defpackage.ny61;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes11.dex */
final class zzdr extends zzcw {
    public static final zzdr y;
    public final transient zzco x;

    static {
        le91 le91Var = zzco.b;
        y = new zzdr(zzdk.x, zzdc.a);
    }

    public zzdr(zzco zzcoVar, Comparator comparator) {
        super(comparator);
        this.x = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        return this.x.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int b() {
        return this.x.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int n = n(obj, true);
        zzco zzcoVar = this.x;
        if (n == zzcoVar.size()) {
            return null;
        }
        return zzcoVar.get(n);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.x, obj, this.c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof mh91) {
            collection = ((mh91) collection).zza();
        }
        Comparator comparator = this.c;
        if (!e.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        le91 listIterator = this.x.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.x.j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzco zzcoVar = this.x;
            if (zzcoVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.c;
                if (!e.a(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    le91 listIterator = zzcoVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int f() {
        return this.x.f();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.x.get(0);
        }
        ny61.p();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int m = m(obj, true) - 1;
        if (m == -1) {
            return null;
        }
        return this.x.get(m);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco g() {
        return this.x;
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int n = n(obj, false);
        zzco zzcoVar = this.x;
        if (n == zzcoVar.size()) {
            return null;
        }
        return zzcoVar.get(n);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] i() {
        return this.x.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.x.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            ny61.p();
            return null;
        }
        return this.x.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int m = m(obj, false) - 1;
        if (m == -1) {
            return null;
        }
        return this.x.get(m);
    }

    public final int m(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.c);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int n(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.x, obj, this.c);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final zzdr p(int i, int i2) {
        zzco zzcoVar = this.x;
        if (i == 0) {
            if (i2 == zzcoVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.c;
        if (i < i2) {
            return new zzdr(zzcoVar.subList(i, i2), comparator);
        }
        if (zzdc.a == comparator) {
            return y;
        }
        le91 le91Var = zzco.b;
        return new zzdr(zzdk.x, comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x.size();
    }
}
