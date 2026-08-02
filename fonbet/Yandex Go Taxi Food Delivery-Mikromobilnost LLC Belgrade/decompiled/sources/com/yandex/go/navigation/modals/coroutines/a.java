package com.yandex.go.navigation.modals.coroutines;

import defpackage.h55;
import defpackage.l230;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.u45;
import defpackage.w030;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public abstract class a extends h55 {
    public l230 D;
    public pzt0 E;

    public a() {
        super(null);
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        this.E = tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ModalViewNavigationRouter$onAttach$1(this, obj, null), 1);
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            this.E = null;
            pzt0Var.a(null);
        }
        l230 l230Var = this.D;
        if (l230Var != null) {
            this.D = null;
            l230Var.i();
        }
    }

    public abstract w030 P();

    public abstract boolean Q();

    public void R(u45 u45Var) {
    }

    public abstract Object S(Object obj, Continuation continuation);
}
