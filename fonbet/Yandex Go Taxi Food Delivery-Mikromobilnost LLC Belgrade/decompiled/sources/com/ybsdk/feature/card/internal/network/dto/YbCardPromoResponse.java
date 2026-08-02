package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoResponse;", "", "id", "", "groupId", "title", "imageUrl", "caption", CRLDistributionPointsExtension.POINTS, "", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointResponse;", "acquireCardButton", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "claimCardButton", "applicationId", "agreement", "skin", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;)V", "getId", "()Ljava/lang/String;", "getGroupId", "getTitle", "getImageUrl", "getCaption", "getPoints", "()Ljava/util/List;", "getAcquireCardButton", "()Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "getClaimCardButton", "getApplicationId", "getAgreement", "getSkin", "()Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardPromoResponse {
    private final YbCardPromoButtonResponse acquireCardButton;
    private final String agreement;
    private final String applicationId;
    private final String caption;
    private final YbCardPromoButtonResponse claimCardButton;
    private final String groupId;
    private final String id;
    private final String imageUrl;
    private final List<YbCardPromoPointResponse> points;
    private final CardSkinResponse skin;
    private final String title;

    public YbCardPromoResponse(@Json(name = "id") String str, @Json(name = "promo_id") String str2, @Json(name = "title") String str3, @Json(name = "image_url") String str4, @Json(name = "caption") String str5, @Json(name = "points") List<YbCardPromoPointResponse> list, @Json(name = "acquire_card_button") YbCardPromoButtonResponse ybCardPromoButtonResponse, @Json(name = "claim_card_button") YbCardPromoButtonResponse ybCardPromoButtonResponse2, @Json(name = "application_id") String str6, @Json(name = "agreement") String str7, @Json(name = "card_skin") CardSkinResponse cardSkinResponse) {
        this.id = str;
        this.groupId = str2;
        this.title = str3;
        this.imageUrl = str4;
        this.caption = str5;
        this.points = list;
        this.acquireCardButton = ybCardPromoButtonResponse;
        this.claimCardButton = ybCardPromoButtonResponse2;
        this.applicationId = str6;
        this.agreement = str7;
        this.skin = cardSkinResponse;
    }

    public static /* synthetic */ YbCardPromoResponse copy$default(YbCardPromoResponse ybCardPromoResponse, String str, String str2, String str3, String str4, String str5, List list, YbCardPromoButtonResponse ybCardPromoButtonResponse, YbCardPromoButtonResponse ybCardPromoButtonResponse2, String str6, String str7, CardSkinResponse cardSkinResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardPromoResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = ybCardPromoResponse.groupId;
        }
        if ((i & 4) != 0) {
            str3 = ybCardPromoResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = ybCardPromoResponse.imageUrl;
        }
        if ((i & 16) != 0) {
            str5 = ybCardPromoResponse.caption;
        }
        if ((i & 32) != 0) {
            list = ybCardPromoResponse.points;
        }
        if ((i & 64) != 0) {
            ybCardPromoButtonResponse = ybCardPromoResponse.acquireCardButton;
        }
        if ((i & 128) != 0) {
            ybCardPromoButtonResponse2 = ybCardPromoResponse.claimCardButton;
        }
        if ((i & 256) != 0) {
            str6 = ybCardPromoResponse.applicationId;
        }
        if ((i & 512) != 0) {
            str7 = ybCardPromoResponse.agreement;
        }
        if ((i & 1024) != 0) {
            cardSkinResponse = ybCardPromoResponse.skin;
        }
        String str8 = str7;
        CardSkinResponse cardSkinResponse2 = cardSkinResponse;
        YbCardPromoButtonResponse ybCardPromoButtonResponse3 = ybCardPromoButtonResponse2;
        String str9 = str6;
        List list2 = list;
        YbCardPromoButtonResponse ybCardPromoButtonResponse4 = ybCardPromoButtonResponse;
        String str10 = str5;
        String str11 = str3;
        return ybCardPromoResponse.copy(str, str2, str11, str4, str10, list2, ybCardPromoButtonResponse4, ybCardPromoButtonResponse3, str9, str8, cardSkinResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAgreement() {
        return this.agreement;
    }

    /* renamed from: component11, reason: from getter */
    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    public final List<YbCardPromoPointResponse> component6() {
        return this.points;
    }

    /* renamed from: component7, reason: from getter */
    public final YbCardPromoButtonResponse getAcquireCardButton() {
        return this.acquireCardButton;
    }

    /* renamed from: component8, reason: from getter */
    public final YbCardPromoButtonResponse getClaimCardButton() {
        return this.claimCardButton;
    }

    /* renamed from: component9, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    public final YbCardPromoResponse copy(@Json(name = "id") String id, @Json(name = "promo_id") String groupId, @Json(name = "title") String title, @Json(name = "image_url") String imageUrl, @Json(name = "caption") String caption, @Json(name = "points") List<YbCardPromoPointResponse> points, @Json(name = "acquire_card_button") YbCardPromoButtonResponse acquireCardButton, @Json(name = "claim_card_button") YbCardPromoButtonResponse claimCardButton, @Json(name = "application_id") String applicationId, @Json(name = "agreement") String agreement, @Json(name = "card_skin") CardSkinResponse skin) {
        return new YbCardPromoResponse(id, groupId, title, imageUrl, caption, points, acquireCardButton, claimCardButton, applicationId, agreement, skin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardPromoResponse)) {
            return false;
        }
        YbCardPromoResponse ybCardPromoResponse = (YbCardPromoResponse) other;
        return jl40.l(this.id, ybCardPromoResponse.id) && jl40.l(this.groupId, ybCardPromoResponse.groupId) && jl40.l(this.title, ybCardPromoResponse.title) && jl40.l(this.imageUrl, ybCardPromoResponse.imageUrl) && jl40.l(this.caption, ybCardPromoResponse.caption) && jl40.l(this.points, ybCardPromoResponse.points) && jl40.l(this.acquireCardButton, ybCardPromoResponse.acquireCardButton) && jl40.l(this.claimCardButton, ybCardPromoResponse.claimCardButton) && jl40.l(this.applicationId, ybCardPromoResponse.applicationId) && jl40.l(this.agreement, ybCardPromoResponse.agreement) && jl40.l(this.skin, ybCardPromoResponse.skin);
    }

    public final YbCardPromoButtonResponse getAcquireCardButton() {
        return this.acquireCardButton;
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getCaption() {
        return this.caption;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<YbCardPromoPointResponse> getPoints() {
        return this.points;
    }

    public final CardSkinResponse getSkin() {
        return this.skin;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.claimCardButton.hashCode() + ((this.acquireCardButton.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.groupId), 31, this.title), 31, this.imageUrl), 31, this.caption), 31, this.points)) * 31)) * 31;
        String str = this.applicationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agreement;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardSkinResponse cardSkinResponse = this.skin;
        return hashCode3 + (cardSkinResponse != null ? cardSkinResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.groupId;
        String str3 = this.title;
        String str4 = this.imageUrl;
        String str5 = this.caption;
        List<YbCardPromoPointResponse> list = this.points;
        YbCardPromoButtonResponse ybCardPromoButtonResponse = this.acquireCardButton;
        YbCardPromoButtonResponse ybCardPromoButtonResponse2 = this.claimCardButton;
        String str6 = this.applicationId;
        String str7 = this.agreement;
        CardSkinResponse cardSkinResponse = this.skin;
        StringBuilder v = b64.v("YbCardPromoResponse(id=", str, ", groupId=", str2, ", title=");
        g8e.D(v, str3, ", imageUrl=", str4, ", caption=");
        tse0.x(str5, ", points=", ", acquireCardButton=", v, list);
        v.append(ybCardPromoButtonResponse);
        v.append(", claimCardButton=");
        v.append(ybCardPromoButtonResponse2);
        v.append(", applicationId=");
        g8e.D(v, str6, ", agreement=", str7, ", skin=");
        v.append(cardSkinResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
