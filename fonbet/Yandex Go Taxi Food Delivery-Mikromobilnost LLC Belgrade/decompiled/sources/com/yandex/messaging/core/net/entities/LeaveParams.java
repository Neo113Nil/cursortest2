package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class LeaveParams {

    @Json(name = "chat_id")
    public final String chatId;

    @Json(name = "version")
    public final long chatVersion;

    public LeaveParams(String str, long j) {
        this.chatId = str;
        this.chatVersion = j;
    }
}
