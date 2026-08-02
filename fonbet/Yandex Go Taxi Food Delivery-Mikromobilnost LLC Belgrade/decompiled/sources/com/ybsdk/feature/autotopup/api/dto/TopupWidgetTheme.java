package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/TopupWidgetTheme;", "", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "titleTextColor", "", "descriptionTextColor", "image", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "buttonTheme", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;)V", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "getTitleTextColor", "()Ljava/lang/String;", "getDescriptionTextColor", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "getButtonTheme", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupWidgetTheme {
    private final WidgetDto.Theme.Background background;
    private final WidgetDto.Theme.ButtonTheme buttonTheme;
    private final String descriptionTextColor;
    private final WidgetDto.Theme.Image image;
    private final String titleTextColor;

    public TopupWidgetTheme(@Json(name = "background") WidgetDto.Theme.Background background, @Json(name = "title_text_color") String str, @Json(name = "description_text_color") String str2, @Json(name = "image") WidgetDto.Theme.Image image, @Json(name = "button_theme") WidgetDto.Theme.ButtonTheme buttonTheme) {
        this.background = background;
        this.titleTextColor = str;
        this.descriptionTextColor = str2;
        this.image = image;
        this.buttonTheme = buttonTheme;
    }

    public static /* synthetic */ TopupWidgetTheme copy$default(TopupWidgetTheme topupWidgetTheme, WidgetDto.Theme.Background background, String str, String str2, WidgetDto.Theme.Image image, WidgetDto.Theme.ButtonTheme buttonTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            background = topupWidgetTheme.background;
        }
        if ((i & 2) != 0) {
            str = topupWidgetTheme.titleTextColor;
        }
        if ((i & 4) != 0) {
            str2 = topupWidgetTheme.descriptionTextColor;
        }
        if ((i & 8) != 0) {
            image = topupWidgetTheme.image;
        }
        if ((i & 16) != 0) {
            buttonTheme = topupWidgetTheme.buttonTheme;
        }
        WidgetDto.Theme.ButtonTheme buttonTheme2 = buttonTheme;
        String str3 = str2;
        return topupWidgetTheme.copy(background, str, str3, image, buttonTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final WidgetDto.Theme.Background getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescriptionTextColor() {
        return this.descriptionTextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final WidgetDto.Theme.Image getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final WidgetDto.Theme.ButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    public final TopupWidgetTheme copy(@Json(name = "background") WidgetDto.Theme.Background background, @Json(name = "title_text_color") String titleTextColor, @Json(name = "description_text_color") String descriptionTextColor, @Json(name = "image") WidgetDto.Theme.Image image, @Json(name = "button_theme") WidgetDto.Theme.ButtonTheme buttonTheme) {
        return new TopupWidgetTheme(background, titleTextColor, descriptionTextColor, image, buttonTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupWidgetTheme)) {
            return false;
        }
        TopupWidgetTheme topupWidgetTheme = (TopupWidgetTheme) other;
        return jl40.l(this.background, topupWidgetTheme.background) && jl40.l(this.titleTextColor, topupWidgetTheme.titleTextColor) && jl40.l(this.descriptionTextColor, topupWidgetTheme.descriptionTextColor) && jl40.l(this.image, topupWidgetTheme.image) && jl40.l(this.buttonTheme, topupWidgetTheme.buttonTheme);
    }

    public final WidgetDto.Theme.Background getBackground() {
        return this.background;
    }

    public final WidgetDto.Theme.ButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    public final String getDescriptionTextColor() {
        return this.descriptionTextColor;
    }

    public final WidgetDto.Theme.Image getImage() {
        return this.image;
    }

    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    public int hashCode() {
        int b = unr0.b(this.background.hashCode() * 31, 31, this.titleTextColor);
        String str = this.descriptionTextColor;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        WidgetDto.Theme.Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        WidgetDto.Theme.ButtonTheme buttonTheme = this.buttonTheme;
        return hashCode2 + (buttonTheme != null ? buttonTheme.hashCode() : 0);
    }

    public String toString() {
        return "TopupWidgetTheme(background=" + this.background + ", titleTextColor=" + this.titleTextColor + ", descriptionTextColor=" + this.descriptionTextColor + ", image=" + this.image + ", buttonTheme=" + this.buttonTheme + Extension.C_BRAKE;
    }
}
