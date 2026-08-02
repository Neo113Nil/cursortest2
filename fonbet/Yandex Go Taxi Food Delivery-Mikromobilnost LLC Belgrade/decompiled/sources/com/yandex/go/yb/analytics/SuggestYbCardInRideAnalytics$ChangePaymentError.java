package com.yandex.go.yb.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/yb/analytics/SuggestYbCardInRideAnalytics$ChangePaymentError", "", "Lcom/yandex/go/yb/analytics/SuggestYbCardInRideAnalytics$ChangePaymentError;", "NETWORK_ERROR", "GOOGLE_PAY_BIND_ERROR", "CHANGE_FAILED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestYbCardInRideAnalytics$ChangePaymentError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestYbCardInRideAnalytics$ChangePaymentError[] $VALUES;
    public static final SuggestYbCardInRideAnalytics$ChangePaymentError CHANGE_FAILED;
    public static final SuggestYbCardInRideAnalytics$ChangePaymentError GOOGLE_PAY_BIND_ERROR;
    public static final SuggestYbCardInRideAnalytics$ChangePaymentError NETWORK_ERROR;
    public static final SuggestYbCardInRideAnalytics$ChangePaymentError UNKNOWN;

    static {
        SuggestYbCardInRideAnalytics$ChangePaymentError suggestYbCardInRideAnalytics$ChangePaymentError = new SuggestYbCardInRideAnalytics$ChangePaymentError("NETWORK_ERROR", 0);
        NETWORK_ERROR = suggestYbCardInRideAnalytics$ChangePaymentError;
        SuggestYbCardInRideAnalytics$ChangePaymentError suggestYbCardInRideAnalytics$ChangePaymentError2 = new SuggestYbCardInRideAnalytics$ChangePaymentError("GOOGLE_PAY_BIND_ERROR", 1);
        GOOGLE_PAY_BIND_ERROR = suggestYbCardInRideAnalytics$ChangePaymentError2;
        SuggestYbCardInRideAnalytics$ChangePaymentError suggestYbCardInRideAnalytics$ChangePaymentError3 = new SuggestYbCardInRideAnalytics$ChangePaymentError("CHANGE_FAILED", 2);
        CHANGE_FAILED = suggestYbCardInRideAnalytics$ChangePaymentError3;
        SuggestYbCardInRideAnalytics$ChangePaymentError suggestYbCardInRideAnalytics$ChangePaymentError4 = new SuggestYbCardInRideAnalytics$ChangePaymentError("UNKNOWN", 3);
        UNKNOWN = suggestYbCardInRideAnalytics$ChangePaymentError4;
        SuggestYbCardInRideAnalytics$ChangePaymentError[] suggestYbCardInRideAnalytics$ChangePaymentErrorArr = {suggestYbCardInRideAnalytics$ChangePaymentError, suggestYbCardInRideAnalytics$ChangePaymentError2, suggestYbCardInRideAnalytics$ChangePaymentError3, suggestYbCardInRideAnalytics$ChangePaymentError4};
        $VALUES = suggestYbCardInRideAnalytics$ChangePaymentErrorArr;
        $ENTRIES = a.a(suggestYbCardInRideAnalytics$ChangePaymentErrorArr);
    }

    public static SuggestYbCardInRideAnalytics$ChangePaymentError valueOf(String str) {
        return (SuggestYbCardInRideAnalytics$ChangePaymentError) Enum.valueOf(SuggestYbCardInRideAnalytics$ChangePaymentError.class, str);
    }

    public static SuggestYbCardInRideAnalytics$ChangePaymentError[] values() {
        return (SuggestYbCardInRideAnalytics$ChangePaymentError[]) $VALUES.clone();
    }
}
