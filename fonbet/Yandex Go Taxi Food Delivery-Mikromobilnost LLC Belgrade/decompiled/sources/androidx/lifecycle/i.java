package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.g2m0;
import defpackage.pey;

/* loaded from: classes10.dex */
public final class i implements q {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ g2m0 b;

    public i(g2m0 g2m0Var, Lifecycle lifecycle) {
        this.a = lifecycle;
        this.b = g2m0Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.a.d(this);
            this.b.d();
        }
    }
}
