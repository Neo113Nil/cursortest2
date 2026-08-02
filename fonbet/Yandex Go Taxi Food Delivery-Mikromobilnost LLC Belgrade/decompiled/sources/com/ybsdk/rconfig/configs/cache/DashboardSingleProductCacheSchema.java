package com.ybsdk.rconfig.configs.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ybsdk/rconfig/configs/cache/DashboardSingleProductCacheSchema;", "", "", "", "enabledFor", "", "version", "", "slowUpdateNoticeDelayMs", "", "postponeScreenAnimationEnabled", "<init>", "(Ljava/util/List;IJLjava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()J", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;IJLjava/lang/Boolean;)Lcom/ybsdk/rconfig/configs/cache/DashboardSingleProductCacheSchema;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEnabledFor", CA20Status.STATUS_USER_I, "getVersion", "J", "getSlowUpdateNoticeDelayMs", "Ljava/lang/Boolean;", "getPostponeScreenAnimationEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DashboardSingleProductCacheSchema {

    @Json(name = "enabled_for_product_ids")
    private final List<String> enabledFor;

    @Json(name = "postpone_screen_animation_enabled")
    private final Boolean postponeScreenAnimationEnabled;

    @Json(name = "slow_update_notice_delay_ms")
    private final long slowUpdateNoticeDelayMs;

    @Json(name = "version")
    private final int version;

    public DashboardSingleProductCacheSchema(List<String> list, int i, long j, Boolean bool) {
        this.enabledFor = list;
        this.version = i;
        this.slowUpdateNoticeDelayMs = j;
        this.postponeScreenAnimationEnabled = bool;
    }

    public static /* synthetic */ DashboardSingleProductCacheSchema copy$default(DashboardSingleProductCacheSchema dashboardSingleProductCacheSchema, List list, int i, long j, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = dashboardSingleProductCacheSchema.enabledFor;
        }
        if ((i2 & 2) != 0) {
            i = dashboardSingleProductCacheSchema.version;
        }
        if ((i2 & 4) != 0) {
            j = dashboardSingleProductCacheSchema.slowUpdateNoticeDelayMs;
        }
        if ((i2 & 8) != 0) {
            bool = dashboardSingleProductCacheSchema.postponeScreenAnimationEnabled;
        }
        Boolean bool2 = bool;
        return dashboardSingleProductCacheSchema.copy(list, i, j, bool2);
    }

    public final List<String> component1() {
        return this.enabledFor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSlowUpdateNoticeDelayMs() {
        return this.slowUpdateNoticeDelayMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getPostponeScreenAnimationEnabled() {
        return this.postponeScreenAnimationEnabled;
    }

    public final DashboardSingleProductCacheSchema copy(List<String> enabledFor, int version, long slowUpdateNoticeDelayMs, Boolean postponeScreenAnimationEnabled) {
        return new DashboardSingleProductCacheSchema(enabledFor, version, slowUpdateNoticeDelayMs, postponeScreenAnimationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardSingleProductCacheSchema)) {
            return false;
        }
        DashboardSingleProductCacheSchema dashboardSingleProductCacheSchema = (DashboardSingleProductCacheSchema) other;
        return jl40.l(this.enabledFor, dashboardSingleProductCacheSchema.enabledFor) && this.version == dashboardSingleProductCacheSchema.version && this.slowUpdateNoticeDelayMs == dashboardSingleProductCacheSchema.slowUpdateNoticeDelayMs && jl40.l(this.postponeScreenAnimationEnabled, dashboardSingleProductCacheSchema.postponeScreenAnimationEnabled);
    }

    public final List<String> getEnabledFor() {
        return this.enabledFor;
    }

    public final Boolean getPostponeScreenAnimationEnabled() {
        return this.postponeScreenAnimationEnabled;
    }

    public long getSlowUpdateNoticeDelayMs() {
        return this.slowUpdateNoticeDelayMs;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int c = qv10.c(oyr.b(this.version, this.enabledFor.hashCode() * 31, 31), 31, this.slowUpdateNoticeDelayMs);
        Boolean bool = this.postponeScreenAnimationEnabled;
        return c + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "DashboardSingleProductCacheSchema(enabledFor=" + this.enabledFor + ", version=" + this.version + ", slowUpdateNoticeDelayMs=" + this.slowUpdateNoticeDelayMs + ", postponeScreenAnimationEnabled=" + this.postponeScreenAnimationEnabled + Extension.C_BRAKE;
    }
}
