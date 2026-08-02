package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class MessageInfoResponse {

    @Json(name = "Message")
    @xuf0(tag = 1)
    public OutMessage message;

    @Json(name = "MyReactions")
    @xuf0(tag = 4)
    public int[] myReactions;

    @Json(name = "Status")
    @xuf0(tag = 2)
    public int status;

    public static class OutMessage {

        @cex
        @Json(name = "ServerMessage")
        @xuf0(tag = 101)
        public ReducedServerMessage serverMessage;
    }
}
