package com.yandex.go.taxi.order.net.xiva;

import defpackage.a3y0;
import defpackage.g050;
import defpackage.hst;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.xiva.TaxiRouteWebSocketTrackingInteractor$stopListening$1", f = "TaxiRouteWebSocketTrackingInteractor.kt", l = {144}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$stopListening$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRouteWebSocketTrackingInteractor$stopListening$1(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiRouteWebSocketTrackingInteractor$stopListening$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRouteWebSocketTrackingInteractor$stopListening$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        g050 g050Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            kotlinx.coroutines.sync.a aVar = dVar.f;
            String str2 = this.$orderId;
            this.L$0 = aVar;
            this.L$1 = dVar;
            this.L$2 = str2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            str = str2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            dVar = (d) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            l8x l8xVar = (l8x) dVar.g.remove(str);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            boolean remove = dVar.h.remove(str);
            g050Var.d(null);
            if (remove) {
                this.this$0.e.getClass();
                a3y0.h(new String[]{"stopListening"});
                hst hstVar = jst.e;
                this.this$0.b.e();
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
