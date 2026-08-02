package com.yandex.go.taxi.order.analytics;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.x4e;
import defpackage.zf;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.analytics.OrderStatusAnalytics$updateNow$1", f = "OrderStatusAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusAnalytics$updateNow$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $from;
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusAnalytics$updateNow$1(a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
        this.$from = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderStatusAnalytics$updateNow$1(this.this$0, this.$orderId, this.$from, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderStatusAnalytics$updateNow$1 orderStatusAnalytics$updateNow$1 = (OrderStatusAnalytics$updateNow$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        orderStatusAnalytics$updateNow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        zf zfVar = this.this$0.c;
        String str = this.$orderId;
        String str2 = this.$from;
        zfVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
        }
        if (str2 != null) {
            hashMap.put("from", str2);
        }
        x4e.B(zfVar.a, "OrderPolling.Update.Now", hashMap, 1);
        return zy11.a;
    }
}
