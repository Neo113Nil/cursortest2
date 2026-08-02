package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class MeetingStartedMessage {

    @Json(name = "CallType")
    @xuf0(tag = 2)
    public int callType;

    @cex
    @Json(name = "MeetingId")
    @xuf0(tag = 1)
    public String meetingId;
}
