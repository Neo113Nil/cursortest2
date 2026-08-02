package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;", "", "meetingId", "", CRLReasonCodeExtension.REASON, "", "durationSeconds", "", "callType", "<init>", "(Ljava/lang/String;IJI)V", "getMeetingId", "()Ljava/lang/String;", "getReason", "()I", "getDurationSeconds", "()J", "getCallType", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PersonalMeetingEndedMessage {

    @xuf0(tag = 4)
    private final int callType;

    @xuf0(tag = 3)
    private final long durationSeconds;

    @xuf0(tag = 1)
    private final String meetingId;

    @xuf0(tag = 2)
    private final int reason;

    public PersonalMeetingEndedMessage(@Json(name = "MeetingId") String str, @Json(name = "Reason") int i, @Json(name = "DurationSeconds") long j, @Json(name = "CallType") int i2) {
        this.meetingId = str;
        this.reason = i;
        this.durationSeconds = j;
        this.callType = i2;
    }

    public final int getCallType() {
        return this.callType;
    }

    public final long getDurationSeconds() {
        return this.durationSeconds;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final int getReason() {
        return this.reason;
    }
}
