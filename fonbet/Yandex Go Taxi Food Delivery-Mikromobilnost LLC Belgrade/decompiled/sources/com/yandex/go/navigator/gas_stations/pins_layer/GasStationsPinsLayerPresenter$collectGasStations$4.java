package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.mapkit.search.Session;
import defpackage.bws;
import defpackage.dms;
import defpackage.g050;
import defpackage.gws;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u0001\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "<unused var>", "", "", "", "", "Lbws;", "<anonymous>", "(Lcom/yandex/mapkit/directions/driving/DrivingRoute;Ljava/util/Map;Ljava/util/List;Z)Lbws;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$collectGasStations$4", f = "GasStationsPinsLayerPresenter.kt", l = {343}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$collectGasStations$4 extends SuspendLambda implements dms {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$collectGasStations$4(h hVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj4).booleanValue();
        return new GasStationsPinsLayerPresenter$collectGasStations$4(this.this$0, (Continuation) obj5).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gws gwsVar = this.this$0.y;
            com.yandex.go.navigator.gas_stations.repositories.c cVar = gwsVar.a;
            cVar.g.l(null);
            r0 r0Var = cVar.d;
            r0Var.getClass();
            EmptyList emptyList = EmptyList.a;
            r0Var.m(null, emptyList);
            r0 r0Var2 = cVar.b;
            r0Var2.getClass();
            r0Var2.m(null, emptyList);
            com.yandex.go.navigator.gas_stations.b bVar = gwsVar.b;
            Session session = bVar.r;
            if (session != null) {
                session.cancel();
            }
            bVar.r = null;
            this.this$0.z.a.e();
            h hVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = hVar2.M;
            this.L$0 = aVar;
            this.L$1 = hVar2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            hVar = hVar2;
            g050Var = aVar;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar = (h) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            hVar.N.clear();
            g050Var.d(null);
            return bws.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
