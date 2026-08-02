package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.avm0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1", f = "ScootersActivePassesV3RenewMenuUiStateMapper.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ avm0 $paymentElement;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1(e eVar, avm0 avm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$paymentElement = avm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1(this.this$0, this.$paymentElement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewMenuUiStateMapper$mapToUiState$2$retryButtonTextAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        this.label = 1;
        Object e = e.e(eVar.b, yum0Var.j, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
