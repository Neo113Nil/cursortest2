package com.ybsdk.feature.qr.payments.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/qr/payments/api/data/PaymentInfoEntityType$SbpV3$Type", "", "Lcom/ybsdk/feature/qr/payments/api/data/PaymentInfoEntityType$SbpV3$Type;", "<init>", "(Ljava/lang/String;I)V", "SBER", "SBP", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInfoEntityType$SbpV3$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentInfoEntityType$SbpV3$Type[] $VALUES;
    public static final PaymentInfoEntityType$SbpV3$Type SBER = new PaymentInfoEntityType$SbpV3$Type("SBER", 0);
    public static final PaymentInfoEntityType$SbpV3$Type SBP = new PaymentInfoEntityType$SbpV3$Type("SBP", 1);

    private static final /* synthetic */ PaymentInfoEntityType$SbpV3$Type[] $values() {
        return new PaymentInfoEntityType$SbpV3$Type[]{SBER, SBP};
    }

    static {
        PaymentInfoEntityType$SbpV3$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PaymentInfoEntityType$SbpV3$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentInfoEntityType$SbpV3$Type valueOf(String str) {
        return (PaymentInfoEntityType$SbpV3$Type) Enum.valueOf(PaymentInfoEntityType$SbpV3$Type.class, str);
    }

    public static PaymentInfoEntityType$SbpV3$Type[] values() {
        return (PaymentInfoEntityType$SbpV3$Type[]) $VALUES.clone();
    }
}
