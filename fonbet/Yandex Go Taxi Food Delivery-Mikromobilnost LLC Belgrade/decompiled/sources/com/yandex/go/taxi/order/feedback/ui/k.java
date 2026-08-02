package com.yandex.go.taxi.order.feedback.ui;

import com.yandex.go.taxi.order.feedback.domain.TipsInteractor$resume$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.bgz0;
import defpackage.dm21;
import defpackage.h73;
import defpackage.hvq;
import defpackage.isq;
import defpackage.jqr;
import defpackage.ksq;
import defpackage.kyh0;
import defpackage.mth;
import defpackage.o2y0;
import defpackage.orq;
import defpackage.pzt0;
import defpackage.t8i0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vtq;
import defpackage.wuz;
import defpackage.x4e;
import defpackage.yh70;
import defpackage.yw01;
import defpackage.zuj0;
import java.util.HashMap;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;
import ru.yandex.taxi.order.view.FeedbackView;

/* loaded from: classes14.dex */
public final class k extends ad5 {
    public final o2y0 A;
    public final hvq B;
    public final orq C;
    public final bgz0 D;
    public final com.yandex.go.taxi.order.feedback.domain.a E;
    public final zuj0 F;
    public final wuz G;
    public final a3y0 H;
    public final FeedbackStrategy I;
    public final TaxiOrder J;
    public isq K;
    public pzt0 L;
    public final dm21 x;
    public final com.yandex.go.taxi.order.repositories.c y;
    public final vtq z;

    public k(dm21 dm21Var, com.yandex.go.taxi.order.repositories.c cVar, vtq vtqVar, o2y0 o2y0Var, hvq hvqVar, orq orqVar, bgz0 bgz0Var, com.yandex.go.taxi.order.feedback.domain.a aVar, zuj0 zuj0Var, wuz wuzVar) {
        super(FeedbackMvpView.class);
        this.x = dm21Var;
        this.y = cVar;
        this.z = vtqVar;
        this.A = o2y0Var;
        this.B = hvqVar;
        this.C = orqVar;
        this.D = bgz0Var;
        this.E = aVar;
        this.F = zuj0Var;
        this.G = wuzVar;
        this.H = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "FeedbackViewPresenter");
        this.I = (FeedbackStrategy) hvqVar.b.b;
        this.J = o2y0Var.b();
        this.K = new isq(o2y0Var.b().a);
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.D.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.L;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        bgz0 bgz0Var = this.D;
        tpr f = kotlinx.coroutines.flow.e.f(((com.yandex.go.taxi.order.feedback.domain.b) bgz0Var.b).a(bgz0Var.c.b().a), 0, BufferOverflow.DROP_OLDEST, 1);
        tse tseVar = bgz0Var.a;
        TipsInteractor$resume$$inlined$safeCollectIn$1 tipsInteractor$resume$$inlined$safeCollectIn$1 = new TipsInteractor$resume$$inlined$safeCollectIn$1(f, null, bgz0Var);
        int i = 3;
        bgz0Var.o = tje.N(tseVar, null, null, tipsInteractor$resume$$inlined$safeCollectIn$1, 3);
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(Jg(), null, null, new FeedbackViewPresenter$onResume$$inlined$safeCollectIn$1(new j(new jqr(new mth(bgz0Var.m, 6), new FeedbackViewPresenter$onResume$1(this, null), i)), null, this), 3);
    }

    public final void Kg(FeedbackView feedbackView) {
        Bg(feedbackView);
        o2y0 o2y0Var = this.A;
        String str = o2y0Var.b().a;
        com.yandex.go.taxi.order.feedback.domain.b bVar = (com.yandex.go.taxi.order.feedback.domain.b) this.x;
        tje.N(Jg(), null, null, new FeedbackViewPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.f(bVar.a(str), 0, BufferOverflow.DROP_OLDEST, 1), null, this), 3);
        tje.N(Jg(), null, null, new FeedbackViewPresenter$attachView$$inlined$safeCollectIn$2(this.B.c, null, feedbackView, this), 3);
        tje.N(Jg(), null, null, new FeedbackViewPresenter$attachView$$inlined$safeCollectIn$3(this.D.n, null, feedbackView, this), 3);
        com.yandex.go.taxi.order.repositories.c cVar = this.y;
        tje.N(Jg(), null, null, new FeedbackViewPresenter$attachView$$inlined$safeCollectIn$4(new b(new m0(kotlinx.coroutines.flow.e.I(new f(cVar.b(o2y0Var)), new FeedbackViewPresenter$observeFeedbackQuestionUiState$statusInfoFlow$2(this, null)), kotlinx.coroutines.flow.e.t(new h(bVar.a(this.J.a))), new FeedbackViewPresenter$observeFeedbackQuestionUiState$1(this, null)), this), null, feedbackView), 3);
        tje.N(Jg(), null, null, new FeedbackViewPresenter$attachView$$inlined$safeCollectIn$5(new d(cVar.b(o2y0Var), this), null, feedbackView), 3);
        this.K = new isq(o2y0Var.b().a, bVar.b(o2y0Var.b().a));
        FeedbackMvpView feedbackMvpView = (FeedbackMvpView) Dg();
        FeedbackStrategy feedbackStrategy = this.I;
        feedbackMvpView.setRatingReasonsType(feedbackStrategy.getRatingType(), feedbackStrategy.w2(this.K));
        Mg();
        Og();
    }

    public final void Lg(String str) {
        x4e.B(this.C.e.a, "Complete.FeedbackQuestionShown", kotlin.collections.b.h(new Pair("text", str)), 1);
    }

    public final void Mg() {
        FeedbackMvpView feedbackMvpView = (FeedbackMvpView) Dg();
        feedbackMvpView.showRating(this.K.j);
        feedbackMvpView.showRatingReasons(this.I.I6(this.K));
        feedbackMvpView.showComment(this.K.k);
    }

    public final void Ng() {
        if (this.J.h.b == DriveState.COMPLETE) {
            dm21 dm21Var = this.x;
            isq isqVar = this.K;
            ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).d(isqVar.a, new ksq(isqVar));
            return;
        }
        vtq vtqVar = this.z;
        isq isqVar2 = this.K;
        isqVar2.getClass();
        ((com.yandex.go.taxi.order.feedback.domain.b) vtqVar.a).c(new ksq(isqVar2), true);
    }

    public final void Og() {
        Object value;
        TaxiOrder taxiOrder;
        FeedbackMvpView feedbackMvpView = (FeedbackMvpView) Dg();
        isq isqVar = this.K;
        FeedbackStrategy feedbackStrategy = this.I;
        feedbackMvpView.setRatingReasonsState(feedbackStrategy.w2(isqVar));
        t8i0 qd = feedbackStrategy.qd(this.K, ((avj0) this.F).h(kyh0.comment_hint));
        o2y0 o2y0Var = this.A;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.R(kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(1, feedbackStrategy.I6(this.K)), FeedbackViewPresenter$updateRatingReasonsState$1$ratingReasons$1.b), FeedbackViewPresenter$updateRatingReasonsState$1$ratingReasons$2.b)));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        feedbackMvpView.showRatingReasonsUiState(qd);
        boolean z = qd.d;
        yh70 yh70Var = this.C.d;
        String valueOf = String.valueOf(z);
        yh70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("visible", valueOf);
        yh70Var.a.a("DidChangeCommentVisibility", hashMap, 1, new HashMap());
    }
}
