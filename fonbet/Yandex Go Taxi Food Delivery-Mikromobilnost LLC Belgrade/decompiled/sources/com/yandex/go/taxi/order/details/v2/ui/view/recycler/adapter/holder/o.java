package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionLayout;
import defpackage.akk0;
import defpackage.o8g0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.uik0;
import defpackage.xtq;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class o extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final FeedbackQuestionLayout R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public o8g0 U;

    public o(FeedbackQuestionLayout feedbackQuestionLayout, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(feedbackQuestionLayout);
        this.R = feedbackQuestionLayout;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.R.getFeedbackQuestionView().setAnswerListener(null);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        uik0 uik0Var = (uik0) obj;
        akk0 akk0Var = uik0Var.d;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 13));
        b0(new RideCardFeedbackQuestionViewHolder$processAnalytics$2(this, akk0Var, null));
        xtq xtqVar = uik0Var.c;
        FeedbackQuestionLayout feedbackQuestionLayout = this.R;
        feedbackQuestionLayout.update(xtqVar);
        this.U = new o8g0(this, uik0Var);
        feedbackQuestionLayout.getFeedbackQuestionView().setAnswerListener(this.U);
    }
}
