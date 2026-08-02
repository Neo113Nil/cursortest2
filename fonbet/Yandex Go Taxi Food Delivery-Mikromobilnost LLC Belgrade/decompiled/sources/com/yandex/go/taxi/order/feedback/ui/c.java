package com.yandex.go.taxi.order.feedback.ui;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.RatingDisplayPolicy;
import defpackage.jsq0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public c(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedbackViewPresenter$attachView$$inlined$map$2$2$1 feedbackViewPresenter$attachView$$inlined$map$2$2$1;
        int i;
        boolean z;
        Boolean valueOf;
        if (continuation instanceof FeedbackViewPresenter$attachView$$inlined$map$2$2$1) {
            feedbackViewPresenter$attachView$$inlined$map$2$2$1 = (FeedbackViewPresenter$attachView$$inlined$map$2$2$1) continuation;
            int i2 = feedbackViewPresenter$attachView$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackViewPresenter$attachView$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedbackViewPresenter$attachView$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackViewPresenter$attachView$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    FeedbackDto h = ((TaxiOrder) obj).V().h();
                    if (h != null) {
                        RatingDisplayPolicy ratingDisplayPolicy = h.d;
                        jsq0 a = ratingDisplayPolicy != null ? ratingDisplayPolicy.getA() : null;
                        if (a != null) {
                            z = a.contains(RatingDisplayPolicy.DisplayOnType.DETAILS);
                            valueOf = Boolean.valueOf(z);
                            feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$0 = null;
                            feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$1 = null;
                            feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$2 = null;
                            feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$3 = null;
                            feedbackViewPresenter$attachView$$inlined$map$2$2$1.label = 1;
                            if (this.a.emit(valueOf, feedbackViewPresenter$attachView$$inlined$map$2$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z = true;
                    valueOf = Boolean.valueOf(z);
                    feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$0 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$1 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$2 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$2$1.L$3 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, feedbackViewPresenter$attachView$$inlined$map$2$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        feedbackViewPresenter$attachView$$inlined$map$2$2$1 = new FeedbackViewPresenter$attachView$$inlined$map$2$2$1(this, continuation);
        Object obj22 = feedbackViewPresenter$attachView$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackViewPresenter$attachView$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
