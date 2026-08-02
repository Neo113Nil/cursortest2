package com.google.android.gms.internal.play_billing;

import defpackage.fb91;
import defpackage.le91;
import defpackage.rta1;
import defpackage.vng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* loaded from: classes11.dex */
public abstract class zzco extends zzcj implements List, RandomAccess {
    public static final le91 b = new le91(zzdk.x, 0);

    public static zzco l(int i, Object[] objArr) {
        return i == 0 ? zzdk.x : new zzdk(i, objArr);
    }

    public static zzco m(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            rta1.h(i, array[i]);
        }
        return l(length, array);
    }

    public static zzco n() {
        return zzdk.x;
    }

    public static Collector q() {
        return fb91.a;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i < size; i + 1) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        i = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i + 1 : 0;
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final zzco g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public zzco j() {
        return size() <= 1 ? this : new zzcm(this);
    }

    @Override // java.util.List
    /* renamed from: k */
    public zzco subList(int i, int i2) {
        vng.S(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzdk.x : new zzcn(this, i, i3);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final le91 listIterator(int i) {
        vng.R(i, size());
        return isEmpty() ? b : new le91(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
