package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import defpackage.cex;

/* loaded from: classes15.dex */
public class PushData {

    @Json(name = "Approved")
    public Boolean approved;

    @cex
    @Json(name = "Chat")
    public String chatId;

    @Json(name = "ChatName")
    public String chatName;

    @cex
    @Json(name = "Ts")
    public Long messageId;

    @cex
    @Json(name = "To")
    public String recipientUserId;

    @Json(name = "Message")
    public ServerMessage serverMessage;
}
