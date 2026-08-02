package com.yandex.go.taxi.order.feed.data;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.koq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u1m;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lloq;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lloq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feed.data.FeedSdkLoadInteractor$documentState$1", f = "FeedSdkLoadInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedSdkLoadInteractor$documentState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedSdkLoadInteractor$documentState$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedSdkLoadInteractor$documentState$1 feedSdkLoadInteractor$documentState$1 = new FeedSdkLoadInteractor$documentState$1(this.this$0, continuation);
        feedSdkLoadInteractor$documentState$1.L$0 = obj;
        return feedSdkLoadInteractor$documentState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedSdkLoadInteractor$documentState$1) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = a.a(aVar, taxiOrder, this);
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
        return new koq((ywl) this.this$0.i.getValue(), (u1m) obj);
    }
}
