package com.yandex.quark.webchat.auth.internal.synchronizer;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/quark/webchat/auth/internal/synchronizer/SmartCookieRefreshImpl$ApplyEventReason", "", "Lcom/yandex/quark/webchat/auth/internal/synchronizer/SmartCookieRefreshImpl$ApplyEventReason;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DISABLED", "UNSET", "FORCED", "APP_INACTIVE", "WEB_APP_NO_COOKIES", "COOKIES_EXPIRING", "COOKIES_PROBABLY_EXPIRING", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmartCookieRefreshImpl$ApplyEventReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SmartCookieRefreshImpl$ApplyEventReason[] $VALUES;
    public static final SmartCookieRefreshImpl$ApplyEventReason APP_INACTIVE;
    public static final SmartCookieRefreshImpl$ApplyEventReason COOKIES_EXPIRING;
    public static final SmartCookieRefreshImpl$ApplyEventReason COOKIES_PROBABLY_EXPIRING;
    public static final SmartCookieRefreshImpl$ApplyEventReason DISABLED;
    public static final SmartCookieRefreshImpl$ApplyEventReason FORCED;
    public static final SmartCookieRefreshImpl$ApplyEventReason UNSET;
    public static final SmartCookieRefreshImpl$ApplyEventReason WEB_APP_NO_COOKIES;
    private final String value;

    static {
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason = new SmartCookieRefreshImpl$ApplyEventReason("DISABLED", 0, BackendConfig.Restrictions.DISABLED);
        DISABLED = smartCookieRefreshImpl$ApplyEventReason;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason2 = new SmartCookieRefreshImpl$ApplyEventReason("UNSET", 1, "unset");
        UNSET = smartCookieRefreshImpl$ApplyEventReason2;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason3 = new SmartCookieRefreshImpl$ApplyEventReason("FORCED", 2, "forced");
        FORCED = smartCookieRefreshImpl$ApplyEventReason3;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason4 = new SmartCookieRefreshImpl$ApplyEventReason("APP_INACTIVE", 3, "app_inactive");
        APP_INACTIVE = smartCookieRefreshImpl$ApplyEventReason4;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason5 = new SmartCookieRefreshImpl$ApplyEventReason("WEB_APP_NO_COOKIES", 4, "web_app_no_cookies");
        WEB_APP_NO_COOKIES = smartCookieRefreshImpl$ApplyEventReason5;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason6 = new SmartCookieRefreshImpl$ApplyEventReason("COOKIES_EXPIRING", 5, "cookies_expire_soon");
        COOKIES_EXPIRING = smartCookieRefreshImpl$ApplyEventReason6;
        SmartCookieRefreshImpl$ApplyEventReason smartCookieRefreshImpl$ApplyEventReason7 = new SmartCookieRefreshImpl$ApplyEventReason("COOKIES_PROBABLY_EXPIRING", 6, "cookies_probably_expire_soon");
        COOKIES_PROBABLY_EXPIRING = smartCookieRefreshImpl$ApplyEventReason7;
        SmartCookieRefreshImpl$ApplyEventReason[] smartCookieRefreshImpl$ApplyEventReasonArr = {smartCookieRefreshImpl$ApplyEventReason, smartCookieRefreshImpl$ApplyEventReason2, smartCookieRefreshImpl$ApplyEventReason3, smartCookieRefreshImpl$ApplyEventReason4, smartCookieRefreshImpl$ApplyEventReason5, smartCookieRefreshImpl$ApplyEventReason6, smartCookieRefreshImpl$ApplyEventReason7};
        $VALUES = smartCookieRefreshImpl$ApplyEventReasonArr;
        $ENTRIES = kotlin.enums.a.a(smartCookieRefreshImpl$ApplyEventReasonArr);
    }

    public SmartCookieRefreshImpl$ApplyEventReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static SmartCookieRefreshImpl$ApplyEventReason valueOf(String str) {
        return (SmartCookieRefreshImpl$ApplyEventReason) Enum.valueOf(SmartCookieRefreshImpl$ApplyEventReason.class, str);
    }

    public static SmartCookieRefreshImpl$ApplyEventReason[] values() {
        return (SmartCookieRefreshImpl$ApplyEventReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
