package com.yandex.go.analytics;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/analytics/AccountType;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Yandex", "Lite", "Phonish", "Social", "None", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType Lite;
    public static final AccountType None;
    public static final AccountType Phonish;
    public static final AccountType Social;
    public static final AccountType Yandex;
    private final String eventValue;

    static {
        AccountType accountType = new AccountType("Yandex", 0, "yandex");
        Yandex = accountType;
        AccountType accountType2 = new AccountType("Lite", 1, "lite");
        Lite = accountType2;
        AccountType accountType3 = new AccountType("Phonish", 2, "phonish");
        Phonish = accountType3;
        AccountType accountType4 = new AccountType("Social", 3, LegacyAccountType.STRING_SOCIAL);
        Social = accountType4;
        AccountType accountType5 = new AccountType("None", 4, "none");
        None = accountType5;
        AccountType[] accountTypeArr = {accountType, accountType2, accountType3, accountType4, accountType5};
        $VALUES = accountTypeArr;
        $ENTRIES = kotlin.enums.a.a(accountTypeArr);
    }

    public AccountType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
