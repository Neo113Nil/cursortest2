package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/CreditType;", "", "<init>", "(Ljava/lang/String;I)V", "CREDIT_LIMIT_DEPOSIT", "CREDIT_DEPOSIT", "MKK_DEPOSIT", "BOOST_DEPOSIT", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditType[] $VALUES;
    public static final CreditType CREDIT_LIMIT_DEPOSIT = new CreditType("CREDIT_LIMIT_DEPOSIT", 0);
    public static final CreditType CREDIT_DEPOSIT = new CreditType("CREDIT_DEPOSIT", 1);
    public static final CreditType MKK_DEPOSIT = new CreditType("MKK_DEPOSIT", 2);
    public static final CreditType BOOST_DEPOSIT = new CreditType("BOOST_DEPOSIT", 3);

    private static final /* synthetic */ CreditType[] $values() {
        return new CreditType[]{CREDIT_LIMIT_DEPOSIT, CREDIT_DEPOSIT, MKK_DEPOSIT, BOOST_DEPOSIT};
    }

    static {
        CreditType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CreditType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditType valueOf(String str) {
        return (CreditType) Enum.valueOf(CreditType.class, str);
    }

    public static CreditType[] values() {
        return (CreditType[]) $VALUES.clone();
    }
}
