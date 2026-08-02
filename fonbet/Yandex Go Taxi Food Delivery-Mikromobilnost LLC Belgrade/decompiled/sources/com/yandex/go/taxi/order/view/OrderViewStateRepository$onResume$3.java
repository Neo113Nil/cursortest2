package com.yandex.go.taxi.order.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lwl40;", "multiOrderHolders", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.OrderViewStateRepository$onResume$3", f = "OrderViewStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderViewStateRepository$onResume$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderViewStateRepository$onResume$3 orderViewStateRepository$onResume$3 = new OrderViewStateRepository$onResume$3(2, continuation);
        orderViewStateRepository$onResume$3.L$0 = obj;
        return orderViewStateRepository$onResume$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderViewStateRepository$onResume$3 orderViewStateRepository$onResume$3 = (OrderViewStateRepository$onResume$3) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderViewStateRepository$onResume$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (list.size() == 2) {
            return zy11.a;
        }
        ny61.g("Failed requirement.");
        return null;
    }
}
