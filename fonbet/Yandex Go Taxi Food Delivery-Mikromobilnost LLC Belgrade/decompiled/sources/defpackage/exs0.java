package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class exs0 extends nxs0 {
    public final /* synthetic */ axs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exs0(axs0 axs0Var) {
        super(axs0Var, 0);
        this.c = axs0Var;
    }

    @Override // defpackage.nxs0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dxs0(this.c);
    }
}
