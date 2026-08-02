package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "", "factor", "", "baseMs", "", "capMs", "timeoutMs", "delayMarginMs", "<init>", "(DJJJJ)V", "getFactor", "()D", "getBaseMs", "()J", "getCapMs", "getTimeoutMs", "getDelayMarginMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkRetryPolicyData {

    @Json(name = "base_ms")
    private final long baseMs;

    @Json(name = "cap_ms")
    private final long capMs;

    @Json(name = "delay_margin_ms")
    private final long delayMarginMs;

    @Json(name = "factor")
    private final double factor;

    @Json(name = "timeout_ms")
    private final long timeoutMs;

    public NetworkRetryPolicyData(double d, long j, long j2, long j3, long j4) {
        this.factor = d;
        this.baseMs = j;
        this.capMs = j2;
        this.timeoutMs = j3;
        this.delayMarginMs = j4;
    }

    public static /* synthetic */ NetworkRetryPolicyData copy$default(NetworkRetryPolicyData networkRetryPolicyData, double d, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = networkRetryPolicyData.factor;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            j = networkRetryPolicyData.baseMs;
        }
        return networkRetryPolicyData.copy(d2, j, (i & 4) != 0 ? networkRetryPolicyData.capMs : j2, (i & 8) != 0 ? networkRetryPolicyData.timeoutMs : j3, (i & 16) != 0 ? networkRetryPolicyData.delayMarginMs : j4);
    }

    /* renamed from: component1, reason: from getter */
    public final double getFactor() {
        return this.factor;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBaseMs() {
        return this.baseMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCapMs() {
        return this.capMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDelayMarginMs() {
        return this.delayMarginMs;
    }

    public final NetworkRetryPolicyData copy(double factor, long baseMs, long capMs, long timeoutMs, long delayMarginMs) {
        return new NetworkRetryPolicyData(factor, baseMs, capMs, timeoutMs, delayMarginMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRetryPolicyData)) {
            return false;
        }
        NetworkRetryPolicyData networkRetryPolicyData = (NetworkRetryPolicyData) other;
        return Double.compare(this.factor, networkRetryPolicyData.factor) == 0 && this.baseMs == networkRetryPolicyData.baseMs && this.capMs == networkRetryPolicyData.capMs && this.timeoutMs == networkRetryPolicyData.timeoutMs && this.delayMarginMs == networkRetryPolicyData.delayMarginMs;
    }

    public final long getBaseMs() {
        return this.baseMs;
    }

    public final long getCapMs() {
        return this.capMs;
    }

    public final long getDelayMarginMs() {
        return this.delayMarginMs;
    }

    public final double getFactor() {
        return this.factor;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return Long.hashCode(this.delayMarginMs) + qv10.c(qv10.c(qv10.c(Double.hashCode(this.factor) * 31, 31, this.baseMs), 31, this.capMs), 31, this.timeoutMs);
    }

    public String toString() {
        double d = this.factor;
        long j = this.baseMs;
        long j2 = this.capMs;
        long j3 = this.timeoutMs;
        long j4 = this.delayMarginMs;
        StringBuilder u = oyr.u(d, "NetworkRetryPolicyData(factor=", ", baseMs=");
        u.append(j);
        x4e.A(j2, ", capMs=", ", timeoutMs=", u);
        u.append(j3);
        return g8e.l(j4, ", delayMarginMs=", Extension.C_BRAKE, u);
    }
}
