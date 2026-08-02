package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.cex;

/* loaded from: classes15.dex */
public class TechMeetingEndedMessage extends TechBaseMessage {

    @Json(name = "call_type")
    public int callType;

    @cex
    @Json(name = "meeting_id")
    public String meetingId;

    public TechMeetingEndedMessage() {
        this.type = 112;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.c();
    }
}
