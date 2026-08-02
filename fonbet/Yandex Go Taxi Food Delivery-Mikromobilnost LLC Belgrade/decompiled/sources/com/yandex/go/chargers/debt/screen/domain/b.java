package com.yandex.go.chargers.debt.screen.domain;

import defpackage.bq9;
import defpackage.ha2;
import defpackage.mth;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vp9;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.go.chargers.debt.screen.data.a a;
    public final tpr b;

    public b(tt2 tt2Var, pwy0 pwy0Var, bq9 bq9Var, vp9 vp9Var, com.yandex.go.chargers.payments.data.a aVar, com.yandex.go.chargers.debt.screen.data.a aVar2) {
        this.a = aVar2;
        ha2 m = e.m(pwy0Var.a(), e.t(vp9Var.a), new mth(bq9Var.a(), 6), aVar.e(), new ChargersDebtUiStateInteractor$uiStateFlow$1(this, null));
        tt2Var.getClass();
        this.b = e.F(m, uyj.a);
    }
}
