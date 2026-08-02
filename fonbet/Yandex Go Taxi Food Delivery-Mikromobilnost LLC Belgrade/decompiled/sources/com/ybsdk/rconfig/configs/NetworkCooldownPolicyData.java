package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "", "minCooldownMs", "", "maxCooldownMs", "<init>", "(JJ)V", "getMinCooldownMs", "()J", "getMaxCooldownMs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkCooldownPolicyData {

    @Json(name = "max_cooldown_ms")
    private final long maxCooldownMs;

    @Json(name = "min_cooldown_ms")
    private final long minCooldownMs;

    public NetworkCooldownPolicyData(long j, long j2) {
        this.minCooldownMs = j;
        this.maxCooldownMs = j2;
    }

    public static /* synthetic */ NetworkCooldownPolicyData copy$default(NetworkCooldownPolicyData networkCooldownPolicyData, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = networkCooldownPolicyData.minCooldownMs;
        }
        if ((i & 2) != 0) {
            j2 = networkCooldownPolicyData.maxCooldownMs;
        }
        return networkCooldownPolicyData.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinCooldownMs() {
        return this.minCooldownMs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMaxCooldownMs() {
        return this.maxCooldownMs;
    }

    public final NetworkCooldownPolicyData copy(long minCooldownMs, long maxCooldownMs) {
        return new NetworkCooldownPolicyData(minCooldownMs, maxCooldownMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkCooldownPolicyData)) {
            return false;
        }
        NetworkCooldownPolicyData networkCooldownPolicyData = (NetworkCooldownPolicyData) other;
        return this.minCooldownMs == networkCooldownPolicyData.minCooldownMs && this.maxCooldownMs == networkCooldownPolicyData.maxCooldownMs;
    }

    public final long getMaxCooldownMs() {
        return this.maxCooldownMs;
    }

    public final long getMinCooldownMs() {
        return this.minCooldownMs;
    }

    public int hashCode() {
        return Long.hashCode(this.maxCooldownMs) + (Long.hashCode(this.minCooldownMs) * 31);
    }

    public String toString() {
        return oyr.n(this.maxCooldownMs, Extension.C_BRAKE, unr0.w(this.minCooldownMs, "NetworkCooldownPolicyData(minCooldownMs=", ", maxCooldownMs="));
    }
}
