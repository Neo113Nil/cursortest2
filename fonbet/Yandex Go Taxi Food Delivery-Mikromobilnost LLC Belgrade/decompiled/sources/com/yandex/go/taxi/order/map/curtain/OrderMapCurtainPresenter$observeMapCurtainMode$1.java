package com.yandex.go.taxi.order.map.curtain;

import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz70;
import defpackage.qv10;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "searchState", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.curtain.OrderMapCurtainPresenter$observeMapCurtainMode$1", f = "OrderMapCurtainPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapCurtainPresenter$observeMapCurtainMode$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapCurtainPresenter$observeMapCurtainMode$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderMapCurtainPresenter$observeMapCurtainMode$1 orderMapCurtainPresenter$observeMapCurtainMode$1 = new OrderMapCurtainPresenter$observeMapCurtainMode$1(this.this$0, continuation);
        orderMapCurtainPresenter$observeMapCurtainMode$1.L$0 = obj;
        return orderMapCurtainPresenter$observeMapCurtainMode$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderMapCurtainPresenter$observeMapCurtainMode$1 orderMapCurtainPresenter$observeMapCurtainMode$1 = (OrderMapCurtainPresenter$observeMapCurtainMode$1) create((SearchState) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderMapCurtainPresenter$observeMapCurtainMode$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchState searchState = (SearchState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qv10.B(searchState.d == SearchOverlayType.DISPLAY_BANNERS, ((pz70) this.this$0.x).a, null);
        return zy11.a;
    }
}
