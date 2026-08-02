package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCashbackPromoResponse;", "", "promoId", "", "promoType", "title", "subtitle", "selectorCategoriesInfo", "Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponse;)V", "getPromoId", "()Ljava/lang/String;", "getPromoType", "getTitle", "getSubtitle", "getSelectorCategoriesInfo", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestedCashbackPromoResponse {
    private final String promoId;
    private final String promoType;
    private final SuggestedCategoriesResponse selectorCategoriesInfo;
    private final String subtitle;
    private final String title;

    public SuggestedCashbackPromoResponse(@Json(name = "promo_id") String str, @Json(name = "promo_type") String str2, @Json(name = "title") String str3, @Json(name = "subtitle") String str4, @Json(name = "selector_categories_info") SuggestedCategoriesResponse suggestedCategoriesResponse) {
        this.promoId = str;
        this.promoType = str2;
        this.title = str3;
        this.subtitle = str4;
        this.selectorCategoriesInfo = suggestedCategoriesResponse;
    }

    public static /* synthetic */ SuggestedCashbackPromoResponse copy$default(SuggestedCashbackPromoResponse suggestedCashbackPromoResponse, String str, String str2, String str3, String str4, SuggestedCategoriesResponse suggestedCategoriesResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedCashbackPromoResponse.promoId;
        }
        if ((i & 2) != 0) {
            str2 = suggestedCashbackPromoResponse.promoType;
        }
        if ((i & 4) != 0) {
            str3 = suggestedCashbackPromoResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = suggestedCashbackPromoResponse.subtitle;
        }
        if ((i & 16) != 0) {
            suggestedCategoriesResponse = suggestedCashbackPromoResponse.selectorCategoriesInfo;
        }
        SuggestedCategoriesResponse suggestedCategoriesResponse2 = suggestedCategoriesResponse;
        String str5 = str3;
        return suggestedCashbackPromoResponse.copy(str, str2, str5, str4, suggestedCategoriesResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPromoId() {
        return this.promoId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromoType() {
        return this.promoType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final SuggestedCategoriesResponse getSelectorCategoriesInfo() {
        return this.selectorCategoriesInfo;
    }

    public final SuggestedCashbackPromoResponse copy(@Json(name = "promo_id") String promoId, @Json(name = "promo_type") String promoType, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "selector_categories_info") SuggestedCategoriesResponse selectorCategoriesInfo) {
        return new SuggestedCashbackPromoResponse(promoId, promoType, title, subtitle, selectorCategoriesInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedCashbackPromoResponse)) {
            return false;
        }
        SuggestedCashbackPromoResponse suggestedCashbackPromoResponse = (SuggestedCashbackPromoResponse) other;
        return jl40.l(this.promoId, suggestedCashbackPromoResponse.promoId) && jl40.l(this.promoType, suggestedCashbackPromoResponse.promoType) && jl40.l(this.title, suggestedCashbackPromoResponse.title) && jl40.l(this.subtitle, suggestedCashbackPromoResponse.subtitle) && jl40.l(this.selectorCategoriesInfo, suggestedCashbackPromoResponse.selectorCategoriesInfo);
    }

    public final String getPromoId() {
        return this.promoId;
    }

    public final String getPromoType() {
        return this.promoType;
    }

    public final SuggestedCategoriesResponse getSelectorCategoriesInfo() {
        return this.selectorCategoriesInfo;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.promoId.hashCode() * 31, 31, this.promoType), 31, this.title), 31, this.subtitle);
        SuggestedCategoriesResponse suggestedCategoriesResponse = this.selectorCategoriesInfo;
        return b + (suggestedCategoriesResponse == null ? 0 : suggestedCategoriesResponse.hashCode());
    }

    public String toString() {
        String str = this.promoId;
        String str2 = this.promoType;
        String str3 = this.title;
        String str4 = this.subtitle;
        SuggestedCategoriesResponse suggestedCategoriesResponse = this.selectorCategoriesInfo;
        StringBuilder v = b64.v("SuggestedCashbackPromoResponse(promoId=", str, ", promoType=", str2, ", title=");
        g8e.D(v, str3, ", subtitle=", str4, ", selectorCategoriesInfo=");
        v.append(suggestedCategoriesResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
