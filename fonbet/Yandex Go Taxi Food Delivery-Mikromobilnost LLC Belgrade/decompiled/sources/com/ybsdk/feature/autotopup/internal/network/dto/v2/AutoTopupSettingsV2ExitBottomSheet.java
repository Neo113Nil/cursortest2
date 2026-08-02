package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;", "", "title", "", "subtitle", "primaryButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "getSecondaryButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2ExitBottomSheet {
    private final AutoTopupSettingsV2Button primaryButton;
    private final AutoTopupSettingsV2Button secondaryButton;
    private final String subtitle;
    private final String title;

    public AutoTopupSettingsV2ExitBottomSheet(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "primary_button") AutoTopupSettingsV2Button autoTopupSettingsV2Button, @Json(name = "secondary_button") AutoTopupSettingsV2Button autoTopupSettingsV2Button2) {
        this.title = str;
        this.subtitle = str2;
        this.primaryButton = autoTopupSettingsV2Button;
        this.secondaryButton = autoTopupSettingsV2Button2;
    }

    public static /* synthetic */ AutoTopupSettingsV2ExitBottomSheet copy$default(AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet, String str, String str2, AutoTopupSettingsV2Button autoTopupSettingsV2Button, AutoTopupSettingsV2Button autoTopupSettingsV2Button2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSettingsV2ExitBottomSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupSettingsV2ExitBottomSheet.subtitle;
        }
        if ((i & 4) != 0) {
            autoTopupSettingsV2Button = autoTopupSettingsV2ExitBottomSheet.primaryButton;
        }
        if ((i & 8) != 0) {
            autoTopupSettingsV2Button2 = autoTopupSettingsV2ExitBottomSheet.secondaryButton;
        }
        return autoTopupSettingsV2ExitBottomSheet.copy(str, str2, autoTopupSettingsV2Button, autoTopupSettingsV2Button2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupSettingsV2Button getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component4, reason: from getter */
    public final AutoTopupSettingsV2Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public final AutoTopupSettingsV2ExitBottomSheet copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "primary_button") AutoTopupSettingsV2Button primaryButton, @Json(name = "secondary_button") AutoTopupSettingsV2Button secondaryButton) {
        return new AutoTopupSettingsV2ExitBottomSheet(title, subtitle, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2ExitBottomSheet)) {
            return false;
        }
        AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet = (AutoTopupSettingsV2ExitBottomSheet) other;
        return jl40.l(this.title, autoTopupSettingsV2ExitBottomSheet.title) && jl40.l(this.subtitle, autoTopupSettingsV2ExitBottomSheet.subtitle) && jl40.l(this.primaryButton, autoTopupSettingsV2ExitBottomSheet.primaryButton) && jl40.l(this.secondaryButton, autoTopupSettingsV2ExitBottomSheet.secondaryButton);
    }

    public final AutoTopupSettingsV2Button getPrimaryButton() {
        return this.primaryButton;
    }

    public final AutoTopupSettingsV2Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (this.primaryButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        AutoTopupSettingsV2Button autoTopupSettingsV2Button = this.secondaryButton;
        return hashCode2 + (autoTopupSettingsV2Button != null ? autoTopupSettingsV2Button.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AutoTopupSettingsV2Button autoTopupSettingsV2Button = this.primaryButton;
        AutoTopupSettingsV2Button autoTopupSettingsV2Button2 = this.secondaryButton;
        StringBuilder v = b64.v("AutoTopupSettingsV2ExitBottomSheet(title=", str, ", subtitle=", str2, ", primaryButton=");
        v.append(autoTopupSettingsV2Button);
        v.append(", secondaryButton=");
        v.append(autoTopupSettingsV2Button2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
