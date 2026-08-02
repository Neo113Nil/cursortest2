package com.yandex.go.navigator.settings.debug_panel.domain;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.SimulationSettings;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.el00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.debug_panel.domain.SimulationManager$startSimulation$2", f = "SimulationManager.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SimulationManager$startSimulation$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulationManager$startSimulation$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SimulationManager$startSimulation$2 simulationManager$startSimulation$2 = new SimulationManager$startSimulation$2(this.this$0, continuation);
        simulationManager$startSimulation$2.L$0 = obj;
        return simulationManager$startSimulation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimulationManager$startSimulation$2) create((MapKit) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r10 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        LocationSimulator createLocationSimulator;
        b bVar2;
        LocationSimulator locationSimulator;
        LocationSimulator locationSimulator2;
        b bVar3;
        MapKit mapKit = (MapKit) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!((Boolean) this.this$0.e.getValue()).booleanValue()) {
                return zy11Var;
            }
            el00 el00Var = this.this$0.a;
            this.L$0 = mapKit;
            this.label = 1;
            obj = k.f(el00Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = (b) this.L$6;
                locationSimulator = (LocationSimulator) this.L$4;
                bVar3 = (b) this.L$3;
                locationSimulator2 = (LocationSimulator) this.L$2;
                kotlin.b.b(obj);
                locationSimulator.startSimulation(Collections.singletonList((SimulationSettings) obj));
                bVar3.b();
                bVar = bVar2;
                createLocationSimulator = locationSimulator2;
                bVar.b = createLocationSimulator;
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        LocationSettings locationSettings = (LocationSettings) obj;
        locationSettings.setSpeed(this.this$0.d);
        bVar = this.this$0;
        createLocationSimulator = mapKit.createLocationSimulator();
        b bVar4 = this.this$0;
        createLocationSimulator.subscribeForSimulatorEvents(bVar4.f);
        mapKit.setLocationManager(createLocationSimulator);
        Polyline polyline = bVar4.c;
        if (polyline != null) {
            el00 el00Var2 = bVar4.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = createLocationSimulator;
            this.L$3 = bVar4;
            this.L$4 = createLocationSimulator;
            this.L$5 = null;
            this.L$6 = bVar;
            this.label = 2;
            obj = k.p(el00Var2, polyline, locationSettings, this);
            if (obj != coroutineSingletons) {
                bVar2 = bVar;
                locationSimulator = createLocationSimulator;
                locationSimulator2 = locationSimulator;
                bVar3 = bVar4;
                locationSimulator.startSimulation(Collections.singletonList((SimulationSettings) obj));
                bVar3.b();
                bVar = bVar2;
                createLocationSimulator = locationSimulator2;
            }
            return coroutineSingletons;
        }
        bVar.b = createLocationSimulator;
        return zy11Var;
    }
}
