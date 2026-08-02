package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class gxs0 extends nxs0 {
    public final /* synthetic */ cxs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxs0(cxs0 cxs0Var) {
        super(cxs0Var, 2);
        this.c = cxs0Var;
    }

    @Override // defpackage.nxs0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dxs0(this.c);
    }
}
