package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.GeoObject;
import defpackage.bwa1;
import defpackage.lvs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$onGasStationGoViaClick$1", f = "GasStationsOverviewPresenter.kt", l = {349}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewPresenter$onGasStationGoViaClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ GeoObject $gasStation;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsOverviewPresenter$onGasStationGoViaClick$1(GeoObject geoObject, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$gasStation = geoObject;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsOverviewPresenter$onGasStationGoViaClick$1(this.$gasStation, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsOverviewPresenter$onGasStationGoViaClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            String d = bwa1.d(this.$gasStation);
            if (d != null) {
                h hVar = this.this$0;
                GeoObject geoObject = this.$gasStation;
                this.L$0 = d;
                this.label = 1;
                Serializable Kg = h.Kg(hVar, geoObject, this);
                if (Kg == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = d;
                obj = Kg;
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) this.L$0;
        kotlin.b.b(obj);
        Address address = (Address) obj;
        if (address != null) {
            this.this$0.x.a.r(new lvs(str, address, 0));
            return zy11Var;
        }
        return zy11Var;
    }
}
