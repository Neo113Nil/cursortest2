package com.ybsdk.core.transfer.utils.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/AnalyticsPaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "FAILED", "TIMEOUT", "ERROR", "ACCEPTED", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsPaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsPaymentStatus[] $VALUES;
    public static final AnalyticsPaymentStatus SUCCESS = new AnalyticsPaymentStatus("SUCCESS", 0);
    public static final AnalyticsPaymentStatus PROCESSING = new AnalyticsPaymentStatus("PROCESSING", 1);
    public static final AnalyticsPaymentStatus FAILED = new AnalyticsPaymentStatus("FAILED", 2);
    public static final AnalyticsPaymentStatus TIMEOUT = new AnalyticsPaymentStatus("TIMEOUT", 3);
    public static final AnalyticsPaymentStatus ERROR = new AnalyticsPaymentStatus("ERROR", 4);
    public static final AnalyticsPaymentStatus ACCEPTED = new AnalyticsPaymentStatus("ACCEPTED", 5);

    private static final /* synthetic */ AnalyticsPaymentStatus[] $values() {
        return new AnalyticsPaymentStatus[]{SUCCESS, PROCESSING, FAILED, TIMEOUT, ERROR, ACCEPTED};
    }

    static {
        AnalyticsPaymentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsPaymentStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsPaymentStatus valueOf(String str) {
        return (AnalyticsPaymentStatus) Enum.valueOf(AnalyticsPaymentStatus.class, str);
    }

    public static AnalyticsPaymentStatus[] values() {
        return (AnalyticsPaymentStatus[]) $VALUES.clone();
    }
}
