package com.yandex.go.taxi.order.chat.call_feedback.navigation;

import android.content.Context;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackQuestionModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.h55;
import defpackage.pg5;
import defpackage.tj60;
import defpackage.tje;
import defpackage.w030;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final TaxiOrder D;
    public final Context E;
    public final w030 F;
    public final tj60 G;
    public final pg5 H;

    public a(TaxiOrder taxiOrder, Context context, w030 w030Var, tj60 tj60Var, pg5 pg5Var) {
        super(null);
        this.D = taxiOrder;
        this.E = context;
        this.F = w030Var;
        this.G = tj60Var;
        this.H = pg5Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.F.m(CallFeedbackQuestionModalView.class);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (this.D.V().c(CallFeedbackExperiment.class) != null) {
            tje.N(o(), null, null, new CallFeedbackRouter$onLaunch$1(this, null), 3);
        } else {
            i();
        }
    }
}
