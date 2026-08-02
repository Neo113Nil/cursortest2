package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.ReducedChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.ReactionInfo;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ReducedServerMessage {

    @cex
    @Json(name = "ClientMessage")
    @xuf0(tag = 1)
    public ReducedChatHistoryResponse.ReducedClientMessage clientMessage;

    @Json(name = "ForwardedMessages")
    @xuf0(tag = 3)
    public ReducedChatHistoryResponse.ReducedForwardedMessageInfo[] forwardedMessages;

    @Json(name = "Reactions")
    @xuf0(tag = 5)
    public ReactionInfo[] reactions;

    @Json(name = "ReactionsVersion")
    @xuf0(tag = 6)
    public long reactionsVersion;

    @Json(name = "RecentUserReactions")
    @xuf0(tag = 8)
    public UserReaction[] recentUserReactions;

    @cex
    @Json(name = "ServerMessageInfo")
    @xuf0(tag = 2)
    public ReducedChatHistoryResponse.ReducedServerMessageInfo serverMessageInfo;
}
