package com.yandex.passport.internal.network.response;

import com.yandex.auth.LegacyAccountType;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/network/response/AccountType;", "", "", "networkValue", "Ljava/lang/String;", "getNetworkValue", "()Ljava/lang/String;", "", "primaryAliasType", CA20Status.STATUS_USER_I, "getPrimaryAliasType", "()I", "Companion", "com/yandex/passport/internal/network/response/c", "PORTAL", "LITE", "SOCIAL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final c Companion;
    public static final AccountType LITE;
    public static final AccountType PORTAL;
    public static final AccountType SOCIAL;
    private final String networkValue;
    private final int primaryAliasType;

    static {
        AccountType accountType = new AccountType("PORTAL", 0, "portal", 1);
        PORTAL = accountType;
        AccountType accountType2 = new AccountType("LITE", 1, "lite", 5);
        LITE = accountType2;
        AccountType accountType3 = new AccountType("SOCIAL", 2, LegacyAccountType.STRING_SOCIAL, 6);
        SOCIAL = accountType3;
        AccountType[] accountTypeArr = {accountType, accountType2, accountType3};
        $VALUES = accountTypeArr;
        $ENTRIES = kotlin.enums.a.a(accountTypeArr);
        Companion = new c();
    }

    public AccountType(String str, int i, String str2, int i2) {
        this.networkValue = str2;
        this.primaryAliasType = i2;
    }

    public static final AccountType a(Integer num) {
        Companion.getClass();
        for (AccountType accountType : values()) {
            if (accountType.primaryAliasType == num.intValue()) {
                return accountType;
            }
        }
        return null;
    }

    public static final AccountType b(String str) {
        Companion.getClass();
        for (AccountType accountType : values()) {
            if (jl40.l(accountType.networkValue, str)) {
                return accountType;
            }
        }
        return null;
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
