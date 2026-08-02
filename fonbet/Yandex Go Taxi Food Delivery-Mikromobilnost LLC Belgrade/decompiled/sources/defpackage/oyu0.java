package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes10.dex */
public final class oyu0 implements List, zfx {
    public final SnapshotStateList a;
    public final int b;
    public int c;
    public int w;

    public oyu0(SnapshotStateList snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = d6z.H(snapshotStateList);
        this.w = i2 - i;
    }

    public final void a() {
        if (d6z.H(this.a) == this.c) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.w;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.w++;
        this.c = d6z.H(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        boolean addAll = snapshotStateList.addAll(i2, collection);
        if (addAll) {
            this.w = collection.size() + this.w;
            this.c = d6z.H(snapshotStateList);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.w > 0) {
            a();
            int i = this.w;
            int i2 = this.b;
            SnapshotStateList snapshotStateList = this.a;
            snapshotStateList.removeRange(i2, i + i2);
            this.w = 0;
            this.c = d6z.H(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        d6z.b(i, this.w);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.w;
        int i2 = this.b;
        c6w it = y6i0.n(i2, i + i2).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (jl40.l(obj, this.a.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.w == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.w;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (jl40.l(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new nyu0(ref$IntRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        Object remove = snapshotStateList.remove(i2);
        this.w--;
        this.c = d6z.H(snapshotStateList);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        a();
        int i = this.w;
        int i2 = this.b;
        SnapshotStateList snapshotStateList = this.a;
        int retainAllInRange$runtime = snapshotStateList.retainAllInRange$runtime(collection, i2, i + i2);
        if (retainAllInRange$runtime > 0) {
            this.c = d6z.H(snapshotStateList);
            this.w -= retainAllInRange$runtime;
        }
        return retainAllInRange$runtime > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        d6z.b(i, this.w);
        a();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.c = d6z.H(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.w;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.w) {
            khe0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new oyu0(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return vng.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return vng.K(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i2, obj);
        this.w++;
        this.c = d6z.H(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.w, collection);
    }
}
