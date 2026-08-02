package com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/data/entities/SubscriptionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PROCESSING", "FAILED", "SUCCESS", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionStatus[] $VALUES;
    public static final SubscriptionStatus DEFAULT = new SubscriptionStatus("DEFAULT", 0);
    public static final SubscriptionStatus PROCESSING = new SubscriptionStatus("PROCESSING", 1);
    public static final SubscriptionStatus FAILED = new SubscriptionStatus("FAILED", 2);
    public static final SubscriptionStatus SUCCESS = new SubscriptionStatus("SUCCESS", 3);

    private static final /* synthetic */ SubscriptionStatus[] $values() {
        return new SubscriptionStatus[]{DEFAULT, PROCESSING, FAILED, SUCCESS};
    }

    static {
        SubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SubscriptionStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) $VALUES.clone();
    }
}
