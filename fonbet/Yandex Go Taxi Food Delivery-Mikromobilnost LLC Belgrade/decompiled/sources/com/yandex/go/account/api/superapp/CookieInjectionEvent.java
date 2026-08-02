package com.yandex.go.account.api.superapp;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/account/api/superapp/CookieInjectionEvent;", "", "ALREADY_INJECTED", "UPDATE_STARTED", "UPDATE_COMPLETED", "UPDATE_FAILED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CookieInjectionEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CookieInjectionEvent[] $VALUES;
    public static final CookieInjectionEvent ALREADY_INJECTED;
    public static final CookieInjectionEvent UPDATE_COMPLETED;
    public static final CookieInjectionEvent UPDATE_FAILED;
    public static final CookieInjectionEvent UPDATE_STARTED;

    static {
        CookieInjectionEvent cookieInjectionEvent = new CookieInjectionEvent("ALREADY_INJECTED", 0);
        ALREADY_INJECTED = cookieInjectionEvent;
        CookieInjectionEvent cookieInjectionEvent2 = new CookieInjectionEvent("UPDATE_STARTED", 1);
        UPDATE_STARTED = cookieInjectionEvent2;
        CookieInjectionEvent cookieInjectionEvent3 = new CookieInjectionEvent("UPDATE_COMPLETED", 2);
        UPDATE_COMPLETED = cookieInjectionEvent3;
        CookieInjectionEvent cookieInjectionEvent4 = new CookieInjectionEvent("UPDATE_FAILED", 3);
        UPDATE_FAILED = cookieInjectionEvent4;
        CookieInjectionEvent[] cookieInjectionEventArr = {cookieInjectionEvent, cookieInjectionEvent2, cookieInjectionEvent3, cookieInjectionEvent4};
        $VALUES = cookieInjectionEventArr;
        $ENTRIES = a.a(cookieInjectionEventArr);
    }

    public static CookieInjectionEvent valueOf(String str) {
        return (CookieInjectionEvent) Enum.valueOf(CookieInjectionEvent.class, str);
    }

    public static CookieInjectionEvent[] values() {
        return (CookieInjectionEvent[]) $VALUES.clone();
    }
}
