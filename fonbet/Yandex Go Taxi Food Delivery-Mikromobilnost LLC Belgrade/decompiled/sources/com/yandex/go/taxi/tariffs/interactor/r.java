package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import defpackage.e1s;
import defpackage.ny61;
import defpackage.qbl0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class r {
    public final e1s a;
    public final uze0 b;
    public final qbl0 c;
    public final tt2 d;

    public r(e1s e1sVar, uze0 uze0Var, qbl0 qbl0Var, tt2 tt2Var) {
        this.a = e1sVar;
        this.b = uze0Var;
        this.c = qbl0Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1 forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1;
        int i;
        if (continuationImpl instanceof ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1) {
            forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1 = (ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1) continuationImpl;
            int i2 = forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                e1s e1sVar = this.a;
                AtomicReference atomicReference = e1sVar.b;
                RouteStatsMode routeStatsMode = RouteStatsMode.FULL;
                while (!atomicReference.compareAndSet(null, routeStatsMode) && atomicReference.get() == null) {
                }
                e1sVar.a.g(zy11Var);
                m0 m0Var = new m0(new o(this.c.a()), new q(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).j.a()), new ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$4(3, null));
                this.d.getClass();
                tpr F = kotlinx.coroutines.flow.e.F(m0Var, uyj.a);
                ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$5 forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$5 = new ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$5(2, null);
                forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.label = 1;
                return kotlinx.coroutines.flow.e.x(F, forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$5, forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1 = new ForceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1(this, continuationImpl);
        Object obj2 = forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceFullModeTariffInteractorImpl$triggerFullModeAndWaitResult$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
