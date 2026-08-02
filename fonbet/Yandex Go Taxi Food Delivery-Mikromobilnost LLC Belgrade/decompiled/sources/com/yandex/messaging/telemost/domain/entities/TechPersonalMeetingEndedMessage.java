package com.yandex.messaging.telemost.domain.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.cex;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public class TechPersonalMeetingEndedMessage extends TechBaseMessage {

    @Json(name = "call_type")
    public int callType;

    @Json(name = "duration_seconds")
    public long durationSeconds;

    @cex
    @Json(name = "meeting_id")
    public String meetingId;

    @Json(name = CRLReasonCodeExtension.REASON)
    public int reason;

    public TechPersonalMeetingEndedMessage() {
        this.type = 113;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage
    public final Object a(TechBaseMessage.MessageHandler messageHandler) {
        return messageHandler.m(this);
    }
}
