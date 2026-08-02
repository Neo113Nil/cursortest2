package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.ly3;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/AnimationKeyframeConfig;", "", "progress", "", "centerXFraction", "centerYFraction", "radiusFraction", "<init>", "(FFFF)V", "getProgress", "()F", "getCenterXFraction", "getCenterYFraction", "getRadiusFraction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AnimationKeyframeConfig {

    @Json(name = "center_x_fraction")
    private final float centerXFraction;

    @Json(name = "center_y_fraction")
    private final float centerYFraction;

    @Json(name = "progress")
    private final float progress;

    @Json(name = "radius_fraction")
    private final float radiusFraction;

    public AnimationKeyframeConfig(float f, float f2, float f3, float f4) {
        this.progress = f;
        this.centerXFraction = f2;
        this.centerYFraction = f3;
        this.radiusFraction = f4;
    }

    public static /* synthetic */ AnimationKeyframeConfig copy$default(AnimationKeyframeConfig animationKeyframeConfig, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = animationKeyframeConfig.progress;
        }
        if ((i & 2) != 0) {
            f2 = animationKeyframeConfig.centerXFraction;
        }
        if ((i & 4) != 0) {
            f3 = animationKeyframeConfig.centerYFraction;
        }
        if ((i & 8) != 0) {
            f4 = animationKeyframeConfig.radiusFraction;
        }
        return animationKeyframeConfig.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCenterXFraction() {
        return this.centerXFraction;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCenterYFraction() {
        return this.centerYFraction;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRadiusFraction() {
        return this.radiusFraction;
    }

    public final AnimationKeyframeConfig copy(float progress, float centerXFraction, float centerYFraction, float radiusFraction) {
        return new AnimationKeyframeConfig(progress, centerXFraction, centerYFraction, radiusFraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationKeyframeConfig)) {
            return false;
        }
        AnimationKeyframeConfig animationKeyframeConfig = (AnimationKeyframeConfig) other;
        return Float.compare(this.progress, animationKeyframeConfig.progress) == 0 && Float.compare(this.centerXFraction, animationKeyframeConfig.centerXFraction) == 0 && Float.compare(this.centerYFraction, animationKeyframeConfig.centerYFraction) == 0 && Float.compare(this.radiusFraction, animationKeyframeConfig.radiusFraction) == 0;
    }

    public final float getCenterXFraction() {
        return this.centerXFraction;
    }

    public final float getCenterYFraction() {
        return this.centerYFraction;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final float getRadiusFraction() {
        return this.radiusFraction;
    }

    public int hashCode() {
        return Float.hashCode(this.radiusFraction) + g8e.c(this.centerYFraction, g8e.c(this.centerXFraction, Float.hashCode(this.progress) * 31, 31), 31);
    }

    public String toString() {
        float f = this.progress;
        float f2 = this.centerXFraction;
        return ly3.q(oo31.k("AnimationKeyframeConfig(progress=", f, ", centerXFraction=", f2, ", centerYFraction="), this.centerYFraction, ", radiusFraction=", this.radiusFraction, Extension.C_BRAKE);
    }
}
