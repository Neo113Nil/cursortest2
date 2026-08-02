package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.AutotopupWidgetSummaryDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "summary", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "topDivkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "availableRoundingOption", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingOptionDto;", "selectedRoundingStep", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingOptionDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "getSummary", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "getTopDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getAvailableRoundingOption", "()Ljava/util/List;", "getSelectedRoundingStep", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingOptionDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundingSettingsData {
    private final List<RoundingOptionDto> availableRoundingOption;
    private final RoundingOptionDto selectedRoundingStep;
    private final RoundingStatusDto status;
    private final AutotopupWidgetSummaryDto summary;
    private final DivDataDto topDivkitWidget;

    public RoundingSettingsData(@Json(name = "status") RoundingStatusDto roundingStatusDto, @Json(name = "summary") AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, @Json(name = "top_divkit_widget") DivDataDto divDataDto, @Json(name = "available_rounding_steps") List<RoundingOptionDto> list, @Json(name = "selected_rounding_step") RoundingOptionDto roundingOptionDto) {
        this.status = roundingStatusDto;
        this.summary = autotopupWidgetSummaryDto;
        this.topDivkitWidget = divDataDto;
        this.availableRoundingOption = list;
        this.selectedRoundingStep = roundingOptionDto;
    }

    public static /* synthetic */ RoundingSettingsData copy$default(RoundingSettingsData roundingSettingsData, RoundingStatusDto roundingStatusDto, AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, DivDataDto divDataDto, List list, RoundingOptionDto roundingOptionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            roundingStatusDto = roundingSettingsData.status;
        }
        if ((i & 2) != 0) {
            autotopupWidgetSummaryDto = roundingSettingsData.summary;
        }
        if ((i & 4) != 0) {
            divDataDto = roundingSettingsData.topDivkitWidget;
        }
        if ((i & 8) != 0) {
            list = roundingSettingsData.availableRoundingOption;
        }
        if ((i & 16) != 0) {
            roundingOptionDto = roundingSettingsData.selectedRoundingStep;
        }
        RoundingOptionDto roundingOptionDto2 = roundingOptionDto;
        DivDataDto divDataDto2 = divDataDto;
        return roundingSettingsData.copy(roundingStatusDto, autotopupWidgetSummaryDto, divDataDto2, list, roundingOptionDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final RoundingStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final AutotopupWidgetSummaryDto getSummary() {
        return this.summary;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getTopDivkitWidget() {
        return this.topDivkitWidget;
    }

    public final List<RoundingOptionDto> component4() {
        return this.availableRoundingOption;
    }

    /* renamed from: component5, reason: from getter */
    public final RoundingOptionDto getSelectedRoundingStep() {
        return this.selectedRoundingStep;
    }

    public final RoundingSettingsData copy(@Json(name = "status") RoundingStatusDto status, @Json(name = "summary") AutotopupWidgetSummaryDto summary, @Json(name = "top_divkit_widget") DivDataDto topDivkitWidget, @Json(name = "available_rounding_steps") List<RoundingOptionDto> availableRoundingOption, @Json(name = "selected_rounding_step") RoundingOptionDto selectedRoundingStep) {
        return new RoundingSettingsData(status, summary, topDivkitWidget, availableRoundingOption, selectedRoundingStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundingSettingsData)) {
            return false;
        }
        RoundingSettingsData roundingSettingsData = (RoundingSettingsData) other;
        return this.status == roundingSettingsData.status && jl40.l(this.summary, roundingSettingsData.summary) && jl40.l(this.topDivkitWidget, roundingSettingsData.topDivkitWidget) && jl40.l(this.availableRoundingOption, roundingSettingsData.availableRoundingOption) && jl40.l(this.selectedRoundingStep, roundingSettingsData.selectedRoundingStep);
    }

    public final List<RoundingOptionDto> getAvailableRoundingOption() {
        return this.availableRoundingOption;
    }

    public final RoundingOptionDto getSelectedRoundingStep() {
        return this.selectedRoundingStep;
    }

    public final RoundingStatusDto getStatus() {
        return this.status;
    }

    public final AutotopupWidgetSummaryDto getSummary() {
        return this.summary;
    }

    public final DivDataDto getTopDivkitWidget() {
        return this.topDivkitWidget;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto = this.summary;
        int hashCode2 = (hashCode + (autotopupWidgetSummaryDto == null ? 0 : autotopupWidgetSummaryDto.hashCode())) * 31;
        DivDataDto divDataDto = this.topDivkitWidget;
        return this.selectedRoundingStep.hashCode() + unr0.c((hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0)) * 31, 31, this.availableRoundingOption);
    }

    public String toString() {
        return "RoundingSettingsData(status=" + this.status + ", summary=" + this.summary + ", topDivkitWidget=" + this.topDivkitWidget + ", availableRoundingOption=" + this.availableRoundingOption + ", selectedRoundingStep=" + this.selectedRoundingStep + Extension.C_BRAKE;
    }
}
