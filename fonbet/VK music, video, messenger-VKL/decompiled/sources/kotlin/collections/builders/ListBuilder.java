package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import xsna.epx;
import xsna.ff;
import xsna.gcy;
import xsna.jw5;
import xsna.ro;
import xsna.yf;

/* compiled from: ListBuilder.kt */
/* loaded from: classes11.dex */
public final class ListBuilder<E> extends yf<E> implements List<E>, RandomAccess, Serializable {
    public static final ListBuilder b;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* compiled from: ListBuilder.kt */
    /* loaded from: classes8.dex */
    public static final class BuilderSubList<E> extends yf<E> implements List<E>, RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* compiled from: ListBuilder.kt */
        public static final class a<E> implements ListIterator<E>, gcy {
            public final BuilderSubList<E> b;
            public int c;
            public int d = -1;
            public int e;

            public a(BuilderSubList<E> builderSubList, int i) {
                this.b = builderSubList;
                this.c = i;
                this.e = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.b).root).modCount != this.e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                a();
                int i = this.c;
                this.c = i + 1;
                BuilderSubList<E> builderSubList = this.b;
                builderSubList.add(i, e);
                this.d = -1;
                this.e = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.c < ((BuilderSubList) this.b).length;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i = this.c;
                BuilderSubList<E> builderSubList = this.b;
                if (i >= ((BuilderSubList) builderSubList).length) {
                    throw new NoSuchElementException();
                }
                int i2 = this.c;
                this.c = i2 + 1;
                this.d = i2;
                return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.d];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.c;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i = this.c;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.c = i2;
                this.d = i2;
                BuilderSubList<E> builderSubList = this.b;
                return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.d];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                BuilderSubList<E> builderSubList = this.b;
                builderSubList.removeAt(i);
                this.c = this.d;
                this.d = -1;
                this.e = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                a();
                int i = this.d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.b.set(i, e);
            }
        }

        public BuilderSubList(E[] eArr, int i, int i2, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            if (((ListBuilder) this.root).isReadOnly) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            i();
            h();
            g(this.offset + this.length, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            i();
            h();
            int size = collection.size();
            f(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            i();
            h();
            k(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            h();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.backing;
                int i = this.offset;
                int i2 = this.length;
                if (i2 == list.size()) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (epx.f(eArr[i + i3], list.get(i3))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final void f(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.f(i, collection, i2);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.b;
                listBuilder.e(i, collection, i2);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i2;
        }

        public final void g(int i, E e) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.g(i, e);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.b;
                listBuilder.f(i, e);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.b(i, i2);
            return this.backing[this.offset + i];
        }

        @Override // xsna.yf
        public final int getSize() {
            h();
            return this.length;
        }

        public final void h() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            h();
            E[] eArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            int i3 = 1;
            for (int i4 = 0; i4 < i2; i4++) {
                E e = eArr[i + i4];
                i3 = (i3 * 31) + (e != null ? e.hashCode() : 0);
            }
            return i3;
        }

        public final void i() {
            if (((ListBuilder) this.root).isReadOnly) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            h();
            for (int i = 0; i < this.length; i++) {
                if (epx.f(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            h();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final E j(int i) {
            E j;
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                j = builderSubList.j(i);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.b;
                j = listBuilder.j(i);
            }
            this.length--;
            return j;
        }

        public final void k(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.k(i, i2);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.b;
                listBuilder.k(i, i2);
            }
            this.length -= i2;
        }

        public final int l(int i, int i2, Collection<? extends E> collection, boolean z) {
            int l;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                l = builderSubList.l(i, i2, collection, z);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.b;
                l = listBuilder.l(i, i2, collection, z);
            }
            if (l > 0) {
                ((AbstractList) this).modCount++;
            }
            this.length -= l;
            return l;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            for (int i = this.length - 1; i >= 0; i--) {
                if (epx.f(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            i();
            h();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                removeAt(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            i();
            h();
            return l(this.offset, this.length, collection, false) > 0;
        }

        @Override // xsna.yf
        public final E removeAt(int i) {
            i();
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.b(i, i2);
            return j(this.offset + i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            i();
            h();
            return l(this.offset, this.length, collection, true) > 0;
        }

        @Override // xsna.yf, java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            i();
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.b(i, i2);
            E[] eArr = this.backing;
            int i3 = this.offset + i;
            E e2 = eArr[i3];
            eArr[i3] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i2) {
            ff.a aVar = ff.Companion;
            int i3 = this.length;
            aVar.getClass();
            ff.a.d(i, i2, i3);
            return new BuilderSubList(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            h();
            int length = tArr.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                return (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            jw5.h(eArr2, 0, tArr, i3, i + i3);
            int i4 = this.length;
            if (i4 < tArr.length) {
                tArr[i4] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            h();
            return ro.a(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.c(i, i2);
            return new a(this, i);
        }

        @Override // xsna.yf, java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            i();
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.c(i, i2);
            g(this.offset + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            i();
            h();
            ff.a aVar = ff.Companion;
            int i2 = this.length;
            aVar.getClass();
            ff.a.c(i, i2);
            int size = collection.size();
            f(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            h();
            E[] eArr = this.backing;
            int i = this.offset;
            return jw5.m(i, this.length + i, eArr);
        }
    }

    /* compiled from: ListBuilder.kt */
    public static final class a<E> implements ListIterator<E>, gcy {
        public final ListBuilder<E> b;
        public int c;
        public int d = -1;
        public int e;

        public a(int i, ListBuilder listBuilder) {
            this.b = listBuilder;
            this.c = i;
            this.e = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.b).modCount != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            a();
            int i = this.c;
            this.c = i + 1;
            ListBuilder<E> listBuilder = this.b;
            listBuilder.add(i, e);
            this.d = -1;
            this.e = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.c < ((ListBuilder) this.b).length;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i = this.c;
            ListBuilder<E> listBuilder = this.b;
            if (i >= ((ListBuilder) listBuilder).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.c;
            this.c = i2 + 1;
            this.d = i2;
            return (E) ((ListBuilder) listBuilder).backing[this.d];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.c;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i = this.c;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.c = i2;
            this.d = i2;
            return (E) ((ListBuilder) this.b).backing[this.d];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            ListBuilder<E> listBuilder = this.b;
            listBuilder.removeAt(i);
            this.c = this.d;
            this.d = -1;
            this.e = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            a();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.b.set(i, e);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        b = listBuilder;
    }

    public ListBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.backing = (E[]) new Object[i];
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        h();
        f(this.length, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        h();
        int size = collection.size();
        e(this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.length);
    }

    public final void e(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (epx.f(eArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, E e) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.backing[i] = e;
    }

    public final ListBuilder g() {
        h();
        this.isReadOnly = true;
        return this.length > 0 ? this : b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.b(i, i2);
        return this.backing[i];
    }

    @Override // xsna.yf
    public final int getSize() {
        return this.length;
    }

    public final void h() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            E e = eArr[i3];
            i2 = (i2 * 31) + (e != null ? e.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i3 > eArr.length) {
            ff.a aVar = ff.Companion;
            int length = eArr.length;
            aVar.getClass();
            this.backing = (E[]) Arrays.copyOf(this.backing, ff.a.e(length, i3));
        }
        E[] eArr2 = this.backing;
        jw5.h(eArr2, i + i2, eArr2, i, this.length);
        this.length += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (epx.f(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final E j(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e = eArr[i];
        jw5.h(eArr, i, eArr, i + 1, this.length);
        E[] eArr2 = this.backing;
        int i2 = this.length;
        eArr2[i2 - 1] = null;
        this.length = i2 - 1;
        return e;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        jw5.h(eArr, i, eArr, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        ro.n(i3 - i2, i3, eArr2);
        this.length -= i2;
    }

    public final int l(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.backing[i5]) == z) {
                E[] eArr = this.backing;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.backing;
        jw5.h(eArr2, i + i4, eArr2, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        ro.n(i7 - i6, i7, eArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (epx.f(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        h();
        return l(0, this.length, collection, false) > 0;
    }

    @Override // xsna.yf
    public final E removeAt(int i) {
        h();
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.b(i, i2);
        return j(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        h();
        return l(0, this.length, collection, true) > 0;
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        h();
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.b(i, i2);
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        ff.a aVar = ff.Companion;
        int i3 = this.length;
        aVar.getClass();
        ff.a.d(i, i2, i3);
        return new BuilderSubList(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            return (T[]) Arrays.copyOfRange(this.backing, 0, i, tArr.getClass());
        }
        jw5.h(this.backing, 0, tArr, 0, i);
        int i2 = this.length;
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ro.a(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.c(i, i2);
        return new a(i, this);
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        h();
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.c(i, i2);
        f(i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        h();
        ff.a aVar = ff.Companion;
        int i2 = this.length;
        aVar.getClass();
        ff.a.c(i, i2);
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return jw5.m(0, this.length, this.backing);
    }
}
