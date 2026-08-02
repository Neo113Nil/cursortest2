package com.ybsdk.network;

import com.ybsdk.network.dto.SendAuthorizationCodeRequest;
import com.ybsdk.network.dto.SendAuthorizationCodeResponse;
import com.ybsdk.network.dto.VerifyAuthorizationCodeRequest;
import com.ybsdk.network.dto.VerifyAuthorizationCodeResponse;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/network/PciDssApi;", "", "", "idempotencyToken", "Lcom/ybsdk/network/dto/SendAuthorizationCodeRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/network/dto/SendAuthorizationCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeRequest;", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse;", "a", "(Lcom/ybsdk/network/dto/VerifyAuthorizationCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PciDssApi {
    @s490("v1/authorization/v1/verify_code")
    Object a(@q76 VerifyAuthorizationCodeRequest verifyAuthorizationCodeRequest, Continuation<? super Result<VerifyAuthorizationCodeResponse>> continuation);

    @s490("v1/authorization/v1/send_code")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 SendAuthorizationCodeRequest sendAuthorizationCodeRequest, Continuation<? super Result<SendAuthorizationCodeResponse>> continuation);
}
