package com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor;

import defpackage.adw;
import defpackage.edw;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a {
    public final adw a;
    public final edw b;
    public final tt2 c;

    public a(adw adwVar, edw edwVar, tt2 tt2Var) {
        this.a = adwVar;
        this.b = edwVar;
        this.c = tt2Var;
    }

    public final tpr a() {
        adw adwVar = this.a;
        m0 m0Var = new m0(adwVar.c, adwVar.d, new IntercityDashboardFeedbackInteractor$uiStateFlow$1(3, this.b, edw.class, "mapToUiState", "mapToUiState(Lcom/yandex/go/taxi/intercity/dashboard/impl/domain/entity/IntercityDashboardFeedbackData;Ljava/lang/String;)Lcom/yandex/go/taxi/intercity/dashboard/impl/feedback/state/IntercityDashboardFeedbackUiState;", 4));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return e.F(m0Var, mdh.b);
    }
}
