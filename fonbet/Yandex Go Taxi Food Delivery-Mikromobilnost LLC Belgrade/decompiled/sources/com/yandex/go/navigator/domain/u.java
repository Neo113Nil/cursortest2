package com.yandex.go.navigator.domain;

import defpackage.el00;
import defpackage.j24;
import defpackage.t35;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class u extends t35 {
    public final el00 d;
    public final yvf0 e;

    public u(el00 el00Var, yvf0 yvf0Var) {
        this.d = el00Var;
        this.e = yvf0Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new NavigationStyleManagerHolder$requestCreation$1(j24Var, this, null));
    }
}
