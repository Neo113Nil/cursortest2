package com.yandex.go.taxi.order.promotions.modal_default.router;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tr70;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpr70;", "<anonymous>", "(Ltse;)Lpr70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.modal_default.router.OrderDefaultModalRouterImpl$onAttach$1$1$1", f = "OrderDefaultModalRouterImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDefaultModalRouterImpl$onAttach$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tr70 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDefaultModalRouterImpl$onAttach$1$1$1(a aVar, tr70 tr70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = tr70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDefaultModalRouterImpl$onAttach$1$1$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDefaultModalRouterImpl$onAttach$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.taxi.order.promotions.modal_default.mapper.a aVar = this.this$0.G;
        ModalItemDto$DefaultItem modalItemDto$DefaultItem = this.$payload.a;
        this.label = 1;
        Object a = aVar.a(modalItemDto$DefaultItem, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
