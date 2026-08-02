package com.yandex.go.taxi.order.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.ActiveOrdersProvider$deactivateById$1", f = "ActiveOrdersProvider.kt", l = {182}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ActiveOrdersProvider$deactivateById$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $deactivateByError;
    final /* synthetic */ String $orderId;
    final /* synthetic */ boolean $redirectWasConsumed;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrdersProvider$deactivateById$1(a aVar, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
        this.$redirectWasConsumed = z;
        this.$deactivateByError = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActiveOrdersProvider$deactivateById$1(this.this$0, this.$orderId, this.$redirectWasConsumed, this.$deactivateByError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActiveOrdersProvider$deactivateById$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            String str = this.$orderId;
            boolean z = this.$redirectWasConsumed;
            boolean z2 = this.$deactivateByError;
            this.label = 1;
            if (aVar.h(str, z, z2, this) == coroutineSingletons) {
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
