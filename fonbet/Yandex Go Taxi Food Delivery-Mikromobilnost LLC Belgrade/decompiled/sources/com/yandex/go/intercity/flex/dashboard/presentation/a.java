package com.yandex.go.intercity.flex.dashboard.presentation;

import defpackage.jl40;
import defpackage.lbl0;
import defpackage.ny61;
import defpackage.pew;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (defpackage.jl40.l(r8.e, r9.e) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        IntercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1 intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1;
        int i;
        pew pewVar = pew.a;
        if (continuation instanceof IntercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1) {
            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1 = (IntercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    lbl0 lbl0Var = (lbl0) rsnVar.a;
                    lbl0 lbl0Var2 = (lbl0) rsnVar.b;
                    if (lbl0Var != null && !lbl0Var.equals(lbl0Var2)) {
                        if (!jl40.l(lbl0Var2.m, lbl0Var.m)) {
                            pewVar = pew.b;
                        } else if (jl40.l(lbl0Var2.h, lbl0Var.h)) {
                        }
                        if (pewVar != null) {
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                            intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.label = 1;
                            if (this.a.emit(pewVar, intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    pewVar = null;
                    if (pewVar != null) {
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
        intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1 = new IntercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardFlexSdkInteractorImpl$routeStatsParamsChangesFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
