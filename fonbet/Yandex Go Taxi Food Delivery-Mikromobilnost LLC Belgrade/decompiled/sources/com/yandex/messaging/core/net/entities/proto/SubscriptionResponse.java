package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class SubscriptionResponse {

    @Json(name = "CurrentTime")
    @xuf0(tag = 8)
    public Long currentTime;

    @Json(name = "ErrorInfo")
    @xuf0(tag = 6)
    public ErrorInfo errorInfo;

    @Json(name = "LastMessage")
    @xuf0(tag = 4)
    public ServerMessage lastMessage;

    @Json(name = "LastMessages")
    @xuf0(tag = 7)
    public ServerMessage[] lastMessages;

    @Json(name = "Status")
    @xuf0(tag = 1)
    public int status;
}
