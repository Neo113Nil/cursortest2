package com.yandex.messaging.internal.calls.feedback;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class CallFeedbackToolsEntity {

    @cex
    @Json(name = "AudioReasons")
    public String[] audioReasons;

    @Json(name = "CallEndedReason")
    public String callEndedReason;

    @Json(name = "CallGUID")
    public String callGuid;

    @Json(name = "Detail")
    public String details;

    @cex
    @Json(name = "Environment")
    public String environment;

    @Json(name = "MeetingId")
    public String meetingId;

    @Json(name = "Score")
    public int score;

    @cex
    @Json(name = "UserGUID")
    public String userGuid;

    @cex
    @Json(name = "VideoReasons")
    public String[] videoReasons;
}
