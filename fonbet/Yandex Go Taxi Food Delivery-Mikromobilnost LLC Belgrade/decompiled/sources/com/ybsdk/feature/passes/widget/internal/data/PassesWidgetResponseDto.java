package com.ybsdk.feature.passes.widget.internal.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetResponseDto;", "", "widget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "isAgreementAccepted", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Z)V", "getWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-passes-widget_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassesWidgetResponseDto {
    private final boolean isAgreementAccepted;
    private final DivDataDto widget;

    public PassesWidgetResponseDto(@Json(name = "widget") DivDataDto divDataDto, @Json(name = "is_agreement_accepted") boolean z) {
        this.widget = divDataDto;
        this.isAgreementAccepted = z;
    }

    public static /* synthetic */ PassesWidgetResponseDto copy$default(PassesWidgetResponseDto passesWidgetResponseDto, DivDataDto divDataDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = passesWidgetResponseDto.widget;
        }
        if ((i & 2) != 0) {
            z = passesWidgetResponseDto.isAgreementAccepted;
        }
        return passesWidgetResponseDto.copy(divDataDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getWidget() {
        return this.widget;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAgreementAccepted() {
        return this.isAgreementAccepted;
    }

    public final PassesWidgetResponseDto copy(@Json(name = "widget") DivDataDto widget, @Json(name = "is_agreement_accepted") boolean isAgreementAccepted) {
        return new PassesWidgetResponseDto(widget, isAgreementAccepted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassesWidgetResponseDto)) {
            return false;
        }
        PassesWidgetResponseDto passesWidgetResponseDto = (PassesWidgetResponseDto) other;
        return jl40.l(this.widget, passesWidgetResponseDto.widget) && this.isAgreementAccepted == passesWidgetResponseDto.isAgreementAccepted;
    }

    public final DivDataDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.widget;
        return Boolean.hashCode(this.isAgreementAccepted) + ((divDataDto == null ? 0 : divDataDto.hashCode()) * 31);
    }

    public final boolean isAgreementAccepted() {
        return this.isAgreementAccepted;
    }

    public String toString() {
        return "PassesWidgetResponseDto(widget=" + this.widget + ", isAgreementAccepted=" + this.isAgreementAccepted + Extension.C_BRAKE;
    }
}
