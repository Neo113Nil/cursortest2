package com.yandex.messaging.core.net.entities.proto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.ok80;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wdz;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JV\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010,R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u00100R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00103\u001a\u0004\b\b\u0010\u001c\"\u0004\b4\u00105R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00103\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00105R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b\n\u0010\u001c\"\u0004\b8\u00105R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b:\u0010 \"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "Landroid/os/Parcelable;", "", "organizationId", "", "organizationName", "registrationStatus", "", "isPublic", BackendConfig.Restrictions.DISABLED, "isGuest", "", "organizationRights", "<init>", "(ILjava/lang/String;IZZZJ)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "component6", "component7", "()J", "copy", "(ILjava/lang/String;IZZZJ)Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getOrganizationId", "setOrganizationId", "(I)V", "Ljava/lang/String;", "getOrganizationName", "setOrganizationName", "(Ljava/lang/String;)V", "getRegistrationStatus", "setRegistrationStatus", "Z", "setPublic", "(Z)V", "getDisabled", "setDisabled", "setGuest", "J", "getOrganizationRights", "setOrganizationRights", "(J)V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrganizationProto implements Parcelable {
    public static final Parcelable.Creator<OrganizationProto> CREATOR = new Creator();

    @xuf0(tag = 5)
    private boolean disabled;

    @xuf0(tag = 6)
    private boolean isGuest;

    @xuf0(tag = 4)
    private boolean isPublic;

    @xuf0(tag = 1)
    private int organizationId;

    @xuf0(tag = 2)
    private String organizationName;

    @xuf0(tag = 7)
    private long organizationRights;

    @xuf0(tag = 3)
    private int registrationStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OrganizationProto(int i, String str, int i2, boolean z, boolean z2, boolean z3, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, z, z2, z3, j);
        i = (i3 & 1) != 0 ? 0 : i;
        z = (i3 & 8) != 0 ? false : z;
        z2 = (i3 & 16) != 0 ? false : z2;
        z3 = (i3 & 32) != 0 ? false : z3;
        if ((i3 & 64) != 0) {
            ok80.c.getClass();
            j = wdz.h();
        }
    }

    public static /* synthetic */ OrganizationProto copy$default(OrganizationProto organizationProto, int i, String str, int i2, boolean z, boolean z2, boolean z3, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = organizationProto.organizationId;
        }
        if ((i3 & 2) != 0) {
            str = organizationProto.organizationName;
        }
        if ((i3 & 4) != 0) {
            i2 = organizationProto.registrationStatus;
        }
        if ((i3 & 8) != 0) {
            z = organizationProto.isPublic;
        }
        if ((i3 & 16) != 0) {
            z2 = organizationProto.disabled;
        }
        if ((i3 & 32) != 0) {
            z3 = organizationProto.isGuest;
        }
        if ((i3 & 64) != 0) {
            j = organizationProto.organizationRights;
        }
        long j2 = j;
        boolean z4 = z2;
        boolean z5 = z3;
        return organizationProto.copy(i, str, i2, z, z4, z5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrganizationName() {
        return this.organizationName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRegistrationStatus() {
        return this.registrationStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsGuest() {
        return this.isGuest;
    }

    /* renamed from: component7, reason: from getter */
    public final long getOrganizationRights() {
        return this.organizationRights;
    }

    public final OrganizationProto copy(@Json(name = "OrganizationId") int organizationId, @Json(name = "OrganizationName") String organizationName, @Json(name = "RegistrationStatus") int registrationStatus, @Json(name = "IsPublic") boolean isPublic, @Json(name = "Disabled") boolean disabled, @Json(name = "IsGuest") boolean isGuest, @Json(name = "Rights") long organizationRights) {
        return new OrganizationProto(organizationId, organizationName, registrationStatus, isPublic, disabled, isGuest, organizationRights);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationProto)) {
            return false;
        }
        OrganizationProto organizationProto = (OrganizationProto) other;
        return this.organizationId == organizationProto.organizationId && jl40.l(this.organizationName, organizationProto.organizationName) && this.registrationStatus == organizationProto.registrationStatus && this.isPublic == organizationProto.isPublic && this.disabled == organizationProto.disabled && this.isGuest == organizationProto.isGuest && this.organizationRights == organizationProto.organizationRights;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final int getOrganizationId() {
        return this.organizationId;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final long getOrganizationRights() {
        return this.organizationRights;
    }

    public final int getRegistrationStatus() {
        return this.registrationStatus;
    }

    public int hashCode() {
        return Long.hashCode(this.organizationRights) + unr0.e(unr0.e(unr0.e(oyr.b(this.registrationStatus, unr0.b(Integer.hashCode(this.organizationId) * 31, 31, this.organizationName), 31), 31, this.isPublic), 31, this.disabled), 31, this.isGuest);
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final void setDisabled(boolean z) {
        this.disabled = z;
    }

    public final void setGuest(boolean z) {
        this.isGuest = z;
    }

    public final void setOrganizationId(int i) {
        this.organizationId = i;
    }

    public final void setOrganizationName(String str) {
        this.organizationName = str;
    }

    public final void setOrganizationRights(long j) {
        this.organizationRights = j;
    }

    public final void setPublic(boolean z) {
        this.isPublic = z;
    }

    public final void setRegistrationStatus(int i) {
        this.registrationStatus = i;
    }

    public String toString() {
        int i = this.organizationId;
        String str = this.organizationName;
        int i2 = this.registrationStatus;
        boolean z = this.isPublic;
        boolean z2 = this.disabled;
        boolean z3 = this.isGuest;
        long j = this.organizationRights;
        StringBuilder v = unr0.v(i, "OrganizationProto(organizationId=", ", organizationName=", str, ", registrationStatus=");
        tse0.z(v, i2, ", isPublic=", z, ", disabled=");
        nnm.v(", isGuest=", ", organizationRights=", v, z2, z3);
        return oyr.n(j, Extension.C_BRAKE, v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.organizationId);
        dest.writeString(this.organizationName);
        dest.writeInt(this.registrationStatus);
        dest.writeInt(this.isPublic ? 1 : 0);
        dest.writeInt(this.disabled ? 1 : 0);
        dest.writeInt(this.isGuest ? 1 : 0);
        dest.writeLong(this.organizationRights);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrganizationProto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrganizationProto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new OrganizationProto(readInt, readString, readInt2, z3, z4, z2, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrganizationProto[] newArray(int i) {
            return new OrganizationProto[i];
        }
    }

    public OrganizationProto(@Json(name = "OrganizationId") int i, @Json(name = "OrganizationName") String str, @Json(name = "RegistrationStatus") int i2, @Json(name = "IsPublic") boolean z, @Json(name = "Disabled") boolean z2, @Json(name = "IsGuest") boolean z3, @Json(name = "Rights") long j) {
        this.organizationId = i;
        this.organizationName = str;
        this.registrationStatus = i2;
        this.isPublic = z;
        this.disabled = z2;
        this.isGuest = z3;
        this.organizationRights = j;
    }
}
