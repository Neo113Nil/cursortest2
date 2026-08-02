package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.RetryAutotopupPaymentRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$retryAutotopupPayment$2", f = "AutoTopupSetupRepository.kt", l = {507, 515}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$retryAutotopupPayment$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $failedPaymentId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ boolean $isV2Enabled;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$retryAutotopupPayment$2(boolean z, b bVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.$isV2Enabled = z;
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$agreementId = str2;
        this.$failedPaymentId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$retryAutotopupPayment$2(this.$isV2Enabled, this.this$0, this.$idempotencyToken, this.$agreementId, this.$failedPaymentId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$retryAutotopupPayment$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r6 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isV2Enabled;
            b bVar = this.this$0;
            if (z) {
                AutoTopupApi autoTopupApi = bVar.a;
                String str = this.$idempotencyToken;
                RetryAutotopupPaymentRequest retryAutotopupPaymentRequest = new RetryAutotopupPaymentRequest(this.$agreementId, this.$failedPaymentId);
                this.label = 1;
                e = autoTopupApi.o(str, retryAutotopupPaymentRequest, this);
            } else {
                AutoTopupApi autoTopupApi2 = bVar.a;
                String str2 = this.$idempotencyToken;
                RetryAutotopupPaymentRequest retryAutotopupPaymentRequest2 = new RetryAutotopupPaymentRequest(this.$agreementId, this.$failedPaymentId);
                this.label = 2;
                e = autoTopupApi2.e(str2, retryAutotopupPaymentRequest2, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
