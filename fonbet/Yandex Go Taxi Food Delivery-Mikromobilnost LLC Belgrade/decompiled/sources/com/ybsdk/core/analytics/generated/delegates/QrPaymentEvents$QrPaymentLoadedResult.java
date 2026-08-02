package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/QrPaymentEvents$QrPaymentLoadedResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/QrPaymentEvents$QrPaymentLoadedResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "TIMEOUT", "ERROR", "TWO_FA", "DENIED", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrPaymentEvents$QrPaymentLoadedResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrPaymentEvents$QrPaymentLoadedResult[] $VALUES;
    private final String originalValue;
    public static final QrPaymentEvents$QrPaymentLoadedResult OK = new QrPaymentEvents$QrPaymentLoadedResult("OK", 0, WriteBlocks.OK);
    public static final QrPaymentEvents$QrPaymentLoadedResult TIMEOUT = new QrPaymentEvents$QrPaymentLoadedResult("TIMEOUT", 1, "timeout");
    public static final QrPaymentEvents$QrPaymentLoadedResult ERROR = new QrPaymentEvents$QrPaymentLoadedResult("ERROR", 2, "error");
    public static final QrPaymentEvents$QrPaymentLoadedResult TWO_FA = new QrPaymentEvents$QrPaymentLoadedResult("TWO_FA", 3, "two_fa");
    public static final QrPaymentEvents$QrPaymentLoadedResult DENIED = new QrPaymentEvents$QrPaymentLoadedResult("DENIED", 4, "denied");

    private static final /* synthetic */ QrPaymentEvents$QrPaymentLoadedResult[] $values() {
        return new QrPaymentEvents$QrPaymentLoadedResult[]{OK, TIMEOUT, ERROR, TWO_FA, DENIED};
    }

    static {
        QrPaymentEvents$QrPaymentLoadedResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrPaymentEvents$QrPaymentLoadedResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrPaymentEvents$QrPaymentLoadedResult valueOf(String str) {
        return (QrPaymentEvents$QrPaymentLoadedResult) Enum.valueOf(QrPaymentEvents$QrPaymentLoadedResult.class, str);
    }

    public static QrPaymentEvents$QrPaymentLoadedResult[] values() {
        return (QrPaymentEvents$QrPaymentLoadedResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
