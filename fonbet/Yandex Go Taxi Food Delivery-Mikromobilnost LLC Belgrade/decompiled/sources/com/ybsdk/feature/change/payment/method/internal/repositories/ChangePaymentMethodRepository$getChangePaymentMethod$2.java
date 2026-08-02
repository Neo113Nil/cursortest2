package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import com.ybsdk.feature.change.payment.method.internal.network.dto.ChangePaymentMethodSheetRequest;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lsc9;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$getChangePaymentMethod$2", f = "ChangePaymentMethodRepository.kt", l = {38, 50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$getChangePaymentMethod$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $isFirstLaunch;
    final /* synthetic */ String $newCardTrustId;
    final /* synthetic */ ChangePaymentMethodParameter $parameter;
    final /* synthetic */ String $selectedPaymentMethodId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodRepository$getChangePaymentMethod$2(a aVar, ChangePaymentMethodParameter changePaymentMethodParameter, boolean z, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$parameter = changePaymentMethodParameter;
        this.$isFirstLaunch = z;
        this.$selectedPaymentMethodId = str;
        this.$newCardTrustId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChangePaymentMethodRepository$getChangePaymentMethod$2(this.this$0, this.$parameter, this.$isFirstLaunch, this.$selectedPaymentMethodId, this.$newCardTrustId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ChangePaymentMethodRepository$getChangePaymentMethod$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ChangePaymentMethodsApi changePaymentMethodsApi = this.this$0.a;
            String agreementId = this.$parameter.getAgreementId();
            ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest = new ChangePaymentMethodSheetRequest(this.$parameter.getScenario(), this.$isFirstLaunch, this.$selectedPaymentMethodId, agreementId, this.$newCardTrustId, this.$parameter.getSuccessActions(), this.$parameter.getFailActions(), this.$parameter.getCancelActions());
            this.label = 1;
            c = changePaymentMethodsApi.c(changePaymentMethodSheetRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        Throwable a = Result.a(c);
        if (a == null) {
            ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1 changePaymentMethodRepository$getChangePaymentMethod$2$1$1 = new ChangePaymentMethodRepository$getChangePaymentMethod$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, changePaymentMethodRepository$getChangePaymentMethod$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
