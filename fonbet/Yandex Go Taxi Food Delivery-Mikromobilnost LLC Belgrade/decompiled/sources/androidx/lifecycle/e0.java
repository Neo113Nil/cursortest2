package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.c2m0;
import defpackage.pey;
import defpackage.vg10;

/* loaded from: classes.dex */
public final class e0 implements q {
    public final c2m0 a;

    public e0(c2m0 c2m0Var) {
        this.a = c2m0Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            vg10.o(event, "Next event must be ON_CREATE, it was ");
        } else {
            peyVar.getLifecycle().d(this);
            this.a.b();
        }
    }
}
