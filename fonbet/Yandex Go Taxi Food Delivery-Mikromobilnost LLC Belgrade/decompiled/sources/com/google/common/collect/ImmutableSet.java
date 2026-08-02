package com.google.common.collect;

import defpackage.ffx;
import defpackage.lab1;
import defpackage.niv;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.piv;
import defpackage.vng;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableList b;

    /* loaded from: classes11.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.n(this.elements);
        }
    }

    public static class a extends niv {
        public Object[] d;
        public int e;

        public a() {
            super(4);
        }

        @Override // defpackage.niv
        public final /* bridge */ /* synthetic */ niv c(Object obj) {
            g(obj);
            return this;
        }

        public final void g(Object obj) {
            obj.getClass();
            if (this.d != null) {
                int k = ImmutableSet.k(this.b);
                Object[] objArr = this.d;
                if (k <= objArr.length) {
                    int length = objArr.length - 1;
                    int hashCode = obj.hashCode();
                    int F = vng.F(hashCode);
                    while (true) {
                        int i = F & length;
                        Object[] objArr2 = this.d;
                        Object obj2 = objArr2[i];
                        if (obj2 == null) {
                            objArr2[i] = obj;
                            this.e += hashCode;
                            a(obj);
                            return;
                        } else if (obj2.equals(obj)) {
                            return;
                        } else {
                            F = i + 1;
                        }
                    }
                }
            }
            this.d = null;
            a(obj);
        }

        public final void h(Collection collection) {
            collection.getClass();
            if (this.d == null) {
                d(collection);
                return;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }

        public final ImmutableSet i() {
            ImmutableSet l;
            int i = this.b;
            if (i == 0) {
                int i2 = ImmutableSet.c;
                return RegularImmutableSet.C;
            }
            if (i == 1) {
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                int i3 = ImmutableSet.c;
                return new SingletonImmutableSet(obj);
            }
            if (this.d == null || ImmutableSet.k(i) != this.d.length) {
                l = ImmutableSet.l(this.b, this.a);
                this.b = l.size();
            } else {
                int i4 = this.b;
                Object[] objArr = this.a;
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                l = new RegularImmutableSet(objArr, this.e, this.d, r7.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return l;
        }
    }

    public static int k(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            ffx.l("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static ImmutableSet l(int i, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int k = k(i);
        Object[] objArr2 = new Object[k];
        int i2 = k - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                ny61.t(oyr.i(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int F = vng.F(hashCode);
            while (true) {
                int i6 = F & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                F++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (k(i4) < k / 2) {
            return l(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static ImmutableSet m(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.i()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static ImmutableSet n(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? l(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]) : RegularImmutableSet.C;
    }

    public static ImmutableSet q(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        ffx.l("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return l(length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList a() {
        ImmutableList immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList p = p();
        this.b = p;
        return p;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && (this instanceof RegularImmutableSet) && (((ImmutableSet) obj) instanceof RegularImmutableSet) && hashCode() != obj.hashCode()) {
            return false;
        }
        return lab1.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lab1.g(this);
    }

    public ImmutableList p() {
        Object[] array = toArray();
        piv pivVar = ImmutableList.b;
        return ImmutableList.k(array.length, array);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.a));
    }
}
