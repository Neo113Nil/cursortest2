package com.yandex.passport.internal.push;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/push/PushSubscriber$SubscriptionResult", "", "Lcom/yandex/passport/internal/push/PushSubscriber$SubscriptionResult;", "SUCCESS", "FAIL", "INAPPLICABLE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PushSubscriber$SubscriptionResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushSubscriber$SubscriptionResult[] $VALUES;
    public static final PushSubscriber$SubscriptionResult FAIL;
    public static final PushSubscriber$SubscriptionResult INAPPLICABLE;
    public static final PushSubscriber$SubscriptionResult SUCCESS;

    static {
        PushSubscriber$SubscriptionResult pushSubscriber$SubscriptionResult = new PushSubscriber$SubscriptionResult("SUCCESS", 0);
        SUCCESS = pushSubscriber$SubscriptionResult;
        PushSubscriber$SubscriptionResult pushSubscriber$SubscriptionResult2 = new PushSubscriber$SubscriptionResult("FAIL", 1);
        FAIL = pushSubscriber$SubscriptionResult2;
        PushSubscriber$SubscriptionResult pushSubscriber$SubscriptionResult3 = new PushSubscriber$SubscriptionResult("INAPPLICABLE", 2);
        INAPPLICABLE = pushSubscriber$SubscriptionResult3;
        PushSubscriber$SubscriptionResult[] pushSubscriber$SubscriptionResultArr = {pushSubscriber$SubscriptionResult, pushSubscriber$SubscriptionResult2, pushSubscriber$SubscriptionResult3};
        $VALUES = pushSubscriber$SubscriptionResultArr;
        $ENTRIES = kotlin.enums.a.a(pushSubscriber$SubscriptionResultArr);
    }

    public static PushSubscriber$SubscriptionResult valueOf(String str) {
        return (PushSubscriber$SubscriptionResult) Enum.valueOf(PushSubscriber$SubscriptionResult.class, str);
    }

    public static PushSubscriber$SubscriptionResult[] values() {
        return (PushSubscriber$SubscriptionResult[]) $VALUES.clone();
    }
}
