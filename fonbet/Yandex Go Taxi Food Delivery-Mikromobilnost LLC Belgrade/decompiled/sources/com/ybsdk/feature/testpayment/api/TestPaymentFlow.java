package com.ybsdk.feature.testpayment.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL", "AUTOTOPUP", "feature-testpayment-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestPaymentFlow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TestPaymentFlow[] $VALUES;
    public static final TestPaymentFlow EXTERNAL = new TestPaymentFlow("EXTERNAL", 0);
    public static final TestPaymentFlow AUTOTOPUP = new TestPaymentFlow("AUTOTOPUP", 1);

    private static final /* synthetic */ TestPaymentFlow[] $values() {
        return new TestPaymentFlow[]{EXTERNAL, AUTOTOPUP};
    }

    static {
        TestPaymentFlow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TestPaymentFlow(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TestPaymentFlow valueOf(String str) {
        return (TestPaymentFlow) Enum.valueOf(TestPaymentFlow.class, str);
    }

    public static TestPaymentFlow[] values() {
        return (TestPaymentFlow[]) $VALUES.clone();
    }
}
