package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.question.FeedbackQuestionSelectorLayout;
import defpackage.akk0;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.tik0;
import defpackage.yxf0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class n extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final FeedbackQuestionSelectorLayout R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;
    public yxf0 U;

    public n(FeedbackQuestionSelectorLayout feedbackQuestionSelectorLayout, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(feedbackQuestionSelectorLayout);
        this.R = feedbackQuestionSelectorLayout;
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
        tik0 tik0Var = (tik0) obj;
        akk0 akk0Var = tik0Var.d;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 12));
        b0(new RideCardFeedbackQuestionSelectorViewHolder$processAnalytics$2(this, akk0Var, null));
        FeedbackQuestionSelectorLayout feedbackQuestionSelectorLayout = this.R;
        feedbackQuestionSelectorLayout.getFeedbackQuestionView().update(tik0Var.c);
        this.U = new yxf0(this, tik0Var);
        feedbackQuestionSelectorLayout.getFeedbackQuestionView().setAnswerListener(this.U);
    }
}
