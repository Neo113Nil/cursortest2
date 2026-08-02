package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.mpk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$DecorationsDto;", "decorationsDto", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$DecorationsDto;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.decorations.RideCardDecorationsRepository$observeRideCardResponse$3", f = "RideCardDecorationsRepository.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDecorationsRepository$observeRideCardResponse$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDecorationsRepository$observeRideCardResponse$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDecorationsRepository$observeRideCardResponse$3 rideCardDecorationsRepository$observeRideCardResponse$3 = new RideCardDecorationsRepository$observeRideCardResponse$3(this.this$0, continuation);
        rideCardDecorationsRepository$observeRideCardResponse$3.L$0 = obj;
        return rideCardDecorationsRepository$observeRideCardResponse$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDecorationsRepository$observeRideCardResponse$3) create((RideCardInfoResponse.PresentationsDto.DecorationsDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideCardInfoResponse.PresentationsDto.DecorationsDto decorationsDto = (RideCardInfoResponse.PresentationsDto.DecorationsDto) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.a;
            this.L$0 = null;
            this.label = 1;
            obj = bVar.a(decorationsDto, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.d.l((mpk0) obj);
        return zy11.a;
    }
}
