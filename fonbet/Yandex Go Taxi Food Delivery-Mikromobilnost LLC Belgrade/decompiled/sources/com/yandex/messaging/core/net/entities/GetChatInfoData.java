package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class GetChatInfoData {

    @cex
    @Json(name = "chats")
    public ChatData[] chats;
}
