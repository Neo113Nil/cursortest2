package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;
import defpackage.dkw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xfw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2", f = "IntercityDashboardTariffSyncInteractor.kt", l = {46, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2 intercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2 = new IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2(this.this$0, continuation);
        intercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2.L$0 = obj;
        return intercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0056, code lost:
    
        if (r13.u0(r12) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
        pkw d;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean b = this.this$0.d.b();
            k kVar = this.this$0;
            qoh h = !b ? tje.h(tseVar, null, null, new IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2$routeStatsJob$1(kVar, null), 3) : tje.h(tseVar, null, null, new IntercityDashboardTariffSyncInteractor$awaitRouteStatsAndUpdateTariff$2$routeStatsJob$2(kVar, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        f fVar = this.this$0.b;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = fVar.a;
        xfw xfwVar = aVar.a().a;
        if (xfwVar != null) {
            IntercityDashboardResponseDto intercityDashboardResponseDto = aVar.a().c;
            String str = intercityDashboardResponseDto != null ? intercityDashboardResponseDto.a : null;
            String str2 = xfwVar.b;
            String str3 = xfwVar.a;
            IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT;
            com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar = fVar.j;
            jVar.getClass();
            int i2 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
            if (i2 == 1) {
                m = jVar.m(str2, str, this);
            } else if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
                m = jVar.j(str2, str, intercityDashboardSelectTariffSource, this);
            } else if (str3 != null && (d = com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j.d(jVar.e(), str3)) != null) {
                String str4 = d.b;
                jVar.k(d, intercityDashboardSelectTariffSource);
                jVar.a.c(d.a, str4);
                if (jVar.h(str4)) {
                    m = jVar.l(str4, str, SelectionOrigin.USER, this);
                }
            }
            return m != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        m = zy11Var;
        if (m != coroutineSingletons) {
        }
    }
}
