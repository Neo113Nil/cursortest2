package com.ybsdk.feature.main.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006("}, d2 = {"Lcom/ybsdk/feature/main/api/dto/ProductTheme;", "", C0553n3.g, "Lcom/ybsdk/feature/main/api/dto/ProductTheme$Background;", "titleTextColor", "", "subtitleTextColor", "icon", "buttonColor", "buttonTextColor", "borderColor", "accessoryIconColor", "<init>", "(Lcom/ybsdk/feature/main/api/dto/ProductTheme$Background;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Lcom/ybsdk/feature/main/api/dto/ProductTheme$Background;", "getTitleTextColor", "()Ljava/lang/String;", "getSubtitleTextColor", "getIcon", "getButtonColor", "getButtonTextColor", "getBorderColor", "getAccessoryIconColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Background", "feature-main-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductTheme {
    private final String accessoryIconColor;
    private final Background background;
    private final String borderColor;
    private final String buttonColor;
    private final String buttonTextColor;
    private final String icon;
    private final String subtitleTextColor;
    private final String titleTextColor;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/main/api/dto/ProductTheme$Background;", "", "solid", "", "image", "animation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSolid", "()Ljava/lang/String;", "getImage", "getAnimation", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Background {
        private final String animation;
        private final String image;
        private final String solid;

        public Background(@Json(name = "solid") String str, @Json(name = "image") String str2, @Json(name = "animation") String str3) {
            this.solid = str;
            this.image = str2;
            this.animation = str3;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = background.solid;
            }
            if ((i & 2) != 0) {
                str2 = background.image;
            }
            if ((i & 4) != 0) {
                str3 = background.animation;
            }
            return background.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSolid() {
            return this.solid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnimation() {
            return this.animation;
        }

        public final Background copy(@Json(name = "solid") String solid, @Json(name = "image") String image, @Json(name = "animation") String animation) {
            return new Background(solid, image, animation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return jl40.l(this.solid, background.solid) && jl40.l(this.image, background.image) && jl40.l(this.animation, background.animation);
        }

        public final String getAnimation() {
            return this.animation;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getSolid() {
            return this.solid;
        }

        public int hashCode() {
            int hashCode = this.solid.hashCode() * 31;
            String str = this.image;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.animation;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.solid;
            String str2 = this.image;
            return oyr.t(b64.v("Background(solid=", str, ", image=", str2, ", animation="), this.animation, Extension.C_BRAKE);
        }
    }

    public ProductTheme(@Json(name = "background") Background background, @Json(name = "title_text_color") String str, @Json(name = "subtitle_text_color") String str2, @Json(name = "icon") String str3, @Json(name = "button_color") String str4, @Json(name = "button_text_color") String str5, @Json(name = "border_color") String str6, @Json(name = "accessory_icon_color") String str7) {
        this.background = background;
        this.titleTextColor = str;
        this.subtitleTextColor = str2;
        this.icon = str3;
        this.buttonColor = str4;
        this.buttonTextColor = str5;
        this.borderColor = str6;
        this.accessoryIconColor = str7;
    }

    public static /* synthetic */ ProductTheme copy$default(ProductTheme productTheme, Background background, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            background = productTheme.background;
        }
        if ((i & 2) != 0) {
            str = productTheme.titleTextColor;
        }
        if ((i & 4) != 0) {
            str2 = productTheme.subtitleTextColor;
        }
        if ((i & 8) != 0) {
            str3 = productTheme.icon;
        }
        if ((i & 16) != 0) {
            str4 = productTheme.buttonColor;
        }
        if ((i & 32) != 0) {
            str5 = productTheme.buttonTextColor;
        }
        if ((i & 64) != 0) {
            str6 = productTheme.borderColor;
        }
        if ((i & 128) != 0) {
            str7 = productTheme.accessoryIconColor;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return productTheme.copy(background, str, str2, str3, str10, str11, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAccessoryIconColor() {
        return this.accessoryIconColor;
    }

    public final ProductTheme copy(@Json(name = "background") Background background, @Json(name = "title_text_color") String titleTextColor, @Json(name = "subtitle_text_color") String subtitleTextColor, @Json(name = "icon") String icon, @Json(name = "button_color") String buttonColor, @Json(name = "button_text_color") String buttonTextColor, @Json(name = "border_color") String borderColor, @Json(name = "accessory_icon_color") String accessoryIconColor) {
        return new ProductTheme(background, titleTextColor, subtitleTextColor, icon, buttonColor, buttonTextColor, borderColor, accessoryIconColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductTheme)) {
            return false;
        }
        ProductTheme productTheme = (ProductTheme) other;
        return jl40.l(this.background, productTheme.background) && jl40.l(this.titleTextColor, productTheme.titleTextColor) && jl40.l(this.subtitleTextColor, productTheme.subtitleTextColor) && jl40.l(this.icon, productTheme.icon) && jl40.l(this.buttonColor, productTheme.buttonColor) && jl40.l(this.buttonTextColor, productTheme.buttonTextColor) && jl40.l(this.borderColor, productTheme.borderColor) && jl40.l(this.accessoryIconColor, productTheme.accessoryIconColor);
    }

    public final String getAccessoryIconColor() {
        return this.accessoryIconColor;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.background.hashCode() * 31, 31, this.titleTextColor), 31, this.subtitleTextColor), 31, this.icon);
        String str = this.buttonColor;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTextColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.borderColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessoryIconColor;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Background background = this.background;
        String str = this.titleTextColor;
        String str2 = this.subtitleTextColor;
        String str3 = this.icon;
        String str4 = this.buttonColor;
        String str5 = this.buttonTextColor;
        String str6 = this.borderColor;
        String str7 = this.accessoryIconColor;
        StringBuilder sb = new StringBuilder("ProductTheme(background=");
        sb.append(background);
        sb.append(", titleTextColor=");
        sb.append(str);
        sb.append(", subtitleTextColor=");
        g8e.D(sb, str2, ", icon=", str3, ", buttonColor=");
        g8e.D(sb, str4, ", buttonTextColor=", str5, ", borderColor=");
        return g8e.r(sb, str6, ", accessoryIconColor=", str7, Extension.C_BRAKE);
    }
}
