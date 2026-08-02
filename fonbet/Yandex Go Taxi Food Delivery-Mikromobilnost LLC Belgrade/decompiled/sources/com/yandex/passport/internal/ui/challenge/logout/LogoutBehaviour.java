package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/LogoutBehaviour;", "", "Companion", "com/yandex/passport/internal/ui/challenge/logout/d", "DROP_CLIENT_TOKEN", "DROP_X_TOKEN", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutBehaviour {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogoutBehaviour[] $VALUES;
    public static final d Companion;
    public static final LogoutBehaviour DROP_CLIENT_TOKEN;
    public static final LogoutBehaviour DROP_X_TOKEN;
    private static final String KEY_LOGOUT_BEHAVIOUR = "passport-logout-behaviour";

    static {
        LogoutBehaviour logoutBehaviour = new LogoutBehaviour("DROP_CLIENT_TOKEN", 0);
        DROP_CLIENT_TOKEN = logoutBehaviour;
        LogoutBehaviour logoutBehaviour2 = new LogoutBehaviour("DROP_X_TOKEN", 1);
        DROP_X_TOKEN = logoutBehaviour2;
        LogoutBehaviour[] logoutBehaviourArr = {logoutBehaviour, logoutBehaviour2};
        $VALUES = logoutBehaviourArr;
        $ENTRIES = kotlin.enums.a.a(logoutBehaviourArr);
        Companion = new d();
    }

    public static LogoutBehaviour valueOf(String str) {
        return (LogoutBehaviour) Enum.valueOf(LogoutBehaviour.class, str);
    }

    public static LogoutBehaviour[] values() {
        return (LogoutBehaviour[]) $VALUES.clone();
    }
}
