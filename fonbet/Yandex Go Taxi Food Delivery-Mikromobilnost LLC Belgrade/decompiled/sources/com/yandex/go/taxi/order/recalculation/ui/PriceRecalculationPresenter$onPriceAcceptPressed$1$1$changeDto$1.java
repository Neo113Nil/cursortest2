package com.yandex.go.taxi.order.recalculation.ui;

import com.yandex.go.taxi.order.recalculation.api.PriceRecalculationApi;
import com.yandex.go.taxi.order.recalculation.model.request.ApplyChangeDestinationsParam;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$PendingChangeDto;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$PendingChangeDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1", f = "PriceRecalculationPresenter.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        com.yandex.go.taxi.order.recalculation.domain.a aVar = bVar.B;
        String str = bVar.x.b().a;
        this.label = 1;
        if (evu0.J(aVar.d)) {
            ny61.r("Recalculations id must be not empty for change price");
            return null;
        }
        Object a = ru.yandex.taxi.network.api.a.a(((PriceRecalculationApi) aVar.b.getValue()).b(new ApplyChangeDestinationsParam(aVar.d, str)), null, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
