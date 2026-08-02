package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.cache.ExpireableDto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0003\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0001\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0018\u00010\bHÆ\u0003J\u007f\u0010'\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\u0016\b\u0003\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0003\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV4Response;", "", "carousel", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductV2Dto;", "productType", "", "screenItems", "Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItemV2Dto;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "fullscreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nfcPayload", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "educationsV2", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;)V", "getCarousel", "()Ljava/util/List;", "getProductType", "()Ljava/lang/String;", "getScreenItems", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getFullscreens", "()Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;", "getNfcPayload", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "getEducationsV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardV4Response {
    private final List<CarouselProductV2Dto> carousel;
    private final DivDataDto commonDivData;
    private final ExpireableDto<List<EducationsV2Dto>> educationsV2;
    private final ExpireableDto<List<FullScreenDto>> fullscreens;
    private final NfcPayloadDto nfcPayload;
    private final String productType;
    private final List<ExpireableDto<ScreenItemV2Dto>> screenItems;

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardV4Response(@Json(name = "carousel") List<CarouselProductV2Dto> list, @Json(name = "product_type") String str, @Json(name = "screen_items") List<ExpireableDto<ScreenItemV2Dto>> list2, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "fullscreens") ExpireableDto<? extends List<FullScreenDto>> expireableDto, @Json(name = "nfc_payload") NfcPayloadDto nfcPayloadDto, @Json(name = "educations_v2") ExpireableDto<? extends List<EducationsV2Dto>> expireableDto2) {
        this.carousel = list;
        this.productType = str;
        this.screenItems = list2;
        this.commonDivData = divDataDto;
        this.fullscreens = expireableDto;
        this.nfcPayload = nfcPayloadDto;
        this.educationsV2 = expireableDto2;
    }

    public static /* synthetic */ DashboardV4Response copy$default(DashboardV4Response dashboardV4Response, List list, String str, List list2, DivDataDto divDataDto, ExpireableDto expireableDto, NfcPayloadDto nfcPayloadDto, ExpireableDto expireableDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dashboardV4Response.carousel;
        }
        if ((i & 2) != 0) {
            str = dashboardV4Response.productType;
        }
        if ((i & 4) != 0) {
            list2 = dashboardV4Response.screenItems;
        }
        if ((i & 8) != 0) {
            divDataDto = dashboardV4Response.commonDivData;
        }
        if ((i & 16) != 0) {
            expireableDto = dashboardV4Response.fullscreens;
        }
        if ((i & 32) != 0) {
            nfcPayloadDto = dashboardV4Response.nfcPayload;
        }
        if ((i & 64) != 0) {
            expireableDto2 = dashboardV4Response.educationsV2;
        }
        NfcPayloadDto nfcPayloadDto2 = nfcPayloadDto;
        ExpireableDto expireableDto3 = expireableDto2;
        ExpireableDto expireableDto4 = expireableDto;
        List list3 = list2;
        return dashboardV4Response.copy(list, str, list3, divDataDto, expireableDto4, nfcPayloadDto2, expireableDto3);
    }

    public final List<CarouselProductV2Dto> component1() {
        return this.carousel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final List<ExpireableDto<ScreenItemV2Dto>> component3() {
        return this.screenItems;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final ExpireableDto<List<FullScreenDto>> component5() {
        return this.fullscreens;
    }

    /* renamed from: component6, reason: from getter */
    public final NfcPayloadDto getNfcPayload() {
        return this.nfcPayload;
    }

    public final ExpireableDto<List<EducationsV2Dto>> component7() {
        return this.educationsV2;
    }

    public final DashboardV4Response copy(@Json(name = "carousel") List<CarouselProductV2Dto> carousel, @Json(name = "product_type") String productType, @Json(name = "screen_items") List<ExpireableDto<ScreenItemV2Dto>> screenItems, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "fullscreens") ExpireableDto<? extends List<FullScreenDto>> fullscreens, @Json(name = "nfc_payload") NfcPayloadDto nfcPayload, @Json(name = "educations_v2") ExpireableDto<? extends List<EducationsV2Dto>> educationsV2) {
        return new DashboardV4Response(carousel, productType, screenItems, commonDivData, fullscreens, nfcPayload, educationsV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardV4Response)) {
            return false;
        }
        DashboardV4Response dashboardV4Response = (DashboardV4Response) other;
        return jl40.l(this.carousel, dashboardV4Response.carousel) && jl40.l(this.productType, dashboardV4Response.productType) && jl40.l(this.screenItems, dashboardV4Response.screenItems) && jl40.l(this.commonDivData, dashboardV4Response.commonDivData) && jl40.l(this.fullscreens, dashboardV4Response.fullscreens) && jl40.l(this.nfcPayload, dashboardV4Response.nfcPayload) && jl40.l(this.educationsV2, dashboardV4Response.educationsV2);
    }

    public final List<CarouselProductV2Dto> getCarousel() {
        return this.carousel;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final ExpireableDto<List<EducationsV2Dto>> getEducationsV2() {
        return this.educationsV2;
    }

    public final ExpireableDto<List<FullScreenDto>> getFullscreens() {
        return this.fullscreens;
    }

    public final NfcPayloadDto getNfcPayload() {
        return this.nfcPayload;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final List<ExpireableDto<ScreenItemV2Dto>> getScreenItems() {
        return this.screenItems;
    }

    public int hashCode() {
        int hashCode = (this.commonDivData.hashCode() + unr0.c(unr0.b(this.carousel.hashCode() * 31, 31, this.productType), 31, this.screenItems)) * 31;
        ExpireableDto<List<FullScreenDto>> expireableDto = this.fullscreens;
        int hashCode2 = (hashCode + (expireableDto == null ? 0 : expireableDto.hashCode())) * 31;
        NfcPayloadDto nfcPayloadDto = this.nfcPayload;
        int hashCode3 = (hashCode2 + (nfcPayloadDto == null ? 0 : nfcPayloadDto.hashCode())) * 31;
        ExpireableDto<List<EducationsV2Dto>> expireableDto2 = this.educationsV2;
        return hashCode3 + (expireableDto2 != null ? expireableDto2.hashCode() : 0);
    }

    public String toString() {
        List<CarouselProductV2Dto> list = this.carousel;
        String str = this.productType;
        List<ExpireableDto<ScreenItemV2Dto>> list2 = this.screenItems;
        DivDataDto divDataDto = this.commonDivData;
        ExpireableDto<List<FullScreenDto>> expireableDto = this.fullscreens;
        NfcPayloadDto nfcPayloadDto = this.nfcPayload;
        ExpireableDto<List<EducationsV2Dto>> expireableDto2 = this.educationsV2;
        StringBuilder s = xvz.s("DashboardV4Response(carousel=", list, ", productType=", str, ", screenItems=");
        s.append(list2);
        s.append(", commonDivData=");
        s.append(divDataDto);
        s.append(", fullscreens=");
        s.append(expireableDto);
        s.append(", nfcPayload=");
        s.append(nfcPayloadDto);
        s.append(", educationsV2=");
        s.append(expireableDto2);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
