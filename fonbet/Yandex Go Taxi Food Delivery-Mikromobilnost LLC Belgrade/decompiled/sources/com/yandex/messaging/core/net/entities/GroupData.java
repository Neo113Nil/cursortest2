package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/yandex/messaging/core/net/entities/GroupData;", "", "id", "", "name", "", "organizationId", "organizationName", "version", "membersCount", "", "<init>", "(JLjava/lang/String;JLjava/lang/String;JI)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getOrganizationId", "getOrganizationName", "getVersion", "getMembersCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GroupData {

    @Json(name = "group_id")
    private final long id;

    @Json(name = "members_count")
    private final int membersCount;

    @Json(name = "name")
    private final String name;

    @Json(name = "organization_id")
    private final long organizationId;

    @Json(name = "organization_name")
    private final String organizationName;

    @Json(name = "version")
    private final long version;

    public GroupData(long j, String str, long j2, String str2, long j3, int i) {
        this.id = j;
        this.name = str;
        this.organizationId = j2;
        this.organizationName = str2;
        this.version = j3;
        this.membersCount = i;
    }

    public static /* synthetic */ GroupData copy$default(GroupData groupData, long j, String str, long j2, String str2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = groupData.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = groupData.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            j2 = groupData.organizationId;
        }
        return groupData.copy(j4, str3, j2, (i2 & 8) != 0 ? groupData.organizationName : str2, (i2 & 16) != 0 ? groupData.version : j3, (i2 & 32) != 0 ? groupData.membersCount : i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOrganizationName() {
        return this.organizationName;
    }

    /* renamed from: component5, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMembersCount() {
        return this.membersCount;
    }

    public final GroupData copy(long id, String name, long organizationId, String organizationName, long version, int membersCount) {
        return new GroupData(id, name, organizationId, organizationName, version, membersCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupData)) {
            return false;
        }
        GroupData groupData = (GroupData) other;
        return this.id == groupData.id && jl40.l(this.name, groupData.name) && this.organizationId == groupData.organizationId && jl40.l(this.organizationName, groupData.organizationName) && this.version == groupData.version && this.membersCount == groupData.membersCount;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMembersCount() {
        return this.membersCount;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOrganizationId() {
        return this.organizationId;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int c = qv10.c(unr0.b(Long.hashCode(this.id) * 31, 31, this.name), 31, this.organizationId);
        String str = this.organizationName;
        return Integer.hashCode(this.membersCount) + qv10.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.version);
    }

    public String toString() {
        long j = this.id;
        String str = this.name;
        long j2 = this.organizationId;
        String str2 = this.organizationName;
        long j3 = this.version;
        int i = this.membersCount;
        StringBuilder k = x4e.k("GroupData(id=", j, ", name=", str);
        x4e.A(j2, ", organizationId=", ", organizationName=", k);
        ly3.y(j3, str2, ", version=", k);
        return b64.q(k, ", membersCount=", i, Extension.C_BRAKE);
    }
}
