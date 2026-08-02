package com.yandex.go.taxi.order.state.search.ui;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.bup0;
import defpackage.dms;
import defpackage.hnz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.scc;
import defpackage.ytp0;
import defpackage.ztp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "searchState", "Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/SearchProgressExperiment;", "experiment", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$SearchEstimates;", "estimates", "Lru/yandex/taxi/object/DriveState;", "driveState", "Laup0;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/SearchProgressExperiment;Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$SearchEstimates;Lru/yandex/taxi/object/DriveState;)Laup0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.search.ui.SearchStateViewPresenter$observeHeaderUiState$3", f = "SearchStateViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchStateViewPresenter$observeHeaderUiState$3 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchStateViewPresenter$observeHeaderUiState$3(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        SearchStateViewPresenter$observeHeaderUiState$3 searchStateViewPresenter$observeHeaderUiState$3 = new SearchStateViewPresenter$observeHeaderUiState$3(this.this$0, (Continuation) obj5);
        searchStateViewPresenter$observeHeaderUiState$3.L$0 = (SearchState) obj;
        searchStateViewPresenter$observeHeaderUiState$3.L$1 = (SearchProgressExperiment) obj2;
        searchStateViewPresenter$observeHeaderUiState$3.L$2 = (OrderStatusInfo.SearchEstimates) obj3;
        searchStateViewPresenter$observeHeaderUiState$3.L$3 = (DriveState) obj4;
        return searchStateViewPresenter$observeHeaderUiState$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        SearchState searchState = (SearchState) this.L$0;
        SearchProgressExperiment searchProgressExperiment = (SearchProgressExperiment) this.L$1;
        OrderStatusInfo.SearchEstimates searchEstimates = (OrderStatusInfo.SearchEstimates) this.L$2;
        DriveState driveState = (DriveState) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        hnz hnzVar = (hnz) eVar.W.get();
        o2y0 o2y0Var = eVar.A;
        String str = o2y0Var.b().a;
        hnzVar.a();
        bup0 bup0Var = eVar.b0;
        boolean z3 = searchProgressExperiment.b;
        TaxiOrder b = o2y0Var.b();
        Long l = b.k;
        long longValue = l != null ? l.longValue() : b.c;
        long j = o2y0Var.b().c;
        bup0Var.getClass();
        if (!z3) {
            return new ztp0();
        }
        boolean contains = scc.g(DriveState.CANCELLED, DriveState.EXPIRED, DriveState.FAILED).contains(driveState);
        if (!contains) {
            SearchState.Companion.getClass();
            if (searchState != SearchState.A && !searchState.m) {
                z = true;
                long a = searchEstimates == null ? searchEstimates.a() : 0L;
                if (contains) {
                    z2 = searchState != null ? searchState.n : true;
                } else {
                    z2 = false;
                }
                return new ytp0(a, j, longValue, z, z2);
            }
        }
        z = false;
        long a2 = searchEstimates == null ? searchEstimates.a() : 0L;
        if (contains) {
        }
        return new ytp0(a2, j, longValue, z, z2);
    }
}
