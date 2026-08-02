package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes9.dex */
public final class cfy implements q {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Lifecycle b;

    public cfy(Lifecycle lifecycle, Runnable runnable) {
        this.a = runnable;
        this.b = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.a.run();
            this.b.d(this);
        }
    }
}
