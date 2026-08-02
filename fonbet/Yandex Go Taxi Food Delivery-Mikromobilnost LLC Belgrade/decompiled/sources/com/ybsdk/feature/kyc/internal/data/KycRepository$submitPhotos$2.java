package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.LocationDto;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.u6z;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$submitPhotos$2", f = "KycRepository.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$submitPhotos$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ u6z $location;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$submitPhotos$2(a aVar, String str, String str2, u6z u6zVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$applicationId = str2;
        this.$location = u6zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$submitPhotos$2(this.this$0, this.$idempotencyToken, this.$applicationId, this.$location, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$submitPhotos$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String str2 = this.$applicationId;
            u6z u6zVar = this.$location;
            SubmitPhotoRequest submitPhotoRequest = new SubmitPhotoRequest(str2, u6zVar != null ? new LocationDto(u6zVar.b, u6zVar.a) : null);
            this.label = 1;
            c = kycApi.c(str, submitPhotoRequest, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(c);
        return new Result(a == null ? a.b(aVar, (DataWithStatusResponse) c) : new Result.Failure(a));
    }
}
