package com.yandex.quark.webchat.observers;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.eci0;
import defpackage.eja1;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.x0j;

/* loaded from: classes8.dex */
public final class a implements DefaultLifecycleObserver, x0j {
    public final eci0 a;
    public final sls b;
    public pzt0 c;

    public a(eci0 eci0Var, sls slsVar) {
        this.a = eci0Var;
        this.b = slsVar;
    }

    @Override // defpackage.x0j
    public final void onDetach() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = tje.N(eja1.s(peyVar), null, null, new AuthInvalidReloadObserver$onStart$1(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = null;
    }
}
