package com.yandex.go.address.position_confirmation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyb0;
import defpackage.pv0;
import defpackage.syb0;
import defpackage.wls;
import defpackage.xna1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "addressInfo", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1", f = "PinPositionConfirmationInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1 pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1 = new PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1(this.this$0, continuation);
        pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1.L$0 = obj;
        return pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1 pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1 = (PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1) create((pv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!xna1.b(pv0Var.a)) {
            this.this$0.l.a(false);
            oyb0 oyb0Var = this.this$0.j;
            oyb0Var.a.l(syb0.a);
        }
        return zy11.a;
    }
}
