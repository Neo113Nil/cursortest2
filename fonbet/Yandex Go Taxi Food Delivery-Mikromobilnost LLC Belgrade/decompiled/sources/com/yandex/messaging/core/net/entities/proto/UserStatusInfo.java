package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/UserStatusInfo;", "", "userStatusMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", ClidProvider.TIMESTAMP, "", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserStatusInfo {

    @xuf0(tag = 2)
    public long timestamp;

    @xuf0(tag = 1)
    public UserStatusMessage userStatusMessage;

    public /* synthetic */ UserStatusInfo(UserStatusMessage userStatusMessage, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userStatusMessage, (i & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ UserStatusInfo copy$default(UserStatusInfo userStatusInfo, UserStatusMessage userStatusMessage, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            userStatusMessage = userStatusInfo.userStatusMessage;
        }
        if ((i & 2) != 0) {
            j = userStatusInfo.timestamp;
        }
        return userStatusInfo.copy(userStatusMessage, j);
    }

    /* renamed from: component1, reason: from getter */
    public final UserStatusMessage getUserStatusMessage() {
        return this.userStatusMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final UserStatusInfo copy(@Json(name = "UserStatus") UserStatusMessage userStatusMessage, @Json(name = "Timestamp") long timestamp) {
        return new UserStatusInfo(userStatusMessage, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatusInfo)) {
            return false;
        }
        UserStatusInfo userStatusInfo = (UserStatusInfo) other;
        return jl40.l(this.userStatusMessage, userStatusInfo.userStatusMessage) && this.timestamp == userStatusInfo.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.userStatusMessage.hashCode() * 31);
    }

    public String toString() {
        return "UserStatusInfo(userStatusMessage=" + this.userStatusMessage + ", timestamp=" + this.timestamp + Extension.C_BRAKE;
    }

    public UserStatusInfo(@Json(name = "UserStatus") UserStatusMessage userStatusMessage, @Json(name = "Timestamp") long j) {
        this.userStatusMessage = userStatusMessage;
        this.timestamp = j;
    }
}
