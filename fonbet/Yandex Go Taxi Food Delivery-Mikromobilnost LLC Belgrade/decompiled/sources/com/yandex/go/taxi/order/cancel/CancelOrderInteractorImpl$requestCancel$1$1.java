package com.yandex.go.taxi.order.cancel;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.CancelRules;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qw7;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.CancelOrderInteractorImpl$requestCancel$1$1", f = "CancelOrderInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelOrderInteractorImpl$requestCancel$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ OrderStatusParam.Break $orderBreak;
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $userId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qw7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelOrderInteractorImpl$requestCancel$1$1(qw7 qw7Var, String str, String str2, OrderStatusParam.Break r4, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qw7Var;
        this.$userId = str;
        this.$orderId = str2;
        this.$orderBreak = r4;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CancelOrderInteractorImpl$requestCancel$1$1 cancelOrderInteractorImpl$requestCancel$1$1 = new CancelOrderInteractorImpl$requestCancel$1$1(this.this$0, this.$userId, this.$orderId, this.$orderBreak, this.$order, continuation);
        cancelOrderInteractorImpl$requestCancel$1$1.L$0 = obj;
        return cancelOrderInteractorImpl$requestCancel$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelOrderInteractorImpl$requestCancel$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r10.emit(r0, r14) == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r0 == r11) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.factory.a aVar = this.this$0.d;
            String str = this.$userId;
            String str2 = this.$orderId;
            OrderStatusParam.Break r5 = this.$orderBreak;
            CancelRules cancelRules = this.$order.h.a;
            String str3 = cancelRules != null ? cancelRules.b : null;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            a = aVar.a(str, str2, null, false, r5, str3, null, null, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            a = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
