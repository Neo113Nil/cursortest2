package com.yandex.go.taxi.order.network;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.g6y0;
import defpackage.i6y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pq70;
import defpackage.tse;
import defpackage.uw40;
import defpackage.wls;
import defpackage.y580;
import defpackage.z580;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.network.OrderSenderImpl$send$1$2", f = "OrderSenderImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSenderImpl$send$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ y580 $callback;
    final /* synthetic */ TaxiOrder $preorder;
    final /* synthetic */ String $zoneName;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSenderImpl$send$1$2(b bVar, TaxiOrder taxiOrder, String str, y580 y580Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$preorder = taxiOrder;
        this.$zoneName = str;
        this.$callback = y580Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderSenderImpl$send$1$2(this.this$0, this.$preorder, this.$zoneName, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderSenderImpl$send$1$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        y580 y580Var;
        y580 y580Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                uw40 uw40Var = ((z580) this.this$0.c.get()).j;
                synchronized (uw40Var) {
                    uw40Var.b.set(true);
                    uw40Var.b();
                }
                b bVar = this.this$0;
                TaxiOrder taxiOrder = this.$preorder;
                String str = this.$zoneName;
                y580 y580Var3 = this.$callback;
                try {
                    boolean a = ((i6y0) ((g6y0) bVar.f.get())).a();
                    this.L$0 = y580Var3;
                    this.L$1 = y580Var3;
                    this.Z$0 = a;
                    this.label = 1;
                    obj = b.a(bVar, taxiOrder, str, y580Var3, a, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    y580Var2 = y580Var3;
                    y580Var = y580Var2;
                } catch (Throwable th2) {
                    th = th2;
                    y580Var = y580Var3;
                    ((pq70) y580Var).b(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y580Var = (y580) this.L$1;
                y580Var2 = (y580) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ((pq70) y580Var).b(th);
                    return zy11.a;
                }
            }
            ((pq70) y580Var2).a((TaxiOrder) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
