package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.axm;
import defpackage.dbl0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qbl0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.y1s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public final class i {
    public final y1s a;
    public final uze0 b;
    public final qbl0 c;
    public final tt2 d;
    public final axm e;
    public final com.yandex.go.route.interactor.b f;
    public final r g;

    public i(y1s y1sVar, uze0 uze0Var, qbl0 qbl0Var, tt2 tt2Var, axm axmVar, com.yandex.go.route.interactor.b bVar, r rVar) {
        this.a = y1sVar;
        this.b = uze0Var;
        this.c = qbl0Var;
        this.d = tt2Var;
        this.e = axmVar;
        this.f = bVar;
        this.g = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1 intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1) {
            intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1 = (IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1) continuationImpl;
            int i2 = intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(new m0(new f(this.c.a()), new h(((k) this.b).j.a()), new IntercityDashboardRouteStatsInteractorImpl$observeRouteStatsCompletion$3(3, null)));
                    this.d.getClass();
                    tpr F = kotlinx.coroutines.flow.e.F(dVar, uyj.a);
                    IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$2 intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$2 = new IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$2(2, null);
                    intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(F, intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$2, intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1) == coroutineSingletons) {
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
        intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1 = new IntercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1(this, continuationImpl);
        Object obj2 = intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardRouteStatsInteractorImpl$awaitRouteStats$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final boolean b() {
        dbl0 b = this.c.b();
        if (b == null) {
            return false;
        }
        List a = this.f.c().a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Address) it.next()).B());
        }
        return ((PriceUpdate$PriceLoadingState) ((k) this.b).j.c.getValue()) == PriceUpdate$PriceLoadingState.LOADED && !b.a.t && jl40.l(b.e, this.e.b()) && b.f == this.a.a() && jl40.l(b.c, arrayList);
    }
}
