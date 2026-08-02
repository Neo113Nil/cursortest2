package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class de11 implements Iterator, xfx {
    public Object[] a = ce11.e.d;
    public int b;
    public int c;

    public final void a(int i, int i2, Object[] objArr) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
