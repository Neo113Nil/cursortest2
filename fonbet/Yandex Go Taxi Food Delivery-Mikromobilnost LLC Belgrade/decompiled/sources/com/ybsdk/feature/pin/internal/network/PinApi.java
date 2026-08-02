package com.ybsdk.feature.pin.internal.network;

import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenRequest;
import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenResponse;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/pin/internal/network/PinApi;", "", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenRequest;", "request", "", "idempotencyToken", "", "headers", "Lkotlin/Result;", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse;", "a", "(Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PinApi {
    @s490("v1/userinfo/v1/issue_pin_token")
    Object a(@q76 IssuePinTokenRequest issuePinTokenRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<IssuePinTokenResponse>> continuation);
}
