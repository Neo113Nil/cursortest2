package com.yandex.go.taxi.order.feedback;

import com.yandex.go.image.domain.requests.g;
import defpackage.jgv;
import defpackage.kuq;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final jgv a;
    public final pav b;
    public final kuq c;
    public final tt2 d;

    public a(jgv jgvVar, pav pavVar, kuq kuqVar, tt2 tt2Var) {
        this.a = jgvVar;
        this.b = pavVar;
        this.c = kuqVar;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        FeedbackSelectorDecorationUpdater$preloadImageToMemory$1 feedbackSelectorDecorationUpdater$preloadImageToMemory$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof FeedbackSelectorDecorationUpdater$preloadImageToMemory$1) {
            feedbackSelectorDecorationUpdater$preloadImageToMemory$1 = (FeedbackSelectorDecorationUpdater$preloadImageToMemory$1) continuationImpl;
            int i2 = feedbackSelectorDecorationUpdater$preloadImageToMemory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackSelectorDecorationUpdater$preloadImageToMemory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackSelectorDecorationUpdater$preloadImageToMemory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackSelectorDecorationUpdater$preloadImageToMemory$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                b.b(obj);
                if (str != null) {
                    g gVar = (g) aVar.b.e();
                    gVar.c(str);
                    gVar.g = true;
                    feedbackSelectorDecorationUpdater$preloadImageToMemory$1.L$0 = null;
                    feedbackSelectorDecorationUpdater$preloadImageToMemory$1.label = 1;
                    if (ru.yandex.taxi.utils.a.e(gVar, feedbackSelectorDecorationUpdater$preloadImageToMemory$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        feedbackSelectorDecorationUpdater$preloadImageToMemory$1 = new FeedbackSelectorDecorationUpdater$preloadImageToMemory$1(aVar, continuationImpl);
        Object obj2 = feedbackSelectorDecorationUpdater$preloadImageToMemory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackSelectorDecorationUpdater$preloadImageToMemory$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final Object b(Pair pair, Continuation continuation) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2(pair, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
