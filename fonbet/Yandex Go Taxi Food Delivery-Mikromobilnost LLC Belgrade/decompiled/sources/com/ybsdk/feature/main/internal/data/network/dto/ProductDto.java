package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ProductBackgroundDto;
import com.ybsdk.core.common.data.network.dto.ProductSkinDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0012HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÌ\u0001\u0010H\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00122\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0017HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductDto;", "", "id", "", "viewId", "type", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;", "action", "icons", "", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "title", "titleColor", "productRightPart", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;", "spoilerParam", "Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "iconAfterTitle", "a11y", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;", "iconCornerRadius", "", "skin", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "productCaption", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;Ljava/lang/Integer;Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getId", "()Ljava/lang/String;", "getViewId", "getType", "()Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;", "getAction", "getIcons", "()Ljava/util/List;", "getTitle", "getTitleColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getProductRightPart", "()Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;", "getSpoilerParam", "()Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "getIconAfterTitle", "getA11y", "()Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;", "getIconCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSkin", "()Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "getProductCaption", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;Ljava/lang/Integer;Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/main/internal/data/network/dto/ProductDto;", "equals", "", "other", "hashCode", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductDto {
    private final ProductA11yDto a11y;
    private final String action;
    private final ProductBackgroundDto background;
    private final Themes<String> iconAfterTitle;
    private final Integer iconCornerRadius;
    private final List<Themes<String>> icons;
    private final String id;
    private final DivDataDto productCaption;
    private final ProductRightPartDto productRightPart;
    private final ProductSkinDto skin;
    private final SpoilerParamDto spoilerParam;
    private final String title;
    private final Themes<String> titleColor;
    private final ProductTypeDto type;
    private final String viewId;

    public /* synthetic */ ProductDto(String str, String str2, ProductTypeDto productTypeDto, String str3, List list, String str4, Themes themes, ProductRightPartDto productRightPartDto, SpoilerParamDto spoilerParamDto, ProductBackgroundDto productBackgroundDto, Themes themes2, ProductA11yDto productA11yDto, Integer num, ProductSkinDto productSkinDto, DivDataDto divDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, productTypeDto, str3, list, str4, themes, productRightPartDto, spoilerParamDto, productBackgroundDto, (i & 1024) != 0 ? null : themes2, productA11yDto, num, productSkinDto, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final Themes<String> component11() {
        return this.iconAfterTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final ProductA11yDto getA11y() {
        return this.a11y;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getIconCornerRadius() {
        return this.iconCornerRadius;
    }

    /* renamed from: component14, reason: from getter */
    public final ProductSkinDto getSkin() {
        return this.skin;
    }

    /* renamed from: component15, reason: from getter */
    public final DivDataDto getProductCaption() {
        return this.productCaption;
    }

    /* renamed from: component2, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductTypeDto getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<Themes<String>> component5() {
        return this.icons;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component7() {
        return this.titleColor;
    }

    /* renamed from: component8, reason: from getter */
    public final ProductRightPartDto getProductRightPart() {
        return this.productRightPart;
    }

    /* renamed from: component9, reason: from getter */
    public final SpoilerParamDto getSpoilerParam() {
        return this.spoilerParam;
    }

    public final ProductDto copy(@Json(name = "id") String id, @Json(name = "view_id") String viewId, @Json(name = "type") ProductTypeDto type, @Json(name = "action") String action, @Json(name = "icons") List<Themes<String>> icons, @Json(name = "title") String title, @Json(name = "title_color") Themes<String> titleColor, @Json(name = "product_right_part") ProductRightPartDto productRightPart, @Json(name = "spoiler_params") SpoilerParamDto spoilerParam, @Json(name = "background") ProductBackgroundDto background, @Json(name = "icon_after_title") Themes<String> iconAfterTitle, @Json(name = "a11y") ProductA11yDto a11y, @Json(name = "icon_corner_radius") Integer iconCornerRadius, @Json(name = "skin") ProductSkinDto skin, @Json(name = "product_caption") DivDataDto productCaption) {
        return new ProductDto(id, viewId, type, action, icons, title, titleColor, productRightPart, spoilerParam, background, iconAfterTitle, a11y, iconCornerRadius, skin, productCaption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDto)) {
            return false;
        }
        ProductDto productDto = (ProductDto) other;
        return jl40.l(this.id, productDto.id) && jl40.l(this.viewId, productDto.viewId) && this.type == productDto.type && jl40.l(this.action, productDto.action) && jl40.l(this.icons, productDto.icons) && jl40.l(this.title, productDto.title) && jl40.l(this.titleColor, productDto.titleColor) && jl40.l(this.productRightPart, productDto.productRightPart) && jl40.l(this.spoilerParam, productDto.spoilerParam) && jl40.l(this.background, productDto.background) && jl40.l(this.iconAfterTitle, productDto.iconAfterTitle) && jl40.l(this.a11y, productDto.a11y) && jl40.l(this.iconCornerRadius, productDto.iconCornerRadius) && jl40.l(this.skin, productDto.skin) && jl40.l(this.productCaption, productDto.productCaption);
    }

    public final ProductA11yDto getA11y() {
        return this.a11y;
    }

    public final String getAction() {
        return this.action;
    }

    public final ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final Themes<String> getIconAfterTitle() {
        return this.iconAfterTitle;
    }

    public final Integer getIconCornerRadius() {
        return this.iconCornerRadius;
    }

    public final List<Themes<String>> getIcons() {
        return this.icons;
    }

    public final String getId() {
        return this.id;
    }

    public final DivDataDto getProductCaption() {
        return this.productCaption;
    }

    public final ProductRightPartDto getProductRightPart() {
        return this.productRightPart;
    }

    public final ProductSkinDto getSkin() {
        return this.skin;
    }

    public final SpoilerParamDto getSpoilerParam() {
        return this.spoilerParam;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> getTitleColor() {
        return this.titleColor;
    }

    public final ProductTypeDto getType() {
        return this.type;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.viewId;
        int b = unr0.b((this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.action);
        List<Themes<String>> list = this.icons;
        int c = nnm.c(this.titleColor, unr0.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.title), 31);
        ProductRightPartDto productRightPartDto = this.productRightPart;
        int hashCode2 = (this.background.hashCode() + ((this.spoilerParam.hashCode() + ((c + (productRightPartDto == null ? 0 : productRightPartDto.hashCode())) * 31)) * 31)) * 31;
        Themes<String> themes = this.iconAfterTitle;
        int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
        ProductA11yDto productA11yDto = this.a11y;
        int hashCode4 = (hashCode3 + (productA11yDto == null ? 0 : productA11yDto.hashCode())) * 31;
        Integer num = this.iconCornerRadius;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        ProductSkinDto productSkinDto = this.skin;
        int hashCode6 = (hashCode5 + (productSkinDto == null ? 0 : productSkinDto.hashCode())) * 31;
        DivDataDto divDataDto = this.productCaption;
        return hashCode6 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.viewId;
        ProductTypeDto productTypeDto = this.type;
        String str3 = this.action;
        List<Themes<String>> list = this.icons;
        String str4 = this.title;
        Themes<String> themes = this.titleColor;
        ProductRightPartDto productRightPartDto = this.productRightPart;
        SpoilerParamDto spoilerParamDto = this.spoilerParam;
        ProductBackgroundDto productBackgroundDto = this.background;
        Themes<String> themes2 = this.iconAfterTitle;
        ProductA11yDto productA11yDto = this.a11y;
        Integer num = this.iconCornerRadius;
        ProductSkinDto productSkinDto = this.skin;
        DivDataDto divDataDto = this.productCaption;
        StringBuilder v = b64.v("ProductDto(id=", str, ", viewId=", str2, ", type=");
        v.append(productTypeDto);
        v.append(", action=");
        v.append(str3);
        v.append(", icons=");
        oyr.D(", title=", str4, ", titleColor=", v, list);
        v.append(themes);
        v.append(", productRightPart=");
        v.append(productRightPartDto);
        v.append(", spoilerParam=");
        v.append(spoilerParamDto);
        v.append(", background=");
        v.append(productBackgroundDto);
        v.append(", iconAfterTitle=");
        v.append(themes2);
        v.append(", a11y=");
        v.append(productA11yDto);
        v.append(", iconCornerRadius=");
        v.append(num);
        v.append(", skin=");
        v.append(productSkinDto);
        v.append(", productCaption=");
        v.append(divDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ProductDto(@Json(name = "id") String str, @Json(name = "view_id") String str2, @Json(name = "type") ProductTypeDto productTypeDto, @Json(name = "action") String str3, @Json(name = "icons") List<Themes<String>> list, @Json(name = "title") String str4, @Json(name = "title_color") Themes<String> themes, @Json(name = "product_right_part") ProductRightPartDto productRightPartDto, @Json(name = "spoiler_params") SpoilerParamDto spoilerParamDto, @Json(name = "background") ProductBackgroundDto productBackgroundDto, @Json(name = "icon_after_title") Themes<String> themes2, @Json(name = "a11y") ProductA11yDto productA11yDto, @Json(name = "icon_corner_radius") Integer num, @Json(name = "skin") ProductSkinDto productSkinDto, @Json(name = "product_caption") DivDataDto divDataDto) {
        this.id = str;
        this.viewId = str2;
        this.type = productTypeDto;
        this.action = str3;
        this.icons = list;
        this.title = str4;
        this.titleColor = themes;
        this.productRightPart = productRightPartDto;
        this.spoilerParam = spoilerParamDto;
        this.background = productBackgroundDto;
        this.iconAfterTitle = themes2;
        this.a11y = productA11yDto;
        this.iconCornerRadius = num;
        this.skin = productSkinDto;
        this.productCaption = divDataDto;
    }
}
