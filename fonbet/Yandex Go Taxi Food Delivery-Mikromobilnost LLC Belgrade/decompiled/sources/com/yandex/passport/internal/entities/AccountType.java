package com.yandex.passport.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/internal/entities/AccountType;", "", "PORTAL", "LITE", "SOCIAL", "PDD", "PHONISH", "MAILISH", "MUSIC_PHONISH", "CHILDISH", "UNDEFINED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType CHILDISH;
    public static final AccountType LITE;
    public static final AccountType MAILISH;
    public static final AccountType MUSIC_PHONISH;
    public static final AccountType PDD;
    public static final AccountType PHONISH;
    public static final AccountType PORTAL;
    public static final AccountType SOCIAL;
    public static final AccountType UNDEFINED;

    static {
        AccountType accountType = new AccountType("PORTAL", 0);
        PORTAL = accountType;
        AccountType accountType2 = new AccountType("LITE", 1);
        LITE = accountType2;
        AccountType accountType3 = new AccountType("SOCIAL", 2);
        SOCIAL = accountType3;
        AccountType accountType4 = new AccountType("PDD", 3);
        PDD = accountType4;
        AccountType accountType5 = new AccountType("PHONISH", 4);
        PHONISH = accountType5;
        AccountType accountType6 = new AccountType("MAILISH", 5);
        MAILISH = accountType6;
        AccountType accountType7 = new AccountType("MUSIC_PHONISH", 6);
        MUSIC_PHONISH = accountType7;
        AccountType accountType8 = new AccountType("CHILDISH", 7);
        CHILDISH = accountType8;
        AccountType accountType9 = new AccountType("UNDEFINED", 8);
        UNDEFINED = accountType9;
        AccountType[] accountTypeArr = {accountType, accountType2, accountType3, accountType4, accountType5, accountType6, accountType7, accountType8, accountType9};
        $VALUES = accountTypeArr;
        $ENTRIES = kotlin.enums.a.a(accountTypeArr);
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
