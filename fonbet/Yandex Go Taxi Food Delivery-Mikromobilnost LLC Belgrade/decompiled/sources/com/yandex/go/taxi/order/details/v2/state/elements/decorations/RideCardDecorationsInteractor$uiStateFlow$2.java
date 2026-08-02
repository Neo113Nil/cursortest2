package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.hbp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmpk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.decorations.RideCardDecorationsInteractor$uiStateFlow$2", f = "RideCardDecorationsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDecorationsInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDecorationsInteractor$uiStateFlow$2(a aVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDecorationsInteractor$uiStateFlow$2(this.this$0, this.$presentationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardDecorationsInteractor$uiStateFlow$2 rideCardDecorationsInteractor$uiStateFlow$2 = (RideCardDecorationsInteractor$uiStateFlow$2) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardDecorationsInteractor$uiStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.a;
        RideCardPresentationType rideCardPresentationType = this.$presentationType;
        eVar.c.f();
        hbp0.e(eVar.c, null, null, new RideCardDecorationsRepository$start$1(eVar, rideCardPresentationType, null), 3);
        return zy11.a;
    }
}
