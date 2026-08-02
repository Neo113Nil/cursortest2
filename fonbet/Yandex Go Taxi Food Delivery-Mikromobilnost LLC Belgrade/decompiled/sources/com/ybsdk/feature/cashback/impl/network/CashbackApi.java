package com.ybsdk.feature.cashback.impl.network;

import com.ybsdk.feature.cashback.impl.dto.requests.MakeCashbackPromoDecisionRequest;
import com.ybsdk.feature.cashback.impl.dto.requests.MakePromoDecisionResponse;
import com.ybsdk.feature.cashback.impl.dto.requests.PromosRequest;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackPromosResponse;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/network/CashbackApi;", "", "Lcom/ybsdk/feature/cashback/impl/dto/requests/PromosRequest;", "body", "Lkotlin/Result;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackPromosResponse;", "b", "(Lcom/ybsdk/feature/cashback/impl/dto/requests/PromosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/cashback/impl/dto/requests/MakeCashbackPromoDecisionRequest;", "", "idempotencyToken", "Lcom/ybsdk/feature/cashback/impl/dto/requests/MakePromoDecisionResponse;", "a", "(Lcom/ybsdk/feature/cashback/impl/dto/requests/MakeCashbackPromoDecisionRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CashbackApi {
    @s490("v1/wallet/v1/make_cashback_promo_decision")
    Object a(@q76 MakeCashbackPromoDecisionRequest makeCashbackPromoDecisionRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<MakePromoDecisionResponse>> continuation);

    @s490("v1/wallet/v1/get_cashback_promos")
    Object b(@q76 PromosRequest promosRequest, Continuation<? super Result<CashbackPromosResponse>> continuation);
}
