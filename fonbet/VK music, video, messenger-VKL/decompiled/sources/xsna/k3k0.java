package xsna;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: SmallPersistentVector.kt */
/* loaded from: classes8.dex */
public final class k3k0<E> extends eg<E> implements xow<E> {
    public static final k3k0 c = new k3k0(new Object[0]);
    public final Object[] b;

    public k3k0(Object[] objArr) {
        this.b = objArr;
    }

    public final b0a0<E> b(Collection<? extends E> collection) {
        if (collection.size() + size() > 32) {
            d1a0 d = d();
            d.addAll(collection);
            return d.build();
        }
        Object[] copyOf = Arrays.copyOf(this.b, collection.size() + size());
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new k3k0(copyOf);
    }

    public final d1a0 d() {
        d1a0 d1a0Var = new d1a0();
        d1a0Var.b = this;
        d1a0Var.c = null;
        Object[] objArr = this.b;
        d1a0Var.d = objArr;
        d1a0Var.e = 0;
        d1a0Var.f = new fto0();
        d1a0Var.g = null;
        d1a0Var.h = objArr;
        d1a0Var.i = size();
        return d1a0Var;
    }

    @Override // xsna.ff, java.util.List
    public final E get(int i) {
        tci.a(i, size());
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
        tci.b(i, size());
        return new fm8(this.b, i, size());
    }
}
