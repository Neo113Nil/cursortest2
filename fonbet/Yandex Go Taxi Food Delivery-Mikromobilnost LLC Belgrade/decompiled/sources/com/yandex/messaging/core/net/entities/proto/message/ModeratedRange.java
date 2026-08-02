package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ModeratedRange {

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @cex
    @Json(name = "Range")
    @xuf0(tag = 2)
    public TimestampRange range;
}
