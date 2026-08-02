package com.ybsdk.feature.kyc.internal.data;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.kyc.internal.network.dto.DocumentsVerifyDto;
import defpackage.j3m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentsVerifyDto;", TarifficatorScenarioActivity.RESULT_KEY, "Lj3m;", "<anonymous>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentsVerifyDto;)Lj3m;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$verifyPhoto$verificationResult$1$1$1", f = "KycRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$verifyPhoto$verificationResult$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $documentId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$verifyPhoto$verificationResult$1$1$1(String str, Continuation continuation) {
        super(2, continuation);
        this.$documentId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KycRepository$verifyPhoto$verificationResult$1$1$1 kycRepository$verifyPhoto$verificationResult$1$1$1 = new KycRepository$verifyPhoto$verificationResult$1$1$1(this.$documentId, continuation);
        kycRepository$verifyPhoto$verificationResult$1$1$1.L$0 = obj;
        return kycRepository$verifyPhoto$verificationResult$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycRepository$verifyPhoto$verificationResult$1$1$1) create((DocumentsVerifyDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new j3m(((DocumentsVerifyDto) this.L$0).getVerificationId(), this.$documentId);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
