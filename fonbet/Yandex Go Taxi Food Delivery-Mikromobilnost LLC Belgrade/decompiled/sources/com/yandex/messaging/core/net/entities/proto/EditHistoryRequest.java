package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class EditHistoryRequest {

    @Json(name = "ChatId")
    @xuf0(tag = 2)
    public String chatId;

    @Json(name = "CommonRequestFields")
    @xuf0(tag = 7)
    public CommonRequestFields commonFields;

    @Json(name = "InviteHash")
    @xuf0(tag = 6)
    public String inviteHash;

    @Json(name = "Limit")
    @xuf0(tag = 4)
    public long limit;

    @Json(name = "MinTimestamp")
    @xuf0(tag = 3)
    public long minTimestamp;
}
