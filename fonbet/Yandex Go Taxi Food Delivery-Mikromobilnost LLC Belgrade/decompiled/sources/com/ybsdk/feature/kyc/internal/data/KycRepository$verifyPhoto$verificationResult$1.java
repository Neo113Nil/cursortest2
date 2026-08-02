package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.InitDocumentsUploadingRequest;
import com.ybsdk.feature.kyc.internal.network.dto.KycActionResponse;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lj3m;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$verifyPhoto$verificationResult$1", f = "KycRepository.kt", l = {167, 175}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$verifyPhoto$verificationResult$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $applicationType;
    final /* synthetic */ String $documentId;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$verifyPhoto$verificationResult$1(a aVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$applicationId = str2;
        this.$applicationType = str3;
        this.$documentId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$verifyPhoto$verificationResult$1(this.this$0, this.$idempotencyToken, this.$applicationId, this.$applicationType, this.$documentId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$verifyPhoto$verificationResult$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r9 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            InitDocumentsUploadingRequest initDocumentsUploadingRequest = new InitDocumentsUploadingRequest(this.$applicationId, this.$applicationType, this.$documentId);
            this.label = 1;
            b = kycApi.b(str, initDocumentsUploadingRequest, this);
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
            b = ((Result) obj).getValue();
        }
        String str2 = this.$documentId;
        Throwable a = Result.a(b);
        if (a == null) {
            KycRepository$verifyPhoto$verificationResult$1$1$1 kycRepository$verifyPhoto$verificationResult$1$1$1 = new KycRepository$verifyPhoto$verificationResult$1$1$1(str2, null);
            this.label = 2;
            failure = ((KycActionResponse) b).m441extractEntityResultgIAlus(kycRepository$verifyPhoto$verificationResult$1$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
