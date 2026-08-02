package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"BE\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget;", "", "action", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme;", "title", "button", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Button;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Button;)V", "getAction", "()Ljava/lang/String;", "getDescription", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "getButton", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Button;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Theme", PlusPayUiKitInflaterFactory.NAME_BUTTON, "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimplifiedIdWidget {
    private final String action;
    private final Button button;
    private final String description;
    private final Themes<Theme> themes;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Button;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {
        private final String text;

        public Button(@Json(name = "text") String str) {
            this.text = str;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.text;
            }
            return button.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Button copy(@Json(name = "text") String text) {
            return new Button(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && jl40.l(this.text, ((Button) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return oyr.p("Button(text=", this.text, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme;", "", C0553n3.g, "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "titleTextColor", "", "descriptionTextColor", "delimiterColor", "buttonTheme", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$ButtonTheme;", "<init>", "(Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$ButtonTheme;)V", "getBackground", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "getTitleTextColor", "()Ljava/lang/String;", "getDescriptionTextColor", "getDelimiterColor", "getButtonTheme", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$ButtonTheme;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Background", "ButtonTheme", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Theme {
        private final Background background;
        private final ButtonTheme buttonTheme;
        private final String delimiterColor;
        private final String descriptionTextColor;
        private final String titleTextColor;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Background {
            private final String color;

            public Background(@Json(name = "color") String str) {
                this.color = str;
            }

            public static /* synthetic */ Background copy$default(Background background, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = background.color;
                }
                return background.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            public final Background copy(@Json(name = "color") String color) {
                return new Background(color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Background) && jl40.l(this.color, ((Background) other).color);
            }

            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            public String toString() {
                return oyr.p("Background(color=", this.color, Extension.C_BRAKE);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$ButtonTheme;", "", C0553n3.g, "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "textColor", "", "<init>", "(Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;Ljava/lang/String;)V", "getBackground", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "getTextColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonTheme {
            private final Background background;
            private final String textColor;

            public ButtonTheme(@Json(name = "background") Background background, @Json(name = "text_color") String str) {
                this.background = background;
                this.textColor = str;
            }

            public static /* synthetic */ ButtonTheme copy$default(ButtonTheme buttonTheme, Background background, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    background = buttonTheme.background;
                }
                if ((i & 2) != 0) {
                    str = buttonTheme.textColor;
                }
                return buttonTheme.copy(background, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Background getBackground() {
                return this.background;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTextColor() {
                return this.textColor;
            }

            public final ButtonTheme copy(@Json(name = "background") Background background, @Json(name = "text_color") String textColor) {
                return new ButtonTheme(background, textColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonTheme)) {
                    return false;
                }
                ButtonTheme buttonTheme = (ButtonTheme) other;
                return jl40.l(this.background, buttonTheme.background) && jl40.l(this.textColor, buttonTheme.textColor);
            }

            public final Background getBackground() {
                return this.background;
            }

            public final String getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                return this.textColor.hashCode() + (this.background.hashCode() * 31);
            }

            public String toString() {
                return "ButtonTheme(background=" + this.background + ", textColor=" + this.textColor + Extension.C_BRAKE;
            }
        }

        public Theme(@Json(name = "background") Background background, @Json(name = "title_text_color") String str, @Json(name = "description_text_color") String str2, @Json(name = "delimiter_color") String str3, @Json(name = "button_theme") ButtonTheme buttonTheme) {
            this.background = background;
            this.titleTextColor = str;
            this.descriptionTextColor = str2;
            this.delimiterColor = str3;
            this.buttonTheme = buttonTheme;
        }

        public static /* synthetic */ Theme copy$default(Theme theme, Background background, String str, String str2, String str3, ButtonTheme buttonTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                background = theme.background;
            }
            if ((i & 2) != 0) {
                str = theme.titleTextColor;
            }
            if ((i & 4) != 0) {
                str2 = theme.descriptionTextColor;
            }
            if ((i & 8) != 0) {
                str3 = theme.delimiterColor;
            }
            if ((i & 16) != 0) {
                buttonTheme = theme.buttonTheme;
            }
            ButtonTheme buttonTheme2 = buttonTheme;
            String str4 = str2;
            return theme.copy(background, str, str4, str3, buttonTheme2);
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
        public final String getDescriptionTextColor() {
            return this.descriptionTextColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDelimiterColor() {
            return this.delimiterColor;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonTheme getButtonTheme() {
            return this.buttonTheme;
        }

        public final Theme copy(@Json(name = "background") Background background, @Json(name = "title_text_color") String titleTextColor, @Json(name = "description_text_color") String descriptionTextColor, @Json(name = "delimiter_color") String delimiterColor, @Json(name = "button_theme") ButtonTheme buttonTheme) {
            return new Theme(background, titleTextColor, descriptionTextColor, delimiterColor, buttonTheme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) other;
            return jl40.l(this.background, theme.background) && jl40.l(this.titleTextColor, theme.titleTextColor) && jl40.l(this.descriptionTextColor, theme.descriptionTextColor) && jl40.l(this.delimiterColor, theme.delimiterColor) && jl40.l(this.buttonTheme, theme.buttonTheme);
        }

        public final Background getBackground() {
            return this.background;
        }

        public final ButtonTheme getButtonTheme() {
            return this.buttonTheme;
        }

        public final String getDelimiterColor() {
            return this.delimiterColor;
        }

        public final String getDescriptionTextColor() {
            return this.descriptionTextColor;
        }

        public final String getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int b = unr0.b(this.background.hashCode() * 31, 31, this.titleTextColor);
            String str = this.descriptionTextColor;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.delimiterColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonTheme buttonTheme = this.buttonTheme;
            return hashCode2 + (buttonTheme != null ? buttonTheme.hashCode() : 0);
        }

        public String toString() {
            Background background = this.background;
            String str = this.titleTextColor;
            String str2 = this.descriptionTextColor;
            String str3 = this.delimiterColor;
            ButtonTheme buttonTheme = this.buttonTheme;
            StringBuilder sb = new StringBuilder("Theme(background=");
            sb.append(background);
            sb.append(", titleTextColor=");
            sb.append(str);
            sb.append(", descriptionTextColor=");
            g8e.D(sb, str2, ", delimiterColor=", str3, ", buttonTheme=");
            sb.append(buttonTheme);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }
    }

    public SimplifiedIdWidget(@Json(name = "action") String str, @Json(name = "description") String str2, @Json(name = "themes") Themes<Theme> themes, @Json(name = "title") String str3, @Json(name = "button") Button button) {
        this.action = str;
        this.description = str2;
        this.themes = themes;
        this.title = str3;
        this.button = button;
    }

    public static /* synthetic */ SimplifiedIdWidget copy$default(SimplifiedIdWidget simplifiedIdWidget, String str, String str2, Themes themes, String str3, Button button, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifiedIdWidget.action;
        }
        if ((i & 2) != 0) {
            str2 = simplifiedIdWidget.description;
        }
        if ((i & 4) != 0) {
            themes = simplifiedIdWidget.themes;
        }
        if ((i & 8) != 0) {
            str3 = simplifiedIdWidget.title;
        }
        if ((i & 16) != 0) {
            button = simplifiedIdWidget.button;
        }
        Button button2 = button;
        Themes themes2 = themes;
        return simplifiedIdWidget.copy(str, str2, themes2, str3, button2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<Theme> component3() {
        return this.themes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    public final SimplifiedIdWidget copy(@Json(name = "action") String action, @Json(name = "description") String description, @Json(name = "themes") Themes<Theme> themes, @Json(name = "title") String title, @Json(name = "button") Button button) {
        return new SimplifiedIdWidget(action, description, themes, title, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifiedIdWidget)) {
            return false;
        }
        SimplifiedIdWidget simplifiedIdWidget = (SimplifiedIdWidget) other;
        return jl40.l(this.action, simplifiedIdWidget.action) && jl40.l(this.description, simplifiedIdWidget.description) && jl40.l(this.themes, simplifiedIdWidget.themes) && jl40.l(this.title, simplifiedIdWidget.title) && jl40.l(this.button, simplifiedIdWidget.button);
    }

    public final String getAction() {
        return this.action;
    }

    public final Button getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<Theme> getThemes() {
        return this.themes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int b = unr0.b(nnm.c(this.themes, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.title);
        Button button = this.button;
        return b + (button != null ? button.hashCode() : 0);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.description;
        Themes<Theme> themes = this.themes;
        String str3 = this.title;
        Button button = this.button;
        StringBuilder v = b64.v("SimplifiedIdWidget(action=", str, ", description=", str2, ", themes=");
        v.append(themes);
        v.append(", title=");
        v.append(str3);
        v.append(", button=");
        v.append(button);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
