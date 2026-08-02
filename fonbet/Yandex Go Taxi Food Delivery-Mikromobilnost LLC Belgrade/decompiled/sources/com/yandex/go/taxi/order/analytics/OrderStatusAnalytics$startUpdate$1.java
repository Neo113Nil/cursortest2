package com.yandex.go.taxi.order.analytics;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o780;
import defpackage.tls;
import defpackage.w53;
import defpackage.zf;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.analytics.OrderStatusAnalytics$startUpdate$1", f = "OrderStatusAnalytics.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusAnalytics$startUpdate$1 extends SuspendLambda implements tls {
    final /* synthetic */ int $id;
    final /* synthetic */ String $orderId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusAnalytics$startUpdate$1(a aVar, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderStatusAnalytics$startUpdate$1(this.this$0, this.$orderId, this.$id, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((OrderStatusAnalytics$startUpdate$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        String str;
        g050 g050Var;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            aVar = this.this$0;
            kotlinx.coroutines.sync.a aVar2 = aVar.f;
            str = this.$orderId;
            int i3 = this.$id;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = str;
            this.I$0 = i3;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar2;
            i = i3;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            str = (String) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            w53 w53Var = aVar.d;
            zf zfVar = aVar.c;
            if (w53Var.containsKey(str)) {
                zfVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("when", "OrderPolling.Update.Start");
                zfVar.a.a("OrderPolling.Update.Conflict", hashMap, 1, new HashMap());
            }
            aVar.d.put(str, new o780(i));
            zfVar.getClass();
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
            }
            zfVar.a.a("OrderPolling.Update.Start", hashMap2, 1, new HashMap());
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
