package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes6.dex */
public final class fcs implements q {
    public final /* synthetic */ Lifecycle.State a;
    public final /* synthetic */ ud30 b;

    public fcs(Lifecycle.State state, ud30 ud30Var) {
        this.a = state;
        this.b = ud30Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle.State a = event.a();
        int i = ecs.a[a.ordinal()];
        if (a == this.a) {
            this.b.run();
            peyVar.getLifecycle().d(this);
        } else if (i == 1) {
            peyVar.getLifecycle().d(this);
        }
    }
}
