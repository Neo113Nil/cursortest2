package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class edt0 implements Iterable, Iterator, xfx {
    public final sus0 a;
    public final int b;
    public final int c;
    public final int w;
    public final xz5 x;
    public int y;

    public edt0(sus0 sus0Var, int i, dts dtsVar) {
        this.a = sus0Var;
        int[] iArr = sus0Var.a;
        int i2 = iArr[(i * 5) + 4];
        this.b = i2;
        this.c = 0;
        int i3 = i + 1;
        this.w = (i3 < sus0Var.b ? iArr[(i3 * 5) + 4] : sus0Var.w) - i2;
        xz5 xz5Var = new xz5();
        this.x = xz5Var;
        this.y = xz5Var.a(this.c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y < this.w;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.y;
        Object obj = (i < 0 || i >= this.w) ? null : this.a.c[this.b + i];
        this.y = this.x.a(i + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
