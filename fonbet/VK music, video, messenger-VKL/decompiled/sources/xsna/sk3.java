package xsna;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xsna.ff;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes11.dex */
public final class sk3<E> extends yf<E> {
    public static final Object[] e = new Object[0];
    public int b;
    public Object[] c;
    public int d;

    public sk3(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.c = objArr;
    }

    public final void a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.c.length;
        while (i < length && it.hasNext()) {
            this.c[i] = it.next();
            i++;
        }
        int i2 = this.b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.c[i3] = it.next();
        }
        this.d = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        k();
        c(collection.size() + size());
        a(j(size() + this.b), collection);
        return true;
    }

    public final void addFirst(E e2) {
        k();
        c(size() + 1);
        int i = this.b;
        if (i == 0) {
            i = this.c.length;
        }
        int i2 = i - 1;
        this.b = i2;
        this.c[i2] = e2;
        this.d = size() + 1;
    }

    public final void addLast(E e2) {
        k();
        c(size() + 1);
        this.c[j(size() + this.b)] = e2;
        this.d = size() + 1;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.c = new Object[i];
            return;
        }
        ff.a aVar = ff.Companion;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[ff.a.e(length, i)];
        Object[] objArr3 = this.c;
        jw5.h(objArr3, 0, objArr2, this.b, objArr3.length);
        Object[] objArr4 = this.c;
        int length2 = objArr4.length;
        int i2 = this.b;
        jw5.h(objArr4, length2 - i2, objArr2, 0, i2);
        this.b = 0;
        this.c = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.b, j(size() + this.b));
        }
        this.b = 0;
        this.d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E d() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.c[this.b];
    }

    public final int e(int i) {
        if (i == this.c.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.c[this.b];
    }

    public final E g() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.c[j(e43.h(this) + this.b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.b(i, size);
        return (E) this.c[j(this.b + i)];
    }

    @Override // xsna.yf
    public final int getSize() {
        return this.d;
    }

    public final int h(int i) {
        return i < 0 ? i + this.c.length : i;
    }

    public final void i(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.c, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.c;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.c, 0, i2, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int j = j(size() + this.b);
        int i2 = this.b;
        if (i2 < j) {
            while (i2 < j) {
                if (epx.f(obj, this.c[i2])) {
                    i = this.b;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.b) < j) {
            return -1;
        }
        int length = this.c.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < j; i3++) {
                    if (epx.f(obj, this.c[i3])) {
                        i2 = i3 + this.c.length;
                        i = this.b;
                    }
                }
                return -1;
            }
            if (epx.f(obj, this.c[i2])) {
                i = this.b;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final E l() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.c[j(e43.h(this) + this.b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int j = j(size() + this.b);
        int i2 = this.b;
        if (i2 < j) {
            length = j - 1;
            if (i2 <= length) {
                while (!epx.f(obj, this.c[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.b;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.b >= j) {
            int i3 = j - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.c.length - 1;
                    int i4 = this.b;
                    if (i4 <= length) {
                        while (!epx.f(obj, this.c[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.b;
                    }
                } else {
                    if (epx.f(obj, this.c[i3])) {
                        length = i3 + this.c.length;
                        i = this.b;
                        break;
                    }
                    i3--;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int j;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int j2 = j(size() + this.b);
            int i = this.b;
            if (i < j2) {
                j = i;
                while (i < j2) {
                    Object obj = this.c[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.c[j] = obj;
                        j++;
                    }
                    i++;
                }
                Arrays.fill(this.c, j, j2, (Object) null);
            } else {
                int length = this.c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.c[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.c[j] = obj3;
                        j = e(j);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.d = h(j - this.b);
            }
        }
        return z;
    }

    @Override // xsna.yf
    public final E removeAt(int i) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.b(i, size);
        if (i == e43.h(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int j = j(this.b + i);
        E e2 = (E) this.c[j];
        if (i < (size() >> 1)) {
            int i2 = this.b;
            if (j >= i2) {
                Object[] objArr = this.c;
                jw5.h(objArr, i2 + 1, objArr, i2, j);
            } else {
                Object[] objArr2 = this.c;
                jw5.h(objArr2, 1, objArr2, 0, j);
                Object[] objArr3 = this.c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.b;
                jw5.h(objArr3, i3 + 1, objArr3, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.c;
            int i4 = this.b;
            objArr4[i4] = null;
            this.b = e(i4);
        } else {
            int j2 = j(e43.h(this) + this.b);
            if (j <= j2) {
                Object[] objArr5 = this.c;
                jw5.h(objArr5, j, objArr5, j + 1, j2 + 1);
            } else {
                Object[] objArr6 = this.c;
                jw5.h(objArr6, j, objArr6, j + 1, objArr6.length);
                Object[] objArr7 = this.c;
                objArr7[objArr7.length - 1] = objArr7[0];
                jw5.h(objArr7, 0, objArr7, 1, j2 + 1);
            }
            this.c[j2] = null;
        }
        this.d = size() - 1;
        return e2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.c;
        int i = this.b;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this.b = e(i);
        this.d = size() - 1;
        return e2;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int j = j(e43.h(this) + this.b);
        Object[] objArr = this.c;
        E e2 = (E) objArr[j];
        objArr[j] = null;
        this.d = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        k();
        if (i < size() - i2) {
            int j = j(this.b + (i - 1));
            int j2 = j(this.b + (i2 - 1));
            while (i > 0) {
                int i4 = j + 1;
                int min = Math.min(i, Math.min(i4, j2 + 1));
                Object[] objArr = this.c;
                int i5 = j2 - min;
                int i6 = j - min;
                jw5.h(objArr, i5 + 1, objArr, i6 + 1, i4);
                j = h(i6);
                j2 = h(i5);
                i -= min;
            }
            int j3 = j(this.b + i3);
            i(this.b, j3);
            this.b = j3;
        } else {
            int j4 = j(this.b + i2);
            int j5 = j(this.b + i);
            int size2 = size();
            while (true) {
                size2 -= i2;
                if (size2 <= 0) {
                    break;
                }
                Object[] objArr2 = this.c;
                i2 = Math.min(size2, Math.min(objArr2.length - j4, objArr2.length - j5));
                Object[] objArr3 = this.c;
                int i7 = j4 + i2;
                jw5.h(objArr3, j5, objArr3, j4, i7);
                j4 = j(i7);
                j5 = j(j5 + i2);
            }
            int j6 = j(size() + this.b);
            i(h(j6 - i3), j6);
        }
        this.d = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int j;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int j2 = j(size() + this.b);
            int i = this.b;
            if (i < j2) {
                j = i;
                while (i < j2) {
                    Object obj = this.c[i];
                    if (collection.contains(obj)) {
                        this.c[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.c, j, j2, (Object) null);
            } else {
                int length = this.c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.c[j] = obj3;
                        j = e(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.d = h(j - this.b);
            }
        }
        return z;
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.b(i, size);
        int j = j(this.b + i);
        Object[] objArr = this.c;
        E e3 = (E) objArr[j];
        objArr[j] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < size()) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size()));
        }
        int j = j(size() + this.b);
        int i = this.b;
        if (i < j) {
            jw5.k(this.c, i, tArr, j, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            jw5.h(objArr, 0, tArr, this.b, objArr.length);
            Object[] objArr2 = this.c;
            jw5.h(objArr2, objArr2.length - this.b, tArr, 0, j);
        }
        int size = size();
        if (size < tArr.length) {
            tArr[size] = null;
        }
        return tArr;
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.c(i, size);
        if (i == size()) {
            addLast(e2);
            return;
        }
        if (i == 0) {
            addFirst(e2);
            return;
        }
        k();
        c(size() + 1);
        int j = j(this.b + i);
        if (i < ((size() + 1) >> 1)) {
            int length = j == 0 ? this.c.length - 1 : j - 1;
            int i2 = this.b;
            int length2 = i2 == 0 ? this.c.length - 1 : i2 - 1;
            if (length >= i2) {
                Object[] objArr = this.c;
                objArr[length2] = objArr[i2];
                jw5.h(objArr, i2, objArr, i2 + 1, length + 1);
            } else {
                Object[] objArr2 = this.c;
                jw5.h(objArr2, i2 - 1, objArr2, i2, objArr2.length);
                Object[] objArr3 = this.c;
                objArr3[objArr3.length - 1] = objArr3[0];
                jw5.h(objArr3, 0, objArr3, 1, length + 1);
            }
            this.c[length] = e2;
            this.b = length2;
        } else {
            int j2 = j(size() + this.b);
            if (j < j2) {
                Object[] objArr4 = this.c;
                jw5.h(objArr4, j + 1, objArr4, j, j2);
            } else {
                Object[] objArr5 = this.c;
                jw5.h(objArr5, 1, objArr5, 0, j2);
                Object[] objArr6 = this.c;
                objArr6[0] = objArr6[objArr6.length - 1];
                jw5.h(objArr6, j + 1, objArr6, j, objArr6.length - 1);
            }
            this.c[j] = e2;
        }
        this.d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        ff.a aVar = ff.Companion;
        int size = size();
        aVar.getClass();
        ff.a.c(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        k();
        c(collection.size() + size());
        int j = j(size() + this.b);
        int j2 = j(this.b + i);
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.b;
            int i3 = i2 - size2;
            if (j2 < i2) {
                Object[] objArr = this.c;
                jw5.h(objArr, i3, objArr, i2, objArr.length);
                if (size2 >= j2) {
                    Object[] objArr2 = this.c;
                    jw5.h(objArr2, objArr2.length - size2, objArr2, 0, j2);
                } else {
                    Object[] objArr3 = this.c;
                    jw5.h(objArr3, objArr3.length - size2, objArr3, 0, size2);
                    Object[] objArr4 = this.c;
                    jw5.h(objArr4, 0, objArr4, size2, j2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.c;
                jw5.h(objArr5, i3, objArr5, i2, j2);
            } else {
                Object[] objArr6 = this.c;
                i3 += objArr6.length;
                int i4 = j2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    jw5.h(objArr6, i3, objArr6, i2, j2);
                } else {
                    jw5.h(objArr6, i3, objArr6, i2, i2 + length);
                    Object[] objArr7 = this.c;
                    jw5.h(objArr7, 0, objArr7, this.b + length, j2);
                }
            }
            this.b = i3;
            a(h(j2 - size2), collection);
            return true;
        }
        int i5 = j2 + size2;
        if (j2 < j) {
            int i6 = size2 + j;
            Object[] objArr8 = this.c;
            if (i6 <= objArr8.length) {
                jw5.h(objArr8, i5, objArr8, j2, j);
            } else if (i5 >= objArr8.length) {
                jw5.h(objArr8, i5 - objArr8.length, objArr8, j2, j);
            } else {
                int length2 = j - (i6 - objArr8.length);
                jw5.h(objArr8, 0, objArr8, length2, j);
                Object[] objArr9 = this.c;
                jw5.h(objArr9, i5, objArr9, j2, length2);
            }
        } else {
            Object[] objArr10 = this.c;
            jw5.h(objArr10, size2, objArr10, 0, j);
            Object[] objArr11 = this.c;
            if (i5 >= objArr11.length) {
                jw5.h(objArr11, i5 - objArr11.length, objArr11, j2, objArr11.length);
            } else {
                jw5.h(objArr11, 0, objArr11, objArr11.length - size2, objArr11.length);
                Object[] objArr12 = this.c;
                jw5.h(objArr12, i5, objArr12, j2, objArr12.length - size2);
            }
        }
        a(j2, collection);
        return true;
    }

    public sk3() {
        this.c = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public sk3(Collection<? extends E> collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.c = array;
        this.d = array.length;
        if (array.length == 0) {
            this.c = e;
        }
    }
}
