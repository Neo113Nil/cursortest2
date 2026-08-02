package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0003Jm\u0010%\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;", "", "carousel", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductDto;", "productType", "", "screenItems", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItem;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "fullscreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nfcPayload", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "educationsV2", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;Ljava/util/List;)V", "getCarousel", "()Ljava/util/List;", "getProductType", "()Ljava/lang/String;", "getScreenItems", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getFullscreens", "getNfcPayload", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "getEducationsV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardV3Response {
    private final List<CarouselProductDto> carousel;
    private final DivDataDto commonDivData;
    private final List<EducationsV2Dto> educationsV2;
    private final List<FullScreenDto> fullscreens;
    private final NfcPayloadDto nfcPayload;
    private final String productType;
    private final List<ScreenItem> screenItems;

    public DashboardV3Response(@Json(name = "carousel") List<CarouselProductDto> list, @Json(name = "product_type") String str, @Json(name = "screen_items") List<ScreenItem> list2, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "fullscreens") List<FullScreenDto> list3, @Json(name = "nfc_payload") NfcPayloadDto nfcPayloadDto, @Json(name = "educations_v2") List<EducationsV2Dto> list4) {
        this.carousel = list;
        this.productType = str;
        this.screenItems = list2;
        this.commonDivData = divDataDto;
        this.fullscreens = list3;
        this.nfcPayload = nfcPayloadDto;
        this.educationsV2 = list4;
    }

    public static /* synthetic */ DashboardV3Response copy$default(DashboardV3Response dashboardV3Response, List list, String str, List list2, DivDataDto divDataDto, List list3, NfcPayloadDto nfcPayloadDto, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dashboardV3Response.carousel;
        }
        if ((i & 2) != 0) {
            str = dashboardV3Response.productType;
        }
        if ((i & 4) != 0) {
            list2 = dashboardV3Response.screenItems;
        }
        if ((i & 8) != 0) {
            divDataDto = dashboardV3Response.commonDivData;
        }
        if ((i & 16) != 0) {
            list3 = dashboardV3Response.fullscreens;
        }
        if ((i & 32) != 0) {
            nfcPayloadDto = dashboardV3Response.nfcPayload;
        }
        if ((i & 64) != 0) {
            list4 = dashboardV3Response.educationsV2;
        }
        NfcPayloadDto nfcPayloadDto2 = nfcPayloadDto;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        return dashboardV3Response.copy(list, str, list7, divDataDto, list6, nfcPayloadDto2, list5);
    }

    public final List<CarouselProductDto> component1() {
        return this.carousel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final List<ScreenItem> component3() {
        return this.screenItems;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<FullScreenDto> component5() {
        return this.fullscreens;
    }

    /* renamed from: component6, reason: from getter */
    public final NfcPayloadDto getNfcPayload() {
        return this.nfcPayload;
    }

    public final List<EducationsV2Dto> component7() {
        return this.educationsV2;
    }

    public final DashboardV3Response copy(@Json(name = "carousel") List<CarouselProductDto> carousel, @Json(name = "product_type") String productType, @Json(name = "screen_items") List<ScreenItem> screenItems, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "fullscreens") List<FullScreenDto> fullscreens, @Json(name = "nfc_payload") NfcPayloadDto nfcPayload, @Json(name = "educations_v2") List<EducationsV2Dto> educationsV2) {
        return new DashboardV3Response(carousel, productType, screenItems, commonDivData, fullscreens, nfcPayload, educationsV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardV3Response)) {
            return false;
        }
        DashboardV3Response dashboardV3Response = (DashboardV3Response) other;
        return jl40.l(this.carousel, dashboardV3Response.carousel) && jl40.l(this.productType, dashboardV3Response.productType) && jl40.l(this.screenItems, dashboardV3Response.screenItems) && jl40.l(this.commonDivData, dashboardV3Response.commonDivData) && jl40.l(this.fullscreens, dashboardV3Response.fullscreens) && jl40.l(this.nfcPayload, dashboardV3Response.nfcPayload) && jl40.l(this.educationsV2, dashboardV3Response.educationsV2);
    }

    public final List<CarouselProductDto> getCarousel() {
        return this.carousel;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<EducationsV2Dto> getEducationsV2() {
        return this.educationsV2;
    }

    public final List<FullScreenDto> getFullscreens() {
        return this.fullscreens;
    }

    public final NfcPayloadDto getNfcPayload() {
        return this.nfcPayload;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final List<ScreenItem> getScreenItems() {
        return this.screenItems;
    }

    public int hashCode() {
        int hashCode = (this.commonDivData.hashCode() + unr0.c(unr0.b(this.carousel.hashCode() * 31, 31, this.productType), 31, this.screenItems)) * 31;
        List<FullScreenDto> list = this.fullscreens;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NfcPayloadDto nfcPayloadDto = this.nfcPayload;
        int hashCode3 = (hashCode2 + (nfcPayloadDto == null ? 0 : nfcPayloadDto.hashCode())) * 31;
        List<EducationsV2Dto> list2 = this.educationsV2;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        List<CarouselProductDto> list = this.carousel;
        String str = this.productType;
        List<ScreenItem> list2 = this.screenItems;
        DivDataDto divDataDto = this.commonDivData;
        List<FullScreenDto> list3 = this.fullscreens;
        NfcPayloadDto nfcPayloadDto = this.nfcPayload;
        List<EducationsV2Dto> list4 = this.educationsV2;
        StringBuilder s = xvz.s("DashboardV3Response(carousel=", list, ", productType=", str, ", screenItems=");
        s.append(list2);
        s.append(", commonDivData=");
        s.append(divDataDto);
        s.append(", fullscreens=");
        s.append(list3);
        s.append(", nfcPayload=");
        s.append(nfcPayloadDto);
        s.append(", educationsV2=");
        return ly3.s(s, list4, Extension.C_BRAKE);
    }
}
