package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.dbl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vbl0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "loadingState", "Ldbl0;", "routeStatsInfo", "Lvbl0;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Ldbl0;)Lvbl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$routeStatsFlow$1", f = "VerticalOffersStateInteractorV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$routeStatsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalOffersStateInteractorV2$routeStatsFlow$1 verticalOffersStateInteractorV2$routeStatsFlow$1 = new VerticalOffersStateInteractorV2$routeStatsFlow$1(3, (Continuation) obj3);
        verticalOffersStateInteractorV2$routeStatsFlow$1.L$0 = (PriceUpdate$PriceLoadingState) obj;
        verticalOffersStateInteractorV2$routeStatsFlow$1.L$1 = (dbl0) obj2;
        return verticalOffersStateInteractorV2$routeStatsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$0;
        dbl0 dbl0Var = (dbl0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vbl0(dbl0Var, priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING, priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.FAILED);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
