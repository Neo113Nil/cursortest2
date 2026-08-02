package com.ybsdk.feature.qr.payments.internal.screens.list.data;

import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.dto.delete.DeleteSubscriptionRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/delete/DeleteSubscriptionResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.list.data.QrSubscriptionsListRepository$deleteSubscription$2", f = "QrSubscriptionsListRepository.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrSubscriptionsListRepository$deleteSubscription$2 extends SuspendLambda implements tls {
    final /* synthetic */ DeleteSubscriptionRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrSubscriptionsListRepository$deleteSubscription$2(a aVar, DeleteSubscriptionRequest deleteSubscriptionRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = deleteSubscriptionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrSubscriptionsListRepository$deleteSubscription$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrSubscriptionsListRepository$deleteSubscription$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            QrPaymentsApi qrPaymentsApi = this.this$0.a;
            DeleteSubscriptionRequest deleteSubscriptionRequest = this.$request;
            this.label = 1;
            e = qrPaymentsApi.e(deleteSubscriptionRequest, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
