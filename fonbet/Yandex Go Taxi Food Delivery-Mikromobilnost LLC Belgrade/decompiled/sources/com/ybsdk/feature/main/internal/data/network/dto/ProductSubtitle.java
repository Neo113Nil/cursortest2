package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jp\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "subtitleColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "shouldAnimateSubtitle", "", "shimmerAnimateColor", "icon", "radialGradient", "Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;", "type", "Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSubtitleColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getShouldAnimateSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShimmerAnimateColor", "getIcon", "getRadialGradient", "()Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;", "getType", "()Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Boolean;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;)Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;", "equals", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductSubtitle {
    private final Themes<String> icon;
    private final Money money;
    private final RadialGradientDto radialGradient;
    private final Themes<String> shimmerAnimateColor;
    private final Boolean shouldAnimateSubtitle;
    private final Themes<String> subtitleColor;
    private final SubtitleTypeDto type;

    public ProductSubtitle(@Json(name = "money") Money money, @Json(name = "subtitle_color") Themes<String> themes, @Json(name = "should_animate_subtitle") Boolean bool, @Json(name = "shimmer_animate_color") Themes<String> themes2, @Json(name = "icon") Themes<String> themes3, @Json(name = "radial_gradient") RadialGradientDto radialGradientDto, @Json(name = "type") SubtitleTypeDto subtitleTypeDto) {
        this.money = money;
        this.subtitleColor = themes;
        this.shouldAnimateSubtitle = bool;
        this.shimmerAnimateColor = themes2;
        this.icon = themes3;
        this.radialGradient = radialGradientDto;
        this.type = subtitleTypeDto;
    }

    public static /* synthetic */ ProductSubtitle copy$default(ProductSubtitle productSubtitle, Money money, Themes themes, Boolean bool, Themes themes2, Themes themes3, RadialGradientDto radialGradientDto, SubtitleTypeDto subtitleTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = productSubtitle.money;
        }
        if ((i & 2) != 0) {
            themes = productSubtitle.subtitleColor;
        }
        if ((i & 4) != 0) {
            bool = productSubtitle.shouldAnimateSubtitle;
        }
        if ((i & 8) != 0) {
            themes2 = productSubtitle.shimmerAnimateColor;
        }
        if ((i & 16) != 0) {
            themes3 = productSubtitle.icon;
        }
        if ((i & 32) != 0) {
            radialGradientDto = productSubtitle.radialGradient;
        }
        if ((i & 64) != 0) {
            subtitleTypeDto = productSubtitle.type;
        }
        RadialGradientDto radialGradientDto2 = radialGradientDto;
        SubtitleTypeDto subtitleTypeDto2 = subtitleTypeDto;
        Themes themes4 = themes3;
        Boolean bool2 = bool;
        return productSubtitle.copy(money, themes, bool2, themes2, themes4, radialGradientDto2, subtitleTypeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final Themes<String> component2() {
        return this.subtitleColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShouldAnimateSubtitle() {
        return this.shouldAnimateSubtitle;
    }

    public final Themes<String> component4() {
        return this.shimmerAnimateColor;
    }

    public final Themes<String> component5() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final RadialGradientDto getRadialGradient() {
        return this.radialGradient;
    }

    /* renamed from: component7, reason: from getter */
    public final SubtitleTypeDto getType() {
        return this.type;
    }

    public final ProductSubtitle copy(@Json(name = "money") Money money, @Json(name = "subtitle_color") Themes<String> subtitleColor, @Json(name = "should_animate_subtitle") Boolean shouldAnimateSubtitle, @Json(name = "shimmer_animate_color") Themes<String> shimmerAnimateColor, @Json(name = "icon") Themes<String> icon, @Json(name = "radial_gradient") RadialGradientDto radialGradient, @Json(name = "type") SubtitleTypeDto type) {
        return new ProductSubtitle(money, subtitleColor, shouldAnimateSubtitle, shimmerAnimateColor, icon, radialGradient, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSubtitle)) {
            return false;
        }
        ProductSubtitle productSubtitle = (ProductSubtitle) other;
        return jl40.l(this.money, productSubtitle.money) && jl40.l(this.subtitleColor, productSubtitle.subtitleColor) && jl40.l(this.shouldAnimateSubtitle, productSubtitle.shouldAnimateSubtitle) && jl40.l(this.shimmerAnimateColor, productSubtitle.shimmerAnimateColor) && jl40.l(this.icon, productSubtitle.icon) && jl40.l(this.radialGradient, productSubtitle.radialGradient) && this.type == productSubtitle.type;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final RadialGradientDto getRadialGradient() {
        return this.radialGradient;
    }

    public final Themes<String> getShimmerAnimateColor() {
        return this.shimmerAnimateColor;
    }

    public final Boolean getShouldAnimateSubtitle() {
        return this.shouldAnimateSubtitle;
    }

    public final Themes<String> getSubtitleColor() {
        return this.subtitleColor;
    }

    public final SubtitleTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int c = nnm.c(this.subtitleColor, this.money.hashCode() * 31, 31);
        Boolean bool = this.shouldAnimateSubtitle;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        Themes<String> themes = this.shimmerAnimateColor;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.icon;
        int hashCode3 = (hashCode2 + (themes2 == null ? 0 : themes2.hashCode())) * 31;
        RadialGradientDto radialGradientDto = this.radialGradient;
        int hashCode4 = (hashCode3 + (radialGradientDto == null ? 0 : radialGradientDto.hashCode())) * 31;
        SubtitleTypeDto subtitleTypeDto = this.type;
        return hashCode4 + (subtitleTypeDto != null ? subtitleTypeDto.hashCode() : 0);
    }

    public String toString() {
        return "ProductSubtitle(money=" + this.money + ", subtitleColor=" + this.subtitleColor + ", shouldAnimateSubtitle=" + this.shouldAnimateSubtitle + ", shimmerAnimateColor=" + this.shimmerAnimateColor + ", icon=" + this.icon + ", radialGradient=" + this.radialGradient + ", type=" + this.type + Extension.C_BRAKE;
    }
}
