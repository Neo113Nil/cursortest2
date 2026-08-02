package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ServerMessage {

    @cex
    @Json(name = "ClientMessage")
    @xuf0(tag = 1)
    public ClientMessage clientMessage;

    @Json(name = "ForwardedMessages")
    @xuf0(tag = 3)
    public ForwardedMessageInfo[] forwardedMessages;

    @Json(name = "MentionedUsers")
    @xuf0(tag = 4)
    public ReducedUserInfo[] mentionedUsers;

    @Json(name = "NotificationMeta")
    @xuf0(tag = 7)
    public NotificationMeta notificationMeta;

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
    public ServerMessageInfo serverMessageInfo;

    @Json(name = "Users")
    @xuf0(tag = 19)
    public ReducedUserInfo[] users = null;
}
