package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.card.api.entities.YbCardPaymentSystemEntity;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015HÆ\u0003J\t\u0010G\u001a\u00020\u001cHÆ\u0003J»\u0001\u0010H\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\u000e\b\u0003\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\b\b\u0003\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardDetailsV2;", "", "id", "", "cardType", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "productType", "Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "nfcInfo", "Lcom/ybsdk/feature/card/internal/network/dto/NfcCarouselCardInfo;", "title", "subtitle", "skin", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "lastPanDigits", "expirationDate", ACSPConstants.STATUS, "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "paymentSystem", "Lcom/ybsdk/feature/card/api/entities/YbCardPaymentSystemEntity;", "tokens", "", "Lcom/ybsdk/feature/card/internal/network/dto/TokenResponse;", "blockReason", "supportUrl", "settings", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "buttons", "Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;Lcom/ybsdk/feature/card/internal/network/dto/NfcCarouselCardInfo;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;Lcom/ybsdk/feature/card/api/entities/YbCardPaymentSystemEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;)V", "getId", "()Ljava/lang/String;", "getCardType", "()Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "getProductType", "()Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "getNfcInfo", "()Lcom/ybsdk/feature/card/internal/network/dto/NfcCarouselCardInfo;", "getTitle", "getSubtitle", "getSkin", "()Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "getLastPanDigits", "getExpirationDate", "getStatus", "()Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "getPaymentSystem", "()Lcom/ybsdk/feature/card/api/entities/YbCardPaymentSystemEntity;", "getTokens", "()Ljava/util/List;", "getBlockReason", "getSupportUrl", "getSettings", "getButtons", "()Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselCardDetailsV2 {
    private final String blockReason;
    private final CardButtonsResponse buttons;
    private final YbCardTypeResponse cardType;
    private final String expirationDate;
    private final String id;
    private final String lastPanDigits;
    private final NfcCarouselCardInfo nfcInfo;
    private final YbCardPaymentSystemEntity paymentSystem;
    private final CardProductType productType;
    private final List<SettingDto> settings;
    private final CardSkinResponse skin;
    private final YbCardStatusEntity status;
    private final String subtitle;
    private final String supportUrl;
    private final String title;
    private final List<TokenResponse> tokens;

    public CarouselCardDetailsV2(@Json(name = "id") String str, @Json(name = "card_type") YbCardTypeResponse ybCardTypeResponse, @Json(name = "product_type") CardProductType cardProductType, @Json(name = "nfc_info") NfcCarouselCardInfo nfcCarouselCardInfo, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "card_skin") CardSkinResponse cardSkinResponse, @Json(name = "last_pan_digits") String str4, @Json(name = "expiration_date") String str5, @Json(name = "status") YbCardStatusEntity ybCardStatusEntity, @Json(name = "payment_system") YbCardPaymentSystemEntity ybCardPaymentSystemEntity, @Json(name = "tokens") List<TokenResponse> list, @Json(name = "block_reason") String str6, @Json(name = "support_url") String str7, @Json(name = "settings") List<SettingDto> list2, @Json(name = "buttons") CardButtonsResponse cardButtonsResponse) {
        this.id = str;
        this.cardType = ybCardTypeResponse;
        this.productType = cardProductType;
        this.nfcInfo = nfcCarouselCardInfo;
        this.title = str2;
        this.subtitle = str3;
        this.skin = cardSkinResponse;
        this.lastPanDigits = str4;
        this.expirationDate = str5;
        this.status = ybCardStatusEntity;
        this.paymentSystem = ybCardPaymentSystemEntity;
        this.tokens = list;
        this.blockReason = str6;
        this.supportUrl = str7;
        this.settings = list2;
        this.buttons = cardButtonsResponse;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final YbCardStatusEntity getStatus() {
        return this.status;
    }

    /* renamed from: component11, reason: from getter */
    public final YbCardPaymentSystemEntity getPaymentSystem() {
        return this.paymentSystem;
    }

    public final List<TokenResponse> component12() {
        return this.tokens;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBlockReason() {
        return this.blockReason;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final List<SettingDto> component15() {
        return this.settings;
    }

    /* renamed from: component16, reason: from getter */
    public final CardButtonsResponse getButtons() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    /* renamed from: component3, reason: from getter */
    public final CardProductType getProductType() {
        return this.productType;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcCarouselCardInfo getNfcInfo() {
        return this.nfcInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final CarouselCardDetailsV2 copy(@Json(name = "id") String id, @Json(name = "card_type") YbCardTypeResponse cardType, @Json(name = "product_type") CardProductType productType, @Json(name = "nfc_info") NfcCarouselCardInfo nfcInfo, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "card_skin") CardSkinResponse skin, @Json(name = "last_pan_digits") String lastPanDigits, @Json(name = "expiration_date") String expirationDate, @Json(name = "status") YbCardStatusEntity status, @Json(name = "payment_system") YbCardPaymentSystemEntity paymentSystem, @Json(name = "tokens") List<TokenResponse> tokens, @Json(name = "block_reason") String blockReason, @Json(name = "support_url") String supportUrl, @Json(name = "settings") List<SettingDto> settings, @Json(name = "buttons") CardButtonsResponse buttons) {
        return new CarouselCardDetailsV2(id, cardType, productType, nfcInfo, title, subtitle, skin, lastPanDigits, expirationDate, status, paymentSystem, tokens, blockReason, supportUrl, settings, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardDetailsV2)) {
            return false;
        }
        CarouselCardDetailsV2 carouselCardDetailsV2 = (CarouselCardDetailsV2) other;
        return jl40.l(this.id, carouselCardDetailsV2.id) && this.cardType == carouselCardDetailsV2.cardType && this.productType == carouselCardDetailsV2.productType && jl40.l(this.nfcInfo, carouselCardDetailsV2.nfcInfo) && jl40.l(this.title, carouselCardDetailsV2.title) && jl40.l(this.subtitle, carouselCardDetailsV2.subtitle) && jl40.l(this.skin, carouselCardDetailsV2.skin) && jl40.l(this.lastPanDigits, carouselCardDetailsV2.lastPanDigits) && jl40.l(this.expirationDate, carouselCardDetailsV2.expirationDate) && this.status == carouselCardDetailsV2.status && this.paymentSystem == carouselCardDetailsV2.paymentSystem && jl40.l(this.tokens, carouselCardDetailsV2.tokens) && jl40.l(this.blockReason, carouselCardDetailsV2.blockReason) && jl40.l(this.supportUrl, carouselCardDetailsV2.supportUrl) && jl40.l(this.settings, carouselCardDetailsV2.settings) && jl40.l(this.buttons, carouselCardDetailsV2.buttons);
    }

    public final String getBlockReason() {
        return this.blockReason;
    }

    public final CardButtonsResponse getButtons() {
        return this.buttons;
    }

    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    public final NfcCarouselCardInfo getNfcInfo() {
        return this.nfcInfo;
    }

    public final YbCardPaymentSystemEntity getPaymentSystem() {
        return this.paymentSystem;
    }

    public final CardProductType getProductType() {
        return this.productType;
    }

    public final List<SettingDto> getSettings() {
        return this.settings;
    }

    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    public final YbCardStatusEntity getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<TokenResponse> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        int b = unr0.b((this.nfcInfo.hashCode() + ((this.productType.hashCode() + ((this.cardType.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.title);
        String str = this.subtitle;
        int c = unr0.c((this.paymentSystem.hashCode() + ((this.status.hashCode() + unr0.b(unr0.b((this.skin.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.lastPanDigits), 31, this.expirationDate)) * 31)) * 31, 31, this.tokens);
        String str2 = this.blockReason;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportUrl;
        return this.buttons.hashCode() + unr0.c((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.settings);
    }

    public String toString() {
        String str = this.id;
        YbCardTypeResponse ybCardTypeResponse = this.cardType;
        CardProductType cardProductType = this.productType;
        NfcCarouselCardInfo nfcCarouselCardInfo = this.nfcInfo;
        String str2 = this.title;
        String str3 = this.subtitle;
        CardSkinResponse cardSkinResponse = this.skin;
        String str4 = this.lastPanDigits;
        String str5 = this.expirationDate;
        YbCardStatusEntity ybCardStatusEntity = this.status;
        YbCardPaymentSystemEntity ybCardPaymentSystemEntity = this.paymentSystem;
        List<TokenResponse> list = this.tokens;
        String str6 = this.blockReason;
        String str7 = this.supportUrl;
        List<SettingDto> list2 = this.settings;
        CardButtonsResponse cardButtonsResponse = this.buttons;
        StringBuilder sb = new StringBuilder("CarouselCardDetailsV2(id=");
        sb.append(str);
        sb.append(", cardType=");
        sb.append(ybCardTypeResponse);
        sb.append(", productType=");
        sb.append(cardProductType);
        sb.append(", nfcInfo=");
        sb.append(nfcCarouselCardInfo);
        sb.append(", title=");
        g8e.D(sb, str2, ", subtitle=", str3, ", skin=");
        sb.append(cardSkinResponse);
        sb.append(", lastPanDigits=");
        sb.append(str4);
        sb.append(", expirationDate=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(ybCardStatusEntity);
        sb.append(", paymentSystem=");
        sb.append(ybCardPaymentSystemEntity);
        sb.append(", tokens=");
        sb.append(list);
        sb.append(", blockReason=");
        g8e.D(sb, str6, ", supportUrl=", str7, ", settings=");
        sb.append(list2);
        sb.append(", buttons=");
        sb.append(cardButtonsResponse);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
