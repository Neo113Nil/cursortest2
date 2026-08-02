package com.yandex.go.scooters.passes.active.v3;

import defpackage.kvm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sum0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lutm0;", "<anonymous>", "(Ltse;)Lutm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.ScootersActivePassesV3UiStateMapper$mapToUiState$2$closeButtonAsync$1", f = "ScootersActivePassesV3UiStateMapper.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3UiStateMapper$mapToUiState$2$closeButtonAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ kvm0 $activePassesWindow;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3UiStateMapper$mapToUiState$2$closeButtonAsync$1(g gVar, kvm0 kvm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$activePassesWindow = kvm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3UiStateMapper$mapToUiState$2$closeButtonAsync$1(this.this$0, this.$activePassesWindow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3UiStateMapper$mapToUiState$2$closeButtonAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        g gVar = this.this$0;
        sum0 sum0Var = this.$activePassesWindow.g;
        this.label = 1;
        Object a = g.a(gVar, sum0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
