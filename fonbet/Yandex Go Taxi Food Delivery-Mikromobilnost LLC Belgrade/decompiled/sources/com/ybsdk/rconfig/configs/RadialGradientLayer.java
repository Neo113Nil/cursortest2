package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lcom/ybsdk/rconfig/configs/RadialGradientLayer;", "", "colorStops", "", "Lcom/ybsdk/rconfig/configs/GradientColorStop;", "centerXFraction", "", "centerYFraction", "radiusFraction", "keyframes", "Lcom/ybsdk/rconfig/configs/AnimationKeyframeConfig;", "<init>", "(Ljava/util/List;FFFLjava/util/List;)V", "getColorStops", "()Ljava/util/List;", "getCenterXFraction", "()F", "getCenterYFraction", "getRadiusFraction", "getKeyframes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadialGradientLayer {

    @Json(name = "center_x_fraction")
    private final float centerXFraction;

    @Json(name = "center_y_fraction")
    private final float centerYFraction;

    @Json(name = "colors_stops")
    private final List<GradientColorStop> colorStops;

    @Json(name = "keyframes")
    private final List<AnimationKeyframeConfig> keyframes;

    @Json(name = "radius_fraction")
    private final float radiusFraction;

    public RadialGradientLayer(List<GradientColorStop> list, float f, float f2, float f3, List<AnimationKeyframeConfig> list2) {
        this.colorStops = list;
        this.centerXFraction = f;
        this.centerYFraction = f2;
        this.radiusFraction = f3;
        this.keyframes = list2;
    }

    public static /* synthetic */ RadialGradientLayer copy$default(RadialGradientLayer radialGradientLayer, List list, float f, float f2, float f3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = radialGradientLayer.colorStops;
        }
        if ((i & 2) != 0) {
            f = radialGradientLayer.centerXFraction;
        }
        if ((i & 4) != 0) {
            f2 = radialGradientLayer.centerYFraction;
        }
        if ((i & 8) != 0) {
            f3 = radialGradientLayer.radiusFraction;
        }
        if ((i & 16) != 0) {
            list2 = radialGradientLayer.keyframes;
        }
        List list3 = list2;
        float f4 = f2;
        return radialGradientLayer.copy(list, f, f4, f3, list3);
    }

    public final List<GradientColorStop> component1() {
        return this.colorStops;
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

    public final List<AnimationKeyframeConfig> component5() {
        return this.keyframes;
    }

    public final RadialGradientLayer copy(List<GradientColorStop> colorStops, float centerXFraction, float centerYFraction, float radiusFraction, List<AnimationKeyframeConfig> keyframes) {
        return new RadialGradientLayer(colorStops, centerXFraction, centerYFraction, radiusFraction, keyframes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradientLayer)) {
            return false;
        }
        RadialGradientLayer radialGradientLayer = (RadialGradientLayer) other;
        return jl40.l(this.colorStops, radialGradientLayer.colorStops) && Float.compare(this.centerXFraction, radialGradientLayer.centerXFraction) == 0 && Float.compare(this.centerYFraction, radialGradientLayer.centerYFraction) == 0 && Float.compare(this.radiusFraction, radialGradientLayer.radiusFraction) == 0 && jl40.l(this.keyframes, radialGradientLayer.keyframes);
    }

    public final float getCenterXFraction() {
        return this.centerXFraction;
    }

    public final float getCenterYFraction() {
        return this.centerYFraction;
    }

    public final List<GradientColorStop> getColorStops() {
        return this.colorStops;
    }

    public final List<AnimationKeyframeConfig> getKeyframes() {
        return this.keyframes;
    }

    public final float getRadiusFraction() {
        return this.radiusFraction;
    }

    public int hashCode() {
        int c = g8e.c(this.radiusFraction, g8e.c(this.centerYFraction, g8e.c(this.centerXFraction, this.colorStops.hashCode() * 31, 31), 31), 31);
        List<AnimationKeyframeConfig> list = this.keyframes;
        return c + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<GradientColorStop> list = this.colorStops;
        float f = this.centerXFraction;
        float f2 = this.centerYFraction;
        float f3 = this.radiusFraction;
        List<AnimationKeyframeConfig> list2 = this.keyframes;
        StringBuilder sb = new StringBuilder("RadialGradientLayer(colorStops=");
        sb.append(list);
        sb.append(", centerXFraction=");
        sb.append(f);
        sb.append(", centerYFraction=");
        vfc.x(sb, f2, ", radiusFraction=", f3, ", keyframes=");
        return ly3.s(sb, list2, Extension.C_BRAKE);
    }
}
