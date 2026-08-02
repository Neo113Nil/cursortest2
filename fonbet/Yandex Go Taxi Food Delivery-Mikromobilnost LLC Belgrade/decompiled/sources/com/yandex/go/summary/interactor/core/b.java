package com.yandex.go.summary.interactor.core;

import defpackage.bcx0;
import defpackage.c5b1;
import defpackage.fnx0;
import defpackage.lb5;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pev0;
import defpackage.wiq0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final wiq0 a;
    public final pev0 b;
    public final lb5 c;

    public b(wiq0 wiq0Var, pev0 pev0Var, lb5 lb5Var) {
        this.a = wiq0Var;
        this.b = pev0Var;
        this.c = lb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1 composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1;
        int i;
        mi31 mi31Var;
        if (continuationImpl instanceof ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1) {
            composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1 = (ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1) continuationImpl;
            int i2 = composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).n();
                if (n != null && (mi31Var = n.a) != null) {
                    ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2 composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2 = new ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2(this, c5b1.d(mi31Var.b()), null);
                    composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.L$0 = null;
                    composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.label = 1;
                    if (kotlinx.coroutines.a.w(5000L, composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2, composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1 = new ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1(this, continuationImpl);
        Object obj2 = composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1 composeSummaryScrollToRequirementInteractor$scrollToRequirement$1;
        int i;
        if (continuationImpl instanceof ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1) {
            composeSummaryScrollToRequirementInteractor$scrollToRequirement$1 = (ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1) continuationImpl;
            int i2 = composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$0 = str;
                    composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$1 = str2;
                    composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str2 = (String) composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$1;
                    str = (String) composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$0;
                    kotlin.b.b(obj);
                }
                bcx0 bcx0Var = new bcx0(str, str2);
                composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$0 = null;
                composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$1 = null;
                composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label = 2;
                Object a = this.b.a(bcx0Var, composeSummaryScrollToRequirementInteractor$scrollToRequirement$1);
                return a != obj2 ? obj2 : a;
            }
        }
        composeSummaryScrollToRequirementInteractor$scrollToRequirement$1 = new ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1(this, continuationImpl);
        Object obj3 = composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label;
        if (i != 0) {
        }
        bcx0 bcx0Var2 = new bcx0(str, str2);
        composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$0 = null;
        composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.L$1 = null;
        composeSummaryScrollToRequirementInteractor$scrollToRequirement$1.label = 2;
        Object a2 = this.b.a(bcx0Var2, composeSummaryScrollToRequirementInteractor$scrollToRequirement$1);
        if (a2 != obj22) {
        }
    }
}
