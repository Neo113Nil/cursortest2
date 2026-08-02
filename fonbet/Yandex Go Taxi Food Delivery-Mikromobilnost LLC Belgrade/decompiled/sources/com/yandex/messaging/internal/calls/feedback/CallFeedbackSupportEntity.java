package com.yandex.messaging.internal.calls.feedback;

import com.squareup.moshi.Json;
import com.yandex.auth.LegacyAccountType;
import defpackage.cex;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes15.dex */
public class CallFeedbackSupportEntity {

    @Json(name = StartupRequest.PARAM_APP_VERSION)
    public String appVersion;

    @Json(name = "end_call_reason")
    public String callEndReason;

    @Json(name = "call_guid")
    public String callGuid;

    @cex
    @Json(name = "chat_id")
    public String chatId;

    @cex
    @Json(name = "client")
    public String client;

    @cex
    @Json(name = "answer_long_text_21797")
    public String details;

    @cex
    @Json(name = "device")
    public String device;

    @Json(name = MetaDataField.DEVICE_ID_FIELD)
    public String deviceId;

    @cex
    @Json(name = "email")
    public String email;

    @cex
    @Json(name = "guid")
    public String guid;

    @Json(name = "is_initiator")
    public String isInitiator;

    @cex
    @Json(name = LegacyAccountType.STRING_LOGIN)
    public String login;

    @Json(name = "meeting_id")
    public String meetingId;

    @Json(name = "answer_choices_10281826")
    public List<String> messageSubject;

    @cex
    @Json(name = "os")
    public String os;

    @Json(name = "score")
    public int score;

    @Json(name = "answer_choices_10281824")
    public List<String> service;

    @cex
    @Json(name = ClidProvider.TIMESTAMP)
    public String timestamp;

    @Json(name = "u-uid")
    public String uuid;
}
