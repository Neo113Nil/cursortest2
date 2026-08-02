package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.decorations.RideCardDecorationsRepository$start$1", f = "RideCardDecorationsRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDecorationsRepository$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDecorationsRepository$start$1(e eVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDecorationsRepository$start$1(this.this$0, this.$presentationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDecorationsRepository$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            RideCardPresentationType rideCardPresentationType = this.$presentationType;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(new d(eVar.b.a(), rideCardPresentationType)), new RideCardDecorationsRepository$observeRideCardResponse$3(eVar, null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
