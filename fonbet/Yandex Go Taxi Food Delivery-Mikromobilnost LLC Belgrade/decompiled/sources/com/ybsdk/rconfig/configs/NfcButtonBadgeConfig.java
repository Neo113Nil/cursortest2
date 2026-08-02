package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "", "", "text", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "color", "Lcom/ybsdk/rconfig/model/ThemedImage;", "icon", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/rconfig/model/ThemedImage;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component3", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/rconfig/model/ThemedImage;)Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getColor", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getIcon", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcButtonBadgeConfig {

    @Json(name = "color")
    private final ThemedParameter<String> color;

    @Json(name = "icon")
    private final ThemedImage icon;

    @Json(name = "text")
    private final String text;

    public NfcButtonBadgeConfig(String str, ThemedParameter<String> themedParameter, ThemedImage themedImage) {
        this.text = str;
        this.color = themedParameter;
        this.icon = themedImage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcButtonBadgeConfig copy$default(NfcButtonBadgeConfig nfcButtonBadgeConfig, String str, ThemedParameter themedParameter, ThemedImage themedImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcButtonBadgeConfig.text;
        }
        if ((i & 2) != 0) {
            themedParameter = nfcButtonBadgeConfig.color;
        }
        if ((i & 4) != 0) {
            themedImage = nfcButtonBadgeConfig.icon;
        }
        return nfcButtonBadgeConfig.copy(str, themedParameter, themedImage);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final ThemedParameter<String> component2() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final NfcButtonBadgeConfig copy(String text, ThemedParameter<String> color, ThemedImage icon) {
        return new NfcButtonBadgeConfig(text, color, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcButtonBadgeConfig)) {
            return false;
        }
        NfcButtonBadgeConfig nfcButtonBadgeConfig = (NfcButtonBadgeConfig) other;
        return jl40.l(this.text, nfcButtonBadgeConfig.text) && jl40.l(this.color, nfcButtonBadgeConfig.color) && jl40.l(this.icon, nfcButtonBadgeConfig.icon);
    }

    public final ThemedParameter<String> getColor() {
        return this.color;
    }

    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int d = tse0.d(this.color, this.text.hashCode() * 31, 31);
        ThemedImage themedImage = this.icon;
        return d + (themedImage == null ? 0 : themedImage.hashCode());
    }

    public String toString() {
        return "NfcButtonBadgeConfig(text=" + this.text + ", color=" + this.color + ", icon=" + this.icon + Extension.C_BRAKE;
    }
}
