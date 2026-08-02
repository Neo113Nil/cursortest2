package com.ybsdk.feature.card.internal.network;

import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.card.internal.network.dto.ClaimCardRequest;
import com.ybsdk.feature.card.internal.network.dto.ClaimCardResponse;
import com.ybsdk.feature.card.internal.network.dto.PrepareSamsungPayDataRequest;
import com.ybsdk.feature.card.internal.network.dto.PrepareSamsungPayDataResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardDetailsRequest;
import com.ybsdk.feature.card.internal.network.dto.YbCardDetailsResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardSetPinRequest;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\fJF\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/PciDssCardApi;", "", "", "idempotencyToken", "", "headers", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardDetailsRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/OldTwoFactorAuthResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardDetailsResponse;", "d", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/card/internal/network/dto/YbCardDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetPinRequest;", "c", "(Ljava/util/Map;Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetPinRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardRequest;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardResponse;", "e", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataRequest;", "Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataResponse;", "a", "(Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PciDssCardApi {
    @s490("v1/card/v1/samsungpay/get_prepared_data")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 PrepareSamsungPayDataRequest prepareSamsungPayDataRequest, Continuation<? super Result<PrepareSamsungPayDataResponse>> continuation);

    @s490("/v2/card/corp-card/details/get")
    Object b(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 YbCardDetailsRequest ybCardDetailsRequest, Continuation<? super Result<OldTwoFactorAuthResponse<YbCardDetailsResponse>>> continuation);

    @s490("v1/card/v2/set_pin")
    Object c(@uau Map<String, String> map, @q76 YbCardSetPinRequest ybCardSetPinRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<OldTwoFactorAuthResponse<Object>>> continuation);

    @s490("v1/card/v2/get_details")
    Object d(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 YbCardDetailsRequest ybCardDetailsRequest, Continuation<? super Result<OldTwoFactorAuthResponse<YbCardDetailsResponse>>> continuation);

    @s490("v1/card/v2/claim_card")
    Object e(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 ClaimCardRequest claimCardRequest, Continuation<? super Result<TwoFactorAuthResponse<ClaimCardResponse>>> continuation);
}
