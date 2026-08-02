package com.yandex.go.taxi.order.bottom_modal.domain;

import defpackage.fef;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uc6;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final pwy0 b;
    public final b c;

    public a(tt2 tt2Var, pwy0 pwy0Var, b bVar) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = bVar;
    }

    public final tpr a(uc6 uc6Var, fef fefVar) {
        g I = e.I(this.b.a(), new BottomModalInteractor$stateFlow$1(this, uc6Var, fefVar, null));
        this.a.getClass();
        return e.F(I, uyj.a);
    }
}
