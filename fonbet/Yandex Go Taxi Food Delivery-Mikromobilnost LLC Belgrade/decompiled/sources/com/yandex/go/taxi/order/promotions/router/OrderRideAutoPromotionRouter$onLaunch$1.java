package com.yandex.go.taxi.order.promotions.router;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a4y0;
import defpackage.d4y0;
import defpackage.e4y0;
import defpackage.f4y0;
import defpackage.g4y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wc80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.router.OrderRideAutoPromotionRouter$onLaunch$1", f = "OrderRideAutoPromotionRouter.kt", l = {42, 44, 53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderRideAutoPromotionRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ a4y0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRideAutoPromotionRouter$onLaunch$1(c cVar, a4y0 a4y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = a4y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderRideAutoPromotionRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderRideAutoPromotionRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (com.yandex.go.taxi.order.promotions.router.c.Q(r8.this$0, (defpackage.e4y0) r9, r2, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (com.yandex.go.taxi.order.promotions.router.c.P(r8.this$0, (defpackage.d4y0) r9, r2, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (((com.yandex.go.taxi.order.provider.a) r1.J).a().collect(new com.yandex.go.taxi.order.promotions.router.b(r1, (defpackage.f4y0) r9, r3), r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r9 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wc80 wc80Var = this.this$0.I;
            com.yandex.go.taxi.order.promotions.repository.b bVar = new com.yandex.go.taxi.order.promotions.repository.b(wc80Var.b, this.$payload);
            this.label = 1;
            obj = e.A(bVar, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        g4y0 g4y0Var = (g4y0) obj;
        if (g4y0Var instanceof e4y0) {
            a4y0 a4y0Var = this.$payload;
            this.L$0 = null;
            this.label = 2;
        } else {
            if (!(g4y0Var instanceof d4y0)) {
                if (g4y0Var instanceof f4y0) {
                    c cVar = this.this$0;
                    a4y0 a4y0Var2 = this.$payload;
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    if (g4y0Var != null) {
                        w511.b();
                        return null;
                    }
                    this.this$0.R();
                }
                return zy11.a;
            }
            a4y0 a4y0Var3 = this.$payload;
            this.L$0 = null;
            this.label = 3;
        }
    }
}
