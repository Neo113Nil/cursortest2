package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitTickerCustomPropsDto;", "", "text", "", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "id", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitTickerCustomPropsDto {
    private final String id;
    private final String text;
    private final Themes<String> textColor;

    public DivKitTickerCustomPropsDto(@Json(name = "text") String str, @Json(name = "text_color") Themes<String> themes, @Json(name = "id") String str2) {
        this.text = str;
        this.textColor = themes;
        this.id = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivKitTickerCustomPropsDto copy$default(DivKitTickerCustomPropsDto divKitTickerCustomPropsDto, String str, Themes themes, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = divKitTickerCustomPropsDto.text;
        }
        if ((i & 2) != 0) {
            themes = divKitTickerCustomPropsDto.textColor;
        }
        if ((i & 4) != 0) {
            str2 = divKitTickerCustomPropsDto.id;
        }
        return divKitTickerCustomPropsDto.copy(str, themes, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DivKitTickerCustomPropsDto copy(@Json(name = "text") String text, @Json(name = "text_color") Themes<String> textColor, @Json(name = "id") String id) {
        return new DivKitTickerCustomPropsDto(text, textColor, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitTickerCustomPropsDto)) {
            return false;
        }
        DivKitTickerCustomPropsDto divKitTickerCustomPropsDto = (DivKitTickerCustomPropsDto) other;
        return jl40.l(this.text, divKitTickerCustomPropsDto.text) && jl40.l(this.textColor, divKitTickerCustomPropsDto.textColor) && jl40.l(this.id, divKitTickerCustomPropsDto.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Themes<String> themes = this.textColor;
        return this.id.hashCode() + ((hashCode + (themes == null ? 0 : themes.hashCode())) * 31);
    }

    public String toString() {
        String str = this.text;
        Themes<String> themes = this.textColor;
        String str2 = this.id;
        StringBuilder sb = new StringBuilder("DivKitTickerCustomPropsDto(text=");
        sb.append(str);
        sb.append(", textColor=");
        sb.append(themes);
        sb.append(", id=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
