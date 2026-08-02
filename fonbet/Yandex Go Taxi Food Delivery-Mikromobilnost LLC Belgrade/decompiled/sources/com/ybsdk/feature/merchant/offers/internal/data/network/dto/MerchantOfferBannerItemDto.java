package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J}\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000fHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOfferBannerItemDto;", "", "notifyButton", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "bannerId", "", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "bannerImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "logo", "title", "subtitle", "duration", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;I)V", "getNotifyButton", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getBannerId", "()Ljava/lang/String;", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getBannerImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "getLogo", "getTitle", "getSubtitle", "getDuration", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOfferBannerItemDto {
    private final String action;
    private final ThemedParameter<String> background;
    private final String bannerId;
    private final Themes<String> bannerImage;
    private final int duration;
    private final Themes<String> logo;
    private final DivDataDto notifyButton;
    private final String subtitle;
    private final String title;

    public MerchantOfferBannerItemDto(@Json(name = "notify_button") DivDataDto divDataDto, @Json(name = "banner_id") String str, @Json(name = "background") ThemedParameter<String> themedParameter, @Json(name = "banner_image") Themes<String> themes, @Json(name = "action") String str2, @Json(name = "logo") Themes<String> themes2, @Json(name = "title") String str3, @Json(name = "subtitle") String str4, @Json(name = "duration") int i) {
        this.notifyButton = divDataDto;
        this.bannerId = str;
        this.background = themedParameter;
        this.bannerImage = themes;
        this.action = str2;
        this.logo = themes2;
        this.title = str3;
        this.subtitle = str4;
        this.duration = i;
    }

    public static /* synthetic */ MerchantOfferBannerItemDto copy$default(MerchantOfferBannerItemDto merchantOfferBannerItemDto, DivDataDto divDataDto, String str, ThemedParameter themedParameter, Themes themes, String str2, Themes themes2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            divDataDto = merchantOfferBannerItemDto.notifyButton;
        }
        if ((i2 & 2) != 0) {
            str = merchantOfferBannerItemDto.bannerId;
        }
        if ((i2 & 4) != 0) {
            themedParameter = merchantOfferBannerItemDto.background;
        }
        if ((i2 & 8) != 0) {
            themes = merchantOfferBannerItemDto.bannerImage;
        }
        if ((i2 & 16) != 0) {
            str2 = merchantOfferBannerItemDto.action;
        }
        if ((i2 & 32) != 0) {
            themes2 = merchantOfferBannerItemDto.logo;
        }
        if ((i2 & 64) != 0) {
            str3 = merchantOfferBannerItemDto.title;
        }
        if ((i2 & 128) != 0) {
            str4 = merchantOfferBannerItemDto.subtitle;
        }
        if ((i2 & 256) != 0) {
            i = merchantOfferBannerItemDto.duration;
        }
        String str5 = str4;
        int i3 = i;
        Themes themes3 = themes2;
        String str6 = str3;
        String str7 = str2;
        ThemedParameter themedParameter2 = themedParameter;
        return merchantOfferBannerItemDto.copy(divDataDto, str, themedParameter2, themes, str7, themes3, str6, str5, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getNotifyButton() {
        return this.notifyButton;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    public final ThemedParameter<String> component3() {
        return this.background;
    }

    public final Themes<String> component4() {
        return this.bannerImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component6() {
        return this.logo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public final MerchantOfferBannerItemDto copy(@Json(name = "notify_button") DivDataDto notifyButton, @Json(name = "banner_id") String bannerId, @Json(name = "background") ThemedParameter<String> background, @Json(name = "banner_image") Themes<String> bannerImage, @Json(name = "action") String action, @Json(name = "logo") Themes<String> logo, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "duration") int duration) {
        return new MerchantOfferBannerItemDto(notifyButton, bannerId, background, bannerImage, action, logo, title, subtitle, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOfferBannerItemDto)) {
            return false;
        }
        MerchantOfferBannerItemDto merchantOfferBannerItemDto = (MerchantOfferBannerItemDto) other;
        return jl40.l(this.notifyButton, merchantOfferBannerItemDto.notifyButton) && jl40.l(this.bannerId, merchantOfferBannerItemDto.bannerId) && jl40.l(this.background, merchantOfferBannerItemDto.background) && jl40.l(this.bannerImage, merchantOfferBannerItemDto.bannerImage) && jl40.l(this.action, merchantOfferBannerItemDto.action) && jl40.l(this.logo, merchantOfferBannerItemDto.logo) && jl40.l(this.title, merchantOfferBannerItemDto.title) && jl40.l(this.subtitle, merchantOfferBannerItemDto.subtitle) && this.duration == merchantOfferBannerItemDto.duration;
    }

    public final String getAction() {
        return this.action;
    }

    public final ThemedParameter<String> getBackground() {
        return this.background;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final Themes<String> getBannerImage() {
        return this.bannerImage;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final DivDataDto getNotifyButton() {
        return this.notifyButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.notifyButton.hashCode() * 31, 31, this.bannerId);
        ThemedParameter<String> themedParameter = this.background;
        int hashCode = (b + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31;
        Themes<String> themes = this.bannerImage;
        int b2 = unr0.b((hashCode + (themes == null ? 0 : themes.hashCode())) * 31, 31, this.action);
        Themes<String> themes2 = this.logo;
        int b3 = unr0.b((b2 + (themes2 == null ? 0 : themes2.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        return Integer.hashCode(this.duration) + ((b3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        DivDataDto divDataDto = this.notifyButton;
        String str = this.bannerId;
        ThemedParameter<String> themedParameter = this.background;
        Themes<String> themes = this.bannerImage;
        String str2 = this.action;
        Themes<String> themes2 = this.logo;
        String str3 = this.title;
        String str4 = this.subtitle;
        int i = this.duration;
        StringBuilder sb = new StringBuilder("MerchantOfferBannerItemDto(notifyButton=");
        sb.append(divDataDto);
        sb.append(", bannerId=");
        sb.append(str);
        sb.append(", background=");
        sb.append(themedParameter);
        sb.append(", bannerImage=");
        sb.append(themes);
        sb.append(", action=");
        n.B(sb, str2, ", logo=", themes2, ", title=");
        g8e.D(sb, str3, ", subtitle=", str4, ", duration=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }
}
