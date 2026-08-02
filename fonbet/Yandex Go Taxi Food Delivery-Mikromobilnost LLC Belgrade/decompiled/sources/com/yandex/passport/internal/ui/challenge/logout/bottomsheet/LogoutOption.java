package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutOption;", "", "ThisApp", "AllAps", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LogoutOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogoutOption[] $VALUES;
    public static final LogoutOption AllAps;
    public static final LogoutOption ThisApp;

    static {
        LogoutOption logoutOption = new LogoutOption("ThisApp", 0);
        ThisApp = logoutOption;
        LogoutOption logoutOption2 = new LogoutOption("AllAps", 1);
        AllAps = logoutOption2;
        LogoutOption[] logoutOptionArr = {logoutOption, logoutOption2};
        $VALUES = logoutOptionArr;
        $ENTRIES = kotlin.enums.a.a(logoutOptionArr);
    }

    public static LogoutOption valueOf(String str) {
        return (LogoutOption) Enum.valueOf(LogoutOption.class, str);
    }

    public static LogoutOption[] values() {
        return (LogoutOption[]) $VALUES.clone();
    }
}
