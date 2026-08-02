package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.qv10;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;", "", "screenItems", "", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "remainingOfferIds", "", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "mlRequestId", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getScreenItems", "()Ljava/util/List;", "getRemainingOfferIds", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getMlRequestId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersPageResponse {
    private final DivDataDto commonDivData;
    private final String mlRequestId;
    private final List<String> remainingOfferIds;
    private final List<MerchantOffersScreenItemDto> screenItems;

    public MerchantOffersPageResponse(@Json(name = "screen_items") List<MerchantOffersScreenItemDto> list, @Json(name = "remaining_offer_ids") List<String> list2, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "ml_request_id") String str) {
        this.screenItems = list;
        this.remainingOfferIds = list2;
        this.commonDivData = divDataDto;
        this.mlRequestId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantOffersPageResponse copy$default(MerchantOffersPageResponse merchantOffersPageResponse, List list, List list2, DivDataDto divDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = merchantOffersPageResponse.screenItems;
        }
        if ((i & 2) != 0) {
            list2 = merchantOffersPageResponse.remainingOfferIds;
        }
        if ((i & 4) != 0) {
            divDataDto = merchantOffersPageResponse.commonDivData;
        }
        if ((i & 8) != 0) {
            str = merchantOffersPageResponse.mlRequestId;
        }
        return merchantOffersPageResponse.copy(list, list2, divDataDto, str);
    }

    public final List<MerchantOffersScreenItemDto> component1() {
        return this.screenItems;
    }

    public final List<String> component2() {
        return this.remainingOfferIds;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final MerchantOffersPageResponse copy(@Json(name = "screen_items") List<MerchantOffersScreenItemDto> screenItems, @Json(name = "remaining_offer_ids") List<String> remainingOfferIds, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "ml_request_id") String mlRequestId) {
        return new MerchantOffersPageResponse(screenItems, remainingOfferIds, commonDivData, mlRequestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersPageResponse)) {
            return false;
        }
        MerchantOffersPageResponse merchantOffersPageResponse = (MerchantOffersPageResponse) other;
        return jl40.l(this.screenItems, merchantOffersPageResponse.screenItems) && jl40.l(this.remainingOfferIds, merchantOffersPageResponse.remainingOfferIds) && jl40.l(this.commonDivData, merchantOffersPageResponse.commonDivData) && jl40.l(this.mlRequestId, merchantOffersPageResponse.mlRequestId);
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
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
        int hashCode = this.screenItems.hashCode() * 31;
        List<String> list = this.remainingOfferIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto = this.commonDivData;
        int hashCode3 = (hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        String str = this.mlRequestId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<MerchantOffersScreenItemDto> list = this.screenItems;
        List<String> list2 = this.remainingOfferIds;
        DivDataDto divDataDto = this.commonDivData;
        String str = this.mlRequestId;
        StringBuilder v = qv10.v("MerchantOffersPageResponse(screenItems=", list, ", remainingOfferIds=", list2, ", commonDivData=");
        v.append(divDataDto);
        v.append(", mlRequestId=");
        v.append(str);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
