package com.yandex.messaging.internal.entities;

import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;

/* loaded from: classes15.dex */
public class TechMessagesInterestedGuidsRetriever implements TechBaseMessage.MessageHandler<String[]> {
    public final String a;
    public final String b;

    public TechMessagesInterestedGuidsRetriever(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object a() {
        return new String[]{this.a};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object b(TechUsersAddedToChatMessage techUsersAddedToChatMessage) {
        String[] strArr = techUsersAddedToChatMessage.guids;
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = this.a;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object c() {
        return new String[0];
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object d(TechUserJoinChatMessage techUserJoinChatMessage) {
        return new String[]{techUserJoinChatMessage.guid};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object e() {
        return new String[]{this.a};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object f(TechUserLeaveChatMessage techUserLeaveChatMessage) {
        return new String[]{techUserLeaveChatMessage.guid};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object g(TechChatInfoChangedMessage techChatInfoChangedMessage) {
        return new String[]{this.a};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object h(TechUsersRemovedFromChatMessage techUsersRemovedFromChatMessage) {
        String[] strArr = techUsersRemovedFromChatMessage.guids;
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = this.a;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object i(TechGenericMessage techGenericMessage) {
        return new String[0];
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object j(TechChatCreatedMessage techChatCreatedMessage) {
        String str = this.b;
        return (str == null || !ChatNamespaces.b(str)) ? new String[]{this.a} : new String[0];
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object k() {
        return new String[]{this.a};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object l(TechUserJoinChatByLinkMessage techUserJoinChatByLinkMessage) {
        return new String[]{techUserJoinChatByLinkMessage.guid};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object m(TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage) {
        return new String[]{this.a};
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object n(TechCallInfoMessage techCallInfoMessage) {
        return new String[0];
    }
}
