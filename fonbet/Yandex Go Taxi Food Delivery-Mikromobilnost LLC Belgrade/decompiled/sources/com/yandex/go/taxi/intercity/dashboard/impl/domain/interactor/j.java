package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.glw;
import defpackage.jlw;
import defpackage.jqr;
import defpackage.klw;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w9u;
import defpackage.xfw;
import defpackage.ynn;
import defpackage.zhw;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class j {
    public final tt2 a;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a b;
    public final klw c;
    public final zhw d;
    public final m e;

    public j(tt2 tt2Var, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, klw klwVar, zhw zhwVar, m mVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = klwVar;
        this.d = zhwVar;
        this.e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, jlw jlwVar, xfw xfwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1 intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1;
        int i;
        klw klwVar = jVar.c;
        if (continuationImpl instanceof IntercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1) {
            intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1 = (IntercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1) continuationImpl;
            int i2 = intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jlwVar instanceof glw) {
                        jlw a = klwVar.a();
                        glw glwVar = a instanceof glw ? (glw) a : null;
                        if (glwVar != null) {
                            m mVar = jVar.e;
                            intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.L$0 = jlwVar;
                            intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.L$1 = null;
                            intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.L$2 = null;
                            intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.label = 1;
                            obj = mVar.d(glwVar, xfwVar, intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1);
                            if (obj == coroutineSingletons) {
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
                jlwVar = (jlw) intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.L$0;
                kotlin.b.b(obj);
                klwVar.b(new ynn(13, jVar, (glw) obj, jlwVar));
                return zy11Var;
            }
        }
        intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1 = new IntercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1(jVar, continuationImpl);
        Object obj2 = intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardSectionShowRuleInteractorImpl$applyTariffChange$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        klwVar.b(new ynn(13, jVar, (glw) obj2, jlwVar));
        return zy11Var2;
    }

    public final Object b(Continuation continuation) {
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.s(this.b.c, new w9u(21)), new IntercityDashboardSectionShowRuleInteractorImpl$handleTariffChangesAndApplySectionShowRules$3(this, null), 3);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, uyj.a), continuation);
    }
}
