package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes2.dex */
public final class bey implements q {
    public final /* synthetic */ Lifecycle.State a;
    public final /* synthetic */ Runnable b;

    public bey(Lifecycle.State state, Runnable runnable) {
        this.a = state;
        this.b = runnable;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (peyVar.getLifecycle().b().a(this.a)) {
            this.b.run();
            peyVar.getLifecycle().d(this);
        } else if (event.compareTo(Lifecycle.Event.ON_PAUSE) >= 0) {
            peyVar.getLifecycle().d(this);
        }
    }
}
