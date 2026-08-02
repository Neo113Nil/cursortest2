package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;", "", CspBioProgressConstants.MAX, "", "min", "tooltipMax", "", "tooltipMin", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getMax", "()I", "getMin", "getTooltipMax", "()Ljava/lang/String;", "getTooltipMin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutotopupLimitsDataDto {
    private final int max;
    private final int min;
    private final String tooltipMax;
    private final String tooltipMin;

    public RegularAutotopupLimitsDataDto(@Json(name = "money_field_max_limit") int i, @Json(name = "money_field_min_limit") int i2, @Json(name = "tooltip_max_limit_text") String str, @Json(name = "tooltip_min_limit_text") String str2) {
        this.max = i;
        this.min = i2;
        this.tooltipMax = str;
        this.tooltipMin = str2;
    }

    public static /* synthetic */ RegularAutotopupLimitsDataDto copy$default(RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = regularAutotopupLimitsDataDto.max;
        }
        if ((i3 & 2) != 0) {
            i2 = regularAutotopupLimitsDataDto.min;
        }
        if ((i3 & 4) != 0) {
            str = regularAutotopupLimitsDataDto.tooltipMax;
        }
        if ((i3 & 8) != 0) {
            str2 = regularAutotopupLimitsDataDto.tooltipMin;
        }
        return regularAutotopupLimitsDataDto.copy(i, i2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTooltipMax() {
        return this.tooltipMax;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTooltipMin() {
        return this.tooltipMin;
    }

    public final RegularAutotopupLimitsDataDto copy(@Json(name = "money_field_max_limit") int max, @Json(name = "money_field_min_limit") int min, @Json(name = "tooltip_max_limit_text") String tooltipMax, @Json(name = "tooltip_min_limit_text") String tooltipMin) {
        return new RegularAutotopupLimitsDataDto(max, min, tooltipMax, tooltipMin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutotopupLimitsDataDto)) {
            return false;
        }
        RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto = (RegularAutotopupLimitsDataDto) other;
        return this.max == regularAutotopupLimitsDataDto.max && this.min == regularAutotopupLimitsDataDto.min && jl40.l(this.tooltipMax, regularAutotopupLimitsDataDto.tooltipMax) && jl40.l(this.tooltipMin, regularAutotopupLimitsDataDto.tooltipMin);
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final String getTooltipMax() {
        return this.tooltipMax;
    }

    public final String getTooltipMin() {
        return this.tooltipMin;
    }

    public int hashCode() {
        return this.tooltipMin.hashCode() + unr0.b(oyr.b(this.min, Integer.hashCode(this.max) * 31, 31), 31, this.tooltipMax);
    }

    public String toString() {
        int i = this.max;
        int i2 = this.min;
        return g8e.r(b64.s(i, i2, "RegularAutotopupLimitsDataDto(max=", ", min=", ", tooltipMax="), this.tooltipMax, ", tooltipMin=", this.tooltipMin, Extension.C_BRAKE);
    }
}
