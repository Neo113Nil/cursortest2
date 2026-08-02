package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.avm0;
import defpackage.bvf0;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yum0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzsm0;", "<anonymous>", "(Ltse;)Lzsm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1", f = "ScootersActivePassesV3RenewMenuUiStateMapper.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ avm0 $paymentElement;
    final /* synthetic */ hfa0 $paymentOptions;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1(e eVar, avm0 avm0Var, hfa0 hfa0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$paymentElement = avm0Var;
        this.$paymentOptions = hfa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1(this.this$0, this.$paymentElement, this.$paymentOptions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$paymentMethodItemAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        yum0 yum0Var = this.$paymentElement.g;
        hfa0 hfa0Var = this.$paymentOptions;
        this.label = 1;
        eVar.getClass();
        Object n = bvf0.n(new ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2(hfa0Var, eVar, yum0Var, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
