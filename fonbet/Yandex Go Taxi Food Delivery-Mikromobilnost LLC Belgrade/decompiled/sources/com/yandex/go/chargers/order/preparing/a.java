package com.yandex.go.chargers.order.preparing;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersCreatingOrderCloseReason;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import defpackage.d18;
import defpackage.em9;
import defpackage.ew9;
import defpackage.f28;
import defpackage.hda;
import defpackage.j1a;
import defpackage.mib1;
import defpackage.nar;
import defpackage.ny61;
import defpackage.qu;
import defpackage.taa;
import defpackage.vpr;
import defpackage.z8y;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ hda a;

    public a(hda hdaVar) {
        this.a = hdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1 chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1;
        int i;
        taa taaVar;
        if (continuation instanceof ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1) {
            chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1 = (ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1) continuation;
            int i2 = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.label;
                hda hdaVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taaVar = (taa) obj;
                    if (!(taaVar instanceof z8y)) {
                        if (taaVar instanceof d18) {
                            hdaVar.x.c(ChargersAnalytics$ChargersCreatingOrderCloseReason.Error, null, null);
                            ((f28) hdaVar.D.b).r(new j1a(((d18) taaVar).b, 3));
                        } else if (taaVar instanceof nar) {
                            hdaVar.x.c(ChargersAnalytics$ChargersCreatingOrderCloseReason.Error, null, null);
                            ((f28) hdaVar.D.b).r(new qu(9));
                        }
                        return zy11.a;
                    }
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.L$0 = null;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.L$1 = null;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.L$2 = taaVar;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.label = 1;
                    if (kotlinx.coroutines.a.i(3000L, chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    taaVar = (taa) chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.L$2;
                    kotlin.b.b(obj2);
                }
                ((com.yandex.go.chargers.orchestrator_user_events.domain.b) hdaVar.B).a(ChargersOrchestratorUserEventType.ORDER_LEASING);
                em9 em9Var = hdaVar.x;
                ChargersAnalytics$ChargersCreatingOrderCloseReason chargersAnalytics$ChargersCreatingOrderCloseReason = ChargersAnalytics$ChargersCreatingOrderCloseReason.OrderCreated;
                z8y z8yVar = (z8y) taaVar;
                z8yVar.getClass();
                em9Var.c(chargersAnalytics$ChargersCreatingOrderCloseReason, mib1.e(ChargersActiveOrderStatus.LEASING), z8yVar.a);
                ((f28) hdaVar.D.b).r(new ew9(22));
                return zy11.a;
            }
        }
        chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1 = new ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1$1$1.label;
        hda hdaVar2 = this.a;
        if (i != 0) {
        }
        ((com.yandex.go.chargers.orchestrator_user_events.domain.b) hdaVar2.B).a(ChargersOrchestratorUserEventType.ORDER_LEASING);
        em9 em9Var2 = hdaVar2.x;
        ChargersAnalytics$ChargersCreatingOrderCloseReason chargersAnalytics$ChargersCreatingOrderCloseReason2 = ChargersAnalytics$ChargersCreatingOrderCloseReason.OrderCreated;
        z8y z8yVar2 = (z8y) taaVar;
        z8yVar2.getClass();
        em9Var2.c(chargersAnalytics$ChargersCreatingOrderCloseReason2, mib1.e(ChargersActiveOrderStatus.LEASING), z8yVar2.a);
        ((f28) hdaVar2.D.b).r(new ew9(22));
        return zy11.a;
    }
}
