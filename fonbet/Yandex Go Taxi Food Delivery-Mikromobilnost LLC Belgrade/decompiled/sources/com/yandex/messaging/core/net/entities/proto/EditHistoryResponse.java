package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class EditHistoryResponse {

    @Json(name = "Messages")
    @xuf0(tag = 1)
    public ChatHistoryResponse.OutMessage[] messages;

    @Json(name = "Status")
    @xuf0(tag = 3)
    public int status;
}
