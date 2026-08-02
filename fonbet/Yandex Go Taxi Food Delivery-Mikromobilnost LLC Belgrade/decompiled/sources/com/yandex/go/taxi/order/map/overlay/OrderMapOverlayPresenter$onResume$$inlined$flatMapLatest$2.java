package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.taxi.order.provider.MapObjectsRepository$carIconFlow$$inlined$start$1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2", f = "OrderMapOverlayPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2(c0 c0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2 orderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2 = new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2(this.this$0, (Continuation) obj3);
        orderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        orderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2.L$1 = obj2;
        return orderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((Boolean) obj2).getClass();
            c0 c0Var = this.this$0;
            com.yandex.go.taxi.order.provider.l lVar = c0Var.E;
            o2y0 o2y0Var = c0Var.A;
            lVar.getClass();
            com.yandex.go.taxi.order.provider.i iVar = new com.yandex.go.taxi.order.provider.i(new com.yandex.go.taxi.order.provider.g(com.yandex.go.coroutines.b.d(o2y0Var.a(), new MapObjectsRepository$carIconFlow$$inlined$start$1(o2y0Var.b(), null))), lVar);
            c0 c0Var2 = this.this$0;
            m0 m0Var = new m0(iVar, kotlinx.coroutines.flow.e.t(new v(c0Var2.I.b(c0Var2.A))), new OrderMapOverlayPresenter$onResume$7$2(3, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(m0Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
