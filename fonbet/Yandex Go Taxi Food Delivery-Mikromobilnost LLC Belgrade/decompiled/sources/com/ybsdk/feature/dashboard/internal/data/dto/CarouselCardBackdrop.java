package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "actionImage", "action", "image", "analyticsId", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getDescription", "getActionImage", "getAction", "()Ljava/lang/String;", "getImage", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselCardBackdrop {
    private final String action;
    private final Themes<String> actionImage;
    private final ColoredTextDto amount;
    private final String analyticsId;
    private final Themes<String> backgroundColor;
    private final ColoredTextDto description;
    private final Themes<String> image;

    public CarouselCardBackdrop(@Json(name = "background_color") Themes<String> themes, @Json(name = "amount") ColoredTextDto coloredTextDto, @Json(name = "description") ColoredTextDto coloredTextDto2, @Json(name = "action_image") Themes<String> themes2, @Json(name = "action") String str, @Json(name = "image") Themes<String> themes3, @Json(name = "analytics_id") String str2) {
        this.backgroundColor = themes;
        this.amount = coloredTextDto;
        this.description = coloredTextDto2;
        this.actionImage = themes2;
        this.action = str;
        this.image = themes3;
        this.analyticsId = str2;
    }

    public static /* synthetic */ CarouselCardBackdrop copy$default(CarouselCardBackdrop carouselCardBackdrop, Themes themes, ColoredTextDto coloredTextDto, ColoredTextDto coloredTextDto2, Themes themes2, String str, Themes themes3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = carouselCardBackdrop.backgroundColor;
        }
        if ((i & 2) != 0) {
            coloredTextDto = carouselCardBackdrop.amount;
        }
        if ((i & 4) != 0) {
            coloredTextDto2 = carouselCardBackdrop.description;
        }
        if ((i & 8) != 0) {
            themes2 = carouselCardBackdrop.actionImage;
        }
        if ((i & 16) != 0) {
            str = carouselCardBackdrop.action;
        }
        if ((i & 32) != 0) {
            themes3 = carouselCardBackdrop.image;
        }
        if ((i & 64) != 0) {
            str2 = carouselCardBackdrop.analyticsId;
        }
        Themes themes4 = themes3;
        String str3 = str2;
        String str4 = str;
        ColoredTextDto coloredTextDto3 = coloredTextDto2;
        return carouselCardBackdrop.copy(themes, coloredTextDto, coloredTextDto3, themes2, str4, themes4, str3);
    }

    public final Themes<String> component1() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ColoredTextDto getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final Themes<String> component4() {
        return this.actionImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component6() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final CarouselCardBackdrop copy(@Json(name = "background_color") Themes<String> backgroundColor, @Json(name = "amount") ColoredTextDto amount, @Json(name = "description") ColoredTextDto description, @Json(name = "action_image") Themes<String> actionImage, @Json(name = "action") String action, @Json(name = "image") Themes<String> image, @Json(name = "analytics_id") String analyticsId) {
        return new CarouselCardBackdrop(backgroundColor, amount, description, actionImage, action, image, analyticsId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardBackdrop)) {
            return false;
        }
        CarouselCardBackdrop carouselCardBackdrop = (CarouselCardBackdrop) other;
        return jl40.l(this.backgroundColor, carouselCardBackdrop.backgroundColor) && jl40.l(this.amount, carouselCardBackdrop.amount) && jl40.l(this.description, carouselCardBackdrop.description) && jl40.l(this.actionImage, carouselCardBackdrop.actionImage) && jl40.l(this.action, carouselCardBackdrop.action) && jl40.l(this.image, carouselCardBackdrop.image) && jl40.l(this.analyticsId, carouselCardBackdrop.analyticsId);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getActionImage() {
        return this.actionImage;
    }

    public final ColoredTextDto getAmount() {
        return this.amount;
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = (this.description.hashCode() + ((this.amount.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31)) * 31;
        Themes<String> themes = this.actionImage;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        String str = this.action;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes2 = this.image;
        int hashCode4 = (hashCode3 + (themes2 == null ? 0 : themes2.hashCode())) * 31;
        String str2 = this.analyticsId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Themes<String> themes = this.backgroundColor;
        ColoredTextDto coloredTextDto = this.amount;
        ColoredTextDto coloredTextDto2 = this.description;
        Themes<String> themes2 = this.actionImage;
        String str = this.action;
        Themes<String> themes3 = this.image;
        String str2 = this.analyticsId;
        StringBuilder sb = new StringBuilder("CarouselCardBackdrop(backgroundColor=");
        sb.append(themes);
        sb.append(", amount=");
        sb.append(coloredTextDto);
        sb.append(", description=");
        sb.append(coloredTextDto2);
        sb.append(", actionImage=");
        sb.append(themes2);
        sb.append(", action=");
        n.B(sb, str, ", image=", themes3, ", analyticsId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
