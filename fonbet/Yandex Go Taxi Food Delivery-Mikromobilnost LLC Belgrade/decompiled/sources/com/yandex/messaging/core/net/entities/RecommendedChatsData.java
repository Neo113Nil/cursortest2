package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class RecommendedChatsData {

    @cex
    @Json(name = "chats")
    public ChatData[] chats;

    @Json(name = "reqid")
    public String reqId;
}
