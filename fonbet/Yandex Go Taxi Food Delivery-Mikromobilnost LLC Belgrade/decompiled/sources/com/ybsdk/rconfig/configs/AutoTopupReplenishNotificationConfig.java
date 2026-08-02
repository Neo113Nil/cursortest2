package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.n;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015Jl\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b+\u0010\u0015R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b,\u0010\u0015¨\u0006-"}, d2 = {"Lcom/ybsdk/rconfig/configs/AutoTopupReplenishNotificationConfig;", "", "", "isEnabled", "Lcom/ybsdk/core/utils/text/Text;", "title", "subtitle", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "icon", "action", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(ZLcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "component1", "()Z", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "component4", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(ZLcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)Lcom/ybsdk/rconfig/configs/AutoTopupReplenishNotificationConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getSubtitle", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getIcon", "Ljava/lang/String;", "getAction", "getTextColor", "getBackgroundColor", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AutoTopupReplenishNotificationConfig {

    @Json(name = "action")
    private final String action;

    @Json(name = "background_color")
    private final ThemedParameter<String> backgroundColor;

    @Json(name = "icon")
    private final ThemedParameter<String> icon;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "subtitle")
    private final Text subtitle;

    @Json(name = "text_color")
    private final ThemedParameter<String> textColor;

    @Json(name = "title")
    private final Text title;

    public AutoTopupReplenishNotificationConfig(boolean z, Text text, Text text2, ThemedParameter<String> themedParameter, String str, ThemedParameter<String> themedParameter2, ThemedParameter<String> themedParameter3) {
        this.isEnabled = z;
        this.title = text;
        this.subtitle = text2;
        this.icon = themedParameter;
        this.action = str;
        this.textColor = themedParameter2;
        this.backgroundColor = themedParameter3;
    }

    public static /* synthetic */ AutoTopupReplenishNotificationConfig copy$default(AutoTopupReplenishNotificationConfig autoTopupReplenishNotificationConfig, boolean z, Text text, Text text2, ThemedParameter themedParameter, String str, ThemedParameter themedParameter2, ThemedParameter themedParameter3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoTopupReplenishNotificationConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            text = autoTopupReplenishNotificationConfig.title;
        }
        if ((i & 4) != 0) {
            text2 = autoTopupReplenishNotificationConfig.subtitle;
        }
        if ((i & 8) != 0) {
            themedParameter = autoTopupReplenishNotificationConfig.icon;
        }
        if ((i & 16) != 0) {
            str = autoTopupReplenishNotificationConfig.action;
        }
        if ((i & 32) != 0) {
            themedParameter2 = autoTopupReplenishNotificationConfig.textColor;
        }
        if ((i & 64) != 0) {
            themedParameter3 = autoTopupReplenishNotificationConfig.backgroundColor;
        }
        ThemedParameter themedParameter4 = themedParameter2;
        ThemedParameter themedParameter5 = themedParameter3;
        String str2 = str;
        Text text3 = text2;
        return autoTopupReplenishNotificationConfig.copy(z, text, text3, themedParameter, str2, themedParameter4, themedParameter5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final ThemedParameter<String> component4() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final ThemedParameter<String> component6() {
        return this.textColor;
    }

    public final ThemedParameter<String> component7() {
        return this.backgroundColor;
    }

    public final AutoTopupReplenishNotificationConfig copy(boolean isEnabled, Text title, Text subtitle, ThemedParameter<String> icon, String action, ThemedParameter<String> textColor, ThemedParameter<String> backgroundColor) {
        return new AutoTopupReplenishNotificationConfig(isEnabled, title, subtitle, icon, action, textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupReplenishNotificationConfig)) {
            return false;
        }
        AutoTopupReplenishNotificationConfig autoTopupReplenishNotificationConfig = (AutoTopupReplenishNotificationConfig) other;
        return this.isEnabled == autoTopupReplenishNotificationConfig.isEnabled && jl40.l(this.title, autoTopupReplenishNotificationConfig.title) && jl40.l(this.subtitle, autoTopupReplenishNotificationConfig.subtitle) && jl40.l(this.icon, autoTopupReplenishNotificationConfig.icon) && jl40.l(this.action, autoTopupReplenishNotificationConfig.action) && jl40.l(this.textColor, autoTopupReplenishNotificationConfig.textColor) && jl40.l(this.backgroundColor, autoTopupReplenishNotificationConfig.backgroundColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final ThemedParameter<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ThemedParameter<String> getIcon() {
        return this.icon;
    }

    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final ThemedParameter<String> getTextColor() {
        return this.textColor;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = n.c(this.title, Boolean.hashCode(this.isEnabled) * 31, 31);
        Text text = this.subtitle;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.icon;
        return this.backgroundColor.hashCode() + tse0.d(this.textColor, unr0.b((hashCode + (themedParameter != null ? themedParameter.hashCode() : 0)) * 31, 31, this.action), 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "AutoTopupReplenishNotificationConfig(isEnabled=" + this.isEnabled + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", action=" + this.action + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + Extension.C_BRAKE;
    }
}
