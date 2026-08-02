package com.yandex.go.taxi.order.network;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.network.OrderSenderImpl$checkPendingOrders$1$1", f = "OrderSenderImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSenderImpl$checkPendingOrders$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<Throwable> $onError;
    final /* synthetic */ Consumer<TaxiOrder> $onFound;
    final /* synthetic */ TaxiOrder $preorder;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSenderImpl$checkPendingOrders$1$1(b bVar, Consumer consumer, TaxiOrder taxiOrder, Consumer consumer2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$onFound = consumer;
        this.$preorder = taxiOrder;
        this.$onError = consumer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderSenderImpl$checkPendingOrders$1$1(this.this$0, this.$onFound, this.$preorder, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderSenderImpl$checkPendingOrders$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Consumer<Throwable> consumer;
        Consumer<TaxiOrder> consumer2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                Consumer<TaxiOrder> consumer3 = this.$onFound;
                TaxiOrder taxiOrder = this.$preorder;
                Consumer<Throwable> consumer4 = this.$onError;
                try {
                    bVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    OrderSenderImpl$checkPendingOrders$1$1$1$taxiOrder$1 orderSenderImpl$checkPendingOrders$1$1$1$taxiOrder$1 = new OrderSenderImpl$checkPendingOrders$1$1$1$taxiOrder$1(bVar, taxiOrder, null);
                    this.L$0 = consumer3;
                    this.L$1 = consumer4;
                    this.label = 1;
                    obj = tje.k0(mdhVar, orderSenderImpl$checkPendingOrders$1$1$1$taxiOrder$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    consumer2 = consumer3;
                    consumer = consumer4;
                } catch (Throwable th) {
                    th = th;
                    consumer = consumer4;
                    consumer.accept(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                consumer = (Consumer) this.L$1;
                consumer2 = (Consumer) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    consumer.accept(th);
                    return zy11.a;
                }
            }
            consumer2.accept((TaxiOrder) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
