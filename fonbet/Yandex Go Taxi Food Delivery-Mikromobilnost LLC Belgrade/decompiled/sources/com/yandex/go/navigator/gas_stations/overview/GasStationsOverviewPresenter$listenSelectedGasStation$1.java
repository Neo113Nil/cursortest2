package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.GeoObject;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/mapkit/GeoObject;", "Lcom/yandex/go/navigator/gas_stations/models/GasStationSearchType;", "selectedStation", "searchType"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$1", f = "GasStationsOverviewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$listenSelectedGasStation$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GasStationsOverviewPresenter$listenSelectedGasStation$1 gasStationsOverviewPresenter$listenSelectedGasStation$1 = new GasStationsOverviewPresenter$listenSelectedGasStation$1(3, (Continuation) obj3);
        gasStationsOverviewPresenter$listenSelectedGasStation$1.L$0 = (GeoObject) obj;
        gasStationsOverviewPresenter$listenSelectedGasStation$1.L$1 = (GasStationSearchType) obj2;
        return gasStationsOverviewPresenter$listenSelectedGasStation$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeoObject geoObject = (GeoObject) this.L$0;
        GasStationSearchType gasStationSearchType = (GasStationSearchType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(geoObject, gasStationSearchType);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
