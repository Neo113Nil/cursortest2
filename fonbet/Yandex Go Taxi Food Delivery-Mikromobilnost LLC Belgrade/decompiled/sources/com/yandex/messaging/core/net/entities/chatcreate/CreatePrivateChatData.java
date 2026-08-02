package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import defpackage.cex;

/* loaded from: classes15.dex */
public class CreatePrivateChatData {

    @cex
    @Json(name = "chat")
    public ChatData chat;

    @Json(name = "user")
    public UserData user;
}
