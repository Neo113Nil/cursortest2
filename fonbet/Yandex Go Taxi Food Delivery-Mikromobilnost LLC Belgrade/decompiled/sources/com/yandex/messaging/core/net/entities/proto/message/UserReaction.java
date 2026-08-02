package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "", "type", "", ClidProvider.TIMESTAMP, "", "userInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "<init>", "(IJLcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;)V", "getType", "()I", "getTimestamp", "()J", "getUserInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserReaction {

    @xuf0(tag = 2)
    private final long timestamp;

    @xuf0(tag = 1)
    private final int type;

    @xuf0(tag = 3)
    private final ReducedUserInfo userInfo;

    public UserReaction(@Json(name = "Type") int i, @Json(name = "Timestamp") long j, @Json(name = "UserInfo") ReducedUserInfo reducedUserInfo) {
        this.type = i;
        this.timestamp = j;
        this.userInfo = reducedUserInfo;
    }

    public static /* synthetic */ UserReaction copy$default(UserReaction userReaction, int i, long j, ReducedUserInfo reducedUserInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userReaction.type;
        }
        if ((i2 & 2) != 0) {
            j = userReaction.timestamp;
        }
        if ((i2 & 4) != 0) {
            reducedUserInfo = userReaction.userInfo;
        }
        return userReaction.copy(i, j, reducedUserInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final ReducedUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final UserReaction copy(@Json(name = "Type") int type, @Json(name = "Timestamp") long timestamp, @Json(name = "UserInfo") ReducedUserInfo userInfo) {
        return new UserReaction(type, timestamp, userInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserReaction)) {
            return false;
        }
        UserReaction userReaction = (UserReaction) other;
        return this.type == userReaction.type && this.timestamp == userReaction.timestamp && jl40.l(this.userInfo, userReaction.userInfo);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public final ReducedUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        return this.userInfo.hashCode() + qv10.c(Integer.hashCode(this.type) * 31, 31, this.timestamp);
    }

    public String toString() {
        return "UserReaction(type=" + this.type + ", timestamp=" + this.timestamp + ", userInfo=" + this.userInfo + Extension.C_BRAKE;
    }
}
