package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003J©\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006H"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardV2Dto;", "", "viewId", "", C0553n3.g, "Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductBackgroundDto;", "title", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "titleIcon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "iconAfterTitle", "balance", "Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV4Dto;", "additionalBalance", "balanceSpoilerParams", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "backdrop", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "divkitBackdrop", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdropV2;", "divkitOverlay", "Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "a11y", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yV2Dto;", "skin", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductSkinDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductBackgroundDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV4Dto;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV4Dto;Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdropV2;Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yV2Dto;Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductSkinDto;)V", "getViewId", "()Ljava/lang/String;", "getBackground", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductBackgroundDto;", "getTitle", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getTitleIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIconAfterTitle", "getBalance", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV4Dto;", "getAdditionalBalance", "getBalanceSpoilerParams", "()Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "getBackdrop", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardBackdrop;", "getDivkitBackdrop", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdropV2;", "getDivkitOverlay", "()Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "getA11y", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yV2Dto;", "getSkin", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductSkinDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardV2Dto {
    private final CardA11yV2Dto a11y;
    private final BalanceV4Dto additionalBalance;
    private final CarouselCardBackdrop backdrop;
    private final ProductBackgroundDto background;
    private final BalanceV4Dto balance;
    private final SpoilerParamDto balanceSpoilerParams;
    private final CarouselCardDivkitBackdropV2 divkitBackdrop;
    private final DivKitDataV2Dto divkitOverlay;
    private final Themes<String> iconAfterTitle;
    private final ProductSkinDto skin;
    private final ColoredTextDto title;
    private final Themes<String> titleIcon;
    private final String viewId;

    public /* synthetic */ CardV2Dto(String str, ProductBackgroundDto productBackgroundDto, ColoredTextDto coloredTextDto, Themes themes, Themes themes2, BalanceV4Dto balanceV4Dto, BalanceV4Dto balanceV4Dto2, SpoilerParamDto spoilerParamDto, CarouselCardBackdrop carouselCardBackdrop, CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2, DivKitDataV2Dto divKitDataV2Dto, CardA11yV2Dto cardA11yV2Dto, ProductSkinDto productSkinDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productBackgroundDto, coloredTextDto, themes, (i & 16) != 0 ? null : themes2, balanceV4Dto, balanceV4Dto2, spoilerParamDto, carouselCardBackdrop, carouselCardDivkitBackdropV2, divKitDataV2Dto, cardA11yV2Dto, productSkinDto);
    }

    public static /* synthetic */ CardV2Dto copy$default(CardV2Dto cardV2Dto, String str, ProductBackgroundDto productBackgroundDto, ColoredTextDto coloredTextDto, Themes themes, Themes themes2, BalanceV4Dto balanceV4Dto, BalanceV4Dto balanceV4Dto2, SpoilerParamDto spoilerParamDto, CarouselCardBackdrop carouselCardBackdrop, CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2, DivKitDataV2Dto divKitDataV2Dto, CardA11yV2Dto cardA11yV2Dto, ProductSkinDto productSkinDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardV2Dto.viewId;
        }
        return cardV2Dto.copy(str, (i & 2) != 0 ? cardV2Dto.background : productBackgroundDto, (i & 4) != 0 ? cardV2Dto.title : coloredTextDto, (i & 8) != 0 ? cardV2Dto.titleIcon : themes, (i & 16) != 0 ? cardV2Dto.iconAfterTitle : themes2, (i & 32) != 0 ? cardV2Dto.balance : balanceV4Dto, (i & 64) != 0 ? cardV2Dto.additionalBalance : balanceV4Dto2, (i & 128) != 0 ? cardV2Dto.balanceSpoilerParams : spoilerParamDto, (i & 256) != 0 ? cardV2Dto.backdrop : carouselCardBackdrop, (i & 512) != 0 ? cardV2Dto.divkitBackdrop : carouselCardDivkitBackdropV2, (i & 1024) != 0 ? cardV2Dto.divkitOverlay : divKitDataV2Dto, (i & 2048) != 0 ? cardV2Dto.a11y : cardA11yV2Dto, (i & 4096) != 0 ? cardV2Dto.skin : productSkinDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* renamed from: component10, reason: from getter */
    public final CarouselCardDivkitBackdropV2 getDivkitBackdrop() {
        return this.divkitBackdrop;
    }

    /* renamed from: component11, reason: from getter */
    public final DivKitDataV2Dto getDivkitOverlay() {
        return this.divkitOverlay;
    }

    /* renamed from: component12, reason: from getter */
    public final CardA11yV2Dto getA11y() {
        return this.a11y;
    }

    /* renamed from: component13, reason: from getter */
    public final ProductSkinDto getSkin() {
        return this.skin;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductBackgroundDto getBackground() {
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
    public final BalanceV4Dto getBalance() {
        return this.balance;
    }

    /* renamed from: component7, reason: from getter */
    public final BalanceV4Dto getAdditionalBalance() {
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

    public final CardV2Dto copy(@Json(name = "view_id") String viewId, @Json(name = "background") ProductBackgroundDto background, @Json(name = "title") ColoredTextDto title, @Json(name = "title_icon") Themes<String> titleIcon, @Json(name = "icon_after_title") Themes<String> iconAfterTitle, @Json(name = "balance") BalanceV4Dto balance, @Json(name = "additional_balance") BalanceV4Dto additionalBalance, @Json(name = "balance_spoiler_params") SpoilerParamDto balanceSpoilerParams, @Json(name = "backdrop") CarouselCardBackdrop backdrop, @Json(name = "divkit_backdrop") CarouselCardDivkitBackdropV2 divkitBackdrop, @Json(name = "divkit_overlay") DivKitDataV2Dto divkitOverlay, @Json(name = "a11y") CardA11yV2Dto a11y, @Json(name = "skin") ProductSkinDto skin) {
        return new CardV2Dto(viewId, background, title, titleIcon, iconAfterTitle, balance, additionalBalance, balanceSpoilerParams, backdrop, divkitBackdrop, divkitOverlay, a11y, skin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardV2Dto)) {
            return false;
        }
        CardV2Dto cardV2Dto = (CardV2Dto) other;
        return jl40.l(this.viewId, cardV2Dto.viewId) && jl40.l(this.background, cardV2Dto.background) && jl40.l(this.title, cardV2Dto.title) && jl40.l(this.titleIcon, cardV2Dto.titleIcon) && jl40.l(this.iconAfterTitle, cardV2Dto.iconAfterTitle) && jl40.l(this.balance, cardV2Dto.balance) && jl40.l(this.additionalBalance, cardV2Dto.additionalBalance) && jl40.l(this.balanceSpoilerParams, cardV2Dto.balanceSpoilerParams) && jl40.l(this.backdrop, cardV2Dto.backdrop) && jl40.l(this.divkitBackdrop, cardV2Dto.divkitBackdrop) && jl40.l(this.divkitOverlay, cardV2Dto.divkitOverlay) && jl40.l(this.a11y, cardV2Dto.a11y) && jl40.l(this.skin, cardV2Dto.skin);
    }

    public final CardA11yV2Dto getA11y() {
        return this.a11y;
    }

    public final BalanceV4Dto getAdditionalBalance() {
        return this.additionalBalance;
    }

    public final CarouselCardBackdrop getBackdrop() {
        return this.backdrop;
    }

    public final ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final BalanceV4Dto getBalance() {
        return this.balance;
    }

    public final SpoilerParamDto getBalanceSpoilerParams() {
        return this.balanceSpoilerParams;
    }

    public final CarouselCardDivkitBackdropV2 getDivkitBackdrop() {
        return this.divkitBackdrop;
    }

    public final DivKitDataV2Dto getDivkitOverlay() {
        return this.divkitOverlay;
    }

    public final Themes<String> getIconAfterTitle() {
        return this.iconAfterTitle;
    }

    public final ProductSkinDto getSkin() {
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
        BalanceV4Dto balanceV4Dto = this.additionalBalance;
        int hashCode4 = (this.balanceSpoilerParams.hashCode() + ((hashCode3 + (balanceV4Dto == null ? 0 : balanceV4Dto.hashCode())) * 31)) * 31;
        CarouselCardBackdrop carouselCardBackdrop = this.backdrop;
        int hashCode5 = (hashCode4 + (carouselCardBackdrop == null ? 0 : carouselCardBackdrop.hashCode())) * 31;
        CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2 = this.divkitBackdrop;
        int hashCode6 = (hashCode5 + (carouselCardDivkitBackdropV2 == null ? 0 : carouselCardDivkitBackdropV2.hashCode())) * 31;
        DivKitDataV2Dto divKitDataV2Dto = this.divkitOverlay;
        int hashCode7 = (hashCode6 + (divKitDataV2Dto == null ? 0 : divKitDataV2Dto.hashCode())) * 31;
        CardA11yV2Dto cardA11yV2Dto = this.a11y;
        int hashCode8 = (hashCode7 + (cardA11yV2Dto == null ? 0 : cardA11yV2Dto.hashCode())) * 31;
        ProductSkinDto productSkinDto = this.skin;
        return hashCode8 + (productSkinDto != null ? productSkinDto.hashCode() : 0);
    }

    public String toString() {
        return "CardV2Dto(viewId=" + this.viewId + ", background=" + this.background + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ", iconAfterTitle=" + this.iconAfterTitle + ", balance=" + this.balance + ", additionalBalance=" + this.additionalBalance + ", balanceSpoilerParams=" + this.balanceSpoilerParams + ", backdrop=" + this.backdrop + ", divkitBackdrop=" + this.divkitBackdrop + ", divkitOverlay=" + this.divkitOverlay + ", a11y=" + this.a11y + ", skin=" + this.skin + Extension.C_BRAKE;
    }

    public CardV2Dto(@Json(name = "view_id") String str, @Json(name = "background") ProductBackgroundDto productBackgroundDto, @Json(name = "title") ColoredTextDto coloredTextDto, @Json(name = "title_icon") Themes<String> themes, @Json(name = "icon_after_title") Themes<String> themes2, @Json(name = "balance") BalanceV4Dto balanceV4Dto, @Json(name = "additional_balance") BalanceV4Dto balanceV4Dto2, @Json(name = "balance_spoiler_params") SpoilerParamDto spoilerParamDto, @Json(name = "backdrop") CarouselCardBackdrop carouselCardBackdrop, @Json(name = "divkit_backdrop") CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2, @Json(name = "divkit_overlay") DivKitDataV2Dto divKitDataV2Dto, @Json(name = "a11y") CardA11yV2Dto cardA11yV2Dto, @Json(name = "skin") ProductSkinDto productSkinDto) {
        this.viewId = str;
        this.background = productBackgroundDto;
        this.title = coloredTextDto;
        this.titleIcon = themes;
        this.iconAfterTitle = themes2;
        this.balance = balanceV4Dto;
        this.additionalBalance = balanceV4Dto2;
        this.balanceSpoilerParams = spoilerParamDto;
        this.backdrop = carouselCardBackdrop;
        this.divkitBackdrop = carouselCardDivkitBackdropV2;
        this.divkitOverlay = divKitDataV2Dto;
        this.a11y = cardA11yV2Dto;
        this.skin = productSkinDto;
    }
}
