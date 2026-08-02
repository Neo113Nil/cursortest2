package com.ybsdk.feature.credit.deposit.internal.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/credit/deposit/internal/domain/entities/CreditDepositTransactionStatusEntity$Status", "", "Lcom/ybsdk/feature/credit/deposit/internal/domain/entities/CreditDepositTransactionStatusEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditDepositTransactionStatusEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditDepositTransactionStatusEntity$Status[] $VALUES;
    public static final CreditDepositTransactionStatusEntity$Status PENDING = new CreditDepositTransactionStatusEntity$Status("PENDING", 0);
    public static final CreditDepositTransactionStatusEntity$Status REQUIRED_3DS = new CreditDepositTransactionStatusEntity$Status("REQUIRED_3DS", 1);
    public static final CreditDepositTransactionStatusEntity$Status FINISHED = new CreditDepositTransactionStatusEntity$Status(TlsConstants.TLS_FINISHED, 2);
    public static final CreditDepositTransactionStatusEntity$Status FAILED = new CreditDepositTransactionStatusEntity$Status("FAILED", 3);

    private static final /* synthetic */ CreditDepositTransactionStatusEntity$Status[] $values() {
        return new CreditDepositTransactionStatusEntity$Status[]{PENDING, REQUIRED_3DS, FINISHED, FAILED};
    }

    static {
        CreditDepositTransactionStatusEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CreditDepositTransactionStatusEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditDepositTransactionStatusEntity$Status valueOf(String str) {
        return (CreditDepositTransactionStatusEntity$Status) Enum.valueOf(CreditDepositTransactionStatusEntity$Status.class, str);
    }

    public static CreditDepositTransactionStatusEntity$Status[] values() {
        return (CreditDepositTransactionStatusEntity$Status[]) $VALUES.clone();
    }
}
