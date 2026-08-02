package com.yandex.go.inapp_calls.navigation.fullscreenintent;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.navigation.fullscreenintent.FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3", f = "FullScreenIntentNotificationHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3 extends SuspendLambda implements wls {
    final /* synthetic */ InAppCallExperiment $experiment;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3(InAppCallExperiment inAppCallExperiment, Continuation continuation) {
        super(2, continuation);
        this.$experiment = inAppCallExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3 fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3 = new FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3(this.$experiment, continuation);
        fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3.L$0 = obj;
        return fullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenIntentNotificationHandlerImpl$awaitOrderStateMatches$3) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(this.$experiment.k.d.contains(taxiOrder.h.getB().toString()));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
