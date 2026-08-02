package com.ybsdk.screens.registration.data;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.data.ChangePhoneRepository$requestOtp$2", f = "ChangePhoneRepository.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePhoneRepository$requestOtp$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ ChangePhoneSendCodeRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePhoneRepository$requestOtp$2(a aVar, String str, ChangePhoneSendCodeRequest changePhoneSendCodeRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = changePhoneSendCodeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChangePhoneRepository$requestOtp$2(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ChangePhoneRepository$requestOtp$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object D;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Api api = this.this$0.a;
            String str = this.$idempotencyToken;
            ChangePhoneSendCodeRequest changePhoneSendCodeRequest = this.$request;
            this.label = 1;
            D = api.D(str, changePhoneSendCodeRequest, this);
            if (D == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            D = ((Result) obj).getValue();
        }
        return new Result(D);
    }
}
