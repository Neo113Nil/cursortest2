package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupToolbarButton;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "action", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupToolbarButton {
    private final String action;
    private final Themes<String> image;

    public AutoTopupToolbarButton(@Json(name = "image") Themes<String> themes, @Json(name = "action") String str) {
        this.image = themes;
        this.action = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopupToolbarButton copy$default(AutoTopupToolbarButton autoTopupToolbarButton, Themes themes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = autoTopupToolbarButton.image;
        }
        if ((i & 2) != 0) {
            str = autoTopupToolbarButton.action;
        }
        return autoTopupToolbarButton.copy(themes, str);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final AutoTopupToolbarButton copy(@Json(name = "image") Themes<String> image, @Json(name = "action") String action) {
        return new AutoTopupToolbarButton(image, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupToolbarButton)) {
            return false;
        }
        AutoTopupToolbarButton autoTopupToolbarButton = (AutoTopupToolbarButton) other;
        return jl40.l(this.image, autoTopupToolbarButton.image) && jl40.l(this.action, autoTopupToolbarButton.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.action;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AutoTopupToolbarButton(image=" + this.image + ", action=" + this.action + Extension.C_BRAKE;
    }
}
