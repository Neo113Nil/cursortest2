package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "", "hideNativeNfcButton", "", "tokenizationButtonAction", "", "tokenizationButtonTint", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getHideNativeNfcButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTokenizationButtonAction", "()Ljava/lang/String;", "getTokenizationButtonTint", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcPayloadDto;", "equals", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcPayloadDto {
    private final Boolean hideNativeNfcButton;
    private final String tokenizationButtonAction;
    private final Themes<String> tokenizationButtonTint;

    public NfcPayloadDto(@Json(name = "hide_native_nfc_button") Boolean bool, @Json(name = "tokenization_button_action") String str, @Json(name = "tokenization_button_tint") Themes<String> themes) {
        this.hideNativeNfcButton = bool;
        this.tokenizationButtonAction = str;
        this.tokenizationButtonTint = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcPayloadDto copy$default(NfcPayloadDto nfcPayloadDto, Boolean bool, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = nfcPayloadDto.hideNativeNfcButton;
        }
        if ((i & 2) != 0) {
            str = nfcPayloadDto.tokenizationButtonAction;
        }
        if ((i & 4) != 0) {
            themes = nfcPayloadDto.tokenizationButtonTint;
        }
        return nfcPayloadDto.copy(bool, str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getHideNativeNfcButton() {
        return this.hideNativeNfcButton;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenizationButtonAction() {
        return this.tokenizationButtonAction;
    }

    public final Themes<String> component3() {
        return this.tokenizationButtonTint;
    }

    public final NfcPayloadDto copy(@Json(name = "hide_native_nfc_button") Boolean hideNativeNfcButton, @Json(name = "tokenization_button_action") String tokenizationButtonAction, @Json(name = "tokenization_button_tint") Themes<String> tokenizationButtonTint) {
        return new NfcPayloadDto(hideNativeNfcButton, tokenizationButtonAction, tokenizationButtonTint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPayloadDto)) {
            return false;
        }
        NfcPayloadDto nfcPayloadDto = (NfcPayloadDto) other;
        return jl40.l(this.hideNativeNfcButton, nfcPayloadDto.hideNativeNfcButton) && jl40.l(this.tokenizationButtonAction, nfcPayloadDto.tokenizationButtonAction) && jl40.l(this.tokenizationButtonTint, nfcPayloadDto.tokenizationButtonTint);
    }

    public final Boolean getHideNativeNfcButton() {
        return this.hideNativeNfcButton;
    }

    public final String getTokenizationButtonAction() {
        return this.tokenizationButtonAction;
    }

    public final Themes<String> getTokenizationButtonTint() {
        return this.tokenizationButtonTint;
    }

    public int hashCode() {
        Boolean bool = this.hideNativeNfcButton;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.tokenizationButtonAction;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.tokenizationButtonTint;
        return hashCode2 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.hideNativeNfcButton;
        String str = this.tokenizationButtonAction;
        Themes<String> themes = this.tokenizationButtonTint;
        StringBuilder sb = new StringBuilder("NfcPayloadDto(hideNativeNfcButton=");
        sb.append(bool);
        sb.append(", tokenizationButtonAction=");
        sb.append(str);
        sb.append(", tokenizationButtonTint=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
