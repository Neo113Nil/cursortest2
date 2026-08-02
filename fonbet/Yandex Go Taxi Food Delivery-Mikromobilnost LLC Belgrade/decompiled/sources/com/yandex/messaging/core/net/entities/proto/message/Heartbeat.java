package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.xuf0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes15.dex */
public class Heartbeat {

    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "OnlineUntil")
    @xuf0(tag = 2)
    public long onlineUntil;

    @Json(name = "Type")
    @xuf0(tag = 3)
    public int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HeartbeatType {
    }
}
