package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class OnlyTimestampsChatHistoryResponse {

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "LastTsMcs")
    @xuf0(tag = 19)
    public long lastMessageTimestamp;

    @Json(name = "HistoryStartTsMcs")
    @xuf0(tag = 22)
    public long minMessageTimestamp;
}
