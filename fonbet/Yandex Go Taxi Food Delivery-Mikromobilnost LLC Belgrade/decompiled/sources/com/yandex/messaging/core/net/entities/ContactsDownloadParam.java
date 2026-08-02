package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JD\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactsDownloadParam;", "", "version", "", "offsetVersion", "offsetGuid", "", "withoutDeleted", "", "limit", "<init>", "(JLjava/lang/Long;Ljava/lang/String;ZJ)V", "getVersion", "()J", "getOffsetVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOffsetGuid", "()Ljava/lang/String;", "getWithoutDeleted", "()Z", "getLimit", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Ljava/lang/String;ZJ)Lcom/yandex/messaging/core/net/entities/ContactsDownloadParam;", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ContactsDownloadParam {
    private final long limit;
    private final String offsetGuid;
    private final Long offsetVersion;
    private final long version;
    private final boolean withoutDeleted;

    public /* synthetic */ ContactsDownloadParam(long j, Long l, String str, boolean z, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, l, str, z, (i & 16) != 0 ? 500L : j2);
    }

    public static /* synthetic */ ContactsDownloadParam copy$default(ContactsDownloadParam contactsDownloadParam, long j, Long l, String str, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contactsDownloadParam.version;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            l = contactsDownloadParam.offsetVersion;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str = contactsDownloadParam.offsetGuid;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = contactsDownloadParam.withoutDeleted;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j2 = contactsDownloadParam.limit;
        }
        return contactsDownloadParam.copy(j3, l2, str2, z2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getOffsetVersion() {
        return this.offsetVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOffsetGuid() {
        return this.offsetGuid;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getWithoutDeleted() {
        return this.withoutDeleted;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLimit() {
        return this.limit;
    }

    public final ContactsDownloadParam copy(@Json(name = "version") long version, @Json(name = "version_offset") Long offsetVersion, @Json(name = "guid_offset") String offsetGuid, @Json(name = "without_deleted") boolean withoutDeleted, @Json(name = "limit") long limit) {
        return new ContactsDownloadParam(version, offsetVersion, offsetGuid, withoutDeleted, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsDownloadParam)) {
            return false;
        }
        ContactsDownloadParam contactsDownloadParam = (ContactsDownloadParam) other;
        return this.version == contactsDownloadParam.version && jl40.l(this.offsetVersion, contactsDownloadParam.offsetVersion) && jl40.l(this.offsetGuid, contactsDownloadParam.offsetGuid) && this.withoutDeleted == contactsDownloadParam.withoutDeleted && this.limit == contactsDownloadParam.limit;
    }

    public final long getLimit() {
        return this.limit;
    }

    public final String getOffsetGuid() {
        return this.offsetGuid;
    }

    public final Long getOffsetVersion() {
        return this.offsetVersion;
    }

    public final long getVersion() {
        return this.version;
    }

    public final boolean getWithoutDeleted() {
        return this.withoutDeleted;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.version) * 31;
        Long l = this.offsetVersion;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.offsetGuid;
        return Long.hashCode(this.limit) + unr0.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.withoutDeleted);
    }

    public String toString() {
        long j = this.version;
        Long l = this.offsetVersion;
        String str = this.offsetGuid;
        boolean z = this.withoutDeleted;
        long j2 = this.limit;
        StringBuilder sb = new StringBuilder("ContactsDownloadParam(version=");
        sb.append(j);
        sb.append(", offsetVersion=");
        sb.append(l);
        uw51.x(", offsetGuid=", str, ", withoutDeleted=", sb, z);
        return g8e.l(j2, ", limit=", Extension.C_BRAKE, sb);
    }

    public ContactsDownloadParam(@Json(name = "version") long j, @Json(name = "version_offset") Long l, @Json(name = "guid_offset") String str, @Json(name = "without_deleted") boolean z, @Json(name = "limit") long j2) {
        this.version = j;
        this.offsetVersion = l;
        this.offsetGuid = str;
        this.withoutDeleted = z;
        this.limit = j2;
    }
}
