package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/CreditDepositShimmerType;", "", "<init>", "(Ljava/lang/String;I)V", "FullScreenShimmer", "AmountDescriptionShimmer", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditDepositShimmerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditDepositShimmerType[] $VALUES;
    public static final CreditDepositShimmerType FullScreenShimmer = new CreditDepositShimmerType("FullScreenShimmer", 0);
    public static final CreditDepositShimmerType AmountDescriptionShimmer = new CreditDepositShimmerType("AmountDescriptionShimmer", 1);

    private static final /* synthetic */ CreditDepositShimmerType[] $values() {
        return new CreditDepositShimmerType[]{FullScreenShimmer, AmountDescriptionShimmer};
    }

    static {
        CreditDepositShimmerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CreditDepositShimmerType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditDepositShimmerType valueOf(String str) {
        return (CreditDepositShimmerType) Enum.valueOf(CreditDepositShimmerType.class, str);
    }

    public static CreditDepositShimmerType[] values() {
        return (CreditDepositShimmerType[]) $VALUES.clone();
    }
}
