package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ6\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "", "particleColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "height", "", "width", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getParticleColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ybsdk/core/common/data/network/dto/SpoilerParamDto;", "equals", "", "other", "hashCode", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SpoilerParamDto {
    private final Integer height;
    private final Themes<String> particleColor;
    private final Integer width;

    public SpoilerParamDto(@Json(name = "particle_color") Themes<String> themes, @Json(name = "height") Integer num, @Json(name = "width") Integer num2) {
        this.particleColor = themes;
        this.height = num;
        this.width = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilerParamDto copy$default(SpoilerParamDto spoilerParamDto, Themes themes, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = spoilerParamDto.particleColor;
        }
        if ((i & 2) != 0) {
            num = spoilerParamDto.height;
        }
        if ((i & 4) != 0) {
            num2 = spoilerParamDto.width;
        }
        return spoilerParamDto.copy(themes, num, num2);
    }

    public final Themes<String> component1() {
        return this.particleColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    public final SpoilerParamDto copy(@Json(name = "particle_color") Themes<String> particleColor, @Json(name = "height") Integer height, @Json(name = "width") Integer width) {
        return new SpoilerParamDto(particleColor, height, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpoilerParamDto)) {
            return false;
        }
        SpoilerParamDto spoilerParamDto = (SpoilerParamDto) other;
        return jl40.l(this.particleColor, spoilerParamDto.particleColor) && jl40.l(this.height, spoilerParamDto.height) && jl40.l(this.width, spoilerParamDto.width);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Themes<String> getParticleColor() {
        return this.particleColor;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.particleColor.hashCode() * 31;
        Integer num = this.height;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Themes<String> themes = this.particleColor;
        Integer num = this.height;
        Integer num2 = this.width;
        StringBuilder sb = new StringBuilder("SpoilerParamDto(particleColor=");
        sb.append(themes);
        sb.append(", height=");
        sb.append(num);
        sb.append(", width=");
        return oo31.j(sb, num2, Extension.C_BRAKE);
    }
}
