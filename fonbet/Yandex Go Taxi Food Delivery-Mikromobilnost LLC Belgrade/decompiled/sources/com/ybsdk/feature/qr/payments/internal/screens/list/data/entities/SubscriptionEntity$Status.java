package com.ybsdk.feature.qr.payments.internal.screens.list.data.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/qr/payments/internal/screens/list/data/entities/SubscriptionEntity$Status", "", "Lcom/ybsdk/feature/qr/payments/internal/screens/list/data/entities/SubscriptionEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionEntity$Status[] $VALUES;
    public static final SubscriptionEntity$Status DEFAULT = new SubscriptionEntity$Status("DEFAULT", 0);
    public static final SubscriptionEntity$Status CHECKING = new SubscriptionEntity$Status("CHECKING", 1);

    private static final /* synthetic */ SubscriptionEntity$Status[] $values() {
        return new SubscriptionEntity$Status[]{DEFAULT, CHECKING};
    }

    static {
        SubscriptionEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SubscriptionEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionEntity$Status valueOf(String str) {
        return (SubscriptionEntity$Status) Enum.valueOf(SubscriptionEntity$Status.class, str);
    }

    public static SubscriptionEntity$Status[] values() {
        return (SubscriptionEntity$Status[]) $VALUES.clone();
    }
}
