package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/QrPaymentEvents$QrPaymentInfoLoadedResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/QrPaymentEvents$QrPaymentInfoLoadedResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "ERROR", "PROCESSING", "REFRESH", "REDIRECT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QrPaymentEvents$QrPaymentInfoLoadedResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrPaymentEvents$QrPaymentInfoLoadedResult[] $VALUES;
    private final String originalValue;
    public static final QrPaymentEvents$QrPaymentInfoLoadedResult OK = new QrPaymentEvents$QrPaymentInfoLoadedResult("OK", 0, WriteBlocks.OK);
    public static final QrPaymentEvents$QrPaymentInfoLoadedResult ERROR = new QrPaymentEvents$QrPaymentInfoLoadedResult("ERROR", 1, "error");
    public static final QrPaymentEvents$QrPaymentInfoLoadedResult PROCESSING = new QrPaymentEvents$QrPaymentInfoLoadedResult("PROCESSING", 2, "processing");
    public static final QrPaymentEvents$QrPaymentInfoLoadedResult REFRESH = new QrPaymentEvents$QrPaymentInfoLoadedResult("REFRESH", 3, "refresh");
    public static final QrPaymentEvents$QrPaymentInfoLoadedResult REDIRECT = new QrPaymentEvents$QrPaymentInfoLoadedResult("REDIRECT", 4, "redirect");

    private static final /* synthetic */ QrPaymentEvents$QrPaymentInfoLoadedResult[] $values() {
        return new QrPaymentEvents$QrPaymentInfoLoadedResult[]{OK, ERROR, PROCESSING, REFRESH, REDIRECT};
    }

    static {
        QrPaymentEvents$QrPaymentInfoLoadedResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrPaymentEvents$QrPaymentInfoLoadedResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrPaymentEvents$QrPaymentInfoLoadedResult valueOf(String str) {
        return (QrPaymentEvents$QrPaymentInfoLoadedResult) Enum.valueOf(QrPaymentEvents$QrPaymentInfoLoadedResult.class, str);
    }

    public static QrPaymentEvents$QrPaymentInfoLoadedResult[] values() {
        return (QrPaymentEvents$QrPaymentInfoLoadedResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
