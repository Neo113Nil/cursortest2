package com.yandex.go.summary.interactor;

import com.yandex.go.summary.interactor.common.state.h;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a implements yt11 {
    public final tpr a;

    public a(tt2 tt2Var, h hVar, com.yandex.go.summary.interactor.mapcontent.state.a aVar) {
        m0 m0Var = new m0(aVar.a, hVar.a, new SummaryUiStateInteractor$uiStateFlow$1(3, null));
        tt2Var.getClass();
        this.a = e.F(m0Var, uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.a;
    }
}
