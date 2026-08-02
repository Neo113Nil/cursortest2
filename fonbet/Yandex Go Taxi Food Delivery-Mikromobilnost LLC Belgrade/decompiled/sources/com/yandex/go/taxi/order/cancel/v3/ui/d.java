package com.yandex.go.taxi.order.cancel.v3.ui;

import defpackage.dz7;
import defpackage.py7;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class d implements yt11 {
    public final dz7 a = new dz7();
    public final tpr b;

    public d(py7 py7Var, tt2 tt2Var) {
        c cVar = new c(new m0(py7Var.d, py7Var.b, CancelReasonsV3UiStateInteractor$uiStateFlow$1.a), this);
        tt2Var.getClass();
        this.b = e.F(cVar, uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }
}
