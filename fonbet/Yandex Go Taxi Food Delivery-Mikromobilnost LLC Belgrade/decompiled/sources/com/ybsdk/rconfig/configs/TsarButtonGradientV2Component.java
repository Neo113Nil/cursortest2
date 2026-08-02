package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.dj11;
import defpackage.jl40;
import defpackage.lvy0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Component;", "", "", "color", "", "location", "<init>", "(Ljava/lang/String;F)V", "Ldj11;", "toEntity", "()Ldj11;", "component1", "()Ljava/lang/String;", "component2", "()F", "copy", "(Ljava/lang/String;F)Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Component;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "F", "getLocation", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TsarButtonGradientV2Component {

    @Json(name = "color")
    private final String color;

    @Json(name = "location")
    private final float location;

    public TsarButtonGradientV2Component(String str, float f) {
        this.color = str;
        this.location = f;
    }

    public static /* synthetic */ TsarButtonGradientV2Component copy$default(TsarButtonGradientV2Component tsarButtonGradientV2Component, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tsarButtonGradientV2Component.color;
        }
        if ((i & 2) != 0) {
            f = tsarButtonGradientV2Component.location;
        }
        return tsarButtonGradientV2Component.copy(str, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLocation() {
        return this.location;
    }

    public final TsarButtonGradientV2Component copy(String color, float location) {
        return new TsarButtonGradientV2Component(color, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsarButtonGradientV2Component)) {
            return false;
        }
        TsarButtonGradientV2Component tsarButtonGradientV2Component = (TsarButtonGradientV2Component) other;
        return jl40.l(this.color, tsarButtonGradientV2Component.color) && Float.compare(this.location, tsarButtonGradientV2Component.location) == 0;
    }

    public final String getColor() {
        return this.color;
    }

    public final float getLocation() {
        return this.location;
    }

    public int hashCode() {
        return Float.hashCode(this.location) + (this.color.hashCode() * 31);
    }

    public final dj11 toEntity() {
        return new dj11(this.location, lvy0.e(this.color, null));
    }

    public String toString() {
        return "TsarButtonGradientV2Component(color=" + this.color + ", location=" + this.location + Extension.C_BRAKE;
    }
}
