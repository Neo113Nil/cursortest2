package com.ybsdk.feature.savings.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SAVINGS", "DEPOSIT", "INVEST", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountTypeDto[] $VALUES;
    public static final AccountTypeDto SAVINGS = new AccountTypeDto("SAVINGS", 0);
    public static final AccountTypeDto DEPOSIT = new AccountTypeDto("DEPOSIT", 1);
    public static final AccountTypeDto INVEST = new AccountTypeDto("INVEST", 2);

    private static final /* synthetic */ AccountTypeDto[] $values() {
        return new AccountTypeDto[]{SAVINGS, DEPOSIT, INVEST};
    }

    static {
        AccountTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AccountTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AccountTypeDto valueOf(String str) {
        return (AccountTypeDto) Enum.valueOf(AccountTypeDto.class, str);
    }

    public static AccountTypeDto[] values() {
        return (AccountTypeDto[]) $VALUES.clone();
    }
}
