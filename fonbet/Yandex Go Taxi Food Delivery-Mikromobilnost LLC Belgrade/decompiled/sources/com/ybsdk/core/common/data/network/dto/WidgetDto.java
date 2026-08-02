package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004+,-.BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\u000b2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "", "condition", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Condition;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "button", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Button;", "action", "type", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Condition;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Button;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getCondition", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Condition;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Button;", "getAction", "getType", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Condition", PlusPayUiKitInflaterFactory.NAME_BUTTON, "Theme", "Type", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WidgetDto {
    private final String action;
    private final Button button;
    private final Condition condition;
    private final String description;
    private final Themes<Theme> themes;
    private final String title;
    private final Type type;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Button;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Condition;", "", "lowerLimit", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "upperLimit", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;)V", "getLowerLimit", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getUpperLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {
        private final MoneyCommonResponse lowerLimit;
        private final MoneyCommonResponse upperLimit;

        public Condition(@Json(name = "lower_limit") MoneyCommonResponse moneyCommonResponse, @Json(name = "upper_limit") MoneyCommonResponse moneyCommonResponse2) {
            this.lowerLimit = moneyCommonResponse;
            this.upperLimit = moneyCommonResponse2;
        }

        public static /* synthetic */ Condition copy$default(Condition condition, MoneyCommonResponse moneyCommonResponse, MoneyCommonResponse moneyCommonResponse2, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyCommonResponse = condition.lowerLimit;
            }
            if ((i & 2) != 0) {
                moneyCommonResponse2 = condition.upperLimit;
            }
            return condition.copy(moneyCommonResponse, moneyCommonResponse2);
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyCommonResponse getLowerLimit() {
            return this.lowerLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyCommonResponse getUpperLimit() {
            return this.upperLimit;
        }

        public final Condition copy(@Json(name = "lower_limit") MoneyCommonResponse lowerLimit, @Json(name = "upper_limit") MoneyCommonResponse upperLimit) {
            return new Condition(lowerLimit, upperLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Condition)) {
                return false;
            }
            Condition condition = (Condition) other;
            return jl40.l(this.lowerLimit, condition.lowerLimit) && jl40.l(this.upperLimit, condition.upperLimit);
        }

        public final MoneyCommonResponse getLowerLimit() {
            return this.lowerLimit;
        }

        public final MoneyCommonResponse getUpperLimit() {
            return this.upperLimit;
        }

        public int hashCode() {
            MoneyCommonResponse moneyCommonResponse = this.lowerLimit;
            int hashCode = (moneyCommonResponse == null ? 0 : moneyCommonResponse.hashCode()) * 31;
            MoneyCommonResponse moneyCommonResponse2 = this.upperLimit;
            return hashCode + (moneyCommonResponse2 != null ? moneyCommonResponse2.hashCode() : 0);
        }

        public String toString() {
            return "Condition(lowerLimit=" + this.lowerLimit + ", upperLimit=" + this.upperLimit + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003%&'BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "titleTextColor", "", "descTextColor", "delimiterColor", "buttonTheme", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;", "image", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;)V", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "getTitleTextColor", "()Ljava/lang/String;", "getDescTextColor", "getDelimiterColor", "getButtonTheme", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Background", "ButtonTheme", "Image", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Theme {
        private final Background background;
        private final ButtonTheme buttonTheme;
        private final String delimiterColor;
        private final String descTextColor;
        private final Image image;
        private final String titleTextColor;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$ButtonTheme;", "", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "textColor", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;Ljava/lang/String;)V", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Background;", "getTextColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image;", "", "type", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image$Type;", "url", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image$Type;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image$Type;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Image {
            private final Type type;
            private final String url;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme$Image$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "BACKGROUND", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type TITLE = new Type("TITLE", 0);
                public static final Type BACKGROUND = new Type("BACKGROUND", 1);

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{TITLE, BACKGROUND};
                }

                static {
                    Type[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private Type(String str, int i) {
                }

                public static k4o getEntries() {
                    return $ENTRIES;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public Image(@Json(name = "size_type") Type type, @Json(name = "url") String str) {
                this.type = type;
                this.url = str;
            }

            public static /* synthetic */ Image copy$default(Image image, Type type, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    type = image.type;
                }
                if ((i & 2) != 0) {
                    str = image.url;
                }
                return image.copy(type, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Image copy(@Json(name = "size_type") Type type, @Json(name = "url") String url) {
                return new Image(type, url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return this.type == image.type && jl40.l(this.url, image.url);
            }

            public final Type getType() {
                return this.type;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode() + (this.type.hashCode() * 31);
            }

            public String toString() {
                return "Image(type=" + this.type + ", url=" + this.url + Extension.C_BRAKE;
            }
        }

        public Theme(@Json(name = "background") Background background, @Json(name = "title_text_color") String str, @Json(name = "description_text_color") String str2, @Json(name = "delimiter_color") String str3, @Json(name = "button_theme") ButtonTheme buttonTheme, @Json(name = "image") Image image) {
            this.background = background;
            this.titleTextColor = str;
            this.descTextColor = str2;
            this.delimiterColor = str3;
            this.buttonTheme = buttonTheme;
            this.image = image;
        }

        public static /* synthetic */ Theme copy$default(Theme theme, Background background, String str, String str2, String str3, ButtonTheme buttonTheme, Image image, int i, Object obj) {
            if ((i & 1) != 0) {
                background = theme.background;
            }
            if ((i & 2) != 0) {
                str = theme.titleTextColor;
            }
            if ((i & 4) != 0) {
                str2 = theme.descTextColor;
            }
            if ((i & 8) != 0) {
                str3 = theme.delimiterColor;
            }
            if ((i & 16) != 0) {
                buttonTheme = theme.buttonTheme;
            }
            if ((i & 32) != 0) {
                image = theme.image;
            }
            ButtonTheme buttonTheme2 = buttonTheme;
            Image image2 = image;
            return theme.copy(background, str, str2, str3, buttonTheme2, image2);
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
        public final String getDescTextColor() {
            return this.descTextColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDelimiterColor() {
            return this.delimiterColor;
        }

        /* renamed from: component5, reason: from getter */
        public final ButtonTheme getButtonTheme() {
            return this.buttonTheme;
        }

        /* renamed from: component6, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        public final Theme copy(@Json(name = "background") Background background, @Json(name = "title_text_color") String titleTextColor, @Json(name = "description_text_color") String descTextColor, @Json(name = "delimiter_color") String delimiterColor, @Json(name = "button_theme") ButtonTheme buttonTheme, @Json(name = "image") Image image) {
            return new Theme(background, titleTextColor, descTextColor, delimiterColor, buttonTheme, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) other;
            return jl40.l(this.background, theme.background) && jl40.l(this.titleTextColor, theme.titleTextColor) && jl40.l(this.descTextColor, theme.descTextColor) && jl40.l(this.delimiterColor, theme.delimiterColor) && jl40.l(this.buttonTheme, theme.buttonTheme) && jl40.l(this.image, theme.image);
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

        public final String getDescTextColor() {
            return this.descTextColor;
        }

        public final Image getImage() {
            return this.image;
        }

        public final String getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int b = unr0.b(this.background.hashCode() * 31, 31, this.titleTextColor);
            String str = this.descTextColor;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.delimiterColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonTheme buttonTheme = this.buttonTheme;
            int hashCode3 = (hashCode2 + (buttonTheme == null ? 0 : buttonTheme.hashCode())) * 31;
            Image image = this.image;
            return hashCode3 + (image != null ? image.hashCode() : 0);
        }

        public String toString() {
            Background background = this.background;
            String str = this.titleTextColor;
            String str2 = this.descTextColor;
            String str3 = this.delimiterColor;
            ButtonTheme buttonTheme = this.buttonTheme;
            Image image = this.image;
            StringBuilder sb = new StringBuilder("Theme(background=");
            sb.append(background);
            sb.append(", titleTextColor=");
            sb.append(str);
            sb.append(", descTextColor=");
            g8e.D(sb, str2, ", delimiterColor=", str3, ", buttonTheme=");
            sb.append(buttonTheme);
            sb.append(", image=");
            sb.append(image);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT", "INFO", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type LIMIT = new Type("LIMIT", 0);
        public static final Type INFO = new Type("INFO", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LIMIT, INFO};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Type(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public WidgetDto(@Json(name = "condition") Condition condition, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "button") Button button, @Json(name = "action") String str3, @Json(name = "widget_type") Type type, @Json(name = "themes") Themes<Theme> themes) {
        this.condition = condition;
        this.title = str;
        this.description = str2;
        this.button = button;
        this.action = str3;
        this.type = type;
        this.themes = themes;
    }

    public static /* synthetic */ WidgetDto copy$default(WidgetDto widgetDto, Condition condition, String str, String str2, Button button, String str3, Type type, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            condition = widgetDto.condition;
        }
        if ((i & 2) != 0) {
            str = widgetDto.title;
        }
        if ((i & 4) != 0) {
            str2 = widgetDto.description;
        }
        if ((i & 8) != 0) {
            button = widgetDto.button;
        }
        if ((i & 16) != 0) {
            str3 = widgetDto.action;
        }
        if ((i & 32) != 0) {
            type = widgetDto.type;
        }
        if ((i & 64) != 0) {
            themes = widgetDto.themes;
        }
        Type type2 = type;
        Themes themes2 = themes;
        String str4 = str3;
        String str5 = str2;
        return widgetDto.copy(condition, str, str5, button, str4, type2, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final Themes<Theme> component7() {
        return this.themes;
    }

    public final WidgetDto copy(@Json(name = "condition") Condition condition, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "button") Button button, @Json(name = "action") String action, @Json(name = "widget_type") Type type, @Json(name = "themes") Themes<Theme> themes) {
        return new WidgetDto(condition, title, description, button, action, type, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetDto)) {
            return false;
        }
        WidgetDto widgetDto = (WidgetDto) other;
        return jl40.l(this.condition, widgetDto.condition) && jl40.l(this.title, widgetDto.title) && jl40.l(this.description, widgetDto.description) && jl40.l(this.button, widgetDto.button) && jl40.l(this.action, widgetDto.action) && this.type == widgetDto.type && jl40.l(this.themes, widgetDto.themes);
    }

    public final String getAction() {
        return this.action;
    }

    public final Button getButton() {
        return this.button;
    }

    public final Condition getCondition() {
        return this.condition;
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

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.condition.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Button button = this.button;
        int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
        String str2 = this.action;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        return this.themes.hashCode() + ((this.type.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public String toString() {
        Condition condition = this.condition;
        String str = this.title;
        String str2 = this.description;
        Button button = this.button;
        String str3 = this.action;
        Type type = this.type;
        Themes<Theme> themes = this.themes;
        StringBuilder sb = new StringBuilder("WidgetDto(condition=");
        sb.append(condition);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", button=");
        sb.append(button);
        sb.append(", action=");
        sb.append(str3);
        sb.append(", type=");
        sb.append(type);
        sb.append(", themes=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
