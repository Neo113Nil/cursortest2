package com.ybsdk.common.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ybsdk/common/entities/SessionApplicationEntity;", "Landroid/os/Parcelable;", "", "applicationId", "Lcom/ybsdk/common/entities/ApplicationTypeEntity;", "type", "", "required", "<init>", "(Ljava/lang/String;Lcom/ybsdk/common/entities/ApplicationTypeEntity;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/common/entities/ApplicationTypeEntity;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/common/entities/ApplicationTypeEntity;Z)Lcom/ybsdk/common/entities/SessionApplicationEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "Lcom/ybsdk/common/entities/ApplicationTypeEntity;", "getType", "Z", "getRequired", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionApplicationEntity implements Parcelable {
    public static final Parcelable.Creator<SessionApplicationEntity> CREATOR = new Creator();
    private final String applicationId;
    private final boolean required;
    private final ApplicationTypeEntity type;

    public SessionApplicationEntity(String str, ApplicationTypeEntity applicationTypeEntity, boolean z) {
        this.applicationId = str;
        this.type = applicationTypeEntity;
        this.required = z;
    }

    public static /* synthetic */ SessionApplicationEntity copy$default(SessionApplicationEntity sessionApplicationEntity, String str, ApplicationTypeEntity applicationTypeEntity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionApplicationEntity.applicationId;
        }
        if ((i & 2) != 0) {
            applicationTypeEntity = sessionApplicationEntity.type;
        }
        if ((i & 4) != 0) {
            z = sessionApplicationEntity.required;
        }
        return sessionApplicationEntity.copy(str, applicationTypeEntity, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApplicationTypeEntity getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final SessionApplicationEntity copy(String applicationId, ApplicationTypeEntity type, boolean required) {
        return new SessionApplicationEntity(applicationId, type, required);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionApplicationEntity)) {
            return false;
        }
        SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) other;
        return jl40.l(this.applicationId, sessionApplicationEntity.applicationId) && this.type == sessionApplicationEntity.type && this.required == sessionApplicationEntity.required;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final ApplicationTypeEntity getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + ((this.type.hashCode() + (this.applicationId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.applicationId;
        ApplicationTypeEntity applicationTypeEntity = this.type;
        boolean z = this.required;
        StringBuilder sb = new StringBuilder("SessionApplicationEntity(applicationId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(applicationTypeEntity);
        sb.append(", required=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.applicationId);
        dest.writeString(this.type.name());
        dest.writeInt(this.required ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionApplicationEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionApplicationEntity createFromParcel(Parcel parcel) {
            return new SessionApplicationEntity(parcel.readString(), ApplicationTypeEntity.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionApplicationEntity[] newArray(int i) {
            return new SessionApplicationEntity[i];
        }
    }
}
