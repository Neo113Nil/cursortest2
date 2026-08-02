package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/AccountListShowMode;", "", "BOTTOM_SHEET", "FULLSCREEN", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountListShowMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountListShowMode[] $VALUES;
    public static final AccountListShowMode BOTTOM_SHEET;
    public static final AccountListShowMode FULLSCREEN;

    static {
        AccountListShowMode accountListShowMode = new AccountListShowMode("BOTTOM_SHEET", 0);
        BOTTOM_SHEET = accountListShowMode;
        AccountListShowMode accountListShowMode2 = new AccountListShowMode("FULLSCREEN", 1);
        FULLSCREEN = accountListShowMode2;
        AccountListShowMode[] accountListShowModeArr = {accountListShowMode, accountListShowMode2};
        $VALUES = accountListShowModeArr;
        $ENTRIES = kotlin.enums.a.a(accountListShowModeArr);
    }

    public static AccountListShowMode valueOf(String str) {
        return (AccountListShowMode) Enum.valueOf(AccountListShowMode.class, str);
    }

    public static AccountListShowMode[] values() {
        return (AccountListShowMode[]) $VALUES.clone();
    }
}
