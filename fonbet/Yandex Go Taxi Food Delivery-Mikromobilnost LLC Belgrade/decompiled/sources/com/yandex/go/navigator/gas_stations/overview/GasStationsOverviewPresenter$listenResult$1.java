package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.go.navigator.gas_stations.repositories.GasStationsSearchResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.avj0;
import defpackage.bms;
import defpackage.dnr;
import defpackage.fvs;
import defpackage.gvs;
import defpackage.hvs;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.mvs;
import defpackage.ny61;
import defpackage.ots;
import defpackage.ovs;
import defpackage.pvs;
import defpackage.rvs;
import defpackage.tus;
import defpackage.w511;
import defpackage.wjm;
import defpackage.zy11;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/models/GasStationSearchType;", "searchType", "Lcom/yandex/go/navigator/gas_stations/repositories/GasStationsSearchResult;", TarifficatorScenarioActivity.RESULT_KEY, "", "isStationSelected", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/navigator/gas_stations/models/GasStationSearchType;Lcom/yandex/go/navigator/gas_stations/repositories/GasStationsSearchResult;Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenResult$1", f = "GasStationsOverviewPresenter.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$listenResult$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsOverviewPresenter$listenResult$1(h hVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        GasStationsOverviewPresenter$listenResult$1 gasStationsOverviewPresenter$listenResult$1 = new GasStationsOverviewPresenter$listenResult$1(this.this$0, (Continuation) obj4);
        gasStationsOverviewPresenter$listenResult$1.L$0 = (GasStationSearchType) obj;
        gasStationsOverviewPresenter$listenResult$1.L$1 = (GasStationsSearchResult) obj2;
        gasStationsOverviewPresenter$listenResult$1.Z$0 = booleanValue;
        return gasStationsOverviewPresenter$listenResult$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object Ng;
        pvs pvsVar;
        int i;
        GasStationSearchType gasStationSearchType = (GasStationSearchType) this.L$0;
        GasStationsSearchResult gasStationsSearchResult = (GasStationsSearchResult) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            if (gasStationSearchType != GasStationSearchType.ON_AREA || !z) {
                int i3 = hvs.a[gasStationsSearchResult.ordinal()];
                if (i3 == 1) {
                    h hVar = this.this$0;
                    ((fvs) hVar.Dg()).render(new rvs(""));
                    if (hVar.z.a() == GasStationSearchType.ON_ROUTE) {
                        ((fvs) hVar.Dg()).render(new ovs(Collections.singletonList(ots.a), 0));
                    }
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        h hVar2 = this.this$0;
                        fvs fvsVar = (fvs) hVar2.Dg();
                        avj0 avj0Var = (avj0) hVar2.y;
                        fvsVar.render(new rvs(avj0Var.h(kyh0.navigator_no_result)));
                        fvs fvsVar2 = (fvs) hVar2.Dg();
                        tus tusVar = hVar2.z;
                        boolean z2 = (((Map) tusVar.g.getValue()).isEmpty() && ((Collection) tusVar.j.getValue()).isEmpty()) ? false : true;
                        GasStationSearchType a = tusVar.a();
                        hVar2.I.j(z2 ? "try_change_filters" : a == GasStationSearchType.ON_ROUTE ? "no_stations_along_the_route" : "try_different_location", hVar2.J.a.getValue());
                        if (z2) {
                            int i4 = gvs.a[a.ordinal()];
                            if (i4 == 1) {
                                i = kyh0.navigator_gas_stations_search_on_route_with_filters_fail_message;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                i = kyh0.navigator_gas_stations_search_on_area_with_filters_fail_message;
                            }
                            pvsVar = new pvs(avj0Var.h(i), new wjm(avj0Var.h(kyh0.navigator_clear_filters), new GasStationsOverviewPresenter$configureFailState$1(0, hVar2.z, tus.class, "clearFilters", "clearFilters()V", 0), avj0Var.h(kyh0.navigator_change_filters), new GasStationsOverviewPresenter$configureFailState$2(0, hVar2.x, mvs.class, "openFilters", "openFilters()V", 0), 11));
                        } else {
                            pvsVar = a == GasStationSearchType.ON_ROUTE ? new pvs(avj0Var.h(kyh0.navigator_gas_stations_search_on_route_fail_message), new wjm(avj0Var.h(kyh0.common_back), new GasStationsOverviewPresenter$configureFailState$3(0, hVar2.x, mvs.class, "back", "back()V", 0), avj0Var.h(kyh0.navigator_show), new dnr(20, hVar2), 11)) : new pvs(avj0Var.h(kyh0.navigator_gas_stations_search_on_area_fail_message), null);
                        }
                        fvsVar2.render(pvsVar);
                        return zy11Var;
                    }
                    h hVar3 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = z;
                    this.label = 1;
                    Ng = h.Ng(hVar3, this);
                    if (Ng == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return zy11Var;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Ng = obj;
        return zy11Var;
    }
}
