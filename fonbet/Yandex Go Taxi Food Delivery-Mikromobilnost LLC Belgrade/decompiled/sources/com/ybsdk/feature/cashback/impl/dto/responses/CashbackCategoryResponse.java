package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;", "", "categoryId", "", "title", "subtitle", "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "percent", "selectionType", "Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;)V", "getCategoryId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getPercent", "getSelectionType", "()Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CashbackCategoryResponse {
    private final String categoryId;
    private final String image;
    private final String percent;
    private final CashbackSelectionType selectionType;
    private final String subtitle;
    private final Themes<String> themedImage;
    private final String title;

    public CashbackCategoryResponse(@Json(name = "category_id") String str, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "image") String str4, @Json(name = "themed_image") Themes<String> themes, @Json(name = "percent") String str5, @Json(name = "type") CashbackSelectionType cashbackSelectionType) {
        this.categoryId = str;
        this.title = str2;
        this.subtitle = str3;
        this.image = str4;
        this.themedImage = themes;
        this.percent = str5;
        this.selectionType = cashbackSelectionType;
    }

    public static /* synthetic */ CashbackCategoryResponse copy$default(CashbackCategoryResponse cashbackCategoryResponse, String str, String str2, String str3, String str4, Themes themes, String str5, CashbackSelectionType cashbackSelectionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashbackCategoryResponse.categoryId;
        }
        if ((i & 2) != 0) {
            str2 = cashbackCategoryResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = cashbackCategoryResponse.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = cashbackCategoryResponse.image;
        }
        if ((i & 16) != 0) {
            themes = cashbackCategoryResponse.themedImage;
        }
        if ((i & 32) != 0) {
            str5 = cashbackCategoryResponse.percent;
        }
        if ((i & 64) != 0) {
            cashbackSelectionType = cashbackCategoryResponse.selectionType;
        }
        String str6 = str5;
        CashbackSelectionType cashbackSelectionType2 = cashbackSelectionType;
        Themes themes2 = themes;
        String str7 = str3;
        return cashbackCategoryResponse.copy(str, str2, str7, str4, themes2, str6, cashbackSelectionType2);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component5() {
        return this.themedImage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    /* renamed from: component7, reason: from getter */
    public final CashbackSelectionType getSelectionType() {
        return this.selectionType;
    }

    public final CashbackCategoryResponse copy(@Json(name = "category_id") String categoryId, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "percent") String percent, @Json(name = "type") CashbackSelectionType selectionType) {
        return new CashbackCategoryResponse(categoryId, title, subtitle, image, themedImage, percent, selectionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackCategoryResponse)) {
            return false;
        }
        CashbackCategoryResponse cashbackCategoryResponse = (CashbackCategoryResponse) other;
        return jl40.l(this.categoryId, cashbackCategoryResponse.categoryId) && jl40.l(this.title, cashbackCategoryResponse.title) && jl40.l(this.subtitle, cashbackCategoryResponse.subtitle) && jl40.l(this.image, cashbackCategoryResponse.image) && jl40.l(this.themedImage, cashbackCategoryResponse.themedImage) && jl40.l(this.percent, cashbackCategoryResponse.percent) && this.selectionType == cashbackCategoryResponse.selectionType;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPercent() {
        return this.percent;
    }

    public final CashbackSelectionType getSelectionType() {
        return this.selectionType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.categoryId.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.image);
        Themes<String> themes = this.themedImage;
        return this.selectionType.hashCode() + unr0.b((b + (themes == null ? 0 : themes.hashCode())) * 31, 31, this.percent);
    }

    public String toString() {
        String str = this.categoryId;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.image;
        Themes<String> themes = this.themedImage;
        String str5 = this.percent;
        CashbackSelectionType cashbackSelectionType = this.selectionType;
        StringBuilder v = b64.v("CashbackCategoryResponse(categoryId=", str, ", title=", str2, ", subtitle=");
        g8e.D(v, str3, ", image=", str4, ", themedImage=");
        v.append(themes);
        v.append(", percent=");
        v.append(str5);
        v.append(", selectionType=");
        v.append(cashbackSelectionType);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
