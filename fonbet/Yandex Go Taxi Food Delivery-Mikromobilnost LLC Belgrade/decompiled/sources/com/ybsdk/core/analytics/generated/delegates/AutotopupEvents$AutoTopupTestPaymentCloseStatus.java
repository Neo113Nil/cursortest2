package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/AutotopupEvents$AutoTopupTestPaymentCloseStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/AutotopupEvents$AutoTopupTestPaymentCloseStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "TIMEOUT", "IN_PROGRESS", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutotopupEvents$AutoTopupTestPaymentCloseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutotopupEvents$AutoTopupTestPaymentCloseStatus[] $VALUES;
    private final String originalValue;
    public static final AutotopupEvents$AutoTopupTestPaymentCloseStatus SUCCESS = new AutotopupEvents$AutoTopupTestPaymentCloseStatus("SUCCESS", 0, "success");
    public static final AutotopupEvents$AutoTopupTestPaymentCloseStatus FAILURE = new AutotopupEvents$AutoTopupTestPaymentCloseStatus("FAILURE", 1, ResultType.RESULT_TYPE_FAILURE);
    public static final AutotopupEvents$AutoTopupTestPaymentCloseStatus TIMEOUT = new AutotopupEvents$AutoTopupTestPaymentCloseStatus("TIMEOUT", 2, "timeout");
    public static final AutotopupEvents$AutoTopupTestPaymentCloseStatus IN_PROGRESS = new AutotopupEvents$AutoTopupTestPaymentCloseStatus("IN_PROGRESS", 3, "in_progress");

    private static final /* synthetic */ AutotopupEvents$AutoTopupTestPaymentCloseStatus[] $values() {
        return new AutotopupEvents$AutoTopupTestPaymentCloseStatus[]{SUCCESS, FAILURE, TIMEOUT, IN_PROGRESS};
    }

    static {
        AutotopupEvents$AutoTopupTestPaymentCloseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutotopupEvents$AutoTopupTestPaymentCloseStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutotopupEvents$AutoTopupTestPaymentCloseStatus valueOf(String str) {
        return (AutotopupEvents$AutoTopupTestPaymentCloseStatus) Enum.valueOf(AutotopupEvents$AutoTopupTestPaymentCloseStatus.class, str);
    }

    public static AutotopupEvents$AutoTopupTestPaymentCloseStatus[] values() {
        return (AutotopupEvents$AutoTopupTestPaymentCloseStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
