package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003Je\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2;", "", "bannerItems", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOfferBannerItemDto;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "screenItems", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "mlRequestId", "", "remainingOfferIds", "fullScreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getBannerItems", "()Ljava/util/List;", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getScreenItems", "getMlRequestId", "()Ljava/lang/String;", "getRemainingOfferIds", "getFullScreens", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersScreenResponseV2 {
    private final List<MerchantOfferBannerItemDto> bannerItems;
    private final DivDataDto commonDivData;
    private final List<FullScreenDto> fullScreens;
    private final String mlRequestId;
    private final List<String> remainingOfferIds;
    private final List<MerchantOffersScreenItemDto> screenItems;

    public MerchantOffersScreenResponseV2(@Json(name = "stories_banners") List<MerchantOfferBannerItemDto> list, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "screen_items") @SkipFailingElements List<MerchantOffersScreenItemDto> list2, @Json(name = "ml_request_id") String str, @Json(name = "remaining_offer_ids") List<String> list3, @Json(name = "fullscreens") List<FullScreenDto> list4) {
        this.bannerItems = list;
        this.commonDivData = divDataDto;
        this.screenItems = list2;
        this.mlRequestId = str;
        this.remainingOfferIds = list3;
        this.fullScreens = list4;
    }

    public static /* synthetic */ MerchantOffersScreenResponseV2 copy$default(MerchantOffersScreenResponseV2 merchantOffersScreenResponseV2, List list, DivDataDto divDataDto, List list2, String str, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = merchantOffersScreenResponseV2.bannerItems;
        }
        if ((i & 2) != 0) {
            divDataDto = merchantOffersScreenResponseV2.commonDivData;
        }
        if ((i & 4) != 0) {
            list2 = merchantOffersScreenResponseV2.screenItems;
        }
        if ((i & 8) != 0) {
            str = merchantOffersScreenResponseV2.mlRequestId;
        }
        if ((i & 16) != 0) {
            list3 = merchantOffersScreenResponseV2.remainingOfferIds;
        }
        if ((i & 32) != 0) {
            list4 = merchantOffersScreenResponseV2.fullScreens;
        }
        List list5 = list3;
        List list6 = list4;
        return merchantOffersScreenResponseV2.copy(list, divDataDto, list2, str, list5, list6);
    }

    public final List<MerchantOfferBannerItemDto> component1() {
        return this.bannerItems;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<MerchantOffersScreenItemDto> component3() {
        return this.screenItems;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> component5() {
        return this.remainingOfferIds;
    }

    public final List<FullScreenDto> component6() {
        return this.fullScreens;
    }

    public final MerchantOffersScreenResponseV2 copy(@Json(name = "stories_banners") List<MerchantOfferBannerItemDto> bannerItems, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "screen_items") @SkipFailingElements List<MerchantOffersScreenItemDto> screenItems, @Json(name = "ml_request_id") String mlRequestId, @Json(name = "remaining_offer_ids") List<String> remainingOfferIds, @Json(name = "fullscreens") List<FullScreenDto> fullScreens) {
        return new MerchantOffersScreenResponseV2(bannerItems, commonDivData, screenItems, mlRequestId, remainingOfferIds, fullScreens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersScreenResponseV2)) {
            return false;
        }
        MerchantOffersScreenResponseV2 merchantOffersScreenResponseV2 = (MerchantOffersScreenResponseV2) other;
        return jl40.l(this.bannerItems, merchantOffersScreenResponseV2.bannerItems) && jl40.l(this.commonDivData, merchantOffersScreenResponseV2.commonDivData) && jl40.l(this.screenItems, merchantOffersScreenResponseV2.screenItems) && jl40.l(this.mlRequestId, merchantOffersScreenResponseV2.mlRequestId) && jl40.l(this.remainingOfferIds, merchantOffersScreenResponseV2.remainingOfferIds) && jl40.l(this.fullScreens, merchantOffersScreenResponseV2.fullScreens);
    }

    public final List<MerchantOfferBannerItemDto> getBannerItems() {
        return this.bannerItems;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<FullScreenDto> getFullScreens() {
        return this.fullScreens;
    }

    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> getRemainingOfferIds() {
        return this.remainingOfferIds;
    }

    public final List<MerchantOffersScreenItemDto> getScreenItems() {
        return this.screenItems;
    }

    public int hashCode() {
        int hashCode = this.bannerItems.hashCode() * 31;
        DivDataDto divDataDto = this.commonDivData;
        int c = unr0.c((hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31, 31, this.screenItems);
        String str = this.mlRequestId;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.remainingOfferIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<FullScreenDto> list2 = this.fullScreens;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        List<MerchantOfferBannerItemDto> list = this.bannerItems;
        DivDataDto divDataDto = this.commonDivData;
        List<MerchantOffersScreenItemDto> list2 = this.screenItems;
        String str = this.mlRequestId;
        List<String> list3 = this.remainingOfferIds;
        List<FullScreenDto> list4 = this.fullScreens;
        StringBuilder sb = new StringBuilder("MerchantOffersScreenResponseV2(bannerItems=");
        sb.append(list);
        sb.append(", commonDivData=");
        sb.append(divDataDto);
        sb.append(", screenItems=");
        oyr.D(", mlRequestId=", str, ", remainingOfferIds=", sb, list2);
        return vfc.p(sb, list3, ", fullScreens=", list4, Extension.C_BRAKE);
    }
}
