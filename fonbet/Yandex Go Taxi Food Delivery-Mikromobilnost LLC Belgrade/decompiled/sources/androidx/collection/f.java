package androidx.collection;

import defpackage.kz40;
import defpackage.rrq0;
import defpackage.vrq0;
import defpackage.xfx;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class f implements Iterator, xfx {
    public int a = -1;
    public final rrq0 b;
    public final /* synthetic */ kz40 c;

    public f(kz40 kz40Var) {
        this.c = kz40Var;
        this.b = vrq0.a(new MutableSetWrapper$iterator$1$iterator$1(kz40Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.c.b.m(i);
            this.a = -1;
        }
    }
}
