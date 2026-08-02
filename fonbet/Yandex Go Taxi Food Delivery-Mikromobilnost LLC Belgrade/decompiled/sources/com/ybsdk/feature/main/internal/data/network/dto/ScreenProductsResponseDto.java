package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipDto;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0088\u0001\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsResponseDto;", "", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "screenItems", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductScreenItemDto;", "products", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductDto;", "fullScreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "divUserInfoBlock", "educationsV2", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "smallTooltips", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "areProductsSorted", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getScreenItems", "()Ljava/util/List;", "getProducts", "getFullScreens", "getDivUserInfoBlock", "getEducationsV2", "getSmallTooltips", "getAreProductsSorted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsResponseDto;", "equals", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenProductsResponseDto {
    private final Boolean areProductsSorted;
    private final DivDataDto commonDivData;
    private final DivDataDto divUserInfoBlock;
    private final List<EducationsV2Dto> educationsV2;
    private final List<FullScreenDto> fullScreens;
    private final List<ProductDto> products;
    private final List<ProductScreenItemDto> screenItems;
    private final List<ServerTooltipDto> smallTooltips;

    public ScreenProductsResponseDto(@Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "screen_items") @SkipFailingElements List<ProductScreenItemDto> list, @Json(name = "products") @SkipFailingElements List<ProductDto> list2, @Json(name = "fullscreens") List<FullScreenDto> list3, @Json(name = "div_user_info_block") DivDataDto divDataDto2, @Json(name = "educations_v2") List<EducationsV2Dto> list4, @Json(name = "small_tooltips") List<ServerTooltipDto> list5, @Json(name = "are_products_sorted") Boolean bool) {
        this.commonDivData = divDataDto;
        this.screenItems = list;
        this.products = list2;
        this.fullScreens = list3;
        this.divUserInfoBlock = divDataDto2;
        this.educationsV2 = list4;
        this.smallTooltips = list5;
        this.areProductsSorted = bool;
    }

    public static /* synthetic */ ScreenProductsResponseDto copy$default(ScreenProductsResponseDto screenProductsResponseDto, DivDataDto divDataDto, List list, List list2, List list3, DivDataDto divDataDto2, List list4, List list5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = screenProductsResponseDto.commonDivData;
        }
        if ((i & 2) != 0) {
            list = screenProductsResponseDto.screenItems;
        }
        if ((i & 4) != 0) {
            list2 = screenProductsResponseDto.products;
        }
        if ((i & 8) != 0) {
            list3 = screenProductsResponseDto.fullScreens;
        }
        if ((i & 16) != 0) {
            divDataDto2 = screenProductsResponseDto.divUserInfoBlock;
        }
        if ((i & 32) != 0) {
            list4 = screenProductsResponseDto.educationsV2;
        }
        if ((i & 64) != 0) {
            list5 = screenProductsResponseDto.smallTooltips;
        }
        if ((i & 128) != 0) {
            bool = screenProductsResponseDto.areProductsSorted;
        }
        List list6 = list5;
        Boolean bool2 = bool;
        DivDataDto divDataDto3 = divDataDto2;
        List list7 = list4;
        return screenProductsResponseDto.copy(divDataDto, list, list2, list3, divDataDto3, list7, list6, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<ProductScreenItemDto> component2() {
        return this.screenItems;
    }

    public final List<ProductDto> component3() {
        return this.products;
    }

    public final List<FullScreenDto> component4() {
        return this.fullScreens;
    }

    /* renamed from: component5, reason: from getter */
    public final DivDataDto getDivUserInfoBlock() {
        return this.divUserInfoBlock;
    }

    public final List<EducationsV2Dto> component6() {
        return this.educationsV2;
    }

    public final List<ServerTooltipDto> component7() {
        return this.smallTooltips;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getAreProductsSorted() {
        return this.areProductsSorted;
    }

    public final ScreenProductsResponseDto copy(@Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "screen_items") @SkipFailingElements List<ProductScreenItemDto> screenItems, @Json(name = "products") @SkipFailingElements List<ProductDto> products, @Json(name = "fullscreens") List<FullScreenDto> fullScreens, @Json(name = "div_user_info_block") DivDataDto divUserInfoBlock, @Json(name = "educations_v2") List<EducationsV2Dto> educationsV2, @Json(name = "small_tooltips") List<ServerTooltipDto> smallTooltips, @Json(name = "are_products_sorted") Boolean areProductsSorted) {
        return new ScreenProductsResponseDto(commonDivData, screenItems, products, fullScreens, divUserInfoBlock, educationsV2, smallTooltips, areProductsSorted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenProductsResponseDto)) {
            return false;
        }
        ScreenProductsResponseDto screenProductsResponseDto = (ScreenProductsResponseDto) other;
        return jl40.l(this.commonDivData, screenProductsResponseDto.commonDivData) && jl40.l(this.screenItems, screenProductsResponseDto.screenItems) && jl40.l(this.products, screenProductsResponseDto.products) && jl40.l(this.fullScreens, screenProductsResponseDto.fullScreens) && jl40.l(this.divUserInfoBlock, screenProductsResponseDto.divUserInfoBlock) && jl40.l(this.educationsV2, screenProductsResponseDto.educationsV2) && jl40.l(this.smallTooltips, screenProductsResponseDto.smallTooltips) && jl40.l(this.areProductsSorted, screenProductsResponseDto.areProductsSorted);
    }

    public final Boolean getAreProductsSorted() {
        return this.areProductsSorted;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final DivDataDto getDivUserInfoBlock() {
        return this.divUserInfoBlock;
    }

    public final List<EducationsV2Dto> getEducationsV2() {
        return this.educationsV2;
    }

    public final List<FullScreenDto> getFullScreens() {
        return this.fullScreens;
    }

    public final List<ProductDto> getProducts() {
        return this.products;
    }

    public final List<ProductScreenItemDto> getScreenItems() {
        return this.screenItems;
    }

    public final List<ServerTooltipDto> getSmallTooltips() {
        return this.smallTooltips;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.commonDivData;
        int c = unr0.c(unr0.c((divDataDto == null ? 0 : divDataDto.hashCode()) * 31, 31, this.screenItems), 31, this.products);
        List<FullScreenDto> list = this.fullScreens;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto2 = this.divUserInfoBlock;
        int hashCode2 = (hashCode + (divDataDto2 == null ? 0 : divDataDto2.hashCode())) * 31;
        List<EducationsV2Dto> list2 = this.educationsV2;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ServerTooltipDto> list3 = this.smallTooltips;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.areProductsSorted;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        DivDataDto divDataDto = this.commonDivData;
        List<ProductScreenItemDto> list = this.screenItems;
        List<ProductDto> list2 = this.products;
        List<FullScreenDto> list3 = this.fullScreens;
        DivDataDto divDataDto2 = this.divUserInfoBlock;
        List<EducationsV2Dto> list4 = this.educationsV2;
        List<ServerTooltipDto> list5 = this.smallTooltips;
        Boolean bool = this.areProductsSorted;
        StringBuilder sb = new StringBuilder("ScreenProductsResponseDto(commonDivData=");
        sb.append(divDataDto);
        sb.append(", screenItems=");
        sb.append(list);
        sb.append(", products=");
        nnm.w(sb, list2, ", fullScreens=", list3, ", divUserInfoBlock=");
        sb.append(divDataDto2);
        sb.append(", educationsV2=");
        sb.append(list4);
        sb.append(", smallTooltips=");
        sb.append(list5);
        sb.append(", areProductsSorted=");
        sb.append(bool);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
