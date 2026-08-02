package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Le8o0;", "<anonymous>", "(Ltse;)Le8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ s8o0 $it;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1(i iVar, s8o0 s8o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$it = s8o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        i iVar = this.this$0;
        s8o0 s8o0Var = this.$it;
        this.label = 1;
        Object b = i.b(iVar, s8o0Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
