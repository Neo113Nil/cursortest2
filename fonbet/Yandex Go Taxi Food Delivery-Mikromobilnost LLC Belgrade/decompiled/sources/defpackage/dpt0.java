package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dpt0 implements Iterator, xfx {
    public kb a;
    public final /* synthetic */ ept0 b;

    public dpt0(ept0 ept0Var) {
        this.b = ept0Var;
        this.a = new kb(0, ept0Var.a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        kb kbVar = this.a;
        this.a = new kb(kbVar.a + 1, this.b.a);
        return kbVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
