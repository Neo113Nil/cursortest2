package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ8\u0010\u0013\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitSpinnerCustomPropsDto;", "", "spinnerColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "spinnerThickness", "", "circumference", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Float;Ljava/lang/Float;)V", "getSpinnerColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSpinnerThickness", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCircumference", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Float;Ljava/lang/Float;)Lcom/ybsdk/feature/divkit/internal/dto/DivKitSpinnerCustomPropsDto;", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitSpinnerCustomPropsDto {
    private final Float circumference;
    private final Themes<String> spinnerColor;
    private final Float spinnerThickness;

    public DivKitSpinnerCustomPropsDto(@Json(name = "spinner_color") Themes<String> themes, @Json(name = "spinner_thickness") Float f, @Json(name = "circumference") Float f2) {
        this.spinnerColor = themes;
        this.spinnerThickness = f;
        this.circumference = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivKitSpinnerCustomPropsDto copy$default(DivKitSpinnerCustomPropsDto divKitSpinnerCustomPropsDto, Themes themes, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = divKitSpinnerCustomPropsDto.spinnerColor;
        }
        if ((i & 2) != 0) {
            f = divKitSpinnerCustomPropsDto.spinnerThickness;
        }
        if ((i & 4) != 0) {
            f2 = divKitSpinnerCustomPropsDto.circumference;
        }
        return divKitSpinnerCustomPropsDto.copy(themes, f, f2);
    }

    public final Themes<String> component1() {
        return this.spinnerColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getSpinnerThickness() {
        return this.spinnerThickness;
    }

    /* renamed from: component3, reason: from getter */
    public final Float getCircumference() {
        return this.circumference;
    }

    public final DivKitSpinnerCustomPropsDto copy(@Json(name = "spinner_color") Themes<String> spinnerColor, @Json(name = "spinner_thickness") Float spinnerThickness, @Json(name = "circumference") Float circumference) {
        return new DivKitSpinnerCustomPropsDto(spinnerColor, spinnerThickness, circumference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitSpinnerCustomPropsDto)) {
            return false;
        }
        DivKitSpinnerCustomPropsDto divKitSpinnerCustomPropsDto = (DivKitSpinnerCustomPropsDto) other;
        return jl40.l(this.spinnerColor, divKitSpinnerCustomPropsDto.spinnerColor) && jl40.l(this.spinnerThickness, divKitSpinnerCustomPropsDto.spinnerThickness) && jl40.l(this.circumference, divKitSpinnerCustomPropsDto.circumference);
    }

    public final Float getCircumference() {
        return this.circumference;
    }

    public final Themes<String> getSpinnerColor() {
        return this.spinnerColor;
    }

    public final Float getSpinnerThickness() {
        return this.spinnerThickness;
    }

    public int hashCode() {
        Themes<String> themes = this.spinnerColor;
        int hashCode = (themes == null ? 0 : themes.hashCode()) * 31;
        Float f = this.spinnerThickness;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.circumference;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        return "DivKitSpinnerCustomPropsDto(spinnerColor=" + this.spinnerColor + ", spinnerThickness=" + this.spinnerThickness + ", circumference=" + this.circumference + Extension.C_BRAKE;
    }
}
