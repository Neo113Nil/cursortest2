package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x1p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr1p0;", "<anonymous>", "(Ltse;)Lr1p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ x1p0 $purchaseWindow;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(h hVar, x1p0 x1p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$purchaseWindow = x1p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$purchaseWindow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        h hVar = this.this$0;
        x1p0 x1p0Var = this.$purchaseWindow;
        this.label = 1;
        Object c = h.c(hVar, x1p0Var, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
