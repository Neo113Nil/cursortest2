package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class JoinParams {

    @Json(name = "chat_id")
    public final String chatId = null;

    @Json(name = "invite")
    public final String inviteLink;

    public JoinParams(String str) {
        this.inviteLink = str;
    }
}
