package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;

/* loaded from: classes15.dex */
public abstract class TechBaseMessage extends MessageData {

    @Json(name = "initiator")
    public String initiator;

    public interface MessageHandler<T> {
        Object a();

        Object b(TechUsersAddedToChatMessage techUsersAddedToChatMessage);

        Object c();

        Object d(TechUserJoinChatMessage techUserJoinChatMessage);

        Object e();

        Object f(TechUserLeaveChatMessage techUserLeaveChatMessage);

        Object g(TechChatInfoChangedMessage techChatInfoChangedMessage);

        Object h(TechUsersRemovedFromChatMessage techUsersRemovedFromChatMessage);

        Object i(TechGenericMessage techGenericMessage);

        Object j(TechChatCreatedMessage techChatCreatedMessage);

        Object k();

        Object l(TechUserJoinChatByLinkMessage techUserJoinChatByLinkMessage);

        Object m(TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage);

        Object n(TechCallInfoMessage techCallInfoMessage);
    }

    public abstract Object a(MessageHandler messageHandler);
}
