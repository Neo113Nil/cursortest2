package androidx.collection;

import defpackage.az40;
import defpackage.rrq0;
import defpackage.vrq0;
import defpackage.xfx;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class e implements Iterator, xfx {
    public int a = -1;
    public final rrq0 b;
    public final /* synthetic */ az40 c;

    public e(az40 az40Var) {
        this.c = az40Var;
        this.b = vrq0.a(new MutableOrderedSetWrapper$iterator$1$iterator$1(az40Var, this, null));
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
            this.c.b.h(i);
            this.a = -1;
        }
    }
}
