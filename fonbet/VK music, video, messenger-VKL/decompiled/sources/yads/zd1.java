package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class zd1 extends g {
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ ph2 e;

    public zd1(Iterator it, ph2 ph2Var) {
        this.d = it;
        this.e = ph2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.d.hasNext()) {
            Object next = this.d.next();
            if (this.e.apply(next)) {
                return next;
            }
        }
        this.b = 3;
        return null;
    }
}
