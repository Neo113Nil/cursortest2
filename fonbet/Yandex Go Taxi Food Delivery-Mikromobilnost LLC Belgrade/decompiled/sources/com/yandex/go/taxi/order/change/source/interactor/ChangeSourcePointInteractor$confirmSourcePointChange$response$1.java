package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.source.data.ApplyChangeSourceParam;
import com.yandex.go.taxi.order.change.source.data.ChangeSourcePointApi;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeSourcePointInteractor$confirmSourcePointChange$response$1", f = "ChangeSourcePointInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeSourcePointInteractor$confirmSourcePointChange$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $orderId;
    final /* synthetic */ SourceChangeReason $reason;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSourcePointInteractor$confirmSourcePointChange$response$1(c cVar, String str, String str2, Address address, SourceChangeReason sourceChangeReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$idempotencyToken = str;
        this.$orderId = str2;
        this.$address = address;
        this.$reason = sourceChangeReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeSourcePointInteractor$confirmSourcePointChange$response$1(this.this$0, this.$idempotencyToken, this.$orderId, this.$address, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeSourcePointInteractor$confirmSourcePointChange$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        cmt<ConfirmChangeResponse> a = ((ChangeSourcePointApi) this.this$0.d.getValue()).a(this.$idempotencyToken, new ApplyChangeSourceParam(this.$orderId, this.$address, this.$reason));
        this.label = 1;
        Object b = ru.yandex.taxi.network.api.a.b(a, null, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
