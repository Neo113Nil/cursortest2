package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "error", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupErrorDto;", "availableOptions", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupOptionDto;", "selectedOption", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "summary", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "limitsData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupErrorDto;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "getError", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupErrorDto;", "getAvailableOptions", "()Ljava/util/List;", "getSelectedOption", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "getSummary", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "getLimitsData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutotopupDataDto {
    private final List<RegularAutotopupOptionDto> availableOptions;
    private final RegularAutotopupErrorDto error;
    private final RegularAutotopupLimitsDataDto limitsData;
    private final SelectedRegularAutotopupOptionDto selectedOption;
    private final RegularAutotopupStatusDto status;
    private final AutotopupWidgetSummaryDto summary;

    public RegularAutotopupDataDto(@Json(name = "status") RegularAutotopupStatusDto regularAutotopupStatusDto, @Json(name = "error") RegularAutotopupErrorDto regularAutotopupErrorDto, @Json(name = "available_autotopup_options") List<RegularAutotopupOptionDto> list, @Json(name = "selected_autotopup_option") SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto, @Json(name = "summary") AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, @Json(name = "limits_data") RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto) {
        this.status = regularAutotopupStatusDto;
        this.error = regularAutotopupErrorDto;
        this.availableOptions = list;
        this.selectedOption = selectedRegularAutotopupOptionDto;
        this.summary = autotopupWidgetSummaryDto;
        this.limitsData = regularAutotopupLimitsDataDto;
    }

    public static /* synthetic */ RegularAutotopupDataDto copy$default(RegularAutotopupDataDto regularAutotopupDataDto, RegularAutotopupStatusDto regularAutotopupStatusDto, RegularAutotopupErrorDto regularAutotopupErrorDto, List list, SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto, AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupStatusDto = regularAutotopupDataDto.status;
        }
        if ((i & 2) != 0) {
            regularAutotopupErrorDto = regularAutotopupDataDto.error;
        }
        if ((i & 4) != 0) {
            list = regularAutotopupDataDto.availableOptions;
        }
        if ((i & 8) != 0) {
            selectedRegularAutotopupOptionDto = regularAutotopupDataDto.selectedOption;
        }
        if ((i & 16) != 0) {
            autotopupWidgetSummaryDto = regularAutotopupDataDto.summary;
        }
        if ((i & 32) != 0) {
            regularAutotopupLimitsDataDto = regularAutotopupDataDto.limitsData;
        }
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto2 = autotopupWidgetSummaryDto;
        RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto2 = regularAutotopupLimitsDataDto;
        return regularAutotopupDataDto.copy(regularAutotopupStatusDto, regularAutotopupErrorDto, list, selectedRegularAutotopupOptionDto, autotopupWidgetSummaryDto2, regularAutotopupLimitsDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final RegularAutotopupErrorDto getError() {
        return this.error;
    }

    public final List<RegularAutotopupOptionDto> component3() {
        return this.availableOptions;
    }

    /* renamed from: component4, reason: from getter */
    public final SelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    /* renamed from: component5, reason: from getter */
    public final AutotopupWidgetSummaryDto getSummary() {
        return this.summary;
    }

    /* renamed from: component6, reason: from getter */
    public final RegularAutotopupLimitsDataDto getLimitsData() {
        return this.limitsData;
    }

    public final RegularAutotopupDataDto copy(@Json(name = "status") RegularAutotopupStatusDto status, @Json(name = "error") RegularAutotopupErrorDto error, @Json(name = "available_autotopup_options") List<RegularAutotopupOptionDto> availableOptions, @Json(name = "selected_autotopup_option") SelectedRegularAutotopupOptionDto selectedOption, @Json(name = "summary") AutotopupWidgetSummaryDto summary, @Json(name = "limits_data") RegularAutotopupLimitsDataDto limitsData) {
        return new RegularAutotopupDataDto(status, error, availableOptions, selectedOption, summary, limitsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutotopupDataDto)) {
            return false;
        }
        RegularAutotopupDataDto regularAutotopupDataDto = (RegularAutotopupDataDto) other;
        return this.status == regularAutotopupDataDto.status && jl40.l(this.error, regularAutotopupDataDto.error) && jl40.l(this.availableOptions, regularAutotopupDataDto.availableOptions) && jl40.l(this.selectedOption, regularAutotopupDataDto.selectedOption) && jl40.l(this.summary, regularAutotopupDataDto.summary) && jl40.l(this.limitsData, regularAutotopupDataDto.limitsData);
    }

    public final List<RegularAutotopupOptionDto> getAvailableOptions() {
        return this.availableOptions;
    }

    public final RegularAutotopupErrorDto getError() {
        return this.error;
    }

    public final RegularAutotopupLimitsDataDto getLimitsData() {
        return this.limitsData;
    }

    public final SelectedRegularAutotopupOptionDto getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupStatusDto getStatus() {
        return this.status;
    }

    public final AutotopupWidgetSummaryDto getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        RegularAutotopupErrorDto regularAutotopupErrorDto = this.error;
        int hashCode2 = (this.selectedOption.hashCode() + unr0.c((hashCode + (regularAutotopupErrorDto == null ? 0 : regularAutotopupErrorDto.hashCode())) * 31, 31, this.availableOptions)) * 31;
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto = this.summary;
        return this.limitsData.hashCode() + ((hashCode2 + (autotopupWidgetSummaryDto != null ? autotopupWidgetSummaryDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "RegularAutotopupDataDto(status=" + this.status + ", error=" + this.error + ", availableOptions=" + this.availableOptions + ", selectedOption=" + this.selectedOption + ", summary=" + this.summary + ", limitsData=" + this.limitsData + Extension.C_BRAKE;
    }
}
