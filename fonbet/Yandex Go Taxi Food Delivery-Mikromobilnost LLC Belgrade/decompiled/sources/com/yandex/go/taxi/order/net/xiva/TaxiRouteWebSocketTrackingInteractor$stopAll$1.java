package com.yandex.go.taxi.order.net.xiva;

import defpackage.a3y0;
import defpackage.g050;
import defpackage.hst;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.xiva.TaxiRouteWebSocketTrackingInteractor$stopAll$1", f = "TaxiRouteWebSocketTrackingInteractor.kt", l = {144}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$stopAll$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRouteWebSocketTrackingInteractor$stopAll$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiRouteWebSocketTrackingInteractor$stopAll$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRouteWebSocketTrackingInteractor$stopAll$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            g050Var = dVar2.f;
            this.L$0 = g050Var;
            this.L$1 = dVar2;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            dVar = dVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = (d) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            dVar.i = true;
            LinkedHashSet linkedHashSet = dVar.h;
            dVar.e.getClass();
            a3y0.h(new String[]{"stopAll"});
            hst hstVar = jst.e;
            Iterator it = dVar.g.values().iterator();
            while (it.hasNext()) {
                ((l8x) it.next()).a(null);
            }
            int size = linkedHashSet.size();
            linkedHashSet.clear();
            g050Var.d(null);
            a3y0.a(this.this$0.e, new String[]{oyr.i(size, "stopAll: count=")}, null, 6);
            d dVar3 = this.this$0;
            for (int i2 = 0; i2 < size; i2++) {
                dVar3.b.e();
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
