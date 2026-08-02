package com.yandex.go.taxi.order.change.driver;

import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.driver.ChangeDriverApi;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.driver.ChangeDriverRepository$makeReorderRequest$2", f = "ChangeDriverRepository.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeDriverRepository$makeReorderRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDriverRepository$makeReorderRequest$2(d dVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeDriverRepository$makeReorderRequest$2(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeDriverRepository$makeReorderRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<ConfirmChangeResponse> a = ((ChangeDriverApi) this.this$0.c.getValue()).a(new ChangeDriverApi.ConfirmRequest(this.$order.a));
            this.label = 1;
            obj = a.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return ((fmt) obj).a;
    }
}
