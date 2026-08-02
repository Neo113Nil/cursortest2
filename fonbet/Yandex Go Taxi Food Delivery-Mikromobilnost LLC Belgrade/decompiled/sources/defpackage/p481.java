package defpackage;

import java.util.ListIterator;
import yads.t31;

/* loaded from: classes7.dex */
public final class p481 extends wr71 implements ListIterator {
    public final int a;
    public int b;
    public final t31 c;

    public p481(t31 t31Var, int i) {
        int size = t31Var.size();
        oaa1.i(i, size);
        this.a = size;
        this.b = i;
        this.c = t31Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        int i = this.b;
        this.b = i + 1;
        return this.c.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.c.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
