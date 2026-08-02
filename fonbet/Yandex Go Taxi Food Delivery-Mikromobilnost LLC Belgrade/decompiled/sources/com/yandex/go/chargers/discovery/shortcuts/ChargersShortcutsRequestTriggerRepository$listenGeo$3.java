package com.yandex.go.chargers.discovery.shortcuts;

import com.yandex.mapkit.geometry.Point;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wpa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lcom/yandex/mapkit/geometry/Point;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discovery.shortcuts.ChargersShortcutsRequestTriggerRepository$listenGeo$3", f = "ChargersShortcutsRequestTriggerRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersShortcutsRequestTriggerRepository$listenGeo$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wpa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersShortcutsRequestTriggerRepository$listenGeo$3(wpa wpaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wpaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersShortcutsRequestTriggerRepository$listenGeo$3 chargersShortcutsRequestTriggerRepository$listenGeo$3 = new ChargersShortcutsRequestTriggerRepository$listenGeo$3(this.this$0, continuation);
        chargersShortcutsRequestTriggerRepository$listenGeo$3.L$0 = obj;
        return chargersShortcutsRequestTriggerRepository$listenGeo$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersShortcutsRequestTriggerRepository$listenGeo$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Point target = ((gh00) this.this$0.a).e.c.getTarget();
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(target, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
