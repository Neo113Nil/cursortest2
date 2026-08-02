package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class MessageInfoRequest {

    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "CommonRequestFields")
    @xuf0(tag = 4)
    public CommonRequestFields commonFields;

    @Json(name = "InviteHash")
    @xuf0(tag = 7)
    public String inviteHash;

    @Json(name = "MessageDataFilter")
    @xuf0(tag = 6)
    public MessageDataFilter messageDataFilter;

    @Json(name = "Timestamp")
    @xuf0(tag = 2)
    public long timestamp = 2;
}
