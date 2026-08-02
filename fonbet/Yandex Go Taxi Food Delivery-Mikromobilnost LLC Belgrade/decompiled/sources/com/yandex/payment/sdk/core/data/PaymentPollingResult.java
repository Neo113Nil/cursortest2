package com.yandex.payment.sdk.core.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentPollingResult;", "", "SUCCESS", "WAIT_FOR_PROCESSING", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentPollingResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentPollingResult[] $VALUES;
    public static final PaymentPollingResult SUCCESS;
    public static final PaymentPollingResult WAIT_FOR_PROCESSING;

    static {
        PaymentPollingResult paymentPollingResult = new PaymentPollingResult("SUCCESS", 0);
        SUCCESS = paymentPollingResult;
        PaymentPollingResult paymentPollingResult2 = new PaymentPollingResult("WAIT_FOR_PROCESSING", 1);
        WAIT_FOR_PROCESSING = paymentPollingResult2;
        PaymentPollingResult[] paymentPollingResultArr = {paymentPollingResult, paymentPollingResult2};
        $VALUES = paymentPollingResultArr;
        $ENTRIES = kotlin.enums.a.a(paymentPollingResultArr);
    }

    public static PaymentPollingResult valueOf(String str) {
        return (PaymentPollingResult) Enum.valueOf(PaymentPollingResult.class, str);
    }

    public static PaymentPollingResult[] values() {
        return (PaymentPollingResult[]) $VALUES.clone();
    }
}
