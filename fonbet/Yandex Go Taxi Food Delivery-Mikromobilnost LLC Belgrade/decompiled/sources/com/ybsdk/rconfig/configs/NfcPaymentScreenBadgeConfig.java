package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jf\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "", "", "text", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "textColor", "backColor", "Lcom/ybsdk/rconfig/model/ThemedImage;", "icon", "deeplinkOld", "deeplinkNew", "", BackendConfig.Restrictions.ENABLED, "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component3", "component4", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;Z)Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getTextColor", "getBackColor", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getIcon", "getDeeplinkOld", "getDeeplinkNew", "Z", "getEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPaymentScreenBadgeConfig {

    @Json(name = "back_color")
    private final ThemedParameter<String> backColor;

    @Json(name = "deeplink_new")
    private final String deeplinkNew;

    @Json(name = Constants.DEEPLINK)
    private final String deeplinkOld;

    @Json(name = BackendConfig.Restrictions.ENABLED)
    private final boolean enabled;

    @Json(name = "icon")
    private final ThemedImage icon;

    @Json(name = "text")
    private final String text;

    @Json(name = "text_color")
    private final ThemedParameter<String> textColor;

    public NfcPaymentScreenBadgeConfig(String str, ThemedParameter<String> themedParameter, ThemedParameter<String> themedParameter2, ThemedImage themedImage, String str2, String str3, boolean z) {
        this.text = str;
        this.textColor = themedParameter;
        this.backColor = themedParameter2;
        this.icon = themedImage;
        this.deeplinkOld = str2;
        this.deeplinkNew = str3;
        this.enabled = z;
    }

    public static /* synthetic */ NfcPaymentScreenBadgeConfig copy$default(NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig, String str, ThemedParameter themedParameter, ThemedParameter themedParameter2, ThemedImage themedImage, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcPaymentScreenBadgeConfig.text;
        }
        if ((i & 2) != 0) {
            themedParameter = nfcPaymentScreenBadgeConfig.textColor;
        }
        if ((i & 4) != 0) {
            themedParameter2 = nfcPaymentScreenBadgeConfig.backColor;
        }
        if ((i & 8) != 0) {
            themedImage = nfcPaymentScreenBadgeConfig.icon;
        }
        if ((i & 16) != 0) {
            str2 = nfcPaymentScreenBadgeConfig.deeplinkOld;
        }
        if ((i & 32) != 0) {
            str3 = nfcPaymentScreenBadgeConfig.deeplinkNew;
        }
        if ((i & 64) != 0) {
            z = nfcPaymentScreenBadgeConfig.enabled;
        }
        String str4 = str3;
        boolean z2 = z;
        String str5 = str2;
        ThemedParameter themedParameter3 = themedParameter2;
        return nfcPaymentScreenBadgeConfig.copy(str, themedParameter, themedParameter3, themedImage, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final ThemedParameter<String> component2() {
        return this.textColor;
    }

    public final ThemedParameter<String> component3() {
        return this.backColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImage getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeeplinkOld() {
        return this.deeplinkOld;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeeplinkNew() {
        return this.deeplinkNew;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final NfcPaymentScreenBadgeConfig copy(String text, ThemedParameter<String> textColor, ThemedParameter<String> backColor, ThemedImage icon, String deeplinkOld, String deeplinkNew, boolean enabled) {
        return new NfcPaymentScreenBadgeConfig(text, textColor, backColor, icon, deeplinkOld, deeplinkNew, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenBadgeConfig)) {
            return false;
        }
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig = (NfcPaymentScreenBadgeConfig) other;
        return jl40.l(this.text, nfcPaymentScreenBadgeConfig.text) && jl40.l(this.textColor, nfcPaymentScreenBadgeConfig.textColor) && jl40.l(this.backColor, nfcPaymentScreenBadgeConfig.backColor) && jl40.l(this.icon, nfcPaymentScreenBadgeConfig.icon) && jl40.l(this.deeplinkOld, nfcPaymentScreenBadgeConfig.deeplinkOld) && jl40.l(this.deeplinkNew, nfcPaymentScreenBadgeConfig.deeplinkNew) && this.enabled == nfcPaymentScreenBadgeConfig.enabled;
    }

    public final ThemedParameter<String> getBackColor() {
        return this.backColor;
    }

    public final String getDeeplinkNew() {
        return this.deeplinkNew;
    }

    public final String getDeeplinkOld() {
        return this.deeplinkOld;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final ThemedParameter<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int d = tse0.d(this.backColor, tse0.d(this.textColor, this.text.hashCode() * 31, 31), 31);
        ThemedImage themedImage = this.icon;
        int b = unr0.b((d + (themedImage == null ? 0 : themedImage.hashCode())) * 31, 31, this.deeplinkOld);
        String str = this.deeplinkNew;
        return Boolean.hashCode(this.enabled) + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.text;
        ThemedParameter<String> themedParameter = this.textColor;
        ThemedParameter<String> themedParameter2 = this.backColor;
        ThemedImage themedImage = this.icon;
        String str2 = this.deeplinkOld;
        String str3 = this.deeplinkNew;
        boolean z = this.enabled;
        StringBuilder sb = new StringBuilder("NfcPaymentScreenBadgeConfig(text=");
        sb.append(str);
        sb.append(", textColor=");
        sb.append(themedParameter);
        sb.append(", backColor=");
        sb.append(themedParameter2);
        sb.append(", icon=");
        sb.append(themedImage);
        sb.append(", deeplinkOld=");
        g8e.D(sb, str2, ", deeplinkNew=", str3, ", enabled=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }
}
