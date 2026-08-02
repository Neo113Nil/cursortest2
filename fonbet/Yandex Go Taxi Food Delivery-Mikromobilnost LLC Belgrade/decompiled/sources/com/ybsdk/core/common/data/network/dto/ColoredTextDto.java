package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "", "text", "", "themedColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getThemedColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColoredTextDto {
    private final String text;
    private final Themes<String> themedColor;

    public ColoredTextDto(@Json(name = "text") String str, @Json(name = "color") Themes<String> themes) {
        this.text = str;
        this.themedColor = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColoredTextDto copy$default(ColoredTextDto coloredTextDto, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coloredTextDto.text;
        }
        if ((i & 2) != 0) {
            themes = coloredTextDto.themedColor;
        }
        return coloredTextDto.copy(str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.themedColor;
    }

    public final ColoredTextDto copy(@Json(name = "text") String text, @Json(name = "color") Themes<String> themedColor) {
        return new ColoredTextDto(text, themedColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColoredTextDto)) {
            return false;
        }
        ColoredTextDto coloredTextDto = (ColoredTextDto) other;
        return jl40.l(this.text, coloredTextDto.text) && jl40.l(this.themedColor, coloredTextDto.themedColor);
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getThemedColor() {
        return this.themedColor;
    }

    public int hashCode() {
        return this.themedColor.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "ColoredTextDto(text=" + this.text + ", themedColor=" + this.themedColor + Extension.C_BRAKE;
    }
}
