package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/GradientDto;", "", "colors", "", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "angle", "", "<init>", "(Ljava/util/List;I)V", "getColors", "()Ljava/util/List;", "getAngle", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GradientDto {
    private final int angle;
    private final List<ThemedParameter<String>> colors;

    public GradientDto(@Json(name = "colors") List<ThemedParameter<String>> list, @Json(name = "angle") int i) {
        this.colors = list;
        this.angle = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GradientDto copy$default(GradientDto gradientDto, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = gradientDto.colors;
        }
        if ((i2 & 2) != 0) {
            i = gradientDto.angle;
        }
        return gradientDto.copy(list, i);
    }

    public final List<ThemedParameter<String>> component1() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAngle() {
        return this.angle;
    }

    public final GradientDto copy(@Json(name = "colors") List<ThemedParameter<String>> colors, @Json(name = "angle") int angle) {
        return new GradientDto(colors, angle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientDto)) {
            return false;
        }
        GradientDto gradientDto = (GradientDto) other;
        return jl40.l(this.colors, gradientDto.colors) && this.angle == gradientDto.angle;
    }

    public final int getAngle() {
        return this.angle;
    }

    public final List<ThemedParameter<String>> getColors() {
        return this.colors;
    }

    public int hashCode() {
        return Integer.hashCode(this.angle) + (this.colors.hashCode() * 31);
    }

    public String toString() {
        return "GradientDto(colors=" + this.colors + ", angle=" + this.angle + Extension.C_BRAKE;
    }
}
