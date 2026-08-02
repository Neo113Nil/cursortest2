package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.state.BidsBoostButtonUiState$BoostStyle;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.jl40;
import defpackage.kp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isLoading", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo;", "increasePriceInfo", "Lkp5;", "<anonymous>", "(ZLcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo;)Lkp5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsBoostButtonUiStateInteractor$uiStateFlow$1", f = "BidsBoostButtonUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsBoostButtonUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        BidsBoostButtonUiStateInteractor$uiStateFlow$1 bidsBoostButtonUiStateInteractor$uiStateFlow$1 = new BidsBoostButtonUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        bidsBoostButtonUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        bidsBoostButtonUiStateInteractor$uiStateFlow$1.L$0 = (OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo) obj2;
        return bidsBoostButtonUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo = (OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (increasePriceInfo == null) {
            return null;
        }
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo.Button button = increasePriceInfo.c;
        String str = button.a;
        String str2 = button.b;
        return new kp5(str, jl40.l(str2, "forced") ? BidsBoostButtonUiState$BoostStyle.FORCED : jl40.l(str2, "default") ? BidsBoostButtonUiState$BoostStyle.DEFAULT : BidsBoostButtonUiState$BoostStyle.DEFAULT, z);
    }
}
