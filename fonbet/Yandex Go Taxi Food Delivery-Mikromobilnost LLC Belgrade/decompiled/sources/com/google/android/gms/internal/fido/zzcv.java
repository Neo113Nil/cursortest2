package com.google.android.gms.internal.fido;

import defpackage.ny61;
import defpackage.sb91;
import defpackage.z591;
import defpackage.ze91;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes11.dex */
final class zzcv extends zzck {
    public static final zzcv z;
    public final transient zzcc y;

    static {
        sb91 sb91Var = zzcc.b;
        z = new zzcv(zzct.x, zzcq.a);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.y = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        return this.y.a(objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.y.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int s = s(obj, true);
        zzcc zzccVar = this.y;
        if (s == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.y, obj, this.w) >= 0) {
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
        if (collection instanceof ze91) {
            collection = ((ze91) collection).zza();
        }
        Comparator comparator = this.w;
        if (!a.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        sb91 listIterator = this.y.listIterator(0);
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
        return this.y.i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzcc zzccVar = this.y;
            if (zzccVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.w;
                if (!a.a(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    sb91 listIterator = zzccVar.listIterator(0);
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

    @Override // com.google.android.gms.internal.fido.zzby
    public final int f() {
        return this.y.f();
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.y.get(0);
        }
        ny61.p();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int r = r(obj, true) - 1;
        if (r == -1) {
            return null;
        }
        return this.y.get(r);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final z591 g() {
        return this.y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] h() {
        return this.y.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int s = s(obj, false);
        zzcc zzccVar = this.y;
        if (s == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.y.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc l() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            ny61.p();
            return null;
        }
        return this.y.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int r = r(obj, false) - 1;
        if (r == -1) {
            return null;
        }
        return this.y.get(r);
    }

    public final int r(Object obj, boolean z2) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.y, obj, this.w);
        return binarySearch >= 0 ? z2 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int s(Object obj, boolean z2) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.y, obj, this.w);
        return binarySearch >= 0 ? z2 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y.size();
    }

    public final zzcv t(int i, int i2) {
        zzcc zzccVar = this.y;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.w;
        return i < i2 ? new zzcv(zzccVar.subList(i, i2), comparator) : zzck.q(comparator);
    }
}
