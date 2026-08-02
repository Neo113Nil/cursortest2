package com.yandex.quark.webchat.observers;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import defpackage.eja1;
import defpackage.gci0;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.x0j;
import defpackage.y3x0;

/* loaded from: classes8.dex */
public abstract class b implements DefaultLifecycleObserver, x0j {
    public final y3x0 a;
    public final tpr b;
    public final Lifecycle.State c;
    public pzt0 w;

    public b(y3x0 y3x0Var, gci0 gci0Var, Lifecycle.State state) {
        this.a = y3x0Var;
        this.b = gci0Var;
        this.c = state;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.w = tje.N(eja1.s(peyVar), null, null, new WebViewLifecycleAwareObserver$onCreate$1(this, peyVar, null), 3);
    }

    @Override // defpackage.x0j
    public final void onDetach() {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.w = null;
    }
}
