package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchSuggestsPageResponse;", "", "screenItems", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getScreenItems", "()Ljava/util/List;", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersSearchSuggestsPageResponse {
    private final DivDataDto commonDivData;
    private final List<MerchantOffersScreenItemDto> screenItems;

    public MerchantOffersSearchSuggestsPageResponse(@Json(name = "screen_items") List<MerchantOffersScreenItemDto> list, @Json(name = "common_div_data") DivDataDto divDataDto) {
        this.screenItems = list;
        this.commonDivData = divDataDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantOffersSearchSuggestsPageResponse copy$default(MerchantOffersSearchSuggestsPageResponse merchantOffersSearchSuggestsPageResponse, List list, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = merchantOffersSearchSuggestsPageResponse.screenItems;
        }
        if ((i & 2) != 0) {
            divDataDto = merchantOffersSearchSuggestsPageResponse.commonDivData;
        }
        return merchantOffersSearchSuggestsPageResponse.copy(list, divDataDto);
    }

    public final List<MerchantOffersScreenItemDto> component1() {
        return this.screenItems;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final MerchantOffersSearchSuggestsPageResponse copy(@Json(name = "screen_items") List<MerchantOffersScreenItemDto> screenItems, @Json(name = "common_div_data") DivDataDto commonDivData) {
        return new MerchantOffersSearchSuggestsPageResponse(screenItems, commonDivData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersSearchSuggestsPageResponse)) {
            return false;
        }
        MerchantOffersSearchSuggestsPageResponse merchantOffersSearchSuggestsPageResponse = (MerchantOffersSearchSuggestsPageResponse) other;
        return jl40.l(this.screenItems, merchantOffersSearchSuggestsPageResponse.screenItems) && jl40.l(this.commonDivData, merchantOffersSearchSuggestsPageResponse.commonDivData);
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<MerchantOffersScreenItemDto> getScreenItems() {
        return this.screenItems;
    }

    public int hashCode() {
        int hashCode = this.screenItems.hashCode() * 31;
        DivDataDto divDataDto = this.commonDivData;
        return hashCode + (divDataDto == null ? 0 : divDataDto.hashCode());
    }

    public String toString() {
        return "MerchantOffersSearchSuggestsPageResponse(screenItems=" + this.screenItems + ", commonDivData=" + this.commonDivData + Extension.C_BRAKE;
    }
}
