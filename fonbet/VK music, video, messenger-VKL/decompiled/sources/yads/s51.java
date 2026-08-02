package yads;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public abstract class s51 extends m51 implements List, RandomAccess {
    public static final p51 c = new p51(0, tn2.f);

    public static tn2 b(int i, Object[] objArr) {
        return i == 0 ? tn2.f : new tn2(i, objArr);
    }

    public static o51 f() {
        return new o51();
    }

    public static tn2 g() {
        return tn2.f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // yads.m51
    public final s51 a() {
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

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ma2.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (ma2.a(get(i), list.get(i))) {
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

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
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

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.m51
    public Object writeReplace() {
        return new q51(toArray(m51.b));
    }

    public static tn2 a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(nh2.a("at index ", i));
            }
        }
        return b(objArr.length, objArr);
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final nb3 iterator() {
        return listIterator(0);
    }

    public static tn2 b(Object[] objArr) {
        if (objArr.length == 0) {
            return tn2.f;
        }
        return a((Object[]) objArr.clone());
    }

    @Override // yads.m51
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static s51 a(Collection collection) {
        if (collection instanceof m51) {
            s51 a = ((m51) collection).a();
            if (!a.e()) {
                return a;
            }
            Object[] array = a.toArray(m51.b);
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p51 listIterator(int i) {
        oh2.b(i, size());
        if (isEmpty()) {
            return c;
        }
        return new p51(i, this);
    }

    public static tn2 a(Object obj) {
        return a(obj);
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s51 subList(int i, int i2) {
        oh2.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return tn2.f;
        }
        return new r51(this, i, i3);
    }
}
