package com.ybsdk.screens.registration.data.auth;

import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashout2faApi;", "", "", "idempotencyToken", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse;", "a", "(Ljava/lang/String;Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeRequest;", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeResponse;", "b", "(Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MkkCashout2faApi {
    @s490("/v1/transfers/v2/mkk_cashout/send_code")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 MkkCashoutSendCodeRequest mkkCashoutSendCodeRequest, Continuation<? super Result<MkkCashoutSendCodeResponse>> continuation);

    @s490("/v1/transfers/v2/mkk_cashout/verify_code")
    Object b(@q76 MkkCashoutVerifyCodeRequest mkkCashoutVerifyCodeRequest, Continuation<? super Result<MkkCashoutVerifyCodeResponse>> continuation);
}
