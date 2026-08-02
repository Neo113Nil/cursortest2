package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoV2Request;
import defpackage.c03;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoV2Response;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$submitPhotosV2$submitResult$1", f = "KycRepository.kt", l = {309}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$submitPhotosV2$submitResult$1 extends SuspendLambda implements tls {
    final /* synthetic */ c03 $applicationInfo;
    final /* synthetic */ List<String> $documentIds;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$submitPhotosV2$submitResult$1(a aVar, String str, c03 c03Var, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$applicationInfo = c03Var;
        this.$documentIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$submitPhotosV2$submitResult$1(this.this$0, this.$idempotencyToken, this.$applicationInfo, this.$documentIds, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$submitPhotosV2$submitResult$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            c03 c03Var = this.$applicationInfo;
            SubmitPhotoV2Request submitPhotoV2Request = new SubmitPhotoV2Request(c03Var.a, c03Var.b, this.$documentIds);
            this.label = 1;
            g = kycApi.g(str, submitPhotoV2Request, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            g = ((Result) obj).getValue();
        }
        return new Result(g);
    }
}
