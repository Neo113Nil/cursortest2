package com.yandex.go.taxi.order.map.curtain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nz70;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "searchState", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Lnz70;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;Lcom/yandex/go/navigation/screen/api/Screen;)Lnz70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.curtain.OrderMapCurtainPresenter$observeMapCurtainShowParams$1", f = "OrderMapCurtainPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapCurtainPresenter$observeMapCurtainShowParams$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderMapCurtainPresenter$observeMapCurtainShowParams$1 orderMapCurtainPresenter$observeMapCurtainShowParams$1 = new OrderMapCurtainPresenter$observeMapCurtainShowParams$1(3, (Continuation) obj3);
        orderMapCurtainPresenter$observeMapCurtainShowParams$1.L$0 = (SearchState) obj;
        orderMapCurtainPresenter$observeMapCurtainShowParams$1.L$1 = (Screen) obj2;
        return orderMapCurtainPresenter$observeMapCurtainShowParams$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchState searchState = (SearchState) this.L$0;
        Screen screen = (Screen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new nz70(searchState, screen);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
