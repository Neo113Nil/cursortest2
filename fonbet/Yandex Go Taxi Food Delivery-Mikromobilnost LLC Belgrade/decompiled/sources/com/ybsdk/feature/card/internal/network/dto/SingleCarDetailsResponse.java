package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;", "", "lastPanDigits", "", "expirationDate", ACSPConstants.STATUS, "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "productType", "Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "cardType", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;)V", "getLastPanDigits", "()Ljava/lang/String;", "getExpirationDate", "getStatus", "()Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "getProductType", "()Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "getCardType", "()Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SingleCarDetailsResponse {
    private final YbCardTypeResponse cardType;
    private final String expirationDate;
    private final String lastPanDigits;
    private final CardProductType productType;
    private final YbCardStatusEntity status;

    public SingleCarDetailsResponse(@Json(name = "last_pan_digits") String str, @Json(name = "expiration_date") String str2, @Json(name = "status") YbCardStatusEntity ybCardStatusEntity, @Json(name = "product_type") CardProductType cardProductType, @Json(name = "card_type") YbCardTypeResponse ybCardTypeResponse) {
        this.lastPanDigits = str;
        this.expirationDate = str2;
        this.status = ybCardStatusEntity;
        this.productType = cardProductType;
        this.cardType = ybCardTypeResponse;
    }

    public static /* synthetic */ SingleCarDetailsResponse copy$default(SingleCarDetailsResponse singleCarDetailsResponse, String str, String str2, YbCardStatusEntity ybCardStatusEntity, CardProductType cardProductType, YbCardTypeResponse ybCardTypeResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleCarDetailsResponse.lastPanDigits;
        }
        if ((i & 2) != 0) {
            str2 = singleCarDetailsResponse.expirationDate;
        }
        if ((i & 4) != 0) {
            ybCardStatusEntity = singleCarDetailsResponse.status;
        }
        if ((i & 8) != 0) {
            cardProductType = singleCarDetailsResponse.productType;
        }
        if ((i & 16) != 0) {
            ybCardTypeResponse = singleCarDetailsResponse.cardType;
        }
        YbCardTypeResponse ybCardTypeResponse2 = ybCardTypeResponse;
        YbCardStatusEntity ybCardStatusEntity2 = ybCardStatusEntity;
        return singleCarDetailsResponse.copy(str, str2, ybCardStatusEntity2, cardProductType, ybCardTypeResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final YbCardStatusEntity getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final CardProductType getProductType() {
        return this.productType;
    }

    /* renamed from: component5, reason: from getter */
    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    public final SingleCarDetailsResponse copy(@Json(name = "last_pan_digits") String lastPanDigits, @Json(name = "expiration_date") String expirationDate, @Json(name = "status") YbCardStatusEntity status, @Json(name = "product_type") CardProductType productType, @Json(name = "card_type") YbCardTypeResponse cardType) {
        return new SingleCarDetailsResponse(lastPanDigits, expirationDate, status, productType, cardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCarDetailsResponse)) {
            return false;
        }
        SingleCarDetailsResponse singleCarDetailsResponse = (SingleCarDetailsResponse) other;
        return jl40.l(this.lastPanDigits, singleCarDetailsResponse.lastPanDigits) && jl40.l(this.expirationDate, singleCarDetailsResponse.expirationDate) && this.status == singleCarDetailsResponse.status && this.productType == singleCarDetailsResponse.productType && this.cardType == singleCarDetailsResponse.cardType;
    }

    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    public final CardProductType getProductType() {
        return this.productType;
    }

    public final YbCardStatusEntity getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.lastPanDigits;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expirationDate;
        return this.cardType.hashCode() + ((this.productType.hashCode() + ((this.status.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.lastPanDigits;
        String str2 = this.expirationDate;
        YbCardStatusEntity ybCardStatusEntity = this.status;
        CardProductType cardProductType = this.productType;
        YbCardTypeResponse ybCardTypeResponse = this.cardType;
        StringBuilder v = b64.v("SingleCarDetailsResponse(lastPanDigits=", str, ", expirationDate=", str2, ", status=");
        v.append(ybCardStatusEntity);
        v.append(", productType=");
        v.append(cardProductType);
        v.append(", cardType=");
        v.append(ybCardTypeResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
