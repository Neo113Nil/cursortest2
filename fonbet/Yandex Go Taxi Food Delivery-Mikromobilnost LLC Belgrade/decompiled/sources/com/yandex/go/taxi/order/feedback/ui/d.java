package com.yandex.go.taxi.order.feedback.ui;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ k b;

    public d(jqr jqrVar, k kVar) {
        this.a = jqrVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FeedbackViewPresenter$attachView$$inlined$map$2$1 feedbackViewPresenter$attachView$$inlined$map$2$1;
        int i;
        if (continuation instanceof FeedbackViewPresenter$attachView$$inlined$map$2$1) {
            feedbackViewPresenter$attachView$$inlined$map$2$1 = (FeedbackViewPresenter$attachView$$inlined$map$2$1) continuation;
            int i2 = feedbackViewPresenter$attachView$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackViewPresenter$attachView$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackViewPresenter$attachView$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackViewPresenter$attachView$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    feedbackViewPresenter$attachView$$inlined$map$2$1.L$0 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$1.L$1 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$1.L$2 = null;
                    feedbackViewPresenter$attachView$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, feedbackViewPresenter$attachView$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        feedbackViewPresenter$attachView$$inlined$map$2$1 = new FeedbackViewPresenter$attachView$$inlined$map$2$1(this, continuation);
        Object obj2 = feedbackViewPresenter$attachView$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackViewPresenter$attachView$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
