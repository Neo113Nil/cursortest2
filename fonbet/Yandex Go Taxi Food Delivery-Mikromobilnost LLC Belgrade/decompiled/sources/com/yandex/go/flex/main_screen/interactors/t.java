package com.yandex.go.flex.main_screen.interactors;

import defpackage.geu0;
import defpackage.tpr;
import defpackage.tyz0;
import defpackage.yla0;
import defpackage.zbw0;

/* loaded from: classes.dex */
public final class t {
    public final geu0 a;
    public final tyz0 b;
    public final yla0 c;
    public final zbw0 d;

    public t(geu0 geu0Var, tyz0 tyz0Var, yla0 yla0Var, zbw0 zbw0Var) {
        this.a = geu0Var;
        this.b = tyz0Var;
        this.c = yla0Var;
        this.d = zbw0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.d(this.a.a), new StickyStateFractionInteractorImpl$progressFractionFlow$1(this, null)));
    }
}
