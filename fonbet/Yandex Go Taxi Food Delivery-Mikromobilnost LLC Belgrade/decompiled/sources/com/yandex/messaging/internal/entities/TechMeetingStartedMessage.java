package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.cex;

/* loaded from: classes15.dex */
public class TechMeetingStartedMessage extends TechBaseMessage {

    @Json(name = "call_type")
    public int callType;

    @cex
    @Json(name = "meeting_id")
    public String meetingId;

    public TechMeetingStartedMessage() {
        this.type = 111;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.k();
    }
}
