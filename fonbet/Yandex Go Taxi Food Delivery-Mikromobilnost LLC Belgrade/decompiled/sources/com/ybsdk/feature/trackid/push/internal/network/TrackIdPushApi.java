package com.ybsdk.feature.trackid.push.internal.network;

import com.ybsdk.feature.trackid.push.internal.network.dto.GetCodeRequest;
import com.ybsdk.feature.trackid.push.internal.network.dto.GetCodeResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/trackid/push/internal/network/TrackIdPushApi;", "", "Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeResponse;", "a", "(Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-trackid-push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TrackIdPushApi {
    @s490("v1/push_handle/v1/otp_code")
    Object a(@q76 GetCodeRequest getCodeRequest, Continuation<? super Result<GetCodeResponse>> continuation);
}
