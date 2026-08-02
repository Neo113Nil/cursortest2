package com.yandex.go.delivery.rental_duration_selector;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "loadingState", "Lkotlin/Pair;", "", "<anonymous>", "(Lfnx0;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.rental_duration_selector.DeliveryRentalDurationPresenter$timeDetailsFlow$1", f = "DeliveryRentalDurationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRentalDurationPresenter$timeDetailsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRentalDurationPresenter$timeDetailsFlow$1 deliveryRentalDurationPresenter$timeDetailsFlow$1 = new DeliveryRentalDurationPresenter$timeDetailsFlow$1(3, (Continuation) obj3);
        deliveryRentalDurationPresenter$timeDetailsFlow$1.L$0 = (fnx0) obj;
        deliveryRentalDurationPresenter$timeDetailsFlow$1.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        return deliveryRentalDurationPresenter$timeDetailsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(fnx0Var, Boolean.valueOf(priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
