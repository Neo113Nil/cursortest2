package xsna;

import java.util.Iterator;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class ilu implements Iterator<Object>, gcy {
    public final v2k0 b;
    public final int c;
    public int d;
    public final int e;

    public ilu(v2k0 v2k0Var, int i, int i2) {
        this.b = v2k0Var;
        this.c = i2;
        this.d = i;
        this.e = v2k0Var.i;
        if (v2k0Var.h) {
            x2k0.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        v2k0 v2k0Var = this.b;
        int i = v2k0Var.i;
        int i2 = this.e;
        if (i != i2) {
            x2k0.g();
        }
        int i3 = this.d;
        this.d = x2k0.a(i3, v2k0Var.b) + i3;
        return new w2k0(v2k0Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
