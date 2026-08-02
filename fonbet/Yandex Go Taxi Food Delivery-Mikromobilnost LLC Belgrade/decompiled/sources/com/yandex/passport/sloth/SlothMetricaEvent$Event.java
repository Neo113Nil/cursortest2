package com.yandex.passport.sloth;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"com/yandex/passport/sloth/SlothMetricaEvent$Event", "", "Lcom/yandex/passport/sloth/SlothMetricaEvent$Event;", "", "eventId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ACTIVATED", "SUCCESS", "FAILURE", "CANCELED", "ERROR", "FALLBACK", "MESSAGE_RECEIVED", "MESSAGE_SENT", "SMS_RECEIVED", "COOKIE_FETCH_SUCCEEDED", "COOKIE_FETCH_FAILED", "SOCIAL_AUTH_STARTED", "SESSION_START", "SESSION_CLOSE", "EVENT_SENDER", "NAVIGATE_URL", "CHECK_URL", "UI_EVENT", "UI_ERROR", "UI_WISH", "UI_STATE_CHANGE", "SSL_ERROR", "LOGIN_FINISH", "FINISH_ACCOUNT_DELETION", "PHONE_NUMBER_HINT", "BLOCKER_URL", "OPEN_EXTERNAL_URL", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothMetricaEvent$Event {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothMetricaEvent$Event[] $VALUES;
    public static final SlothMetricaEvent$Event ACTIVATED;
    public static final SlothMetricaEvent$Event BLOCKER_URL;
    public static final SlothMetricaEvent$Event CANCELED;
    public static final SlothMetricaEvent$Event CHECK_URL;
    public static final SlothMetricaEvent$Event COOKIE_FETCH_FAILED;
    public static final SlothMetricaEvent$Event COOKIE_FETCH_SUCCEEDED;
    public static final SlothMetricaEvent$Event ERROR;
    public static final SlothMetricaEvent$Event EVENT_SENDER;
    public static final SlothMetricaEvent$Event FAILURE;
    public static final SlothMetricaEvent$Event FALLBACK;
    public static final SlothMetricaEvent$Event FINISH_ACCOUNT_DELETION;
    public static final SlothMetricaEvent$Event LOGIN_FINISH;
    public static final SlothMetricaEvent$Event MESSAGE_RECEIVED;
    public static final SlothMetricaEvent$Event MESSAGE_SENT;
    public static final SlothMetricaEvent$Event NAVIGATE_URL;
    public static final SlothMetricaEvent$Event OPEN_EXTERNAL_URL;
    public static final SlothMetricaEvent$Event PHONE_NUMBER_HINT;
    public static final SlothMetricaEvent$Event SESSION_CLOSE;
    public static final SlothMetricaEvent$Event SESSION_START;
    public static final SlothMetricaEvent$Event SMS_RECEIVED;
    public static final SlothMetricaEvent$Event SOCIAL_AUTH_STARTED;
    public static final SlothMetricaEvent$Event SSL_ERROR;
    public static final SlothMetricaEvent$Event SUCCESS;
    public static final SlothMetricaEvent$Event UI_ERROR;
    public static final SlothMetricaEvent$Event UI_EVENT;
    public static final SlothMetricaEvent$Event UI_STATE_CHANGE;
    public static final SlothMetricaEvent$Event UI_WISH;
    private final String eventId;

    static {
        SlothMetricaEvent$Event slothMetricaEvent$Event = new SlothMetricaEvent$Event("ACTIVATED", 0, "webam_activated");
        ACTIVATED = slothMetricaEvent$Event;
        SlothMetricaEvent$Event slothMetricaEvent$Event2 = new SlothMetricaEvent$Event("SUCCESS", 1, "webam_success");
        SUCCESS = slothMetricaEvent$Event2;
        SlothMetricaEvent$Event slothMetricaEvent$Event3 = new SlothMetricaEvent$Event("FAILURE", 2, "webam_failure");
        FAILURE = slothMetricaEvent$Event3;
        SlothMetricaEvent$Event slothMetricaEvent$Event4 = new SlothMetricaEvent$Event("CANCELED", 3, "webam_canceled");
        CANCELED = slothMetricaEvent$Event4;
        SlothMetricaEvent$Event slothMetricaEvent$Event5 = new SlothMetricaEvent$Event("ERROR", 4, "webam_error");
        ERROR = slothMetricaEvent$Event5;
        SlothMetricaEvent$Event slothMetricaEvent$Event6 = new SlothMetricaEvent$Event("FALLBACK", 5, "webam_fallback");
        FALLBACK = slothMetricaEvent$Event6;
        SlothMetricaEvent$Event slothMetricaEvent$Event7 = new SlothMetricaEvent$Event("MESSAGE_RECEIVED", 6, "webam_message_received");
        MESSAGE_RECEIVED = slothMetricaEvent$Event7;
        SlothMetricaEvent$Event slothMetricaEvent$Event8 = new SlothMetricaEvent$Event("MESSAGE_SENT", 7, "webam_message_sent");
        MESSAGE_SENT = slothMetricaEvent$Event8;
        SlothMetricaEvent$Event slothMetricaEvent$Event9 = new SlothMetricaEvent$Event("SMS_RECEIVED", 8, "webam_sms_received");
        SMS_RECEIVED = slothMetricaEvent$Event9;
        SlothMetricaEvent$Event slothMetricaEvent$Event10 = new SlothMetricaEvent$Event("COOKIE_FETCH_SUCCEEDED", 9, "webam_cookie_fetch_succeeded");
        COOKIE_FETCH_SUCCEEDED = slothMetricaEvent$Event10;
        SlothMetricaEvent$Event slothMetricaEvent$Event11 = new SlothMetricaEvent$Event("COOKIE_FETCH_FAILED", 10, "webam_cookie_fetch_failed");
        COOKIE_FETCH_FAILED = slothMetricaEvent$Event11;
        SlothMetricaEvent$Event slothMetricaEvent$Event12 = new SlothMetricaEvent$Event("SOCIAL_AUTH_STARTED", 11, "webam_social_auth_started");
        SOCIAL_AUTH_STARTED = slothMetricaEvent$Event12;
        SlothMetricaEvent$Event slothMetricaEvent$Event13 = new SlothMetricaEvent$Event("SESSION_START", 12, "sloth_session_start");
        SESSION_START = slothMetricaEvent$Event13;
        SlothMetricaEvent$Event slothMetricaEvent$Event14 = new SlothMetricaEvent$Event("SESSION_CLOSE", 13, "sloth_session_close");
        SESSION_CLOSE = slothMetricaEvent$Event14;
        SlothMetricaEvent$Event slothMetricaEvent$Event15 = new SlothMetricaEvent$Event("EVENT_SENDER", 14, "sloth_event_sender");
        EVENT_SENDER = slothMetricaEvent$Event15;
        SlothMetricaEvent$Event slothMetricaEvent$Event16 = new SlothMetricaEvent$Event("NAVIGATE_URL", 15, "sloth_navigate_url_v2");
        NAVIGATE_URL = slothMetricaEvent$Event16;
        SlothMetricaEvent$Event slothMetricaEvent$Event17 = new SlothMetricaEvent$Event("CHECK_URL", 16, "sloth_check_url_v2");
        CHECK_URL = slothMetricaEvent$Event17;
        SlothMetricaEvent$Event slothMetricaEvent$Event18 = new SlothMetricaEvent$Event("UI_EVENT", 17, "sloth_ui_event");
        UI_EVENT = slothMetricaEvent$Event18;
        SlothMetricaEvent$Event slothMetricaEvent$Event19 = new SlothMetricaEvent$Event("UI_ERROR", 18, "sloth_ui_error");
        UI_ERROR = slothMetricaEvent$Event19;
        SlothMetricaEvent$Event slothMetricaEvent$Event20 = new SlothMetricaEvent$Event("UI_WISH", 19, "sloth_ui_wish");
        UI_WISH = slothMetricaEvent$Event20;
        SlothMetricaEvent$Event slothMetricaEvent$Event21 = new SlothMetricaEvent$Event("UI_STATE_CHANGE", 20, "sloth_ui_state_change");
        UI_STATE_CHANGE = slothMetricaEvent$Event21;
        SlothMetricaEvent$Event slothMetricaEvent$Event22 = new SlothMetricaEvent$Event("SSL_ERROR", 21, "sloth_ssl_error");
        SSL_ERROR = slothMetricaEvent$Event22;
        SlothMetricaEvent$Event slothMetricaEvent$Event23 = new SlothMetricaEvent$Event("LOGIN_FINISH", 22, "login_finish");
        LOGIN_FINISH = slothMetricaEvent$Event23;
        SlothMetricaEvent$Event slothMetricaEvent$Event24 = new SlothMetricaEvent$Event("FINISH_ACCOUNT_DELETION", 23, "finish_account_deletion");
        FINISH_ACCOUNT_DELETION = slothMetricaEvent$Event24;
        SlothMetricaEvent$Event slothMetricaEvent$Event25 = new SlothMetricaEvent$Event("PHONE_NUMBER_HINT", 24, "phone_number_hint");
        PHONE_NUMBER_HINT = slothMetricaEvent$Event25;
        SlothMetricaEvent$Event slothMetricaEvent$Event26 = new SlothMetricaEvent$Event("BLOCKER_URL", 25, "blocked_url");
        BLOCKER_URL = slothMetricaEvent$Event26;
        SlothMetricaEvent$Event slothMetricaEvent$Event27 = new SlothMetricaEvent$Event("OPEN_EXTERNAL_URL", 26, "open_external_url");
        OPEN_EXTERNAL_URL = slothMetricaEvent$Event27;
        SlothMetricaEvent$Event[] slothMetricaEvent$EventArr = {slothMetricaEvent$Event, slothMetricaEvent$Event2, slothMetricaEvent$Event3, slothMetricaEvent$Event4, slothMetricaEvent$Event5, slothMetricaEvent$Event6, slothMetricaEvent$Event7, slothMetricaEvent$Event8, slothMetricaEvent$Event9, slothMetricaEvent$Event10, slothMetricaEvent$Event11, slothMetricaEvent$Event12, slothMetricaEvent$Event13, slothMetricaEvent$Event14, slothMetricaEvent$Event15, slothMetricaEvent$Event16, slothMetricaEvent$Event17, slothMetricaEvent$Event18, slothMetricaEvent$Event19, slothMetricaEvent$Event20, slothMetricaEvent$Event21, slothMetricaEvent$Event22, slothMetricaEvent$Event23, slothMetricaEvent$Event24, slothMetricaEvent$Event25, slothMetricaEvent$Event26, slothMetricaEvent$Event27};
        $VALUES = slothMetricaEvent$EventArr;
        $ENTRIES = kotlin.enums.a.a(slothMetricaEvent$EventArr);
    }

    public SlothMetricaEvent$Event(String str, int i, String str2) {
        this.eventId = str2;
    }

    public static SlothMetricaEvent$Event valueOf(String str) {
        return (SlothMetricaEvent$Event) Enum.valueOf(SlothMetricaEvent$Event.class, str);
    }

    public static SlothMetricaEvent$Event[] values() {
        return (SlothMetricaEvent$Event[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }
}
