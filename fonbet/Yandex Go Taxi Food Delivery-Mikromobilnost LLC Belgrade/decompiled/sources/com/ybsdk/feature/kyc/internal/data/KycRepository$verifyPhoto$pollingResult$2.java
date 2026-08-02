package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.PhotoVerifyCheckRequest;
import defpackage.j3m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "it", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckResponse;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$verifyPhoto$pollingResult$2", f = "KycRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$verifyPhoto$pollingResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $applicationType;
    final /* synthetic */ j3m $verificationResult;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$verifyPhoto$pollingResult$2(a aVar, String str, String str2, j3m j3mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$applicationId = str;
        this.$applicationType = str2;
        this.$verificationResult = j3mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycRepository$verifyPhoto$pollingResult$2(this.this$0, this.$applicationId, this.$applicationType, this.$verificationResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        return new KycRepository$verifyPhoto$pollingResult$2(this.this$0, this.$applicationId, this.$applicationType, this.$verificationResult, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            PhotoVerifyCheckRequest photoVerifyCheckRequest = new PhotoVerifyCheckRequest(this.$applicationId, this.$applicationType, this.$verificationResult.a);
            this.label = 1;
            h = kycApi.h(photoVerifyCheckRequest, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
