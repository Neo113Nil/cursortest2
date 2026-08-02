package com.yandex.go.scooters.subscription.domain;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lqyo0;", TarifficatorScenarioActivity.RESULT_KEY, "", "<anonymous>", "(Lkotlin/Result;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.subscription.domain.ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2", f = "ScootersSubscriptionPurchasingPollingInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2 scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2 = new ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2(2, continuation);
        scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2.L$0 = ((Result) obj).getValue();
        return scootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionPurchasingPollingInteractorImpl$waitForPurchaseResult$2) create(new Result(((Result) obj).getValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z2 = obj2 instanceof Result.Failure;
        if (!z2) {
            if (z2) {
                obj2 = null;
            }
            if (obj2 instanceof oyo0) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
