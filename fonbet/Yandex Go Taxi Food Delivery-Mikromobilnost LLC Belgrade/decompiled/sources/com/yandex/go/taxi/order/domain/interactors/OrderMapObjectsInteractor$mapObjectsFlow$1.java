package com.yandex.go.taxi.order.domain.interactors;

import defpackage.g080;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yz70;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyz70;", "mapObject", "Lg080;", "override", "<anonymous>", "(Lyz70;Lg080;)Lyz70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.interactors.OrderMapObjectsInteractor$mapObjectsFlow$1", f = "OrderMapObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapObjectsInteractor$mapObjectsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapObjectsInteractor$mapObjectsFlow$1(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderMapObjectsInteractor$mapObjectsFlow$1 orderMapObjectsInteractor$mapObjectsFlow$1 = new OrderMapObjectsInteractor$mapObjectsFlow$1(this.this$0, (Continuation) obj3);
        orderMapObjectsInteractor$mapObjectsFlow$1.L$0 = (yz70) obj;
        orderMapObjectsInteractor$mapObjectsFlow$1.L$1 = (g080) obj2;
        return orderMapObjectsInteractor$mapObjectsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yz70 yz70Var = (yz70) this.L$0;
        g080 g080Var = (g080) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (g080Var == null) {
            return yz70Var;
        }
        this.this$0.b.getClass();
        return new yz70(yz70Var.a, g080Var.a, yz70Var.c, yz70Var.d, g080Var.b, yz70Var.f, g080Var.e, yz70Var.h, yz70Var.i, g080Var.d, yz70Var.k, yz70Var.l, yz70Var.m, yz70Var.n, g080Var.c, yz70Var.p, yz70Var.q, yz70Var.r, yz70Var.s, yz70Var.t, yz70Var.u, yz70Var.v);
    }
}
