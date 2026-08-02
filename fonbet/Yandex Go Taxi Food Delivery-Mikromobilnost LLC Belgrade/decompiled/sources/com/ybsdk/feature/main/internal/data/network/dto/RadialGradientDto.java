package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oo31;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientDto;", "", "centerX", "", "centerY", "radius", "colors", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/RadialGradientColorDto;", "<init>", "(FFFLjava/util/List;)V", "getCenterX", "()F", "getCenterY", "getRadius", "getColors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RadialGradientDto {
    private final float centerX;
    private final float centerY;
    private final List<RadialGradientColorDto> colors;
    private final float radius;

    public RadialGradientDto(@Json(name = "center_x") float f, @Json(name = "center_y") float f2, @Json(name = "radius") float f3, @Json(name = "colors") List<RadialGradientColorDto> list) {
        this.centerX = f;
        this.centerY = f2;
        this.radius = f3;
        this.colors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadialGradientDto copy$default(RadialGradientDto radialGradientDto, float f, float f2, float f3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = radialGradientDto.centerX;
        }
        if ((i & 2) != 0) {
            f2 = radialGradientDto.centerY;
        }
        if ((i & 4) != 0) {
            f3 = radialGradientDto.radius;
        }
        if ((i & 8) != 0) {
            list = radialGradientDto.colors;
        }
        return radialGradientDto.copy(f, f2, f3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCenterX() {
        return this.centerX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCenterY() {
        return this.centerY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    public final List<RadialGradientColorDto> component4() {
        return this.colors;
    }

    public final RadialGradientDto copy(@Json(name = "center_x") float centerX, @Json(name = "center_y") float centerY, @Json(name = "radius") float radius, @Json(name = "colors") List<RadialGradientColorDto> colors) {
        return new RadialGradientDto(centerX, centerY, radius, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradientDto)) {
            return false;
        }
        RadialGradientDto radialGradientDto = (RadialGradientDto) other;
        return Float.compare(this.centerX, radialGradientDto.centerX) == 0 && Float.compare(this.centerY, radialGradientDto.centerY) == 0 && Float.compare(this.radius, radialGradientDto.radius) == 0 && jl40.l(this.colors, radialGradientDto.colors);
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final List<RadialGradientColorDto> getColors() {
        return this.colors;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return this.colors.hashCode() + g8e.c(this.radius, g8e.c(this.centerY, Float.hashCode(this.centerX) * 31, 31), 31);
    }

    public String toString() {
        float f = this.centerX;
        float f2 = this.centerY;
        float f3 = this.radius;
        List<RadialGradientColorDto> list = this.colors;
        StringBuilder k = oo31.k("RadialGradientDto(centerX=", f, ", centerY=", f2, ", radius=");
        k.append(f3);
        k.append(", colors=");
        k.append(list);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
