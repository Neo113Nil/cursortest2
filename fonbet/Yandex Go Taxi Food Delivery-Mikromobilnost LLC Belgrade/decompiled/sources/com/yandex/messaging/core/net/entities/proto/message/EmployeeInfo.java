package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J^\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "Landroid/os/Parcelable;", "", "position", "", "organizationId", "organizationName", "", "isGuest", "guestOrganizationName", "deleted", "displayName", "<init>", "(Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPosition", "J", "getOrganizationId", "getOrganizationName", "Z", "getGuestOrganizationName", "getDeleted", "getDisplayName", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EmployeeInfo implements Parcelable {
    public static final Parcelable.Creator<EmployeeInfo> CREATOR = new Creator();

    @xuf0(tag = 8)
    private final boolean deleted;

    @xuf0(tag = 9)
    private final String displayName;

    @xuf0(tag = 7)
    private final String guestOrganizationName;

    @xuf0(tag = 6)
    private final boolean isGuest;

    @xuf0(tag = 3)
    private final long organizationId;

    @xuf0(tag = 4)
    private final String organizationName;

    @xuf0(tag = 2)
    private final String position;

    public /* synthetic */ EmployeeInfo(String str, long j, String str2, boolean z, String str3, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ EmployeeInfo copy$default(EmployeeInfo employeeInfo, String str, long j, String str2, boolean z, String str3, boolean z2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = employeeInfo.position;
        }
        if ((i & 2) != 0) {
            j = employeeInfo.organizationId;
        }
        if ((i & 4) != 0) {
            str2 = employeeInfo.organizationName;
        }
        if ((i & 8) != 0) {
            z = employeeInfo.isGuest;
        }
        if ((i & 16) != 0) {
            str3 = employeeInfo.guestOrganizationName;
        }
        if ((i & 32) != 0) {
            z2 = employeeInfo.deleted;
        }
        if ((i & 64) != 0) {
            str4 = employeeInfo.displayName;
        }
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        return employeeInfo.copy(str, j, str7, z, str6, z2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrganizationName() {
        return this.organizationName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGuest() {
        return this.isGuest;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGuestOrganizationName() {
        return this.guestOrganizationName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final EmployeeInfo copy(@Json(name = "Position") String position, @Json(name = "OrganizationId") long organizationId, @Json(name = "OrganizationName") String organizationName, @Json(name = "IsGuest") boolean isGuest, @Json(name = "GuestOrganizationName") String guestOrganizationName, @Json(name = "Deleted") boolean deleted, @Json(name = "DisplayName") String displayName) {
        return new EmployeeInfo(position, organizationId, organizationName, isGuest, guestOrganizationName, deleted, displayName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmployeeInfo)) {
            return false;
        }
        EmployeeInfo employeeInfo = (EmployeeInfo) other;
        return jl40.l(this.position, employeeInfo.position) && this.organizationId == employeeInfo.organizationId && jl40.l(this.organizationName, employeeInfo.organizationName) && this.isGuest == employeeInfo.isGuest && jl40.l(this.guestOrganizationName, employeeInfo.guestOrganizationName) && this.deleted == employeeInfo.deleted && jl40.l(this.displayName, employeeInfo.displayName);
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGuestOrganizationName() {
        return this.guestOrganizationName;
    }

    public final long getOrganizationId() {
        return this.organizationId;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        String str = this.position;
        int c = qv10.c((str == null ? 0 : str.hashCode()) * 31, 31, this.organizationId);
        String str2 = this.organizationName;
        int e = unr0.e((c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isGuest);
        String str3 = this.guestOrganizationName;
        int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.deleted);
        String str4 = this.displayName;
        return e2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public String toString() {
        String str = this.position;
        long j = this.organizationId;
        String str2 = this.organizationName;
        boolean z = this.isGuest;
        String str3 = this.guestOrganizationName;
        boolean z2 = this.deleted;
        String str4 = this.displayName;
        StringBuilder l = x4e.l("EmployeeInfo(position=", str, ", organizationId=", j);
        uw51.x(", organizationName=", str2, ", isGuest=", l, z);
        uw51.x(", guestOrganizationName=", str3, ", deleted=", l, z2);
        return unr0.r(l, ", displayName=", str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.position);
        dest.writeLong(this.organizationId);
        dest.writeString(this.organizationName);
        dest.writeInt(this.isGuest ? 1 : 0);
        dest.writeString(this.guestOrganizationName);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeString(this.displayName);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmployeeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new EmployeeInfo(readString, readLong, readString2, z3, readString3, z2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeInfo[] newArray(int i) {
            return new EmployeeInfo[i];
        }
    }

    public EmployeeInfo(@Json(name = "Position") String str, @Json(name = "OrganizationId") long j, @Json(name = "OrganizationName") String str2, @Json(name = "IsGuest") boolean z, @Json(name = "GuestOrganizationName") String str3, @Json(name = "Deleted") boolean z2, @Json(name = "DisplayName") String str4) {
        this.position = str;
        this.organizationId = j;
        this.organizationName = str2;
        this.isGuest = z;
        this.guestOrganizationName = str3;
        this.deleted = z2;
        this.displayName = str4;
    }

    public EmployeeInfo() {
        this(null, 0L, null, false, null, false, null, HProv.PP_VERSION_TIMESTAMP, null);
    }
}
