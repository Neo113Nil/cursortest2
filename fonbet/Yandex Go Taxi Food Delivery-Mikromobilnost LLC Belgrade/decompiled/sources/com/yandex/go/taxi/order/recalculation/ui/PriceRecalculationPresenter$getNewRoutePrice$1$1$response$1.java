package com.yandex.go.taxi.order.recalculation.ui;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.e0f0;
import defpackage.f0f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/recalculation/model/response/NewRoutePrice;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/recalculation/model/response/NewRoutePrice;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1", f = "PriceRecalculationPresenter.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $finalDestination;
    final /* synthetic */ d0l0 $route;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1(b bVar, Address address, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$finalDestination = address;
        this.$route = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1(this.this$0, this.$finalDestination, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        int i2 = e0f0.a[((f0f0) this.this$0.z.b).c.ordinal()];
        if (i2 == 1 || i2 == 2) {
            g = scc.g(kotlin.collections.a.P(this.this$0.y), this.$finalDestination);
        } else if (i2 == 3) {
            g = this.$route.f((Address) kotlin.collections.a.P(this.this$0.y), true).b;
        } else if (i2 == 4) {
            g = Collections.singletonList(this.$finalDestination);
        } else {
            if (i2 != 5) {
                w511.b();
                return null;
            }
            g = this.$route.b;
        }
        b bVar = this.this$0;
        com.yandex.go.taxi.order.recalculation.domain.a aVar = bVar.B;
        String str = bVar.x.b().a;
        List M = kotlin.collections.a.M(g);
        this.L$0 = null;
        this.label = 1;
        Object b = aVar.b(str, M, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
