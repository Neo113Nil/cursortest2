package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipWithActionDto;", "", "title", "", "action", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipActionDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipActionDto;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipActionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TooltipWithActionDto {
    private final TooltipActionDto action;
    private final String title;

    public TooltipWithActionDto(@Json(name = "title") String str, @Json(name = "action") TooltipActionDto tooltipActionDto) {
        this.title = str;
        this.action = tooltipActionDto;
    }

    public static /* synthetic */ TooltipWithActionDto copy$default(TooltipWithActionDto tooltipWithActionDto, String str, TooltipActionDto tooltipActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tooltipWithActionDto.title;
        }
        if ((i & 2) != 0) {
            tooltipActionDto = tooltipWithActionDto.action;
        }
        return tooltipWithActionDto.copy(str, tooltipActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TooltipActionDto getAction() {
        return this.action;
    }

    public final TooltipWithActionDto copy(@Json(name = "title") String title, @Json(name = "action") TooltipActionDto action) {
        return new TooltipWithActionDto(title, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipWithActionDto)) {
            return false;
        }
        TooltipWithActionDto tooltipWithActionDto = (TooltipWithActionDto) other;
        return jl40.l(this.title, tooltipWithActionDto.title) && jl40.l(this.action, tooltipWithActionDto.action);
    }

    public final TooltipActionDto getAction() {
        return this.action;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TooltipActionDto tooltipActionDto = this.action;
        return hashCode + (tooltipActionDto == null ? 0 : tooltipActionDto.hashCode());
    }

    public String toString() {
        return "TooltipWithActionDto(title=" + this.title + ", action=" + this.action + Extension.C_BRAKE;
    }
}
