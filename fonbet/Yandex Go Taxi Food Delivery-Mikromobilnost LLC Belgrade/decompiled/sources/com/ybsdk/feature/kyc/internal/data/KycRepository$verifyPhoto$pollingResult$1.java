package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.kyc.internal.network.dto.PhotoVerifyCheckResponse;
import com.ybsdk.feature.kyc.internal.network.dto.VerificationStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$verifyPhoto$pollingResult$1", f = "KycRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$verifyPhoto$pollingResult$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KycRepository$verifyPhoto$pollingResult$1 kycRepository$verifyPhoto$pollingResult$1 = new KycRepository$verifyPhoto$pollingResult$1(2, continuation);
        kycRepository$verifyPhoto$pollingResult$1.L$0 = obj;
        return kycRepository$verifyPhoto$pollingResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycRepository$verifyPhoto$pollingResult$1) create((DataWithStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        PhotoVerifyCheckResponse photoVerifyCheckResponse = (PhotoVerifyCheckResponse) ((DataWithStatusResponse) this.L$0).getSuccessData();
        VerificationStatus verificationStatus = photoVerifyCheckResponse != null ? photoVerifyCheckResponse.getVerificationStatus() : null;
        return Boolean.valueOf((verificationStatus == null || verificationStatus == VerificationStatus.PENDING) ? false : true);
    }
}
