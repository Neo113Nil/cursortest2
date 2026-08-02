package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ControlColor;", "", "trackColorStateOn", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "trackColorStateOff", "thumbColor", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTrackColorStateOn", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTrackColorStateOff", "getThumbColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ControlColor {
    private final Themes<String> thumbColor;
    private final Themes<String> trackColorStateOff;
    private final Themes<String> trackColorStateOn;

    public ControlColor(@Json(name = "on_track_color") Themes<String> themes, @Json(name = "off_track_color") Themes<String> themes2, @Json(name = "thumb_color") Themes<String> themes3) {
        this.trackColorStateOn = themes;
        this.trackColorStateOff = themes2;
        this.thumbColor = themes3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ControlColor copy$default(ControlColor controlColor, Themes themes, Themes themes2, Themes themes3, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = controlColor.trackColorStateOn;
        }
        if ((i & 2) != 0) {
            themes2 = controlColor.trackColorStateOff;
        }
        if ((i & 4) != 0) {
            themes3 = controlColor.thumbColor;
        }
        return controlColor.copy(themes, themes2, themes3);
    }

    public final Themes<String> component1() {
        return this.trackColorStateOn;
    }

    public final Themes<String> component2() {
        return this.trackColorStateOff;
    }

    public final Themes<String> component3() {
        return this.thumbColor;
    }

    public final ControlColor copy(@Json(name = "on_track_color") Themes<String> trackColorStateOn, @Json(name = "off_track_color") Themes<String> trackColorStateOff, @Json(name = "thumb_color") Themes<String> thumbColor) {
        return new ControlColor(trackColorStateOn, trackColorStateOff, thumbColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlColor)) {
            return false;
        }
        ControlColor controlColor = (ControlColor) other;
        return jl40.l(this.trackColorStateOn, controlColor.trackColorStateOn) && jl40.l(this.trackColorStateOff, controlColor.trackColorStateOff) && jl40.l(this.thumbColor, controlColor.thumbColor);
    }

    public final Themes<String> getThumbColor() {
        return this.thumbColor;
    }

    public final Themes<String> getTrackColorStateOff() {
        return this.trackColorStateOff;
    }

    public final Themes<String> getTrackColorStateOn() {
        return this.trackColorStateOn;
    }

    public int hashCode() {
        return this.thumbColor.hashCode() + nnm.c(this.trackColorStateOff, this.trackColorStateOn.hashCode() * 31, 31);
    }

    public String toString() {
        Themes<String> themes = this.trackColorStateOn;
        Themes<String> themes2 = this.trackColorStateOff;
        Themes<String> themes3 = this.thumbColor;
        StringBuilder sb = new StringBuilder("ControlColor(trackColorStateOn=");
        sb.append(themes);
        sb.append(", trackColorStateOff=");
        sb.append(themes2);
        sb.append(", thumbColor=");
        return smw0.l(sb, themes3, Extension.C_BRAKE);
    }
}
