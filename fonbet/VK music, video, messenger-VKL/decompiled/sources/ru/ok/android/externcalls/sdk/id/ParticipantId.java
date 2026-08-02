package ru.ok.android.externcalls.sdk.id;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.Objects;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class ParticipantId implements Parcelable, Serializable {
    public static final Parcelable.Creator<ParticipantId> CREATOR = new Parcelable.Creator<ParticipantId>() { // from class: ru.ok.android.externcalls.sdk.id.ParticipantId.1
        @Override // android.os.Parcelable.Creator
        public ParticipantId createFromParcel(Parcel parcel) {
            return new ParticipantId(0, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParticipantId[] newArray(int i) {
            return new ParticipantId[i];
        }
    };
    public final int deviceIndex;

    @NonNull
    public final String id;
    public final boolean isAnon;

    public /* synthetic */ ParticipantId(int i, Parcel parcel) {
        this(parcel);
    }

    @NonNull
    public static ParticipantId authorized(@NonNull String str) {
        return new ParticipantId(str, false, 0);
    }

    @NonNull
    public static ParticipantId fromStringValue(String str) {
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        return new ParticipantId(split[0], false, split.length > 1 ? Integer.parseInt(split[1]) : 0);
    }

    @NonNull
    public static ParticipantId withoutDeviceId(@NonNull String str, boolean z) {
        return new ParticipantId(str, z, 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParticipantId.class != obj.getClass()) {
            return false;
        }
        ParticipantId participantId = (ParticipantId) obj;
        if (this.deviceIndex == participantId.deviceIndex && this.isAnon == participantId.isAnon) {
            return this.id.equals(participantId.id);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.id, Boolean.valueOf(this.isAnon), Integer.valueOf(this.deviceIndex));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.isAnon ? i5s.a(new StringBuilder("anon{"), this.id, "}") : i5s.a(new StringBuilder("{"), this.id, "}"));
        sb.append(":d");
        sb.append(this.deviceIndex);
        return sb.toString();
    }

    @NonNull
    public String toStringValue() {
        return this.id + StringUtils.PROCESS_POSTFIX_DELIMITER + this.deviceIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeByte(this.isAnon ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.deviceIndex);
    }

    public ParticipantId(@NonNull String str, boolean z, int i) {
        this.id = str;
        this.isAnon = z;
        this.deviceIndex = i;
    }

    @Deprecated
    public ParticipantId(@NonNull String str) {
        this(str, false, 0);
    }

    @Deprecated
    public ParticipantId(@NonNull String str, boolean z) {
        this(str, z, 0);
    }

    private ParticipantId(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.id = readString;
        this.isAnon = parcel.readByte() != 0;
        this.deviceIndex = parcel.readInt();
    }
}
