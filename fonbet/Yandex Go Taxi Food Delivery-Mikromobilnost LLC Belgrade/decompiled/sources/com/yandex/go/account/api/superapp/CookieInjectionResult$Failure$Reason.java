package com.yandex.go.account.api.superapp;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/account/api/superapp/CookieInjectionResult$Failure$Reason", "", "Lcom/yandex/go/account/api/superapp/CookieInjectionResult$Failure$Reason;", "ATTEMPTS_LIMIT_REACHED", "MALFORMED_URL", "UNSUPPORTED_ACCOUNT_TYPE", "ACCOUNT_NOT_FOUND", "ACCOUNT_NOT_AUTHORIZED", "NETWORK_ERROR", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CookieInjectionResult$Failure$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CookieInjectionResult$Failure$Reason[] $VALUES;
    public static final CookieInjectionResult$Failure$Reason ACCOUNT_NOT_AUTHORIZED;
    public static final CookieInjectionResult$Failure$Reason ACCOUNT_NOT_FOUND;
    public static final CookieInjectionResult$Failure$Reason ATTEMPTS_LIMIT_REACHED;
    public static final CookieInjectionResult$Failure$Reason MALFORMED_URL;
    public static final CookieInjectionResult$Failure$Reason NETWORK_ERROR;
    public static final CookieInjectionResult$Failure$Reason UNKNOWN;
    public static final CookieInjectionResult$Failure$Reason UNSUPPORTED_ACCOUNT_TYPE;

    static {
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason = new CookieInjectionResult$Failure$Reason("ATTEMPTS_LIMIT_REACHED", 0);
        ATTEMPTS_LIMIT_REACHED = cookieInjectionResult$Failure$Reason;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason2 = new CookieInjectionResult$Failure$Reason("MALFORMED_URL", 1);
        MALFORMED_URL = cookieInjectionResult$Failure$Reason2;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason3 = new CookieInjectionResult$Failure$Reason("UNSUPPORTED_ACCOUNT_TYPE", 2);
        UNSUPPORTED_ACCOUNT_TYPE = cookieInjectionResult$Failure$Reason3;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason4 = new CookieInjectionResult$Failure$Reason("ACCOUNT_NOT_FOUND", 3);
        ACCOUNT_NOT_FOUND = cookieInjectionResult$Failure$Reason4;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason5 = new CookieInjectionResult$Failure$Reason("ACCOUNT_NOT_AUTHORIZED", 4);
        ACCOUNT_NOT_AUTHORIZED = cookieInjectionResult$Failure$Reason5;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason6 = new CookieInjectionResult$Failure$Reason("NETWORK_ERROR", 5);
        NETWORK_ERROR = cookieInjectionResult$Failure$Reason6;
        CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason7 = new CookieInjectionResult$Failure$Reason("UNKNOWN", 6);
        UNKNOWN = cookieInjectionResult$Failure$Reason7;
        CookieInjectionResult$Failure$Reason[] cookieInjectionResult$Failure$ReasonArr = {cookieInjectionResult$Failure$Reason, cookieInjectionResult$Failure$Reason2, cookieInjectionResult$Failure$Reason3, cookieInjectionResult$Failure$Reason4, cookieInjectionResult$Failure$Reason5, cookieInjectionResult$Failure$Reason6, cookieInjectionResult$Failure$Reason7};
        $VALUES = cookieInjectionResult$Failure$ReasonArr;
        $ENTRIES = a.a(cookieInjectionResult$Failure$ReasonArr);
    }

    public static CookieInjectionResult$Failure$Reason valueOf(String str) {
        return (CookieInjectionResult$Failure$Reason) Enum.valueOf(CookieInjectionResult$Failure$Reason.class, str);
    }

    public static CookieInjectionResult$Failure$Reason[] values() {
        return (CookieInjectionResult$Failure$Reason[]) $VALUES.clone();
    }
}
