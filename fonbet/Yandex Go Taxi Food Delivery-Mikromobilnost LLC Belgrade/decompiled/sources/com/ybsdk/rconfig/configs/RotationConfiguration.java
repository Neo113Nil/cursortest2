package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.cxk0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0001&B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013¨\u0006'"}, d2 = {"Lcom/ybsdk/rconfig/configs/RotationConfiguration;", "", "", "timeWindowMs", "startRangeForFirstLean", "startRangeForReturnLean", "", "accelerometerFallbackEnabled", "", "accelerometerAlpha", "<init>", "(IIILjava/lang/Boolean;Ljava/lang/Float;)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/Float;", "copy", "(IIILjava/lang/Boolean;Ljava/lang/Float;)Lcom/ybsdk/rconfig/configs/RotationConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getTimeWindowMs", "getStartRangeForFirstLean", "getStartRangeForReturnLean", "Ljava/lang/Boolean;", "getAccelerometerFallbackEnabled", "Ljava/lang/Float;", "getAccelerometerAlpha", "Companion", "cxk0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RotationConfiguration {
    public static final float ACCELEROMETER_ALPHA = 0.8f;
    public static final cxk0 Companion = new cxk0();

    @Json(name = "accelerometer_alpha")
    private final Float accelerometerAlpha;

    @Json(name = "accelerometer_fallback_enabled")
    private final Boolean accelerometerFallbackEnabled;

    @Json(name = "start_range_for_first_lean")
    private final int startRangeForFirstLean;

    @Json(name = "start_range_for_return_lean")
    private final int startRangeForReturnLean;

    @Json(name = "time_window")
    private final int timeWindowMs;

    public RotationConfiguration(int i, int i2, int i3, Boolean bool, Float f) {
        this.timeWindowMs = i;
        this.startRangeForFirstLean = i2;
        this.startRangeForReturnLean = i3;
        this.accelerometerFallbackEnabled = bool;
        this.accelerometerAlpha = f;
    }

    public static /* synthetic */ RotationConfiguration copy$default(RotationConfiguration rotationConfiguration, int i, int i2, int i3, Boolean bool, Float f, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rotationConfiguration.timeWindowMs;
        }
        if ((i4 & 2) != 0) {
            i2 = rotationConfiguration.startRangeForFirstLean;
        }
        if ((i4 & 4) != 0) {
            i3 = rotationConfiguration.startRangeForReturnLean;
        }
        if ((i4 & 8) != 0) {
            bool = rotationConfiguration.accelerometerFallbackEnabled;
        }
        if ((i4 & 16) != 0) {
            f = rotationConfiguration.accelerometerAlpha;
        }
        Float f2 = f;
        int i5 = i3;
        return rotationConfiguration.copy(i, i2, i5, bool, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTimeWindowMs() {
        return this.timeWindowMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartRangeForFirstLean() {
        return this.startRangeForFirstLean;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStartRangeForReturnLean() {
        return this.startRangeForReturnLean;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getAccelerometerFallbackEnabled() {
        return this.accelerometerFallbackEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getAccelerometerAlpha() {
        return this.accelerometerAlpha;
    }

    public final RotationConfiguration copy(int timeWindowMs, int startRangeForFirstLean, int startRangeForReturnLean, Boolean accelerometerFallbackEnabled, Float accelerometerAlpha) {
        return new RotationConfiguration(timeWindowMs, startRangeForFirstLean, startRangeForReturnLean, accelerometerFallbackEnabled, accelerometerAlpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RotationConfiguration)) {
            return false;
        }
        RotationConfiguration rotationConfiguration = (RotationConfiguration) other;
        return this.timeWindowMs == rotationConfiguration.timeWindowMs && this.startRangeForFirstLean == rotationConfiguration.startRangeForFirstLean && this.startRangeForReturnLean == rotationConfiguration.startRangeForReturnLean && jl40.l(this.accelerometerFallbackEnabled, rotationConfiguration.accelerometerFallbackEnabled) && jl40.l(this.accelerometerAlpha, rotationConfiguration.accelerometerAlpha);
    }

    public final Float getAccelerometerAlpha() {
        return this.accelerometerAlpha;
    }

    public final Boolean getAccelerometerFallbackEnabled() {
        return this.accelerometerFallbackEnabled;
    }

    public final int getStartRangeForFirstLean() {
        return this.startRangeForFirstLean;
    }

    public final int getStartRangeForReturnLean() {
        return this.startRangeForReturnLean;
    }

    public final int getTimeWindowMs() {
        return this.timeWindowMs;
    }

    public int hashCode() {
        int b = oyr.b(this.startRangeForReturnLean, oyr.b(this.startRangeForFirstLean, Integer.hashCode(this.timeWindowMs) * 31, 31), 31);
        Boolean bool = this.accelerometerFallbackEnabled;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.accelerometerAlpha;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        int i = this.timeWindowMs;
        int i2 = this.startRangeForFirstLean;
        int i3 = this.startRangeForReturnLean;
        Boolean bool = this.accelerometerFallbackEnabled;
        Float f = this.accelerometerAlpha;
        StringBuilder s = b64.s(i, i2, "RotationConfiguration(timeWindowMs=", ", startRangeForFirstLean=", ", startRangeForReturnLean=");
        s.append(i3);
        s.append(", accelerometerFallbackEnabled=");
        s.append(bool);
        s.append(", accelerometerAlpha=");
        s.append(f);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
