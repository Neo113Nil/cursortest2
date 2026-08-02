package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/payment/sdk/BankOpenKindForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "DOMAIN_LINK", "DEEP_LINK", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankOpenKindForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BankOpenKindForAnalytics[] $VALUES;
    public static final BankOpenKindForAnalytics DEEP_LINK;
    public static final BankOpenKindForAnalytics DOMAIN_LINK;
    private final String value;

    static {
        BankOpenKindForAnalytics bankOpenKindForAnalytics = new BankOpenKindForAnalytics("DOMAIN_LINK", 0, "domain_link");
        DOMAIN_LINK = bankOpenKindForAnalytics;
        BankOpenKindForAnalytics bankOpenKindForAnalytics2 = new BankOpenKindForAnalytics("DEEP_LINK", 1, "deep_link");
        DEEP_LINK = bankOpenKindForAnalytics2;
        BankOpenKindForAnalytics[] bankOpenKindForAnalyticsArr = {bankOpenKindForAnalytics, bankOpenKindForAnalytics2};
        $VALUES = bankOpenKindForAnalyticsArr;
        $ENTRIES = a.a(bankOpenKindForAnalyticsArr);
    }

    public BankOpenKindForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static BankOpenKindForAnalytics valueOf(String str) {
        return (BankOpenKindForAnalytics) Enum.valueOf(BankOpenKindForAnalytics.class, str);
    }

    public static BankOpenKindForAnalytics[] values() {
        return (BankOpenKindForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
