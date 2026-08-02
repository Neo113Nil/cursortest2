package com.yandex.go.navigator.events;

import com.yandex.mapkit.MapKit;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zdk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.events.RoadEventsLayerHolder$requestCreation$1", f = "RoadEventsLayerHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RoadEventsLayerHolder$requestCreation$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onCreated;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadEventsLayerHolder$requestCreation$1(f fVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$onCreated = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoadEventsLayerHolder$requestCreation$1 roadEventsLayerHolder$requestCreation$1 = new RoadEventsLayerHolder$requestCreation$1(this.this$0, this.$onCreated, continuation);
        roadEventsLayerHolder$requestCreation$1.L$0 = obj;
        return roadEventsLayerHolder$requestCreation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RoadEventsLayerHolder$requestCreation$1 roadEventsLayerHolder$requestCreation$1 = (RoadEventsLayerHolder$requestCreation$1) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        roadEventsLayerHolder$requestCreation$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapKit mapKit = (MapKit) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        fVar.f.b(new zdk0(5, mapKit, fVar, this.$onCreated), true);
        return zy11.a;
    }
}
