package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.ChatData;
import defpackage.cex;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/GroupChatData;", "", "<init>", "()V", "errors", "", "Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;", "getErrors", "()[Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;", "setErrors", "([Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;)V", "[Lcom/yandex/messaging/core/net/entities/chatcreate/AddRemoveUserError;", "chatData", "Lcom/yandex/messaging/core/net/entities/ChatData;", "getChatData", "()Lcom/yandex/messaging/core/net/entities/ChatData;", "setChatData", "(Lcom/yandex/messaging/core/net/entities/ChatData;)V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GroupChatData {

    @cex
    @Json(name = "chat")
    public ChatData chatData;

    @Json(name = "errors")
    private AddRemoveUserError[] errors;

    public final ChatData getChatData() {
        ChatData chatData = this.chatData;
        if (chatData != null) {
            return chatData;
        }
        return null;
    }

    public final AddRemoveUserError[] getErrors() {
        return this.errors;
    }

    public final void setChatData(ChatData chatData) {
        this.chatData = chatData;
    }

    public final void setErrors(AddRemoveUserError[] addRemoveUserErrorArr) {
        this.errors = addRemoveUserErrorArr;
    }
}
