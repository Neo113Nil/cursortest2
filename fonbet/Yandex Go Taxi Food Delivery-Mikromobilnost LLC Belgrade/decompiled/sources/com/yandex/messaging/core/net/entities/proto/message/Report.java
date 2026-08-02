package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.xuf0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes15.dex */
public class Report {

    @Json(name = "ChatId")
    @xuf0(tag = 100)
    public String chatId;

    @Json(name = "MessageRef")
    @xuf0(tag = 102)
    public MessageRef messageRef;

    @Json(name = "Reason")
    @xuf0(tag = 1)
    public int reason;

    @Json(name = "UserId")
    @xuf0(tag = 101)
    public String userId;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }
}
