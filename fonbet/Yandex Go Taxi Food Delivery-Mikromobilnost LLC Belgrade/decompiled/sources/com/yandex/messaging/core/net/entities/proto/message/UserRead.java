package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;", "", ClidProvider.TIMESTAMP, "", "userInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "<init>", "(JLcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;)V", "getTimestamp", "()J", "getUserInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserRead {

    @xuf0(tag = 1)
    private final long timestamp;

    @xuf0(tag = 2)
    private final ReducedUserInfo userInfo;

    public UserRead(@Json(name = "Timestamp") long j, @Json(name = "UserInfo") ReducedUserInfo reducedUserInfo) {
        this.timestamp = j;
        this.userInfo = reducedUserInfo;
    }

    public static /* synthetic */ UserRead copy$default(UserRead userRead, long j, ReducedUserInfo reducedUserInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userRead.timestamp;
        }
        if ((i & 2) != 0) {
            reducedUserInfo = userRead.userInfo;
        }
        return userRead.copy(j, reducedUserInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final ReducedUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final UserRead copy(@Json(name = "Timestamp") long timestamp, @Json(name = "UserInfo") ReducedUserInfo userInfo) {
        return new UserRead(timestamp, userInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRead)) {
            return false;
        }
        UserRead userRead = (UserRead) other;
        return this.timestamp == userRead.timestamp && jl40.l(this.userInfo, userRead.userInfo);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ReducedUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        return this.userInfo.hashCode() + (Long.hashCode(this.timestamp) * 31);
    }

    public String toString() {
        return "UserRead(timestamp=" + this.timestamp + ", userInfo=" + this.userInfo + Extension.C_BRAKE;
    }
}
