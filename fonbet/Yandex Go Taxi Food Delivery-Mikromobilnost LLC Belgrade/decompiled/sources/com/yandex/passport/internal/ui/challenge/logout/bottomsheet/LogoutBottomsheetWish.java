package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutBottomsheetWish;", "", "COLLAPSE", "CANCEL", "LOGOUT_THIS_APP", "LOGOUT_ALL_APPS", "DELETE_ACCOUNT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutBottomsheetWish {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogoutBottomsheetWish[] $VALUES;
    public static final LogoutBottomsheetWish CANCEL;
    public static final LogoutBottomsheetWish COLLAPSE;
    public static final LogoutBottomsheetWish DELETE_ACCOUNT;
    public static final LogoutBottomsheetWish LOGOUT_ALL_APPS;
    public static final LogoutBottomsheetWish LOGOUT_THIS_APP;

    static {
        LogoutBottomsheetWish logoutBottomsheetWish = new LogoutBottomsheetWish("COLLAPSE", 0);
        COLLAPSE = logoutBottomsheetWish;
        LogoutBottomsheetWish logoutBottomsheetWish2 = new LogoutBottomsheetWish("CANCEL", 1);
        CANCEL = logoutBottomsheetWish2;
        LogoutBottomsheetWish logoutBottomsheetWish3 = new LogoutBottomsheetWish("LOGOUT_THIS_APP", 2);
        LOGOUT_THIS_APP = logoutBottomsheetWish3;
        LogoutBottomsheetWish logoutBottomsheetWish4 = new LogoutBottomsheetWish("LOGOUT_ALL_APPS", 3);
        LOGOUT_ALL_APPS = logoutBottomsheetWish4;
        LogoutBottomsheetWish logoutBottomsheetWish5 = new LogoutBottomsheetWish("DELETE_ACCOUNT", 4);
        DELETE_ACCOUNT = logoutBottomsheetWish5;
        LogoutBottomsheetWish[] logoutBottomsheetWishArr = {logoutBottomsheetWish, logoutBottomsheetWish2, logoutBottomsheetWish3, logoutBottomsheetWish4, logoutBottomsheetWish5};
        $VALUES = logoutBottomsheetWishArr;
        $ENTRIES = kotlin.enums.a.a(logoutBottomsheetWishArr);
    }

    public static LogoutBottomsheetWish valueOf(String str) {
        return (LogoutBottomsheetWish) Enum.valueOf(LogoutBottomsheetWish.class, str);
    }

    public static LogoutBottomsheetWish[] values() {
        return (LogoutBottomsheetWish[]) $VALUES.clone();
    }
}
