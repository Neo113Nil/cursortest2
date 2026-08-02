package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/OrientationAwareRecyclerConfig;", "", "", "isEnabled", "", "scrollAngle", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/ybsdk/rconfig/configs/OrientationAwareRecyclerConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Integer;", "getScrollAngle", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrientationAwareRecyclerConfig {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "scroll_angle")
    private final Integer scrollAngle;

    public /* synthetic */ OrientationAwareRecyclerConfig(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ OrientationAwareRecyclerConfig copy$default(OrientationAwareRecyclerConfig orientationAwareRecyclerConfig, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = orientationAwareRecyclerConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            num = orientationAwareRecyclerConfig.scrollAngle;
        }
        return orientationAwareRecyclerConfig.copy(z, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getScrollAngle() {
        return this.scrollAngle;
    }

    public final OrientationAwareRecyclerConfig copy(boolean isEnabled, Integer scrollAngle) {
        return new OrientationAwareRecyclerConfig(isEnabled, scrollAngle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationAwareRecyclerConfig)) {
            return false;
        }
        OrientationAwareRecyclerConfig orientationAwareRecyclerConfig = (OrientationAwareRecyclerConfig) other;
        return this.isEnabled == orientationAwareRecyclerConfig.isEnabled && jl40.l(this.scrollAngle, orientationAwareRecyclerConfig.scrollAngle);
    }

    public final Integer getScrollAngle() {
        return this.scrollAngle;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.scrollAngle;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "OrientationAwareRecyclerConfig(isEnabled=" + this.isEnabled + ", scrollAngle=" + this.scrollAngle + Extension.C_BRAKE;
    }

    public OrientationAwareRecyclerConfig(boolean z, Integer num) {
        this.isEnabled = z;
        this.scrollAngle = num;
    }
}
