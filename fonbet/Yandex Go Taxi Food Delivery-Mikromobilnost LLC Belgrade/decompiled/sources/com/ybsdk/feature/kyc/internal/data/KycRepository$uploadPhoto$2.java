package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zw40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$uploadPhoto$2", f = "KycRepository.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$uploadPhoto$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ zw40 $partApplicationId;
    final /* synthetic */ zw40 $partPhoto;
    final /* synthetic */ zw40 $partType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$uploadPhoto$2(a aVar, String str, zw40 zw40Var, zw40 zw40Var2, zw40 zw40Var3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$partType = zw40Var;
        this.$partApplicationId = zw40Var2;
        this.$partPhoto = zw40Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$uploadPhoto$2(this.this$0, this.$idempotencyToken, this.$partType, this.$partApplicationId, this.$partPhoto, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$uploadPhoto$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KycRepository$uploadPhoto$2 kycRepository$uploadPhoto$2;
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            zw40 zw40Var = this.$partType;
            zw40 zw40Var2 = this.$partApplicationId;
            zw40 zw40Var3 = this.$partPhoto;
            this.label = 1;
            kycRepository$uploadPhoto$2 = this;
            d = kycApi.d(str, zw40Var, zw40Var2, zw40Var3, kycRepository$uploadPhoto$2);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
            kycRepository$uploadPhoto$2 = this;
        }
        a aVar = kycRepository$uploadPhoto$2.this$0;
        Throwable a = Result.a(d);
        return new Result(a == null ? a.b(aVar, (DataWithStatusResponse) d) : new Result.Failure(a));
    }
}
