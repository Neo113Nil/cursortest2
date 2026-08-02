package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wmm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/address/models/Address;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.DropIntermediateRoutePointsInteractor$startDrop$4", f = "DropIntermediateRoutePointsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DropIntermediateRoutePointsInteractor$startDrop$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wmm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropIntermediateRoutePointsInteractor$startDrop$4(wmm wmmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wmmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DropIntermediateRoutePointsInteractor$startDrop$4 dropIntermediateRoutePointsInteractor$startDrop$4 = new DropIntermediateRoutePointsInteractor$startDrop$4(this.this$0, continuation);
        dropIntermediateRoutePointsInteractor$startDrop$4.L$0 = obj;
        return dropIntermediateRoutePointsInteractor$startDrop$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DropIntermediateRoutePointsInteractor$startDrop$4 dropIntermediateRoutePointsInteractor$startDrop$4 = (DropIntermediateRoutePointsInteractor$startDrop$4) create((Address) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dropIntermediateRoutePointsInteractor$startDrop$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.l(address);
        return zy11.a;
    }
}
