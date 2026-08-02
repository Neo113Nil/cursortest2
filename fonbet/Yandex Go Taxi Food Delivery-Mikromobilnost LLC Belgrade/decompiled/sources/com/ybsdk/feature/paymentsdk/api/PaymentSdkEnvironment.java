package com.ybsdk.feature.paymentsdk.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/paymentsdk/api/PaymentSdkEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCTION", "TESTING", "CROWDTESTING", "MIMINOTESTING", "LOCALTESTING", "feature-paymentsdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSdkEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentSdkEnvironment[] $VALUES;
    public static final PaymentSdkEnvironment PRODUCTION = new PaymentSdkEnvironment("PRODUCTION", 0);
    public static final PaymentSdkEnvironment TESTING = new PaymentSdkEnvironment("TESTING", 1);
    public static final PaymentSdkEnvironment CROWDTESTING = new PaymentSdkEnvironment("CROWDTESTING", 2);
    public static final PaymentSdkEnvironment MIMINOTESTING = new PaymentSdkEnvironment("MIMINOTESTING", 3);
    public static final PaymentSdkEnvironment LOCALTESTING = new PaymentSdkEnvironment("LOCALTESTING", 4);

    private static final /* synthetic */ PaymentSdkEnvironment[] $values() {
        return new PaymentSdkEnvironment[]{PRODUCTION, TESTING, CROWDTESTING, MIMINOTESTING, LOCALTESTING};
    }

    static {
        PaymentSdkEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PaymentSdkEnvironment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentSdkEnvironment valueOf(String str) {
        return (PaymentSdkEnvironment) Enum.valueOf(PaymentSdkEnvironment.class, str);
    }

    public static PaymentSdkEnvironment[] values() {
        return (PaymentSdkEnvironment[]) $VALUES.clone();
    }
}
