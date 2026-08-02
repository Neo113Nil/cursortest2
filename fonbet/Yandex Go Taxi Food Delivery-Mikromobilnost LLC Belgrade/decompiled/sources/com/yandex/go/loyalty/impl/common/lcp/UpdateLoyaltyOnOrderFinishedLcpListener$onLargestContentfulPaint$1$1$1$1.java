package com.yandex.go.loyalty.impl.common.lcp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.common.lcp.UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1", f = "UpdateLoyaltyOnOrderFinishedLcpListener.kt", l = {33, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $holder;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1(o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.$holder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1 updateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1 = new UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1(this.$holder, continuation);
        updateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1.L$0 = obj;
        return updateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0.emit((com.yandex.go.taxi.order.models.api.TaxiOrder) r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r7 == r1) goto L15;
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
            b.b(obj);
            g a = this.$holder.a();
            UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1$finishedOrder$1 updateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1$finishedOrder$1 = new UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1$finishedOrder$1(2, null);
            this.L$0 = vprVar;
            this.label = 1;
            obj = e.x(a, updateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1$1$1$1$finishedOrder$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
