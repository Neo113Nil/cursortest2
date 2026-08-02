package com.yandex.go.scooters.discovery.shortcuts;

import com.yandex.go.address.models.PlainAddress;
import defpackage.eaf0;
import defpackage.ems;
import defpackage.fl3;
import defpackage.gh00;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.xvo0;
import defpackage.zgc0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lhl3;", "authStatus", "Luc4;", "bbox", "Lcom/yandex/go/scooters/api/domain/model/ScootersInsuranceType;", "<unused var>", "Lcom/yandex/go/scooters/mosru/api/domain/model/ScootersMosRuAuthStatus;", "Lbfo0;", "Leaf0;", "<anonymous>", "(Lhl3;Luc4;Lcom/yandex/go/scooters/api/domain/model/ScootersInsuranceType;Lcom/yandex/go/scooters/mosru/api/domain/model/ScootersMosRuAuthStatus;Lbfo0;)Leaf0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.shortcuts.ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1", f = "ScootersShortcutsRequestTriggerRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ xvo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1(xvo0 xvo0Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = xvo0Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1 scootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1 = new ScootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1(this.this$0, (Continuation) obj6);
        scootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1.L$0 = (hl3) obj;
        scootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1.L$1 = (uc4) obj2;
        return scootersShortcutsRequestTriggerRepository$listenGeoPositionChange$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hl3 hl3Var = (hl3) this.L$0;
        uc4 uc4Var = (uc4) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zzs b = ((gh00) this.this$0.a).e.b();
        PlainAddress.Companion.getClass();
        return new eaf0(b, zgc0.a(b), EmptyList.a, true, uc4Var, hl3Var instanceof fl3 ? new Long(((fl3) hl3Var).a) : null, null, null, 192);
    }
}
