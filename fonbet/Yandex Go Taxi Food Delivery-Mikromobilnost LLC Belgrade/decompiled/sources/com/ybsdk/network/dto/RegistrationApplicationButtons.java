package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationApplicationButtons;", "", "text", "", "action", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getAction", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegistrationApplicationButtons {
    private final String action;
    private final Themes<String> backgroundColor;
    private final String text;
    private final Themes<String> textColor;

    public RegistrationApplicationButtons(@Json(name = "text") String str, @Json(name = "action") String str2, @Json(name = "text_color") Themes<String> themes, @Json(name = "background_color") Themes<String> themes2) {
        this.text = str;
        this.action = str2;
        this.textColor = themes;
        this.backgroundColor = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegistrationApplicationButtons copy$default(RegistrationApplicationButtons registrationApplicationButtons, String str, String str2, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationApplicationButtons.text;
        }
        if ((i & 2) != 0) {
            str2 = registrationApplicationButtons.action;
        }
        if ((i & 4) != 0) {
            themes = registrationApplicationButtons.textColor;
        }
        if ((i & 8) != 0) {
            themes2 = registrationApplicationButtons.backgroundColor;
        }
        return registrationApplicationButtons.copy(str, str2, themes, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component3() {
        return this.textColor;
    }

    public final Themes<String> component4() {
        return this.backgroundColor;
    }

    public final RegistrationApplicationButtons copy(@Json(name = "text") String text, @Json(name = "action") String action, @Json(name = "text_color") Themes<String> textColor, @Json(name = "background_color") Themes<String> backgroundColor) {
        return new RegistrationApplicationButtons(text, action, textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationApplicationButtons)) {
            return false;
        }
        RegistrationApplicationButtons registrationApplicationButtons = (RegistrationApplicationButtons) other;
        return jl40.l(this.text, registrationApplicationButtons.text) && jl40.l(this.action, registrationApplicationButtons.action) && jl40.l(this.textColor, registrationApplicationButtons.textColor) && jl40.l(this.backgroundColor, registrationApplicationButtons.backgroundColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + nnm.c(this.textColor, unr0.b(this.text.hashCode() * 31, 31, this.action), 31);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.action;
        Themes<String> themes = this.textColor;
        Themes<String> themes2 = this.backgroundColor;
        StringBuilder v = b64.v("RegistrationApplicationButtons(text=", str, ", action=", str2, ", textColor=");
        v.append(themes);
        v.append(", backgroundColor=");
        v.append(themes2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
