package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ServiceStatusForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "success", "failed", "canceled", "dismissed", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceStatusForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServiceStatusForAnalytics[] $VALUES;
    public static final ServiceStatusForAnalytics canceled;
    public static final ServiceStatusForAnalytics dismissed;
    public static final ServiceStatusForAnalytics failed;
    public static final ServiceStatusForAnalytics success;
    private final String value;

    static {
        ServiceStatusForAnalytics serviceStatusForAnalytics = new ServiceStatusForAnalytics("success", 0, "success");
        success = serviceStatusForAnalytics;
        ServiceStatusForAnalytics serviceStatusForAnalytics2 = new ServiceStatusForAnalytics("failed", 1, "failed");
        failed = serviceStatusForAnalytics2;
        ServiceStatusForAnalytics serviceStatusForAnalytics3 = new ServiceStatusForAnalytics("canceled", 2, "canceled");
        canceled = serviceStatusForAnalytics3;
        ServiceStatusForAnalytics serviceStatusForAnalytics4 = new ServiceStatusForAnalytics("dismissed", 3, "dismissed");
        dismissed = serviceStatusForAnalytics4;
        ServiceStatusForAnalytics[] serviceStatusForAnalyticsArr = {serviceStatusForAnalytics, serviceStatusForAnalytics2, serviceStatusForAnalytics3, serviceStatusForAnalytics4};
        $VALUES = serviceStatusForAnalyticsArr;
        $ENTRIES = a.a(serviceStatusForAnalyticsArr);
    }

    public ServiceStatusForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static ServiceStatusForAnalytics valueOf(String str) {
        return (ServiceStatusForAnalytics) Enum.valueOf(ServiceStatusForAnalytics.class, str);
    }

    public static ServiceStatusForAnalytics[] values() {
        return (ServiceStatusForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
