package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CreditDepositEvents$CreditDepositPaymentResultStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/CreditDepositEvents$CreditDepositPaymentResultStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "ERROR", "PROCESSING", "REQUIRED_3DS", "TIMEOUT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreditDepositEvents$CreditDepositPaymentResultStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditDepositEvents$CreditDepositPaymentResultStatus[] $VALUES;
    private final String originalValue;
    public static final CreditDepositEvents$CreditDepositPaymentResultStatus OK = new CreditDepositEvents$CreditDepositPaymentResultStatus("OK", 0, WriteBlocks.OK);
    public static final CreditDepositEvents$CreditDepositPaymentResultStatus ERROR = new CreditDepositEvents$CreditDepositPaymentResultStatus("ERROR", 1, "error");
    public static final CreditDepositEvents$CreditDepositPaymentResultStatus PROCESSING = new CreditDepositEvents$CreditDepositPaymentResultStatus("PROCESSING", 2, "processing");
    public static final CreditDepositEvents$CreditDepositPaymentResultStatus REQUIRED_3DS = new CreditDepositEvents$CreditDepositPaymentResultStatus("REQUIRED_3DS", 3, "required_3ds");
    public static final CreditDepositEvents$CreditDepositPaymentResultStatus TIMEOUT = new CreditDepositEvents$CreditDepositPaymentResultStatus("TIMEOUT", 4, "timeout");

    private static final /* synthetic */ CreditDepositEvents$CreditDepositPaymentResultStatus[] $values() {
        return new CreditDepositEvents$CreditDepositPaymentResultStatus[]{OK, ERROR, PROCESSING, REQUIRED_3DS, TIMEOUT};
    }

    static {
        CreditDepositEvents$CreditDepositPaymentResultStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CreditDepositEvents$CreditDepositPaymentResultStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditDepositEvents$CreditDepositPaymentResultStatus valueOf(String str) {
        return (CreditDepositEvents$CreditDepositPaymentResultStatus) Enum.valueOf(CreditDepositEvents$CreditDepositPaymentResultStatus.class, str);
    }

    public static CreditDepositEvents$CreditDepositPaymentResultStatus[] values() {
        return (CreditDepositEvents$CreditDepositPaymentResultStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
