package com.yandex.go.summary.interactor.expanded.state;

import defpackage.dpo;
import defpackage.tpr;
import defpackage.yt11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a implements yt11 {
    public final m0 a;

    public a(dpo dpoVar, r rVar) {
        this.a = new m0(com.yandex.go.coroutines.b.d(dpoVar.a, new ExpandedSummaryUiStateInteractor$special$$inlined$start$1(2, null)), rVar.h, new ExpandedSummaryUiStateInteractor$uiStateFlow$2(3, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.a;
    }
}
