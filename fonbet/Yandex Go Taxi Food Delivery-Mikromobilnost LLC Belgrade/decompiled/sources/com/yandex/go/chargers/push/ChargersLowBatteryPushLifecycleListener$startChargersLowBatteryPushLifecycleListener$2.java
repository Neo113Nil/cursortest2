package com.yandex.go.chargers.push;

import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/yandex/go/chargers/push/data/ChargersLowBatteryPushExperiment;", "Lcom/yandex/go/chargers/data/model/ChargersExperiment;", "", "lowBatteryExp", "chargersExp", "settingsEnabled"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.push.ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2", f = "ChargersLowBatteryPushLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2 chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2 = new ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2(4, (Continuation) obj4);
        chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2.L$0 = (ChargersLowBatteryPushExperiment) obj;
        chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2.L$1 = (ChargersExperiment) obj2;
        chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2.Z$0 = booleanValue;
        return chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment = (ChargersLowBatteryPushExperiment) this.L$0;
        ChargersExperiment chargersExperiment = (ChargersExperiment) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Triple(chargersLowBatteryPushExperiment, chargersExperiment, Boolean.valueOf(z));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
