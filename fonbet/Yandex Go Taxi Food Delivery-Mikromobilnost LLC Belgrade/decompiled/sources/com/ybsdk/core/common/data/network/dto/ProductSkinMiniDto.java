package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u00ad\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006*"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "", "backgroundImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "titleColor", "endIconImage", "raysGradient", "", "selectionColor", "topGradientColor", "balanceShimmerColor", "balanceSkeletonColor", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getBackgroundImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getBackgroundColor", "getTitleColor", "getEndIconImage", "getRaysGradient", "getSelectionColor", "getTopGradientColor", "getBalanceShimmerColor", "getBalanceSkeletonColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProductSkinMiniDto {
    private final ThemedParameter<String> backgroundColor;
    private final ThemedParameter<String> backgroundImage;
    private final ThemedParameter<String> balanceShimmerColor;
    private final ThemedParameter<String> balanceSkeletonColor;
    private final ThemedParameter<String> endIconImage;
    private final ThemedParameter<List<String>> raysGradient;
    private final ThemedParameter<String> selectionColor;
    private final ThemedParameter<String> titleColor;
    private final ThemedParameter<String> topGradientColor;

    public ProductSkinMiniDto(@Json(name = "background_image") ThemedParameter<String> themedParameter, @Json(name = "background_color") ThemedParameter<String> themedParameter2, @Json(name = "title_color") ThemedParameter<String> themedParameter3, @Json(name = "end_icon") ThemedParameter<String> themedParameter4, @Json(name = "rays_gradient") ThemedParameter<List<String>> themedParameter5, @Json(name = "selection_color") ThemedParameter<String> themedParameter6, @Json(name = "top_gradient_color") ThemedParameter<String> themedParameter7, @Json(name = "balance_shimmer_color") ThemedParameter<String> themedParameter8, @Json(name = "balance_skeleton_color") ThemedParameter<String> themedParameter9) {
        this.backgroundImage = themedParameter;
        this.backgroundColor = themedParameter2;
        this.titleColor = themedParameter3;
        this.endIconImage = themedParameter4;
        this.raysGradient = themedParameter5;
        this.selectionColor = themedParameter6;
        this.topGradientColor = themedParameter7;
        this.balanceShimmerColor = themedParameter8;
        this.balanceSkeletonColor = themedParameter9;
    }

    public static /* synthetic */ ProductSkinMiniDto copy$default(ProductSkinMiniDto productSkinMiniDto, ThemedParameter themedParameter, ThemedParameter themedParameter2, ThemedParameter themedParameter3, ThemedParameter themedParameter4, ThemedParameter themedParameter5, ThemedParameter themedParameter6, ThemedParameter themedParameter7, ThemedParameter themedParameter8, ThemedParameter themedParameter9, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = productSkinMiniDto.backgroundImage;
        }
        if ((i & 2) != 0) {
            themedParameter2 = productSkinMiniDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            themedParameter3 = productSkinMiniDto.titleColor;
        }
        if ((i & 8) != 0) {
            themedParameter4 = productSkinMiniDto.endIconImage;
        }
        if ((i & 16) != 0) {
            themedParameter5 = productSkinMiniDto.raysGradient;
        }
        if ((i & 32) != 0) {
            themedParameter6 = productSkinMiniDto.selectionColor;
        }
        if ((i & 64) != 0) {
            themedParameter7 = productSkinMiniDto.topGradientColor;
        }
        if ((i & 128) != 0) {
            themedParameter8 = productSkinMiniDto.balanceShimmerColor;
        }
        if ((i & 256) != 0) {
            themedParameter9 = productSkinMiniDto.balanceSkeletonColor;
        }
        ThemedParameter themedParameter10 = themedParameter8;
        ThemedParameter themedParameter11 = themedParameter9;
        ThemedParameter themedParameter12 = themedParameter6;
        ThemedParameter themedParameter13 = themedParameter7;
        ThemedParameter themedParameter14 = themedParameter5;
        ThemedParameter themedParameter15 = themedParameter3;
        return productSkinMiniDto.copy(themedParameter, themedParameter2, themedParameter15, themedParameter4, themedParameter14, themedParameter12, themedParameter13, themedParameter10, themedParameter11);
    }

    public final ThemedParameter<String> component1() {
        return this.backgroundImage;
    }

    public final ThemedParameter<String> component2() {
        return this.backgroundColor;
    }

    public final ThemedParameter<String> component3() {
        return this.titleColor;
    }

    public final ThemedParameter<String> component4() {
        return this.endIconImage;
    }

    public final ThemedParameter<List<String>> component5() {
        return this.raysGradient;
    }

    public final ThemedParameter<String> component6() {
        return this.selectionColor;
    }

    public final ThemedParameter<String> component7() {
        return this.topGradientColor;
    }

    public final ThemedParameter<String> component8() {
        return this.balanceShimmerColor;
    }

    public final ThemedParameter<String> component9() {
        return this.balanceSkeletonColor;
    }

    public final ProductSkinMiniDto copy(@Json(name = "background_image") ThemedParameter<String> backgroundImage, @Json(name = "background_color") ThemedParameter<String> backgroundColor, @Json(name = "title_color") ThemedParameter<String> titleColor, @Json(name = "end_icon") ThemedParameter<String> endIconImage, @Json(name = "rays_gradient") ThemedParameter<List<String>> raysGradient, @Json(name = "selection_color") ThemedParameter<String> selectionColor, @Json(name = "top_gradient_color") ThemedParameter<String> topGradientColor, @Json(name = "balance_shimmer_color") ThemedParameter<String> balanceShimmerColor, @Json(name = "balance_skeleton_color") ThemedParameter<String> balanceSkeletonColor) {
        return new ProductSkinMiniDto(backgroundImage, backgroundColor, titleColor, endIconImage, raysGradient, selectionColor, topGradientColor, balanceShimmerColor, balanceSkeletonColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSkinMiniDto)) {
            return false;
        }
        ProductSkinMiniDto productSkinMiniDto = (ProductSkinMiniDto) other;
        return jl40.l(this.backgroundImage, productSkinMiniDto.backgroundImage) && jl40.l(this.backgroundColor, productSkinMiniDto.backgroundColor) && jl40.l(this.titleColor, productSkinMiniDto.titleColor) && jl40.l(this.endIconImage, productSkinMiniDto.endIconImage) && jl40.l(this.raysGradient, productSkinMiniDto.raysGradient) && jl40.l(this.selectionColor, productSkinMiniDto.selectionColor) && jl40.l(this.topGradientColor, productSkinMiniDto.topGradientColor) && jl40.l(this.balanceShimmerColor, productSkinMiniDto.balanceShimmerColor) && jl40.l(this.balanceSkeletonColor, productSkinMiniDto.balanceSkeletonColor);
    }

    public final ThemedParameter<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ThemedParameter<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final ThemedParameter<String> getBalanceShimmerColor() {
        return this.balanceShimmerColor;
    }

    public final ThemedParameter<String> getBalanceSkeletonColor() {
        return this.balanceSkeletonColor;
    }

    public final ThemedParameter<String> getEndIconImage() {
        return this.endIconImage;
    }

    public final ThemedParameter<List<String>> getRaysGradient() {
        return this.raysGradient;
    }

    public final ThemedParameter<String> getSelectionColor() {
        return this.selectionColor;
    }

    public final ThemedParameter<String> getTitleColor() {
        return this.titleColor;
    }

    public final ThemedParameter<String> getTopGradientColor() {
        return this.topGradientColor;
    }

    public int hashCode() {
        int d = tse0.d(this.backgroundColor, this.backgroundImage.hashCode() * 31, 31);
        ThemedParameter<String> themedParameter = this.titleColor;
        int hashCode = (d + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31;
        ThemedParameter<String> themedParameter2 = this.endIconImage;
        int hashCode2 = (hashCode + (themedParameter2 == null ? 0 : themedParameter2.hashCode())) * 31;
        ThemedParameter<List<String>> themedParameter3 = this.raysGradient;
        int hashCode3 = (hashCode2 + (themedParameter3 == null ? 0 : themedParameter3.hashCode())) * 31;
        ThemedParameter<String> themedParameter4 = this.selectionColor;
        int hashCode4 = (hashCode3 + (themedParameter4 == null ? 0 : themedParameter4.hashCode())) * 31;
        ThemedParameter<String> themedParameter5 = this.topGradientColor;
        int hashCode5 = (hashCode4 + (themedParameter5 == null ? 0 : themedParameter5.hashCode())) * 31;
        ThemedParameter<String> themedParameter6 = this.balanceShimmerColor;
        int hashCode6 = (hashCode5 + (themedParameter6 == null ? 0 : themedParameter6.hashCode())) * 31;
        ThemedParameter<String> themedParameter7 = this.balanceSkeletonColor;
        return hashCode6 + (themedParameter7 != null ? themedParameter7.hashCode() : 0);
    }

    public String toString() {
        return "ProductSkinMiniDto(backgroundImage=" + this.backgroundImage + ", backgroundColor=" + this.backgroundColor + ", titleColor=" + this.titleColor + ", endIconImage=" + this.endIconImage + ", raysGradient=" + this.raysGradient + ", selectionColor=" + this.selectionColor + ", topGradientColor=" + this.topGradientColor + ", balanceShimmerColor=" + this.balanceShimmerColor + ", balanceSkeletonColor=" + this.balanceSkeletonColor + Extension.C_BRAKE;
    }
}
