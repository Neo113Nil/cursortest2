package androidx.collection;

import defpackage.ny61;
import defpackage.qx40;
import defpackage.rrq0;
import defpackage.vrq0;
import defpackage.xfx;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c implements Iterator, xfx {
    public final rrq0 a;
    public int b = -1;
    public final /* synthetic */ qx40 c;

    public c(qx40 qx40Var) {
        this.c = qx40Var;
        this.a = vrq0.a(new MutableEntries$iterator$1$1(qx40Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == -1) {
            ny61.r("Call next() before removing element from the iterator.");
        } else {
            this.c.a.n(i);
            this.b = -1;
        }
    }
}
