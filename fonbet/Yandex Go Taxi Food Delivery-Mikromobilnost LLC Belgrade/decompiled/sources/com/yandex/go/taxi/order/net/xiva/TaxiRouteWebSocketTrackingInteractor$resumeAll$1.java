package com.yandex.go.taxi.order.net.xiva;

import defpackage.a3y0;
import defpackage.g050;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.net.xiva.TaxiRouteWebSocketTrackingInteractor$resumeAll$1", f = "TaxiRouteWebSocketTrackingInteractor.kt", l = {144, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRouteWebSocketTrackingInteractor$resumeAll$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRouteWebSocketTrackingInteractor$resumeAll$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiRouteWebSocketTrackingInteractor$resumeAll$1 taxiRouteWebSocketTrackingInteractor$resumeAll$1 = new TaxiRouteWebSocketTrackingInteractor$resumeAll$1(this.this$0, continuation);
        taxiRouteWebSocketTrackingInteractor$resumeAll$1.L$0 = obj;
        return taxiRouteWebSocketTrackingInteractor$resumeAll$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRouteWebSocketTrackingInteractor$resumeAll$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        g050 g050Var;
        d dVar2;
        Iterator it;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a3y0.a(this.this$0.e, new String[]{"resumeAll"}, null, 6);
                dVar = this.this$0;
                kotlinx.coroutines.sync.a aVar = dVar.f;
                this.L$0 = tseVar;
                this.L$1 = aVar;
                this.L$2 = dVar;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    g050Var = aVar;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$4;
                dVar2 = (d) this.L$3;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = dVar2;
                    this.L$4 = it;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 2;
                    if (d.a(dVar2, tseVar, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            dVar = (d) this.L$2;
            g050Var = (g050) this.L$1;
            kotlin.b.b(obj);
            dVar.i = false;
            LinkedHashMap linkedHashMap = dVar.g;
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((l8x) it2.next()).a(null);
            }
            List J0 = kotlin.collections.a.J0(linkedHashMap.keySet());
            g050Var.d(null);
            dVar2 = this.this$0;
            it = J0.iterator();
            while (it.hasNext()) {
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
