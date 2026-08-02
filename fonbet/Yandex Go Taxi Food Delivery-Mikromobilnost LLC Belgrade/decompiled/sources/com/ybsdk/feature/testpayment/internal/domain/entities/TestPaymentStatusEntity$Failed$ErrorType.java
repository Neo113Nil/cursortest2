package com.ybsdk.feature.testpayment.internal.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/testpayment/internal/domain/entities/TestPaymentStatusEntity$Failed$ErrorType", "", "Lcom/ybsdk/feature/testpayment/internal/domain/entities/TestPaymentStatusEntity$Failed$ErrorType;", "<init>", "(Ljava/lang/String;I)V", "FAIL_DATA", "TIMEOUT", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestPaymentStatusEntity$Failed$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TestPaymentStatusEntity$Failed$ErrorType[] $VALUES;
    public static final TestPaymentStatusEntity$Failed$ErrorType FAIL_DATA = new TestPaymentStatusEntity$Failed$ErrorType("FAIL_DATA", 0);
    public static final TestPaymentStatusEntity$Failed$ErrorType TIMEOUT = new TestPaymentStatusEntity$Failed$ErrorType("TIMEOUT", 1);

    private static final /* synthetic */ TestPaymentStatusEntity$Failed$ErrorType[] $values() {
        return new TestPaymentStatusEntity$Failed$ErrorType[]{FAIL_DATA, TIMEOUT};
    }

    static {
        TestPaymentStatusEntity$Failed$ErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TestPaymentStatusEntity$Failed$ErrorType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TestPaymentStatusEntity$Failed$ErrorType valueOf(String str) {
        return (TestPaymentStatusEntity$Failed$ErrorType) Enum.valueOf(TestPaymentStatusEntity$Failed$ErrorType.class, str);
    }

    public static TestPaymentStatusEntity$Failed$ErrorType[] values() {
        return (TestPaymentStatusEntity$Failed$ErrorType[]) $VALUES.clone();
    }
}
