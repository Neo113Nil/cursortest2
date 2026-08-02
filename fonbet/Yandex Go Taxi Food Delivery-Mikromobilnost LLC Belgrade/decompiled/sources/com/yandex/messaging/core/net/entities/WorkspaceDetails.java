package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.gsq0;
import defpackage.jl40;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/WorkspaceDetails;", "", "ns", "", "", "", "bots", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getNs", "()Ljava/util/Map;", "getBots", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WorkspaceDetails {
    private final Map<String, Long> bots;
    private final Map<String, Long> ns;

    public WorkspaceDetails(@Json(name = "Ns") Map<String, Long> map, @Json(name = "Bots") Map<String, Long> map2) {
        this.ns = map;
        this.bots = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkspaceDetails copy$default(WorkspaceDetails workspaceDetails, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = workspaceDetails.ns;
        }
        if ((i & 2) != 0) {
            map2 = workspaceDetails.bots;
        }
        return workspaceDetails.copy(map, map2);
    }

    public final Map<String, Long> component1() {
        return this.ns;
    }

    public final Map<String, Long> component2() {
        return this.bots;
    }

    public final WorkspaceDetails copy(@Json(name = "Ns") Map<String, Long> ns, @Json(name = "Bots") Map<String, Long> bots) {
        return new WorkspaceDetails(ns, bots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkspaceDetails)) {
            return false;
        }
        WorkspaceDetails workspaceDetails = (WorkspaceDetails) other;
        return jl40.l(this.ns, workspaceDetails.ns) && jl40.l(this.bots, workspaceDetails.bots);
    }

    public final Map<String, Long> getBots() {
        return this.bots;
    }

    public final Map<String, Long> getNs() {
        return this.ns;
    }

    public int hashCode() {
        Map<String, Long> map = this.ns;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Long> map2 = this.bots;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "WorkspaceDetails(ns=" + this.ns + ", bots=" + this.bots + Extension.C_BRAKE;
    }
}
