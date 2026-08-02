package com.yandex.passport.internal.provider.communication;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.internal.entities.VpnStatus;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00072\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/IPCCommand;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Message;", "toMessage", "()Landroid/os/Message;", "Companion", "PushTokenCommand", "VpnStatusChangedCommand", "com/yandex/passport/internal/provider/communication/j", "Lcom/yandex/passport/internal/provider/communication/IPCCommand$PushTokenCommand;", "Lcom/yandex/passport/internal/provider/communication/IPCCommand$VpnStatusChangedCommand;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class IPCCommand implements Parcelable {
    public static final int $stable = 0;
    public static final j Companion = new j();
    public static final String IPC_COMMAND = "IPCCommand";
    private static final int WHAT = 100;

    public /* synthetic */ IPCCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Message toMessage() {
        return Message.obtain(null, 100, wwg.g(new Pair(IPC_COMMAND, this)));
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/IPCCommand$PushTokenCommand;", "Lcom/yandex/passport/internal/provider/communication/IPCCommand;", "Lcom/yandex/passport/api/PushPlatform;", "platform", "<init>", "(Lcom/yandex/passport/api/PushPlatform;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PushPlatform;", "copy", "(Lcom/yandex/passport/api/PushPlatform;)Lcom/yandex/passport/internal/provider/communication/IPCCommand$PushTokenCommand;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PushPlatform;", "getPlatform", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushTokenCommand extends IPCCommand {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PushTokenCommand> CREATOR = new Creator();
        private final PushPlatform platform;

        public PushTokenCommand(PushPlatform pushPlatform) {
            super(null);
            this.platform = pushPlatform;
        }

        public static /* synthetic */ PushTokenCommand copy$default(PushTokenCommand pushTokenCommand, PushPlatform pushPlatform, int i, Object obj) {
            if ((i & 1) != 0) {
                pushPlatform = pushTokenCommand.platform;
            }
            return pushTokenCommand.copy(pushPlatform);
        }

        /* renamed from: component1, reason: from getter */
        public final PushPlatform getPlatform() {
            return this.platform;
        }

        public final PushTokenCommand copy(PushPlatform platform) {
            return new PushTokenCommand(platform);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenCommand) && this.platform == ((PushTokenCommand) other).platform;
        }

        public final PushPlatform getPlatform() {
            return this.platform;
        }

        public int hashCode() {
            return this.platform.hashCode();
        }

        public String toString() {
            return "PushTokenCommand(platform=" + this.platform + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.platform.name());
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Creator implements Parcelable.Creator<PushTokenCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushTokenCommand createFromParcel(Parcel parcel) {
                return new PushTokenCommand(PushPlatform.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushTokenCommand[] newArray(int i) {
                return new PushTokenCommand[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/IPCCommand$VpnStatusChangedCommand;", "Lcom/yandex/passport/internal/provider/communication/IPCCommand;", "Lcom/yandex/passport/internal/entities/VpnStatus;", ACSPConstants.STATUS, "<init>", "(Lcom/yandex/passport/internal/entities/VpnStatus;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/entities/VpnStatus;", "copy", "(Lcom/yandex/passport/internal/entities/VpnStatus;)Lcom/yandex/passport/internal/provider/communication/IPCCommand$VpnStatusChangedCommand;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/entities/VpnStatus;", "getStatus", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VpnStatusChangedCommand extends IPCCommand {
        public static final int $stable = 8;
        public static final Parcelable.Creator<VpnStatusChangedCommand> CREATOR = new Creator();
        private final VpnStatus status;

        public VpnStatusChangedCommand(VpnStatus vpnStatus) {
            super(null);
            this.status = vpnStatus;
        }

        public static /* synthetic */ VpnStatusChangedCommand copy$default(VpnStatusChangedCommand vpnStatusChangedCommand, VpnStatus vpnStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                vpnStatus = vpnStatusChangedCommand.status;
            }
            return vpnStatusChangedCommand.copy(vpnStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final VpnStatus getStatus() {
            return this.status;
        }

        public final VpnStatusChangedCommand copy(VpnStatus status) {
            return new VpnStatusChangedCommand(status);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VpnStatusChangedCommand) && jl40.l(this.status, ((VpnStatusChangedCommand) other).status);
        }

        public final VpnStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "VpnStatusChangedCommand(status=" + this.status + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.status, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VpnStatusChangedCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VpnStatusChangedCommand createFromParcel(Parcel parcel) {
                return new VpnStatusChangedCommand((VpnStatus) parcel.readParcelable(VpnStatusChangedCommand.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VpnStatusChangedCommand[] newArray(int i) {
                return new VpnStatusChangedCommand[i];
            }
        }
    }

    private IPCCommand() {
    }
}
