package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'¨\u0006="}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardPromoV2;", "", "id", "", "groupId", "agreementId", "cardType", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "applicationId", "title", "subtitle", "agreement", "skin", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "caption", CRLDistributionPointsExtension.POINTS, "", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointV2Response;", "acquireCardButton", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "claimCardButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;)V", "getId", "()Ljava/lang/String;", "getGroupId", "getAgreementId", "getCardType", "()Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "getApplicationId", "getTitle", "getSubtitle", "getAgreement", "getSkin", "()Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "getCaption", "getPoints", "()Ljava/util/List;", "getAcquireCardButton", "()Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "getClaimCardButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselCardPromoV2 {
    private final YbCardPromoButtonResponse acquireCardButton;
    private final String agreement;
    private final String agreementId;
    private final String applicationId;
    private final String caption;
    private final YbCardTypeResponse cardType;
    private final YbCardPromoButtonResponse claimCardButton;
    private final String groupId;
    private final String id;
    private final List<YbCardPromoPointV2Response> points;
    private final CardSkinResponse skin;
    private final String subtitle;
    private final String title;

    public CarouselCardPromoV2(@Json(name = "id") String str, @Json(name = "group_id") String str2, @Json(name = "agreement_id") String str3, @Json(name = "card_type") YbCardTypeResponse ybCardTypeResponse, @Json(name = "application_id") String str4, @Json(name = "title") String str5, @Json(name = "subtitle") String str6, @Json(name = "agreement") String str7, @Json(name = "card_skin") CardSkinResponse cardSkinResponse, @Json(name = "caption") String str8, @Json(name = "points") List<YbCardPromoPointV2Response> list, @Json(name = "acquire_card_button") YbCardPromoButtonResponse ybCardPromoButtonResponse, @Json(name = "claim_card_button") YbCardPromoButtonResponse ybCardPromoButtonResponse2) {
        this.id = str;
        this.groupId = str2;
        this.agreementId = str3;
        this.cardType = ybCardTypeResponse;
        this.applicationId = str4;
        this.title = str5;
        this.subtitle = str6;
        this.agreement = str7;
        this.skin = cardSkinResponse;
        this.caption = str8;
        this.points = list;
        this.acquireCardButton = ybCardPromoButtonResponse;
        this.claimCardButton = ybCardPromoButtonResponse2;
    }

    public static /* synthetic */ CarouselCardPromoV2 copy$default(CarouselCardPromoV2 carouselCardPromoV2, String str, String str2, String str3, YbCardTypeResponse ybCardTypeResponse, String str4, String str5, String str6, String str7, CardSkinResponse cardSkinResponse, String str8, List list, YbCardPromoButtonResponse ybCardPromoButtonResponse, YbCardPromoButtonResponse ybCardPromoButtonResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carouselCardPromoV2.id;
        }
        return carouselCardPromoV2.copy(str, (i & 2) != 0 ? carouselCardPromoV2.groupId : str2, (i & 4) != 0 ? carouselCardPromoV2.agreementId : str3, (i & 8) != 0 ? carouselCardPromoV2.cardType : ybCardTypeResponse, (i & 16) != 0 ? carouselCardPromoV2.applicationId : str4, (i & 32) != 0 ? carouselCardPromoV2.title : str5, (i & 64) != 0 ? carouselCardPromoV2.subtitle : str6, (i & 128) != 0 ? carouselCardPromoV2.agreement : str7, (i & 256) != 0 ? carouselCardPromoV2.skin : cardSkinResponse, (i & 512) != 0 ? carouselCardPromoV2.caption : str8, (i & 1024) != 0 ? carouselCardPromoV2.points : list, (i & 2048) != 0 ? carouselCardPromoV2.acquireCardButton : ybCardPromoButtonResponse, (i & 4096) != 0 ? carouselCardPromoV2.claimCardButton : ybCardPromoButtonResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    public final List<YbCardPromoPointV2Response> component11() {
        return this.points;
    }

    /* renamed from: component12, reason: from getter */
    public final YbCardPromoButtonResponse getAcquireCardButton() {
        return this.acquireCardButton;
    }

    /* renamed from: component13, reason: from getter */
    public final YbCardPromoButtonResponse getClaimCardButton() {
        return this.claimCardButton;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAgreement() {
        return this.agreement;
    }

    /* renamed from: component9, reason: from getter */
    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    public final CarouselCardPromoV2 copy(@Json(name = "id") String id, @Json(name = "group_id") String groupId, @Json(name = "agreement_id") String agreementId, @Json(name = "card_type") YbCardTypeResponse cardType, @Json(name = "application_id") String applicationId, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "agreement") String agreement, @Json(name = "card_skin") CardSkinResponse skin, @Json(name = "caption") String caption, @Json(name = "points") List<YbCardPromoPointV2Response> points, @Json(name = "acquire_card_button") YbCardPromoButtonResponse acquireCardButton, @Json(name = "claim_card_button") YbCardPromoButtonResponse claimCardButton) {
        return new CarouselCardPromoV2(id, groupId, agreementId, cardType, applicationId, title, subtitle, agreement, skin, caption, points, acquireCardButton, claimCardButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardPromoV2)) {
            return false;
        }
        CarouselCardPromoV2 carouselCardPromoV2 = (CarouselCardPromoV2) other;
        return jl40.l(this.id, carouselCardPromoV2.id) && jl40.l(this.groupId, carouselCardPromoV2.groupId) && jl40.l(this.agreementId, carouselCardPromoV2.agreementId) && this.cardType == carouselCardPromoV2.cardType && jl40.l(this.applicationId, carouselCardPromoV2.applicationId) && jl40.l(this.title, carouselCardPromoV2.title) && jl40.l(this.subtitle, carouselCardPromoV2.subtitle) && jl40.l(this.agreement, carouselCardPromoV2.agreement) && jl40.l(this.skin, carouselCardPromoV2.skin) && jl40.l(this.caption, carouselCardPromoV2.caption) && jl40.l(this.points, carouselCardPromoV2.points) && jl40.l(this.acquireCardButton, carouselCardPromoV2.acquireCardButton) && jl40.l(this.claimCardButton, carouselCardPromoV2.claimCardButton);
    }

    public final YbCardPromoButtonResponse getAcquireCardButton() {
        return this.acquireCardButton;
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final YbCardTypeResponse getCardType() {
        return this.cardType;
    }

    public final YbCardPromoButtonResponse getClaimCardButton() {
        return this.claimCardButton;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.id;
    }

    public final List<YbCardPromoPointV2Response> getPoints() {
        return this.points;
    }

    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.groupId);
        String str = this.agreementId;
        int hashCode = (this.cardType.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.applicationId;
        int b2 = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
        String str3 = this.subtitle;
        int hashCode2 = (b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agreement;
        return this.claimCardButton.hashCode() + ((this.acquireCardButton.hashCode() + unr0.c(unr0.b((this.skin.hashCode() + ((hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31, 31, this.caption), 31, this.points)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.groupId;
        String str3 = this.agreementId;
        YbCardTypeResponse ybCardTypeResponse = this.cardType;
        String str4 = this.applicationId;
        String str5 = this.title;
        String str6 = this.subtitle;
        String str7 = this.agreement;
        CardSkinResponse cardSkinResponse = this.skin;
        String str8 = this.caption;
        List<YbCardPromoPointV2Response> list = this.points;
        YbCardPromoButtonResponse ybCardPromoButtonResponse = this.acquireCardButton;
        YbCardPromoButtonResponse ybCardPromoButtonResponse2 = this.claimCardButton;
        StringBuilder v = b64.v("CarouselCardPromoV2(id=", str, ", groupId=", str2, ", agreementId=");
        v.append(str3);
        v.append(", cardType=");
        v.append(ybCardTypeResponse);
        v.append(", applicationId=");
        g8e.D(v, str4, ", title=", str5, ", subtitle=");
        g8e.D(v, str6, ", agreement=", str7, ", skin=");
        v.append(cardSkinResponse);
        v.append(", caption=");
        v.append(str8);
        v.append(", points=");
        v.append(list);
        v.append(", acquireCardButton=");
        v.append(ybCardPromoButtonResponse);
        v.append(", claimCardButton=");
        v.append(ybCardPromoButtonResponse2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
