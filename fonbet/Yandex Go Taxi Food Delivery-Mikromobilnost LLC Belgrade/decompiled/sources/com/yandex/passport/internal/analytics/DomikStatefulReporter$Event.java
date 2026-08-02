package com.yandex.passport.internal.analytics;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"com/yandex/passport/internal/analytics/DomikStatefulReporter$Event", "", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Event;", "", "eventId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OPEN_SCREEN", "CLOSE_SCREEN", "BACK_PRESSED", "NEXT_PRESSED", "SCREEN_SUCCESS", "CHANGE_LOGIN", "SOCIAL_AUTH_START", "SOCIAL_AUTH_SUCCESS", "RESEND_SMS", "EULA_CLICKED", "CONFIDENTIAL_CLICKED", "MONEY_EULA_CLICKED", "TAXI_EULA_CLICKED", "SMS_RETRIEVER_TRIGGERED", "AUTH_SUCCESS", "SOCIAL_REGISTRATION_SKIP", "EXTERNAL_ACTION_AUTH", "EXTERNAL_ACTION_AUTH_SUCCESS", "EXTERNAL_ACTION_AUTH_CANCEL", "USE_SMS_CLICK", "WEBAM_SMS_RECEIVED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikStatefulReporter$Event {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikStatefulReporter$Event[] $VALUES;
    public static final DomikStatefulReporter$Event AUTH_SUCCESS;
    public static final DomikStatefulReporter$Event BACK_PRESSED;
    public static final DomikStatefulReporter$Event CHANGE_LOGIN;
    public static final DomikStatefulReporter$Event CLOSE_SCREEN;
    public static final DomikStatefulReporter$Event CONFIDENTIAL_CLICKED;
    public static final DomikStatefulReporter$Event EULA_CLICKED;
    public static final DomikStatefulReporter$Event EXTERNAL_ACTION_AUTH;
    public static final DomikStatefulReporter$Event EXTERNAL_ACTION_AUTH_CANCEL;
    public static final DomikStatefulReporter$Event EXTERNAL_ACTION_AUTH_SUCCESS;
    public static final DomikStatefulReporter$Event MONEY_EULA_CLICKED;
    public static final DomikStatefulReporter$Event NEXT_PRESSED;
    public static final DomikStatefulReporter$Event OPEN_SCREEN;
    public static final DomikStatefulReporter$Event RESEND_SMS;
    public static final DomikStatefulReporter$Event SCREEN_SUCCESS;
    public static final DomikStatefulReporter$Event SMS_RETRIEVER_TRIGGERED;
    public static final DomikStatefulReporter$Event SOCIAL_AUTH_START;
    public static final DomikStatefulReporter$Event SOCIAL_AUTH_SUCCESS;
    public static final DomikStatefulReporter$Event SOCIAL_REGISTRATION_SKIP;
    public static final DomikStatefulReporter$Event TAXI_EULA_CLICKED;
    public static final DomikStatefulReporter$Event USE_SMS_CLICK;
    public static final DomikStatefulReporter$Event WEBAM_SMS_RECEIVED;
    private final String eventId;

    static {
        DomikStatefulReporter$Event domikStatefulReporter$Event = new DomikStatefulReporter$Event("OPEN_SCREEN", 0, OpenList.STR_OPEN);
        OPEN_SCREEN = domikStatefulReporter$Event;
        DomikStatefulReporter$Event domikStatefulReporter$Event2 = new DomikStatefulReporter$Event("CLOSE_SCREEN", 1, "close");
        CLOSE_SCREEN = domikStatefulReporter$Event2;
        DomikStatefulReporter$Event domikStatefulReporter$Event3 = new DomikStatefulReporter$Event("BACK_PRESSED", 2, "back");
        BACK_PRESSED = domikStatefulReporter$Event3;
        DomikStatefulReporter$Event domikStatefulReporter$Event4 = new DomikStatefulReporter$Event("NEXT_PRESSED", 3, "next");
        NEXT_PRESSED = domikStatefulReporter$Event4;
        DomikStatefulReporter$Event domikStatefulReporter$Event5 = new DomikStatefulReporter$Event("SCREEN_SUCCESS", 4, "screen_success");
        SCREEN_SUCCESS = domikStatefulReporter$Event5;
        DomikStatefulReporter$Event domikStatefulReporter$Event6 = new DomikStatefulReporter$Event("CHANGE_LOGIN", 5, "change_login");
        CHANGE_LOGIN = domikStatefulReporter$Event6;
        DomikStatefulReporter$Event domikStatefulReporter$Event7 = new DomikStatefulReporter$Event("SOCIAL_AUTH_START", 6, LegacyAccountType.STRING_SOCIAL);
        SOCIAL_AUTH_START = domikStatefulReporter$Event7;
        DomikStatefulReporter$Event domikStatefulReporter$Event8 = new DomikStatefulReporter$Event("SOCIAL_AUTH_SUCCESS", 7, "social.success");
        SOCIAL_AUTH_SUCCESS = domikStatefulReporter$Event8;
        DomikStatefulReporter$Event domikStatefulReporter$Event9 = new DomikStatefulReporter$Event("RESEND_SMS", 8, "send_again");
        RESEND_SMS = domikStatefulReporter$Event9;
        DomikStatefulReporter$Event domikStatefulReporter$Event10 = new DomikStatefulReporter$Event("EULA_CLICKED", 9, "legal");
        EULA_CLICKED = domikStatefulReporter$Event10;
        DomikStatefulReporter$Event domikStatefulReporter$Event11 = new DomikStatefulReporter$Event("CONFIDENTIAL_CLICKED", 10, "confidential");
        CONFIDENTIAL_CLICKED = domikStatefulReporter$Event11;
        DomikStatefulReporter$Event domikStatefulReporter$Event12 = new DomikStatefulReporter$Event("MONEY_EULA_CLICKED", 11, "money_legal");
        MONEY_EULA_CLICKED = domikStatefulReporter$Event12;
        DomikStatefulReporter$Event domikStatefulReporter$Event13 = new DomikStatefulReporter$Event("TAXI_EULA_CLICKED", 12, "taxi_legal");
        TAXI_EULA_CLICKED = domikStatefulReporter$Event13;
        DomikStatefulReporter$Event domikStatefulReporter$Event14 = new DomikStatefulReporter$Event("SMS_RETRIEVER_TRIGGERED", 13, "get_sms_from_retriever");
        SMS_RETRIEVER_TRIGGERED = domikStatefulReporter$Event14;
        DomikStatefulReporter$Event domikStatefulReporter$Event15 = new DomikStatefulReporter$Event("AUTH_SUCCESS", 14, "auth_success");
        AUTH_SUCCESS = domikStatefulReporter$Event15;
        DomikStatefulReporter$Event domikStatefulReporter$Event16 = new DomikStatefulReporter$Event("SOCIAL_REGISTRATION_SKIP", 15, "social_registration_skip");
        SOCIAL_REGISTRATION_SKIP = domikStatefulReporter$Event16;
        DomikStatefulReporter$Event domikStatefulReporter$Event17 = new DomikStatefulReporter$Event("EXTERNAL_ACTION_AUTH", 16, "external_action_auth");
        EXTERNAL_ACTION_AUTH = domikStatefulReporter$Event17;
        DomikStatefulReporter$Event domikStatefulReporter$Event18 = new DomikStatefulReporter$Event("EXTERNAL_ACTION_AUTH_SUCCESS", 17, "external_action_auth_success");
        EXTERNAL_ACTION_AUTH_SUCCESS = domikStatefulReporter$Event18;
        DomikStatefulReporter$Event domikStatefulReporter$Event19 = new DomikStatefulReporter$Event("EXTERNAL_ACTION_AUTH_CANCEL", 18, "external_action_auth_cancel");
        EXTERNAL_ACTION_AUTH_CANCEL = domikStatefulReporter$Event19;
        DomikStatefulReporter$Event domikStatefulReporter$Event20 = new DomikStatefulReporter$Event("USE_SMS_CLICK", 19, "use_sms_click");
        USE_SMS_CLICK = domikStatefulReporter$Event20;
        DomikStatefulReporter$Event domikStatefulReporter$Event21 = new DomikStatefulReporter$Event("WEBAM_SMS_RECEIVED", 20, "webam_sms_received");
        WEBAM_SMS_RECEIVED = domikStatefulReporter$Event21;
        DomikStatefulReporter$Event[] domikStatefulReporter$EventArr = {domikStatefulReporter$Event, domikStatefulReporter$Event2, domikStatefulReporter$Event3, domikStatefulReporter$Event4, domikStatefulReporter$Event5, domikStatefulReporter$Event6, domikStatefulReporter$Event7, domikStatefulReporter$Event8, domikStatefulReporter$Event9, domikStatefulReporter$Event10, domikStatefulReporter$Event11, domikStatefulReporter$Event12, domikStatefulReporter$Event13, domikStatefulReporter$Event14, domikStatefulReporter$Event15, domikStatefulReporter$Event16, domikStatefulReporter$Event17, domikStatefulReporter$Event18, domikStatefulReporter$Event19, domikStatefulReporter$Event20, domikStatefulReporter$Event21};
        $VALUES = domikStatefulReporter$EventArr;
        $ENTRIES = kotlin.enums.a.a(domikStatefulReporter$EventArr);
    }

    public DomikStatefulReporter$Event(String str, int i, String str2) {
        this.eventId = str2;
    }

    public static DomikStatefulReporter$Event valueOf(String str) {
        return (DomikStatefulReporter$Event) Enum.valueOf(DomikStatefulReporter$Event.class, str);
    }

    public static DomikStatefulReporter$Event[] values() {
        return (DomikStatefulReporter$Event[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }
}
