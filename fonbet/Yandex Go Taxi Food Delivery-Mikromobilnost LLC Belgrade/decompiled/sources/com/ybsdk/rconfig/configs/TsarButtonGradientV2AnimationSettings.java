package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cj11;
import defpackage.g8e;
import defpackage.gj11;
import defpackage.ly3;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\r¨\u0006$"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "", "", "duration", "scaleFactor", "finalOpacity", "initialOpacity", "<init>", "(FFFF)V", "Lcj11;", "toEntity", "()Lcj11;", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getDuration", "getScaleFactor", "getFinalOpacity", "getInitialOpacity", "Companion", "gj11", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TsarButtonGradientV2AnimationSettings {
    private static final gj11 Companion = new gj11();

    @Deprecated
    public static final int FROM_DOUBLE_TO_LONG_DURATION_MS = 1000;

    @Json(name = "duration")
    private final float duration;

    @Json(name = "final_opacity")
    private final float finalOpacity;

    @Json(name = "initial_opacity")
    private final float initialOpacity;

    @Json(name = "scale_factor")
    private final float scaleFactor;

    public TsarButtonGradientV2AnimationSettings(float f, float f2, float f3, float f4) {
        this.duration = f;
        this.scaleFactor = f2;
        this.finalOpacity = f3;
        this.initialOpacity = f4;
    }

    public static /* synthetic */ TsarButtonGradientV2AnimationSettings copy$default(TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tsarButtonGradientV2AnimationSettings.duration;
        }
        if ((i & 2) != 0) {
            f2 = tsarButtonGradientV2AnimationSettings.scaleFactor;
        }
        if ((i & 4) != 0) {
            f3 = tsarButtonGradientV2AnimationSettings.finalOpacity;
        }
        if ((i & 8) != 0) {
            f4 = tsarButtonGradientV2AnimationSettings.initialOpacity;
        }
        return tsarButtonGradientV2AnimationSettings.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    /* renamed from: component3, reason: from getter */
    public final float getFinalOpacity() {
        return this.finalOpacity;
    }

    /* renamed from: component4, reason: from getter */
    public final float getInitialOpacity() {
        return this.initialOpacity;
    }

    public final TsarButtonGradientV2AnimationSettings copy(float duration, float scaleFactor, float finalOpacity, float initialOpacity) {
        return new TsarButtonGradientV2AnimationSettings(duration, scaleFactor, finalOpacity, initialOpacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsarButtonGradientV2AnimationSettings)) {
            return false;
        }
        TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings = (TsarButtonGradientV2AnimationSettings) other;
        return Float.compare(this.duration, tsarButtonGradientV2AnimationSettings.duration) == 0 && Float.compare(this.scaleFactor, tsarButtonGradientV2AnimationSettings.scaleFactor) == 0 && Float.compare(this.finalOpacity, tsarButtonGradientV2AnimationSettings.finalOpacity) == 0 && Float.compare(this.initialOpacity, tsarButtonGradientV2AnimationSettings.initialOpacity) == 0;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final float getFinalOpacity() {
        return this.finalOpacity;
    }

    public final float getInitialOpacity() {
        return this.initialOpacity;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public int hashCode() {
        return Float.hashCode(this.initialOpacity) + g8e.c(this.finalOpacity, g8e.c(this.scaleFactor, Float.hashCode(this.duration) * 31, 31), 31);
    }

    public final cj11 toEntity() {
        return new cj11((long) (this.duration * 1000.0f), this.scaleFactor, this.finalOpacity, this.initialOpacity);
    }

    public String toString() {
        float f = this.duration;
        float f2 = this.scaleFactor;
        return ly3.q(oo31.k("TsarButtonGradientV2AnimationSettings(duration=", f, ", scaleFactor=", f2, ", finalOpacity="), this.finalOpacity, ", initialOpacity=", this.initialOpacity, Extension.C_BRAKE);
    }
}
