package xsna;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: SmallPersistentVector.kt */
/* loaded from: classes11.dex */
public final class l3k0<E> extends fg<E> implements vow<E> {
    public static final l3k0 c = new l3k0(new Object[0]);
    public final Object[] b;

    public l3k0(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // java.util.Collection, java.util.List, xsna.c0a0
    public final c0a0<E> add(E e) {
        int size = size();
        Object[] objArr = this.b;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
            copyOf[size()] = e;
            return new l3k0(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new c1a0(objArr, size() + 1, 0, objArr2);
    }

    @Override // xsna.fg, java.util.Collection, java.util.List, xsna.c0a0
    public final c0a0<E> addAll(Collection<? extends E> collection) {
        if (collection.size() + size() > 32) {
            e1a0 builder = builder();
            builder.addAll(collection);
            return builder.d();
        }
        Object[] copyOf = Arrays.copyOf(this.b, collection.size() + size());
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new l3k0(copyOf);
    }

    @Override // xsna.c0a0
    public final e1a0 builder() {
        return new e1a0(this, null, this.b, 0);
    }

    @Override // xsna.c0a0
    public final c0a0<E> g9(int i) {
        dz5.k(i, size());
        if (size() == 1) {
            return c;
        }
        int size = size() - 1;
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, size);
        jw5.h(objArr, i, copyOf, i + 1, size());
        return new l3k0(copyOf);
    }

    @Override // xsna.ff, java.util.List
    public final E get(int i) {
        dz5.k(i, size());
        return (E) this.b[i];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.b.length;
    }

    @Override // xsna.ff, java.util.List
    public final int indexOf(Object obj) {
        return rl3.U(obj, this.b);
    }

    @Override // xsna.ff, java.util.List
    public final int lastIndexOf(Object obj) {
        return rl3.c0(obj, this.b);
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<E> listIterator(int i) {
        dz5.l(i, size());
        return new gm8(this.b, i, size());
    }

    @Override // xsna.c0a0
    public final c0a0 q2(dg dgVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.b;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) dgVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr2[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? c : new l3k0(jw5.m(0, size, objArr2));
    }

    @Override // xsna.ff, java.util.List, xsna.c0a0
    public final c0a0<E> set(int i, E e) {
        dz5.k(i, size());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = e;
        return new l3k0(copyOf);
    }

    @Override // java.util.List, xsna.c0a0
    public final c0a0<E> add(int i, E e) {
        dz5.l(i, size());
        if (i == size()) {
            return add((l3k0<E>) e);
        }
        int size = size();
        Object[] objArr = this.b;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            jw5.k(objArr, 0, objArr2, i, 6);
            jw5.h(objArr, i + 1, objArr2, i, size());
            objArr2[i] = e;
            return new l3k0(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jw5.h(objArr, i + 1, copyOf, i, size() - 1);
        copyOf[i] = e;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new c1a0(copyOf, size() + 1, 0, objArr3);
    }
}
