package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UnreadCountResponse;", "", "unreadCount", "", "lastUnreadTsMcs", "ttl", "workspaceDetails", "Lcom/yandex/messaging/core/net/entities/WorkspaceDetails;", "<init>", "(JJJLcom/yandex/messaging/core/net/entities/WorkspaceDetails;)V", "getUnreadCount", "()J", "getLastUnreadTsMcs", "getTtl", "getWorkspaceDetails", "()Lcom/yandex/messaging/core/net/entities/WorkspaceDetails;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UnreadCountResponse {
    private final long lastUnreadTsMcs;
    private final long ttl;
    private final long unreadCount;
    private final WorkspaceDetails workspaceDetails;

    public /* synthetic */ UnreadCountResponse(long j, long j2, long j3, WorkspaceDetails workspaceDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, workspaceDetails);
    }

    public static /* synthetic */ UnreadCountResponse copy$default(UnreadCountResponse unreadCountResponse, long j, long j2, long j3, WorkspaceDetails workspaceDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            j = unreadCountResponse.unreadCount;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = unreadCountResponse.lastUnreadTsMcs;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = unreadCountResponse.ttl;
        }
        long j6 = j3;
        if ((i & 8) != 0) {
            workspaceDetails = unreadCountResponse.workspaceDetails;
        }
        return unreadCountResponse.copy(j4, j5, j6, workspaceDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLastUnreadTsMcs() {
        return this.lastUnreadTsMcs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* renamed from: component4, reason: from getter */
    public final WorkspaceDetails getWorkspaceDetails() {
        return this.workspaceDetails;
    }

    public final UnreadCountResponse copy(@Json(name = "UnreadCount") long unreadCount, @Json(name = "LastUnreadTsMcs") long lastUnreadTsMcs, @Json(name = "Ttl") long ttl, @Json(name = "Details") WorkspaceDetails workspaceDetails) {
        return new UnreadCountResponse(unreadCount, lastUnreadTsMcs, ttl, workspaceDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadCountResponse)) {
            return false;
        }
        UnreadCountResponse unreadCountResponse = (UnreadCountResponse) other;
        return this.unreadCount == unreadCountResponse.unreadCount && this.lastUnreadTsMcs == unreadCountResponse.lastUnreadTsMcs && this.ttl == unreadCountResponse.ttl && jl40.l(this.workspaceDetails, unreadCountResponse.workspaceDetails);
    }

    public final long getLastUnreadTsMcs() {
        return this.lastUnreadTsMcs;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final long getUnreadCount() {
        return this.unreadCount;
    }

    public final WorkspaceDetails getWorkspaceDetails() {
        return this.workspaceDetails;
    }

    public int hashCode() {
        int c = qv10.c(qv10.c(Long.hashCode(this.unreadCount) * 31, 31, this.lastUnreadTsMcs), 31, this.ttl);
        WorkspaceDetails workspaceDetails = this.workspaceDetails;
        return c + (workspaceDetails == null ? 0 : workspaceDetails.hashCode());
    }

    public String toString() {
        long j = this.unreadCount;
        long j2 = this.lastUnreadTsMcs;
        long j3 = this.ttl;
        WorkspaceDetails workspaceDetails = this.workspaceDetails;
        StringBuilder w = unr0.w(j, "UnreadCountResponse(unreadCount=", ", lastUnreadTsMcs=");
        w.append(j2);
        x4e.A(j3, ", ttl=", ", workspaceDetails=", w);
        w.append(workspaceDetails);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }

    public UnreadCountResponse(@Json(name = "UnreadCount") long j, @Json(name = "LastUnreadTsMcs") long j2, @Json(name = "Ttl") long j3, @Json(name = "Details") WorkspaceDetails workspaceDetails) {
        this.unreadCount = j;
        this.lastUnreadTsMcs = j2;
        this.ttl = j3;
        this.workspaceDetails = workspaceDetails;
    }
}
