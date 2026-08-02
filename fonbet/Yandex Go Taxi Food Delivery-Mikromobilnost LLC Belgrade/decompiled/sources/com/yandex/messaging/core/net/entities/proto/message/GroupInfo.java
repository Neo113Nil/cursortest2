package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/GroupInfo;", "", "organizationId", "", "id", "name", "", "version", "<init>", "(JJLjava/lang/String;J)V", "getOrganizationId", "()J", "getId", "getName", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GroupInfo {

    @Json(name = "GroupId")
    @xuf0(tag = 2)
    private final long id;

    @Json(name = PlusAcquisitionSmartOffer.Texts.NAME)
    @xuf0(tag = 3)
    private final String name;

    @Json(name = "OrganizationId")
    @xuf0(tag = 1)
    private final long organizationId;

    @Json(name = "Version")
    @xuf0(tag = 4)
    private final long version;

    public GroupInfo(long j, long j2, String str, long j3) {
        this.organizationId = j;
        this.id = j2;
        this.name = str;
        this.version = j3;
    }

    public static /* synthetic */ GroupInfo copy$default(GroupInfo groupInfo, long j, long j2, String str, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = groupInfo.organizationId;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = groupInfo.id;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            str = groupInfo.name;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j3 = groupInfo.version;
        }
        return groupInfo.copy(j4, j5, str2, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final GroupInfo copy(long organizationId, long id, String name, long version) {
        return new GroupInfo(organizationId, id, name, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) other;
        return this.organizationId == groupInfo.organizationId && this.id == groupInfo.id && jl40.l(this.name, groupInfo.name) && this.version == groupInfo.version;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOrganizationId() {
        return this.organizationId;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Long.hashCode(this.version) + unr0.b(qv10.c(Long.hashCode(this.organizationId) * 31, 31, this.id), 31, this.name);
    }

    public String toString() {
        long j = this.organizationId;
        long j2 = this.id;
        String str = this.name;
        long j3 = this.version;
        StringBuilder w = unr0.w(j, "GroupInfo(organizationId=", ", id=");
        uw51.v(j2, ", name=", str, w);
        return g8e.l(j3, ", version=", Extension.C_BRAKE, w);
    }
}
