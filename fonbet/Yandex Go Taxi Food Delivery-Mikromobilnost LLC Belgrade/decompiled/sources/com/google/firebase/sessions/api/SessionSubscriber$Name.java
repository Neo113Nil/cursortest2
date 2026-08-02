package com.google.firebase.sessions.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/google/firebase/sessions/api/SessionSubscriber$Name", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionSubscriber$Name {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SessionSubscriber$Name[] $VALUES;
    public static final SessionSubscriber$Name CRASHLYTICS;
    public static final SessionSubscriber$Name MATT_SAYS_HI;
    public static final SessionSubscriber$Name PERFORMANCE;

    static {
        SessionSubscriber$Name sessionSubscriber$Name = new SessionSubscriber$Name("CRASHLYTICS", 0);
        CRASHLYTICS = sessionSubscriber$Name;
        SessionSubscriber$Name sessionSubscriber$Name2 = new SessionSubscriber$Name("PERFORMANCE", 1);
        PERFORMANCE = sessionSubscriber$Name2;
        SessionSubscriber$Name sessionSubscriber$Name3 = new SessionSubscriber$Name("MATT_SAYS_HI", 2);
        MATT_SAYS_HI = sessionSubscriber$Name3;
        SessionSubscriber$Name[] sessionSubscriber$NameArr = {sessionSubscriber$Name, sessionSubscriber$Name2, sessionSubscriber$Name3};
        $VALUES = sessionSubscriber$NameArr;
        $ENTRIES = kotlin.enums.a.a(sessionSubscriber$NameArr);
    }

    public static SessionSubscriber$Name valueOf(String str) {
        return (SessionSubscriber$Name) Enum.valueOf(SessionSubscriber$Name.class, str);
    }

    public static SessionSubscriber$Name[] values() {
        return (SessionSubscriber$Name[]) $VALUES.clone();
    }
}
