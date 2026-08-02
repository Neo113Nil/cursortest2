package com.yandex.go.taxi.order.provider;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.ActiveOrdersProvider$getTaxiOrderFlow$1", f = "ActiveOrdersProvider.kt", l = {49, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActiveOrdersProvider$getTaxiOrderFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrdersProvider$getTaxiOrderFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActiveOrdersProvider$getTaxiOrderFlow$1 activeOrdersProvider$getTaxiOrderFlow$1 = new ActiveOrdersProvider$getTaxiOrderFlow$1(this.this$0, this.$orderId, continuation);
        activeOrdersProvider$getTaxiOrderFlow$1.L$0 = obj;
        return activeOrdersProvider$getTaxiOrderFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActiveOrdersProvider$getTaxiOrderFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r7, r0, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            String str = this.$orderId;
            this.L$0 = vprVar;
            this.label = 1;
            obj = aVar.m(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        o2y0 o2y0Var = (o2y0) obj;
        if (o2y0Var != null) {
            kotlinx.coroutines.flow.internal.g a = o2y0Var.a();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
