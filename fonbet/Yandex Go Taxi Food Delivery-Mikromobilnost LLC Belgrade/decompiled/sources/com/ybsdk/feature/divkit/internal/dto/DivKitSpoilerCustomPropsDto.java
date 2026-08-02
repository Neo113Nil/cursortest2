package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitSpoilerCustomPropsDto;", "", "particleColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getParticleColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitSpoilerCustomPropsDto {
    private final Themes<String> particleColor;

    public DivKitSpoilerCustomPropsDto(@Json(name = "particle_color") Themes<String> themes) {
        this.particleColor = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivKitSpoilerCustomPropsDto copy$default(DivKitSpoilerCustomPropsDto divKitSpoilerCustomPropsDto, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = divKitSpoilerCustomPropsDto.particleColor;
        }
        return divKitSpoilerCustomPropsDto.copy(themes);
    }

    public final Themes<String> component1() {
        return this.particleColor;
    }

    public final DivKitSpoilerCustomPropsDto copy(@Json(name = "particle_color") Themes<String> particleColor) {
        return new DivKitSpoilerCustomPropsDto(particleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DivKitSpoilerCustomPropsDto) && jl40.l(this.particleColor, ((DivKitSpoilerCustomPropsDto) other).particleColor);
    }

    public final Themes<String> getParticleColor() {
        return this.particleColor;
    }

    public int hashCode() {
        Themes<String> themes = this.particleColor;
        if (themes == null) {
            return 0;
        }
        return themes.hashCode();
    }

    public String toString() {
        return "DivKitSpoilerCustomPropsDto(particleColor=" + this.particleColor + Extension.C_BRAKE;
    }
}
