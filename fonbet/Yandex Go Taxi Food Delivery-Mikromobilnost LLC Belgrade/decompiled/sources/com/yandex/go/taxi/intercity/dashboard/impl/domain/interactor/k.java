package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.bvf0;
import defpackage.glw;
import defpackage.jbh;
import defpackage.jlw;
import defpackage.klw;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.ujw;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class k {
    public final klw a;
    public final f b;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a c;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i d;
    public final qqo e;

    public k(klw klwVar, f fVar, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i iVar, rqo rqoVar) {
        this.a = klwVar;
        this.b = fVar;
        this.c = aVar;
        this.d = iVar;
        this.e = ((jbh) rqoVar).a(SimpleBooleanExperiment.INTERCITY_DASHBOARD_NAVIGATION);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        if (defpackage.jl40.l(r1, r4.a.a().g) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (defpackage.jl40.l(r11, r4.a.a().g) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        IntercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1 intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1;
        int i;
        Object value;
        jlw jlwVar;
        String str;
        r0 r0Var;
        Object value2;
        jlw jlwVar2;
        jlw a;
        if (continuationImpl instanceof IntercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1) {
            intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1 = (IntercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1) continuationImpl;
            int i2 = intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.label;
                klw klwVar = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((Boolean) this.e.b()).booleanValue()) {
                        ujw i3 = this.b.i();
                        if (!((i3 == null || (str = i3.b) == null) ? false : str.equals(this.c.a().h))) {
                            r0 r0Var2 = klwVar.b;
                            do {
                                value = r0Var2.getValue();
                                jlwVar = (jlw) value;
                                jlw a2 = jlwVar instanceof glw ? glw.a((glw) jlwVar, null, null, true, 63) : jlwVar;
                                if (a2 instanceof glw) {
                                    String str2 = ((glw) a2).a;
                                    if (str2 == null) {
                                        str2 = null;
                                    }
                                }
                                jlwVar = a2;
                            } while (!r0Var2.k(value, jlwVar));
                            intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.label = 1;
                            Object n = bvf0.n(new IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2(this, null), intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1);
                            if (n != coroutineSingletons) {
                                n = zy11Var;
                            }
                            if (n == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r0Var = klwVar.b;
                do {
                    value2 = r0Var.getValue();
                    jlwVar2 = (jlw) value2;
                    a = !(jlwVar2 instanceof glw) ? glw.a((glw) jlwVar2, null, null, false, 63) : jlwVar2;
                    if (a instanceof glw) {
                        String str3 = ((glw) a).a;
                        if (str3 == null) {
                            str3 = null;
                        }
                    }
                    jlwVar2 = a;
                } while (!r0Var.k(value2, jlwVar2));
                return zy11Var;
            }
        }
        intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1 = new IntercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1(this, continuationImpl);
        Object obj2 = intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffSyncInteractor$awaitTariffRequirementsMet$1.label;
        klw klwVar2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        r0Var = klwVar2.b;
        do {
            value2 = r0Var.getValue();
            jlwVar2 = (jlw) value2;
            if (!(jlwVar2 instanceof glw)) {
            }
            if (a instanceof glw) {
            }
            jlwVar2 = a;
        } while (!r0Var.k(value2, jlwVar2));
        return zy11Var2;
    }
}
