package com.yandex.go.payments.order.domain;

import defpackage.i350;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.order.domain.OrderPaymentsListRouter$onLaunch$2", f = "OrderPaymentsListRouter.kt", l = {289}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrderPaymentsListRouter$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentsListRouter$onLaunch$2(e eVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPaymentsListRouter$onLaunch$2(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPaymentsListRouter$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new d(this.this$0.E.b(this.$payload)));
            e eVar = this.this$0;
            o oVar = new o(t, new OrderPaymentsListRouter$onLaunch$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            i350 i350Var = new i350(19, eVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(i350Var, this) == coroutineSingletons) {
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
