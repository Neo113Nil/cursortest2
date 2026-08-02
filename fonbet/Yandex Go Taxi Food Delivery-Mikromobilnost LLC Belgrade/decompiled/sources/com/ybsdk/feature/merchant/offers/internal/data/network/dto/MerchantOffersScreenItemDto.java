package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenItemDto;", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "itemType", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItemType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersScreenItemDto {
    private final DivDataDto divkitData;
    private final String itemType;

    public MerchantOffersScreenItemDto(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "item_type") String str) {
        this.divkitData = divDataDto;
        this.itemType = str;
    }

    public static /* synthetic */ MerchantOffersScreenItemDto copy$default(MerchantOffersScreenItemDto merchantOffersScreenItemDto, DivDataDto divDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = merchantOffersScreenItemDto.divkitData;
        }
        if ((i & 2) != 0) {
            str = merchantOffersScreenItemDto.itemType;
        }
        return merchantOffersScreenItemDto.copy(divDataDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    public final MerchantOffersScreenItemDto copy(@Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "item_type") String itemType) {
        return new MerchantOffersScreenItemDto(divkitData, itemType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersScreenItemDto)) {
            return false;
        }
        MerchantOffersScreenItemDto merchantOffersScreenItemDto = (MerchantOffersScreenItemDto) other;
        return jl40.l(this.divkitData, merchantOffersScreenItemDto.divkitData) && jl40.l(this.itemType, merchantOffersScreenItemDto.itemType);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public int hashCode() {
        return this.itemType.hashCode() + (this.divkitData.hashCode() * 31);
    }

    public String toString() {
        return "MerchantOffersScreenItemDto(divkitData=" + this.divkitData + ", itemType=" + this.itemType + Extension.C_BRAKE;
    }
}
