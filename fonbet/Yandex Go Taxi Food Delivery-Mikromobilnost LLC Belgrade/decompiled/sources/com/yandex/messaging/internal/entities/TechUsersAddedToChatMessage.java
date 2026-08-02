package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.DepartmentInfo;
import com.yandex.messaging.core.net.entities.proto.message.GroupInfo;
import com.yandex.messaging.internal.entities.TechBaseMessage;

/* loaded from: classes15.dex */
public class TechUsersAddedToChatMessage extends TechBaseMessage {

    @Json(name = "departments")
    public DepartmentInfo[] departments;

    @Json(name = "groups")
    public GroupInfo[] groups;

    @Json(name = "guests")
    public String[] guestsGuids;

    @Json(name = "guids")
    public String[] guids;

    public TechUsersAddedToChatMessage() {
        this.type = 104;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.b(this);
    }
}
