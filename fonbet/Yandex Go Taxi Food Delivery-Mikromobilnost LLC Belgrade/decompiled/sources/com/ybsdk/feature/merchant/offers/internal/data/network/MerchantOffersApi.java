package com.ybsdk.feature.merchant.offers.internal.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersPageResponse;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenRequest;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenResponseV2;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchInitRequest;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchNextPageRequest;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchRequest;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchSuggestsPageResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/MerchantOffersApi;", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2;", "c", "(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchRequest;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;", "e", "(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchSuggestsPageResponse;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchInitRequest;", "d", "(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchInitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchNextPageRequest;", "a", "(Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchNextPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MerchantOffersApi {
    @s490("v1/merchant_offers/search/next")
    Object a(@q76 MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest, Continuation<? super Result<DataWithStatusResponse<MerchantOffersPageResponse>>> continuation);

    @s490("v1/merchant_offers/search/suggests")
    Object b(Continuation<? super Result<DataWithStatusResponse<MerchantOffersSearchSuggestsPageResponse>>> continuation);

    @s490("v2/screens/merchant_offers")
    Object c(@q76 MerchantOffersScreenRequest merchantOffersScreenRequest, Continuation<? super Result<DataWithStatusResponse<MerchantOffersScreenResponseV2>>> continuation);

    @s490("v1/merchant_offers/search/init")
    Object d(@q76 MerchantOffersSearchInitRequest merchantOffersSearchInitRequest, Continuation<? super Result<DataWithStatusResponse<MerchantOffersPageResponse>>> continuation);

    @s490("v1/merchant_offers/search")
    Object e(@q76 MerchantOffersSearchRequest merchantOffersSearchRequest, Continuation<? super Result<DataWithStatusResponse<MerchantOffersPageResponse>>> continuation);
}
