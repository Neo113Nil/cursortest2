package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006)"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationSearchData;", "", "id", "", "organizationName", "", "position", "department", "Lcom/yandex/messaging/core/net/entities/DepartmentSearchData;", "isGuest", "", "deleted", "guestName", "displayName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/DepartmentSearchData;ZZLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getOrganizationName", "()Ljava/lang/String;", "getPosition", "getDepartment", "()Lcom/yandex/messaging/core/net/entities/DepartmentSearchData;", "()Z", "getDeleted", "getGuestName", "getDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrganizationSearchData {
    private final boolean deleted;
    private final DepartmentSearchData department;
    private final String displayName;
    private final String guestName;
    private final long id;
    private final boolean isGuest;
    private final String organizationName;
    private final String position;

    public OrganizationSearchData(@Json(name = "organization_id") long j, @Json(name = "organization_name") String str, @Json(name = "position") String str2, @Json(name = "department") DepartmentSearchData departmentSearchData, @Json(name = "is_guest") boolean z, @Json(name = "deleted") boolean z2, @Json(name = "guest_organization_name") String str3, @Json(name = "display_name") String str4) {
        this.id = j;
        this.organizationName = str;
        this.position = str2;
        this.department = departmentSearchData;
        this.isGuest = z;
        this.deleted = z2;
        this.guestName = str3;
        this.displayName = str4;
    }

    public static /* synthetic */ OrganizationSearchData copy$default(OrganizationSearchData organizationSearchData, long j, String str, String str2, DepartmentSearchData departmentSearchData, boolean z, boolean z2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = organizationSearchData.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = organizationSearchData.organizationName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = organizationSearchData.position;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            departmentSearchData = organizationSearchData.department;
        }
        return organizationSearchData.copy(j2, str5, str6, departmentSearchData, (i & 16) != 0 ? organizationSearchData.isGuest : z, (i & 32) != 0 ? organizationSearchData.deleted : z2, (i & 64) != 0 ? organizationSearchData.guestName : str3, (i & 128) != 0 ? organizationSearchData.displayName : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrganizationName() {
        return this.organizationName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final DepartmentSearchData getDepartment() {
        return this.department;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsGuest() {
        return this.isGuest;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGuestName() {
        return this.guestName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final OrganizationSearchData copy(@Json(name = "organization_id") long id, @Json(name = "organization_name") String organizationName, @Json(name = "position") String position, @Json(name = "department") DepartmentSearchData department, @Json(name = "is_guest") boolean isGuest, @Json(name = "deleted") boolean deleted, @Json(name = "guest_organization_name") String guestName, @Json(name = "display_name") String displayName) {
        return new OrganizationSearchData(id, organizationName, position, department, isGuest, deleted, guestName, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationSearchData)) {
            return false;
        }
        OrganizationSearchData organizationSearchData = (OrganizationSearchData) other;
        return this.id == organizationSearchData.id && jl40.l(this.organizationName, organizationSearchData.organizationName) && jl40.l(this.position, organizationSearchData.position) && jl40.l(this.department, organizationSearchData.department) && this.isGuest == organizationSearchData.isGuest && this.deleted == organizationSearchData.deleted && jl40.l(this.guestName, organizationSearchData.guestName) && jl40.l(this.displayName, organizationSearchData.displayName);
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final DepartmentSearchData getDepartment() {
        return this.department;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGuestName() {
        return this.guestName;
    }

    public final long getId() {
        return this.id;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.organizationName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.position;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DepartmentSearchData departmentSearchData = this.department;
        int e = unr0.e(unr0.e((hashCode3 + (departmentSearchData == null ? 0 : departmentSearchData.hashCode())) * 31, 31, this.isGuest), 31, this.deleted);
        String str3 = this.guestName;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public String toString() {
        long j = this.id;
        String str = this.organizationName;
        String str2 = this.position;
        DepartmentSearchData departmentSearchData = this.department;
        boolean z = this.isGuest;
        boolean z2 = this.deleted;
        String str3 = this.guestName;
        String str4 = this.displayName;
        StringBuilder k = x4e.k("OrganizationSearchData(id=", j, ", organizationName=", str);
        k.append(", position=");
        k.append(str2);
        k.append(", department=");
        k.append(departmentSearchData);
        n.z(", isGuest=", ", deleted=", k, z, z2);
        g8e.D(k, ", guestName=", str3, ", displayName=", str4);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    public /* synthetic */ OrganizationSearchData(long j, String str, String str2, DepartmentSearchData departmentSearchData, boolean z, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, departmentSearchData, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, str3, (i & 128) != 0 ? null : str4);
    }
}
