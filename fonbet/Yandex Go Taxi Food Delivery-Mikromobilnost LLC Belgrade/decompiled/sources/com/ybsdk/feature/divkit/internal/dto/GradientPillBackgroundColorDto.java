package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/GradientPillBackgroundColorDto;", "", "color", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "position", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;F)V", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getPosition", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GradientPillBackgroundColorDto {
    private final Themes<String> color;
    private final float position;

    public GradientPillBackgroundColorDto(@Json(name = "color") Themes<String> themes, @Json(name = "position") float f) {
        this.color = themes;
        this.position = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GradientPillBackgroundColorDto copy$default(GradientPillBackgroundColorDto gradientPillBackgroundColorDto, Themes themes, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = gradientPillBackgroundColorDto.color;
        }
        if ((i & 2) != 0) {
            f = gradientPillBackgroundColorDto.position;
        }
        return gradientPillBackgroundColorDto.copy(themes, f);
    }

    public final Themes<String> component1() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPosition() {
        return this.position;
    }

    public final GradientPillBackgroundColorDto copy(@Json(name = "color") Themes<String> color, @Json(name = "position") float position) {
        return new GradientPillBackgroundColorDto(color, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientPillBackgroundColorDto)) {
            return false;
        }
        GradientPillBackgroundColorDto gradientPillBackgroundColorDto = (GradientPillBackgroundColorDto) other;
        return jl40.l(this.color, gradientPillBackgroundColorDto.color) && Float.compare(this.position, gradientPillBackgroundColorDto.position) == 0;
    }

    public final Themes<String> getColor() {
        return this.color;
    }

    public final float getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Float.hashCode(this.position) + (this.color.hashCode() * 31);
    }

    public String toString() {
        return "GradientPillBackgroundColorDto(color=" + this.color + ", position=" + this.position + Extension.C_BRAKE;
    }
}
