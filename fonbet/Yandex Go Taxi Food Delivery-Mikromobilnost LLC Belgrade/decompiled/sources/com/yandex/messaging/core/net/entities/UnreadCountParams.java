package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UnreadCountParams;", "", "workspaceId", "", "namespaces", "", "", "detailedWorkspace", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getWorkspaceId", "()Ljava/lang/String;", "getNamespaces", "()Ljava/util/List;", "getDetailedWorkspace", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UnreadCountParams {
    private final boolean detailedWorkspace;
    private final List<Long> namespaces;
    private final String workspaceId;

    public UnreadCountParams(@Json(name = "Client") String str, @Json(name = "Namespaces") List<Long> list, @Json(name = "DetailedWorkspace") boolean z) {
        this.workspaceId = str;
        this.namespaces = list;
        this.detailedWorkspace = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadCountParams copy$default(UnreadCountParams unreadCountParams, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unreadCountParams.workspaceId;
        }
        if ((i & 2) != 0) {
            list = unreadCountParams.namespaces;
        }
        if ((i & 4) != 0) {
            z = unreadCountParams.detailedWorkspace;
        }
        return unreadCountParams.copy(str, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWorkspaceId() {
        return this.workspaceId;
    }

    public final List<Long> component2() {
        return this.namespaces;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDetailedWorkspace() {
        return this.detailedWorkspace;
    }

    public final UnreadCountParams copy(@Json(name = "Client") String workspaceId, @Json(name = "Namespaces") List<Long> namespaces, @Json(name = "DetailedWorkspace") boolean detailedWorkspace) {
        return new UnreadCountParams(workspaceId, namespaces, detailedWorkspace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadCountParams)) {
            return false;
        }
        UnreadCountParams unreadCountParams = (UnreadCountParams) other;
        return jl40.l(this.workspaceId, unreadCountParams.workspaceId) && jl40.l(this.namespaces, unreadCountParams.namespaces) && this.detailedWorkspace == unreadCountParams.detailedWorkspace;
    }

    public final boolean getDetailedWorkspace() {
        return this.detailedWorkspace;
    }

    public final List<Long> getNamespaces() {
        return this.namespaces;
    }

    public final String getWorkspaceId() {
        return this.workspaceId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.detailedWorkspace) + unr0.c(this.workspaceId.hashCode() * 31, 31, this.namespaces);
    }

    public String toString() {
        String str = this.workspaceId;
        List<Long> list = this.namespaces;
        return x4e.i(xvz.r("UnreadCountParams(workspaceId=", str, ", namespaces=", list, ", detailedWorkspace="), this.detailedWorkspace, Extension.C_BRAKE);
    }
}
