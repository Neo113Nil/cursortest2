package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$ExpansionState;", "searchType", "Lcom/yandex/go/navigator/gas_stations/models/GasStationSearchType;", "isStationSelected", "", "isSearchFailed", "isInteractionFinished"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$renderModalExpansion$1", f = "GasStationsOverviewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$renderModalExpansion$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        GasStationsOverviewPresenter$renderModalExpansion$1 gasStationsOverviewPresenter$renderModalExpansion$1 = new GasStationsOverviewPresenter$renderModalExpansion$1(5, (Continuation) obj5);
        gasStationsOverviewPresenter$renderModalExpansion$1.L$0 = (GasStationSearchType) obj;
        gasStationsOverviewPresenter$renderModalExpansion$1.Z$0 = booleanValue;
        gasStationsOverviewPresenter$renderModalExpansion$1.Z$1 = booleanValue2;
        gasStationsOverviewPresenter$renderModalExpansion$1.Z$2 = booleanValue3;
        return gasStationsOverviewPresenter$renderModalExpansion$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GasStationSearchType gasStationSearchType = (GasStationSearchType) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return !z3 ? GasStationsOverviewUiState$ExpansionState.COLLAPSED : (gasStationSearchType == GasStationSearchType.ON_ROUTE || z || z2) ? GasStationsOverviewUiState$ExpansionState.EXPANDED : GasStationsOverviewUiState$ExpansionState.COLLAPSED;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
