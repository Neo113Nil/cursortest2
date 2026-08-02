package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class irv implements Iterator, xfx {
    public final /* synthetic */ int a = 1;
    public int b;
    public final Iterator c;

    public irv(c8x0 c8x0Var) {
        this.b = c8x0Var.b;
        this.c = c8x0Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c.hasNext();
            default:
                return this.b > 0 && this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return new hrv(i, this.c.next());
                }
                scc.m();
                throw null;
            default:
                int i2 = this.b;
                if (i2 != 0) {
                    this.b = i2 - 1;
                    return this.c.next();
                }
                ny61.p();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public irv(Iterator it) {
        this.c = it;
    }
}
