package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponse;", "", "layoutId", "", "eventId", "url", "name", "dropSessionsWithoutFullscreensOnShow", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLayoutId", "()Ljava/lang/String;", "getEventId", "getUrl", "getName", "getDropSessionsWithoutFullscreensOnShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponse;", "equals", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardFullScreenResponse {
    private final Boolean dropSessionsWithoutFullscreensOnShow;
    private final String eventId;
    private final String layoutId;
    private final String name;
    private final String url;

    public /* synthetic */ DashboardFullScreenResponse(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, bool);
    }

    public static /* synthetic */ DashboardFullScreenResponse copy$default(DashboardFullScreenResponse dashboardFullScreenResponse, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardFullScreenResponse.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = dashboardFullScreenResponse.eventId;
        }
        if ((i & 4) != 0) {
            str3 = dashboardFullScreenResponse.url;
        }
        if ((i & 8) != 0) {
            str4 = dashboardFullScreenResponse.name;
        }
        if ((i & 16) != 0) {
            bool = dashboardFullScreenResponse.dropSessionsWithoutFullscreensOnShow;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return dashboardFullScreenResponse.copy(str, str2, str5, str4, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getDropSessionsWithoutFullscreensOnShow() {
        return this.dropSessionsWithoutFullscreensOnShow;
    }

    public final DashboardFullScreenResponse copy(@Json(name = "layout_id") String layoutId, @Json(name = "event_id") String eventId, @Json(name = "url") String url, @Json(name = "name") String name, @Json(name = "drop_sessions_without_fullscreens_on_show") Boolean dropSessionsWithoutFullscreensOnShow) {
        return new DashboardFullScreenResponse(layoutId, eventId, url, name, dropSessionsWithoutFullscreensOnShow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardFullScreenResponse)) {
            return false;
        }
        DashboardFullScreenResponse dashboardFullScreenResponse = (DashboardFullScreenResponse) other;
        return jl40.l(this.layoutId, dashboardFullScreenResponse.layoutId) && jl40.l(this.eventId, dashboardFullScreenResponse.eventId) && jl40.l(this.url, dashboardFullScreenResponse.url) && jl40.l(this.name, dashboardFullScreenResponse.name) && jl40.l(this.dropSessionsWithoutFullscreensOnShow, dashboardFullScreenResponse.dropSessionsWithoutFullscreensOnShow);
    }

    public final Boolean getDropSessionsWithoutFullscreensOnShow() {
        return this.dropSessionsWithoutFullscreensOnShow;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.layoutId;
        int b = unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.eventId), 31, this.url);
        String str2 = this.name;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.dropSessionsWithoutFullscreensOnShow;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.eventId;
        String str3 = this.url;
        String str4 = this.name;
        Boolean bool = this.dropSessionsWithoutFullscreensOnShow;
        StringBuilder v = b64.v("DashboardFullScreenResponse(layoutId=", str, ", eventId=", str2, ", url=");
        g8e.D(v, str3, ", name=", str4, ", dropSessionsWithoutFullscreensOnShow=");
        return nzs.d(v, bool, Extension.C_BRAKE);
    }

    public DashboardFullScreenResponse(@Json(name = "layout_id") String str, @Json(name = "event_id") String str2, @Json(name = "url") String str3, @Json(name = "name") String str4, @Json(name = "drop_sessions_without_fullscreens_on_show") Boolean bool) {
        this.layoutId = str;
        this.eventId = str2;
        this.url = str3;
        this.name = str4;
        this.dropSessionsWithoutFullscreensOnShow = bool;
    }
}
