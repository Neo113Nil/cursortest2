package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.axm;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.dqe0;
import defpackage.ibn;
import defpackage.jl40;
import defpackage.klw;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.w3r0;
import defpackage.y1s;
import defpackage.za31;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class l {
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a a;
    public final c4r0 b;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j c;
    public final klw d;
    public final ck31 e;
    public final ibn f;
    public final axm g;
    public final dqe0 h;
    public final y1s i;
    public final w3r0 j;

    public l(com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, c4r0 c4r0Var, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar, klw klwVar, ck31 ck31Var, ibn ibnVar, axm axmVar, dqe0 dqe0Var, y1s y1sVar, w3r0 w3r0Var) {
        this.a = aVar;
        this.b = c4r0Var;
        this.c = jVar;
        this.d = klwVar;
        this.e = ck31Var;
        this.f = ibnVar;
        this.g = axmVar;
        this.h = dqe0Var;
        this.i = y1sVar;
        this.j = w3r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        IntercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1 intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1;
        int i;
        Object obj;
        String str2;
        if (continuationImpl instanceof IntercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1) {
            intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1 = (IntercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1) continuationImpl;
            int i2 = intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.e).j().a.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        List list = ((za31) obj).b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (jl40.l(((mi31) it2.next()).f, str)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    za31 za31Var = (za31) obj;
                    if (za31Var == null || (str2 = za31Var.d) == null) {
                        str2 = "";
                    }
                    intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.L$0 = str;
                    intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.L$1 = null;
                    intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.label = 1;
                    pzt0 e = c4r0.e(this.b, SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD, str, str2, 8);
                    if ((e != null ? e.u0(intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1) : zy11Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.L$0;
                    kotlin.b.b(obj2);
                }
                this.c.g(str);
                return zy11Var;
            }
        }
        intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1 = new IntercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1(this, continuationImpl);
        Object obj22 = intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTaxiTariffChangedInteractor$onUndesirableTariffChange$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.c.g(str);
        return zy11Var2;
    }
}
