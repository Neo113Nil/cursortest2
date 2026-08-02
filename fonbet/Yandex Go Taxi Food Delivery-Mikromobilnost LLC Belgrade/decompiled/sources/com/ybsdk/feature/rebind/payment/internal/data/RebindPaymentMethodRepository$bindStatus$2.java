package com.ybsdk.feature.rebind.payment.internal.data;

import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;
import com.ybsdk.feature.rebind.payment.internal.network.RebindPaymentMethodApi;
import com.ybsdk.feature.rebind.payment.internal.network.dto.StatusBindDto;
import com.ybsdk.feature.rebind.payment.internal.network.dto.StatusBindRequest;
import defpackage.iyd0;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Ln8u0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodRepository$bindStatus$2", f = "RebindPaymentMethodRepository.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RebindPaymentMethodRepository$bindStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $paymentId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RebindPaymentMethodRepository$bindStatus$2(a aVar, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$paymentId = str;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RebindPaymentMethodRepository$bindStatus$2(this.this$0, this.$paymentId, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RebindPaymentMethodRepository$bindStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            RebindPaymentMethodApi rebindPaymentMethodApi = this.this$0.a;
            StatusBindRequest statusBindRequest = new StatusBindRequest(this.$paymentId);
            int i2 = this.$attemptNumber;
            this.label = 1;
            b = rebindPaymentMethodApi.b(statusBindRequest, i2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            iyd0 iyd0Var = (iyd0) b;
            StatusBindDto statusBindDto = (StatusBindDto) iyd0Var.a;
            if (statusBindDto.getStatus() == RebindPaymentMethodStatusDto.FAILED) {
                Throwable th = a.a(aVar, statusBindDto).c;
                if (th == null || (str = th.getMessage()) == null) {
                    str = "Error bind status";
                }
                failure = new Result.Failure(new IllegalStateException(str));
            } else {
                failure = a.a(aVar, statusBindDto);
            }
            if (!(failure instanceof Result.Failure)) {
                failure = new iyd0(iyd0Var.b, failure);
            }
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
