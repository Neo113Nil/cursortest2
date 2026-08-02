package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersParams;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersResponse;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersPagination;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.OrdersStatus;
import defpackage.h20;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lr1e0;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersResponse;", "<anonymous>", "(Ltse;)Lr1e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$requestOrders$2", f = "MasstransitOrdersRepository.kt", l = {HProv.ALG_SID_SHA3_384, HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$requestOrders$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$requestOrders$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitOrdersRepository$requestOrders$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$requestOrders$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1e0 r1e0Var;
        h20 h20Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                MasstransitOrdersParams masstransitOrdersParams = new MasstransitOrdersParams(OrdersStatus.ACTIVE, new OrdersPagination(0));
                h hVar = this.this$0.a;
                this.L$0 = null;
                this.label = 1;
                obj = hVar.b(masstransitOrdersParams, this);
                if (obj == coroutineSingletons) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r1e0 r1e0Var2 = (r1e0) this.L$2;
                        kotlin.b.b(obj);
                        return r1e0Var2;
                    }
                    r1e0Var = (r1e0) this.L$2;
                    h20Var = (h20) this.L$1;
                    kotlin.b.b(obj);
                    k kVar = this.this$0;
                    String str = h20Var.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = r1e0Var;
                    this.L$3 = null;
                    this.label = 3;
                    return kVar.o(str, (List) obj, this) != coroutineSingletons ? coroutineSingletons : r1e0Var;
                }
                kotlin.b.b(obj);
            }
            h20 h20Var2 = (h20) obj;
            r1e0Var = h20Var2.b;
            k kVar2 = this.this$0;
            List list = ((MasstransitOrdersResponse) r1e0Var.a).a;
            this.L$0 = null;
            this.L$1 = h20Var2;
            this.L$2 = r1e0Var;
            this.label = 2;
            kVar2.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new MasstransitOrdersRepository$preloadAllMedia$2(kVar2, list, null), this);
            if (k0 != coroutineSingletons) {
                h20Var = h20Var2;
                obj = k0;
                k kVar3 = this.this$0;
                String str2 = h20Var.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = r1e0Var;
                this.L$3 = null;
                this.label = 3;
                if (kVar3.o(str2, (List) obj, this) != coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.j(th);
            return null;
        }
    }
}
