package com.yandex.messaging.telemost.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eh10;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "Landroid/os/Parcelable;", "", "isMicEnabled", "isCameraEnabled", "skipConnectionScreen", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;", "type", "<init>", "(ZZZLcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;", "copy", "(ZZZLcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;)Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSkipConnectionScreen", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;", "getType", "Companion", "eh10", "CallType", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingConnectionSettings implements Parcelable {
    public static final int $stable = 0;
    private static final MeetingConnectionSettings GroupCallIncomingDefault;
    private static final MeetingConnectionSettings GroupCallOutgoing;
    private static final MeetingConnectionSettings Join;
    private static final MeetingConnectionSettings NoChat;
    private static final MeetingConnectionSettings PrivateCallIncomingDefault;
    private static final MeetingConnectionSettings PrivateCallOutgoingAudio;
    private static final MeetingConnectionSettings PrivateCallOutgoingVideo;
    private final boolean isCameraEnabled;
    private final boolean isMicEnabled;
    private final boolean skipConnectionScreen;
    private final CallType type;
    public static final eh10 Companion = new eh10();
    public static final Parcelable.Creator<MeetingConnectionSettings> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings$CallType;", "", "AUDIO", "VIDEO", "OTHER", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CallType[] $VALUES;
        public static final CallType AUDIO;
        public static final CallType OTHER;
        public static final CallType VIDEO;

        static {
            CallType callType = new CallType("AUDIO", 0);
            AUDIO = callType;
            CallType callType2 = new CallType("VIDEO", 1);
            VIDEO = callType2;
            CallType callType3 = new CallType("OTHER", 2);
            OTHER = callType3;
            CallType[] callTypeArr = {callType, callType2, callType3};
            $VALUES = callTypeArr;
            $ENTRIES = kotlin.enums.a.a(callTypeArr);
        }

        public static CallType valueOf(String str) {
            return (CallType) Enum.valueOf(CallType.class, str);
        }

        public static CallType[] values() {
            return (CallType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = true;
        boolean z2 = false;
        MeetingConnectionSettings meetingConnectionSettings = new MeetingConnectionSettings(true, z, z2, null, 12, null);
        Join = meetingConnectionSettings;
        boolean z3 = true;
        PrivateCallOutgoingAudio = new MeetingConnectionSettings(z, z2, z3, CallType.AUDIO, 2, null);
        PrivateCallOutgoingVideo = new MeetingConnectionSettings(true, true, true, CallType.VIDEO);
        PrivateCallIncomingDefault = new MeetingConnectionSettings(z3, true, true, 0 == true ? 1 : 0, 8, null);
        GroupCallIncomingDefault = new MeetingConnectionSettings(false, false, false, null, 15, null);
        GroupCallOutgoing = meetingConnectionSettings;
        NoChat = new MeetingConnectionSettings(true, true, true, null, 8, null);
    }

    public /* synthetic */ MeetingConnectionSettings(boolean z, boolean z2, boolean z3, CallType callType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? CallType.OTHER : callType);
    }

    public static /* synthetic */ MeetingConnectionSettings copy$default(MeetingConnectionSettings meetingConnectionSettings, boolean z, boolean z2, boolean z3, CallType callType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = meetingConnectionSettings.isMicEnabled;
        }
        if ((i & 2) != 0) {
            z2 = meetingConnectionSettings.isCameraEnabled;
        }
        if ((i & 4) != 0) {
            z3 = meetingConnectionSettings.skipConnectionScreen;
        }
        if ((i & 8) != 0) {
            callType = meetingConnectionSettings.type;
        }
        return meetingConnectionSettings.copy(z, z2, z3, callType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMicEnabled() {
        return this.isMicEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCameraEnabled() {
        return this.isCameraEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSkipConnectionScreen() {
        return this.skipConnectionScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final CallType getType() {
        return this.type;
    }

    public final MeetingConnectionSettings copy(boolean isMicEnabled, boolean isCameraEnabled, boolean skipConnectionScreen, CallType type) {
        return new MeetingConnectionSettings(isMicEnabled, isCameraEnabled, skipConnectionScreen, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingConnectionSettings)) {
            return false;
        }
        MeetingConnectionSettings meetingConnectionSettings = (MeetingConnectionSettings) other;
        return this.isMicEnabled == meetingConnectionSettings.isMicEnabled && this.isCameraEnabled == meetingConnectionSettings.isCameraEnabled && this.skipConnectionScreen == meetingConnectionSettings.skipConnectionScreen && this.type == meetingConnectionSettings.type;
    }

    public final boolean getSkipConnectionScreen() {
        return this.skipConnectionScreen;
    }

    public final CallType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.isMicEnabled) * 31, 31, this.isCameraEnabled), 31, this.skipConnectionScreen);
    }

    public final boolean isCameraEnabled() {
        return this.isCameraEnabled;
    }

    public final boolean isMicEnabled() {
        return this.isMicEnabled;
    }

    public String toString() {
        boolean z = this.isMicEnabled;
        boolean z2 = this.isCameraEnabled;
        boolean z3 = this.skipConnectionScreen;
        CallType callType = this.type;
        StringBuilder u = qv10.u("MeetingConnectionSettings(isMicEnabled=", ", isCameraEnabled=", ", skipConnectionScreen=", z, z2);
        u.append(z3);
        u.append(", type=");
        u.append(callType);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isMicEnabled ? 1 : 0);
        dest.writeInt(this.isCameraEnabled ? 1 : 0);
        dest.writeInt(this.skipConnectionScreen ? 1 : 0);
        dest.writeString(this.type.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MeetingConnectionSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MeetingConnectionSettings createFromParcel(Parcel parcel) {
            return new MeetingConnectionSettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, CallType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MeetingConnectionSettings[] newArray(int i) {
            return new MeetingConnectionSettings[i];
        }
    }

    public MeetingConnectionSettings(boolean z, boolean z2, boolean z3, CallType callType) {
        this.isMicEnabled = z;
        this.isCameraEnabled = z2;
        this.skipConnectionScreen = z3;
        this.type = callType;
    }

    public MeetingConnectionSettings() {
        this(false, false, false, null, 15, null);
    }
}
