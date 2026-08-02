package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/ybsdk/rconfig/configs/ShakeConfiguration;", "", "", "shakeThresholdGravity", "minDelayBetweenHidingBalanceMs", "minWindowSizeMs", "maxWindowSizeMs", "queueSize", "<init>", "(IIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/ybsdk/rconfig/configs/ShakeConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getShakeThresholdGravity", "getMinDelayBetweenHidingBalanceMs", "getMinWindowSizeMs", "getMaxWindowSizeMs", "getQueueSize", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ShakeConfiguration {

    @Json(name = "max_window_size_ms")
    private final int maxWindowSizeMs;

    @Json(name = "min_delay_between_hiding_balance_ms")
    private final int minDelayBetweenHidingBalanceMs;

    @Json(name = "min_window_size_ms")
    private final int minWindowSizeMs;

    @Json(name = "queue_size")
    private final int queueSize;

    @Json(name = "shake_threshold_gravity")
    private final int shakeThresholdGravity;

    public ShakeConfiguration(int i, int i2, int i3, int i4, int i5) {
        this.shakeThresholdGravity = i;
        this.minDelayBetweenHidingBalanceMs = i2;
        this.minWindowSizeMs = i3;
        this.maxWindowSizeMs = i4;
        this.queueSize = i5;
    }

    public static /* synthetic */ ShakeConfiguration copy$default(ShakeConfiguration shakeConfiguration, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = shakeConfiguration.shakeThresholdGravity;
        }
        if ((i6 & 2) != 0) {
            i2 = shakeConfiguration.minDelayBetweenHidingBalanceMs;
        }
        if ((i6 & 4) != 0) {
            i3 = shakeConfiguration.minWindowSizeMs;
        }
        if ((i6 & 8) != 0) {
            i4 = shakeConfiguration.maxWindowSizeMs;
        }
        if ((i6 & 16) != 0) {
            i5 = shakeConfiguration.queueSize;
        }
        int i7 = i5;
        int i8 = i3;
        return shakeConfiguration.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getShakeThresholdGravity() {
        return this.shakeThresholdGravity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinDelayBetweenHidingBalanceMs() {
        return this.minDelayBetweenHidingBalanceMs;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinWindowSizeMs() {
        return this.minWindowSizeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxWindowSizeMs() {
        return this.maxWindowSizeMs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getQueueSize() {
        return this.queueSize;
    }

    public final ShakeConfiguration copy(int shakeThresholdGravity, int minDelayBetweenHidingBalanceMs, int minWindowSizeMs, int maxWindowSizeMs, int queueSize) {
        return new ShakeConfiguration(shakeThresholdGravity, minDelayBetweenHidingBalanceMs, minWindowSizeMs, maxWindowSizeMs, queueSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShakeConfiguration)) {
            return false;
        }
        ShakeConfiguration shakeConfiguration = (ShakeConfiguration) other;
        return this.shakeThresholdGravity == shakeConfiguration.shakeThresholdGravity && this.minDelayBetweenHidingBalanceMs == shakeConfiguration.minDelayBetweenHidingBalanceMs && this.minWindowSizeMs == shakeConfiguration.minWindowSizeMs && this.maxWindowSizeMs == shakeConfiguration.maxWindowSizeMs && this.queueSize == shakeConfiguration.queueSize;
    }

    public final int getMaxWindowSizeMs() {
        return this.maxWindowSizeMs;
    }

    public final int getMinDelayBetweenHidingBalanceMs() {
        return this.minDelayBetweenHidingBalanceMs;
    }

    public final int getMinWindowSizeMs() {
        return this.minWindowSizeMs;
    }

    public final int getQueueSize() {
        return this.queueSize;
    }

    public final int getShakeThresholdGravity() {
        return this.shakeThresholdGravity;
    }

    public int hashCode() {
        return Integer.hashCode(this.queueSize) + oyr.b(this.maxWindowSizeMs, oyr.b(this.minWindowSizeMs, oyr.b(this.minDelayBetweenHidingBalanceMs, Integer.hashCode(this.shakeThresholdGravity) * 31, 31), 31), 31);
    }

    public String toString() {
        int i = this.shakeThresholdGravity;
        int i2 = this.minDelayBetweenHidingBalanceMs;
        int i3 = this.minWindowSizeMs;
        int i4 = this.maxWindowSizeMs;
        int i5 = this.queueSize;
        StringBuilder s = b64.s(i, i2, "ShakeConfiguration(shakeThresholdGravity=", ", minDelayBetweenHidingBalanceMs=", ", minWindowSizeMs=");
        vfc.u(i3, i4, ", maxWindowSizeMs=", ", queueSize=", s);
        return oyr.m(i5, Extension.C_BRAKE, s);
    }
}
