package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbUiStatEventConfig;", "", "", "maxQueueSize", "", "sendDebounceMs", "<init>", "(IJ)V", "component1", "()I", "component2", "()J", "copy", "(IJ)Lcom/ybsdk/rconfig/configs/YbUiStatEventConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getMaxQueueSize", "J", "getSendDebounceMs", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbUiStatEventConfig {

    @Json(name = "max_queue_size")
    private final int maxQueueSize;

    @Json(name = "send_debounce_ms")
    private final long sendDebounceMs;

    public YbUiStatEventConfig(int i, long j) {
        this.maxQueueSize = i;
        this.sendDebounceMs = j;
    }

    public static /* synthetic */ YbUiStatEventConfig copy$default(YbUiStatEventConfig ybUiStatEventConfig, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ybUiStatEventConfig.maxQueueSize;
        }
        if ((i2 & 2) != 0) {
            j = ybUiStatEventConfig.sendDebounceMs;
        }
        return ybUiStatEventConfig.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSendDebounceMs() {
        return this.sendDebounceMs;
    }

    public final YbUiStatEventConfig copy(int maxQueueSize, long sendDebounceMs) {
        return new YbUiStatEventConfig(maxQueueSize, sendDebounceMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbUiStatEventConfig)) {
            return false;
        }
        YbUiStatEventConfig ybUiStatEventConfig = (YbUiStatEventConfig) other;
        return this.maxQueueSize == ybUiStatEventConfig.maxQueueSize && this.sendDebounceMs == ybUiStatEventConfig.sendDebounceMs;
    }

    public final int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public final long getSendDebounceMs() {
        return this.sendDebounceMs;
    }

    public int hashCode() {
        return Long.hashCode(this.sendDebounceMs) + (Integer.hashCode(this.maxQueueSize) * 31);
    }

    public String toString() {
        return "YbUiStatEventConfig(maxQueueSize=" + this.maxQueueSize + ", sendDebounceMs=" + this.sendDebounceMs + Extension.C_BRAKE;
    }
}
