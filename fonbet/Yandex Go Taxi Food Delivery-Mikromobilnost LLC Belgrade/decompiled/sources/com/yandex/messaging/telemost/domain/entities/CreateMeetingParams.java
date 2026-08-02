package com.yandex.messaging.telemost.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.w511;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "Landroid/os/Parcelable;", "skipPermissionRequest", "", "getSkipPermissionRequest", "()Z", "connectionSettings", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "getConnectionSettings", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "Group", "Personal", "NoChat", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Group;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$NoChat;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CreateMeetingParams extends Parcelable {
    MeetingConnectionSettings getConnectionSettings();

    boolean getSkipPermissionRequest();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Group;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "", "chatId", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "connectionSettings", "", "skipPermissionRequest", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Group;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "getConnectionSettings", "Z", "getSkipPermissionRequest", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Group implements CreateMeetingParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Group> CREATOR = new Creator();
        private final String chatId;
        private final MeetingConnectionSettings connectionSettings;
        private final boolean skipPermissionRequest;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Group(String str, MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, meetingConnectionSettings, (i & 4) != 0 ? false : z);
            if ((i & 2) != 0) {
                MeetingConnectionSettings.Companion.getClass();
                meetingConnectionSettings = MeetingConnectionSettings.GroupCallOutgoing;
            }
        }

        public static /* synthetic */ Group copy$default(Group group, String str, MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.chatId;
            }
            if ((i & 2) != 0) {
                meetingConnectionSettings = group.connectionSettings;
            }
            if ((i & 4) != 0) {
                z = group.skipPermissionRequest;
            }
            return group.copy(str, meetingConnectionSettings, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public final Group copy(String chatId, MeetingConnectionSettings connectionSettings, boolean skipPermissionRequest) {
            return new Group(chatId, connectionSettings, skipPermissionRequest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return jl40.l(this.chatId, group.chatId) && jl40.l(this.connectionSettings, group.connectionSettings) && this.skipPermissionRequest == group.skipPermissionRequest;
        }

        public final String getChatId() {
            return this.chatId;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipPermissionRequest) + ((this.connectionSettings.hashCode() + (this.chatId.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.chatId;
            MeetingConnectionSettings meetingConnectionSettings = this.connectionSettings;
            boolean z = this.skipPermissionRequest;
            StringBuilder sb = new StringBuilder("Group(chatId=");
            sb.append(str);
            sb.append(", connectionSettings=");
            sb.append(meetingConnectionSettings);
            sb.append(", skipPermissionRequest=");
            return x4e.i(sb, z, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.chatId);
            this.connectionSettings.writeToParcel(dest, flags);
            dest.writeInt(this.skipPermissionRequest ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Group> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Group createFromParcel(Parcel parcel) {
                return new Group(parcel.readString(), MeetingConnectionSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Group[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(String str, MeetingConnectionSettings meetingConnectionSettings, boolean z) {
            this.chatId = str;
            this.connectionSettings = meetingConnectionSettings;
            this.skipPermissionRequest = z;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$NoChat;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "connectionSettings", "", "skipPermissionRequest", "<init>", "(Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "component2", "()Z", "copy", "(Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$NoChat;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "getConnectionSettings", "Z", "getSkipPermissionRequest", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoChat implements CreateMeetingParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NoChat> CREATOR = new Creator();
        private final MeetingConnectionSettings connectionSettings;
        private final boolean skipPermissionRequest;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public NoChat(MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(meetingConnectionSettings, (i & 2) != 0 ? false : z);
            if ((i & 1) != 0) {
                MeetingConnectionSettings.Companion.getClass();
                meetingConnectionSettings = MeetingConnectionSettings.NoChat;
            }
        }

        public static /* synthetic */ NoChat copy$default(NoChat noChat, MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                meetingConnectionSettings = noChat.connectionSettings;
            }
            if ((i & 2) != 0) {
                z = noChat.skipPermissionRequest;
            }
            return noChat.copy(meetingConnectionSettings, z);
        }

        /* renamed from: component1, reason: from getter */
        public final MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public final NoChat copy(MeetingConnectionSettings connectionSettings, boolean skipPermissionRequest) {
            return new NoChat(connectionSettings, skipPermissionRequest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoChat)) {
                return false;
            }
            NoChat noChat = (NoChat) other;
            return jl40.l(this.connectionSettings, noChat.connectionSettings) && this.skipPermissionRequest == noChat.skipPermissionRequest;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipPermissionRequest) + (this.connectionSettings.hashCode() * 31);
        }

        public String toString() {
            return "NoChat(connectionSettings=" + this.connectionSettings + ", skipPermissionRequest=" + this.skipPermissionRequest + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.connectionSettings.writeToParcel(dest, flags);
            dest.writeInt(this.skipPermissionRequest ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoChat> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoChat createFromParcel(Parcel parcel) {
                return new NoChat(MeetingConnectionSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoChat[] newArray(int i) {
                return new NoChat[i];
            }
        }

        public NoChat(MeetingConnectionSettings meetingConnectionSettings, boolean z) {
            this.connectionSettings = meetingConnectionSettings;
            this.skipPermissionRequest = z;
        }

        public NoChat() {
            this(null, false, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "", "userId", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;", "callType", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "connectionSettings", "", "skipPermissionRequest", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;", "component3", "()Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;Z)Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;", "getCallType", "Lcom/yandex/messaging/telemost/domain/entities/MeetingConnectionSettings;", "getConnectionSettings", "Z", "getSkipPermissionRequest", "Companion", "CallType", "com/yandex/messaging/telemost/domain/entities/b", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Personal implements CreateMeetingParams {
        public static final int $stable = 0;
        private final CallType callType;
        private final MeetingConnectionSettings connectionSettings;
        private final boolean skipPermissionRequest;
        private final String userId;
        public static final b Companion = new b();
        public static final Parcelable.Creator<Personal> CREATOR = new Creator();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;", "", "Audio", "Video", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CallType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ CallType[] $VALUES;
            public static final CallType Audio;
            public static final CallType Video;

            static {
                CallType callType = new CallType("Audio", 0);
                Audio = callType;
                CallType callType2 = new CallType("Video", 1);
                Video = callType2;
                CallType[] callTypeArr = {callType, callType2};
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

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Personal(String str, CallType callType, MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, callType, meetingConnectionSettings, (i & 8) != 0 ? false : z);
            if ((i & 4) != 0) {
                Companion.getClass();
                int i2 = a.a[callType.ordinal()];
                if (i2 == 1) {
                    MeetingConnectionSettings.Companion.getClass();
                    meetingConnectionSettings = MeetingConnectionSettings.PrivateCallOutgoingAudio;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        throw null;
                    }
                    MeetingConnectionSettings.Companion.getClass();
                    meetingConnectionSettings = MeetingConnectionSettings.PrivateCallOutgoingVideo;
                }
            }
        }

        public static /* synthetic */ Personal copy$default(Personal personal, String str, CallType callType, MeetingConnectionSettings meetingConnectionSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = personal.userId;
            }
            if ((i & 2) != 0) {
                callType = personal.callType;
            }
            if ((i & 4) != 0) {
                meetingConnectionSettings = personal.connectionSettings;
            }
            if ((i & 8) != 0) {
                z = personal.skipPermissionRequest;
            }
            return personal.copy(str, callType, meetingConnectionSettings, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final CallType getCallType() {
            return this.callType;
        }

        /* renamed from: component3, reason: from getter */
        public final MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public final Personal copy(String userId, CallType callType, MeetingConnectionSettings connectionSettings, boolean skipPermissionRequest) {
            return new Personal(userId, callType, connectionSettings, skipPermissionRequest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Personal)) {
                return false;
            }
            Personal personal = (Personal) other;
            return jl40.l(this.userId, personal.userId) && this.callType == personal.callType && jl40.l(this.connectionSettings, personal.connectionSettings) && this.skipPermissionRequest == personal.skipPermissionRequest;
        }

        public final CallType getCallType() {
            return this.callType;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public MeetingConnectionSettings getConnectionSettings() {
            return this.connectionSettings;
        }

        @Override // com.yandex.messaging.telemost.domain.entities.CreateMeetingParams
        public boolean getSkipPermissionRequest() {
            return this.skipPermissionRequest;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipPermissionRequest) + ((this.connectionSettings.hashCode() + ((this.callType.hashCode() + (this.userId.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Personal(userId=" + this.userId + ", callType=" + this.callType + ", connectionSettings=" + this.connectionSettings + ", skipPermissionRequest=" + this.skipPermissionRequest + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.userId);
            dest.writeString(this.callType.name());
            this.connectionSettings.writeToParcel(dest, flags);
            dest.writeInt(this.skipPermissionRequest ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Personal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Personal createFromParcel(Parcel parcel) {
                return new Personal(parcel.readString(), CallType.valueOf(parcel.readString()), MeetingConnectionSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Personal[] newArray(int i) {
                return new Personal[i];
            }
        }

        public Personal(String str, CallType callType, MeetingConnectionSettings meetingConnectionSettings, boolean z) {
            this.userId = str;
            this.callType = callType;
            this.connectionSettings = meetingConnectionSettings;
            this.skipPermissionRequest = z;
        }
    }
}
