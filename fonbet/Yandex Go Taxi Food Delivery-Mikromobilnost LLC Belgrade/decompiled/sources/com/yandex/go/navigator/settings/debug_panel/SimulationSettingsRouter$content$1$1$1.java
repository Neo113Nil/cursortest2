package com.yandex.go.navigator.settings.debug_panel;

import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSettingsFactory;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.SimulationSettings;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.bgs0;
import defpackage.cgs0;
import defpackage.dgs0;
import defpackage.el00;
import defpackage.m810;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ukr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yfs0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.debug_panel.SimulationSettingsRouter$content$1$1$1", f = "SimulationSettingsRouter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SimulationSettingsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ cgs0 $action;
    final /* synthetic */ yfs0 $innerNavigator;
    final /* synthetic */ dgs0 $simulationSettingsUiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulationSettingsRouter$content$1$1$1(dgs0 dgs0Var, cgs0 cgs0Var, yfs0 yfs0Var, Continuation continuation) {
        super(2, continuation);
        this.$simulationSettingsUiActionInteractor = dgs0Var;
        this.$action = cgs0Var;
        this.$innerNavigator = yfs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimulationSettingsRouter$content$1$1$1(this.$simulationSettingsUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimulationSettingsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Guidance guidance;
        LocationSimulator locationSimulator;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dgs0 dgs0Var = this.$simulationSettingsUiActionInteractor;
        cgs0 cgs0Var = this.$action;
        yfs0 yfs0Var = this.$innerNavigator;
        this.label = 1;
        com.yandex.go.navigator.settings.debug_panel.domain.a aVar = dgs0Var.b;
        if (!(cgs0Var instanceof bgs0)) {
            w511.b();
            return null;
        }
        bgs0 bgs0Var = (bgs0) cgs0Var;
        Double d = bgs0Var.a;
        if (d != null) {
            double a = m810.a(d.doubleValue() / 3.6d);
            r0 r0Var = aVar.a.a;
            Double valueOf = Double.valueOf(a);
            r0Var.getClass();
            r0Var.m(null, valueOf);
            com.yandex.go.navigator.settings.debug_panel.domain.b bVar = aVar.c;
            bVar.d = a;
            LocationSettings coarseSettings = !el00.a ? null : LocationSettingsFactory.coarseSettings();
            if (coarseSettings != null) {
                coarseSettings.setSpeed(a);
                SimulationSettings q = k.q(bVar.c, coarseSettings);
                if (q != null && (locationSimulator = bVar.b) != null) {
                    locationSimulator.setSettings(Collections.singletonList(q));
                }
            }
        }
        Boolean bool = bgs0Var.b;
        if (bool != null) {
            r0 r0Var2 = dgs0Var.a.c;
            r0Var2.getClass();
            r0Var2.m(null, bool);
            Navigation b = aVar.d.b();
            aVar.a((b == null || (guidance = b.getGuidance()) == null) ? null : guidance.getCurrentRoute());
        }
        Boolean bool2 = bgs0Var.c;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                aVar.c.b();
            } else {
                com.yandex.go.navigator.settings.debug_panel.domain.b bVar2 = aVar.c;
                LocationSimulator locationSimulator2 = bVar2.b;
                if (locationSimulator2 != null) {
                    LocationSettings coarseSettings2 = !el00.a ? null : LocationSettingsFactory.coarseSettings();
                    if (coarseSettings2 != null) {
                        coarseSettings2.setSpeed(0.0d);
                        SimulationSettings q2 = k.q(bVar2.c, coarseSettings2);
                        if (q2 != null) {
                            locationSimulator2.setSettings(Collections.singletonList(q2));
                            locationSimulator2.suspend();
                        }
                    }
                }
                r0 r0Var3 = bVar2.e;
                Boolean bool3 = Boolean.FALSE;
                r0Var3.getClass();
                r0Var3.m(null, bool3);
            }
        }
        yfs0Var.a.r(new ukr0(15));
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
