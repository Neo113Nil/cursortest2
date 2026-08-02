package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class kz2 extends g {
    public final Iterator d;
    public final /* synthetic */ lz2 e;

    public kz2(lz2 lz2Var) {
        this.e = lz2Var;
        this.d = lz2Var.b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.d.hasNext()) {
            Object next = this.d.next();
            if (this.e.c.contains(next)) {
                return next;
            }
        }
        this.b = 3;
        return null;
    }
}
