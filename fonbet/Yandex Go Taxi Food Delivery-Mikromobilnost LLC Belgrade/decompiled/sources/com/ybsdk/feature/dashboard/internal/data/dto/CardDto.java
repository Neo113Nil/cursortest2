package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003J©\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006H"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardDto;", "", "viewId", "", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "title", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "titleIcon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "iconAfterTitle", "balance", "Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV3Dto;", "additionalBalance", "balanceSpoilerParams", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "backdrop", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "divkitBackdrop", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdrop;", "divkitOverlay", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "a11y", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yDto;", "skin", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV3Dto;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV3Dto;Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdrop;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yDto;Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;)V", "getViewId", "()Ljava/lang/String;", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "getTitle", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getTitleIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIconAfterTitle", "getBalance", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV3Dto;", "getAdditionalBalance", "getBalanceSpoilerParams", "()Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "getBackdrop", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "getDivkitBackdrop", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdrop;", "getDivkitOverlay", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getA11y", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yDto;", "getSkin", "()Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardDto {
    private final CardA11yDto a11y;
    private final BalanceV3Dto additionalBalance;
    private final CarouselCardBackdrop backdrop;
    private final com.ybsdk.core.common.data.network.dto.ProductBackgroundDto background;
    private final BalanceV3Dto balance;
    private final SpoilerParamDto balanceSpoilerParams;
    private final CarouselCardDivkitBackdrop divkitBackdrop;
    private final DivDataDto divkitOverlay;
    private final Themes<String> iconAfterTitle;
    private final com.ybsdk.core.common.data.network.dto.ProductSkinDto skin;
    private final ColoredTextDto title;
    private final Themes<String> titleIcon;
    private final String viewId;

    public /* synthetic */ CardDto(String str, com.ybsdk.core.common.data.network.dto.ProductBackgroundDto productBackgroundDto, ColoredTextDto coloredTextDto, Themes themes, Themes themes2, BalanceV3Dto balanceV3Dto, BalanceV3Dto balanceV3Dto2, SpoilerParamDto spoilerParamDto, CarouselCardBackdrop carouselCardBackdrop, CarouselCardDivkitBackdrop carouselCardDivkitBackdrop, DivDataDto divDataDto, CardA11yDto cardA11yDto, com.ybsdk.core.common.data.network.dto.ProductSkinDto productSkinDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productBackgroundDto, coloredTextDto, themes, (i & 16) != 0 ? null : themes2, balanceV3Dto, balanceV3Dto2, spoilerParamDto, carouselCardBackdrop, carouselCardDivkitBackdrop, divDataDto, cardA11yDto, productSkinDto);
    }

    public static /* synthetic */ CardDto copy$default(CardDto cardDto, String str, com.ybsdk.core.common.data.network.dto.ProductBackgroundDto productBackgroundDto, ColoredTextDto coloredTextDto, Themes themes, Themes themes2, BalanceV3Dto balanceV3Dto, BalanceV3Dto balanceV3Dto2, SpoilerParamDto spoilerParamDto, CarouselCardBackdrop carouselCardBackdrop, CarouselCardDivkitBackdrop carouselCardDivkitBackdrop, DivDataDto divDataDto, CardA11yDto cardA11yDto, com.ybsdk.core.common.data.network.dto.ProductSkinDto productSkinDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDto.viewId;
        }
        return cardDto.copy(str, (i & 2) != 0 ? cardDto.background : productBackgroundDto, (i & 4) != 0 ? cardDto.title : coloredTextDto, (i & 8) != 0 ? cardDto.titleIcon : themes, (i & 16) != 0 ? cardDto.iconAfterTitle : themes2, (i & 32) != 0 ? cardDto.balance : balanceV3Dto, (i & 64) != 0 ? cardDto.additionalBalance : balanceV3Dto2, (i & 128) != 0 ? cardDto.balanceSpoilerParams : spoilerParamDto, (i & 256) != 0 ? cardDto.backdrop : carouselCardBackdrop, (i & 512) != 0 ? cardDto.divkitBackdrop : carouselCardDivkitBackdrop, (i & 1024) != 0 ? cardDto.divkitOverlay : divDataDto, (i & 2048) != 0 ? cardDto.a11y : cardA11yDto, (i & 4096) != 0 ? cardDto.skin : productSkinDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* renamed from: component10, reason: from getter */
    public final CarouselCardDivkitBackdrop getDivkitBackdrop() {
        return this.divkitBackdrop;
    }

    /* renamed from: component11, reason: from getter */
    public final DivDataDto getDivkitOverlay() {
        return this.divkitOverlay;
    }

    /* renamed from: component12, reason: from getter */
    public final CardA11yDto getA11y() {
        return this.a11y;
    }

    /* renamed from: component13, reason: from getter */
    public final com.ybsdk.core.common.data.network.dto.ProductSkinDto getSkin() {
        return this.skin;
    }

    /* renamed from: component2, reason: from getter */
    public final com.ybsdk.core.common.data.network.dto.ProductBackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component3, reason: from getter */
    public final ColoredTextDto getTitle() {
        return this.title;
    }

    public final Themes<String> component4() {
        return this.titleIcon;
    }

    public final Themes<String> component5() {
        return this.iconAfterTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final BalanceV3Dto getBalance() {
        return this.balance;
    }

    /* renamed from: component7, reason: from getter */
    public final BalanceV3Dto getAdditionalBalance() {
        return this.additionalBalance;
    }

    /* renamed from: component8, reason: from getter */
    public final SpoilerParamDto getBalanceSpoilerParams() {
        return this.balanceSpoilerParams;
    }

    /* renamed from: component9, reason: from getter */
    public final CarouselCardBackdrop getBackdrop() {
        return this.backdrop;
    }

    public final CardDto copy(@Json(name = "view_id") String viewId, @Json(name = "background") com.ybsdk.core.common.data.network.dto.ProductBackgroundDto background, @Json(name = "title") ColoredTextDto title, @Json(name = "title_icon") Themes<String> titleIcon, @Json(name = "icon_after_title") Themes<String> iconAfterTitle, @Json(name = "balance") BalanceV3Dto balance, @Json(name = "additional_balance") BalanceV3Dto additionalBalance, @Json(name = "balance_spoiler_params") SpoilerParamDto balanceSpoilerParams, @Json(name = "backdrop") CarouselCardBackdrop backdrop, @Json(name = "divkit_backdrop") CarouselCardDivkitBackdrop divkitBackdrop, @Json(name = "divkit_overlay") DivDataDto divkitOverlay, @Json(name = "a11y") CardA11yDto a11y, @Json(name = "skin") com.ybsdk.core.common.data.network.dto.ProductSkinDto skin) {
        return new CardDto(viewId, background, title, titleIcon, iconAfterTitle, balance, additionalBalance, balanceSpoilerParams, backdrop, divkitBackdrop, divkitOverlay, a11y, skin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDto)) {
            return false;
        }
        CardDto cardDto = (CardDto) other;
        return jl40.l(this.viewId, cardDto.viewId) && jl40.l(this.background, cardDto.background) && jl40.l(this.title, cardDto.title) && jl40.l(this.titleIcon, cardDto.titleIcon) && jl40.l(this.iconAfterTitle, cardDto.iconAfterTitle) && jl40.l(this.balance, cardDto.balance) && jl40.l(this.additionalBalance, cardDto.additionalBalance) && jl40.l(this.balanceSpoilerParams, cardDto.balanceSpoilerParams) && jl40.l(this.backdrop, cardDto.backdrop) && jl40.l(this.divkitBackdrop, cardDto.divkitBackdrop) && jl40.l(this.divkitOverlay, cardDto.divkitOverlay) && jl40.l(this.a11y, cardDto.a11y) && jl40.l(this.skin, cardDto.skin);
    }

    public final CardA11yDto getA11y() {
        return this.a11y;
    }

    public final BalanceV3Dto getAdditionalBalance() {
        return this.additionalBalance;
    }

    public final CarouselCardBackdrop getBackdrop() {
        return this.backdrop;
    }

    public final com.ybsdk.core.common.data.network.dto.ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final BalanceV3Dto getBalance() {
        return this.balance;
    }

    public final SpoilerParamDto getBalanceSpoilerParams() {
        return this.balanceSpoilerParams;
    }

    public final CarouselCardDivkitBackdrop getDivkitBackdrop() {
        return this.divkitBackdrop;
    }

    public final DivDataDto getDivkitOverlay() {
        return this.divkitOverlay;
    }

    public final Themes<String> getIconAfterTitle() {
        return this.iconAfterTitle;
    }

    public final com.ybsdk.core.common.data.network.dto.ProductSkinDto getSkin() {
        return this.skin;
    }

    public final ColoredTextDto getTitle() {
        return this.title;
    }

    public final Themes<String> getTitleIcon() {
        return this.titleIcon;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        String str = this.viewId;
        int hashCode = (this.title.hashCode() + ((this.background.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        Themes<String> themes = this.titleIcon;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.iconAfterTitle;
        int hashCode3 = (this.balance.hashCode() + ((hashCode2 + (themes2 == null ? 0 : themes2.hashCode())) * 31)) * 31;
        BalanceV3Dto balanceV3Dto = this.additionalBalance;
        int hashCode4 = (this.balanceSpoilerParams.hashCode() + ((hashCode3 + (balanceV3Dto == null ? 0 : balanceV3Dto.hashCode())) * 31)) * 31;
        CarouselCardBackdrop carouselCardBackdrop = this.backdrop;
        int hashCode5 = (hashCode4 + (carouselCardBackdrop == null ? 0 : carouselCardBackdrop.hashCode())) * 31;
        CarouselCardDivkitBackdrop carouselCardDivkitBackdrop = this.divkitBackdrop;
        int hashCode6 = (hashCode5 + (carouselCardDivkitBackdrop == null ? 0 : carouselCardDivkitBackdrop.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitOverlay;
        int hashCode7 = (hashCode6 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        CardA11yDto cardA11yDto = this.a11y;
        int hashCode8 = (hashCode7 + (cardA11yDto == null ? 0 : cardA11yDto.hashCode())) * 31;
        com.ybsdk.core.common.data.network.dto.ProductSkinDto productSkinDto = this.skin;
        return hashCode8 + (productSkinDto != null ? productSkinDto.hashCode() : 0);
    }

    public String toString() {
        return "CardDto(viewId=" + this.viewId + ", background=" + this.background + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ", iconAfterTitle=" + this.iconAfterTitle + ", balance=" + this.balance + ", additionalBalance=" + this.additionalBalance + ", balanceSpoilerParams=" + this.balanceSpoilerParams + ", backdrop=" + this.backdrop + ", divkitBackdrop=" + this.divkitBackdrop + ", divkitOverlay=" + this.divkitOverlay + ", a11y=" + this.a11y + ", skin=" + this.skin + Extension.C_BRAKE;
    }

    public CardDto(@Json(name = "view_id") String str, @Json(name = "background") com.ybsdk.core.common.data.network.dto.ProductBackgroundDto productBackgroundDto, @Json(name = "title") ColoredTextDto coloredTextDto, @Json(name = "title_icon") Themes<String> themes, @Json(name = "icon_after_title") Themes<String> themes2, @Json(name = "balance") BalanceV3Dto balanceV3Dto, @Json(name = "additional_balance") BalanceV3Dto balanceV3Dto2, @Json(name = "balance_spoiler_params") SpoilerParamDto spoilerParamDto, @Json(name = "backdrop") CarouselCardBackdrop carouselCardBackdrop, @Json(name = "divkit_backdrop") CarouselCardDivkitBackdrop carouselCardDivkitBackdrop, @Json(name = "divkit_overlay") DivDataDto divDataDto, @Json(name = "a11y") CardA11yDto cardA11yDto, @Json(name = "skin") com.ybsdk.core.common.data.network.dto.ProductSkinDto productSkinDto) {
        this.viewId = str;
        this.background = productBackgroundDto;
        this.title = coloredTextDto;
        this.titleIcon = themes;
        this.iconAfterTitle = themes2;
        this.balance = balanceV3Dto;
        this.additionalBalance = balanceV3Dto2;
        this.balanceSpoilerParams = spoilerParamDto;
        this.backdrop = carouselCardBackdrop;
        this.divkitBackdrop = carouselCardDivkitBackdrop;
        this.divkitOverlay = divDataDto;
        this.a11y = cardA11yDto;
        this.skin = productSkinDto;
    }
}
