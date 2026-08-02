package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nativeWidget", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDto;)V", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getNativeWidget", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupWidgetSummaryDto {
    private final DivDataDto divkitWidget;
    private final AutotopupWidgetSummaryDataDto nativeWidget;

    public AutotopupWidgetSummaryDto(@Json(name = "divkit_widget") DivDataDto divDataDto, @Json(name = "native_widget") AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto) {
        this.divkitWidget = divDataDto;
        this.nativeWidget = autotopupWidgetSummaryDataDto;
    }

    public static /* synthetic */ AutotopupWidgetSummaryDto copy$default(AutotopupWidgetSummaryDto autotopupWidgetSummaryDto, DivDataDto divDataDto, AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = autotopupWidgetSummaryDto.divkitWidget;
        }
        if ((i & 2) != 0) {
            autotopupWidgetSummaryDataDto = autotopupWidgetSummaryDto.nativeWidget;
        }
        return autotopupWidgetSummaryDto.copy(divDataDto, autotopupWidgetSummaryDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    /* renamed from: component2, reason: from getter */
    public final AutotopupWidgetSummaryDataDto getNativeWidget() {
        return this.nativeWidget;
    }

    public final AutotopupWidgetSummaryDto copy(@Json(name = "divkit_widget") DivDataDto divkitWidget, @Json(name = "native_widget") AutotopupWidgetSummaryDataDto nativeWidget) {
        return new AutotopupWidgetSummaryDto(divkitWidget, nativeWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupWidgetSummaryDto)) {
            return false;
        }
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto = (AutotopupWidgetSummaryDto) other;
        return jl40.l(this.divkitWidget, autotopupWidgetSummaryDto.divkitWidget) && jl40.l(this.nativeWidget, autotopupWidgetSummaryDto.nativeWidget);
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final AutotopupWidgetSummaryDataDto getNativeWidget() {
        return this.nativeWidget;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.divkitWidget;
        int hashCode = (divDataDto == null ? 0 : divDataDto.hashCode()) * 31;
        AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto = this.nativeWidget;
        return hashCode + (autotopupWidgetSummaryDataDto != null ? autotopupWidgetSummaryDataDto.hashCode() : 0);
    }

    public String toString() {
        return "AutotopupWidgetSummaryDto(divkitWidget=" + this.divkitWidget + ", nativeWidget=" + this.nativeWidget + Extension.C_BRAKE;
    }
}
