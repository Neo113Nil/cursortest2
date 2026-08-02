package com.yandex.go.walking.navigation.impl.location_mock.settings;

import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSettingsFactory;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.location.SimulationSettings;
import defpackage.a441;
import defpackage.c441;
import defpackage.e441;
import defpackage.el00;
import defpackage.m810;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w341;
import defpackage.w511;
import defpackage.wls;
import defpackage.x341;
import defpackage.y341;
import defpackage.z341;
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
@mvg(c = "com.yandex.go.walking.navigation.impl.location_mock.settings.WalkNavMockSettingsRouter$content$1$1$1", f = "WalkNavMockSettingsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavMockSettingsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ z341 $action;
    final /* synthetic */ w341 $innerNavigator;
    int label;
    final /* synthetic */ x341 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavMockSettingsRouter$content$1$1$1(x341 x341Var, z341 z341Var, w341 w341Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = x341Var;
        this.$action = z341Var;
        this.$innerNavigator = w341Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavMockSettingsRouter$content$1$1$1(this.this$0, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WalkNavMockSettingsRouter$content$1$1$1 walkNavMockSettingsRouter$content$1$1$1 = (WalkNavMockSettingsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        walkNavMockSettingsRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationSimulator locationSimulator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a441 a441Var = this.this$0.F;
        z341 z341Var = this.$action;
        w341 w341Var = this.$innerNavigator;
        c441 c441Var = (c441) a441Var.c;
        if (!(z341Var instanceof y341)) {
            w511.b();
            return null;
        }
        y341 y341Var = (y341) z341Var;
        Double d = y341Var.a;
        if (d != null) {
            double a = m810.a(d.doubleValue() / 3.6d);
            r0 r0Var = c441Var.b.a;
            Double valueOf = Double.valueOf(a);
            r0Var.getClass();
            r0Var.m(null, valueOf);
            com.yandex.go.walking.navigation.impl.location_mock.simulator.a aVar = c441Var.a;
            aVar.d = a;
            LocationSettings fineSettings = !el00.a ? null : LocationSettingsFactory.fineSettings();
            if (fineSettings != null) {
                fineSettings.setSpeed(a);
                SimulationSettings q = k.q(aVar.c, fineSettings);
                if (q != null && (locationSimulator = aVar.b) != null) {
                    locationSimulator.setSettings(Collections.singletonList(q));
                }
            }
        }
        Boolean bool = y341Var.b;
        if (bool != null) {
            r0 r0Var2 = ((e441) a441Var.b).c;
            r0Var2.getClass();
            r0Var2.m(null, bool);
            c441Var.c.c();
            c441Var.a();
        }
        Boolean bool2 = y341Var.c;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                com.yandex.go.walking.navigation.impl.location_mock.simulator.a aVar2 = c441Var.a;
                LocationSimulator locationSimulator2 = aVar2.b;
                if (locationSimulator2 != null) {
                    locationSimulator2.resume();
                    LocationSettings fineSettings2 = !el00.a ? null : LocationSettingsFactory.fineSettings();
                    if (fineSettings2 != null) {
                        fineSettings2.setSpeed(aVar2.d);
                        SimulationSettings q2 = k.q(aVar2.c, fineSettings2);
                        if (q2 != null) {
                            locationSimulator2.setSettings(Collections.singletonList(q2));
                        }
                    }
                }
                r0 r0Var3 = aVar2.e;
                Boolean bool3 = Boolean.TRUE;
                r0Var3.getClass();
                r0Var3.m(null, bool3);
            } else {
                com.yandex.go.walking.navigation.impl.location_mock.simulator.a aVar3 = c441Var.a;
                LocationSimulator locationSimulator3 = aVar3.b;
                if (locationSimulator3 != null) {
                    LocationSettings fineSettings3 = !el00.a ? null : LocationSettingsFactory.fineSettings();
                    if (fineSettings3 != null) {
                        fineSettings3.setSpeed(0.0d);
                        SimulationSettings q3 = k.q(aVar3.c, fineSettings3);
                        if (q3 != null) {
                            locationSimulator3.setSettings(Collections.singletonList(q3));
                            locationSimulator3.suspend();
                        }
                    }
                }
                r0 r0Var4 = aVar3.e;
                Boolean bool4 = Boolean.FALSE;
                r0Var4.getClass();
                r0Var4.m(null, bool4);
            }
        }
        w341Var.a.r(new qu(9));
        return zy11.a;
    }
}
