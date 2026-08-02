package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ybsdk/rconfig/configs/WebViewRedirectStallRetryConfig;", "", "", "isEnabled", "", "stallTimeoutMs", "statusCheckTimeoutMs", "statusCheckPollIntervalMs", "initDelayMs", "<init>", "(ZJLjava/lang/Long;Ljava/lang/Long;J)V", "component1", "()Z", "component2", "()J", "component3", "()Ljava/lang/Long;", "component4", "component5", "copy", "(ZJLjava/lang/Long;Ljava/lang/Long;J)Lcom/ybsdk/rconfig/configs/WebViewRedirectStallRetryConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "J", "getStallTimeoutMs", "Ljava/lang/Long;", "getStatusCheckTimeoutMs", "getStatusCheckPollIntervalMs", "getInitDelayMs", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WebViewRedirectStallRetryConfig {

    @Json(name = "init_delay_ms")
    private final long initDelayMs;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "stall_timeout_ms")
    private final long stallTimeoutMs;

    @Json(name = "status_check_poll_interval_ms")
    private final Long statusCheckPollIntervalMs;

    @Json(name = "status_check_timeout_ms")
    private final Long statusCheckTimeoutMs;

    public WebViewRedirectStallRetryConfig(boolean z, long j, Long l, Long l2, long j2) {
        this.isEnabled = z;
        this.stallTimeoutMs = j;
        this.statusCheckTimeoutMs = l;
        this.statusCheckPollIntervalMs = l2;
        this.initDelayMs = j2;
    }

    public static /* synthetic */ WebViewRedirectStallRetryConfig copy$default(WebViewRedirectStallRetryConfig webViewRedirectStallRetryConfig, boolean z, long j, Long l, Long l2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webViewRedirectStallRetryConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            j = webViewRedirectStallRetryConfig.stallTimeoutMs;
        }
        if ((i & 4) != 0) {
            l = webViewRedirectStallRetryConfig.statusCheckTimeoutMs;
        }
        if ((i & 8) != 0) {
            l2 = webViewRedirectStallRetryConfig.statusCheckPollIntervalMs;
        }
        if ((i & 16) != 0) {
            j2 = webViewRedirectStallRetryConfig.initDelayMs;
        }
        return webViewRedirectStallRetryConfig.copy(z, j, l, l2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStallTimeoutMs() {
        return this.stallTimeoutMs;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getStatusCheckTimeoutMs() {
        return this.statusCheckTimeoutMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getStatusCheckPollIntervalMs() {
        return this.statusCheckPollIntervalMs;
    }

    /* renamed from: component5, reason: from getter */
    public final long getInitDelayMs() {
        return this.initDelayMs;
    }

    public final WebViewRedirectStallRetryConfig copy(boolean isEnabled, long stallTimeoutMs, Long statusCheckTimeoutMs, Long statusCheckPollIntervalMs, long initDelayMs) {
        return new WebViewRedirectStallRetryConfig(isEnabled, stallTimeoutMs, statusCheckTimeoutMs, statusCheckPollIntervalMs, initDelayMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewRedirectStallRetryConfig)) {
            return false;
        }
        WebViewRedirectStallRetryConfig webViewRedirectStallRetryConfig = (WebViewRedirectStallRetryConfig) other;
        return this.isEnabled == webViewRedirectStallRetryConfig.isEnabled && this.stallTimeoutMs == webViewRedirectStallRetryConfig.stallTimeoutMs && jl40.l(this.statusCheckTimeoutMs, webViewRedirectStallRetryConfig.statusCheckTimeoutMs) && jl40.l(this.statusCheckPollIntervalMs, webViewRedirectStallRetryConfig.statusCheckPollIntervalMs) && this.initDelayMs == webViewRedirectStallRetryConfig.initDelayMs;
    }

    public final long getInitDelayMs() {
        return this.initDelayMs;
    }

    public final long getStallTimeoutMs() {
        return this.stallTimeoutMs;
    }

    public final Long getStatusCheckPollIntervalMs() {
        return this.statusCheckPollIntervalMs;
    }

    public final Long getStatusCheckTimeoutMs() {
        return this.statusCheckTimeoutMs;
    }

    public int hashCode() {
        int c = qv10.c(Boolean.hashCode(this.isEnabled) * 31, 31, this.stallTimeoutMs);
        Long l = this.statusCheckTimeoutMs;
        int hashCode = (c + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.statusCheckPollIntervalMs;
        return Long.hashCode(this.initDelayMs) + ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        long j = this.stallTimeoutMs;
        Long l = this.statusCheckTimeoutMs;
        Long l2 = this.statusCheckPollIntervalMs;
        long j2 = this.initDelayMs;
        StringBuilder sb = new StringBuilder("WebViewRedirectStallRetryConfig(isEnabled=");
        sb.append(z);
        sb.append(", stallTimeoutMs=");
        sb.append(j);
        sb.append(", statusCheckTimeoutMs=");
        sb.append(l);
        sb.append(", statusCheckPollIntervalMs=");
        sb.append(l2);
        return g8e.l(j2, ", initDelayMs=", Extension.C_BRAKE, sb);
    }
}
