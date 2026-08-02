package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/ColoredTextDescriptorDto;", "", "text", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "color", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColoredTextDescriptorDto {
    private final Themes<String> color;
    private final DataEntryDescriptorDto text;

    public ColoredTextDescriptorDto(@Json(name = "text") DataEntryDescriptorDto dataEntryDescriptorDto, @Json(name = "color") Themes<String> themes) {
        this.text = dataEntryDescriptorDto;
        this.color = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColoredTextDescriptorDto copy$default(ColoredTextDescriptorDto coloredTextDescriptorDto, DataEntryDescriptorDto dataEntryDescriptorDto, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            dataEntryDescriptorDto = coloredTextDescriptorDto.text;
        }
        if ((i & 2) != 0) {
            themes = coloredTextDescriptorDto.color;
        }
        return coloredTextDescriptorDto.copy(dataEntryDescriptorDto, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final DataEntryDescriptorDto getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.color;
    }

    public final ColoredTextDescriptorDto copy(@Json(name = "text") DataEntryDescriptorDto text, @Json(name = "color") Themes<String> color) {
        return new ColoredTextDescriptorDto(text, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColoredTextDescriptorDto)) {
            return false;
        }
        ColoredTextDescriptorDto coloredTextDescriptorDto = (ColoredTextDescriptorDto) other;
        return jl40.l(this.text, coloredTextDescriptorDto.text) && jl40.l(this.color, coloredTextDescriptorDto.color);
    }

    public final Themes<String> getColor() {
        return this.color;
    }

    public final DataEntryDescriptorDto getText() {
        return this.text;
    }

    public int hashCode() {
        return this.color.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "ColoredTextDescriptorDto(text=" + this.text + ", color=" + this.color + Extension.C_BRAKE;
    }
}
