package com.yandex.go.taxi.order.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s780;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lwl40;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.view.OrderViewStateRepository$onResume$2", f = "OrderViewStateRepository.kt", l = {253}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderViewStateRepository$onResume$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderViewStateRepository$onResume$2(l lVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderViewStateRepository$onResume$2 orderViewStateRepository$onResume$2 = new OrderViewStateRepository$onResume$2(this.this$0, (Continuation) obj3);
        orderViewStateRepository$onResume$2.L$0 = (vpr) obj;
        orderViewStateRepository$onResume$2.L$1 = (Throwable) obj2;
        return orderViewStateRepository$onResume$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.i.b("onResume", th, new s780(21));
            wl40 wl40Var = wl40.j;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(wl40Var, this) == coroutineSingletons) {
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
