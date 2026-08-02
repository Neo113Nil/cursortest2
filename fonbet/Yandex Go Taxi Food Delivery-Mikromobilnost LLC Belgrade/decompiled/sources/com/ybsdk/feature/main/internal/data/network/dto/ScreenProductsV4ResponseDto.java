package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import com.ybsdk.core.common.data.network.dto.ProductSkinV4Dto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipDto;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0003J\u008b\u0001\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDto;", "", "quickActionsHeader", "Lcom/ybsdk/feature/main/internal/data/network/dto/QuickActionsHeaderDto;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "screenItems", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductScreenItemDto;", "fullScreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "divUserInfoBlock", "educationsV2", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "smallTooltips", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "productsSkins", "", "", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinV4Dto;", "<init>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/QuickActionsHeaderDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getQuickActionsHeader", "()Lcom/ybsdk/feature/main/internal/data/network/dto/QuickActionsHeaderDto;", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getScreenItems", "()Ljava/util/List;", "getFullScreens", "getDivUserInfoBlock", "getEducationsV2", "getSmallTooltips", "getProductsSkins", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenProductsV4ResponseDto {
    private final DivDataDto commonDivData;
    private final DivDataDto divUserInfoBlock;
    private final List<EducationsV2Dto> educationsV2;
    private final List<FullScreenDto> fullScreens;
    private final Map<String, ProductSkinV4Dto> productsSkins;
    private final QuickActionsHeaderDto quickActionsHeader;
    private final List<ProductScreenItemDto> screenItems;
    private final List<ServerTooltipDto> smallTooltips;

    public ScreenProductsV4ResponseDto(@Json(name = "quick_actions_header") QuickActionsHeaderDto quickActionsHeaderDto, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "screen_items") @SkipFailingElements List<ProductScreenItemDto> list, @Json(name = "fullscreens") List<FullScreenDto> list2, @Json(name = "div_user_info_block") DivDataDto divDataDto2, @Json(name = "educations_v2") List<EducationsV2Dto> list3, @Json(name = "small_tooltips") List<ServerTooltipDto> list4, @Json(name = "products_skins") Map<String, ProductSkinV4Dto> map) {
        this.quickActionsHeader = quickActionsHeaderDto;
        this.commonDivData = divDataDto;
        this.screenItems = list;
        this.fullScreens = list2;
        this.divUserInfoBlock = divDataDto2;
        this.educationsV2 = list3;
        this.smallTooltips = list4;
        this.productsSkins = map;
    }

    public static /* synthetic */ ScreenProductsV4ResponseDto copy$default(ScreenProductsV4ResponseDto screenProductsV4ResponseDto, QuickActionsHeaderDto quickActionsHeaderDto, DivDataDto divDataDto, List list, List list2, DivDataDto divDataDto2, List list3, List list4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            quickActionsHeaderDto = screenProductsV4ResponseDto.quickActionsHeader;
        }
        if ((i & 2) != 0) {
            divDataDto = screenProductsV4ResponseDto.commonDivData;
        }
        if ((i & 4) != 0) {
            list = screenProductsV4ResponseDto.screenItems;
        }
        if ((i & 8) != 0) {
            list2 = screenProductsV4ResponseDto.fullScreens;
        }
        if ((i & 16) != 0) {
            divDataDto2 = screenProductsV4ResponseDto.divUserInfoBlock;
        }
        if ((i & 32) != 0) {
            list3 = screenProductsV4ResponseDto.educationsV2;
        }
        if ((i & 64) != 0) {
            list4 = screenProductsV4ResponseDto.smallTooltips;
        }
        if ((i & 128) != 0) {
            map = screenProductsV4ResponseDto.productsSkins;
        }
        List list5 = list4;
        Map map2 = map;
        DivDataDto divDataDto3 = divDataDto2;
        List list6 = list3;
        return screenProductsV4ResponseDto.copy(quickActionsHeaderDto, divDataDto, list, list2, divDataDto3, list6, list5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final QuickActionsHeaderDto getQuickActionsHeader() {
        return this.quickActionsHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<ProductScreenItemDto> component3() {
        return this.screenItems;
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

    public final Map<String, ProductSkinV4Dto> component8() {
        return this.productsSkins;
    }

    public final ScreenProductsV4ResponseDto copy(@Json(name = "quick_actions_header") QuickActionsHeaderDto quickActionsHeader, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "screen_items") @SkipFailingElements List<ProductScreenItemDto> screenItems, @Json(name = "fullscreens") List<FullScreenDto> fullScreens, @Json(name = "div_user_info_block") DivDataDto divUserInfoBlock, @Json(name = "educations_v2") List<EducationsV2Dto> educationsV2, @Json(name = "small_tooltips") List<ServerTooltipDto> smallTooltips, @Json(name = "products_skins") Map<String, ProductSkinV4Dto> productsSkins) {
        return new ScreenProductsV4ResponseDto(quickActionsHeader, commonDivData, screenItems, fullScreens, divUserInfoBlock, educationsV2, smallTooltips, productsSkins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenProductsV4ResponseDto)) {
            return false;
        }
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto = (ScreenProductsV4ResponseDto) other;
        return jl40.l(this.quickActionsHeader, screenProductsV4ResponseDto.quickActionsHeader) && jl40.l(this.commonDivData, screenProductsV4ResponseDto.commonDivData) && jl40.l(this.screenItems, screenProductsV4ResponseDto.screenItems) && jl40.l(this.fullScreens, screenProductsV4ResponseDto.fullScreens) && jl40.l(this.divUserInfoBlock, screenProductsV4ResponseDto.divUserInfoBlock) && jl40.l(this.educationsV2, screenProductsV4ResponseDto.educationsV2) && jl40.l(this.smallTooltips, screenProductsV4ResponseDto.smallTooltips) && jl40.l(this.productsSkins, screenProductsV4ResponseDto.productsSkins);
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

    public final Map<String, ProductSkinV4Dto> getProductsSkins() {
        return this.productsSkins;
    }

    public final QuickActionsHeaderDto getQuickActionsHeader() {
        return this.quickActionsHeader;
    }

    public final List<ProductScreenItemDto> getScreenItems() {
        return this.screenItems;
    }

    public final List<ServerTooltipDto> getSmallTooltips() {
        return this.smallTooltips;
    }

    public int hashCode() {
        QuickActionsHeaderDto quickActionsHeaderDto = this.quickActionsHeader;
        int hashCode = (quickActionsHeaderDto == null ? 0 : quickActionsHeaderDto.hashCode()) * 31;
        DivDataDto divDataDto = this.commonDivData;
        int c = unr0.c((hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31, 31, this.screenItems);
        List<FullScreenDto> list = this.fullScreens;
        int hashCode2 = (c + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto2 = this.divUserInfoBlock;
        int hashCode3 = (hashCode2 + (divDataDto2 == null ? 0 : divDataDto2.hashCode())) * 31;
        List<EducationsV2Dto> list2 = this.educationsV2;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ServerTooltipDto> list3 = this.smallTooltips;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, ProductSkinV4Dto> map = this.productsSkins;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        QuickActionsHeaderDto quickActionsHeaderDto = this.quickActionsHeader;
        DivDataDto divDataDto = this.commonDivData;
        List<ProductScreenItemDto> list = this.screenItems;
        List<FullScreenDto> list2 = this.fullScreens;
        DivDataDto divDataDto2 = this.divUserInfoBlock;
        List<EducationsV2Dto> list3 = this.educationsV2;
        List<ServerTooltipDto> list4 = this.smallTooltips;
        Map<String, ProductSkinV4Dto> map = this.productsSkins;
        StringBuilder sb = new StringBuilder("ScreenProductsV4ResponseDto(quickActionsHeader=");
        sb.append(quickActionsHeaderDto);
        sb.append(", commonDivData=");
        sb.append(divDataDto);
        sb.append(", screenItems=");
        nnm.w(sb, list, ", fullScreens=", list2, ", divUserInfoBlock=");
        sb.append(divDataDto2);
        sb.append(", educationsV2=");
        sb.append(list3);
        sb.append(", smallTooltips=");
        sb.append(list4);
        sb.append(", productsSkins=");
        sb.append(map);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
