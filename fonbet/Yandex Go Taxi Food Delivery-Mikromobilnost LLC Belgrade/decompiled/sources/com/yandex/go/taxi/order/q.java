package com.yandex.go.taxi.order;

import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import defpackage.crq0;
import defpackage.ffx;
import defpackage.jqr;
import defpackage.jse;
import defpackage.l8x;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ycs0;
import defpackage.ysg;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes8.dex */
public final class q {
    public final tse a;
    public final FeedbackApi b;
    public final ysg c;
    public final jse d;
    public final ycs0 e;
    public final ycs0 f;

    public q(tse tseVar, FeedbackApi feedbackApi, ysg ysgVar, tt2 tt2Var) {
        this.a = tseVar;
        this.b = feedbackApi;
        this.c = ysgVar;
        tt2Var.getClass();
        this.d = uyj.a.P(1);
        this.e = new ycs0(0);
        this.f = new ycs0(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, String str, FeedbackParam feedbackParam, ContinuationImpl continuationImpl) {
        FeedbackSender$sendFeedback$4 feedbackSender$sendFeedback$4;
        int i;
        qVar.getClass();
        if (continuationImpl instanceof FeedbackSender$sendFeedback$4) {
            feedbackSender$sendFeedback$4 = (FeedbackSender$sendFeedback$4) continuationImpl;
            int i2 = feedbackSender$sendFeedback$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackSender$sendFeedback$4.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackSender$sendFeedback$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackSender$sendFeedback$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jse jseVar = qVar.d;
                    FeedbackSender$sendFeedback$5$1 feedbackSender$sendFeedback$5$1 = new FeedbackSender$sendFeedback$5$1(qVar, feedbackParam, null);
                    feedbackSender$sendFeedback$4.L$0 = str;
                    feedbackSender$sendFeedback$4.L$1 = null;
                    feedbackSender$sendFeedback$4.label = 1;
                    if (tje.k0(jseVar, feedbackSender$sendFeedback$5$1, feedbackSender$sendFeedback$4) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) feedbackSender$sendFeedback$4.L$0;
                    kotlin.b.b(obj);
                }
                crq0.b(str);
                return zy11.a;
            }
        }
        feedbackSender$sendFeedback$4 = new FeedbackSender$sendFeedback$4(qVar, continuationImpl);
        Object obj2 = feedbackSender$sendFeedback$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackSender$sendFeedback$4.label;
        if (i != 0) {
        }
        crq0.b(str);
        return zy11.a;
    }

    public final void b(FeedbackParam feedbackParam) {
        String str = feedbackParam.d;
        ycs0 ycs0Var = this.e;
        lz40 lz40Var = (lz40) ycs0Var.get(str);
        if (lz40Var == null) {
            lz40Var = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
            ycs0Var.put(str, lz40Var);
        }
        ycs0 ycs0Var2 = this.f;
        l8x l8xVar = (l8x) ycs0Var2.get(str);
        if (l8xVar == null || !l8xVar.isActive()) {
            ycs0Var2.replace(str, com.yandex.go.coroutines.b.h(this.a, new kotlinx.coroutines.flow.k(new jqr(kotlinx.coroutines.flow.e.N(new jqr(lz40Var, new FeedbackSender$sendFeedback$1(this, str, null), 3), 1000L), new FeedbackSender$sendFeedback$2(this, null), 3), new FeedbackSender$sendFeedback$3(this, str, null))));
        }
        lz40Var.g(feedbackParam);
    }
}
