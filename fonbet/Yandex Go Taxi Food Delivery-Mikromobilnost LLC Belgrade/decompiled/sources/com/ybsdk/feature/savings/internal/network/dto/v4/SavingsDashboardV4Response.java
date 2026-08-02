package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.savings.internal.network.dto.DivkitWidgetDto;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010HÆ\u0003Js\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4Response;", "", "headerInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4;", "layout", "", "", "divWidgets", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "educations", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "shelves", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsShelfDtoV4;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getHeaderInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4;", "getLayout", "()Ljava/util/List;", "getDivWidgets", "getEducations", "getShelves", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsDashboardV4Response {

    @Json(name = "background_color")
    private final ThemedParameter<String> backgroundColor;

    @Json(name = "common_div_data")
    private final DivDataDto commonDivData;

    @Json(name = "divkit_widgets")
    private final List<DivkitWidgetDto> divWidgets;

    @Json(name = "educations_v2")
    private final List<EducationsV2Dto> educations;

    @Json(name = "header_info")
    private final SavingsAccountsHeaderInfoDtoV4 headerInfo;

    @Json(name = "layout")
    private final List<String> layout;

    @Json(name = "shelves")
    private final List<SavingsShelfDtoV4> shelves;

    public SavingsDashboardV4Response(SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4, List<String> list, List<DivkitWidgetDto> list2, List<EducationsV2Dto> list3, List<SavingsShelfDtoV4> list4, DivDataDto divDataDto, ThemedParameter<String> themedParameter) {
        this.headerInfo = savingsAccountsHeaderInfoDtoV4;
        this.layout = list;
        this.divWidgets = list2;
        this.educations = list3;
        this.shelves = list4;
        this.commonDivData = divDataDto;
        this.backgroundColor = themedParameter;
    }

    public static /* synthetic */ SavingsDashboardV4Response copy$default(SavingsDashboardV4Response savingsDashboardV4Response, SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4, List list, List list2, List list3, List list4, DivDataDto divDataDto, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            savingsAccountsHeaderInfoDtoV4 = savingsDashboardV4Response.headerInfo;
        }
        if ((i & 2) != 0) {
            list = savingsDashboardV4Response.layout;
        }
        if ((i & 4) != 0) {
            list2 = savingsDashboardV4Response.divWidgets;
        }
        if ((i & 8) != 0) {
            list3 = savingsDashboardV4Response.educations;
        }
        if ((i & 16) != 0) {
            list4 = savingsDashboardV4Response.shelves;
        }
        if ((i & 32) != 0) {
            divDataDto = savingsDashboardV4Response.commonDivData;
        }
        if ((i & 64) != 0) {
            themedParameter = savingsDashboardV4Response.backgroundColor;
        }
        DivDataDto divDataDto2 = divDataDto;
        ThemedParameter themedParameter2 = themedParameter;
        List list5 = list4;
        List list6 = list2;
        return savingsDashboardV4Response.copy(savingsAccountsHeaderInfoDtoV4, list, list6, list3, list5, divDataDto2, themedParameter2);
    }

    /* renamed from: component1, reason: from getter */
    public final SavingsAccountsHeaderInfoDtoV4 getHeaderInfo() {
        return this.headerInfo;
    }

    public final List<String> component2() {
        return this.layout;
    }

    public final List<DivkitWidgetDto> component3() {
        return this.divWidgets;
    }

    public final List<EducationsV2Dto> component4() {
        return this.educations;
    }

    public final List<SavingsShelfDtoV4> component5() {
        return this.shelves;
    }

    /* renamed from: component6, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final ThemedParameter<String> component7() {
        return this.backgroundColor;
    }

    public final SavingsDashboardV4Response copy(SavingsAccountsHeaderInfoDtoV4 headerInfo, List<String> layout, List<DivkitWidgetDto> divWidgets, List<EducationsV2Dto> educations, List<SavingsShelfDtoV4> shelves, DivDataDto commonDivData, ThemedParameter<String> backgroundColor) {
        return new SavingsDashboardV4Response(headerInfo, layout, divWidgets, educations, shelves, commonDivData, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsDashboardV4Response)) {
            return false;
        }
        SavingsDashboardV4Response savingsDashboardV4Response = (SavingsDashboardV4Response) other;
        return jl40.l(this.headerInfo, savingsDashboardV4Response.headerInfo) && jl40.l(this.layout, savingsDashboardV4Response.layout) && jl40.l(this.divWidgets, savingsDashboardV4Response.divWidgets) && jl40.l(this.educations, savingsDashboardV4Response.educations) && jl40.l(this.shelves, savingsDashboardV4Response.shelves) && jl40.l(this.commonDivData, savingsDashboardV4Response.commonDivData) && jl40.l(this.backgroundColor, savingsDashboardV4Response.backgroundColor);
    }

    public final ThemedParameter<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<DivkitWidgetDto> getDivWidgets() {
        return this.divWidgets;
    }

    public final List<EducationsV2Dto> getEducations() {
        return this.educations;
    }

    public final SavingsAccountsHeaderInfoDtoV4 getHeaderInfo() {
        return this.headerInfo;
    }

    public final List<String> getLayout() {
        return this.layout;
    }

    public final List<SavingsShelfDtoV4> getShelves() {
        return this.shelves;
    }

    public int hashCode() {
        int c = unr0.c(unr0.c(this.headerInfo.hashCode() * 31, 31, this.layout), 31, this.divWidgets);
        List<EducationsV2Dto> list = this.educations;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        List<SavingsShelfDtoV4> list2 = this.shelves;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        DivDataDto divDataDto = this.commonDivData;
        return this.backgroundColor.hashCode() + ((hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4 = this.headerInfo;
        List<String> list = this.layout;
        List<DivkitWidgetDto> list2 = this.divWidgets;
        List<EducationsV2Dto> list3 = this.educations;
        List<SavingsShelfDtoV4> list4 = this.shelves;
        DivDataDto divDataDto = this.commonDivData;
        ThemedParameter<String> themedParameter = this.backgroundColor;
        StringBuilder sb = new StringBuilder("SavingsDashboardV4Response(headerInfo=");
        sb.append(savingsAccountsHeaderInfoDtoV4);
        sb.append(", layout=");
        sb.append(list);
        sb.append(", divWidgets=");
        nnm.w(sb, list2, ", educations=", list3, ", shelves=");
        sb.append(list4);
        sb.append(", commonDivData=");
        sb.append(divDataDto);
        sb.append(", backgroundColor=");
        sb.append(themedParameter);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
