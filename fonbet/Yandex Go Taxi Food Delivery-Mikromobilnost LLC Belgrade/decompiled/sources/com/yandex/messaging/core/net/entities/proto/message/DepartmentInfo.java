package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/DepartmentInfo;", "Landroid/os/Parcelable;", "", "organizationId", "id", "", "name", "version", "<init>", "(JJLjava/lang/String;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(JJLjava/lang/String;J)Lcom/yandex/messaging/core/net/entities/proto/message/DepartmentInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getOrganizationId", "getId", "Ljava/lang/String;", "getName", "getVersion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DepartmentInfo implements Parcelable {
    public static final Parcelable.Creator<DepartmentInfo> CREATOR = new Creator();

    @Json(name = "DepartmentId")
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

    public DepartmentInfo(long j, long j2, String str, long j3) {
        this.organizationId = j;
        this.id = j2;
        this.name = str;
        this.version = j3;
    }

    public static /* synthetic */ DepartmentInfo copy$default(DepartmentInfo departmentInfo, long j, long j2, String str, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = departmentInfo.organizationId;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = departmentInfo.id;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            str = departmentInfo.name;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j3 = departmentInfo.version;
        }
        return departmentInfo.copy(j4, j5, str2, j3);
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

    public final DepartmentInfo copy(long organizationId, long id, String name, long version) {
        return new DepartmentInfo(organizationId, id, name, version);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentInfo)) {
            return false;
        }
        DepartmentInfo departmentInfo = (DepartmentInfo) other;
        return this.organizationId == departmentInfo.organizationId && this.id == departmentInfo.id && jl40.l(this.name, departmentInfo.name) && this.version == departmentInfo.version;
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
        StringBuilder w = unr0.w(j, "DepartmentInfo(organizationId=", ", id=");
        uw51.v(j2, ", name=", str, w);
        return g8e.l(j3, ", version=", Extension.C_BRAKE, w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.organizationId);
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeLong(this.version);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DepartmentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepartmentInfo createFromParcel(Parcel parcel) {
            return new DepartmentInfo(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepartmentInfo[] newArray(int i) {
            return new DepartmentInfo[i];
        }
    }
}
