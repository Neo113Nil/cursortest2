package com.yandex.go.summary.interactor.anchored.state;

import defpackage.g92;
import defpackage.ha2;
import defpackage.ie;
import defpackage.m8u0;
import defpackage.tpr;
import defpackage.yt11;

/* loaded from: classes14.dex */
public final class a implements yt11 {
    public final ha2 a;

    public a(y yVar, ie ieVar, t tVar) {
        this.a = kotlinx.coroutines.flow.e.m(new g92(2, m8u0.b), yVar.b, (com.yandex.go.summary.interactor.anchored.state.content.a) ieVar.b, tVar.i, new AnchoredSummaryUiStateInteractor$uiStateFlow$1(5, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.a;
    }
}
