package com.ybsdk.feature.savings.internal.interactors.v4;

import defpackage.lam0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SavingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1 savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SavingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1) {
            savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1 = (SavingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    q2e0 q2e0Var = s2e0Var instanceof q2e0 ? (q2e0) s2e0Var : null;
                    lam0 lam0Var = q2e0Var != null ? (lam0) q2e0Var.a : null;
                    if (lam0Var != null) {
                        savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(lam0Var, savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1 = new SavingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractorV4$pollDashboard$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
