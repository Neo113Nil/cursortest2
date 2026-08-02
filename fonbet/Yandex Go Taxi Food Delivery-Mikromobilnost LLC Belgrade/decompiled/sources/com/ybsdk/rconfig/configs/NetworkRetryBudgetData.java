package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;", "", "isEnabled", "", "initialTokens", "", "maxTokens", "tokenRefillRatio", "<init>", "(ZDDD)V", "()Z", "getInitialTokens", "()D", "getMaxTokens", "getTokenRefillRatio", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkRetryBudgetData {

    @Json(name = "initial_tokens")
    private final double initialTokens;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "max_tokens")
    private final double maxTokens;

    @Json(name = "token_refill_ratio")
    private final double tokenRefillRatio;

    public NetworkRetryBudgetData(boolean z, double d, double d2, double d3) {
        this.isEnabled = z;
        this.initialTokens = d;
        this.maxTokens = d2;
        this.tokenRefillRatio = d3;
    }

    public static /* synthetic */ NetworkRetryBudgetData copy$default(NetworkRetryBudgetData networkRetryBudgetData, boolean z, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkRetryBudgetData.isEnabled;
        }
        if ((i & 2) != 0) {
            d = networkRetryBudgetData.initialTokens;
        }
        if ((i & 4) != 0) {
            d2 = networkRetryBudgetData.maxTokens;
        }
        if ((i & 8) != 0) {
            d3 = networkRetryBudgetData.tokenRefillRatio;
        }
        double d4 = d3;
        return networkRetryBudgetData.copy(z, d, d2, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final double getInitialTokens() {
        return this.initialTokens;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMaxTokens() {
        return this.maxTokens;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTokenRefillRatio() {
        return this.tokenRefillRatio;
    }

    public final NetworkRetryBudgetData copy(boolean isEnabled, double initialTokens, double maxTokens, double tokenRefillRatio) {
        return new NetworkRetryBudgetData(isEnabled, initialTokens, maxTokens, tokenRefillRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRetryBudgetData)) {
            return false;
        }
        NetworkRetryBudgetData networkRetryBudgetData = (NetworkRetryBudgetData) other;
        return this.isEnabled == networkRetryBudgetData.isEnabled && Double.compare(this.initialTokens, networkRetryBudgetData.initialTokens) == 0 && Double.compare(this.maxTokens, networkRetryBudgetData.maxTokens) == 0 && Double.compare(this.tokenRefillRatio, networkRetryBudgetData.tokenRefillRatio) == 0;
    }

    public final double getInitialTokens() {
        return this.initialTokens;
    }

    public final double getMaxTokens() {
        return this.maxTokens;
    }

    public final double getTokenRefillRatio() {
        return this.tokenRefillRatio;
    }

    public int hashCode() {
        return Double.hashCode(this.tokenRefillRatio) + unr0.a(unr0.a(Boolean.hashCode(this.isEnabled) * 31, 31, this.initialTokens), 31, this.maxTokens);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        double d = this.initialTokens;
        double d2 = this.maxTokens;
        double d3 = this.tokenRefillRatio;
        StringBuilder sb = new StringBuilder("NetworkRetryBudgetData(isEnabled=");
        sb.append(z);
        sb.append(", initialTokens=");
        sb.append(d);
        nzs.o(sb, ", maxTokens=", d2, ", tokenRefillRatio=");
        return nzs.c(sb, d3, Extension.C_BRAKE);
    }
}
