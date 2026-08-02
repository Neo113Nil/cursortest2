package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.oo31;
import defpackage.uw51;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/PfmFunFactGradientConfig;", "", "", "centerXMultiplier", "centerYMultiplier", "radiusMultiplier", "<init>", "(FFF)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/ybsdk/rconfig/configs/PfmFunFactGradientConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getCenterXMultiplier", "getCenterYMultiplier", "getRadiusMultiplier", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PfmFunFactGradientConfig {

    @Json(name = "center_x_multiplier")
    private final float centerXMultiplier;

    @Json(name = "center_y_multiplier")
    private final float centerYMultiplier;

    @Json(name = "radius_multiplier")
    private final float radiusMultiplier;

    public PfmFunFactGradientConfig(float f, float f2, float f3) {
        this.centerXMultiplier = f;
        this.centerYMultiplier = f2;
        this.radiusMultiplier = f3;
    }

    public static /* synthetic */ PfmFunFactGradientConfig copy$default(PfmFunFactGradientConfig pfmFunFactGradientConfig, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pfmFunFactGradientConfig.centerXMultiplier;
        }
        if ((i & 2) != 0) {
            f2 = pfmFunFactGradientConfig.centerYMultiplier;
        }
        if ((i & 4) != 0) {
            f3 = pfmFunFactGradientConfig.radiusMultiplier;
        }
        return pfmFunFactGradientConfig.copy(f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCenterXMultiplier() {
        return this.centerXMultiplier;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCenterYMultiplier() {
        return this.centerYMultiplier;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRadiusMultiplier() {
        return this.radiusMultiplier;
    }

    public final PfmFunFactGradientConfig copy(float centerXMultiplier, float centerYMultiplier, float radiusMultiplier) {
        return new PfmFunFactGradientConfig(centerXMultiplier, centerYMultiplier, radiusMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmFunFactGradientConfig)) {
            return false;
        }
        PfmFunFactGradientConfig pfmFunFactGradientConfig = (PfmFunFactGradientConfig) other;
        return Float.compare(this.centerXMultiplier, pfmFunFactGradientConfig.centerXMultiplier) == 0 && Float.compare(this.centerYMultiplier, pfmFunFactGradientConfig.centerYMultiplier) == 0 && Float.compare(this.radiusMultiplier, pfmFunFactGradientConfig.radiusMultiplier) == 0;
    }

    public final float getCenterXMultiplier() {
        return this.centerXMultiplier;
    }

    public final float getCenterYMultiplier() {
        return this.centerYMultiplier;
    }

    public final float getRadiusMultiplier() {
        return this.radiusMultiplier;
    }

    public int hashCode() {
        return Float.hashCode(this.radiusMultiplier) + g8e.c(this.centerYMultiplier, Float.hashCode(this.centerXMultiplier) * 31, 31);
    }

    public String toString() {
        float f = this.centerXMultiplier;
        float f2 = this.centerYMultiplier;
        return uw51.i(oo31.k("PfmFunFactGradientConfig(centerXMultiplier=", f, ", centerYMultiplier=", f2, ", radiusMultiplier="), this.radiusMultiplier, Extension.C_BRAKE);
    }
}
