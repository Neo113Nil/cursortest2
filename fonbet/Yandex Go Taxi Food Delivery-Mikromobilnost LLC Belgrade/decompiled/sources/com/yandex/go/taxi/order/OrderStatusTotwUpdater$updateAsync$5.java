package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.OrderStatusTotwUpdater$updateAsync$5", f = "OrderStatusTotwUpdater.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusTotwUpdater$updateAsync$5 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusTotwUpdater$updateAsync$5(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusTotwUpdater$updateAsync$5(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStatusTotwUpdater$updateAsync$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        e0 e0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e0 e0Var3 = this.this$0;
                try {
                    this.L$0 = e0Var3;
                    this.L$1 = e0Var3;
                    this.label = 1;
                    AtomicInteger atomicInteger = e0.n;
                    Object e = e0Var3.e(0L, this);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    e0Var = e0Var3;
                    obj = e;
                    e0Var2 = e0Var;
                } catch (Throwable th) {
                    th = th;
                    e0Var = e0Var3;
                    AtomicInteger atomicInteger2 = e0.n;
                    e0Var.c(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e0Var = (e0) this.L$1;
                e0Var2 = (e0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    AtomicInteger atomicInteger22 = e0.n;
                    e0Var.c(th);
                    return zy11.a;
                }
            }
            if (((TaxiOrder) obj) != null) {
                AtomicInteger atomicInteger3 = e0.n;
                e0Var2.b();
            }
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
