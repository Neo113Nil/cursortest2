package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class RevokeInviteLinkParams {

    @Json(name = "chat_id")
    public String chatId;

    @Json(name = "version")
    public long version;
}
