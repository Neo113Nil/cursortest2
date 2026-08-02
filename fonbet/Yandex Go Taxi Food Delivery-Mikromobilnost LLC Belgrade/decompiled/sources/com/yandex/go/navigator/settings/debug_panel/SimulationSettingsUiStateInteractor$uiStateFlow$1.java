package com.yandex.go.navigator.settings.debug_panel;

import defpackage.bms;
import defpackage.egs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xk91;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "speedMps", "", "isSimulationEnabled", "isActive", "Legs0;", "<anonymous>", "(DZZ)Legs0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.debug_panel.SimulationSettingsUiStateInteractor$uiStateFlow$1", f = "SimulationSettingsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SimulationSettingsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ double D$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        double doubleValue = ((Number) obj).doubleValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        SimulationSettingsUiStateInteractor$uiStateFlow$1 simulationSettingsUiStateInteractor$uiStateFlow$1 = new SimulationSettingsUiStateInteractor$uiStateFlow$1(4, (Continuation) obj4);
        simulationSettingsUiStateInteractor$uiStateFlow$1.D$0 = doubleValue;
        simulationSettingsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        simulationSettingsUiStateInteractor$uiStateFlow$1.Z$1 = booleanValue2;
        return simulationSettingsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        double d = this.D$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new egs0(xk91.c(d), z, z2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
