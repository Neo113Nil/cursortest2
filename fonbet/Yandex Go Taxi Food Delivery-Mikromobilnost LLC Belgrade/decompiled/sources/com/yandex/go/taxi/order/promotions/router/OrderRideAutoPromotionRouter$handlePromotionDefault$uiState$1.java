package com.yandex.go.taxi.order.promotions.router;

import defpackage.d4y0;
import defpackage.e480;
import defpackage.h480;
import defpackage.j8e0;
import defpackage.m8e0;
import defpackage.mvg;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln8e0;", "<anonymous>", "(Ltse;)Ln8e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.router.OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1", f = "OrderRideAutoPromotionRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1 extends SuspendLambda implements wls {
    final /* synthetic */ d4y0 $promotion;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1(d4y0 d4y0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$promotion = d4y0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1(this.$promotion, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d4y0 d4y0Var = this.$promotion;
        com.yandex.go.taxi.order.popup.b bVar = this.this$0.K;
        e480 e480Var = d4y0Var.e;
        o8s0 o8s0Var = d4y0Var.c;
        bVar.getClass();
        String str = e480Var.a;
        String h = bVar.h(e480Var.b);
        String h2 = bVar.h(e480Var.c);
        m8e0 c = com.yandex.go.taxi.order.popup.b.c(e480Var.d, e480Var.e);
        int i = o8s0Var.a;
        h480 h480Var = e480Var.f;
        n8e0 n8e0Var = new n8e0(str, h, bVar.f.b(bVar.a), h2, c, EmptyList.a, i, 0, bVar.b(h480Var != null ? h480Var.a : null), new j8e0(null, 3));
        if (com.yandex.go.taxi.order.popup.b.a(n8e0Var)) {
            return n8e0Var;
        }
        return null;
    }
}
