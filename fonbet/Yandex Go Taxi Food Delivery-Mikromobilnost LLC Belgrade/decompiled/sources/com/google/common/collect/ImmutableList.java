package com.google.common.collect;

import defpackage.eab1;
import defpackage.ffx;
import defpackage.h221;
import defpackage.niv;
import defpackage.piv;
import defpackage.uh6;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final piv b = new piv(0, RegularImmutableList.x);
    private static final long serialVersionUID = -889275714;

    /* loaded from: classes11.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.m(this.elements);
        }
    }

    public static final class a extends niv {
        public a() {
            super(4);
        }

        @Override // defpackage.niv
        public final niv c(Object obj) {
            a(obj);
            return this;
        }

        public final ImmutableList g() {
            this.c = true;
            return ImmutableList.k(this.b, this.a);
        }
    }

    public static ImmutableList k(int i, Object[] objArr) {
        return i == 0 ? RegularImmutableList.x : new RegularImmutableList(i, objArr);
    }

    public static ImmutableList l(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            uh6.i(array.length, array);
            return k(array.length, array);
        }
        ImmutableList a2 = ((ImmutableCollection) collection).a();
        if (!a2.i()) {
            return a2;
        }
        Object[] array2 = a2.toArray(ImmutableCollection.a);
        return k(array2.length, array2);
    }

    public static ImmutableList m(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.x;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        uh6.i(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    public static ImmutableList p() {
        return RegularImmutableList.x;
    }

    public static ImmutableList q(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        uh6.i(5, objArr);
        return k(5, objArr);
    }

    public static ImmutableList r(Object obj) {
        Object[] objArr = {obj};
        uh6.i(1, objArr);
        return k(1, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        uh6.i(2, objArr);
        return k(2, objArr);
    }

    public static ImmutableList t(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        uh6.i(3, objArr);
        return k(3, objArr);
    }

    public static ImmutableList u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        ffx.l("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        uh6.i(length, objArr2);
        return k(length, objArr2);
    }

    public static ImmutableList x(z zVar, AbstractCollection abstractCollection) {
        zVar.getClass();
        Object[] e = eab1.e(abstractCollection);
        uh6.i(e.length, e);
        Arrays.sort(e, zVar);
        return k(e.length, e);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: j */
    public final h221 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final piv listIterator(int i) {
        ffx.p(i, size());
        return isEmpty() ? b : new piv(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.a));
    }

    @Override // java.util.List
    /* renamed from: y */
    public ImmutableList subList(int i, int i2) {
        ffx.q(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? RegularImmutableList.x : new SubList(i, i3);
    }

    /* loaded from: classes11.dex */
    public final class SubList extends ImmutableList<E> {
        public final transient int c;
        public final transient int w;

        public SubList(int i, int i2) {
            this.c = i;
            this.w = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] f() {
            return ImmutableList.this.f();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int g() {
            return ImmutableList.this.h() + this.c + this.w;
        }

        @Override // java.util.List
        public final Object get(int i) {
            ffx.n(i, this.w);
            return ImmutableList.this.get(i + this.c);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int h() {
            return ImmutableList.this.h() + this.c;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.w;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i, int i2) {
            ffx.q(i, i2, this.w);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.c;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }
}
