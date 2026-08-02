package com.yandex.plus.core.user;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/core/user/SubscriptionStatus;", "", "NO_SUBSCRIPTION", "SUBSCRIPTION_PLUS", "UNKNOWN", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SubscriptionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionStatus[] $VALUES;
    public static final SubscriptionStatus NO_SUBSCRIPTION;
    public static final SubscriptionStatus SUBSCRIPTION_PLUS;
    public static final SubscriptionStatus UNKNOWN;

    static {
        SubscriptionStatus subscriptionStatus = new SubscriptionStatus("NO_SUBSCRIPTION", 0);
        NO_SUBSCRIPTION = subscriptionStatus;
        SubscriptionStatus subscriptionStatus2 = new SubscriptionStatus("SUBSCRIPTION_PLUS", 1);
        SUBSCRIPTION_PLUS = subscriptionStatus2;
        SubscriptionStatus subscriptionStatus3 = new SubscriptionStatus("UNKNOWN", 2);
        UNKNOWN = subscriptionStatus3;
        SubscriptionStatus[] subscriptionStatusArr = {subscriptionStatus, subscriptionStatus2, subscriptionStatus3};
        $VALUES = subscriptionStatusArr;
        $ENTRIES = a.a(subscriptionStatusArr);
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) $VALUES.clone();
    }
}
