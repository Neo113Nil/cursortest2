package com.yandex.go.taxi.order.cancel.v2.data;

import defpackage.mvg;
import defpackage.nk70;
import defpackage.ny61;
import defpackage.ok70;
import defpackage.rk70;
import defpackage.sk70;
import defpackage.tk70;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrk70;", "image", "Lok70;", "items", "Ltk70;", "<anonymous>", "(Lrk70;Lok70;)Ltk70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2", f = "OrderCancelModalContentRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ nk70 $buttonsFlow;
    final /* synthetic */ String $orderId;
    final /* synthetic */ sk70 $titleAndText;
    final /* synthetic */ String $type;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2(String str, String str2, sk70 sk70Var, nk70 nk70Var, Continuation continuation) {
        super(3, continuation);
        this.$orderId = str;
        this.$type = str2;
        this.$titleAndText = sk70Var;
        this.$buttonsFlow = nk70Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2 orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2 = new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2(this.$orderId, this.$type, this.$titleAndText, this.$buttonsFlow, (Continuation) obj3);
        orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2.L$0 = (rk70) obj;
        orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2.L$1 = (ok70) obj2;
        return orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rk70 rk70Var = (rk70) this.L$0;
        ok70 ok70Var = (ok70) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new tk70(this.$orderId, this.$type, rk70Var, this.$titleAndText, ok70Var, this.$buttonsFlow);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
