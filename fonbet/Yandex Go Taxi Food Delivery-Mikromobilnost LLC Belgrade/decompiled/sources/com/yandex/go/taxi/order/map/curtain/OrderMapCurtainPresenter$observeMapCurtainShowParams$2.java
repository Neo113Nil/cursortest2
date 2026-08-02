package com.yandex.go.taxi.order.map.curtain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.jmz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nz70;
import defpackage.pz70;
import defpackage.sz70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnz70;", "curtainState", "Lzy11;", "<anonymous>", "(Lnz70;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.curtain.OrderMapCurtainPresenter$observeMapCurtainShowParams$2", f = "OrderMapCurtainPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapCurtainPresenter$observeMapCurtainShowParams$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapCurtainPresenter$observeMapCurtainShowParams$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderMapCurtainPresenter$observeMapCurtainShowParams$2 orderMapCurtainPresenter$observeMapCurtainShowParams$2 = new OrderMapCurtainPresenter$observeMapCurtainShowParams$2(this.this$0, continuation);
        orderMapCurtainPresenter$observeMapCurtainShowParams$2.L$0 = obj;
        return orderMapCurtainPresenter$observeMapCurtainShowParams$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderMapCurtainPresenter$observeMapCurtainShowParams$2 orderMapCurtainPresenter$observeMapCurtainShowParams$2 = (OrderMapCurtainPresenter$observeMapCurtainShowParams$2) create((nz70) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderMapCurtainPresenter$observeMapCurtainShowParams$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nz70 nz70Var = (nz70) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (nz70Var.a.d == SearchOverlayType.DISPLAY_BANNERS && nz70Var.b == Screen.ORDER_DETAILS) {
            r0 r0Var = ((pz70) this.this$0.x).b;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            ((sz70) this.this$0.Dg()).show();
            a aVar = this.this$0;
            SearchState searchState = nz70Var.a;
            aVar.getClass();
            ((sz70) aVar.Dg()).ab(new jmz(searchState.u, searchState.v, searchState.w));
        } else {
            r0 r0Var2 = ((pz70) this.this$0.x).b;
            Boolean bool2 = Boolean.FALSE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
            ((sz70) this.this$0.Dg()).hide();
        }
        return zy11.a;
    }
}
