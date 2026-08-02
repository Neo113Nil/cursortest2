package com.yandex.go.taxi.summary.routestops;

import com.yandex.go.address.models.Address;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.x81;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "Lpex0;", "selectedTariff", "", "Lcom/yandex/go/address/models/Address;", "destinations", "Lx81;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Lpex0;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.routestops.SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2", f = "SourcePointRouteStopsV2RouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2 sourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2 = new SourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2(this.this$0, (Continuation) obj4);
        sourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2.L$0 = (PriceUpdate$PriceLoadingState) obj;
        sourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2.L$1 = (pex0) obj2;
        sourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2.L$2 = (List) obj3;
        return sourcePointRouteStopsV2RouteInteractor$getDestinationsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$0;
        pex0 pex0Var = (pex0) this.L$1;
        List list = (List) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list2 = list;
        e eVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Address address = (Address) obj2;
            arrayList.add(new x81(address, address.getAddress().f, true, (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADED && i == scc.f(list)) ? eVar.d.b(pex0Var) : null));
            i = i2;
        }
        return arrayList;
    }
}
