package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationData;", "", "id", "", "name", "", "version", "public", "", "<init>", "(JLjava/lang/String;JZ)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getVersion", "getPublic", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrganizationData {
    private final long id;
    private final String name;
    private final boolean public;
    private final long version;

    public OrganizationData(@Json(name = "organization_id") long j, @Json(name = "name") String str, @Json(name = "version") long j2, @Json(name = "public") boolean z) {
        this.id = j;
        this.name = str;
        this.version = j2;
        this.public = z;
    }

    public static /* synthetic */ OrganizationData copy$default(OrganizationData organizationData, long j, String str, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = organizationData.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = organizationData.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = organizationData.version;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = organizationData.public;
        }
        return organizationData.copy(j3, str2, j4, z);
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
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPublic() {
        return this.public;
    }

    public final OrganizationData copy(@Json(name = "organization_id") long id, @Json(name = "name") String name, @Json(name = "version") long version, @Json(name = "public") boolean r6) {
        return new OrganizationData(id, name, version, r6);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationData)) {
            return false;
        }
        OrganizationData organizationData = (OrganizationData) other;
        return this.id == organizationData.id && jl40.l(this.name, organizationData.name) && this.version == organizationData.version && this.public == organizationData.public;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPublic() {
        return this.public;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Boolean.hashCode(this.public) + qv10.c(unr0.b(Long.hashCode(this.id) * 31, 31, this.name), 31, this.version);
    }

    public String toString() {
        long j = this.id;
        String str = this.name;
        long j2 = this.version;
        boolean z = this.public;
        StringBuilder k = x4e.k("OrganizationData(id=", j, ", name=", str);
        x4e.A(j2, ", version=", ", public=", k);
        return x4e.i(k, z, Extension.C_BRAKE);
    }
}
