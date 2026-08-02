package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbVideoPlayerConfig;", "", "", "exoLoadControlMinBufferMs", "exoLoadControlMaxBufferMs", "exoLoadControlBufferForPlaybackMs", "exoLoadControlBufferForPlaybackAfterRebufferMS", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/ybsdk/rconfig/configs/YbVideoPlayerConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getExoLoadControlMinBufferMs", "getExoLoadControlMaxBufferMs", "getExoLoadControlBufferForPlaybackMs", "getExoLoadControlBufferForPlaybackAfterRebufferMS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbVideoPlayerConfig {

    @Json(name = "exo_load_control_buffer_for_playback_after_rebuffer_ms")
    private final int exoLoadControlBufferForPlaybackAfterRebufferMS;

    @Json(name = "exo_load_control_buffer_for_playback_ms")
    private final int exoLoadControlBufferForPlaybackMs;

    @Json(name = "exo_load_control_max_buffer_ms")
    private final int exoLoadControlMaxBufferMs;

    @Json(name = "exo_load_control_min_buffer_ms")
    private final int exoLoadControlMinBufferMs;

    public /* synthetic */ YbVideoPlayerConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 50000 : i, (i5 & 2) != 0 ? 50000 : i2, (i5 & 4) != 0 ? 2500 : i3, (i5 & 8) != 0 ? 5000 : i4);
    }

    public static /* synthetic */ YbVideoPlayerConfig copy$default(YbVideoPlayerConfig ybVideoPlayerConfig, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = ybVideoPlayerConfig.exoLoadControlMinBufferMs;
        }
        if ((i5 & 2) != 0) {
            i2 = ybVideoPlayerConfig.exoLoadControlMaxBufferMs;
        }
        if ((i5 & 4) != 0) {
            i3 = ybVideoPlayerConfig.exoLoadControlBufferForPlaybackMs;
        }
        if ((i5 & 8) != 0) {
            i4 = ybVideoPlayerConfig.exoLoadControlBufferForPlaybackAfterRebufferMS;
        }
        return ybVideoPlayerConfig.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getExoLoadControlMinBufferMs() {
        return this.exoLoadControlMinBufferMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExoLoadControlMaxBufferMs() {
        return this.exoLoadControlMaxBufferMs;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExoLoadControlBufferForPlaybackMs() {
        return this.exoLoadControlBufferForPlaybackMs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExoLoadControlBufferForPlaybackAfterRebufferMS() {
        return this.exoLoadControlBufferForPlaybackAfterRebufferMS;
    }

    public final YbVideoPlayerConfig copy(int exoLoadControlMinBufferMs, int exoLoadControlMaxBufferMs, int exoLoadControlBufferForPlaybackMs, int exoLoadControlBufferForPlaybackAfterRebufferMS) {
        return new YbVideoPlayerConfig(exoLoadControlMinBufferMs, exoLoadControlMaxBufferMs, exoLoadControlBufferForPlaybackMs, exoLoadControlBufferForPlaybackAfterRebufferMS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbVideoPlayerConfig)) {
            return false;
        }
        YbVideoPlayerConfig ybVideoPlayerConfig = (YbVideoPlayerConfig) other;
        return this.exoLoadControlMinBufferMs == ybVideoPlayerConfig.exoLoadControlMinBufferMs && this.exoLoadControlMaxBufferMs == ybVideoPlayerConfig.exoLoadControlMaxBufferMs && this.exoLoadControlBufferForPlaybackMs == ybVideoPlayerConfig.exoLoadControlBufferForPlaybackMs && this.exoLoadControlBufferForPlaybackAfterRebufferMS == ybVideoPlayerConfig.exoLoadControlBufferForPlaybackAfterRebufferMS;
    }

    public final int getExoLoadControlBufferForPlaybackAfterRebufferMS() {
        return this.exoLoadControlBufferForPlaybackAfterRebufferMS;
    }

    public final int getExoLoadControlBufferForPlaybackMs() {
        return this.exoLoadControlBufferForPlaybackMs;
    }

    public final int getExoLoadControlMaxBufferMs() {
        return this.exoLoadControlMaxBufferMs;
    }

    public final int getExoLoadControlMinBufferMs() {
        return this.exoLoadControlMinBufferMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.exoLoadControlBufferForPlaybackAfterRebufferMS) + oyr.b(this.exoLoadControlBufferForPlaybackMs, oyr.b(this.exoLoadControlMaxBufferMs, Integer.hashCode(this.exoLoadControlMinBufferMs) * 31, 31), 31);
    }

    public String toString() {
        return ly3.k(this.exoLoadControlBufferForPlaybackMs, this.exoLoadControlBufferForPlaybackAfterRebufferMS, ", exoLoadControlBufferForPlaybackAfterRebufferMS=", Extension.C_BRAKE, b64.s(this.exoLoadControlMinBufferMs, this.exoLoadControlMaxBufferMs, "YbVideoPlayerConfig(exoLoadControlMinBufferMs=", ", exoLoadControlMaxBufferMs=", ", exoLoadControlBufferForPlaybackMs="));
    }

    public YbVideoPlayerConfig(int i, int i2, int i3, int i4) {
        this.exoLoadControlMinBufferMs = i;
        this.exoLoadControlMaxBufferMs = i2;
        this.exoLoadControlBufferForPlaybackMs = i3;
        this.exoLoadControlBufferForPlaybackAfterRebufferMS = i4;
    }

    public YbVideoPlayerConfig() {
        this(0, 0, 0, 0, 15, null);
    }
}
