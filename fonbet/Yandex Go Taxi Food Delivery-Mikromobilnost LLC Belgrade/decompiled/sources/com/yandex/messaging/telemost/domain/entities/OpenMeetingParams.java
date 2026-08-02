package com.yandex.messaging.telemost.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g670;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010*\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0015¨\u00060"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;", "Landroid/os/Parcelable;", "", "meetingId", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "connectionSettings", "", "useEarpieceByDefault", "skipPermissionRequest", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;ZZ)Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMeetingId", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "getConnectionSettings", "Z", "getUseEarpieceByDefault", "getSkipPermissionRequest", "telemostLink", "getTelemostLink", "getTelemostLink$annotations", "()V", "Companion", "g670", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OpenMeetingParams implements Parcelable {
    public static final int $stable = 0;
    private final MeetingConnectionSettings connectionSettings;
    private final String meetingId;
    private final boolean skipPermissionRequest;
    private final String telemostLink;
    private final boolean useEarpieceByDefault;
    public static final g670 Companion = new g670();
    public static final Parcelable.Creator<OpenMeetingParams> CREATOR = new Creator();

    public /* synthetic */ OpenMeetingParams(String str, MeetingConnectionSettings meetingConnectionSettings, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, meetingConnectionSettings, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public static /* synthetic */ OpenMeetingParams copy$default(OpenMeetingParams openMeetingParams, String str, MeetingConnectionSettings meetingConnectionSettings, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMeetingParams.meetingId;
        }
        if ((i & 2) != 0) {
            meetingConnectionSettings = openMeetingParams.connectionSettings;
        }
        if ((i & 4) != 0) {
            z = openMeetingParams.useEarpieceByDefault;
        }
        if ((i & 8) != 0) {
            z2 = openMeetingParams.skipPermissionRequest;
        }
        return openMeetingParams.copy(str, meetingConnectionSettings, z, z2);
    }

    public static /* synthetic */ void getTelemostLink$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getMeetingId() {
        return this.meetingId;
    }

    /* renamed from: component2, reason: from getter */
    public final MeetingConnectionSettings getConnectionSettings() {
        return this.connectionSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseEarpieceByDefault() {
        return this.useEarpieceByDefault;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSkipPermissionRequest() {
        return this.skipPermissionRequest;
    }

    public final OpenMeetingParams copy(String meetingId, MeetingConnectionSettings connectionSettings, boolean useEarpieceByDefault, boolean skipPermissionRequest) {
        return new OpenMeetingParams(meetingId, connectionSettings, useEarpieceByDefault, skipPermissionRequest);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenMeetingParams)) {
            return false;
        }
        OpenMeetingParams openMeetingParams = (OpenMeetingParams) other;
        return jl40.l(this.meetingId, openMeetingParams.meetingId) && jl40.l(this.connectionSettings, openMeetingParams.connectionSettings) && this.useEarpieceByDefault == openMeetingParams.useEarpieceByDefault && this.skipPermissionRequest == openMeetingParams.skipPermissionRequest;
    }

    public final MeetingConnectionSettings getConnectionSettings() {
        return this.connectionSettings;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final boolean getSkipPermissionRequest() {
        return this.skipPermissionRequest;
    }

    public final String getTelemostLink() {
        return this.telemostLink;
    }

    public final boolean getUseEarpieceByDefault() {
        return this.useEarpieceByDefault;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skipPermissionRequest) + unr0.e((this.connectionSettings.hashCode() + (this.meetingId.hashCode() * 31)) * 31, 31, this.useEarpieceByDefault);
    }

    public String toString() {
        String str = this.meetingId;
        MeetingConnectionSettings meetingConnectionSettings = this.connectionSettings;
        boolean z = this.useEarpieceByDefault;
        boolean z2 = this.skipPermissionRequest;
        StringBuilder sb = new StringBuilder("OpenMeetingParams(meetingId=");
        sb.append(str);
        sb.append(", connectionSettings=");
        sb.append(meetingConnectionSettings);
        sb.append(", useEarpieceByDefault=");
        return smw0.k(", skipPermissionRequest=", Extension.C_BRAKE, sb, z, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.meetingId);
        this.connectionSettings.writeToParcel(dest, flags);
        dest.writeInt(this.useEarpieceByDefault ? 1 : 0);
        dest.writeInt(this.skipPermissionRequest ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenMeetingParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMeetingParams createFromParcel(Parcel parcel) {
            return new OpenMeetingParams(parcel.readString(), MeetingConnectionSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMeetingParams[] newArray(int i) {
            return new OpenMeetingParams[i];
        }
    }

    public OpenMeetingParams(String str, MeetingConnectionSettings meetingConnectionSettings, boolean z, boolean z2) {
        this.meetingId = str;
        this.connectionSettings = meetingConnectionSettings;
        this.useEarpieceByDefault = z;
        this.skipPermissionRequest = z2;
        this.telemostLink = str;
    }
}
