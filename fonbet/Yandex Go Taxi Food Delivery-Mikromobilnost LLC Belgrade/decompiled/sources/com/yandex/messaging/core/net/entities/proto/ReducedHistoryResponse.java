package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ReducedHistoryResponse {

    @Json(name = "Chats")
    @xuf0(tag = 1)
    public ReducedChatHistoryResponse[] chats;

    @Json(name = "Status")
    @xuf0(tag = 4)
    public int status;
}
