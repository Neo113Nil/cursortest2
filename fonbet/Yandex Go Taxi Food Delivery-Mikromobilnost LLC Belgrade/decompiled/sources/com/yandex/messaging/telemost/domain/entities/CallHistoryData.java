package com.yandex.messaging.telemost.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData;", "Landroid/os/Parcelable;", "id", "", "startedAt", "", "endedAt", ACSPConstants.STATUS, "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "direction", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;)V", "getId", "()Ljava/lang/String;", "getStartedAt", "()J", "getEndedAt", "getStatus", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "getDirection", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;", "Defaults", "GroupCall", "OneToOneCall", "IncomingCall", "OutgoingCall", "Direction", "Status", "Origin", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$GroupCall;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OneToOneCall;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CallHistoryData implements Parcelable {
    public static final int $stable = 0;
    private final Direction direction;
    private final long endedAt;
    private final String id;
    private final long startedAt;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;", "", "INCOMING", "OUTGOING", "GROUP", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction GROUP;
        public static final Direction INCOMING;
        public static final Direction OUTGOING;

        static {
            Direction direction = new Direction("INCOMING", 0);
            INCOMING = direction;
            Direction direction2 = new Direction("OUTGOING", 1);
            OUTGOING = direction2;
            Direction direction3 = new Direction("GROUP", 2);
            GROUP = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            $VALUES = directionArr;
            $ENTRIES = kotlin.enums.a.a(directionArr);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OneToOneCall;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData;", "Landroid/os/Parcelable;", "id", "", "startedAt", "", "endedAt", ACSPConstants.STATUS, "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "direction", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;", "chatId", "remoteGuid", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Direction;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getRemoteGuid", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class OneToOneCall extends CallHistoryData implements Parcelable {
        public static final int $stable = 0;
        private final String chatId;
        private final String remoteGuid;

        public OneToOneCall(String str, long j, long j2, Status status, Direction direction, String str2, String str3) {
            super(str, j, j2, status, direction, null);
            this.chatId = str2;
            this.remoteGuid = str3;
        }

        public String getChatId() {
            return this.chatId;
        }

        public String getRemoteGuid() {
            return this.remoteGuid;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;", "", "CALENDAR", "TELEMOST", "MESSENGER", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Origin {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Origin[] $VALUES;
        public static final Origin CALENDAR;
        public static final Origin MESSENGER;
        public static final Origin TELEMOST;

        static {
            Origin origin = new Origin("CALENDAR", 0);
            CALENDAR = origin;
            Origin origin2 = new Origin("TELEMOST", 1);
            TELEMOST = origin2;
            Origin origin3 = new Origin("MESSENGER", 2);
            MESSENGER = origin3;
            Origin[] originArr = {origin, origin2, origin3};
            $VALUES = originArr;
            $ENTRIES = kotlin.enums.a.a(originArr);
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "", "SUCCEEDED", "MISSED", "DECLINED", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status DECLINED;
        public static final Status MISSED;
        public static final Status SUCCEEDED;

        static {
            Status status = new Status("SUCCEEDED", 0);
            SUCCEEDED = status;
            Status status2 = new Status("MISSED", 1);
            MISSED = status2;
            Status status3 = new Status("DECLINED", 2);
            DECLINED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    private CallHistoryData(String str, long j, long j2, Status status, Direction direction) {
        this.id = str;
        this.startedAt = j;
        this.endedAt = j2;
        this.status = status;
        this.direction = direction;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public long getEndedAt() {
        return this.endedAt;
    }

    public String getId() {
        return this.id;
    }

    public long getStartedAt() {
        return this.startedAt;
    }

    public Status getStatus() {
        return this.status;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;", "Landroid/os/Parcelable;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;", "origin", "", "title", "<init>", "(Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;Ljava/lang/String;)Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Origin;", "getOrigin", "Ljava/lang/String;", "getTitle", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Defaults implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Defaults> CREATOR = new Creator();
        private final Origin origin;
        private final String title;

        public Defaults(Origin origin, String str) {
            this.origin = origin;
            this.title = str;
        }

        public static /* synthetic */ Defaults copy$default(Defaults defaults, Origin origin, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                origin = defaults.origin;
            }
            if ((i & 2) != 0) {
                str = defaults.title;
            }
            return defaults.copy(origin, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Origin getOrigin() {
            return this.origin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Defaults copy(Origin origin, String title) {
            return new Defaults(origin, title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) other;
            return this.origin == defaults.origin && jl40.l(this.title, defaults.title);
        }

        public final Origin getOrigin() {
            return this.origin;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.origin.hashCode() * 31;
            String str = this.title;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Defaults(origin=" + this.origin + ", title=" + this.title + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.origin.name());
            dest.writeString(this.title);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Defaults> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Defaults createFromParcel(Parcel parcel) {
                return new Defaults(Origin.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Defaults[] newArray(int i) {
                return new Defaults[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b4\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b5\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010#R\u0011\u00108\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$GroupCall;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData;", "Landroid/os/Parcelable;", "", "id", "", "startedAt", "endedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", ACSPConstants.STATUS, "chatId", "telemostJoinUrl", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;", "defaults", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "component5", "component6", "component7", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;", "copy", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;)Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$GroupCall;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getStartedAt", "getEndedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "getStatus", "getChatId", "getTelemostJoinUrl", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Defaults;", "getDefaults", "isCalendarMeeting", "()Z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GroupCall extends CallHistoryData implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GroupCall> CREATOR = new Creator();
        private final String chatId;
        private final Defaults defaults;
        private final long endedAt;
        private final String id;
        private final long startedAt;
        private final Status status;
        private final String telemostJoinUrl;

        public GroupCall(String str, long j, long j2, Status status, String str2, String str3, Defaults defaults) {
            super(str, j, j2, status, Direction.GROUP, null);
            this.id = str;
            this.startedAt = j;
            this.endedAt = j2;
            this.status = status;
            this.chatId = str2;
            this.telemostJoinUrl = str3;
            this.defaults = defaults;
        }

        public static /* synthetic */ GroupCall copy$default(GroupCall groupCall, String str, long j, long j2, Status status, String str2, String str3, Defaults defaults, int i, Object obj) {
            if ((i & 1) != 0) {
                str = groupCall.id;
            }
            if ((i & 2) != 0) {
                j = groupCall.startedAt;
            }
            if ((i & 4) != 0) {
                j2 = groupCall.endedAt;
            }
            if ((i & 8) != 0) {
                status = groupCall.status;
            }
            if ((i & 16) != 0) {
                str2 = groupCall.chatId;
            }
            if ((i & 32) != 0) {
                str3 = groupCall.telemostJoinUrl;
            }
            if ((i & 64) != 0) {
                defaults = groupCall.defaults;
            }
            long j3 = j2;
            return groupCall.copy(str, j, j3, status, str2, str3, defaults);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndedAt() {
            return this.endedAt;
        }

        /* renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTelemostJoinUrl() {
            return this.telemostJoinUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final Defaults getDefaults() {
            return this.defaults;
        }

        public final GroupCall copy(String id, long startedAt, long endedAt, Status status, String chatId, String telemostJoinUrl, Defaults defaults) {
            return new GroupCall(id, startedAt, endedAt, status, chatId, telemostJoinUrl, defaults);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupCall)) {
                return false;
            }
            GroupCall groupCall = (GroupCall) other;
            return jl40.l(this.id, groupCall.id) && this.startedAt == groupCall.startedAt && this.endedAt == groupCall.endedAt && this.status == groupCall.status && jl40.l(this.chatId, groupCall.chatId) && jl40.l(this.telemostJoinUrl, groupCall.telemostJoinUrl) && jl40.l(this.defaults, groupCall.defaults);
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final Defaults getDefaults() {
            return this.defaults;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getEndedAt() {
            return this.endedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getStartedAt() {
            return this.startedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public Status getStatus() {
            return this.status;
        }

        public final String getTelemostJoinUrl() {
            return this.telemostJoinUrl;
        }

        public int hashCode() {
            int hashCode = (this.status.hashCode() + qv10.c(qv10.c(this.id.hashCode() * 31, 31, this.startedAt), 31, this.endedAt)) * 31;
            String str = this.chatId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.telemostJoinUrl;
            return this.defaults.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final boolean isCalendarMeeting() {
            return this.defaults.getOrigin() == Origin.CALENDAR;
        }

        public String toString() {
            String str = this.id;
            long j = this.startedAt;
            long j2 = this.endedAt;
            Status status = this.status;
            String str2 = this.chatId;
            String str3 = this.telemostJoinUrl;
            Defaults defaults = this.defaults;
            StringBuilder l = x4e.l("GroupCall(id=", str, ", startedAt=", j);
            x4e.A(j2, ", endedAt=", ", status=", l);
            l.append(status);
            l.append(", chatId=");
            l.append(str2);
            l.append(", telemostJoinUrl=");
            l.append(str3);
            l.append(", defaults=");
            l.append(defaults);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeLong(this.startedAt);
            dest.writeLong(this.endedAt);
            dest.writeString(this.status.name());
            dest.writeString(this.chatId);
            dest.writeString(this.telemostJoinUrl);
            this.defaults.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GroupCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupCall createFromParcel(Parcel parcel) {
                return new GroupCall(parcel.readString(), parcel.readLong(), parcel.readLong(), Status.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Defaults.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupCall[] newArray(int i) {
                return new GroupCall[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$IncomingCall;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OneToOneCall;", "Landroid/os/Parcelable;", "", "id", "", "startedAt", "endedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", ACSPConstants.STATUS, "chatId", "remoteGuid", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "component5", "component6", "copy", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$IncomingCall;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getStartedAt", "getEndedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "getStatus", "getChatId", "getRemoteGuid", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IncomingCall extends OneToOneCall implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<IncomingCall> CREATOR = new Creator();
        private final String chatId;
        private final long endedAt;
        private final String id;
        private final String remoteGuid;
        private final long startedAt;
        private final Status status;

        public IncomingCall(String str, long j, long j2, Status status, String str2, String str3) {
            super(str, j, j2, status, Direction.INCOMING, str2, str3);
            this.id = str;
            this.startedAt = j;
            this.endedAt = j2;
            this.status = status;
            this.chatId = str2;
            this.remoteGuid = str3;
        }

        public static /* synthetic */ IncomingCall copy$default(IncomingCall incomingCall, String str, long j, long j2, Status status, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = incomingCall.id;
            }
            if ((i & 2) != 0) {
                j = incomingCall.startedAt;
            }
            if ((i & 4) != 0) {
                j2 = incomingCall.endedAt;
            }
            if ((i & 8) != 0) {
                status = incomingCall.status;
            }
            if ((i & 16) != 0) {
                str2 = incomingCall.chatId;
            }
            if ((i & 32) != 0) {
                str3 = incomingCall.remoteGuid;
            }
            String str4 = str3;
            Status status2 = status;
            long j3 = j2;
            return incomingCall.copy(str, j, j3, status2, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndedAt() {
            return this.endedAt;
        }

        /* renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRemoteGuid() {
            return this.remoteGuid;
        }

        public final IncomingCall copy(String id, long startedAt, long endedAt, Status status, String chatId, String remoteGuid) {
            return new IncomingCall(id, startedAt, endedAt, status, chatId, remoteGuid);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncomingCall)) {
                return false;
            }
            IncomingCall incomingCall = (IncomingCall) other;
            return jl40.l(this.id, incomingCall.id) && this.startedAt == incomingCall.startedAt && this.endedAt == incomingCall.endedAt && this.status == incomingCall.status && jl40.l(this.chatId, incomingCall.chatId) && jl40.l(this.remoteGuid, incomingCall.remoteGuid);
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData.OneToOneCall
        public String getChatId() {
            return this.chatId;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getEndedAt() {
            return this.endedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData.OneToOneCall
        public String getRemoteGuid() {
            return this.remoteGuid;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getStartedAt() {
            return this.startedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.remoteGuid.hashCode() + unr0.b((this.status.hashCode() + qv10.c(qv10.c(this.id.hashCode() * 31, 31, this.startedAt), 31, this.endedAt)) * 31, 31, this.chatId);
        }

        public String toString() {
            String str = this.id;
            long j = this.startedAt;
            long j2 = this.endedAt;
            Status status = this.status;
            String str2 = this.chatId;
            String str3 = this.remoteGuid;
            StringBuilder l = x4e.l("IncomingCall(id=", str, ", startedAt=", j);
            x4e.A(j2, ", endedAt=", ", status=", l);
            l.append(status);
            l.append(", chatId=");
            l.append(str2);
            l.append(", remoteGuid=");
            return oyr.t(l, str3, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeLong(this.startedAt);
            dest.writeLong(this.endedAt);
            dest.writeString(this.status.name());
            dest.writeString(this.chatId);
            dest.writeString(this.remoteGuid);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IncomingCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IncomingCall createFromParcel(Parcel parcel) {
                return new IncomingCall(parcel.readString(), parcel.readLong(), parcel.readLong(), Status.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IncomingCall[] newArray(int i) {
                return new IncomingCall[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OutgoingCall;", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OneToOneCall;", "Landroid/os/Parcelable;", "", "id", "", "startedAt", "endedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", ACSPConstants.STATUS, "chatId", "remoteGuid", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "component5", "component6", "copy", "(Ljava/lang/String;JJLcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$OutgoingCall;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getStartedAt", "getEndedAt", "Lcom/yandex/messaging/telemost/domain/entities/CallHistoryData$Status;", "getStatus", "getChatId", "getRemoteGuid", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OutgoingCall extends OneToOneCall implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<OutgoingCall> CREATOR = new Creator();
        private final String chatId;
        private final long endedAt;
        private final String id;
        private final String remoteGuid;
        private final long startedAt;
        private final Status status;

        public OutgoingCall(String str, long j, long j2, Status status, String str2, String str3) {
            super(str, j, j2, status, Direction.OUTGOING, str2, str3);
            this.id = str;
            this.startedAt = j;
            this.endedAt = j2;
            this.status = status;
            this.chatId = str2;
            this.remoteGuid = str3;
        }

        public static /* synthetic */ OutgoingCall copy$default(OutgoingCall outgoingCall, String str, long j, long j2, Status status, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = outgoingCall.id;
            }
            if ((i & 2) != 0) {
                j = outgoingCall.startedAt;
            }
            if ((i & 4) != 0) {
                j2 = outgoingCall.endedAt;
            }
            if ((i & 8) != 0) {
                status = outgoingCall.status;
            }
            if ((i & 16) != 0) {
                str2 = outgoingCall.chatId;
            }
            if ((i & 32) != 0) {
                str3 = outgoingCall.remoteGuid;
            }
            String str4 = str3;
            Status status2 = status;
            long j3 = j2;
            return outgoingCall.copy(str, j, j3, status2, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndedAt() {
            return this.endedAt;
        }

        /* renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRemoteGuid() {
            return this.remoteGuid;
        }

        public final OutgoingCall copy(String id, long startedAt, long endedAt, Status status, String chatId, String remoteGuid) {
            return new OutgoingCall(id, startedAt, endedAt, status, chatId, remoteGuid);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutgoingCall)) {
                return false;
            }
            OutgoingCall outgoingCall = (OutgoingCall) other;
            return jl40.l(this.id, outgoingCall.id) && this.startedAt == outgoingCall.startedAt && this.endedAt == outgoingCall.endedAt && this.status == outgoingCall.status && jl40.l(this.chatId, outgoingCall.chatId) && jl40.l(this.remoteGuid, outgoingCall.remoteGuid);
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData.OneToOneCall
        public String getChatId() {
            return this.chatId;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getEndedAt() {
            return this.endedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData.OneToOneCall
        public String getRemoteGuid() {
            return this.remoteGuid;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public long getStartedAt() {
            return this.startedAt;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CallHistoryData
        public Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.remoteGuid.hashCode() + unr0.b((this.status.hashCode() + qv10.c(qv10.c(this.id.hashCode() * 31, 31, this.startedAt), 31, this.endedAt)) * 31, 31, this.chatId);
        }

        public String toString() {
            String str = this.id;
            long j = this.startedAt;
            long j2 = this.endedAt;
            Status status = this.status;
            String str2 = this.chatId;
            String str3 = this.remoteGuid;
            StringBuilder l = x4e.l("OutgoingCall(id=", str, ", startedAt=", j);
            x4e.A(j2, ", endedAt=", ", status=", l);
            l.append(status);
            l.append(", chatId=");
            l.append(str2);
            l.append(", remoteGuid=");
            return oyr.t(l, str3, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeLong(this.startedAt);
            dest.writeLong(this.endedAt);
            dest.writeString(this.status.name());
            dest.writeString(this.chatId);
            dest.writeString(this.remoteGuid);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OutgoingCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutgoingCall createFromParcel(Parcel parcel) {
                return new OutgoingCall(parcel.readString(), parcel.readLong(), parcel.readLong(), Status.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutgoingCall[] newArray(int i) {
                return new OutgoingCall[i];
            }
        }
    }

    public /* synthetic */ CallHistoryData(String str, long j, long j2, Status status, Direction direction, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, status, direction);
    }
}
