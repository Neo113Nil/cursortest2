package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/NfcBannerButtonInfo;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "textColor", "text", "loadingText", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTextColor", "getText", "()Ljava/lang/String;", "getLoadingText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcBannerButtonInfo {
    private final Themes<String> backgroundColor;
    private final String loadingText;
    private final String text;
    private final Themes<String> textColor;

    public NfcBannerButtonInfo(@Json(name = "background_color") Themes<String> themes, @Json(name = "text_color") Themes<String> themes2, @Json(name = "text") String str, @Json(name = "loading_text") String str2) {
        this.backgroundColor = themes;
        this.textColor = themes2;
        this.text = str;
        this.loadingText = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcBannerButtonInfo copy$default(NfcBannerButtonInfo nfcBannerButtonInfo, Themes themes, Themes themes2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = nfcBannerButtonInfo.backgroundColor;
        }
        if ((i & 2) != 0) {
            themes2 = nfcBannerButtonInfo.textColor;
        }
        if ((i & 4) != 0) {
            str = nfcBannerButtonInfo.text;
        }
        if ((i & 8) != 0) {
            str2 = nfcBannerButtonInfo.loadingText;
        }
        return nfcBannerButtonInfo.copy(themes, themes2, str, str2);
    }

    public final Themes<String> component1() {
        return this.backgroundColor;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoadingText() {
        return this.loadingText;
    }

    public final NfcBannerButtonInfo copy(@Json(name = "background_color") Themes<String> backgroundColor, @Json(name = "text_color") Themes<String> textColor, @Json(name = "text") String text, @Json(name = "loading_text") String loadingText) {
        return new NfcBannerButtonInfo(backgroundColor, textColor, text, loadingText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcBannerButtonInfo)) {
            return false;
        }
        NfcBannerButtonInfo nfcBannerButtonInfo = (NfcBannerButtonInfo) other;
        return jl40.l(this.backgroundColor, nfcBannerButtonInfo.backgroundColor) && jl40.l(this.textColor, nfcBannerButtonInfo.textColor) && jl40.l(this.text, nfcBannerButtonInfo.text) && jl40.l(this.loadingText, nfcBannerButtonInfo.loadingText);
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getLoadingText() {
        return this.loadingText;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int b = unr0.b(nnm.c(this.textColor, this.backgroundColor.hashCode() * 31, 31), 31, this.text);
        String str = this.loadingText;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Themes<String> themes = this.backgroundColor;
        Themes<String> themes2 = this.textColor;
        String str = this.text;
        String str2 = this.loadingText;
        StringBuilder sb = new StringBuilder("NfcBannerButtonInfo(backgroundColor=");
        sb.append(themes);
        sb.append(", textColor=");
        sb.append(themes2);
        sb.append(", text=");
        return g8e.r(sb, str, ", loadingText=", str2, Extension.C_BRAKE);
    }
}
