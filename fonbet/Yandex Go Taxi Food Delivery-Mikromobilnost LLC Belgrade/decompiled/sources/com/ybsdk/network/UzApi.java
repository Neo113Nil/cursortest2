package com.ybsdk.network;

import com.ybsdk.network.dto.WalletsInfoResponse;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/UzApi;", "", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/WalletsInfoResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UzApi {
    @s490("v1/wallet/v1/get_wallets_info")
    Object a(Continuation<? super Result<WalletsInfoResponse>> continuation);
}
