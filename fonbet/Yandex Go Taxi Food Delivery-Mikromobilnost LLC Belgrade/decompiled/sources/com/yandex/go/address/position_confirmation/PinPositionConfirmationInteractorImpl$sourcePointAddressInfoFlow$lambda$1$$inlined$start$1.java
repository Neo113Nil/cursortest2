package com.yandex.go.address.position_confirmation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1", f = "PinPositionConfirmationInteractorImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $lastKnownAddressInfo$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1(pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.$lastKnownAddressInfo$inlined = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1 pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1 = new PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1(this.$lastKnownAddressInfo$inlined, continuation);
        pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1.L$0 = obj;
        return pinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pv0 pv0Var = this.$lastKnownAddressInfo$inlined;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(pv0Var, this) == coroutineSingletons) {
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
