package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivCommonResponse;", "", "divData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "title", "", "subtitle", "toolbarDivData", "toolbarBackgroundColor", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "fullscreens", "", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "educationsV2", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/util/List;Ljava/util/List;)V", "getDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getToolbarDivData", "getToolbarBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getFullscreens", "()Ljava/util/List;", "getEducationsV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivCommonResponse {
    private final DivDataDto divData;
    private final List<EducationsV2Dto> educationsV2;
    private final List<FullScreenDto> fullscreens;
    private final String subtitle;
    private final String title;
    private final ThemedParameter<String> toolbarBackgroundColor;
    private final DivDataDto toolbarDivData;

    public DivCommonResponse(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "toolbar_divkit_data") DivDataDto divDataDto2, @Json(name = "toolbar_background_color") ThemedParameter<String> themedParameter, @Json(name = "fullscreens") List<FullScreenDto> list, @Json(name = "educations_v2") List<EducationsV2Dto> list2) {
        this.divData = divDataDto;
        this.title = str;
        this.subtitle = str2;
        this.toolbarDivData = divDataDto2;
        this.toolbarBackgroundColor = themedParameter;
        this.fullscreens = list;
        this.educationsV2 = list2;
    }

    public static /* synthetic */ DivCommonResponse copy$default(DivCommonResponse divCommonResponse, DivDataDto divDataDto, String str, String str2, DivDataDto divDataDto2, ThemedParameter themedParameter, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = divCommonResponse.divData;
        }
        if ((i & 2) != 0) {
            str = divCommonResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = divCommonResponse.subtitle;
        }
        if ((i & 8) != 0) {
            divDataDto2 = divCommonResponse.toolbarDivData;
        }
        if ((i & 16) != 0) {
            themedParameter = divCommonResponse.toolbarBackgroundColor;
        }
        if ((i & 32) != 0) {
            list = divCommonResponse.fullscreens;
        }
        if ((i & 64) != 0) {
            list2 = divCommonResponse.educationsV2;
        }
        List list3 = list;
        List list4 = list2;
        ThemedParameter themedParameter2 = themedParameter;
        String str3 = str2;
        return divCommonResponse.copy(divDataDto, str, str3, divDataDto2, themedParameter2, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivData() {
        return this.divData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getToolbarDivData() {
        return this.toolbarDivData;
    }

    public final ThemedParameter<String> component5() {
        return this.toolbarBackgroundColor;
    }

    public final List<FullScreenDto> component6() {
        return this.fullscreens;
    }

    public final List<EducationsV2Dto> component7() {
        return this.educationsV2;
    }

    public final DivCommonResponse copy(@Json(name = "divkit_data") DivDataDto divData, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "toolbar_divkit_data") DivDataDto toolbarDivData, @Json(name = "toolbar_background_color") ThemedParameter<String> toolbarBackgroundColor, @Json(name = "fullscreens") List<FullScreenDto> fullscreens, @Json(name = "educations_v2") List<EducationsV2Dto> educationsV2) {
        return new DivCommonResponse(divData, title, subtitle, toolbarDivData, toolbarBackgroundColor, fullscreens, educationsV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivCommonResponse)) {
            return false;
        }
        DivCommonResponse divCommonResponse = (DivCommonResponse) other;
        return jl40.l(this.divData, divCommonResponse.divData) && jl40.l(this.title, divCommonResponse.title) && jl40.l(this.subtitle, divCommonResponse.subtitle) && jl40.l(this.toolbarDivData, divCommonResponse.toolbarDivData) && jl40.l(this.toolbarBackgroundColor, divCommonResponse.toolbarBackgroundColor) && jl40.l(this.fullscreens, divCommonResponse.fullscreens) && jl40.l(this.educationsV2, divCommonResponse.educationsV2);
    }

    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final List<EducationsV2Dto> getEducationsV2() {
        return this.educationsV2;
    }

    public final List<FullScreenDto> getFullscreens() {
        return this.fullscreens;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedParameter<String> getToolbarBackgroundColor() {
        return this.toolbarBackgroundColor;
    }

    public final DivDataDto getToolbarDivData() {
        return this.toolbarDivData;
    }

    public int hashCode() {
        int hashCode = this.divData.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DivDataDto divDataDto = this.toolbarDivData;
        int hashCode4 = (hashCode3 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.toolbarBackgroundColor;
        int hashCode5 = (hashCode4 + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31;
        List<FullScreenDto> list = this.fullscreens;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<EducationsV2Dto> list2 = this.educationsV2;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        DivDataDto divDataDto = this.divData;
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto2 = this.toolbarDivData;
        ThemedParameter<String> themedParameter = this.toolbarBackgroundColor;
        List<FullScreenDto> list = this.fullscreens;
        List<EducationsV2Dto> list2 = this.educationsV2;
        StringBuilder sb = new StringBuilder("DivCommonResponse(divData=");
        sb.append(divDataDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", toolbarDivData=");
        sb.append(divDataDto2);
        sb.append(", toolbarBackgroundColor=");
        sb.append(themedParameter);
        sb.append(", fullscreens=");
        sb.append(list);
        sb.append(", educationsV2=");
        return ly3.s(sb, list2, Extension.C_BRAKE);
    }
}
