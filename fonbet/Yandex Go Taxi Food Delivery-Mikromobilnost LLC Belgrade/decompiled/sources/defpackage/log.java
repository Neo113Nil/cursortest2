package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class log implements Iterable, Iterator, xfx {
    public final sus0 a;
    public final int b;
    public int c;

    public log(sus0 sus0Var, int i) {
        this.a = sus0Var;
        int[] iArr = sus0Var.a;
        int i2 = iArr[(i * 5) + 4];
        int i3 = i + 1;
        this.b = i3 < sus0Var.b ? iArr[(i3 * 5) + 4] : sus0Var.w;
        this.c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        int i = this.c;
        if (i >= 0) {
            Object[] objArr = this.a.c;
            if (i < objArr.length) {
                obj = objArr[i];
                this.c = i + 1;
                return obj;
            }
        }
        obj = null;
        this.c = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
