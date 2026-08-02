package com.yandex.go.taxi.summary.shared.promo.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/summary/shared/promo/models/NotificationTrail$Switch$ClickPolicy", "", "Lcom/yandex/go/taxi/summary/shared/promo/models/NotificationTrail$Switch$ClickPolicy;", "BODY_ONLY", "SWITCH_ONLY", "INDEPENDENT", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NotificationTrail$Switch$ClickPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NotificationTrail$Switch$ClickPolicy[] $VALUES;
    public static final NotificationTrail$Switch$ClickPolicy BODY_ONLY;
    public static final NotificationTrail$Switch$ClickPolicy INDEPENDENT;
    public static final NotificationTrail$Switch$ClickPolicy SWITCH_ONLY;

    static {
        NotificationTrail$Switch$ClickPolicy notificationTrail$Switch$ClickPolicy = new NotificationTrail$Switch$ClickPolicy("BODY_ONLY", 0);
        BODY_ONLY = notificationTrail$Switch$ClickPolicy;
        NotificationTrail$Switch$ClickPolicy notificationTrail$Switch$ClickPolicy2 = new NotificationTrail$Switch$ClickPolicy("SWITCH_ONLY", 1);
        SWITCH_ONLY = notificationTrail$Switch$ClickPolicy2;
        NotificationTrail$Switch$ClickPolicy notificationTrail$Switch$ClickPolicy3 = new NotificationTrail$Switch$ClickPolicy("INDEPENDENT", 2);
        INDEPENDENT = notificationTrail$Switch$ClickPolicy3;
        NotificationTrail$Switch$ClickPolicy[] notificationTrail$Switch$ClickPolicyArr = {notificationTrail$Switch$ClickPolicy, notificationTrail$Switch$ClickPolicy2, notificationTrail$Switch$ClickPolicy3};
        $VALUES = notificationTrail$Switch$ClickPolicyArr;
        $ENTRIES = a.a(notificationTrail$Switch$ClickPolicyArr);
    }

    public static NotificationTrail$Switch$ClickPolicy valueOf(String str) {
        return (NotificationTrail$Switch$ClickPolicy) Enum.valueOf(NotificationTrail$Switch$ClickPolicy.class, str);
    }

    public static NotificationTrail$Switch$ClickPolicy[] values() {
        return (NotificationTrail$Switch$ClickPolicy[]) $VALUES.clone();
    }
}
