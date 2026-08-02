package com.yandex.messaging.domain.statuses;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/domain/statuses/StatusAvailability;", "Landroid/os/Parcelable;", "", "", "type", "<init>", "(Ljava/lang/String;II)V", "Landroid/os/Parcel;", "parcel", "(Ljava/lang/String;ILandroid/os/Parcel;)V", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getType", "CREATOR", "Default", "Away", "Busy", "Dnd", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StatusAvailability implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatusAvailability[] $VALUES;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int type;
    public static final StatusAvailability Default = new StatusAvailability("Default", 0, 0);
    public static final StatusAvailability Away = new StatusAvailability("Away", 1, 1);
    public static final StatusAvailability Busy = new StatusAvailability("Busy", 2, 2);
    public static final StatusAvailability Dnd = new StatusAvailability("Dnd", 3, 3);

    private static final /* synthetic */ StatusAvailability[] $values() {
        return new StatusAvailability[]{Default, Away, Busy, Dnd};
    }

    static {
        StatusAvailability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        INSTANCE = new Companion(null);
    }

    private StatusAvailability(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StatusAvailability valueOf(String str) {
        return (StatusAvailability) Enum.valueOf(StatusAvailability.class, str);
    }

    public static StatusAvailability[] values() {
        return (StatusAvailability[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(this.type);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/domain/statuses/StatusAvailability$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/domain/statuses/StatusAvailability;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/domain/statuses/StatusAvailability;", "findByType", "type", "findByTypeOrDefault", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.domain.statuses.StatusAvailability$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<StatusAvailability> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusAvailability createFromParcel(Parcel parcel) {
            return StatusAvailability.values()[parcel.readInt()];
        }

        public final StatusAvailability findByType(int type) {
            for (StatusAvailability statusAvailability : StatusAvailability.values()) {
                if (statusAvailability.getType() == type) {
                    return statusAvailability;
                }
            }
            return null;
        }

        public final StatusAvailability findByTypeOrDefault(int type) {
            StatusAvailability statusAvailability;
            StatusAvailability[] values = StatusAvailability.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    statusAvailability = null;
                    break;
                }
                statusAvailability = values[i];
                if (statusAvailability.getType() == type) {
                    break;
                }
                i++;
            }
            return statusAvailability == null ? StatusAvailability.Default : statusAvailability;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusAvailability[] newArray(int size) {
            return new StatusAvailability[size];
        }
    }

    private StatusAvailability(String str, int i, int i2) {
        this.type = i2;
    }
}
