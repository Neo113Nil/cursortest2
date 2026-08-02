package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.ErrorInfo;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsResponse;", "", ACSPConstants.STATUS, "", "errorInfo", "Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "userReactions", "", "Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "userReads", "Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;", "<init>", "(ILcom/yandex/messaging/core/net/entities/proto/ErrorInfo;[Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;[Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;)V", "getStatus", "()I", "getErrorInfo", "()Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "getUserReactions", "()[Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "[Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "getUserReads", "()[Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;", "[Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ListReactionsResponse {

    @xuf0(tag = 2)
    private final ErrorInfo errorInfo;

    @xuf0(tag = 1)
    private final int status;

    @xuf0(tag = 3)
    private final UserReaction[] userReactions;

    @xuf0(tag = 4)
    private final UserRead[] userReads;

    public ListReactionsResponse(@Json(name = "Status") int i, @Json(name = "ErrorInfo") ErrorInfo errorInfo, @Json(name = "UserReactions") UserReaction[] userReactionArr, @Json(name = "UserReads") UserRead[] userReadArr) {
        this.status = i;
        this.errorInfo = errorInfo;
        this.userReactions = userReactionArr;
        this.userReads = userReadArr;
    }

    public final ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final UserReaction[] getUserReactions() {
        return this.userReactions;
    }

    public final UserRead[] getUserReads() {
        return this.userReads;
    }

    public /* synthetic */ ListReactionsResponse(int i, ErrorInfo errorInfo, UserReaction[] userReactionArr, UserRead[] userReadArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, errorInfo, userReactionArr, userReadArr);
    }
}
