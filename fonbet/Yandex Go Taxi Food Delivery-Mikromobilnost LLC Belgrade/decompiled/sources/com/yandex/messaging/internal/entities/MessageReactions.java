package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ReactionInfo;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import defpackage.y60;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class MessageReactions {

    @Json(name = "first")
    public int first;

    @Json(name = "recent_user_reactions")
    public int recentUserReactionsCount;

    @Json(name = "second")
    public int second;

    @Json(name = "count")
    public int sumCount;

    @Json(name = "third")
    public int third;

    public static MessageReactions a(ReactionInfo[] reactionInfoArr, UserReaction[] userReactionArr) {
        ReactionInfo reactionInfo;
        ReactionInfo reactionInfo2;
        MessageReactions messageReactions = null;
        if (reactionInfoArr != null && reactionInfoArr.length != 0) {
            int i = 0;
            for (ReactionInfo reactionInfo3 : reactionInfoArr) {
                if (reactionInfo3 != null) {
                    i += reactionInfo3.count;
                }
            }
            Arrays.sort(reactionInfoArr, new y60(19));
            ReactionInfo reactionInfo4 = reactionInfoArr[0];
            if (reactionInfo4 != null && reactionInfo4.count > 0) {
                messageReactions = new MessageReactions();
                messageReactions.sumCount = i;
                messageReactions.first = reactionInfoArr[0].type;
                if (reactionInfoArr.length > 1 && (reactionInfo = reactionInfoArr[1]) != null && reactionInfo.count > 0) {
                    messageReactions.second = reactionInfo.type;
                    if (reactionInfoArr.length > 2 && (reactionInfo2 = reactionInfoArr[2]) != null && reactionInfo2.count > 0) {
                        messageReactions.third = reactionInfo2.type;
                    }
                }
                messageReactions.recentUserReactionsCount = userReactionArr != null ? userReactionArr.length : 0;
            }
        }
        return messageReactions;
    }
}
