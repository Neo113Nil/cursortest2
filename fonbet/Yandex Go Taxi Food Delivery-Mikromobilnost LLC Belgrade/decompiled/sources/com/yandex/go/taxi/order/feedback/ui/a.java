package com.yandex.go.taxi.order.feedback.ui;

import com.yandex.go.feedback_common.data.model.QuestionInfo;
import defpackage.isq;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xtq;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public a(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedbackViewPresenter$attachView$$inlined$map$1$2$1 feedbackViewPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FeedbackViewPresenter$attachView$$inlined$map$1$2$1) {
            feedbackViewPresenter$attachView$$inlined$map$1$2$1 = (FeedbackViewPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = feedbackViewPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackViewPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedbackViewPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackViewPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xtq xtqVar = (xtq) obj;
                    isq isqVar = this.b.K;
                    isqVar.getClass();
                    List list = isqVar.l;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            QuestionInfo questionInfo = (QuestionInfo) it.next();
                            if (jl40.l(xtqVar.a, questionInfo.a)) {
                                xtqVar = new xtq(xtqVar.c, xtqVar.a, xtqVar.b, questionInfo.b, xtqVar.e);
                                break;
                            }
                        }
                    }
                    feedbackViewPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    feedbackViewPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    feedbackViewPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    feedbackViewPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    feedbackViewPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(xtqVar, feedbackViewPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        feedbackViewPresenter$attachView$$inlined$map$1$2$1 = new FeedbackViewPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = feedbackViewPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackViewPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
