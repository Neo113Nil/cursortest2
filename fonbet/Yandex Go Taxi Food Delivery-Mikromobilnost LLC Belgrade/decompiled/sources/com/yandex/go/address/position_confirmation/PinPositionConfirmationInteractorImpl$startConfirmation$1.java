package com.yandex.go.address.position_confirmation;

import com.yandex.go.analytics.MapAnalytics$BubbleButtonName;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vyb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$startConfirmation$1", f = "PinPositionConfirmationInteractorImpl.kt", l = {201}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PinPositionConfirmationInteractorImpl$startConfirmation$1 extends SuspendLambda implements wls {
    final /* synthetic */ vyb0 $state;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPositionConfirmationInteractorImpl$startConfirmation$1(j jVar, vyb0 vyb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$state = vyb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinPositionConfirmationInteractorImpl$startConfirmation$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinPositionConfirmationInteractorImpl$startConfirmation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.i;
            String str = this.$state.e;
            MapAnalytics$BubbleButtonName mapAnalytics$BubbleButtonName = MapAnalytics$BubbleButtonName.No;
            this.label = 1;
            if (aVar.b(str, mapAnalytics$BubbleButtonName, this) == coroutineSingletons) {
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
