package com.ybsdk.feature.testpayment.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE", "RETRY", "ACTION", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestPaymentButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TestPaymentButtonType[] $VALUES;
    public static final TestPaymentButtonType CLOSE = new TestPaymentButtonType("CLOSE", 0);
    public static final TestPaymentButtonType RETRY = new TestPaymentButtonType("RETRY", 1);
    public static final TestPaymentButtonType ACTION = new TestPaymentButtonType("ACTION", 2);

    private static final /* synthetic */ TestPaymentButtonType[] $values() {
        return new TestPaymentButtonType[]{CLOSE, RETRY, ACTION};
    }

    static {
        TestPaymentButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TestPaymentButtonType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TestPaymentButtonType valueOf(String str) {
        return (TestPaymentButtonType) Enum.valueOf(TestPaymentButtonType.class, str);
    }

    public static TestPaymentButtonType[] values() {
        return (TestPaymentButtonType[]) $VALUES.clone();
    }
}
