package com.yandex.go.chargers.orchestrator_user_events.domain;

import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import com.yandex.go.chargers.orchestrator_user_events.data.model.OrchestratorUserEventDto;
import defpackage.bg5;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.raa;
import defpackage.w511;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.battery.BatteryStateProvider$PluggedState;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final bg5 a;
    public final po21 b;

    public a(bg5 bg5Var, po21 po21Var) {
        this.a = bg5Var;
        this.b = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersOrchestratorUserEventType chargersOrchestratorUserEventType, ContinuationImpl continuationImpl) {
        ChargersOrchestratorUserEventFactory$create$1 chargersOrchestratorUserEventFactory$create$1;
        int i;
        int i2;
        OrchestratorUserEventDto.EventType eventType;
        if (continuationImpl instanceof ChargersOrchestratorUserEventFactory$create$1) {
            chargersOrchestratorUserEventFactory$create$1 = (ChargersOrchestratorUserEventFactory$create$1) continuationImpl;
            int i3 = chargersOrchestratorUserEventFactory$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersOrchestratorUserEventFactory$create$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersOrchestratorUserEventFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrchestratorUserEventFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersOrchestratorUserEventFactory$create$1.L$0 = chargersOrchestratorUserEventType;
                    chargersOrchestratorUserEventFactory$create$1.label = 1;
                    obj = ((e) this.b).h(chargersOrchestratorUserEventFactory$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chargersOrchestratorUserEventType = (ChargersOrchestratorUserEventType) chargersOrchestratorUserEventFactory$create$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                i2 = raa.a[chargersOrchestratorUserEventType.ordinal()];
                if (i2 != 1) {
                    eventType = OrchestratorUserEventDto.EventType.DISCOVERY;
                } else if (i2 == 2) {
                    eventType = OrchestratorUserEventDto.EventType.STATION;
                } else if (i2 == 3) {
                    eventType = OrchestratorUserEventDto.EventType.OFFER;
                } else if (i2 == 4) {
                    eventType = OrchestratorUserEventDto.EventType.ORDER_LEASING;
                } else {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    eventType = OrchestratorUserEventDto.EventType.ORDER_FINISH;
                }
                bg5 bg5Var = this.a;
                return new OrchestratorUserEventDto(eventType, a, new Integer(bg5Var.b()), Boolean.valueOf(bg5Var.c() == BatteryStateProvider$PluggedState.PLUGGED));
            }
        }
        chargersOrchestratorUserEventFactory$create$1 = new ChargersOrchestratorUserEventFactory$create$1(this, continuationImpl);
        Object obj2 = chargersOrchestratorUserEventFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrchestratorUserEventFactory$create$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        i2 = raa.a[chargersOrchestratorUserEventType.ordinal()];
        if (i2 != 1) {
        }
        bg5 bg5Var2 = this.a;
        return new OrchestratorUserEventDto(eventType, a2, new Integer(bg5Var2.b()), Boolean.valueOf(bg5Var2.c() == BatteryStateProvider$PluggedState.PLUGGED));
    }
}
