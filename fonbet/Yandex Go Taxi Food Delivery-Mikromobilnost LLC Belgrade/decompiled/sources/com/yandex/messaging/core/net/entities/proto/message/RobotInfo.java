package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "Landroid/os/Parcelable;", "", "isSupport", "cannotBeBlocked", "disablePrivates", "<init>", "(ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Z", "()Z", "getCannotBeBlocked", "getDisablePrivates", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RobotInfo implements Parcelable {
    public static final Parcelable.Creator<RobotInfo> CREATOR = new Creator();

    @xuf0(tag = 2)
    private final boolean cannotBeBlocked;

    @xuf0(tag = 4)
    private final boolean disablePrivates;

    @xuf0(tag = 1)
    private final boolean isSupport;

    public RobotInfo(@Json(name = "IsSupport") boolean z, @Json(name = "CannotBeBlocked") boolean z2, @Json(name = "DisablePrivates") boolean z3) {
        this.isSupport = z;
        this.cannotBeBlocked = z2;
        this.disablePrivates = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean getCannotBeBlocked() {
        return this.cannotBeBlocked;
    }

    public final boolean getDisablePrivates() {
        return this.disablePrivates;
    }

    /* renamed from: isSupport, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isSupport ? 1 : 0);
        dest.writeInt(this.cannotBeBlocked ? 1 : 0);
        dest.writeInt(this.disablePrivates ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RobotInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RobotInfo createFromParcel(Parcel parcel) {
            return new RobotInfo(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RobotInfo[] newArray(int i) {
            return new RobotInfo[i];
        }
    }
}
