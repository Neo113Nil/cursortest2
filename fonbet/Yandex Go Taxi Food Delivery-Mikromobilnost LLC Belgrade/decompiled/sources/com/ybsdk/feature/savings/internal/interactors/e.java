package com.ybsdk.feature.savings.internal.interactors;

import defpackage.iam0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SavingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1 savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SavingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1) {
            savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1 = (SavingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    q2e0 q2e0Var = s2e0Var instanceof q2e0 ? (q2e0) s2e0Var : null;
                    iam0 iam0Var = q2e0Var != null ? (iam0) q2e0Var.a : null;
                    if (iam0Var != null) {
                        savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(iam0Var, savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1 = new SavingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardInteractor$pollStatus$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
