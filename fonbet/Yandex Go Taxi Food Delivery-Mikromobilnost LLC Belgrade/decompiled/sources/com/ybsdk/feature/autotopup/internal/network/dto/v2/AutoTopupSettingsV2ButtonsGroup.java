package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ButtonsGroup;", "", "primaryButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "secondaryButton", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;)V", "getPrimaryButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "getSecondaryButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2ButtonsGroup {
    private final AutoTopupSettingsV2Button primaryButton;
    private final AutoTopupSettingsV2Button secondaryButton;

    public AutoTopupSettingsV2ButtonsGroup(@Json(name = "primary_button") AutoTopupSettingsV2Button autoTopupSettingsV2Button, @Json(name = "secondary_button") AutoTopupSettingsV2Button autoTopupSettingsV2Button2) {
        this.primaryButton = autoTopupSettingsV2Button;
        this.secondaryButton = autoTopupSettingsV2Button2;
    }

    public static /* synthetic */ AutoTopupSettingsV2ButtonsGroup copy$default(AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup, AutoTopupSettingsV2Button autoTopupSettingsV2Button, AutoTopupSettingsV2Button autoTopupSettingsV2Button2, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupSettingsV2Button = autoTopupSettingsV2ButtonsGroup.primaryButton;
        }
        if ((i & 2) != 0) {
            autoTopupSettingsV2Button2 = autoTopupSettingsV2ButtonsGroup.secondaryButton;
        }
        return autoTopupSettingsV2ButtonsGroup.copy(autoTopupSettingsV2Button, autoTopupSettingsV2Button2);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupSettingsV2Button getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupSettingsV2Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public final AutoTopupSettingsV2ButtonsGroup copy(@Json(name = "primary_button") AutoTopupSettingsV2Button primaryButton, @Json(name = "secondary_button") AutoTopupSettingsV2Button secondaryButton) {
        return new AutoTopupSettingsV2ButtonsGroup(primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2ButtonsGroup)) {
            return false;
        }
        AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup = (AutoTopupSettingsV2ButtonsGroup) other;
        return jl40.l(this.primaryButton, autoTopupSettingsV2ButtonsGroup.primaryButton) && jl40.l(this.secondaryButton, autoTopupSettingsV2ButtonsGroup.secondaryButton);
    }

    public final AutoTopupSettingsV2Button getPrimaryButton() {
        return this.primaryButton;
    }

    public final AutoTopupSettingsV2Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + (this.primaryButton.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupSettingsV2ButtonsGroup(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + Extension.C_BRAKE;
    }
}
