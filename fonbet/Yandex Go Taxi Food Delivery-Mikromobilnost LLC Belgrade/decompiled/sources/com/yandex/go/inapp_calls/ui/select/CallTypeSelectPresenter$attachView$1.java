package com.yandex.go.inapp_calls.ui.select;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/inapp_calls/experiment/InAppCallExperiment;", "experiment", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.ui.select.CallTypeSelectPresenter$attachView$1", f = "CallTypeSelectPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CallTypeSelectPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallTypeSelectPresenter$attachView$1 callTypeSelectPresenter$attachView$1 = new CallTypeSelectPresenter$attachView$1(3, (Continuation) obj3);
        callTypeSelectPresenter$attachView$1.L$0 = (InAppCallExperiment) obj;
        return callTypeSelectPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return inAppCallExperiment;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
