package com.yandex.messaging.core.net.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "Landroid/os/Parcelable;", "", "id", "organizationId", "<init>", "(JJ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "copy", "(JJ)Lcom/yandex/messaging/core/net/entities/GroupDepartmentRef;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "getOrganizationId", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GroupDepartmentRef implements Parcelable {
    public static final Parcelable.Creator<GroupDepartmentRef> CREATOR = new Creator();

    @Json(name = "id")
    private final long id;

    @Json(name = "organization_id")
    private final long organizationId;

    public GroupDepartmentRef(long j, long j2) {
        this.id = j;
        this.organizationId = j2;
    }

    public static /* synthetic */ GroupDepartmentRef copy$default(GroupDepartmentRef groupDepartmentRef, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = groupDepartmentRef.id;
        }
        if ((i & 2) != 0) {
            j2 = groupDepartmentRef.organizationId;
        }
        return groupDepartmentRef.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOrganizationId() {
        return this.organizationId;
    }

    public final GroupDepartmentRef copy(long id, long organizationId) {
        return new GroupDepartmentRef(id, organizationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupDepartmentRef)) {
            return false;
        }
        GroupDepartmentRef groupDepartmentRef = (GroupDepartmentRef) other;
        return this.id == groupDepartmentRef.id && this.organizationId == groupDepartmentRef.organizationId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getOrganizationId() {
        return this.organizationId;
    }

    public int hashCode() {
        return Long.hashCode(this.organizationId) + (Long.hashCode(this.id) * 31);
    }

    public String toString() {
        return oyr.n(this.organizationId, Extension.C_BRAKE, unr0.w(this.id, "GroupDepartmentRef(id=", ", organizationId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeLong(this.organizationId);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupDepartmentRef> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupDepartmentRef createFromParcel(Parcel parcel) {
            return new GroupDepartmentRef(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupDepartmentRef[] newArray(int i) {
            return new GroupDepartmentRef[i];
        }
    }
}
