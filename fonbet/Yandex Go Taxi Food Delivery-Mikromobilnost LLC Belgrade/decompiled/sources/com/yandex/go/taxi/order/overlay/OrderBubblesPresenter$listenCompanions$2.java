package com.yandex.go.taxi.order.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ltl6;", "bubbles", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.overlay.OrderBubblesPresenter$listenCompanions$2", f = "OrderBubblesPresenter.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesPresenter$listenCompanions$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesPresenter$listenCompanions$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderBubblesPresenter$listenCompanions$2 orderBubblesPresenter$listenCompanions$2 = new OrderBubblesPresenter$listenCompanions$2(this.this$0, continuation);
        orderBubblesPresenter$listenCompanions$2.L$0 = obj;
        return orderBubblesPresenter$listenCompanions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderBubblesPresenter$listenCompanions$2) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
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
        com.yandex.go.taxi.order.search.overlay.companions.a aVar = gVar.G;
        o2y0 o2y0Var = gVar.L;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(list, o2y0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
