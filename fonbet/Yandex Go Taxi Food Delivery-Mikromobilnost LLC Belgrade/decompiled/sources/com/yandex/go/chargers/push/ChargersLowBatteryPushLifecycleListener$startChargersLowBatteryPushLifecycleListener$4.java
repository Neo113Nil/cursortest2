package com.yandex.go.chargers.push;

import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import defpackage.b64;
import defpackage.e3n;
import defpackage.em9;
import defpackage.fz7;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.r8x;
import defpackage.tka1;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Lcom/yandex/go/chargers/push/data/ChargersLowBatteryPushExperiment;", "Lcom/yandex/go/chargers/data/model/ChargersExperiment;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.push.ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4", f = "ChargersLowBatteryPushLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4 chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4 = new ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4(this.this$0, continuation);
        chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4.L$0 = obj;
        return chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4 chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4 = (ChargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4) create((Triple) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersLowBatteryPushLifecycleListener$startChargersLowBatteryPushLifecycleListener$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment = (ChargersLowBatteryPushExperiment) triple.getFirst();
        ChargersExperiment chargersExperiment = (ChargersExperiment) triple.getSecond();
        this.this$0.c.c(new fz7("chargers_low_battery_push"));
        if (this.this$0.f.a(chargersLowBatteryPushExperiment, chargersExperiment)) {
            this.this$0.getClass();
            r8x r8xVar = new r8x();
            String str = chargersLowBatteryPushExperiment.i;
            String str2 = chargersLowBatteryPushExperiment.j;
            r8xVar.f("chargers_low_battery_push_id_key", str);
            r8xVar.f("chargers_low_battery_push_type_key", str2);
            ru.yandex.taxi.jobs.b bVar = this.this$0.c;
            o430 o430Var = e3n.b;
            bVar.e(tka1.e("chargers_low_battery_push", e3n.e(kp50.V(chargersLowBatteryPushExperiment.d, DurationUnit.SECONDS)), r8xVar));
            em9 em9Var = this.this$0.d;
            String str3 = chargersLowBatteryPushExperiment.i;
            HashMap w = b64.w(em9Var);
            if (str3 != null) {
                w.put("push_id", str3);
            }
            if (str2 != null) {
                w.put("push_type", str2);
            }
            em9Var.a.a("Chargers.Push.Scheduled", w, 1, new HashMap());
        }
        return zy11.a;
    }
}
