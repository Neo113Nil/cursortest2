package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class fxs0 extends nxs0 {
    public final /* synthetic */ bxs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxs0(bxs0 bxs0Var) {
        super(bxs0Var, 1);
        this.c = bxs0Var;
    }

    @Override // defpackage.nxs0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dxs0(this.c);
    }
}
